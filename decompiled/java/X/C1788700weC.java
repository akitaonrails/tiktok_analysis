package X;

import com.bytedance.iap.core.model.IAPCheckExternalPaymentRequest;

/* JADX INFO: renamed from: X.0weC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.externalpayment.action.CheckExternalPaymentAction", f = "CheckExternalPaymentAction.kt", l = {30}, m = "perform")
public final class C1788700weC extends AbstractC23140094w {
    public IAPCheckExternalPaymentRequest LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1788690weB LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788700weC(C1788690weB c1788690weB, InterfaceC1364105Vn<? super C1788700weC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1788690weB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1786910wbJ {
        C1C7U.LIZ("CheckExternalPaymentAction@3dd1.perform$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("CheckExternalPaymentAction@3dd1.perform$1");
        return objLIZ;
    }
}
