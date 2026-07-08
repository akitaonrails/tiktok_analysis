package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20050913cp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.13dY] */
    public static final <T extends InterfaceC1697480uH4> T LIZ(T t) {
        C20054913dT c20054913dT;
        if (!t.LJIJJ().LLJILLL) {
            C1696250uF5.LIZIZ("visitAncestors called on an unattached node");
        }
        AbstractC20055413dY abstractC20055413dY = t.LJIJJ().LLILZIL;
        C20053713dH c20053713dHLJFF = C20052513d5.LJFF(t);
        while (c20053713dHLJFF != null) {
            if ((c20053713dHLJFF.LLJLLIL.LJ.LLILZ & 262144) != 0) {
                while (abstractC20055413dY != null) {
                    if ((abstractC20055413dY.LLILLL & 262144) != 0) {
                        ?? LIZIZ = abstractC20055413dY;
                        ?? c19968013Aw = 0;
                        do {
                            if (LIZIZ instanceof InterfaceC1697480uH4) {
                                T t2 = (T) LIZIZ;
                                if (Intrinsics.LJFF(t.LJJIJLIJ(), t2.LJJIJLIJ()) && C20051013cq.LIZ(t, t2)) {
                                    return t2;
                                }
                            } else if ((LIZIZ.LLILLL & 262144) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                int i = 0;
                                c19968013Aw = c19968013Aw;
                                LIZIZ = LIZIZ;
                                while (abstractC20055413dY2 != null) {
                                    if ((abstractC20055413dY2.LLILLL & 262144) != 0) {
                                        i++;
                                        c19968013Aw = c19968013Aw;
                                        if (i == 1) {
                                            LIZIZ = abstractC20055413dY2;
                                        } else {
                                            if (c19968013Aw == 0) {
                                                c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                            }
                                            if (LIZIZ != 0) {
                                                c19968013Aw.LIZLLL(LIZIZ);
                                                LIZIZ = 0;
                                            }
                                            c19968013Aw.LIZLLL(abstractC20055413dY2);
                                        }
                                    }
                                    abstractC20055413dY2 = abstractC20055413dY2.LLILZLL;
                                    c19968013Aw = c19968013Aw;
                                    LIZIZ = LIZIZ;
                                }
                                if (i == 1) {
                                }
                            }
                            LIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                        } while (LIZIZ != 0);
                    }
                    abstractC20055413dY = abstractC20055413dY.LLILZIL;
                }
            }
            c20053713dHLJFF = c20053713dHLJFF.LJJIJIL();
            if (c20053713dHLJFF != null && (c20054913dT = c20053713dHLJFF.LLJLLIL) != null) {
                abstractC20055413dY = c20054913dT.LIZLLL;
            } else {
                abstractC20055413dY = null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13dY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends X.InterfaceC1697480uH4> void LIZIZ(T r10, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r11) {
        /*
            X.13dY r0 = r10.LJIJJ()
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto Ld
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        Ld:
            X.13dY r0 = r10.LJIJJ()
            X.13dY r5 = r0.LLILZIL
            X.13dH r4 = X.C20052513d5.LJFF(r10)
        L17:
            if (r4 == 0) goto La7
        L19:
            X.13dT r0 = r4.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r9 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r9
            r8 = 0
            if (r0 == 0) goto L96
        L25:
            if (r5 == 0) goto L96
            int r0 = r5.LLILLL
            r0 = r0 & r9
            if (r0 == 0) goto L93
            r6 = r5
            r3 = r8
        L2e:
            boolean r0 = r6 instanceof X.InterfaceC1697480uH4
            r7 = 1
            if (r0 == 0) goto L56
            X.0uH4 r6 = (X.InterfaceC1697480uH4) r6
            java.lang.Object r1 = r10.LJJIJLIJ()
            java.lang.Object r0 = r6.LJJIJLIJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L89
            boolean r0 = X.C20051013cq.LIZ(r10, r6)
            if (r0 == 0) goto L89
            java.lang.Object r0 = r11.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L89
            return
        L56:
            int r0 = r6.LLILLL
            r0 = r0 & r9
            if (r0 == 0) goto L89
            boolean r0 = r6 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L89
            r0 = r6
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L65:
            if (r2 == 0) goto L8e
            int r0 = r2.LLILLL
            r0 = r0 & r9
            if (r0 == 0) goto L71
            int r1 = r1 + 1
            if (r1 != r7) goto L74
            r6 = r2
        L71:
            X.13dY r2 = r2.LLILZLL
            goto L65
        L74:
            if (r3 != 0) goto L7f
            X.13Aw r3 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r3.<init>(r0)
        L7f:
            if (r6 == 0) goto L85
            r3.LIZLLL(r6)
            r6 = r8
        L85:
            r3.LIZLLL(r2)
            goto L71
        L89:
            X.13dY r6 = X.C20052513d5.LIZIZ(r3)
            goto L90
        L8e:
            if (r1 != r7) goto L89
        L90:
            if (r6 == 0) goto L93
            goto L2e
        L93:
            X.13dY r5 = r5.LLILZIL
            goto L25
        L96:
            X.13dH r4 = r4.LJJIJIL()
            if (r4 == 0) goto La7
            X.13dT r0 = r4.LLJLLIL
            if (r0 == 0) goto La4
            X.13dE r5 = r0.LIZLLL
            goto L19
        La4:
            r5 = r8
            goto L17
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20050913cp.LIZIZ(X.0uH4, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.13dY] */
    public static final <T extends InterfaceC1697480uH4> void LIZJ(T t, Function1<? super T, ? extends EnumC20045413bw> function1) {
        EnumC20045413bw enumC20045413bwInvoke;
        if (!t.LJIJJ().LLJILLL) {
            C1696250uF5.LIZIZ("visitSubtreeIf called on an unattached node");
        }
        C19968013Aw c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
        AbstractC20055413dY abstractC20055413dY = t.LJIJJ().LLILZLL;
        if (abstractC20055413dY == null) {
            C20052513d5.LIZ(c19968013Aw, t.LJIJJ());
        } else {
            c19968013Aw.LIZLLL(abstractC20055413dY);
        }
        while (true) {
            int i = c19968013Aw.LLILLL;
            if (i != 0) {
                AbstractC20055413dY abstractC20055413dY2 = (AbstractC20055413dY) c19968013Aw.LJIILIIL(i - 1);
                if ((abstractC20055413dY2.LLILZ & 262144) != 0) {
                    AbstractC20055413dY abstractC20055413dY3 = abstractC20055413dY2;
                    do {
                        if ((abstractC20055413dY3.LLILLL & 262144) != 0) {
                            ?? LIZIZ = abstractC20055413dY3;
                            ?? c19968013Aw2 = 0;
                            do {
                                if (LIZIZ instanceof InterfaceC1697480uH4) {
                                    InterfaceC1697480uH4 interfaceC1697480uH4 = (InterfaceC1697480uH4) LIZIZ;
                                    if (Intrinsics.LJFF(t.LJJIJLIJ(), interfaceC1697480uH4.LJJIJLIJ()) && C20051013cq.LIZ(t, interfaceC1697480uH4)) {
                                        enumC20045413bwInvoke = function1.invoke(interfaceC1697480uH4);
                                    } else {
                                        enumC20045413bwInvoke = EnumC20045413bw.ContinueTraversal;
                                    }
                                    if (enumC20045413bwInvoke == EnumC20045413bw.CancelTraversal) {
                                        return;
                                    }
                                    if (enumC20045413bwInvoke == EnumC20045413bw.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else if ((LIZIZ.LLILLL & 262144) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                    AbstractC20055413dY abstractC20055413dY4 = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                    int i2 = 0;
                                    c19968013Aw2 = c19968013Aw2;
                                    LIZIZ = LIZIZ;
                                    while (abstractC20055413dY4 != null) {
                                        if ((abstractC20055413dY4.LLILLL & 262144) != 0) {
                                            i2++;
                                            c19968013Aw2 = c19968013Aw2;
                                            if (i2 == 1) {
                                                LIZIZ = abstractC20055413dY4;
                                            } else {
                                                if (c19968013Aw2 == 0) {
                                                    c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                                                }
                                                if (LIZIZ != 0) {
                                                    c19968013Aw2.LIZLLL(LIZIZ);
                                                    LIZIZ = 0;
                                                }
                                                c19968013Aw2.LIZLLL(abstractC20055413dY4);
                                            }
                                        }
                                        abstractC20055413dY4 = abstractC20055413dY4.LLILZLL;
                                        c19968013Aw2 = c19968013Aw2;
                                        LIZIZ = LIZIZ;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                LIZIZ = C20052513d5.LIZIZ(c19968013Aw2);
                            } while (LIZIZ != 0);
                        }
                        abstractC20055413dY3 = abstractC20055413dY3.LLILZLL;
                    } while (abstractC20055413dY3 != null);
                }
                C20052513d5.LIZ(c19968013Aw, abstractC20055413dY2);
            } else {
                return;
            }
        }
    }
}
