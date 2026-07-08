package X;

import p2.j1;

/* JADX INFO: renamed from: X.0u7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691830u7x {
    public static final C1691830u7x LIZJ = new C1691830u7x(null, null);
    public final InterfaceC1692950u9l LIZ;
    public final C1692150u8T LIZIZ;

    public C1691830u7x(InterfaceC1692950u9l interfaceC1692950u9l, C1692150u8T c1692150u8T) {
        this.LIZ = interfaceC1692950u9l;
        this.LIZIZ = c1692150u8T;
    }

    public static C1691830u7x LIZ(C1691830u7x c1691830u7x, j1 j1Var, C1692150u8T c1692150u8T, int i) {
        InterfaceC1692950u9l interfaceC1692950u9l = j1Var;
        if ((i & 1) != 0) {
            interfaceC1692950u9l = c1691830u7x.LIZ;
        }
        if ((i & 2) != 0) {
            c1692150u8T = c1691830u7x.LIZIZ;
        }
        c1691830u7x.getClass();
        return new C1691830u7x(interfaceC1692950u9l, c1692150u8T);
    }
}
