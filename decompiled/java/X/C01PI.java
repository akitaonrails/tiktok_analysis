package X;

/* JADX INFO: renamed from: X.01PI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.data.usecase.GetAudienceRankingEntranceDataUseCase", f = "GetAudienceRankingEntranceDataUseCase.kt", l = {110, 118}, m = "getTopViewerDataWithFallback")
public final class C01PI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C01PF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PI(C01PF c01pf, InterfaceC1364105Vn<? super C01PI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c01pf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetAudienceRankingEntranceDataUseCase@ac4c.getTopViewerDataWithFallback$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(false, this);
        C1C7U.LIZIZ("GetAudienceRankingEntranceDataUseCase@ac4c.getTopViewerDataWithFallback$1");
        return objLIZIZ;
    }
}
