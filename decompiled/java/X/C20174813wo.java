package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager;

/* JADX INFO: renamed from: X.13wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager", f = "DMGreetingCardGeckoChannelManager.kt", l = {BaseNotice.CREATOR, 68}, m = "preloadGreetingCardScpResources")
public final class C20174813wo extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DMGreetingCardGeckoChannelManager LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20174813wo(DMGreetingCardGeckoChannelManager dMGreetingCardGeckoChannelManager, InterfaceC1364105Vn<? super C20174813wo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = dMGreetingCardGeckoChannelManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGreetingCardGeckoChannelManager@85da.preloadGreetingCardScpResources$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, null, this);
        C1C7U.LIZIZ("DMGreetingCardGeckoChannelManager@85da.preloadGreetingCardScpResources$1");
        return objLIZ;
    }
}
