package X;

/* JADX INFO: renamed from: X.0uBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694310uBx implements InterfaceC1694390uC5 {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetComposingRegionCommand(start=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1694390uC5
    public final void LIZ(C1694290uBv c1694290uBv) {
        if (c1694290uBv.LIZLLL != -1) {
            c1694290uBv.LIZLLL = -1;
            c1694290uBv.LJ = -1;
        }
        int iLJ = C13LZ.LJ(this.LIZ, 0, c1694290uBv.LIZLLL());
        int iLJ2 = C13LZ.LJ(this.LIZIZ, 0, c1694290uBv.LIZLLL());
        if (iLJ != iLJ2) {
            if (iLJ < iLJ2) {
                c1694290uBv.LJFF(iLJ, iLJ2);
            } else {
                c1694290uBv.LJFF(iLJ2, iLJ);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694310uBx)) {
            return false;
        }
        C1694310uBx c1694310uBx = (C1694310uBx) obj;
        if (this.LIZ == c1694310uBx.LIZ && this.LIZIZ == c1694310uBx.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1694310uBx(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
