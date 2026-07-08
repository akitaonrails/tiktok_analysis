package X;

import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;

/* JADX INFO: renamed from: X.0gQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel", f = "PlaylistConsumptionViewModel.kt", l = {249}, m = "onRefresh")
public final class C1165420gQu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PlaylistConsumptionViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165420gQu(PlaylistConsumptionViewModel playlistConsumptionViewModel, InterfaceC1364105Vn<? super C1165420gQu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = playlistConsumptionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistConsumptionViewModel@7281.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("PlaylistConsumptionViewModel@7281.onRefresh$1");
        return objOnRefresh;
    }
}
