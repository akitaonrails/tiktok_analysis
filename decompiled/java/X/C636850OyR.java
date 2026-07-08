package X;

import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem;

/* JADX INFO: renamed from: X.0OyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem", f = "M2BannerAssem.kt", l = {276}, m = "tryGetShowStateWithExitStrategy")
public final class C636850OyR extends AbstractC23140094w {
    public InboxBannerInfo LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ M2BannerAssem LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636850OyR(M2BannerAssem m2BannerAssem, InterfaceC1364105Vn<? super C636850OyR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = m2BannerAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2BannerAssem@ec5e.tryGetShowStateWithExitStrategy$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objSo = this.LLILZ.so(null, this);
        C1C7U.LIZIZ("M2BannerAssem@ec5e.tryGetShowStateWithExitStrategy$1");
        return objSo;
    }
}
