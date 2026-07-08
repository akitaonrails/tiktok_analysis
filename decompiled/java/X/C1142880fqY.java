package X;

import java.io.File;

/* JADX INFO: renamed from: X.0fqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142880fqY {
    public static String LIZ(String str) {
        if (!C1142910fqb.LIZ(str)) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return str;
    }

    public static C0VSJ LIZIZ(String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".tmp");
            return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("file is null");
    }

    public static boolean LIZJ(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        LIZJ(file2);
                    } else {
                        file2.delete();
                    }
                }
            } else {
                return file.delete();
            }
        }
        return file.delete();
    }
}
