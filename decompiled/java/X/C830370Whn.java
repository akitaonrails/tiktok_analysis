package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Whn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830370Whn {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(File file) {
        long jLastModified = file.lastModified();
        if (Build.VERSION.SDK_INT < 26) {
            return jLastModified;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    long jLIZ = LIZ(file2);
                    if (jLastModified < jLIZ) {
                        jLastModified = jLIZ;
                    }
                }
            }
        } else {
            try {
                jLastModified = Files.readAttributes(Paths.get(file.getPath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).lastAccessTime().toMillis();
                return jLastModified;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLastAccessTime failed ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" for file ");
                sbLIZ.append(file);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return jLastModified;
    }

    public static long LIZIZ(File file) {
        Object objInvoke;
        long jLastModified = file.lastModified();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                C089E c089e = new C089E(fileArrListFiles);
                while (c089e.hasNext()) {
                    long jLIZIZ = LIZIZ((File) c089e.next());
                    if (jLastModified < jLIZIZ) {
                        jLastModified = jLIZIZ;
                    }
                }
            }
        } else {
            try {
                Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField("os");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(null);
                if (obj != null && (objInvoke = obj.getClass().getMethod("lstat", String.class).invoke(obj, file.getAbsolutePath())) != null) {
                    Field declaredField2 = objInvoke.getClass().getDeclaredField("st_atime");
                    if (!declaredField2.isAccessible()) {
                        declaredField2.setAccessible(true);
                    }
                    jLastModified = declaredField2.getLong(objInvoke);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLastAccessTime failed ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" for file ");
                sbLIZ.append(file);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return TimeUnit.SECONDS.toMillis(jLastModified);
    }
}
