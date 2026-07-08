package X;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS5S0501000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059913eH {
    public static final void LIZJ(InterfaceC1691470u7N interfaceC1691470u7N, C19968013Aw<FocusTargetNode> c19968013Aw) {
        if (!interfaceC1691470u7N.LJIJJ().LLJILLL) {
            C1696250uF5.LIZIZ("visitChildren called on an unattached node");
        }
        C19968013Aw c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
        AbstractC20055413dY abstractC20055413dY = interfaceC1691470u7N.LJIJJ().LLILZLL;
        if (abstractC20055413dY == null) {
            C20052513d5.LIZ(c19968013Aw2, interfaceC1691470u7N.LJIJJ());
        } else {
            c19968013Aw2.LIZLLL(abstractC20055413dY);
        }
        while (true) {
            int i = c19968013Aw2.LLILLL;
            if (i != 0) {
                AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw2.LJIILIIL(i - 1);
                if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                    C20052513d5.LIZ(c19968013Aw2, abstractC20055413dYLIZIZ);
                } else {
                    while (true) {
                        if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                            C19968013Aw c19968013Aw3 = null;
                            do {
                                if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) abstractC20055413dYLIZIZ;
                                    if (focusTargetNode.LLJILLL && !C20052513d5.LJFF(focusTargetNode).LLLII) {
                                        if (focusTargetNode.LLJJI().LIZ) {
                                            c19968013Aw.LIZLLL(focusTargetNode);
                                        } else {
                                            LIZJ(focusTargetNode, c19968013Aw);
                                        }
                                    }
                                } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                    int i2 = 0;
                                    for (AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
                                        if ((abstractC20055413dY2.LLILLL & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                abstractC20055413dYLIZIZ = abstractC20055413dY2;
                                            } else {
                                                if (c19968013Aw3 == null) {
                                                    c19968013Aw3 = new C19968013Aw(new AbstractC20055413dY[16]);
                                                }
                                                if (abstractC20055413dYLIZIZ != null) {
                                                    c19968013Aw3.LIZLLL(abstractC20055413dYLIZIZ);
                                                    abstractC20055413dYLIZIZ = null;
                                                }
                                                c19968013Aw3.LIZLLL(abstractC20055413dY2);
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
            } else {
                return;
            }
        }
    }

    public static final boolean LIZIZ(int i, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
        if (i != 3 && i != 4) {
            if (i != 5 && i != 6) {
                "This function should only be used for 2-D focus search".toString();
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c1683130ttv.LIZJ <= c1683130ttv2.LIZ || c1683130ttv.LIZ >= c1683130ttv2.LIZJ) {
                return false;
            }
        } else if (c1683130ttv.LIZLLL <= c1683130ttv2.LIZIZ || c1683130ttv.LIZIZ >= c1683130ttv2.LIZLLL) {
            return false;
        }
        return true;
    }

    public static final FocusTargetNode LIZLLL(C19968013Aw<FocusTargetNode> c19968013Aw, C1683130ttv c1683130ttv, int i) {
        boolean z;
        C1683130ttv c1683130ttvLJIIIIZZ;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1683130ttvLJIIIIZZ = c1683130ttv.LJIIIIZZ((c1683130ttv.LIZJ - c1683130ttv.LIZ) + 1, 0.0f);
        } else if (i == 4) {
            c1683130ttvLJIIIIZZ = c1683130ttv.LJIIIIZZ(-((c1683130ttv.LIZJ - c1683130ttv.LIZ) + 1), 0.0f);
        } else if (i == 5) {
            c1683130ttvLJIIIIZZ = c1683130ttv.LJIIIIZZ(0.0f, (c1683130ttv.LIZLLL - c1683130ttv.LIZIZ) + 1);
        } else if (i == 6) {
            c1683130ttvLJIIIIZZ = c1683130ttv.LJIIIIZZ(0.0f, -((c1683130ttv.LIZLLL - c1683130ttv.LIZIZ) + 1));
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        FocusTargetNode[] focusTargetNodeArr = c19968013Aw.LL;
        int i2 = c19968013Aw.LLILLL;
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i3];
            if (C20059613eE.LIZLLL(focusTargetNode2)) {
                C1683130ttv c1683130ttvLIZIZ = C20059613eE.LIZIZ(focusTargetNode2);
                if (LJI(c1683130ttvLIZIZ, c1683130ttvLJIIIIZZ, c1683130ttv, i)) {
                    focusTargetNode = focusTargetNode2;
                    c1683130ttvLJIIIIZZ = c1683130ttvLIZIZ;
                }
            }
        }
        return focusTargetNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(androidx.compose.ui.focus.FocusTargetNode r5, int r6, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r7) {
        /*
            X.13Aw r3 = new X.13Aw
            r0 = 16
            androidx.compose.ui.focus.FocusTargetNode[] r0 = new androidx.compose.ui.focus.FocusTargetNode[r0]
            r3.<init>(r0)
            LIZJ(r5, r3)
            int r1 = r3.LLILLL
            r4 = 0
            r0 = 1
            if (r1 > r0) goto L25
            if (r1 == 0) goto L24
            T[] r0 = r3.LL
            r0 = r0[r4]
            if (r0 == 0) goto L24
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
        L24:
            return r4
        L25:
            r0 = 7
            if (r6 != r0) goto L6f
            r1 = 1
        L29:
            r0 = 4
            if (r1 == 0) goto L4b
            r6 = 4
        L2d:
            X.0ttv r0 = X.C20059613eE.LIZIZ(r5)
            X.0ttv r2 = new X.0ttv
            float r1 = r0.LIZ
            float r0 = r0.LIZIZ
            r2.<init>(r1, r0, r1, r0)
        L3a:
            androidx.compose.ui.focus.FocusTargetNode r0 = LIZLLL(r3, r2, r6)
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
        L4a:
            return r4
        L4b:
            if (r6 == r0) goto L2d
            r0 = 6
            if (r6 == r0) goto L2d
            r0 = 3
            if (r6 == r0) goto L61
            r0 = 5
            if (r6 == r0) goto L61
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            r0.toString()
            r1.<init>(r0)
            throw r1
        L61:
            X.0ttv r0 = X.C20059613eE.LIZIZ(r5)
            X.0ttv r2 = new X.0ttv
            float r1 = r0.LIZJ
            float r0 = r0.LIZLLL
            r2.<init>(r1, r0, r1, r0)
            goto L3a
        L6f:
            r1 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20059913eH.LJ(androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):boolean");
    }

    public static final boolean LJII(int i, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
        if (i == 3) {
            float f = c1683130ttv2.LIZJ;
            float f2 = c1683130ttv.LIZJ;
            if ((f > f2 || c1683130ttv2.LIZ >= f2) && c1683130ttv2.LIZ > c1683130ttv.LIZ) {
                return true;
            }
            return false;
        }
        if (i == 4) {
            float f3 = c1683130ttv2.LIZ;
            float f4 = c1683130ttv.LIZ;
            if ((f3 < f4 || c1683130ttv2.LIZJ <= f4) && c1683130ttv2.LIZJ < c1683130ttv.LIZJ) {
                return true;
            }
            return false;
        }
        if (i == 5) {
            float f5 = c1683130ttv2.LIZLLL;
            float f6 = c1683130ttv.LIZLLL;
            if ((f5 > f6 || c1683130ttv2.LIZIZ >= f6) && c1683130ttv2.LIZIZ > c1683130ttv.LIZIZ) {
                return true;
            }
            return false;
        }
        if (i == 6) {
            float f7 = c1683130ttv2.LIZIZ;
            float f8 = c1683130ttv.LIZIZ;
            if ((f7 < f8 || c1683130ttv2.LIZLLL <= f8) && c1683130ttv2.LIZLLL < c1683130ttv.LIZLLL) {
                return true;
            }
            return false;
        }
        "This function should only be used for 2-D focus search".toString();
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final long LJIIIIZZ(int i, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = c1683130ttv.LIZ;
            f2 = c1683130ttv2.LIZJ;
        } else if (i == 4) {
            f = c1683130ttv2.LIZ;
            f2 = c1683130ttv.LIZJ;
        } else if (i == 5) {
            f = c1683130ttv.LIZIZ;
            f2 = c1683130ttv2.LIZLLL;
        } else if (i == 6) {
            f = c1683130ttv2.LIZIZ;
            f2 = c1683130ttv.LIZLLL;
        } else {
            "This function should only be used for 2-D focus search".toString();
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = f - f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i != 3 && i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            float f8 = c1683130ttv.LIZIZ;
            f3 = 2;
            f4 = f8 + ((c1683130ttv.LIZLLL - f8) / f3);
            f5 = c1683130ttv2.LIZIZ;
            f6 = c1683130ttv2.LIZLLL;
        } else {
            if (i != 5 && i != 6) {
                "This function should only be used for 2-D focus search".toString();
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = c1683130ttv.LIZ;
            f3 = 2;
            f4 = f9 + ((c1683130ttv.LIZJ - f9) / f3);
            f5 = c1683130ttv2.LIZ;
            f6 = c1683130ttv2.LIZJ;
        }
        long j2 = (long) (f4 - (f5 + ((f6 - f5) / f3)));
        return (((long) 13) * j * j) + (j2 * j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.C1683130ttv r9, X.C1683130ttv r10, X.C1683130ttv r11, int r12) {
        /*
            boolean r0 = LIZIZ(r12, r11, r9)
            r8 = 0
            if (r0 != 0) goto L45
            boolean r0 = LIZIZ(r12, r10, r9)
            if (r0 == 0) goto L45
            r6 = 3
            if (r12 != r6) goto L91
            r0 = 1
        L11:
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r5 = 6
            r4 = 5
            r2 = 4
            if (r0 == 0) goto L70
            float r1 = r9.LIZ
            float r0 = r11.LIZJ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L44
        L20:
            if (r12 == r6) goto L44
            if (r12 == r2) goto L44
            if (r12 != r6) goto L5b
            float r7 = r9.LIZ
            float r0 = r10.LIZJ
        L2a:
            float r7 = r7 - r0
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L31
            r7 = 0
        L31:
            if (r12 != r6) goto L46
            float r1 = r9.LIZ
            float r0 = r11.LIZ
        L37:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L40
            r1 = 1065353216(0x3f800000, float:1.0)
        L40:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L45
        L44:
            r8 = 1
        L45:
            return r8
        L46:
            if (r12 != r2) goto L4d
            float r1 = r11.LIZJ
            float r0 = r9.LIZJ
            goto L37
        L4d:
            if (r12 != r4) goto L54
            float r1 = r9.LIZIZ
            float r0 = r11.LIZIZ
            goto L37
        L54:
            if (r12 != r5) goto L94
            float r1 = r11.LIZLLL
            float r0 = r9.LIZLLL
            goto L37
        L5b:
            if (r12 != r2) goto L62
            float r7 = r10.LIZ
            float r0 = r9.LIZJ
            goto L2a
        L62:
            if (r12 != r4) goto L69
            float r7 = r9.LIZIZ
            float r0 = r10.LIZLLL
            goto L2a
        L69:
            if (r12 != r5) goto L9d
            float r7 = r10.LIZIZ
            float r0 = r9.LIZLLL
            goto L2a
        L70:
            if (r12 != r2) goto L7b
            float r1 = r9.LIZJ
            float r0 = r11.LIZ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L44
            goto L20
        L7b:
            if (r12 != r4) goto L86
            float r1 = r9.LIZIZ
            float r0 = r11.LIZLLL
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L44
            goto L20
        L86:
            if (r12 != r5) goto La6
            float r1 = r9.LIZLLL
            float r0 = r11.LIZIZ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L44
            goto L20
        L91:
            r0 = 0
            goto L11
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3.toString()
            r0.<init>(r3)
            throw r0
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3.toString()
            r0.<init>(r3)
            throw r0
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20059913eH.LIZ(X.0ttv, X.0ttv, X.0ttv, int):boolean");
    }

    public static final boolean LJFF(int i, FocusTargetNode focusTargetNode, C1683130ttv c1683130ttv, Function1 function1) {
        if (LJIIIZ(i, focusTargetNode, c1683130ttv, function1)) {
            return true;
        }
        C20045513bx c20045513bxLJII = C20052513d5.LJI(focusTargetNode).getFocusOwner().LJII();
        c20045513bxLJII.getClass();
        Boolean bool = (Boolean) C1697410uGx.LIZ(focusTargetNode, i, new AwS5S0501000_30(c20045513bxLJII, C20052513d5.LJI(focusTargetNode).getFocusOwner().LIZJ(), focusTargetNode, c1683130ttv, i, function1, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LJI(C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2, C1683130ttv c1683130ttv3, int i) {
        if (LJII(i, c1683130ttv, c1683130ttv3)) {
            if (LJII(i, c1683130ttv2, c1683130ttv3) && !LIZ(c1683130ttv3, c1683130ttv, c1683130ttv2, i)) {
                if (!LIZ(c1683130ttv3, c1683130ttv2, c1683130ttv, i) && LJIIIIZZ(i, c1683130ttv3, c1683130ttv) < LJIIIIZZ(i, c1683130ttv3, c1683130ttv2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(int i, FocusTargetNode focusTargetNode, C1683130ttv c1683130ttv, Function1 function1) {
        FocusTargetNode focusTargetNodeLIZLLL;
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
            int i2 = c19968013Aw2.LLILLL;
            if (i2 == 0) {
                break;
            }
            AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw2.LJIILIIL(i2 - 1);
            if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                C20052513d5.LIZ(c19968013Aw2, abstractC20055413dYLIZIZ);
            } else {
                while (true) {
                    if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                        C19968013Aw c19968013Aw3 = null;
                        do {
                            if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                if (abstractC20055413dYLIZIZ.LLJILLL) {
                                    c19968013Aw.LIZLLL(abstractC20055413dYLIZIZ);
                                }
                            } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                int i3 = 0;
                                for (AbstractC20055413dY abstractC20055413dY3 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY3 != null; abstractC20055413dY3 = abstractC20055413dY3.LLILZLL) {
                                    if ((abstractC20055413dY3.LLILLL & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        while (c19968013Aw.LLILLL != 0 && (focusTargetNodeLIZLLL = LIZLLL(c19968013Aw, c1683130ttv, i)) != null) {
            if (focusTargetNodeLIZLLL.LLJJI().LIZ) {
                return ((Boolean) function1.invoke(focusTargetNodeLIZLLL)).booleanValue();
            }
            if (LJFF(i, focusTargetNodeLIZLLL, c1683130ttv, function1)) {
                return true;
            }
            c19968013Aw.LJIIL(focusTargetNodeLIZLLL);
        }
        return false;
    }

    public static final Boolean LJIIJ(int i, FocusTargetNode focusTargetNode, C1683130ttv c1683130ttv, AwS239S0300000_30 awS239S0300000_30) {
        EnumC20061113eT enumC20061113eTLLJJIII = focusTargetNode.LJJJ();
        int[] iArr = C20061313eV.LIZ;
        int i2 = iArr[enumC20061113eTLLJJIII.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (focusTargetNode.LLJJI().LIZ) {
                        return (Boolean) awS239S0300000_30.invoke(focusTargetNode);
                    }
                    if (c1683130ttv == null) {
                        return Boolean.valueOf(LJ(focusTargetNode, i, awS239S0300000_30));
                    }
                    return Boolean.valueOf(LJIIIZ(i, focusTargetNode, c1683130ttv, awS239S0300000_30));
                }
                throw new C1954807lC();
            }
            return Boolean.valueOf(LJ(focusTargetNode, i, awS239S0300000_30));
        }
        FocusTargetNode focusTargetNodeLIZJ = C20059613eE.LIZJ(focusTargetNode);
        if (focusTargetNodeLIZJ != null) {
            int i3 = iArr[focusTargetNodeLIZJ.LJJJ().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new C1954807lC();
                    }
                    "ActiveParent must have a focusedChild".toString();
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                if (c1683130ttv == null) {
                    c1683130ttv = C20059613eE.LIZIZ(focusTargetNodeLIZJ);
                }
                return Boolean.valueOf(LJFF(i, focusTargetNode, c1683130ttv, awS239S0300000_30));
            }
            Boolean boolLJIIJ = LJIIJ(i, focusTargetNodeLIZJ, c1683130ttv, awS239S0300000_30);
            if (!Intrinsics.LJFF(boolLJIIJ, Boolean.FALSE)) {
                return boolLJIIJ;
            }
            if (c1683130ttv == null) {
                if (focusTargetNodeLIZJ.LJJJ() == EnumC20061113eT.ActiveParent) {
                    FocusTargetNode focusTargetNodeLIZ = C20059613eE.LIZ(focusTargetNodeLIZJ);
                    if (focusTargetNodeLIZ != null) {
                        c1683130ttv = C20059613eE.LIZIZ(focusTargetNodeLIZ);
                    } else {
                        "ActiveParent must have a focusedChild".toString();
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                } else {
                    "Searching for active node in inactive hierarchy".toString();
                    throw new IllegalStateException("Searching for active node in inactive hierarchy");
                }
            }
            return Boolean.valueOf(LJFF(i, focusTargetNode, c1683130ttv, awS239S0300000_30));
        }
        "ActiveParent must have a focusedChild".toString();
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
