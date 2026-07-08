package X;

/* JADX INFO: renamed from: X.0reh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FeedSkylightCoordinatorRepo", f = "FeedSkylightCoordinatorRepo.kt", l = {127}, m = "fetchLiveOnly")
public final class C1596810reh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1596660reS LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596810reh(C1596660reS c1596660reS, InterfaceC1364105Vn<? super C1596810reh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1596660reS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightCoordinatorRepo@14e2.fetchLiveOnly$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, this);
        C1C7U.LIZIZ("FeedSkylightCoordinatorRepo@14e2.fetchLiveOnly$1");
        return objLIZ;
    }
}
