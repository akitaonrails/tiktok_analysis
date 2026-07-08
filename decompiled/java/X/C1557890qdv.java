package X;

/* JADX INFO: renamed from: X.0qdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557890qdv {
    public boolean LIZ;
    public boolean LIZIZ;

    public C1557890qdv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557890qdv)) {
            return false;
        }
        C1557890qdv c1557890qdv = (C1557890qdv) obj;
        return this.LIZ == c1557890qdv.LIZ && this.LIZIZ == c1557890qdv.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMessageVideoComponentMixed(hasSet=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isMixedComponent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557890qdv(int i) {
        this.LIZ = false;
        this.LIZIZ = false;
    }
}
