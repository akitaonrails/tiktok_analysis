package X;

import X.AbstractC20055413dY;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS136S0101000_30;
import kotlin.jvm.internal.AwS42S0001000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13eI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20060013eI implements InterfaceC20060313eL {
    public final Function2<C20071313g7, C1683130ttv, Boolean> LIZ;
    public final Function1<C20071313g7, Boolean> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<C1683130ttv> LIZLLL;
    public final Function0<EnumC1671200tag> LJ;
    public final C20051213cs LJI;
    public C13LA LJIIIZ;
    public FocusTargetNode LJIIJJI;
    public boolean LJIIL;
    public final FocusTargetNode LJFF = new FocusTargetNode(2, null, 6);
    public final C20045513bx LJII = new Object() { // from class: X.13bx
        {
            C19992013Kc.LIZIZ();
        }
    };
    public final FocusOwnerImpl$modifier$1 LJIIIIZZ = new AbstractC1685820tyG<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // X.AbstractC1685820tyG
        public final AbstractC20055413dY LJIJI() {
            return this.LIZIZ.LJFF;
        }

        public final int hashCode() {
            return this.LIZIZ.LJFF.hashCode();
        }

        @Override // X.AbstractC1685820tyG
        public final /* bridge */ /* synthetic */ void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        }
    };
    public final C13B1<InterfaceC20062513eh> LJIIJ = new C13B1<>(1);

    @Override // X.InterfaceC20060313eL
    public final boolean LJIILJJIL() {
        return this.LIZ.invoke(null, null).booleanValue();
    }

    @Override // X.InterfaceC20060313eL
    public final void LJIILL() {
        this.LJIIL = false;
    }

    @Override // X.InterfaceC20060313eL
    public final void LJIIIIZZ() {
        C20051213cs c20051213cs = this.LJI;
        if (c20051213cs.LJIIJ) {
            return;
        }
        c20051213cs.LIZ.invoke(new C20051313ct(c20051213cs));
        c20051213cs.LJIIJ = true;
    }

    @Override // X.InterfaceC20060313eL
    public final EnumC20061113eT LJIIJJI() {
        return this.LJFF.LJJJ();
    }

    @Override // X.InterfaceC20060313eL
    public final C1683130ttv LJIJ() {
        FocusTargetNode focusTargetNodeLIZ = C20059613eE.LIZ(this.LJFF);
        if (focusTargetNodeLIZ != null) {
            return C20059613eE.LIZIZ(focusTargetNodeLIZ);
        }
        return null;
    }

    @Override // X.InterfaceC20060313eL
    public final void LJIJI() {
        C20060113eJ.LIZ(this.LJFF, true, true);
    }

    @Override // X.InterfaceC20060313eL
    public final C13B1<InterfaceC20062513eh> LIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC20060313eL
    public final FocusTargetNode LIZJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC20060313eL
    public final boolean LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC20060313eL
    public final C20045513bx LJII() {
        return this.LJII;
    }

    @Override // X.InterfaceC20060313eL
    public final FocusOwnerImpl$modifier$1 LJIIL() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ef A[EDGE_INSN: B:166:0x01ef->B:163:0x01ef BREAK  A[LOOP:0: B:12:0x0031->B:93:0x011c, LOOP_LABEL: LOOP:0: B:12:0x0031->B:93:0x011c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[LOOP:3: B:19:0x0045->B:173:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff A[PHI: r3
      0x00ff: PHI (r3v14 X.13Aw) = (r3v1 X.13Aw), (r3v1 X.13Aw), (r3v16 X.13Aw) binds: [B:67:0x00d1, B:69:0x00d5, B:84:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.13dY] */
    @Override // X.InterfaceC20060313eL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060013eI.LIZIZ(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Boolean] */
    @Override // X.InterfaceC1686540tzQ
    public final boolean LJFF(int i) {
        Boolean boolLJ;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = Boolean.FALSE;
        getClass();
        FocusTargetNode focusTargetNode = this.LJIIJJI;
        Boolean boolLJ2 = LJ(i, this.LIZLLL.invoke(), new AwS136S0101000_30(i, c259800zU, 0));
        getClass();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLJ2, bool) && focusTargetNode != this.LJIIJJI) {
            return true;
        }
        if (boolLJ2 == null || c259800zU.element == 0) {
            return false;
        }
        if (Intrinsics.LJFF(boolLJ2, bool) && Intrinsics.LJFF(c259800zU.element, bool)) {
            return true;
        }
        if (C20063113en.LIZ(i)) {
            if (LJI(i, false, false) && (boolLJ = LJ(i, null, new AwS42S0001000_30(i, 6))) != null && boolLJ.booleanValue()) {
                return true;
            }
            return false;
        }
        return this.LIZIZ.invoke(new C20071313g7(i)).booleanValue();
    }

    @Override // X.InterfaceC20060313eL
    public final void LJIIIZ(FocusTargetNode focusTargetNode) {
        C20051213cs c20051213cs = this.LJI;
        c20051213cs.getClass();
        if (c20051213cs.LJ.LIZLLL(focusTargetNode) && !c20051213cs.LJIIJ) {
            c20051213cs.LIZ.invoke(new C20051313ct(c20051213cs));
            c20051213cs.LJIIJ = true;
        }
    }

    @Override // X.InterfaceC20060313eL
    public final void LJIILIIL(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.LJIIJJI;
        this.LJIIJJI = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            this.LJIIL = false;
        }
        C13B1<InterfaceC20062513eh> c13b1 = this.LJIIJ;
        Object[] objArr = c13b1.LIZ;
        int i = c13b1.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC20062513eh) objArr[i2]).LIZ(focusTargetNode2, focusTargetNode);
        }
    }

    @Override // X.InterfaceC20060313eL
    public final void LJIILLIIL(InterfaceC20051413cu interfaceC20051413cu) {
        C20051213cs c20051213cs = this.LJI;
        c20051213cs.getClass();
        if (c20051213cs.LJFF.LIZLLL(interfaceC20051413cu) && !c20051213cs.LJIIJ) {
            c20051213cs.LIZ.invoke(new C20051313ct(c20051213cs));
            c20051213cs.LJIIJ = true;
        }
    }

    @Override // X.InterfaceC1686540tzQ
    public final void LJIJJ(boolean z) {
        LJI(8, z, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(boolean r10) {
        /*
            r9 = this;
            androidx.compose.ui.focus.FocusTargetNode r2 = r9.LJIIJJI
            r6 = 1
            if (r2 != 0) goto L6
            return r6
        L6:
            boolean r1 = r9.LJIIL
            r0 = 0
            if (r1 == 0) goto Le
            if (r10 != 0) goto Le
            return r0
        Le:
            r7 = 0
            r9.LJIILIIL(r7)
            boolean r0 = r9.LJIIL
            if (r0 == 0) goto La4
            X.13eT r1 = X.EnumC20061113eT.Captured
        L18:
            X.13eT r0 = X.EnumC20061113eT.Inactive
            r2.LLJJ(r1, r0)
            X.13dY r0 = r2.LL
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto L28
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        L28:
            X.13dY r0 = r2.LL
            X.13dY r8 = r0.LLILZIL
            X.13dH r5 = X.C20052513d5.LJFF(r2)
        L30:
            if (r5 == 0) goto La8
        L32:
            X.13dT r0 = r5.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L95
        L3c:
            if (r8 == 0) goto L95
            int r0 = r8.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L92
            r4 = r7
            r3 = r8
        L46:
            boolean r0 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r0 == 0) goto L5a
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            X.13eT r1 = X.EnumC20061113eT.ActiveParent
            X.13eT r0 = X.EnumC20061113eT.Inactive
            r3.LLJJ(r1, r0)
        L53:
            X.13dY r3 = X.C20052513d5.LIZIZ(r4)
        L57:
            if (r3 == 0) goto L92
            goto L46
        L5a:
            int r0 = r3.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L53
            boolean r0 = r3 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L53
            r0 = r3
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L6a:
            if (r2 == 0) goto L8f
            int r0 = r2.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L77
            int r1 = r1 + 1
            if (r1 != r6) goto L7a
            r3 = r2
        L77:
            X.13dY r2 = r2.LLILZLL
            goto L6a
        L7a:
            if (r4 != 0) goto L85
            X.13Aw r4 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r4.<init>(r0)
        L85:
            if (r3 == 0) goto L8b
            r4.LIZLLL(r3)
            r3 = r7
        L8b:
            r4.LIZLLL(r2)
            goto L77
        L8f:
            if (r1 != r6) goto L53
            goto L57
        L92:
            X.13dY r8 = r8.LLILZIL
            goto L3c
        L95:
            X.13dH r5 = r5.LJJIJIL()
            if (r5 == 0) goto La8
            X.13dT r0 = r5.LLJLLIL
            if (r0 == 0) goto La2
            X.13dE r8 = r0.LIZLLL
            goto L32
        La2:
            r8 = r7
            goto L30
        La4:
            X.13eT r1 = X.EnumC20061113eT.Active
            goto L18
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060013eI.LJIJJLI(boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        r14 = r8.LIZIZ(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r8.LJ != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (((r8.LIZ[r14 >> 3] >> ((r14 & 7) << 3)) & 255) == 254) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r7 = r8.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r7 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (java.lang.Long.compare((((long) r8.LIZLLL) * 32) ^ Long.MIN_VALUE, (((long) r7) * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r7 = r8.LIZ;
        r12 = r8.LIZJ;
        r9 = r8.LIZIZ;
        r10 = (r12 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        if (r6 >= r10) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        r2 = r7[r6] & (-9187201950435737472L);
        r7[r6] = ((~r2) + (r2 >>> 7)) & (-72340172838076674L);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r10 = r7.length - 1;
        r6 = r10 - 1;
        r18 = 72057594037927935L;
        r7[r6] = (r7[r6] & 72057594037927935L) | (-72057594037927936L);
        r7[r10] = r7[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        if (r6 == r12) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
    
        r23 = r6 >> 3;
        r22 = (r6 & 7) << 3;
        r10 = (r7[r23] >> r22) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        if (r10 == 128) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0127, code lost:
    
        if (r10 != 254) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0129, code lost:
    
        r3 = X.C786410Ut5.Y2(r9[r6]) * (-862048943);
        r3 = r3 ^ (r3 << 16);
        r2 = r3 >>> 7;
        r21 = r8.LIZIZ(r2);
        r2 = r2 & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0145, code lost:
    
        if ((((r21 - r2) & r12) / 8) != (((r6 - r2) & r12) / 8)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        r7[r23] = ((~(255 << r22)) & r7[r23]) | (((long) (r3 & 127)) << r22);
        r7[r7.length - 1] = (r7[0] & r18) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0161, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
    
        r20 = r21 >> 3;
        r18 = r7[r20];
        r15 = (r21 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0173, code lost:
    
        if (((r18 >> r15) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0175, code lost:
    
        r7[r20] = (((long) (r3 & 127)) << r15) | ((~(255 << r15)) & r18);
        r7[r23] = (r7[r23] & (~(255 << r22))) | (128 << r22);
        r9[r21] = r9[r6];
        r9[r6] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0194, code lost:
    
        r18 = 72057594037927935L;
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a9, code lost:
    
        r7[r20] = (((long) (r3 & 127)) << r15) | ((~(255 << r15)) & r18);
        r2 = r9[r21];
        r9[r21] = r9[r6];
        r9[r6] = r2;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c0, code lost:
    
        r0 = X.C19992013Kc.LIZJ(r8.LIZJ);
        r15 = r8.LIZ;
        r14 = r8.LIZIZ;
        r13 = r8.LIZJ;
        r8.LIZJ(r0);
        r12 = r8.LIZ;
        r11 = r8.LIZIZ;
        r10 = r8.LIZJ;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d6, code lost:
    
        if (r9 >= r13) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e6, code lost:
    
        if (((r15[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e8, code lost:
    
        r23 = r14[r9];
        r1 = X.C786410Ut5.Y2(r23) * (-862048943);
        r1 = r1 ^ (r1 << 16);
        r22 = r8.LIZIZ(r1 >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = ((~(255 << r20)) & r12[r21]) | (((long) (r1 & 127)) << r20);
        r12[r21] = r0;
        r12[(((r22 - 7) & r10) + (r10 & 7)) >> 3] = r0;
        r11[r22] = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021a, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b7, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02c0, code lost:
    
        r8.LJ = X.C19992013Kc.LIZ(r8.LIZJ) - r8.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02cb, code lost:
    
        r14 = r8.LIZIZ(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d1, code lost:
    
        r8.LIZLLL++;
        r9 = r8.LJ;
        r3 = r8.LIZ;
        r13 = r14 >> 3;
        r11 = r3[r13];
        r10 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02ea, code lost:
    
        if (((r11 >> r10) & 255) != 128) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02ec, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ed, code lost:
    
        r8.LJ = r9 - r0;
        r2 = r8.LIZJ;
        r11 = (r11 & (~(255 << r10))) | (r0 << r10);
        r3[r13] = r11;
        r3[(((r14 - 7) & r2) + (r2 & 7)) >> 3] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030b, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL(android.view.KeyEvent r32) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060013eI.LJIL(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0157, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01e8, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a A[Catch: all -> 0x032e, PHI: r1
      0x014a: PHI (r1v3 ??) = (r1v2 ??), (r1v2 ??), (r1v5 ??) binds: [B:95:0x011b, B:97:0x011f, B:112:0x014f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x032e, blocks: (B:3:0x0005, B:5:0x000f, B:8:0x001a, B:12:0x0024, B:15:0x0032, B:17:0x0038, B:18:0x003d, B:20:0x0045, B:22:0x004a, B:24:0x0050, B:27:0x0055, B:122:0x0164, B:124:0x016a, B:125:0x016d, B:127:0x0178, B:130:0x0184, B:133:0x018c, B:154:0x01c6, B:155:0x01cb, B:156:0x01ce, B:137:0x0193, B:139:0x0199, B:141:0x019d, B:143:0x01a5, B:145:0x01ab, B:149:0x01b3, B:151:0x01bc, B:152:0x01c0, B:153:0x01c3, B:160:0x01d8, B:161:0x01db, B:163:0x01e1, B:165:0x01e5, B:168:0x01ec, B:170:0x01f4, B:177:0x020b, B:178:0x0219, B:180:0x021d, B:182:0x0221, B:209:0x0275, B:185:0x022a, B:187:0x0233, B:189:0x0237, B:191:0x023e, B:193:0x0244, B:205:0x026d, B:196:0x0249, B:198:0x024f, B:199:0x0256, B:201:0x025e, B:202:0x0263, B:204:0x0269, B:206:0x026f, B:212:0x0284, B:216:0x0294, B:217:0x02a2, B:219:0x02a6, B:221:0x02aa, B:248:0x02fe, B:224:0x02b3, B:226:0x02bc, B:228:0x02c0, B:230:0x02c7, B:232:0x02cd, B:244:0x02f6, B:235:0x02d2, B:237:0x02d8, B:238:0x02df, B:240:0x02e7, B:241:0x02ec, B:243:0x02f2, B:245:0x02f8, B:252:0x030f, B:254:0x0316, B:257:0x0323, B:29:0x005a, B:31:0x0060, B:32:0x0063, B:40:0x0078, B:35:0x006c, B:37:0x0072, B:39:0x0076, B:43:0x0084, B:46:0x008c, B:48:0x0090, B:50:0x0096, B:52:0x009a, B:54:0x00a2, B:56:0x00a8, B:60:0x00b0, B:62:0x00b9, B:63:0x00bd, B:64:0x00c0, B:65:0x00c3, B:72:0x00d3, B:74:0x00d7, B:69:0x00cd, B:75:0x00dd, B:77:0x00e5, B:78:0x00e8, B:86:0x00ff, B:81:0x00f3, B:83:0x00f9, B:85:0x00fd, B:89:0x010b, B:92:0x0113, B:94:0x0117, B:96:0x011d, B:98:0x0121, B:100:0x0129, B:102:0x012f, B:106:0x0137, B:108:0x0140, B:109:0x0144, B:110:0x0147, B:111:0x014a, B:118:0x015a, B:120:0x015e, B:115:0x0154), top: B:266:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0153 A[LOOP:20: B:92:0x0113->B:114:0x0153, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164 A[Catch: all -> 0x032e, PHI: r2
      0x0164: PHI (r2v6 X.13dY) = (r2v5 X.13dY), (r2v15 X.13dY) binds: [B:121:0x0162, B:28:0x0058] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x032e, blocks: (B:3:0x0005, B:5:0x000f, B:8:0x001a, B:12:0x0024, B:15:0x0032, B:17:0x0038, B:18:0x003d, B:20:0x0045, B:22:0x004a, B:24:0x0050, B:27:0x0055, B:122:0x0164, B:124:0x016a, B:125:0x016d, B:127:0x0178, B:130:0x0184, B:133:0x018c, B:154:0x01c6, B:155:0x01cb, B:156:0x01ce, B:137:0x0193, B:139:0x0199, B:141:0x019d, B:143:0x01a5, B:145:0x01ab, B:149:0x01b3, B:151:0x01bc, B:152:0x01c0, B:153:0x01c3, B:160:0x01d8, B:161:0x01db, B:163:0x01e1, B:165:0x01e5, B:168:0x01ec, B:170:0x01f4, B:177:0x020b, B:178:0x0219, B:180:0x021d, B:182:0x0221, B:209:0x0275, B:185:0x022a, B:187:0x0233, B:189:0x0237, B:191:0x023e, B:193:0x0244, B:205:0x026d, B:196:0x0249, B:198:0x024f, B:199:0x0256, B:201:0x025e, B:202:0x0263, B:204:0x0269, B:206:0x026f, B:212:0x0284, B:216:0x0294, B:217:0x02a2, B:219:0x02a6, B:221:0x02aa, B:248:0x02fe, B:224:0x02b3, B:226:0x02bc, B:228:0x02c0, B:230:0x02c7, B:232:0x02cd, B:244:0x02f6, B:235:0x02d2, B:237:0x02d8, B:238:0x02df, B:240:0x02e7, B:241:0x02ec, B:243:0x02f2, B:245:0x02f8, B:252:0x030f, B:254:0x0316, B:257:0x0323, B:29:0x005a, B:31:0x0060, B:32:0x0063, B:40:0x0078, B:35:0x006c, B:37:0x0072, B:39:0x0076, B:43:0x0084, B:46:0x008c, B:48:0x0090, B:50:0x0096, B:52:0x009a, B:54:0x00a2, B:56:0x00a8, B:60:0x00b0, B:62:0x00b9, B:63:0x00bd, B:64:0x00c0, B:65:0x00c3, B:72:0x00d3, B:74:0x00d7, B:69:0x00cd, B:75:0x00dd, B:77:0x00e5, B:78:0x00e8, B:86:0x00ff, B:81:0x00f3, B:83:0x00f9, B:85:0x00fd, B:89:0x010b, B:92:0x0113, B:94:0x0117, B:96:0x011d, B:98:0x0121, B:100:0x0129, B:102:0x012f, B:106:0x0137, B:108:0x0140, B:109:0x0144, B:110:0x0147, B:111:0x014a, B:118:0x015a, B:120:0x015e, B:115:0x0154), top: B:266:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3 A[Catch: all -> 0x032e, PHI: r1
      0x00c3: PHI (r1v34 ??) = (r1v33 ??), (r1v33 ??), (r1v36 ??) binds: [B:49:0x0094, B:51:0x0098, B:66:0x00c8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x032e, blocks: (B:3:0x0005, B:5:0x000f, B:8:0x001a, B:12:0x0024, B:15:0x0032, B:17:0x0038, B:18:0x003d, B:20:0x0045, B:22:0x004a, B:24:0x0050, B:27:0x0055, B:122:0x0164, B:124:0x016a, B:125:0x016d, B:127:0x0178, B:130:0x0184, B:133:0x018c, B:154:0x01c6, B:155:0x01cb, B:156:0x01ce, B:137:0x0193, B:139:0x0199, B:141:0x019d, B:143:0x01a5, B:145:0x01ab, B:149:0x01b3, B:151:0x01bc, B:152:0x01c0, B:153:0x01c3, B:160:0x01d8, B:161:0x01db, B:163:0x01e1, B:165:0x01e5, B:168:0x01ec, B:170:0x01f4, B:177:0x020b, B:178:0x0219, B:180:0x021d, B:182:0x0221, B:209:0x0275, B:185:0x022a, B:187:0x0233, B:189:0x0237, B:191:0x023e, B:193:0x0244, B:205:0x026d, B:196:0x0249, B:198:0x024f, B:199:0x0256, B:201:0x025e, B:202:0x0263, B:204:0x0269, B:206:0x026f, B:212:0x0284, B:216:0x0294, B:217:0x02a2, B:219:0x02a6, B:221:0x02aa, B:248:0x02fe, B:224:0x02b3, B:226:0x02bc, B:228:0x02c0, B:230:0x02c7, B:232:0x02cd, B:244:0x02f6, B:235:0x02d2, B:237:0x02d8, B:238:0x02df, B:240:0x02e7, B:241:0x02ec, B:243:0x02f2, B:245:0x02f8, B:252:0x030f, B:254:0x0316, B:257:0x0323, B:29:0x005a, B:31:0x0060, B:32:0x0063, B:40:0x0078, B:35:0x006c, B:37:0x0072, B:39:0x0076, B:43:0x0084, B:46:0x008c, B:48:0x0090, B:50:0x0096, B:52:0x009a, B:54:0x00a2, B:56:0x00a8, B:60:0x00b0, B:62:0x00b9, B:63:0x00bd, B:64:0x00c0, B:65:0x00c3, B:72:0x00d3, B:74:0x00d7, B:69:0x00cd, B:75:0x00dd, B:77:0x00e5, B:78:0x00e8, B:86:0x00ff, B:81:0x00f3, B:83:0x00f9, B:85:0x00fd, B:89:0x010b, B:92:0x0113, B:94:0x0117, B:96:0x011d, B:98:0x0121, B:100:0x0129, B:102:0x012f, B:106:0x0137, B:108:0x0140, B:109:0x0144, B:110:0x0147, B:111:0x014a, B:118:0x015a, B:120:0x015e, B:115:0x0154), top: B:266:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc A[LOOP:15: B:46:0x008c->B:68:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd A[Catch: all -> 0x032e, TryCatch #0 {all -> 0x032e, blocks: (B:3:0x0005, B:5:0x000f, B:8:0x001a, B:12:0x0024, B:15:0x0032, B:17:0x0038, B:18:0x003d, B:20:0x0045, B:22:0x004a, B:24:0x0050, B:27:0x0055, B:122:0x0164, B:124:0x016a, B:125:0x016d, B:127:0x0178, B:130:0x0184, B:133:0x018c, B:154:0x01c6, B:155:0x01cb, B:156:0x01ce, B:137:0x0193, B:139:0x0199, B:141:0x019d, B:143:0x01a5, B:145:0x01ab, B:149:0x01b3, B:151:0x01bc, B:152:0x01c0, B:153:0x01c3, B:160:0x01d8, B:161:0x01db, B:163:0x01e1, B:165:0x01e5, B:168:0x01ec, B:170:0x01f4, B:177:0x020b, B:178:0x0219, B:180:0x021d, B:182:0x0221, B:209:0x0275, B:185:0x022a, B:187:0x0233, B:189:0x0237, B:191:0x023e, B:193:0x0244, B:205:0x026d, B:196:0x0249, B:198:0x024f, B:199:0x0256, B:201:0x025e, B:202:0x0263, B:204:0x0269, B:206:0x026f, B:212:0x0284, B:216:0x0294, B:217:0x02a2, B:219:0x02a6, B:221:0x02aa, B:248:0x02fe, B:224:0x02b3, B:226:0x02bc, B:228:0x02c0, B:230:0x02c7, B:232:0x02cd, B:244:0x02f6, B:235:0x02d2, B:237:0x02d8, B:238:0x02df, B:240:0x02e7, B:241:0x02ec, B:243:0x02f2, B:245:0x02f8, B:252:0x030f, B:254:0x0316, B:257:0x0323, B:29:0x005a, B:31:0x0060, B:32:0x0063, B:40:0x0078, B:35:0x006c, B:37:0x0072, B:39:0x0076, B:43:0x0084, B:46:0x008c, B:48:0x0090, B:50:0x0096, B:52:0x009a, B:54:0x00a2, B:56:0x00a8, B:60:0x00b0, B:62:0x00b9, B:63:0x00bd, B:64:0x00c0, B:65:0x00c3, B:72:0x00d3, B:74:0x00d7, B:69:0x00cd, B:75:0x00dd, B:77:0x00e5, B:78:0x00e8, B:86:0x00ff, B:81:0x00f3, B:83:0x00f9, B:85:0x00fd, B:89:0x010b, B:92:0x0113, B:94:0x0117, B:96:0x011d, B:98:0x0121, B:100:0x0129, B:102:0x012f, B:106:0x0137, B:108:0x0140, B:109:0x0144, B:110:0x0147, B:111:0x014a, B:118:0x015a, B:120:0x015e, B:115:0x0154), top: B:266:0x0005 }] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.13dY] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, X.13dY] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, X.13dY] */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, X.13dY] */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, X.13dY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, X.13Aw] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, X.13Aw] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [T, X.13dY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v33, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // X.InterfaceC20060313eL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(android.view.KeyEvent r14, kotlin.jvm.functions.Function0<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060013eI.LJIIJ(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d0, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0206 A[EDGE_INSN: B:169:0x0206->B:166:0x0206 BREAK  A[LOOP:0: B:12:0x002f->B:93:0x0122, LOOP_LABEL: LOOP:0: B:12:0x002f->B:93:0x0122], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[LOOP:3: B:19:0x0045->B:176:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105 A[PHI: r3
      0x0105: PHI (r3v14 X.13Aw) = (r3v1 X.13Aw), (r3v1 X.13Aw), (r3v16 X.13Aw) binds: [B:67:0x00d6, B:69:0x00da, B:84:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r7v10, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r8v8, types: [X.13dY] */
    @Override // X.InterfaceC20060313eL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ(X.C00BA r14, kotlin.jvm.internal.AwS431S0200000_30 r15) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060013eI.LJIIZILJ(X.00BA, kotlin.jvm.internal.AwS431S0200000_30):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e0 A[EDGE_INSN: B:146:0x01e0->B:141:0x01e0 BREAK  A[LOOP:0: B:97:0x0154->B:140:0x01dd, LOOP_LABEL: LOOP:0: B:97:0x0154->B:140:0x01dd], SYNTHETIC] */
    @Override // X.InterfaceC20060313eL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJ(int r13, X.C1683130ttv r14, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20060013eI.LJ(int, X.0ttv, kotlin.jvm.functions.Function1):java.lang.Boolean");
    }

    @Override // X.InterfaceC20060313eL
    public final boolean LJI(int i, boolean z, boolean z2) {
        boolean zLJIJJLI;
        if (!z) {
            int i2 = C20060913eR.LIZ[C20060113eJ.LIZLLL(this.LJFF, i).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    zLJIJJLI = LJIJJLI(z);
                } else {
                    throw new C1954807lC();
                }
            } else {
                return false;
            }
        } else {
            zLJIJJLI = LJIJJLI(z);
        }
        if (zLJIJJLI && z2) {
            this.LIZJ.invoke();
        }
        return zLJIJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.13eb] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.13bx] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.13ec] */
    public C20060013eI(C20069213fm c20069213fm, C20037413ae c20037413ae, C20069513fp c20069513fp, C115V c115v, C20038413ao c20038413ao, C20038313an c20038313an) {
        this.LIZ = c20038313an;
        this.LIZIZ = c20038413ao;
        this.LIZJ = c20069213fm;
        this.LIZLLL = c20037413ae;
        this.LJ = c20069513fp;
        this.LJI = new C20051213cs(c115v, new C20061613eY(this), new C2217401BqU(this) { // from class: X.13ec
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((C20060013eI) this.receiver).LJIIJJI();
            }
        }, new C2217391BqT(this) { // from class: X.13eb
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return ((C20060013eI) this.receiver).LJIIJJI;
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((C20060013eI) this.receiver).LJIILIIL((FocusTargetNode) obj);
            }
        });
    }
}
