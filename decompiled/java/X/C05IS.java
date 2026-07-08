package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05IS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.pagesource.ECBtmDelegate$2", f = "ECBtmDelegate.kt", l = {42}, m = "invokeSuspend")
public final class C05IS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05IS(InterfaceC1364105Vn<? super C05IS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECBtmDelegate@e525.<init>$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(15000L, this) == objLJFF) {
                C1C7U.LIZIZ("ECBtmDelegate@e525.<init>$2");
                return objLJFF;
            }
        }
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        C1766870w4z.LIZIZ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECBtmDelegate@e525.<init>$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05IS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
