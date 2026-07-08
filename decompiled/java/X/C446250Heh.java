package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0Heh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446250Heh {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String str) {
        if (!u.LJJIIJZLJL(str, "http", false) && !u.LJJIIJZLJL(str, "file://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
