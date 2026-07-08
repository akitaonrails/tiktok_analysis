package X;

/* JADX INFO: renamed from: X.13kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20099213kc<T> implements InterfaceC346701Wf {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC346701Wf<T> LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C20099213kc(C118300cf c118300cf, int i, InterfaceC346701Wf<? super T> interfaceC346701Wf) {
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC346701Wf;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // X.InterfaceC346701Wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C20099313kd
            if (r0 == 0) goto L4d
            r6 = r9
            X.13kd r6 = (X.C20099313kd) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L5b
            if (r0 != r4) goto L53
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.00cf r2 = r7.LL
            int r0 = r2.element
            int r1 = r0 + 1
            r2.element = r1
            int r0 = r7.LLILLJJLI
            if (r1 >= r0) goto L42
            X.01Wf<T> r0 = r7.LLILLL
            r6.LLILLL = r3
            java.lang.Object r0 = r0.emit(r8, r6)
            if (r0 != r5) goto L5e
            return r5
        L42:
            X.01Wf<T> r0 = r7.LLILLL
            r6.LLILLL = r4
            java.lang.Object r0 = X.C20099513kf.LIZ(r0, r8, r6)
            if (r0 != r5) goto L25
            return r5
        L4d:
            X.13kd r6 = new X.13kd
            r6.<init>(r7, r9)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5b:
            X.C155000ia.LIZIZ(r1)
        L5e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20099213kc.emit(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
