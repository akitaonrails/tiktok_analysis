package X;

/* JADX INFO: renamed from: X.06Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1629906Zt<T> implements InterfaceC346701Wf {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC346701Wf<T> LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1629906Zt(C118300cf c118300cf, int i, InterfaceC346701Wf<? super T> interfaceC346701Wf) {
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC346701Wf;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // X.InterfaceC346701Wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1630006Zu
            if (r0 == 0) goto L3b
            r5 = r8
            X.06Zu r5 = (X.C1630006Zu) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            X.00cf r2 = r6.LL
            int r1 = r2.element
            int r0 = r6.LLILLJJLI
            if (r1 < r0) goto L49
            X.01Wf<T> r0 = r6.LLILLL
            r5.LLILLL = r3
            java.lang.Object r0 = r0.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L3b:
            X.06Zu r5 = new X.06Zu
            r5.<init>(r6, r8)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L49:
            int r0 = r1 + 1
            r2.element = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1629906Zt.emit(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
