package X;

import com.ss.android.ugc.aweme.favorite.NearbyFavoriteListViewModel;

/* JADX INFO: renamed from: X.0gbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorite.NearbyFavoriteListViewModel", f = "NearbyFavoriteListViewModel.kt", l = {53}, m = "sendRequest")
public final class C1172060gbc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ NearbyFavoriteListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172060gbc(NearbyFavoriteListViewModel nearbyFavoriteListViewModel, InterfaceC1364105Vn<? super C1172060gbc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = nearbyFavoriteListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyFavoriteListViewModel@da90.sendRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, this);
        C1C7U.LIZIZ("NearbyFavoriteListViewModel@da90.sendRequest$1");
        return objVQ2;
    }
}
