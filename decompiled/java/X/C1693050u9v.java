package X;

/* JADX INFO: renamed from: X.0u9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693050u9v implements InterfaceC1681130tqh {
    public C13B1<C1695970uEd> LIZ;
    public InterfaceC1681130tqh LIZIZ;

    @Override // X.InterfaceC1681130tqh
    public final C1695970uEd LIZIZ() {
        InterfaceC1681130tqh interfaceC1681130tqh = this.LIZIZ;
        if (interfaceC1681130tqh == null) {
            C1696250uF5.LIZIZ("GraphicsContext not provided");
        }
        C1695970uEd c1695970uEdLIZIZ = interfaceC1681130tqh.LIZIZ();
        C13B1<C1695970uEd> c13b1 = this.LIZ;
        if (c13b1 != null) {
            c13b1.LJI(c1695970uEdLIZIZ);
            return c1695970uEdLIZIZ;
        }
        C13B1<C1695970uEd> c13b12 = new C13B1<>(1);
        c13b12.LJI(c1695970uEdLIZIZ);
        this.LIZ = c13b12;
        return c1695970uEdLIZIZ;
    }

    public final void LIZJ() {
        C13B1<C1695970uEd> c13b1 = this.LIZ;
        if (c13b1 != null) {
            Object[] objArr = c13b1.LIZ;
            int i = c13b1.LIZIZ;
            for (int i2 = 0; i2 < i; i2++) {
                LIZ((C1695970uEd) objArr[i2]);
            }
            c13b1.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1681130tqh
    public final void LIZ(C1695970uEd c1695970uEd) {
        InterfaceC1681130tqh interfaceC1681130tqh = this.LIZIZ;
        if (interfaceC1681130tqh != null) {
            interfaceC1681130tqh.LIZ(c1695970uEd);
        }
    }
}
