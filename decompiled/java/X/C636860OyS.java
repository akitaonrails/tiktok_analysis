package X;

import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem;

/* JADX INFO: renamed from: X.0OyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem", f = "M2BannerAssem.kt", l = {276}, m = "tryGetShowStateWithFreqControl")
public final class C636860OyS extends AbstractC23140094w {
    public InboxBannerInfo LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ M2BannerAssem LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636860OyS(M2BannerAssem m2BannerAssem, InterfaceC1364105Vn<? super C636860OyS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = m2BannerAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2BannerAssem@ec5e.tryGetShowStateWithFreqControl$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objUo = this.LLILZ.uo(null, this);
        C1C7U.LIZIZ("M2BannerAssem@ec5e.tryGetShowStateWithFreqControl$1");
        return objUo;
    }
}
