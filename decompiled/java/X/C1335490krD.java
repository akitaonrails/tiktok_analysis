package X;

import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: X.0krD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335490krD {
    public static void LIZ(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new C1335550krJ(file.getAbsolutePath(), new C1335590krN(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C1335550krJ(file.getAbsolutePath());
        }
    }

    public static void LIZIZ(File file, File file2) throws C0MYO {
        Throwable c1335590krN;
        file.getClass();
        file2.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (!file2.exists()) {
            if (file.getParentFile().exists()) {
                if (!file.exists()) {
                    c1335590krN = new FileNotFoundException(file.getAbsolutePath());
                } else {
                    c1335590krN = null;
                }
            } else {
                final String absolutePath = file.getAbsolutePath();
                c1335590krN = new FileNotFoundException(absolutePath) { // from class: X.0krO
                };
            }
        } else {
            c1335590krN = new C1335590krN(file2.getAbsolutePath());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown error renaming ");
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append(" to ");
        sbLIZ.append(file2.getAbsolutePath());
        throw new C0MYO(C2188811AlT.LIZIZ(sbLIZ), c1335590krN);
    }
}
