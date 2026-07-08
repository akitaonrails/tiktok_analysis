package X;

import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel;

/* JADX INFO: renamed from: X.0r5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel", f = "FeaturedVideoAwemeListViewModel.kt", l = {82}, m = "requestFeatureVideoAwemeList")
public final class C1574960r5S extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FeaturedVideoAwemeListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574960r5S(FeaturedVideoAwemeListViewModel featuredVideoAwemeListViewModel, InterfaceC1364105Vn<? super C1574960r5S> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = featuredVideoAwemeListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeaturedVideoAwemeListViewModel@bc71.requestFeatureVideoAwemeList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("FeaturedVideoAwemeListViewModel@bc71.requestFeatureVideoAwemeList$1");
        return objVQ2;
    }
}
