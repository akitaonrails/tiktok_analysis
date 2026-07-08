package X;

import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0Ipi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataManager", f = "MultiTopLiveDataManager.kt", l = {129, 133}, m = "fetchPlayFeed")
public final class C478560Ipi extends AbstractC23140094w {
    public MGModuleTab LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C478550Iph LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478560Ipi(C478550Iph c478550Iph, InterfaceC1364105Vn<? super C478560Ipi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c478550Iph;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveDataManager@da46.fetchPlayFeed$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0L, null, this, null);
        C1C7U.LIZIZ("MultiTopLiveDataManager@da46.fetchPlayFeed$1");
        return objLIZ;
    }
}
