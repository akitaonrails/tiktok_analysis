package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.pay.SubscribePurchaseStrategy$updateContractStatusWhenAlreadySubscribed$2", f = "SubscribePurchaseStrategy.kt", l = {321}, m = "invokeSuspend")
public final class C516280KMo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public C516200KMg LLILLJJLI;
    public C0KJK LLILLL;
    public C259800zU LLILZ;
    public Function0 LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C259800zU<List<String>> LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ C516200KMg LLJI;
    public final /* synthetic */ C0KJK LLJIJIL;
    public final /* synthetic */ Function0<Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516280KMo(C259800zU<List<String>> c259800zU, C118300cf c118300cf, C516200KMg c516200KMg, C0KJK c0kjk, Function0<Unit> function0, InterfaceC1364105Vn<? super C516280KMo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c259800zU;
        this.LLJ = c118300cf;
        this.LLJI = c516200KMg;
        this.LLJIJIL = c0kjk;
        this.LLJILJIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C516280KMo(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0070 -> B:6:0x0025). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            java.lang.String r10 = "SubscribePurchaseStrategy@752.updateContractStatusWhenAlreadySubscribed$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r18
            int r0 = r7.LLIZ
            r5 = 1
            if (r0 == 0) goto L76
            if (r0 != r5) goto L92
            java.lang.Object r8 = r7.LLILZLL
            java.util.Iterator r8 = (java.util.Iterator) r8
            kotlin.jvm.functions.Function0 r0 = r7.LLILZIL
            X.00zU r2 = r7.LLILZ
            X.0KJK r13 = r7.LLILLL
            X.0KMg r4 = r7.LLILLJJLI
            X.00cf r3 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            X.0KO2 r1 = (X.C0KO2) r1
            boolean r1 = r1.LIZ
            if (r1 != 0) goto L3a
            int r9 = r3.element
            T r1 = r2.element
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            if (r9 != r1) goto L3a
            r0.invoke()
        L3a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            int r1 = r3.element
            int r1 = r1 + 1
            r3.element = r1
            X.01GW r1 = r4.LJII
            java.lang.Object r11 = r1.getValue()
            X.0KMf r11 = (X.C516190KMf) r11
            java.lang.String r15 = "before_iap"
            r7.LL = r3
            r7.LLILLJJLI = r4
            r7.LLILLL = r13
            r7.LLILZ = r2
            r7.LLILZIL = r0
            r7.LLILZLL = r8
            r7.LLIZ = r5
            r14 = 0
            X.04go r16 = new X.04go
            r16.<init>()
            r17 = r7
            java.lang.Object r1 = r11.LIZLLL(r12, r13, r14, r15, r16, r17)
            if (r1 != r6) goto L25
            X.C1C7U.LIZIZ(r10)
            return r6
        L76:
            X.C155000ia.LIZIZ(r1)
            X.00zU<java.util.List<java.lang.String>> r2 = r7.LLIZLLLIL
            T r1 = r2.element
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.00cf r3 = r7.LLJ
            X.0KMg r4 = r7.LLJI
            X.0KJK r13 = r7.LLJIJIL
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r7.LLJILJIL
            java.util.Iterator r8 = r1.iterator()
            goto L3a
        L8c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516280KMo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
