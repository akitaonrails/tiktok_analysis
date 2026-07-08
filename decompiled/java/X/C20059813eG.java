package X;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS5S0501000_30;

/* JADX INFO: renamed from: X.13eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059813eG {
    public static final boolean LIZ(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        EnumC20061113eT enumC20061113eTLJJJ = focusTargetNode.LJJJ();
        int[] iArr = C20061213eU.LIZ;
        int i = iArr[enumC20061113eTLJJJ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (!LIZLLL(focusTargetNode, function1) && (!focusTargetNode.LLJJI().LIZ || !function1.invoke(focusTargetNode).booleanValue())) {
                        return false;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                return LIZLLL(focusTargetNode, function1);
            }
        } else {
            FocusTargetNode focusTargetNodeLIZJ = C20059613eE.LIZJ(focusTargetNode);
            if (focusTargetNodeLIZJ != null) {
                int i2 = iArr[focusTargetNodeLIZJ.LJJJ().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            throw new C1954807lC();
                        }
                        "ActiveParent must have a focusedChild".toString();
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                    return LIZJ(focusTargetNode, focusTargetNodeLIZJ, 2, function1);
                }
                if (!LIZ(focusTargetNodeLIZJ, function1) && !LIZJ(focusTargetNode, focusTargetNodeLIZJ, 2, function1) && (!focusTargetNodeLIZJ.LLJJI().LIZ || !function1.invoke(focusTargetNodeLIZJ).booleanValue())) {
                    return false;
                }
            } else {
                "ActiveParent must have a focusedChild".toString();
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return true;
    }

    public static final boolean LIZIZ(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i = C20061213eU.LIZ[focusTargetNode.LJJJ().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (focusTargetNode.LLJJI().LIZ) {
                        return function1.invoke(focusTargetNode).booleanValue();
                    }
                    return LJ(focusTargetNode, function1);
                }
                throw new C1954807lC();
            }
            return LJ(focusTargetNode, function1);
        }
        FocusTargetNode focusTargetNodeLIZJ = C20059613eE.LIZJ(focusTargetNode);
        if (focusTargetNodeLIZJ != null) {
            if (LIZIZ(focusTargetNodeLIZJ, function1) || LIZJ(focusTargetNode, focusTargetNodeLIZJ, 1, function1)) {
                return true;
            }
            return false;
        }
        "ActiveParent must have a focusedChild".toString();
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean LIZLLL(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        C19968013Aw c19968013Aw = new C19968013Aw(new FocusTargetNode[16]);
        if (!focusTargetNode.LL.LLJILLL) {
            C1696250uF5.LIZIZ("visitChildren called on an unattached node");
        }
        C19968013Aw c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
        AbstractC20055413dY abstractC20055413dY = focusTargetNode.LL;
        AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZLL;
        if (abstractC20055413dY2 == null) {
            C20052513d5.LIZ(c19968013Aw2, abstractC20055413dY);
        } else {
            c19968013Aw2.LIZLLL(abstractC20055413dY2);
        }
        while (true) {
            int i = c19968013Aw2.LLILLL;
            if (i == 0) {
                break;
            }
            AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw2.LJIILIIL(i - 1);
            if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                C20052513d5.LIZ(c19968013Aw2, abstractC20055413dYLIZIZ);
            } else {
                while (true) {
                    if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                        C19968013Aw c19968013Aw3 = null;
                        do {
                            if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                c19968013Aw.LIZLLL(abstractC20055413dYLIZIZ);
                            } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                int i2 = 0;
                                for (AbstractC20055413dY abstractC20055413dY3 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY3 != null; abstractC20055413dY3 = abstractC20055413dY3.LLILZLL) {
                                    if ((abstractC20055413dY3.LLILLL & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC20055413dYLIZIZ = abstractC20055413dY3;
                                        } else {
                                            if (c19968013Aw3 == null) {
                                                c19968013Aw3 = new C19968013Aw(new AbstractC20055413dY[16]);
                                            }
                                            if (abstractC20055413dYLIZIZ != null) {
                                                c19968013Aw3.LIZLLL(abstractC20055413dYLIZIZ);
                                                abstractC20055413dYLIZIZ = null;
                                            }
                                            c19968013Aw3.LIZLLL(abstractC20055413dY3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw3);
                        } while (abstractC20055413dYLIZIZ != null);
                    } else {
                        abstractC20055413dYLIZIZ = abstractC20055413dYLIZIZ.LLILZLL;
                        if (abstractC20055413dYLIZIZ != null) {
                        }
                    }
                }
            }
        }
        c19968013Aw.LJIIZILJ(C20051713cx.LL);
        int i3 = c19968013Aw.LLILLL - 1;
        Object[] objArr = c19968013Aw.LL;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
                if (C20059613eE.LIZLLL(focusTargetNode2) && LIZ(focusTargetNode2, function1)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    public static final boolean LJ(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        C19968013Aw c19968013Aw = new C19968013Aw(new FocusTargetNode[16]);
        if (!focusTargetNode.LL.LLJILLL) {
            C1696250uF5.LIZIZ("visitChildren called on an unattached node");
        }
        C19968013Aw c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
        AbstractC20055413dY abstractC20055413dY = focusTargetNode.LL;
        AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LLILZLL;
        if (abstractC20055413dY2 == null) {
            C20052513d5.LIZ(c19968013Aw2, abstractC20055413dY);
        } else {
            c19968013Aw2.LIZLLL(abstractC20055413dY2);
        }
        while (true) {
            int i = c19968013Aw2.LLILLL;
            if (i == 0) {
                break;
            }
            AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw2.LJIILIIL(i - 1);
            if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                C20052513d5.LIZ(c19968013Aw2, abstractC20055413dYLIZIZ);
            } else {
                while (true) {
                    if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                        C19968013Aw c19968013Aw3 = null;
                        do {
                            if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                c19968013Aw.LIZLLL(abstractC20055413dYLIZIZ);
                            } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                int i2 = 0;
                                for (AbstractC20055413dY abstractC20055413dY3 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY3 != null; abstractC20055413dY3 = abstractC20055413dY3.LLILZLL) {
                                    if ((abstractC20055413dY3.LLILLL & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC20055413dYLIZIZ = abstractC20055413dY3;
                                        } else {
                                            if (c19968013Aw3 == null) {
                                                c19968013Aw3 = new C19968013Aw(new AbstractC20055413dY[16]);
                                            }
                                            if (abstractC20055413dYLIZIZ != null) {
                                                c19968013Aw3.LIZLLL(abstractC20055413dYLIZIZ);
                                                abstractC20055413dYLIZIZ = null;
                                            }
                                            c19968013Aw3.LIZLLL(abstractC20055413dY3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw3);
                        } while (abstractC20055413dYLIZIZ != null);
                    } else {
                        abstractC20055413dYLIZIZ = abstractC20055413dYLIZIZ.LLILZLL;
                        if (abstractC20055413dYLIZIZ != null) {
                        }
                    }
                }
            }
        }
        c19968013Aw.LJIIZILJ(C20051713cx.LL);
        Object[] objArr = c19968013Aw.LL;
        int i3 = c19968013Aw.LLILLL;
        for (int i4 = 0; i4 < i3; i4++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
            if (C20059613eE.LIZLLL(focusTargetNode2) && LIZIZ(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (LJFF(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        C20045513bx c20045513bxLJII = C20052513d5.LJI(focusTargetNode).getFocusOwner().LJII();
        c20045513bxLJII.getClass();
        Boolean bool = (Boolean) C1697410uGx.LIZ(focusTargetNode, i, new AwS5S0501000_30(c20045513bxLJII, C20052513d5.LJI(focusTargetNode).getFocusOwner().LIZJ(), focusTargetNode, focusTargetNode2, i, function1, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0199, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f A[PHI: r3
      0x017f: PHI (r3v3 X.13Aw) = (r3v2 X.13Aw), (r3v2 X.13Aw), (r3v5 X.13Aw) binds: [B:101:0x0150, B:103:0x0154, B:118:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[LOOP:8: B:96:0x013d->B:167:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF(androidx.compose.ui.focus.FocusTargetNode r11, androidx.compose.ui.focus.FocusTargetNode r12, int r13, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20059813eG.LJFF(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):boolean");
    }
}
