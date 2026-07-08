package androidx.compose.ui.focus;

import X.AbstractC1685820tyG;
import X.AbstractC1691420u7I;
import X.AbstractC20055413dY;
import X.C1691310u77;
import X.C1691410u7H;
import X.C1697420uGy;
import X.C1954807lC;
import X.C20052513d5;
import X.C20060113eJ;
import X.C20060413eM;
import X.C20060813eQ;
import X.C259800zU;
import X.InterfaceC1679420tnw;
import X.InterfaceC1693210uAB;
import X.InterfaceC1697440uH0;
import X.InterfaceC1697450uH1;
import X.InterfaceC20060313eL;
import X.InterfaceC20062213ee;
import X.InterfaceC20062713ej;
import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class FocusTargetNode extends AbstractC20055413dY implements InterfaceC1693210uAB, InterfaceC1697450uH1, InterfaceC20062713ej, InterfaceC1697440uH0 {
    public final Function2<InterfaceC1679420tnw, InterfaceC1679420tnw, Unit> LLJJ;
    public final Function1<FocusTargetNode, Unit> LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final int LLJJIJIIJIL;

    public static final class FocusTargetElement extends AbstractC1685820tyG<FocusTargetNode> {
        public static final FocusTargetElement LIZIZ = new FocusTargetElement();

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }

        @Override // X.AbstractC1685820tyG
        public final AbstractC20055413dY LJIJI() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // X.AbstractC1685820tyG
        public final /* bridge */ /* synthetic */ void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        }
    }

    public FocusTargetNode() {
        throw null;
    }

    @Override // X.InterfaceC1682880ttW
    public final /* synthetic */ Object LJLJJLL(C1691310u77 c1691310u77) {
        return C1697420uGy.LIZ(this, c1691310u77);
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0039 A[EDGE_INSN: B:67:0x0039->B:18:0x0039 BREAK  A[LOOP:0: B:9:0x001e->B:53:0x0098, LOOP_LABEL: LOOP:0: B:9:0x001e->B:53:0x0098], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public final X.C20060713eP LLJJI() {
        /*
            r11 = this;
            X.13eP r4 = new X.13eP
            r4.<init>()
            int r1 = r11.LLJJIJIIJIL
            r3 = 1
            if (r1 != r3) goto L9a
            r0 = 1
        Lb:
            r4.LIZ = r0
            X.13dY r8 = r11.LL
            boolean r0 = r8.LLJILLL
            if (r0 != 0) goto L18
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        L18:
            X.13dY r9 = r11.LL
            X.13dH r7 = X.C20052513d5.LJFF(r11)
        L1e:
            if (r7 == 0) goto L39
        L20:
            X.13dT r0 = r7.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r0 = r0 & 3072(0xc00, float:4.305E-42)
            r10 = 0
            if (r0 == 0) goto L8b
        L2b:
            if (r9 == 0) goto L8b
            int r1 = r9.LLILLL
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 == 0) goto L88
            if (r9 == r8) goto L3a
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L3a
        L39:
            return r4
        L3a:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L88
            r6 = r9
            r5 = r10
        L40:
            boolean r0 = r6 instanceof X.InterfaceC20057413ds
            if (r0 == 0) goto L50
            X.13ds r6 = (X.InterfaceC20057413ds) r6
            r6.LJZL(r4)
        L49:
            X.13dY r6 = X.C20052513d5.LIZIZ(r5)
        L4d:
            if (r6 == 0) goto L88
            goto L40
        L50:
            int r0 = r6.LLILLL
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L49
            boolean r0 = r6 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L49
            r0 = r6
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L60:
            if (r2 == 0) goto L85
            int r0 = r2.LLILLL
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L6d
            int r1 = r1 + 1
            if (r1 != r3) goto L70
            r6 = r2
        L6d:
            X.13dY r2 = r2.LLILZLL
            goto L60
        L70:
            if (r5 != 0) goto L7b
            X.13Aw r5 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r5.<init>(r0)
        L7b:
            if (r6 == 0) goto L81
            r5.LIZLLL(r6)
            r6 = r10
        L81:
            r5.LIZLLL(r2)
            goto L6d
        L85:
            if (r1 != r3) goto L49
            goto L4d
        L88:
            X.13dY r9 = r9.LLILZIL
            goto L2b
        L8b:
            X.13dH r7 = r7.LJJIJIL()
            if (r7 == 0) goto L39
            X.13dT r0 = r7.LLJLLIL
            if (r0 == 0) goto L98
            X.13dE r9 = r0.LIZLLL
            goto L20
        L98:
            r9 = r10
            goto L1e
        L9a:
            if (r1 != 0) goto Lb1
            X.13DR r0 = X.C20055113dV.LJIIL
            java.lang.Object r0 = X.C20061513eX.LIZ(r11, r0)
            X.13eo r0 = (X.InterfaceC20063213eo) r0
            int r0 = r0.LIZ()
            if (r0 != r3) goto Laf
            r0 = 1
        Lab:
            r0 = r0 ^ 1
            goto Lb
        Laf:
            r0 = 0
            goto Lab
        Lb1:
            r0 = 2
            if (r1 != r0) goto Lb7
            r0 = 0
            goto Lb
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown Focusability"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.LLJJI():X.13eP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        r7 = null;
     */
    @Override // X.InterfaceC1697450uH1
    /* JADX INFO: renamed from: LLJJIII, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC20061113eT LJJJ() {
        /*
            r9 = this;
            boolean r0 = r9.LLJILLL
            if (r0 != 0) goto L7
            X.13eT r0 = X.EnumC20061113eT.Inactive
            return r0
        L7:
            X.13dU r0 = X.C20052513d5.LJI(r9)
            X.13eL r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusTargetNode r1 = r0.LIZJ()
            if (r1 != 0) goto L18
            X.13eT r0 = X.EnumC20061113eT.Inactive
            return r0
        L18:
            if (r9 != r1) goto L26
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto L23
            X.13eT r0 = X.EnumC20061113eT.Captured
            return r0
        L23:
            X.13eT r0 = X.EnumC20061113eT.Active
            return r0
        L26:
            boolean r0 = r1.LLJILLL
            if (r0 == 0) goto Laf
            X.13dY r0 = r1.LL
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto L35
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        L35:
            X.13dY r0 = r1.LL
            X.13dY r7 = r0.LLILZIL
            X.13dH r6 = X.C20052513d5.LJFF(r1)
        L3d:
            if (r6 == 0) goto Laf
        L3f:
            X.13dT r0 = r6.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r0 = r0 & 1024(0x400, float:1.435E-42)
            r8 = 0
            if (r0 == 0) goto La0
        L4a:
            if (r7 == 0) goto La0
            int r0 = r7.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L9d
            r5 = r7
            r4 = r8
        L54:
            boolean r0 = r5 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r0 == 0) goto L5d
            if (r9 != r5) goto L93
            X.13eT r0 = X.EnumC20061113eT.ActiveParent
            return r0
        L5d:
            int r0 = r5.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 1
            if (r0 == 0) goto L93
            boolean r0 = r5 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L93
            r0 = r5
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L6e:
            if (r2 == 0) goto L98
            int r0 = r2.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L7b
            int r1 = r1 + 1
            if (r1 != r3) goto L7e
            r5 = r2
        L7b:
            X.13dY r2 = r2.LLILZLL
            goto L6e
        L7e:
            if (r4 != 0) goto L89
            X.13Aw r4 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r4.<init>(r0)
        L89:
            if (r5 == 0) goto L8f
            r4.LIZLLL(r5)
            r5 = r8
        L8f:
            r4.LIZLLL(r2)
            goto L7b
        L93:
            X.13dY r5 = X.C20052513d5.LIZIZ(r4)
            goto L9a
        L98:
            if (r1 != r3) goto L93
        L9a:
            if (r5 == 0) goto L9d
            goto L54
        L9d:
            X.13dY r7 = r7.LLILZIL
            goto L4a
        La0:
            X.13dH r6 = r6.LJJIJIL()
            if (r6 == 0) goto Laf
            X.13dT r0 = r6.LLJLLIL
            if (r0 == 0) goto Lad
            X.13dE r7 = r0.LIZLLL
            goto L3f
        Lad:
            r7 = r8
            goto L3d
        Laf:
            X.13eT r0 = X.EnumC20061113eT.Inactive
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.LJJJ():X.13eT");
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        int i = C20060413eM.LIZIZ[LJJJ().ordinal()];
        if (i == 1 || i == 2) {
            InterfaceC20060313eL focusOwner = C20052513d5.LJI(this).getFocusOwner();
            focusOwner.LJI(8, true, false);
            focusOwner.LJIIIIZZ();
        }
    }

    public final void LLJJIJI() {
        int i = C20060413eM.LIZIZ[LJJJ().ordinal()];
        if (i == 1 || i == 2) {
            C259800zU c259800zU = new C259800zU();
            C20060813eQ.LIZ(this, new AwS431S0200000_30(c259800zU, (C259800zU<InterfaceC20062213ee>) this, (FocusTargetNode) 2));
            T t = c259800zU.element;
            if ((t == 0 ? null : (InterfaceC20062213ee) t).LIZ()) {
                return;
            }
            C20052513d5.LJI(this).getFocusOwner().LJIJJ(true);
        }
    }

    @Override // X.InterfaceC1697440uH0
    public final AbstractC1691420u7I LJJL() {
        return C1691410u7H.LIZ;
    }

    @Override // X.InterfaceC20062713ej
    public final void LLIILZL() {
        LLJJIJI();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
    }

    @Override // X.InterfaceC1697450uH1
    public final boolean LJJLIIJ(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zLJI = false;
            if (!LLJJI().LIZ) {
                Trace.endSection();
                return false;
            }
            int i2 = C20060413eM.LIZ[C20060113eJ.LJFF(this, i).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    zLJI = true;
                }
            } else {
                zLJI = C20060113eJ.LJI(this);
            }
            Trace.endSection();
            return zLJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046 A[EDGE_INSN: B:64:0x0046->B:21:0x0046 BREAK  A[LOOP:0: B:11:0x002a->B:61:0x00b3, LOOP_LABEL: LOOP:0: B:11:0x002a->B:61:0x00b3], SYNTHETIC] */
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
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.13dY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ(X.EnumC20061113eT r13, X.EnumC20061113eT r14) {
        /*
            r12 = this;
            X.13dU r0 = X.C20052513d5.LJI(r12)
            X.13eL r11 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusTargetNode r7 = r11.LIZJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r14)
            if (r0 != 0) goto L19
            kotlin.jvm.functions.Function2<X.0tnw, X.0tnw, kotlin.Unit> r0 = r12.LLJJ
            if (r0 == 0) goto L19
            r0.invoke(r13, r14)
        L19:
            X.13dY r8 = r12.LL
            boolean r0 = r8.LLJILLL
            if (r0 != 0) goto L24
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        L24:
            X.13dY r9 = r12.LL
            X.13dH r6 = X.C20052513d5.LJFF(r12)
        L2a:
            if (r6 == 0) goto L46
        L2c:
            X.13dT r0 = r6.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r0 = r0 & 5120(0x1400, float:7.175E-42)
            r10 = 0
            if (r0 == 0) goto La5
        L37:
            if (r9 == 0) goto La5
            int r1 = r9.LLILLL
            r0 = r1 & 5120(0x1400, float:7.175E-42)
            if (r0 == 0) goto La2
            r5 = 1
            if (r9 == r8) goto L4e
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4e
        L46:
            kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, kotlin.Unit> r0 = r12.LLJJI
            if (r0 == 0) goto L4d
            r0.invoke(r12)
        L4d:
            return
        L4e:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto La2
            r4 = r9
            r3 = r10
        L54:
            boolean r0 = r4 instanceof X.InterfaceC20051413cu
            if (r0 == 0) goto L6a
            X.13cu r4 = (X.InterfaceC20051413cu) r4
            androidx.compose.ui.focus.FocusTargetNode r0 = r11.LIZJ()
            if (r7 != r0) goto L63
            r4.LLIIIZ(r14)
        L63:
            X.13dY r4 = X.C20052513d5.LIZIZ(r3)
        L67:
            if (r4 == 0) goto La2
            goto L54
        L6a:
            int r0 = r4.LLILLL
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L63
            boolean r0 = r4 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L63
            r0 = r4
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L7a:
            if (r2 == 0) goto L9f
            int r0 = r2.LLILLL
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L87
            int r1 = r1 + 1
            if (r1 != r5) goto L8a
            r4 = r2
        L87:
            X.13dY r2 = r2.LLILZLL
            goto L7a
        L8a:
            if (r3 != 0) goto L95
            X.13Aw r3 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r3.<init>(r0)
        L95:
            if (r4 == 0) goto L9b
            r3.LIZLLL(r4)
            r4 = r10
        L9b:
            r3.LIZLLL(r2)
            goto L87
        L9f:
            if (r1 != r5) goto L63
            goto L67
        La2:
            X.13dY r9 = r9.LLILZIL
            goto L37
        La5:
            X.13dH r6 = r6.LJJIJIL()
            if (r6 == 0) goto L46
            X.13dT r0 = r6.LLJLLIL
            if (r0 == 0) goto Lb3
            X.13dE r9 = r0.LIZLLL
            goto L2c
        Lb3:
            r9 = r10
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.LLJJ(X.13eT, X.13eT):void");
    }

    public FocusTargetNode(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.LLJJ = (i2 & 2) != 0 ? null : function2;
        this.LLJJI = null;
        this.LLJJIJIIJIL = i;
    }
}
