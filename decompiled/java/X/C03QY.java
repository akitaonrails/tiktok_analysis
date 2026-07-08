package X;

/* JADX INFO: renamed from: X.03QY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayService", f = "OneClickPayService.kt", l = {245}, m = "fetchBillInfo")
public final class C03QY extends AbstractC23140094w {
    public C043B LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C03QL LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QY(C03QL c03ql, InterfaceC1364105Vn<? super C03QY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c03ql;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickPayService@2466.fetchBillInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, null, null, null, false, this);
        C1C7U.LIZIZ("OneClickPayService@2466.fetchBillInfo$1");
        return objLIZIZ;
    }
}
