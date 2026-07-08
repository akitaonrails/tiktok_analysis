package X;

/* JADX INFO: renamed from: X.1DdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260251DdP {
    public C2273491Dyl LIZ;
    public C2273491Dyl LIZIZ;
    public C2273491Dyl LIZJ;

    public final boolean LIZ() {
        C2273491Dyl c2273491Dyl = this.LIZIZ.LIZIZ;
        if (c2273491Dyl == null) {
            return false;
        }
        this.LIZIZ = c2273491Dyl;
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C2273491Dyl c2273491Dyl = this.LIZ; c2273491Dyl != null; c2273491Dyl = c2273491Dyl.LIZIZ) {
            sb.append(c2273491Dyl.LJ);
            sb.append(",");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{");
        sbLIZ.append(sb.toString());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2260251DdP(C2273491Dyl c2273491Dyl) {
        this.LIZ = c2273491Dyl;
        this.LIZIZ = c2273491Dyl;
        this.LIZJ = c2273491Dyl;
        while (true) {
            C2273491Dyl c2273491Dyl2 = this.LIZJ.LIZIZ;
            if (c2273491Dyl2 != null) {
                this.LIZJ = c2273491Dyl2;
            } else {
                return;
            }
        }
    }
}
