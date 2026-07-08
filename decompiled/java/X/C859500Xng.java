package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C859500Xng<R> {
    public final Function1<InterfaceC1364105Vn<? super R>, Object> LIZ;
    public final C05XL<R> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C859490Xnf
            if (r0 == 0) goto L20
            r4 = r6
            X.0Xnf r4 = (X.C859490Xnf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.0Xnf r4 = new X.0Xnf
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function1<X.05Vn<? super R>, java.lang.Object> r0 = r5.LIZ     // Catch: java.lang.Throwable -> L45
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r0.invoke(r4)     // Catch: java.lang.Throwable -> L45
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L45
        L3f:
            X.05XL<R> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L45
            r0.LJIIZILJ(r3)     // Catch: java.lang.Throwable -> L45
            goto L4e
        L45:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.05XL<R> r0 = r5.LIZIZ
            r0.LJJJJJ(r1)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859500Xng.LIZ(X.05Vn):java.lang.Object");
    }

    public C859500Xng(Function1 function1, C099F c099f) {
        this.LIZ = function1;
        this.LIZIZ = c099f;
    }
}
