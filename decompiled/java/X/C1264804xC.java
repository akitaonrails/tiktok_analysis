package X;

/* JADX INFO: renamed from: X.04xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264804xC implements InterfaceC1264504x9 {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264804xC)) {
            return false;
        }
        C1264804xC c1264804xC = (C1264804xC) obj;
        return this.LIZ == c1264804xC.LIZ && this.LIZIZ == c1264804xC.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Running(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264804xC(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
