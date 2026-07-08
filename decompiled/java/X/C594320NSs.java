package X;

/* JADX INFO: renamed from: X.0NSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.domain.usecase.gift.LoadRealTimeRecommendUseCase", f = "LoadRealTimeRecommendUseCase.kt", l = {84}, m = "insertRealTimeRecommendGift-0E7RQCE")
public final class C594320NSs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1129290fUd LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594320NSs(C1129290fUd c1129290fUd, InterfaceC1364105Vn<? super C594320NSs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1129290fUd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadRealTimeRecommendUseCase@2db3.insertRealTimeRecommendGift$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, 0L, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("LoadRealTimeRecommendUseCase@2db3.insertRealTimeRecommendGift$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("LoadRealTimeRecommendUseCase@2db3.insertRealTimeRecommendGift$1");
        return c189200o6M1boximpl;
    }
}
