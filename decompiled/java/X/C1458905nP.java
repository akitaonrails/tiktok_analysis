package X;

/* JADX INFO: renamed from: X.05nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1458905nP extends AbstractC1673910tf3 {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1458905nP)) {
            return false;
        }
        C1458905nP c1458905nP = (C1458905nP) obj;
        return this.LIZ == c1458905nP.LIZ && this.LIZIZ == c1458905nP.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollingUpdate(lastIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isScrolling=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1458905nP(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
