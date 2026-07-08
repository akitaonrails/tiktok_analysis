package X;

/* JADX INFO: renamed from: X.0uBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694320uBy implements InterfaceC1694390uC5 {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetSelectionCommand(start=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1694390uC5
    public final void LIZ(C1694290uBv c1694290uBv) {
        int iLJ = C13LZ.LJ(this.LIZ, 0, c1694290uBv.LIZLLL());
        int iLJ2 = C13LZ.LJ(this.LIZIZ, 0, c1694290uBv.LIZLLL());
        if (iLJ < iLJ2) {
            c1694290uBv.LJI(iLJ, iLJ2);
        } else {
            c1694290uBv.LJI(iLJ2, iLJ);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694320uBy)) {
            return false;
        }
        C1694320uBy c1694320uBy = (C1694320uBy) obj;
        if (this.LIZ == c1694320uBy.LIZ && this.LIZIZ == c1694320uBy.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1694320uBy(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
