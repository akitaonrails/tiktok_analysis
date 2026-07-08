package X;

import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;

/* JADX INFO: renamed from: X.0s54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel", f = "SeriesPanelSquareViewModel.kt", l = {111, 161, 198}, m = "requestSquareDataAndRecommend")
public final class C1613160s54 extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesPanelSquareViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613160s54(SeriesPanelSquareViewModel seriesPanelSquareViewModel, InterfaceC1364105Vn<? super C1613160s54> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesPanelSquareViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesPanelSquareViewModel@be88.requestSquareDataAndRecommend$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZ.xQ2(false, 0, false, this);
        C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.requestSquareDataAndRecommend$1");
        return objXQ2;
    }
}
