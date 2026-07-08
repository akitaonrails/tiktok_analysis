package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: X.0qSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550650qSF {
    public static Long LIZ(File file) {
        long j;
        Long lValueOf = null;
        if (file == null) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: X.0qSG
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            long j2 = 0;
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                long jLastModified = file2.lastModified();
                try {
                    j = CastLongProtector.parseLong(name);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (name.endsWith("--compress")) {
                        try {
                            j = CastLongProtector.parseLong(name.split("--compress")[0]);
                        } catch (NumberFormatException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
                if (lValueOf == null || jLastModified > j2) {
                    lValueOf = Long.valueOf(j);
                    j2 = jLastModified;
                }
            }
        }
        return lValueOf;
    }
}
