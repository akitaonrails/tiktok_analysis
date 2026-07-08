package X;

import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistorySubPageViewModel;

/* JADX INFO: renamed from: X.0r38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistorySubPageViewModel", f = "SeriesHistorySubPageViewModel.kt", l = {129}, m = "requestDataWithPagination")
public final class C1573520r38 extends AbstractC23140094w {
    public boolean LL;
    public MyListSceneEnum LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesHistorySubPageViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573520r38(SeriesHistorySubPageViewModel seriesHistorySubPageViewModel, InterfaceC1364105Vn<? super C1573520r38> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesHistorySubPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesHistorySubPageViewModel@3fd3.requestDataWithPagination$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZ.xQ2(null, false, this);
        C1C7U.LIZIZ("SeriesHistorySubPageViewModel@3fd3.requestDataWithPagination$1");
        return objXQ2;
    }
}
