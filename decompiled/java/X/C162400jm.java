package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.00jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162400jm {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        if (!u.LJJIIJZLJL(str, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
