package X;

import p2.j1;

/* JADX INFO: renamed from: X.13d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20052513d5 {
    public static final AbstractC20055413dY LIZIZ(C19968013Aw c19968013Aw) {
        int i;
        if (c19968013Aw != null && (i = c19968013Aw.LLILLL) != 0) {
            return (AbstractC20055413dY) c19968013Aw.LJIILIIL(i - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC20052813d8 LIZJ(AbstractC20055413dY abstractC20055413dY) {
        boolean z;
        if ((abstractC20055413dY.LLILLL & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        if (abstractC20055413dY instanceof InterfaceC20052813d8) {
            return (InterfaceC20052813d8) abstractC20055413dY;
        }
        if (abstractC20055413dY instanceof AbstractC20055313dX) {
            AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) abstractC20055413dY).LLJJI;
            while (abstractC20055413dY2 != 0) {
                if (abstractC20055413dY2 instanceof InterfaceC20052813d8) {
                    return (InterfaceC20052813d8) abstractC20055413dY2;
                }
                if ((abstractC20055413dY2 instanceof AbstractC20055313dX) && (abstractC20055413dY2.LLILLL & 2) != 0) {
                    abstractC20055413dY2 = ((AbstractC20055313dX) abstractC20055413dY2).LLJJI;
                } else {
                    abstractC20055413dY2 = abstractC20055413dY2.LLILZLL;
                }
            }
        }
        return null;
    }

    public static final j1 LJ(InterfaceC1691470u7N interfaceC1691470u7N) {
        if (!interfaceC1691470u7N.LJIJJ().LLJILLL) {
            C1696250uF5.LIZIZ("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        j1 j1VarLIZLLL = LIZLLL(interfaceC1691470u7N, 2);
        if (!j1VarLIZLLL.LIZLLL()) {
            C1696250uF5.LIZIZ("LayoutCoordinates is not attached.");
        }
        return j1VarLIZLLL;
    }

    public static final C20053713dH LJFF(InterfaceC1691470u7N interfaceC1691470u7N) {
        j1 j1Var = interfaceC1691470u7N.LJIJJ().LLIZLLLIL;
        if (j1Var != null) {
            return j1Var.LLJILJILJ;
        }
        C1696250uF5.LIZJ("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new C2197108jB();
    }

    public static final InterfaceC20055013dU LJI(InterfaceC1691470u7N interfaceC1691470u7N) {
        InterfaceC20055013dU interfaceC20055013dU = LJFF(interfaceC1691470u7N).LLJILLL;
        if (interfaceC20055013dU != null) {
            return interfaceC20055013dU;
        }
        C1696250uF5.LIZJ("This node does not have an owner.");
        throw new C2197108jB();
    }

    public static final void LIZ(C19968013Aw c19968013Aw, AbstractC20055413dY abstractC20055413dY) {
        C19968013Aw<C20053713dH> c19968013AwLJJIL = LJFF(abstractC20055413dY).LJJIL();
        int i = c19968013AwLJJIL.LLILLL - 1;
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        if (i < c20053713dHArr.length) {
            while (i >= 0) {
                c19968013Aw.LIZLLL(c20053713dHArr[i].LLJLLIL.LJ);
                i--;
            }
        }
    }

    public static final j1 LIZLLL(InterfaceC1691470u7N interfaceC1691470u7N, int i) {
        j1 j1Var = interfaceC1691470u7N.LJIJJ().LLIZLLLIL;
        if (j1Var.LLIIIL() == interfaceC1691470u7N && C20054813dS.LJI(i)) {
            return j1Var.LLJJI;
        }
        return j1Var;
    }
}
