package X;

/* JADX INFO: renamed from: X.13fS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20067213fS {
    public final C19968013Aw<C20066613fM> LIZ = new C19968013Aw<>(new C20066613fM[16]);
    public final C13B1<C20067213fS> LIZIZ = new C13B1<>(10);

    public void LIZIZ(C20067413fU c20067413fU) {
        for (int i = this.LIZ.LLILLL - 1; -1 < i; i--) {
            C19968013Aw<C20066613fM> c19968013Aw = this.LIZ;
            if (c19968013Aw.LL[i].LIZLLL.LIZ == 0) {
                c19968013Aw.LJIILIIL(i);
            }
        }
    }

    public boolean LIZ(C20066713fN<C20066813fO> c20066713fN, InterfaceC1692950u9l interfaceC1692950u9l, C20067413fU c20067413fU, boolean z) {
        C19968013Aw<C20066613fM> c19968013Aw = this.LIZ;
        C20066613fM[] c20066613fMArr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!c20066613fMArr[i2].LIZ(c20066713fN, interfaceC1692950u9l, c20067413fU, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }
}
