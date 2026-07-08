package X;

/* JADX INFO: renamed from: X.0u8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692410u8t implements InterfaceC1692600u9C {
    public final InterfaceC1692600u9C LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC1692600u9C
    public final int LIZ(int i) {
        int iLIZ = this.LIZIZ.LIZ(i);
        if (i >= 0 && i <= this.LIZJ) {
            C1692180u8W.LIZIZ(iLIZ, this.LIZLLL, i);
        }
        return iLIZ;
    }

    @Override // X.InterfaceC1692600u9C
    public final int LIZIZ(int i) {
        int iLIZIZ = this.LIZIZ.LIZIZ(i);
        if (i >= 0 && i <= this.LIZLLL) {
            C1692180u8W.LIZJ(iLIZIZ, this.LIZJ, i);
        }
        return iLIZIZ;
    }

    public C1692410u8t(InterfaceC1692600u9C interfaceC1692600u9C, int i, int i2) {
        this.LIZIZ = interfaceC1692600u9C;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
