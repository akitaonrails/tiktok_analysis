package X;

import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0Ipq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataManagerV2", f = "MultiTopLiveDataManagerV2.kt", l = {152, 156}, m = "fetchPlayFeedOnce")
public final class C478640Ipq extends AbstractC23140094w {
    public MGModuleTab LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C478590Ipl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478640Ipq(C478590Ipl c478590Ipl, InterfaceC1364105Vn<? super C478640Ipq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c478590Ipl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveDataManagerV2@5859.fetchPlayFeedOnce$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, 0L, null, this);
        C1C7U.LIZIZ("MultiTopLiveDataManagerV2@5859.fetchPlayFeedOnce$1");
        return objLIZLLL;
    }
}
