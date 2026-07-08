package X;

import java.io.File;

/* JADX INFO: renamed from: X.0UNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771280UNi {
    public static final long LIZ(File file, boolean z) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return LIZIZ(file, z);
            }
            if (file.isFile()) {
                long length = file.length();
                if (!z) {
                    return length;
                }
                file.delete();
                return length;
            }
            return 0L;
        }
        return 0L;
    }

    public static final long LIZIZ(File file, boolean z) {
        long length;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    length = LIZIZ(file2, z);
                } else {
                    length = file2.length();
                }
                j += length;
                if (z) {
                    file2.delete();
                }
            }
        }
        if (z) {
            file.delete();
        }
        return j;
    }
}
