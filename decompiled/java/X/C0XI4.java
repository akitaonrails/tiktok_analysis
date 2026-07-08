package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0XI4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XI4 {
    public final String LIZIZ;
    public final List<C2259691DcV> LIZ = new ArrayList();
    public final String LIZJ = "UTF-8";

    public final String LJFF() {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return this.LIZIZ;
        }
        String strLIZIZ = C08NX.LIZIZ(this.LIZ, this.LIZJ);
        String str = this.LIZIZ;
        if (str == null || str.length() == 0) {
            return strLIZIZ;
        }
        if (this.LIZIZ.indexOf(63) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("&");
            sbLIZ.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append("?");
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String toString() {
        return LJFF();
    }

    public C0XI4(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(double d, String str) {
        ((ArrayList) this.LIZ).add(new C2259691DcV(str, String.valueOf(d)));
    }

    public final void LIZIZ(int i, String str) {
        ((ArrayList) this.LIZ).add(new C2259691DcV(str, String.valueOf(i)));
    }

    public final void LIZJ(long j, String str) {
        ((ArrayList) this.LIZ).add(new C2259691DcV(str, String.valueOf(j)));
    }

    public final void LIZLLL(Boolean bool, String str) {
        ((ArrayList) this.LIZ).add(new C2259691DcV(str, String.valueOf(bool)));
    }

    public final void LJ(String str, String str2) {
        ((ArrayList) this.LIZ).add(new C2259691DcV(str, str2));
    }
}
