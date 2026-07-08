package X;

import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13iT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20085913iT {
    public C20086013iU LIZ;
    public C20086013iU LIZIZ;
    public C09AY LIZJ = new AwS574S0100000_30(this, 328);
    public InterfaceC497601wk LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final InterfaceC497601wk LIZLLL() {
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LIZJ.invoke();
        if (interfaceC497601wk != null) {
            return interfaceC497601wk;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final C20086013iU LJ() {
        C20086013iU c20086013iU = this.LIZ;
        if (c20086013iU == null || !c20086013iU.LLJILLL) {
            return null;
        }
        return (C20086013iU) C20050913cp.LIZ(c20086013iU);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r6, X.InterfaceC1364105Vn<? super X.C1395705dD> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C20086413iY
            if (r0 == 0) goto L41
            r4 = r8
            X.13iY r4 = (X.C20086413iY) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L47
            X.C155000ia.LIZIZ(r3)
        L22:
            X.05dD r3 = (X.C1395705dD) r3
            long r1 = r3.LIZ
        L26:
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.13iU r0 = r5.LJ()
            if (r0 == 0) goto L3e
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LLILII(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3e:
            r1 = 0
            goto L26
        L41:
            X.13iY r4 = new X.13iY
            r4.<init>(r5, r8)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20085913iT.LIZJ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r11, long r13, X.InterfaceC1364105Vn<? super X.C1395705dD> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C20086313iX
            if (r0 == 0) goto L61
            r9 = r15
            X.13iX r9 = (X.C20086313iX) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r4 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L47
            if (r0 != r2) goto L67
            X.C155000ia.LIZIZ(r4)
        L25:
            X.05dD r4 = (X.C1395705dD) r4
            long r1 = r4.LIZ
        L29:
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r4)
            X.13iU r0 = r10.LJ()
            r7 = r13
            r5 = r11
            if (r0 != 0) goto L4f
            X.13iU r4 = r10.LIZIZ
            if (r4 == 0) goto L5e
            r9.LLILLL = r1
            java.lang.Object r4 = r4.LLFII(r5, r7, r9)
            if (r4 != r3) goto L4a
            return r3
        L47:
            X.C155000ia.LIZIZ(r4)
        L4a:
            X.05dD r4 = (X.C1395705dD) r4
            long r1 = r4.LIZ
            goto L29
        L4f:
            X.13iU r4 = r10.LJ()
            if (r4 == 0) goto L5e
            r9.LLILLL = r2
            java.lang.Object r4 = r4.LLFII(r5, r7, r9)
            if (r4 != r3) goto L25
            return r3
        L5e:
            r1 = 0
            goto L29
        L61:
            X.13iX r9 = new X.13iX
            r9.<init>(r10, r15)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20085913iT.LIZ(long, long, X.05Vn):java.lang.Object");
    }

    public final long LIZIZ(int i, long j, long j2) {
        C20086013iU c20086013iULJ = LJ();
        if (c20086013iULJ != null) {
            return c20086013iULJ.LJJLI(i, j, j2);
        }
        return 0L;
    }
}
