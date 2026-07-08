package X;

/* JADX INFO: renamed from: X.0nuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452730nuJ {
    public final int LIZ;
    public final long LIZIZ;
    public final InterfaceC1464180oCm LIZJ;

    public C1452730nuJ() {
        throw null;
    }

    public static C1452730nuJ LIZ() {
        return new C1452730nuJ(0);
    }

    public static C1452730nuJ LIZJ() {
        return new C1452730nuJ(1);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEPreviewControlOp{mType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mSeekTo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1452730nuJ(int i) {
        this(i, 0L, null);
    }

    public static C1452730nuJ LIZIZ(long j) {
        return new C1452730nuJ(2, j, null);
    }

    public static C1452730nuJ LIZLLL(long j) {
        return new C1452730nuJ(3, j, null);
    }

    public C1452730nuJ(int i, long j, InterfaceC1464180oCm interfaceC1464180oCm) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1464180oCm;
    }
}
