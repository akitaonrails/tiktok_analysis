package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoRequestWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03f6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper$storePaymentMethodForAfterPaymentBindRetain$2", f = "PaymentBindHelper.kt", l = {998, 1011}, m = "invokeSuspend")
public final class C897803f6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C897703f5 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PipoRequestWrapper LLILZIL;
    public final /* synthetic */ C897703f5 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897803f6(String str, PipoRequestWrapper pipoRequestWrapper, C897703f5 c897703f5, InterfaceC1364105Vn<? super C897803f6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = pipoRequestWrapper;
        this.LLILZLL = c897703f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C897803f6 c897803f6 = new C897803f6(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c897803f6.LLILLL = obj;
        return c897803f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897803f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
