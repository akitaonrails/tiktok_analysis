package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {114}, m = "invokeSuspend")
public final class C090G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ C09AJ<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090G(InterfaceC346201Wa<Object> interfaceC346201Wa, C09AJ<Object> c09aj, InterfaceC1364105Vn<? super C090G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C090G c090g = new C090G(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c090g.LLILLJJLI = obj;
        return c090g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 1
            if (r0 == 0) goto L18
            if (r0 != r5) goto L10
            java.lang.Object r4 = r7.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L35
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L18:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r4 = r7.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.01Wa<java.lang.Object> r3 = r7.LLILLL     // Catch: java.lang.Throwable -> L3e
            Y.AgS284S0100000_3 r2 = new Y.AgS284S0100000_3     // Catch: java.lang.Throwable -> L3e
            X.09AJ<java.lang.Object> r1 = r7.LLILZ     // Catch: java.lang.Throwable -> L3e
            r0 = 32
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L3e
            r7.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L3e
            r7.LL = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r3.collect(r2, r7)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r6) goto L38
            return r6
        L35:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L40
        L38:
            X.09AJ<java.lang.Object> r0 = r7.LLILZ     // Catch: java.lang.Throwable -> L40
            r0.onComplete()     // Catch: java.lang.Throwable -> L40
            goto L54
        L3e:
            r1 = move-exception
            goto L41
        L40:
            r1 = move-exception
        L41:
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L57
            X.09AJ<java.lang.Object> r0 = r7.LLILZ
            boolean r0 = r0.tryOnError(r1)
            if (r0 != 0) goto L54
            kotlin.coroutines.CoroutineContext r0 = r4.getCoroutineContext()
            X.C095J.LIZ(r0, r1)
        L54:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L57:
            X.09AJ<java.lang.Object> r0 = r7.LLILZ
            r0.onComplete()
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C090G.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
