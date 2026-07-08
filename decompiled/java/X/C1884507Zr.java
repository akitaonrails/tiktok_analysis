package X;

/* JADX INFO: renamed from: X.07Zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1884507Zr {
    public final C0EIE LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1884507Zr)) {
            return false;
        }
        C1884507Zr c1884507Zr = (C1884507Zr) obj;
        return this.LIZ == c1884507Zr.LIZ && this.LIZIZ == c1884507Zr.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EpGuideDisplayPayload(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showImmediately=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1884507Zr(C0EIE c0eie) {
        this.LIZ = c0eie;
    }
}
