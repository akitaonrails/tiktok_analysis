package X;

import java.io.File;
import java.util.Arrays;

/* JADX INFO: renamed from: X.08SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SZ {
    public static final long LIZ(File file) {
        File[] fileArrListFiles;
        long jLIZJ = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return 0 + file.length();
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jLIZJ += LIZJ(file2);
        }
        return jLIZJ;
    }

    public static final String LIZIZ(double d) {
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    public static final long LIZJ(File file) {
        if (C2259908tJ.LIZIZ()) {
            long jLIZ = C2259908tJ.LIZ(file);
            if (jLIZ <= 0) {
                return LIZ(file);
            }
            return jLIZ;
        }
        return LIZ(file);
    }
}
