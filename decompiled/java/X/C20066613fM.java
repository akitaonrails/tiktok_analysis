package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import p2.j1;

/* JADX INFO: renamed from: X.13fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20066613fM extends C20067213fS {
    public final AbstractC20055413dY LIZJ;
    public j1 LJFF;
    public C20067313fT LJI;
    public boolean LJII;
    public final C20067613fW LIZLLL = new C20067613fW();
    public final C20066713fN<C20066813fO> LJ = new C20066713fN<>(2);
    public boolean LJIIIIZZ = true;
    public boolean LJIIIZ = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void LIZJ() {
        C19968013Aw<C20066613fM> c19968013Aw = this.LIZ;
        C20066613fM[] c20066613fMArr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            c20066613fMArr[i2].LIZJ();
        }
        ?? LIZIZ = this.LIZJ;
        ?? c19968013Aw2 = 0;
        while (LIZIZ != 0) {
            if (LIZIZ instanceof InterfaceC20056213dg) {
                ((InterfaceC20056213dg) LIZIZ).LLIIIILZ();
            } else if ((LIZIZ.LLILLL & 16) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                AbstractC20055413dY abstractC20055413dY = ((AbstractC20055313dX) LIZIZ).LLJJI;
                int i3 = 0;
                c19968013Aw2 = c19968013Aw2;
                LIZIZ = LIZIZ;
                while (abstractC20055413dY != null) {
                    if ((abstractC20055413dY.LLILLL & 16) != 0) {
                        i3++;
                        c19968013Aw2 = c19968013Aw2;
                        if (i3 == 1) {
                            LIZIZ = abstractC20055413dY;
                        } else {
                            if (c19968013Aw2 == 0) {
                                c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                            }
                            if (LIZIZ != 0) {
                                c19968013Aw2.LIZLLL(LIZIZ);
                                LIZIZ = 0;
                            }
                            c19968013Aw2.LIZLLL(abstractC20055413dY);
                        }
                    }
                    abstractC20055413dY = abstractC20055413dY.LLILZLL;
                    c19968013Aw2 = c19968013Aw2;
                    LIZIZ = LIZIZ;
                }
                if (i3 == 1) {
                }
            }
            LIZIZ = C20052513d5.LIZIZ(c19968013Aw2);
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Node(modifierNode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", children=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pointerIds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20066613fM(AbstractC20055413dY abstractC20055413dY) {
        this.LIZJ = abstractC20055413dY;
    }

    @Override // X.C20067213fS
    public final void LIZIZ(C20067413fU c20067413fU) {
        super.LIZIZ(c20067413fU);
        C20067313fT c20067313fT = this.LJI;
        if (c20067313fT == null) {
            return;
        }
        this.LJII = this.LJIIIIZZ;
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C20066813fO c20066813fO = (C20066813fO) ListProtector.get(list, i);
            boolean z2 = !c20066813fO.LIZLLL;
            boolean z3 = !c20067413fU.LIZ(c20066813fO.LIZ);
            boolean z4 = !this.LJIIIIZZ;
            if (z2 && (z3 || z4)) {
                this.LIZLLL.LIZJ(c20066813fO.LIZ);
            }
        }
        this.LJIIIIZZ = false;
        if (c20067313fT.LIZLLL == 5) {
            z = true;
        }
        this.LJIIIZ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean LIZLLL(C20067413fU c20067413fU) {
        boolean z = false;
        z = false;
        if (!this.LJ.LJII()) {
            ?? LIZIZ = this.LIZJ;
            if (LIZIZ.LLJILLL) {
                C20067313fT c20067313fT = this.LJI;
                long j = this.LJFF.LLILLL;
                ?? c19968013Aw = 0;
                while (LIZIZ != 0) {
                    if (LIZIZ instanceof InterfaceC20056213dg) {
                        ((InterfaceC20056213dg) LIZIZ).LJJJZ(c20067313fT, EnumC20065813fE.Final, j);
                    } else if ((LIZIZ.LLILLL & 16) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                        AbstractC20055413dY abstractC20055413dY = ((AbstractC20055313dX) LIZIZ).LLJJI;
                        int i = 0;
                        c19968013Aw = c19968013Aw;
                        LIZIZ = LIZIZ;
                        while (abstractC20055413dY != null) {
                            if ((abstractC20055413dY.LLILLL & 16) != 0) {
                                i++;
                                c19968013Aw = c19968013Aw;
                                if (i == 1) {
                                    LIZIZ = abstractC20055413dY;
                                } else {
                                    if (c19968013Aw == 0) {
                                        c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                    }
                                    if (LIZIZ != 0) {
                                        c19968013Aw.LIZLLL(LIZIZ);
                                        LIZIZ = 0;
                                    }
                                    c19968013Aw.LIZLLL(abstractC20055413dY);
                                }
                            }
                            abstractC20055413dY = abstractC20055413dY.LLILZLL;
                            c19968013Aw = c19968013Aw;
                            LIZIZ = LIZIZ;
                        }
                        if (i == 1) {
                        }
                    }
                    LIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                }
                if (this.LIZJ.LLJILLL) {
                    C19968013Aw<C20066613fM> c19968013Aw2 = this.LIZ;
                    C20066613fM[] c20066613fMArr = c19968013Aw2.LL;
                    int i2 = c19968013Aw2.LLILLL;
                    for (int i3 = 0; i3 < i2; i3++) {
                        c20066613fMArr[i3].LIZLLL(c20067413fU);
                    }
                }
                z = true;
            }
        }
        LIZIZ(c20067413fU);
        this.LJ.LIZIZ();
        this.LJFF = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v10, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean LJ(C20067413fU c20067413fU, boolean z) {
        if (this.LJ.LJII()) {
            return false;
        }
        ?? LIZIZ = this.LIZJ;
        if (!LIZIZ.LLJILLL) {
            return false;
        }
        C20067313fT c20067313fT = this.LJI;
        long j = this.LJFF.LLILLL;
        ?? c19968013Aw = 0;
        while (LIZIZ != 0) {
            if (LIZIZ instanceof InterfaceC20056213dg) {
                ((InterfaceC20056213dg) LIZIZ).LJJJZ(c20067313fT, EnumC20065813fE.Initial, j);
            } else if ((LIZIZ.LLILLL & 16) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                AbstractC20055413dY abstractC20055413dY = ((AbstractC20055313dX) LIZIZ).LLJJI;
                int i = 0;
                c19968013Aw = c19968013Aw;
                LIZIZ = LIZIZ;
                while (abstractC20055413dY != null) {
                    if ((abstractC20055413dY.LLILLL & 16) != 0) {
                        i++;
                        c19968013Aw = c19968013Aw;
                        if (i == 1) {
                            LIZIZ = abstractC20055413dY;
                        } else {
                            if (c19968013Aw == 0) {
                                c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                            }
                            if (LIZIZ != 0) {
                                c19968013Aw.LIZLLL(LIZIZ);
                                LIZIZ = 0;
                            }
                            c19968013Aw.LIZLLL(abstractC20055413dY);
                        }
                    }
                    abstractC20055413dY = abstractC20055413dY.LLILZLL;
                    c19968013Aw = c19968013Aw;
                    LIZIZ = LIZIZ;
                }
                if (i == 1) {
                }
            }
            LIZIZ = C20052513d5.LIZIZ(c19968013Aw);
        }
        if (this.LIZJ.LLJILLL) {
            C19968013Aw<C20066613fM> c19968013Aw2 = this.LIZ;
            C20066613fM[] c20066613fMArr = c19968013Aw2.LL;
            int i2 = c19968013Aw2.LLILLL;
            for (int i3 = 0; i3 < i2; i3++) {
                c20066613fMArr[i3].LJ(c20067413fU, z);
            }
        }
        ?? LIZIZ2 = this.LIZJ;
        if (LIZIZ2.LLJILLL) {
            ?? c19968013Aw3 = 0;
            do {
                if (LIZIZ2 instanceof InterfaceC20056213dg) {
                    ((InterfaceC20056213dg) LIZIZ2).LJJJZ(c20067313fT, EnumC20065813fE.Main, j);
                } else if ((LIZIZ2.LLILLL & 16) != 0 && (LIZIZ2 instanceof AbstractC20055313dX)) {
                    AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) LIZIZ2).LLJJI;
                    int i4 = 0;
                    c19968013Aw3 = c19968013Aw3;
                    LIZIZ2 = LIZIZ2;
                    while (abstractC20055413dY2 != null) {
                        if ((abstractC20055413dY2.LLILLL & 16) != 0) {
                            i4++;
                            c19968013Aw3 = c19968013Aw3;
                            if (i4 == 1) {
                                LIZIZ2 = abstractC20055413dY2;
                            } else {
                                if (c19968013Aw3 == 0) {
                                    c19968013Aw3 = new C19968013Aw(new AbstractC20055413dY[16]);
                                }
                                if (LIZIZ2 != 0) {
                                    c19968013Aw3.LIZLLL(LIZIZ2);
                                    LIZIZ2 = 0;
                                }
                                c19968013Aw3.LIZLLL(abstractC20055413dY2);
                            }
                        }
                        abstractC20055413dY2 = abstractC20055413dY2.LLILZLL;
                        c19968013Aw3 = c19968013Aw3;
                        LIZIZ2 = LIZIZ2;
                    }
                    if (i4 == 1) {
                    }
                }
                LIZIZ2 = C20052513d5.LIZIZ(c19968013Aw3);
            } while (LIZIZ2 != 0);
        }
        return true;
    }

    public final void LJFF(long j, C13B1<C20066613fM> c13b1) {
        if (this.LIZLLL.LIZIZ(j) && c13b1.LIZJ(this) < 0) {
            this.LIZLLL.LIZJ(j);
            this.LJ.LJIIJ(j);
        }
        C19968013Aw<C20066613fM> c19968013Aw = this.LIZ;
        C20066613fM[] c20066613fMArr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            c20066613fMArr[i2].LJFF(j, c13b1);
        }
    }

    @Override // X.C20067213fS
    public final boolean LIZ(C20066713fN<C20066813fO> c20066713fN, InterfaceC1692950u9l interfaceC1692950u9l, C20067413fU c20067413fU, boolean z) {
        Object obj;
        boolean z2;
        C20067313fT c20067313fT;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        C20067613fW c20067613fW;
        int i2;
        boolean zLIZ = super.LIZ(c20066713fN, interfaceC1692950u9l, c20067413fU, z);
        AbstractC20055413dY abstractC20055413dYLIZIZ = this.LIZJ;
        if (!abstractC20055413dYLIZIZ.LLJILLL) {
            return true;
        }
        C19968013Aw c19968013Aw = null;
        do {
            if (abstractC20055413dYLIZIZ instanceof InterfaceC20056213dg) {
                this.LJFF = C20052513d5.LIZLLL(abstractC20055413dYLIZIZ, 16);
            } else if ((abstractC20055413dYLIZIZ.LLILLL & 16) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                int i3 = 0;
                for (AbstractC20055413dY abstractC20055413dY = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
                    if ((abstractC20055413dY.LLILLL & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            abstractC20055413dYLIZIZ = abstractC20055413dY;
                        } else {
                            if (c19968013Aw == null) {
                                c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                            }
                            if (abstractC20055413dYLIZIZ != null) {
                                c19968013Aw.LIZLLL(abstractC20055413dYLIZIZ);
                                abstractC20055413dYLIZIZ = null;
                            }
                            c19968013Aw.LIZLLL(abstractC20055413dY);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw);
        } while (abstractC20055413dYLIZIZ != null);
        if (this.LJFF == null) {
            return true;
        }
        int iLJIIJJI = c20066713fN.LJIIJJI();
        for (int i4 = 0; i4 < iLJIIJJI; i4++) {
            long jLJIIIIZZ = c20066713fN.LJIIIIZZ(i4);
            C20066813fO c20066813fOLJIIL = c20066713fN.LJIIL(i4);
            if (this.LIZLLL.LIZIZ(jLJIIIIZZ)) {
                long j = c20066813fOLJIIL.LJI;
                long j2 = c20066813fOLJIIL.LIZJ;
                if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                    List list = c20066813fOLJIIL.LJIIJ;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(list.size());
                    List list2 = c20066813fOLJIIL.LJIIJ;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    int size = list2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        C1395905dF c1395905dF = (C1395905dF) ListProtector.get(list2, i5);
                        long j3 = c1395905dF.LIZIZ;
                        if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            arrayList.add(new C1395905dF(c1395905dF.LIZ, this.LJFF.LJIL(interfaceC1692950u9l, j3), c1395905dF.LIZJ));
                        }
                    }
                    C20066713fN<C20066813fO> c20066713fN2 = this.LJ;
                    C20066813fO c20066813fO = new C20066813fO(c20066813fOLJIIL.LIZ, c20066813fOLJIIL.LIZIZ, this.LJFF.LJIL(interfaceC1692950u9l, j2), c20066813fOLJIIL.LIZLLL, c20066813fOLJIIL.LJ, c20066813fOLJIIL.LJFF, this.LJFF.LJIL(interfaceC1692950u9l, j), c20066813fOLJIIL.LJII, c20066813fOLJIIL.LJIIIIZZ, arrayList, c20066813fOLJIIL.LJIIIZ, c20066813fOLJIIL.LJIIJJI);
                    C20066813fO c20066813fO2 = c20066813fOLJIIL.LJIILJJIL;
                    if (c20066813fO2 == null) {
                        c20066813fO2 = c20066813fOLJIIL;
                    }
                    c20066813fO.LJIILJJIL = c20066813fO2;
                    C20066813fO c20066813fO3 = c20066813fOLJIIL.LJIILJJIL;
                    if (c20066813fO3 != null) {
                        c20066813fOLJIIL = c20066813fO3;
                    }
                    c20066813fO.LJIILJJIL = c20066813fOLJIIL;
                    c20066713fN2.LJIIIZ(jLJIIIIZZ, c20066813fO);
                }
            }
        }
        if (this.LJ.LJII()) {
            this.LIZLLL.LIZ = 0;
            this.LIZ.LJIIIZ();
            return true;
        }
        for (int i6 = this.LIZLLL.LIZ - 1; -1 < i6; i6--) {
            if (!c20066713fN.LIZLLL(this.LIZLLL.LIZIZ[i6]) && i6 < (i2 = (c20067613fW = this.LIZLLL).LIZ)) {
                int i7 = i2 - 1;
                int i8 = i6;
                while (i8 < i7) {
                    long[] jArr = c20067613fW.LIZIZ;
                    int i9 = i8 + 1;
                    jArr[i8] = jArr[i9];
                    i8 = i9;
                }
                c20067613fW.LIZ--;
            }
        }
        ArrayList arrayList2 = new ArrayList(this.LJ.LJIIJJI());
        int iLJIIJJI2 = this.LJ.LJIIJJI();
        for (int i10 = 0; i10 < iLJIIJJI2; i10++) {
            arrayList2.add(this.LJ.LJIIL(i10));
        }
        C20067313fT c20067313fT2 = new C20067313fT(arrayList2, c20067413fU);
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                obj = ListProtector.get(arrayList2, i11);
                if (c20067413fU.LIZ(((C20066813fO) obj).LIZ)) {
                    break;
                }
                i11++;
            } else {
                obj = null;
                break;
            }
        }
        C20066813fO c20066813fO4 = (C20066813fO) obj;
        if (c20066813fO4 != null) {
            if (!z) {
                this.LJIIIIZZ = false;
            } else if (!this.LJIIIIZZ && (c20066813fO4.LIZLLL || c20066813fO4.LJII)) {
                long j4 = this.LJFF.LLILLL;
                long j5 = c20066813fO4.LIZJ;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                int i12 = (int) (j4 >> 32);
                int i13 = (int) (j4 & 4294967295L);
                if (fIntBitsToFloat < 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fIntBitsToFloat > i12) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z7 = z4 | z3;
                if (fIntBitsToFloat2 < 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z8 = z7 | z5;
                if (fIntBitsToFloat2 > i13) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.LJIIIIZZ = !(z8 | z6);
            }
            boolean z9 = this.LJIIIIZZ;
            boolean z10 = this.LJII;
            int i14 = 5;
            if (z9 != z10 && ((i = c20067313fT2.LIZLLL) == 3 || i == 4 || i == 5)) {
                if (z9) {
                    i14 = 4;
                }
                c20067313fT2.LIZLLL = i14;
            } else {
                int i15 = c20067313fT2.LIZLLL;
                if (i15 == 4 && z10 && !this.LJIIIZ) {
                    c20067313fT2.LIZLLL = 3;
                } else if (i15 == 5 && z9 && c20066813fO4.LIZLLL) {
                    c20067313fT2.LIZLLL = 3;
                }
            }
        }
        if (!zLIZ && c20067313fT2.LIZLLL == 3 && (c20067313fT = this.LJI) != null && c20067313fT.LIZ.size() == c20067313fT2.LIZ.size()) {
            int size3 = c20067313fT2.LIZ.size();
            for (int i16 = 0; i16 < size3; i16++) {
                if (!C1378605aS.LIZJ(((C20066813fO) ListProtector.get(c20067313fT.LIZ, i16)).LIZJ, ((C20066813fO) ListProtector.get(c20067313fT2.LIZ, i16)).LIZJ)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = true;
            break;
        }
        this.LJI = c20067313fT2;
        return z2;
    }
}
