package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {126}, m = "invokeSuspend")
public final class C094H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILLL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZ;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<Object>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C094H(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC346201Wa<Object> interfaceC346201Wa2, InterfaceC1631620sYq<Object, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C094H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346701Wf;
        this.LLILZ = interfaceC346201Wa;
        this.LLILZIL = interfaceC346201Wa2;
        this.LLILZLL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C094H c094h = new C094H(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c094h.LLILLJJLI = obj;
        return c094h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #3 {all -> 0x007e, blocks: (B:6:0x0010, B:18:0x0071, B:20:0x0077), top: B:26:0x0010 }] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0952, X.0953, X.0954, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0954] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.0954] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.0954] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r4 = 1
            r12 = 0
            if (r0 == 0) goto L1e
            if (r0 != r4) goto L16
            java.lang.Object r9 = r13.LLILLJJLI
            X.0954 r9 = (X.AnonymousClass0954) r9
            X.C155000ia.LIZIZ(r14)     // Catch: X.C094L -> L14 java.lang.Throwable -> L7e
            goto L78
        L14:
            r2 = move-exception
            goto L71
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r6 = r13.LLILLJJLI
            X.01wk r6 = (X.InterfaceC497601wk) r6
            X.094I r2 = new X.094I
            X.01Wa<java.lang.Object> r0 = r13.LLILZ
            r2.<init>(r0, r12)
            r1 = 3
            r0 = 0
            X.0952 r9 = X.C23128094k.LIZIZ(r6, r0, r2, r1)
            X.1DFK r5 = X.C23118094a.LIZ()
            kotlin.jvm.internal.AwS369S0200000_3 r2 = new kotlin.jvm.internal.AwS369S0200000_3
            X.01Wf<java.lang.Object> r1 = r13.LLILLL
            r0 = 22
            r2.<init>(r5, r1, r0)
            r9.LIZJ(r2)
            kotlin.coroutines.CoroutineContext r7 = r6.getCoroutineContext()     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            java.lang.Object r8 = X.C09AQ.LIZIZ(r7)     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            kotlin.coroutines.CoroutineContext r0 = r6.getCoroutineContext()     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            kotlin.coroutines.CoroutineContext r2 = r0.plus(r5)     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            X.094G r5 = new X.094G     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            X.01Wa<java.lang.Object> r6 = r13.LLILZIL     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            X.01Wf<java.lang.Object> r10 = r13.LLILLL     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            X.0sYq<java.lang.Object, java.lang.Object, X.05Vn<java.lang.Object>, java.lang.Object> r11 = r13.LLILZLL     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            r13.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            r13.LL = r4     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            java.lang.Object r0 = X.C09AQ.LIZIZ(r2)     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            java.lang.Object r0 = X.C099W.LIZ(r2, r1, r0, r5, r13)     // Catch: java.lang.Throwable -> L6e X.C094L -> L70
            if (r0 != r3) goto L78
            return r3
        L6e:
            r0 = move-exception
            goto L7f
        L70:
            r2 = move-exception
        L71:
            X.01Wf<java.lang.Object> r1 = r13.LLILLL     // Catch: java.lang.Throwable -> L7e
            X.01Wf<?> r0 = r2.owner     // Catch: java.lang.Throwable -> L7e
            if (r0 == r1) goto L78
            throw r2     // Catch: java.lang.Throwable -> L7e
        L78:
            r9.LIZIZ(r12)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7e:
            r0 = move-exception
        L7f:
            r9.LIZIZ(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C094H.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
