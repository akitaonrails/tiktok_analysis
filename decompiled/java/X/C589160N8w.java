package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0N8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589160N8w {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public C589160N8w LIZIZ;

    public C589160N8w(String str) {
        this.LIZ = str;
        if (str.length() != 0 && !a0.LJJIIZI(str, "/", false)) {
        } else {
            throw new IllegalArgumentException("domain name not valid");
        }
    }

    public final String LIZ(String str) {
        C589160N8w c589160N8w = this.LIZIZ;
        if (c589160N8w == null) {
            return this.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c589160N8w.LIZ(str));
        sbLIZ.append(str);
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ != null) {
            return strLIZIZ;
        }
        return "";
    }
}
