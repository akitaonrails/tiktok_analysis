package X;

import android.text.TextUtils;
import com.bytedance.refcache.FileLocker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08tI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2259808tI {
    public static long LIZ(String str) {
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
                    length += LIZIZ(file.getAbsolutePath());
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

    public static long LIZIZ(String str) {
        if (C2259908tJ.LIZIZ()) {
            if (FileLocker.LIZ) {
                long j_getTotalSpace = FileLocker._getTotalSpace(str);
                if (j_getTotalSpace > 0) {
                    return j_getTotalSpace;
                }
            }
            return LIZ(str);
        }
        return LIZ(str);
    }

    public static void LIZJ(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            if (fileArrListFiles.length == 0) {
                file.delete();
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LIZJ(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
