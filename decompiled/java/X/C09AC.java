package X;

/* JADX INFO: renamed from: X.09AC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09AC<T> implements InterfaceC346201Wa<T> {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC346201Wa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC346701Wf<? super T> r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C09AD
            if (r0 == 0) goto L22
            r5 = r8
            X.09AD r5 = (X.C09AD) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.09A4 r2 = r5.LL
            goto L28
        L22:
            X.09AD r5 = new X.09AD
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L60
            goto L58
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r4)
            X.09A4 r2 = new X.09A4
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            r2.<init>(r7, r0)
            r5.LL = r2     // Catch: java.lang.Throwable -> L5e
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r6
            X.095D r0 = (X.C095D) r0     // Catch: java.lang.Throwable -> L5e
            kotlin.jvm.functions.Function2<X.01Wf<? super T>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r0.LL     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r0.invoke(r2, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L5e
            if (r1 == r0) goto L55
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5e
        L55:
            if (r1 != r3) goto L58
            return r3
        L58:
            r2.releaseIntercepted()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            r2.releaseIntercepted()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09AC.collect(X.01Wf, X.05Vn):java.lang.Object");
    }
}
