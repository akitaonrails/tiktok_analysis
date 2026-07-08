package X;

import com.ss.android.ugc.aweme.minidrama.tab.v2.guest.DramaGuestLandingViewModel;

/* JADX INFO: renamed from: X.0gRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.tab.v2.guest.DramaGuestLandingViewModel", f = "DramaGuestLandingViewModel.kt", l = {31}, m = "onRefresh")
public final class C1165680gRK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DramaGuestLandingViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165680gRK(DramaGuestLandingViewModel dramaGuestLandingViewModel, InterfaceC1364105Vn<? super C1165680gRK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = dramaGuestLandingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DramaGuestLandingViewModel@ff7d.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("DramaGuestLandingViewModel@ff7d.onRefresh$1");
        return objOnRefresh;
    }
}
