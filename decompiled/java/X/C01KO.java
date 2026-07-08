package X;

/* JADX INFO: renamed from: X.01KO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.core.network.CampaignProgressRefresher", f = "CampaignProgressRefresher.kt", l = {88, 96}, m = "runRefreshAfterDebounce")
public final class C01KO extends AbstractC23140094w {
    public long LL;
    public C01KL LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C01KK LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01KO(C01KK c01kk, InterfaceC1364105Vn<? super C01KO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c01kk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampaignProgressRefresher@fd31.runRefreshAfterDebounce$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(0L, this);
        C1C7U.LIZIZ("CampaignProgressRefresher@fd31.runRefreshAfterDebounce$1");
        return objLIZ;
    }
}
