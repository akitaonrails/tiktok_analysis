package X;

import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0NZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel", f = "SeriesCenterMainPageAssemViewModel.kt", l = {326, 337}, m = "requestDataWithPagination")
public final class C595960NZa extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesCenterMainPageAssemViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595960NZa(SeriesCenterMainPageAssemViewModel seriesCenterMainPageAssemViewModel, InterfaceC1364105Vn<? super C595960NZa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesCenterMainPageAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SeriesCenterMainPageAssemViewModel@b1e8.requestDataWithPagination$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILZ.BQ2(this);
        C1C7U.LIZIZ("SeriesCenterMainPageAssemViewModel@b1e8.requestDataWithPagination$1");
        return objBQ2;
    }
}
