package X;

/* JADX INFO: renamed from: X.0bBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963470bBB extends AbstractC963500bBE {
    public final int LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963470bBB)) {
            return false;
        }
        C963470bBB c963470bBB = (C963470bBB) obj;
        return this.LIZIZ == c963470bBB.LIZIZ && this.LIZJ == c963470bBB.LIZJ;
    }

    public final int hashCode() {
        return (this.LIZIZ * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Finish(battleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC963500bBE
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C963470bBB(int i) {
        super(i);
        this.LIZIZ = i;
        this.LIZJ = 206L;
    }
}
