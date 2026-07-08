package X;

import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0oqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489060oqu {
    public static final String LIZ(String str) {
        String str2 = File.separator;
        if (!u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
