package X;

import java.io.File;

/* JADX INFO: renamed from: X.09eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2422209eO {
    public static void LIZ(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                LIZ(file2);
            }
        }
        file.delete();
    }
}
