package X;

import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0r30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel", f = "SeriesProfileTabViewModel.kt", l = {203}, m = "requestDataWithPagination")
public final class C1573440r30 extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesProfileTabViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573440r30(SeriesProfileTabViewModel seriesProfileTabViewModel, InterfaceC1364105Vn<? super C1573440r30> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesProfileTabViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SeriesProfileTabViewModel@1b58.requestDataWithPagination$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZ.yQ2(0L, this);
        C1C7U.LIZIZ("SeriesProfileTabViewModel@1b58.requestDataWithPagination$1");
        return objYQ2;
    }
}
