package X;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.0uGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697400uGw extends AbstractC20055313dX implements InterfaceC20051113cr, InterfaceC20051913cz, InterfaceC1693210uAB, InterfaceC20062713ej, InterfaceC1697480uH4 {
    public static final C1697470uH3 LLJJJJJIL = new Object() { // from class: X.0uH3
    };
    public InterfaceC595010NVj LLJJIII;
    public final Function1<Boolean, Unit> LLJJIJI;
    public C1678760tms LLJJIJIIJIL;
    public InterfaceC1697370uGt LLJJIJIL;
    public InterfaceC1692950u9l LLJJJ;
    public final InterfaceC1697450uH1 LLJJJIL;
    public AwS569S0100000_25 LLJJJJ;

    public C1697400uGw() {
        throw null;
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC20051113cr
    public final /* synthetic */ boolean LLIIJI() {
        return false;
    }

    @Override // X.InterfaceC20062713ej
    public final void LLIILZL() {
        C259800zU c259800zU = new C259800zU();
        C20060813eQ.LIZ(this, new AwS426S0200000_25(c259800zU, (C259800zU<InterfaceC1697360uGs>) this, (C1697400uGw) 131));
        InterfaceC1697360uGs interfaceC1697360uGs = (InterfaceC1697360uGs) c259800zU.element;
        if (this.LLJJJIL.LJJJ().isFocused()) {
            InterfaceC1697370uGt interfaceC1697370uGt = this.LLJJIJIL;
            if (interfaceC1697370uGt != null) {
                interfaceC1697370uGt.release();
            }
            this.LLJJIJIL = interfaceC1697360uGs != null ? interfaceC1697360uGs.LIZJ() : null;
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLJ() {
        InterfaceC1697370uGt interfaceC1697370uGt = this.LLJJIJIL;
        if (interfaceC1697370uGt != null) {
            interfaceC1697370uGt.release();
        }
        this.LLJJIJIL = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1697500uH6 LLJJIJIIJIL() {
        /*
            r11 = this;
            boolean r0 = r11.LLJILLL
            r7 = 0
            if (r0 == 0) goto L47
            X.0uH5 r8 = X.C1697500uH6.LLJJIII
            X.13dY r0 = r11.LL
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto L12
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        L12:
            X.13dY r0 = r11.LL
            X.13dY r9 = r0.LLILZIL
            X.13dH r6 = X.C20052513d5.LJFF(r11)
        L1a:
            if (r6 == 0) goto L98
        L1c:
            X.13dT r0 = r6.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r10 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r10
            if (r0 == 0) goto L89
        L27:
            if (r9 == 0) goto L89
            int r0 = r9.LLILLL
            r0 = r0 & r10
            if (r0 == 0) goto L86
            r5 = r7
            r4 = r9
        L30:
            boolean r0 = r4 instanceof X.InterfaceC1697480uH4
            if (r0 == 0) goto L48
            X.0uH4 r4 = (X.InterfaceC1697480uH4) r4
            java.lang.Object r0 = r4.LJJIJLIJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L7c
        L40:
            boolean r0 = r4 instanceof X.C1697500uH6
            if (r0 == 0) goto L47
            r7 = r4
            X.0uH6 r7 = (X.C1697500uH6) r7
        L47:
            return r7
        L48:
            int r0 = r4.LLILLL
            r0 = r0 & r10
            r3 = 1
            if (r0 == 0) goto L7c
            boolean r0 = r4 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L7c
            r0 = r4
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L58:
            if (r2 == 0) goto L81
            int r0 = r2.LLILLL
            r0 = r0 & r10
            if (r0 == 0) goto L64
            int r1 = r1 + 1
            if (r1 != r3) goto L67
            r4 = r2
        L64:
            X.13dY r2 = r2.LLILZLL
            goto L58
        L67:
            if (r5 != 0) goto L72
            X.13Aw r5 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r5.<init>(r0)
        L72:
            if (r4 == 0) goto L78
            r5.LIZLLL(r4)
            r4 = r7
        L78:
            r5.LIZLLL(r2)
            goto L64
        L7c:
            X.13dY r4 = X.C20052513d5.LIZIZ(r5)
            goto L83
        L81:
            if (r1 != r3) goto L7c
        L83:
            if (r4 == 0) goto L86
            goto L30
        L86:
            X.13dY r9 = r9.LLILZIL
            goto L27
        L89:
            X.13dH r6 = r6.LJJIJIL()
            if (r6 == 0) goto L98
            X.13dT r0 = r6.LLJLLIL
            if (r0 == 0) goto L96
            X.13dE r9 = r0.LIZLLL
            goto L1c
        L96:
            r9 = r7
            goto L1a
        L98:
            r4 = r7
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1697400uGw.LLJJIJIIJIL():X.0uH6");
    }

    @Override // X.InterfaceC1697480uH4
    public final Object LJJIJLIJ() {
        return LLJJJJJIL;
    }

    @Override // X.InterfaceC20051113cr
    public final void LLF(InterfaceC1692460u8y interfaceC1692460u8y) {
        boolean zIsFocused = this.LLJJJIL.LJJJ().isFocused();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        C1212320heY<Boolean> c1212320heY = C1696500uFU.LJIIJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
        Boolean boolValueOf = Boolean.valueOf(zIsFocused);
        c1212320heY.getClass();
        interfaceC1692460u8y.LIZJ(c1212320heY, boolValueOf);
        if (this.LLJJJJ == null) {
            this.LLJJJJ = new AwS569S0100000_25(this, 825);
        }
        interfaceC1692460u8y.LIZJ(C1694480uCE.LJIJJLI, new C1697110uGT(null, this.LLJJJJ));
    }

    @Override // X.InterfaceC20051913cz
    public final void LLIIII(j1 j1Var) {
        C1697500uH6 c1697500uH6LLJJIJIIJIL;
        this.LLJJJ = j1Var;
        if (!this.LLJJJIL.LJJJ().isFocused()) {
            return;
        }
        if (j1Var.LIZLLL()) {
            InterfaceC1692950u9l interfaceC1692950u9l = this.LLJJJ;
            if (interfaceC1692950u9l != null && interfaceC1692950u9l.LIZLLL() && (c1697500uH6LLJJIJIIJIL = LLJJIJIIJIL()) != null) {
                c1697500uH6LLJJIJIIJIL.LLJJ(this.LLJJJ);
                return;
            }
            return;
        }
        C1697500uH6 c1697500uH6LLJJIJIIJIL2 = LLJJIJIIJIL();
        if (c1697500uH6LLJJIJIIJIL2 == null) {
            return;
        }
        c1697500uH6LLJJIJIIJIL2.LLJJ(null);
    }

    public final void LLJJIJIL(InterfaceC595010NVj interfaceC595010NVj) {
        C1678760tms c1678760tms;
        if (!Intrinsics.LJFF(this.LLJJIII, interfaceC595010NVj)) {
            InterfaceC595010NVj interfaceC595010NVj2 = this.LLJJIII;
            if (interfaceC595010NVj2 != null && (c1678760tms = this.LLJJIJIIJIL) != null) {
                interfaceC595010NVj2.LIZJ(new C0NVY(c1678760tms));
            }
            this.LLJJIJIIJIL = null;
            this.LLJJIII = interfaceC595010NVj;
        }
    }

    public final void LLJJIJI(InterfaceC595010NVj interfaceC595010NVj, C0NNS c0nns) {
        InterfaceC2238208po interfaceC2238208poLJII;
        if (this.LLJILLL) {
            C09AE c09ae = (C09AE) ((C054G) LLILLIZIL()).LL.get(C09AE.LJJLJ);
            if (c09ae != null) {
                interfaceC2238208poLJII = c09ae.LJII(new AwS375S0200000_9(interfaceC595010NVj, c0nns, 133));
            } else {
                interfaceC2238208poLJII = null;
            }
            C23250099c.LIZLLL(LLILLIZIL(), null, null, new C0NW9(interfaceC595010NVj, c0nns, interfaceC2238208poLJII, null), 3);
            return;
        }
        interfaceC595010NVj.LIZJ(c0nns);
    }

    public C1697400uGw(InterfaceC595010NVj interfaceC595010NVj, int i, Function1 function1) {
        this.LLJJIII = interfaceC595010NVj;
        this.LLJJIJI = function1;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i, new C1697390uGv(this), 4);
        LLJJ(focusTargetNode);
        this.LLJJJIL = focusTargetNode;
    }
}
