package X;

import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.refcache.FileLocker;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2260008tK {
    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static long LIZIZ(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return 0L;
        }
        long length = c0vsj.length();
        if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                try {
                    length += LJII(file.getAbsolutePath());
                } catch (OutOfMemoryError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                    return 0L;
                } catch (StackOverflowError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.printStackTrace();
                    return 0L;
                }
            }
        }
        return length;
    }

    public static void LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isFile()) {
            c0vsj.delete();
        }
    }

    public static void LJ(String str) {
        String strLIZIZ;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return;
        }
        if (c0vsj.isFile()) {
            c0vsj.delete();
            return;
        }
        String[] list = c0vsj.list();
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            if (str2 != null) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(str3);
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                if (c0vsj2.isFile()) {
                    c0vsj2.delete();
                }
                if (c0vsj2.isDirectory()) {
                    LJ(strLIZIZ);
                }
            }
        }
        c0vsj.delete();
    }

    public static boolean LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public static long LJI(String str) {
        try {
            if (!TextUtils.isEmpty(str) && new C0VSJ(str).exists()) {
                StatFs statFs = new StatFs(str);
                return ((long) C2204961BRm.LLI(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tGq7eZm+NoiAdB", null))) * ((long) C2204961BRm.LLF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tGq7eZm+NoiAdB", null)));
            }
            return 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static long LJII(String str) {
        if (C2259908tJ.LIZIZ()) {
            if (FileLocker.LIZ) {
                long j_getTotalSpace = FileLocker._getTotalSpace(str);
                if (j_getTotalSpace > 0) {
                    return j_getTotalSpace;
                }
            }
            return LIZIZ(str);
        }
        return LIZIZ(str);
    }

    public static void LIZJ(File file, C0VSJ c0vsj) {
        if (!file.exists() || !file.isFile() || c0vsj.isDirectory()) {
            return;
        }
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        try {
            byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(file));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    bufferedInputStream.close();
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return;
                }
                bufferedOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
