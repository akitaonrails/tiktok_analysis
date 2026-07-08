package X;

import androidx.compose.ui.focus.FocusTargetNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20060113eJ {
    public static final boolean LIZIZ(FocusTargetNode focusTargetNode) {
        int i = C20061013eS.LIZ[focusTargetNode.LJJJ().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            return false;
        }
        C20052513d5.LJI(focusTargetNode).getFocusOwner().LJIILL();
        focusTargetNode.LLJJ(EnumC20061113eT.Captured, EnumC20061113eT.Active);
        return true;
    }

    public static final void LIZJ(FocusTargetNode focusTargetNode) {
        C20060813eQ.LIZ(focusTargetNode, new AwS574S0100000_30(focusTargetNode, 406));
        int i = C20061013eS.LIZ[focusTargetNode.LJJJ().ordinal()];
        if (i != 3 && i != 4) {
            return;
        }
        C20052513d5.LJI(focusTargetNode).getFocusOwner().LJIILIIL(focusTargetNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x014c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(androidx.compose.ui.focus.FocusTargetNode r15) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060113eJ.LJI(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final FocusTargetNode LJII(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeLIZJ = C20059613eE.LIZJ(focusTargetNode);
        if (focusTargetNodeLIZJ != null) {
            return focusTargetNodeLIZJ;
        }
        "ActiveParent with no focused child".toString();
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:18:0x0033, B:22:0x005c, B:24:0x0062, B:25:0x0065), top: B:36:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC20060613eO LIZLLL(androidx.compose.ui.focus.FocusTargetNode r7, int r8) {
        /*
            X.13eT r0 = r7.LJJJ()
            int[] r1 = X.C20061013eS.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r2 = 1
            if (r1 == r2) goto L75
            r0 = 2
            if (r1 == r0) goto L72
            r0 = 3
            if (r1 == r0) goto L1e
            r0 = 4
            if (r1 == r0) goto L75
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L1e:
            androidx.compose.ui.focus.FocusTargetNode r0 = LJII(r7)
            X.13eO r1 = LIZLLL(r0, r8)
            X.13eO r0 = X.EnumC20060613eO.None
            r6 = 0
            if (r1 == r0) goto L2d
            if (r1 != 0) goto L77
        L2d:
            boolean r1 = r7.LLJJIII
            if (r1 != 0) goto L71
            r7.LLJJIII = r2
            X.13eP r5 = r7.LLJJI()     // Catch: java.lang.Throwable -> L68
            X.13em r4 = new X.13em     // Catch: java.lang.Throwable -> L68
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L68
            X.C20059713eF.LIZ(r7)     // Catch: java.lang.Throwable -> L68
            X.13dU r1 = X.C20052513d5.LJI(r7)     // Catch: java.lang.Throwable -> L68
            X.13eL r2 = r1.getFocusOwner()     // Catch: java.lang.Throwable -> L68
            androidx.compose.ui.focus.FocusTargetNode r3 = r2.LIZJ()     // Catch: java.lang.Throwable -> L68
            kotlin.jvm.functions.Function1<? super X.13f1, kotlin.Unit> r1 = r5.LJIIJ     // Catch: java.lang.Throwable -> L68
            r1.invoke(r4)     // Catch: java.lang.Throwable -> L68
            androidx.compose.ui.focus.FocusTargetNode r2 = r2.LIZJ()     // Catch: java.lang.Throwable -> L68
            boolean r1 = r4.LIZIZ     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L65
            if (r3 == r2) goto L6f
            if (r2 == 0) goto L6f
            X.13eK r1 = X.C20060213eK.LIZLLL     // Catch: java.lang.Throwable -> L68
            X.13eK r0 = X.C20060213eK.LIZJ     // Catch: java.lang.Throwable -> L68
            if (r1 == r0) goto L65
            X.13eO r0 = X.EnumC20060613eO.Redirected     // Catch: java.lang.Throwable -> L68
            goto L6f
        L65:
            X.13eO r0 = X.EnumC20060613eO.Cancelled     // Catch: java.lang.Throwable -> L68
            goto L6f
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L68
            r7.LLJJIII = r6
            throw r0
        L6f:
            r7.LLJJIII = r6
        L71:
            return r0
        L72:
            X.13eO r1 = X.EnumC20060613eO.Cancelled
            return r1
        L75:
            X.13eO r1 = X.EnumC20060613eO.None
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060113eJ.LIZLLL(androidx.compose.ui.focus.FocusTargetNode, int):X.13eO");
    }

    public static final EnumC20060613eO LJ(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.LLJJIJI) {
            focusTargetNode.LLJJIJI = true;
            try {
                C20060713eP c20060713ePLLJJI = focusTargetNode.LLJJI();
                C20063013em c20063013em = new C20063013em(i);
                C20059713eF.LIZ(focusTargetNode);
                InterfaceC20060313eL focusOwner = C20052513d5.LJI(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeLIZJ = focusOwner.LIZJ();
                c20060713ePLLJJI.LJIIIZ.invoke(c20063013em);
                FocusTargetNode focusTargetNodeLIZJ2 = focusOwner.LIZJ();
                if (c20063013em.LIZIZ) {
                    EnumC20060613eO enumC20060613eO = EnumC20060613eO.Cancelled;
                    focusTargetNode.LLJJIJI = false;
                    return enumC20060613eO;
                }
                if (focusTargetNodeLIZJ != focusTargetNodeLIZJ2 && focusTargetNodeLIZJ2 != null) {
                    if (C20060213eK.LIZLLL == C20060213eK.LIZJ) {
                        EnumC20060613eO enumC20060613eO2 = EnumC20060613eO.Cancelled;
                        focusTargetNode.LLJJIJI = false;
                        return enumC20060613eO2;
                    }
                    EnumC20060613eO enumC20060613eO3 = EnumC20060613eO.Redirected;
                    focusTargetNode.LLJJIJI = false;
                    return enumC20060613eO3;
                }
                focusTargetNode.LLJJIJI = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                focusTargetNode.LLJJIJI = false;
                throw th;
            }
        }
        return EnumC20060613eO.None;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b A[PHI: r10
      0x007b: PHI (r10v2 X.13Aw) = (r10v1 X.13Aw), (r10v1 X.13Aw), (r10v4 X.13Aw) binds: [B:25:0x004a, B:27:0x004e, B:42:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[LOOP:2: B:22:0x0042->B:94:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC20060613eO LJFF(androidx.compose.ui.focus.FocusTargetNode r11, int r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060113eJ.LJFF(androidx.compose.ui.focus.FocusTargetNode, int):X.13eO");
    }

    public static final boolean LIZ(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = C20061013eS.LIZ[focusTargetNode.LJJJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    FocusTargetNode focusTargetNodeLIZJ = C20059613eE.LIZJ(focusTargetNode);
                    if (focusTargetNodeLIZJ != null && !LIZ(focusTargetNodeLIZJ, z, z2)) {
                        return false;
                    }
                    if (z2) {
                        focusTargetNode.LLJJ(EnumC20061113eT.ActiveParent, EnumC20061113eT.Inactive);
                    }
                }
            } else {
                if (z) {
                    C20052513d5.LJI(focusTargetNode).getFocusOwner().LJIILIIL(null);
                    if (z2) {
                        focusTargetNode.LLJJ(EnumC20061113eT.Captured, EnumC20061113eT.Inactive);
                        return z;
                    }
                    return z;
                }
                return z;
            }
        } else {
            C20052513d5.LJI(focusTargetNode).getFocusOwner().LJIILIIL(null);
            if (z2) {
                focusTargetNode.LLJJ(EnumC20061113eT.Active, EnumC20061113eT.Inactive);
            }
        }
        return true;
    }
}
