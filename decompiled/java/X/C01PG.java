package X;

/* JADX INFO: renamed from: X.01PG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.data.usecase.GetAudienceRankingEntranceDataUseCase", f = "GetAudienceRankingEntranceDataUseCase.kt", l = {51, 58}, m = "invoke")
public final class C01PG extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C01PF LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PG(C01PF c01pf, InterfaceC1364105Vn<? super C01PG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c01pf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetAudienceRankingEntranceDataUseCase@ac4c.invoke$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(this);
        C1C7U.LIZIZ("GetAudienceRankingEntranceDataUseCase@ac4c.invoke$1");
        return objLIZJ;
    }
}
