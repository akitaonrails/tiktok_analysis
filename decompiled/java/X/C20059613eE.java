package X;

import androidx.compose.ui.focus.FocusTargetNode;
import p2.j1;

/* JADX INFO: renamed from: X.13eE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059613eE {
    public static final FocusTargetNode LIZ(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeLIZJ = C20052513d5.LJI(focusTargetNode).getFocusOwner().LIZJ();
        if (focusTargetNodeLIZJ != null && focusTargetNodeLIZJ.LLJILLL) {
            return focusTargetNodeLIZJ;
        }
        return null;
    }

    public static final C1683130ttv LIZIZ(FocusTargetNode focusTargetNode) {
        C1683130ttv c1683130ttvLJJJJZI;
        j1 j1Var = focusTargetNode.LLIZLLLIL;
        if (j1Var == null || (c1683130ttvLJJJJZI = C1692940u9k.LIZLLL(j1Var).LJJJJZI(j1Var, false)) == null) {
            return C1683130ttv.LJ;
        }
        return c1683130ttvLJJJJZI;
    }

    public static final FocusTargetNode LIZJ(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2;
        if (!focusTargetNode.LL.LLJILLL) {
            return null;
        }
        C19968013Aw c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
        AbstractC20055413dY abstractC20055413dY = focusTargetNode.LL;
        AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZLL;
        if (abstractC20055413dY2 == null) {
            C20052513d5.LIZ(c19968013Aw, abstractC20055413dY);
        } else {
            c19968013Aw.LIZLLL(abstractC20055413dY2);
        }
        loop0: while (true) {
            int i = c19968013Aw.LLILLL;
            if (i == 0) {
                return null;
            }
            AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw.LJIILIIL(i - 1);
            if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                C20052513d5.LIZ(c19968013Aw, abstractC20055413dYLIZIZ);
            } else {
                while (true) {
                    if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                        C19968013Aw c19968013Aw2 = null;
                        do {
                            if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                focusTargetNode2 = (FocusTargetNode) abstractC20055413dYLIZIZ;
                                if (focusTargetNode2.LL.LLJILLL) {
                                    int i2 = C20060513eN.LIZIZ[focusTargetNode2.LJJJ().ordinal()];
                                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                                        break loop0;
                                    }
                                }
                            } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                int i3 = 0;
                                for (AbstractC20055413dY abstractC20055413dY3 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY3 != null; abstractC20055413dY3 = abstractC20055413dY3.LLILZLL) {
                                    if ((abstractC20055413dY3.LLILLL & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC20055413dYLIZIZ = abstractC20055413dY3;
                                        } else {
                                            if (c19968013Aw2 == null) {
                                                c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                                            }
                                            if (abstractC20055413dYLIZIZ != null) {
                                                c19968013Aw2.LIZLLL(abstractC20055413dYLIZIZ);
                                                abstractC20055413dYLIZIZ = null;
                                            }
                                            c19968013Aw2.LIZLLL(abstractC20055413dY3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw2);
                        } while (abstractC20055413dYLIZIZ != null);
                    } else {
                        abstractC20055413dYLIZIZ = abstractC20055413dYLIZIZ.LLILZLL;
                        if (abstractC20055413dYLIZIZ != null) {
                        }
                    }
                }
            }
        }
        return focusTargetNode2;
    }

    public static final boolean LIZLLL(FocusTargetNode focusTargetNode) {
        C20053713dH c20053713dH;
        j1 j1Var;
        C20053713dH c20053713dH2;
        j1 j1Var2 = focusTargetNode.LLIZLLLIL;
        if (j1Var2 != null && (c20053713dH = j1Var2.LLJILJILJ) != null && c20053713dH.LJIJJ() && (j1Var = focusTargetNode.LLIZLLLIL) != null && (c20053713dH2 = j1Var.LLJILJILJ) != null && c20053713dH2.LIZLLL()) {
            return true;
        }
        return false;
    }
}
