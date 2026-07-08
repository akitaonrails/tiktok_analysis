package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0p8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499790p8D {
    public final C603820NmG<String, C1499820p8G> LIZ = new C603820NmG<>(16);

    public static String LIZ(String str) {
        if (!u.LJJIIJZLJL(str, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!u.LJIIZILJ(str, "/", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('/');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }
}
