package X;

/* JADX INFO: renamed from: X.01PH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.data.usecase.GetAudienceRankingEntranceDataUseCase", f = "GetAudienceRankingEntranceDataUseCase.kt", l = {87}, m = "getTopBuyerDataWithFallback")
public final class C01PH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C01PF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PH(C01PF c01pf, InterfaceC1364105Vn<? super C01PH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c01pf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetAudienceRankingEntranceDataUseCase@ac4c.getTopBuyerDataWithFallback$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(false, this);
        C1C7U.LIZIZ("GetAudienceRankingEntranceDataUseCase@ac4c.getTopBuyerDataWithFallback$1");
        return objLIZ;
    }
}
