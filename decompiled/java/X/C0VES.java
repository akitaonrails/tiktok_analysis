package X;

import java.io.File;

/* JADX INFO: renamed from: X.0VES, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VES {
    public static final C0VES LIZ = new C0VES();

    public static long LIZ(File file) {
        long jLIZ = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                jLIZ += LIZ(file2);
            }
            return jLIZ;
        }
        return file.length() / 1024;
    }
}
