package X;

import p2.h1;
import p2.j1;
import p2.x;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13dT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20054913dT {
    public final C20053713dH LIZ;
    public final x LIZIZ;
    public j1 LIZJ;
    public final C20053413dE LIZLLL;
    public AbstractC20055413dY LJ;
    public C19968013Aw<InterfaceC1672410tcd> LJFF;
    public C19968013Aw<InterfaceC1672410tcd> LJI;
    public C20055213dW LJII;

    public final void LJ() {
        x xVar = this.LIZIZ;
        for (j1 j1Var = this.LIZJ; j1Var != xVar; j1Var = j1Var.LLJJI) {
            j1Var.LLILLL();
        }
        xVar.LLILLL();
        for (AbstractC20055413dY abstractC20055413dY = this.LJ; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLJIJIL();
            if (abstractC20055413dY.LLJ) {
                C20028313Yb<Object> c20028313Yb = C20054813dS.LIZ;
                if (!abstractC20055413dY.LLJILLL) {
                    C1696250uF5.LIZIZ("autoInvalidateInsertedNode called on unattached node");
                }
                C20054813dS.LIZ(abstractC20055413dY, -1, 1);
            }
            if (abstractC20055413dY.LLJI) {
                C20054813dS.LIZJ(abstractC20055413dY);
            }
            abstractC20055413dY.LLJ = false;
            abstractC20055413dY.LLJI = false;
        }
    }

    public final void LJFF() {
        for (AbstractC20055413dY abstractC20055413dY = this.LIZLLL; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZIL) {
            if (abstractC20055413dY.LLJILLL) {
                abstractC20055413dY.LLJILJIL();
            }
        }
        j1 j1Var = this.LIZJ;
        for (j1 j1Var2 = this.LIZIZ; j1Var2 != j1Var; j1Var2 = j1Var2.LLJJIII) {
            InterfaceC20054313dN interfaceC20054313dN = j1Var2.LLJZIJLIL;
            if (interfaceC20054313dN != null) {
                interfaceC20054313dN.destroy();
            }
            j1Var2.LLJZIJLIL = null;
        }
        InterfaceC20054313dN interfaceC20054313dN2 = j1Var.LLJZIJLIL;
        if (interfaceC20054313dN2 != null) {
            interfaceC20054313dN2.destroy();
        }
        j1Var.LLJZIJLIL = null;
    }

    public final void LJII() {
        C20052713d7 c20052713d7;
        InterfaceC20054313dN interfaceC20054313dN;
        j1 j1Var = this.LIZIZ;
        for (AbstractC20055413dY abstractC20055413dY = this.LIZLLL.LLILZIL; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZIL) {
            InterfaceC20052813d8 interfaceC20052813d8LIZJ = C20052513d5.LIZJ(abstractC20055413dY);
            if (interfaceC20052813d8LIZJ != null) {
                j1 j1Var2 = abstractC20055413dY.LLIZLLLIL;
                if (j1Var2 != null) {
                    c20052713d7 = (C20052713d7) j1Var2;
                    InterfaceC20052813d8 interfaceC20052813d8 = c20052713d7.LLLIIIIL;
                    c20052713d7.LLJJIJIIJIL(interfaceC20052813d8LIZJ);
                    if (interfaceC20052813d8 != abstractC20055413dY && (interfaceC20054313dN = c20052713d7.LLJZIJLIL) != null) {
                        interfaceC20054313dN.invalidate();
                    }
                } else {
                    c20052713d7 = new C20052713d7(this.LIZ, interfaceC20052813d8LIZJ);
                    abstractC20055413dY.LLJILLL(c20052713d7);
                }
                j1Var.LLJJIII = c20052713d7;
                c20052713d7.LLJJI = j1Var;
                j1Var = c20052713d7;
            } else {
                abstractC20055413dY.LLJILLL(j1Var);
            }
        }
        C20053713dH c20053713dHLJJIJIL = this.LIZ.LJJIJIL();
        j1Var.LLJJIII = c20053713dHLJJIJIL != null ? c20053713dHLJJIJIL.LLJLLIL.LIZIZ : null;
        this.LIZJ = j1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(e3.e);
        AbstractC20055413dY abstractC20055413dY = this.LJ;
        if (abstractC20055413dY == this.LIZLLL) {
            sb.append(e3.f);
        } else {
            while (true) {
                if (abstractC20055413dY == null || abstractC20055413dY == this.LIZLLL) {
                    break;
                }
                sb.append(String.valueOf(abstractC20055413dY));
                if (abstractC20055413dY.LLILZLL == this.LIZLLL) {
                    sb.append(e3.f);
                    break;
                }
                sb.append(",");
                abstractC20055413dY = abstractC20055413dY.LLILZLL;
            }
        }
        return sb.toString();
    }

    public C20054913dT(C20053713dH c20053713dH) {
        this.LIZ = c20053713dH;
        x xVar = new x(c20053713dH);
        this.LIZIZ = xVar;
        this.LIZJ = xVar;
        C20053413dE c20053413dE = xVar.LLLIIIIL;
        this.LIZLLL = c20053413dE;
        this.LJ = c20053413dE;
    }

    public static AbstractC20055413dY LIZJ(AbstractC20055413dY abstractC20055413dY) {
        if (abstractC20055413dY.LLJILLL) {
            C20028313Yb<Object> c20028313Yb = C20054813dS.LIZ;
            C20054813dS.LIZ(abstractC20055413dY, -1, 2);
            abstractC20055413dY.LLJILJIL();
            abstractC20055413dY.LLILZ();
        }
        AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZLL;
        AbstractC20055413dY abstractC20055413dY3 = abstractC20055413dY.LLILZIL;
        if (abstractC20055413dY2 != null) {
            abstractC20055413dY2.LLILZIL = abstractC20055413dY3;
            abstractC20055413dY.LLILZLL = null;
        }
        if (abstractC20055413dY3 != null) {
            abstractC20055413dY3.LLILZLL = abstractC20055413dY2;
            abstractC20055413dY.LLILZIL = null;
        }
        return abstractC20055413dY3;
    }

    public final boolean LIZLLL(int i) {
        if ((i & this.LJ.LLILZ) != 0) {
            return true;
        }
        return false;
    }

    public static AbstractC20055413dY LIZIZ(InterfaceC1672410tcd interfaceC1672410tcd, AbstractC20055413dY abstractC20055413dY) {
        AbstractC20055413dY c20056313dh;
        if (interfaceC1672410tcd instanceof AbstractC1685820tyG) {
            c20056313dh = ((AbstractC1685820tyG) interfaceC1672410tcd).LJIJI();
            c20056313dh.LLILLL = C20054813dS.LJFF(c20056313dh);
        } else {
            c20056313dh = new C20056313dh(interfaceC1672410tcd);
        }
        if (!(!c20056313dh.LLJILLL)) {
            C1696250uF5.LIZIZ("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c20056313dh.LLJ = true;
        AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZLL;
        if (abstractC20055413dY2 != null) {
            abstractC20055413dY2.LLILZIL = c20056313dh;
            c20056313dh.LLILZLL = abstractC20055413dY2;
        }
        abstractC20055413dY.LLILZLL = c20056313dh;
        c20056313dh.LLILZIL = abstractC20055413dY;
        return c20056313dh;
    }

    public static final void LIZ(C20054913dT c20054913dT, AbstractC20055413dY abstractC20055413dY, j1 j1Var) {
        x xVar;
        c20054913dT.getClass();
        for (AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZIL; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZIL) {
            if (abstractC20055413dY2 == h1.LIZ) {
                C20053713dH c20053713dHLJJIJIL = c20054913dT.LIZ.LJJIJIL();
                if (c20053713dHLJJIJIL != null) {
                    xVar = c20053713dHLJJIJIL.LLJLLIL.LIZIZ;
                } else {
                    xVar = null;
                }
                j1Var.LLJJIII = xVar;
                c20054913dT.LIZJ = j1Var;
                return;
            }
            if ((abstractC20055413dY2.LLILLL & 2) != 0) {
                return;
            }
            abstractC20055413dY2.LLJILLL(j1Var);
        }
    }

    public static void LJIIIIZZ(InterfaceC1672410tcd interfaceC1672410tcd, InterfaceC1672410tcd interfaceC1672410tcd2, AbstractC20055413dY abstractC20055413dY) {
        if ((interfaceC1672410tcd instanceof AbstractC1685820tyG) && (interfaceC1672410tcd2 instanceof AbstractC1685820tyG)) {
            C20057113dp c20057113dp = h1.LIZ;
            ((AbstractC1685820tyG) interfaceC1672410tcd2).LJIJJ(abstractC20055413dY);
            if (abstractC20055413dY.LLJILLL) {
                C20054813dS.LIZJ(abstractC20055413dY);
                return;
            } else {
                abstractC20055413dY.LLJI = true;
                return;
            }
        }
        if (abstractC20055413dY instanceof C20056313dh) {
            C20056313dh c20056313dh = (C20056313dh) abstractC20055413dY;
            if (c20056313dh.LLJILLL) {
                c20056313dh.LLJJI();
            }
            c20056313dh.LLJJ = interfaceC1672410tcd2;
            c20056313dh.LLILLL = C20054813dS.LIZLLL(interfaceC1672410tcd2);
            if (c20056313dh.LLJILLL) {
                c20056313dh.LLJJ(false);
            }
            if (abstractC20055413dY.LLJILLL) {
                C20054813dS.LIZJ(abstractC20055413dY);
                return;
            } else {
                abstractC20055413dY.LLJI = true;
                return;
            }
        }
        C1696250uF5.LIZIZ("Unknown Modifier.Node type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0213, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        if ((r19 & 1) != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        if (r5 > r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r5 == r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r5 == r15) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        if (r9[(r5 + 1) + r20] >= r9[(r5 - 1) + r20]) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        r4 = r9[(r5 + 1) + r20];
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        r2 = r25 - ((r7 - r1) - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        if (r15 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011b, code lost:
    
        if (r1 != r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        r17 = (r17 & r0) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r1 <= r6) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        if (r2 <= r12) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        r16 = r1 - 1;
        r13 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        if (r3.LIZ(r16, r13) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        r1 = r16;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
    
        r9[r20 + r5] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:
    
        if (r18 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        r0 = r19 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        if (r0 < r14) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
    
        if (r0 > r15) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
    
        if (r10[r0 + r20] < r1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        r8[0] = r1;
        r8[1] = r2;
        r8[2] = r4;
        r8[3] = r17;
        r8[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        r5 = r5 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015c, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015f, code lost:
    
        r4 = r9[(r5 - 1) + r20];
        r1 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0168, code lost:
    
        r18 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r32, X.C19968013Aw<X.InterfaceC1672410tcd> r33, X.C19968013Aw<X.InterfaceC1672410tcd> r34, X.AbstractC20055413dY r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20054913dT.LJI(int, X.13Aw, X.13Aw, X.13dY, boolean):void");
    }
}
