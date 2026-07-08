package X;

/* JADX INFO: renamed from: X.0bBC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963480bBC extends AbstractC963500bBE {
    public final int LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963480bBC)) {
            return false;
        }
        C963480bBC c963480bBC = (C963480bBC) obj;
        return this.LIZIZ == c963480bBC.LIZIZ && this.LIZJ == c963480bBC.LIZJ && this.LIZLLL == c963480bBC.LIZLLL;
    }

    public final int hashCode() {
        return (((this.LIZIZ * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchTurn(battleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nextPerformerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", switchTurnType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC963500bBE
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C963480bBC(int i, long j) {
        super(i);
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = 1;
    }
}
