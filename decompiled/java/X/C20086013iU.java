package X;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.13iU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20086013iU extends AbstractC20055413dY implements InterfaceC1697480uH4, InterfaceC20086513iZ {
    public InterfaceC20086513iZ LLJJ;
    public C20085913iT LLJJI;
    public C20086013iU LLJJIII;
    public final Object LLJJIJI;

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        C20085913iT c20085913iT = this.LLJJI;
        c20085913iT.LIZ = this;
        c20085913iT.LIZIZ = null;
        this.LLJJIII = null;
        c20085913iT.LIZJ = new AwS574S0100000_30(this, 329);
        this.LLJJI.LIZLLL = LLILLIZIL();
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        C259800zU c259800zU = new C259800zU();
        C20050913cp.LIZIZ(this, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 615));
        C20086013iU c20086013iU = (C20086013iU) ((InterfaceC1697480uH4) c259800zU.element);
        this.LLJJIII = c20086013iU;
        C20085913iT c20085913iT = this.LLJJI;
        c20085913iT.LIZIZ = c20086013iU;
        if (c20085913iT.LIZ == this) {
            c20085913iT.LIZ = null;
        }
    }

    public final InterfaceC497601wk LLJJ() {
        C20086013iU c20086013iU;
        if (this.LLJILLL && (c20086013iU = (C20086013iU) C20050913cp.LIZ(this)) != null) {
            return c20086013iU.LLJJ();
        }
        InterfaceC497601wk interfaceC497601wk = this.LLJJI.LIZLLL;
        if (interfaceC497601wk == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return interfaceC497601wk;
    }

    @Override // X.InterfaceC1697480uH4
    public final Object LJJIJLIJ() {
        return this.LLJJIJI;
    }

    public C20086013iU(InterfaceC20086513iZ interfaceC20086513iZ, C20085913iT c20085913iT) {
        this.LLJJ = interfaceC20086513iZ;
        this.LLJJI = c20085913iT == null ? new C20085913iT() : c20085913iT;
        this.LLJJIJI = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJJLZIJ(int i, long j) {
        long jLJJJLZIJ;
        C20086013iU c20086013iU;
        if (this.LLJILLL && (c20086013iU = (C20086013iU) C20050913cp.LIZ(this)) != null) {
            jLJJJLZIJ = c20086013iU.LJJJLZIJ(i, j);
        } else {
            jLJJJLZIJ = 0;
        }
        return C1378605aS.LJI(jLJJJLZIJ, this.LLJJ.LJJJLZIJ(i, C1378605aS.LJFF(j, jLJJJLZIJ)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    @Override // X.InterfaceC20086513iZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLILII(long r10, X.InterfaceC1364105Vn<? super X.C1395705dD> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C20086213iW
            if (r0 == 0) goto L76
            r7 = r12
            X.13iW r7 = (X.C20086213iW) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r2 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r6 = 0
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L58
            if (r0 != r5) goto L7c
            long r3 = r7.LLILLJJLI
            X.C155000ia.LIZIZ(r2)
        L28:
            X.05dD r2 = (X.C1395705dD) r2
            long r0 = r2.LIZ
            long r1 = X.C1395705dD.LJ(r3, r0)
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L36:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = r9.LLJILLL
            if (r0 == 0) goto L54
            X.0uH4 r0 = X.C20050913cp.LIZ(r9)
            X.13iU r0 = (X.C20086013iU) r0
            if (r0 == 0) goto L54
            r7.LL = r9
            r7.LLILLJJLI = r10
            r7.LLILZIL = r1
            java.lang.Object r2 = r0.LLILII(r10, r7)
            if (r2 != r8) goto L52
            return r8
        L52:
            r0 = r9
            goto L5f
        L54:
            r3 = 0
            r0 = r9
            goto L63
        L58:
            long r10 = r7.LLILLJJLI
            X.13iU r0 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L5f:
            X.05dD r2 = (X.C1395705dD) r2
            long r3 = r2.LIZ
        L63:
            X.13iZ r2 = r0.LLJJ
            long r0 = X.C1395705dD.LIZLLL(r10, r3)
            r7.LL = r6
            r7.LLILLJJLI = r3
            r7.LLILZIL = r5
            java.lang.Object r2 = r2.LLILII(r0, r7)
            if (r2 != r8) goto L28
            return r8
        L76:
            X.13iW r7 = new X.13iW
            r7.<init>(r9, r12)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20086013iU.LLILII(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC20086513iZ
    public final long LJJLI(int i, long j, long j2) {
        long jLJJLI;
        C20086013iU c20086013iU;
        long jLJJLI2 = this.LLJJ.LJJLI(i, j, j2);
        if (this.LLJILLL && (c20086013iU = (C20086013iU) C20050913cp.LIZ(this)) != null) {
            jLJJLI = c20086013iU.LJJLI(i, C1378605aS.LJI(j, jLJJLI2), C1378605aS.LJFF(j2, jLJJLI2));
        } else {
            jLJJLI = 0;
        }
        return C1378605aS.LJI(jLJJLI2, jLJJLI);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // X.InterfaceC20086513iZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLFII(long r13, long r15, X.InterfaceC1364105Vn<? super X.C1395705dD> r17) {
        /*
            r12 = this;
            r3 = r17
            r7 = r13
            r9 = r15
            boolean r0 = r3 instanceof X.C20086113iV
            if (r0 == 0) goto L84
            r11 = r3
            X.13iV r11 = (X.C20086113iV) r11
            int r2 = r11.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r11.LLILZLL = r2
        L16:
            java.lang.Object r4 = r11.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r11.LLILZLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L39
            if (r1 == r0) goto L4f
            if (r1 != r2) goto L8a
            long r0 = r11.LLILLJJLI
            X.C155000ia.LIZIZ(r4)
        L2b:
            X.05dD r4 = (X.C1395705dD) r4
            long r2 = r4.LIZ
        L2f:
            long r1 = X.C1395705dD.LJ(r0, r2)
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L39:
            X.C155000ia.LIZIZ(r4)
            X.13iZ r6 = r12.LLJJ
            r11.LL = r12
            r11.LLILLJJLI = r7
            r11.LLILLL = r9
            r11.LLILZLL = r0
            java.lang.Object r4 = r6.LLFII(r7, r9, r11)
            if (r4 != r3) goto L4d
            return r3
        L4d:
            r6 = r12
            goto L58
        L4f:
            long r9 = r11.LLILLL
            long r7 = r11.LLILLJJLI
            X.13iU r6 = r11.LL
            X.C155000ia.LIZIZ(r4)
        L58:
            X.05dD r4 = (X.C1395705dD) r4
            long r0 = r4.LIZ
            boolean r5 = r6.LLJILLL
            r4 = 0
            if (r5 == 0) goto L7e
            X.0uH4 r6 = X.C20050913cp.LIZ(r6)
            X.13iU r6 = (X.C20086013iU) r6
        L67:
            if (r6 == 0) goto L81
            long r7 = X.C1395705dD.LJ(r7, r0)
            long r9 = X.C1395705dD.LIZLLL(r9, r0)
            r11.LL = r4
            r11.LLILLJJLI = r0
            r11.LLILZLL = r2
            java.lang.Object r4 = r6.LLFII(r7, r9, r11)
            if (r4 != r3) goto L2b
            return r3
        L7e:
            X.13iU r6 = r6.LLJJIII
            goto L67
        L81:
            r2 = 0
            goto L2f
        L84:
            X.13iV r11 = new X.13iV
            r11.<init>(r12, r3)
            goto L16
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20086013iU.LLFII(long, long, X.05Vn):java.lang.Object");
    }
}
