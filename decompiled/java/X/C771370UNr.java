package X;

import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771370UNr {
    public static final long LIZ(File file) {
        if (file.isFile()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jLIZ = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jLIZ += LIZ(file2);
            }
        }
        return jLIZ;
    }

    public static final String LIZIZ(String str) {
        String str2 = File.separator;
        if (u.LJIIZILJ(str, str2, false)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZJ(AbstractC207210166m abstractC207210166m) {
        if (!(abstractC207210166m instanceof C771380UNs)) {
            if (abstractC207210166m.LIZJ.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LIZIZ(abstractC207210166m.LIZIZ.getFullPath()));
                sbLIZ.append(LIZIZ(abstractC207210166m.LIZJ));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return LIZIZ(abstractC207210166m.LIZIZ.getFullPath());
        }
        abstractC207210166m.getClass();
        throw new C1954807lC();
    }

    public static final String LIZLLL(AbstractC207210166m abstractC207210166m) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ(LIZJ(abstractC207210166m)));
        sbLIZ.append(abstractC207210166m.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
