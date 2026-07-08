package X;

/* JADX INFO: renamed from: X.1DdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260261DdQ {
    public C2273501Dym LIZ;
    public C2273501Dym LIZIZ;
    public C2273501Dym LIZJ;

    public final boolean LIZ() {
        C2273501Dym c2273501Dym = this.LIZIZ.LIZIZ;
        if (c2273501Dym == null) {
            return false;
        }
        this.LIZIZ = c2273501Dym;
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C2273501Dym c2273501Dym = this.LIZ; c2273501Dym != null; c2273501Dym = c2273501Dym.LIZIZ) {
            sb.append(c2273501Dym.LJ);
            sb.append(",");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{");
        sbLIZ.append(sb.toString());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2260261DdQ(C2273501Dym c2273501Dym) {
        this.LIZ = c2273501Dym;
        this.LIZIZ = c2273501Dym;
        this.LIZJ = c2273501Dym;
        while (true) {
            C2273501Dym c2273501Dym2 = this.LIZJ.LIZIZ;
            if (c2273501Dym2 != null) {
                this.LIZJ = c2273501Dym2;
            } else {
                return;
            }
        }
    }
}
