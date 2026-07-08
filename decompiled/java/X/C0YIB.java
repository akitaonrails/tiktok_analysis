package X;

/* JADX INFO: renamed from: X.0YIB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIB {
    public static final Object LIZ(C0YIS c0yis, InterfaceC870750YDx interfaceC870750YDx, C864820XwG c864820XwG) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c864820XwG));
        interfaceC870750YDx.LIZ().LJFF(c0yis, new InterfaceC874620YSu() { // from class: X.0YID
            @Override // X.InterfaceC874620YSu
            public final void LIZIZ(C0YIX c0yix) {
                InterfaceC1364105Vn<C0YIX> interfaceC1364105Vn = c23260099m;
                C189200o6.m2constructorimpl(c0yix);
                interfaceC1364105Vn.resumeWith(c0yix);
            }

            @Override // X.InterfaceC874620YSu
            public final void LIZ(Exception exc, String str, int i) {
                InterfaceC1364105Vn<C0YIX> interfaceC1364105Vn = c23260099m;
                C098200Yq c098200Yq = new C098200Yq(new C0YIZ(str, i, exc));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
            }
        }, true);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c864820XwG);
        }
        return objLIZ;
    }
}
