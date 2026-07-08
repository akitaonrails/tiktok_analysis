package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabFragment;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabFragment$onResume$1", f = "SeriesHomeTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C1577870rA9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeriesHomeTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1577870rA9(SeriesHomeTabFragment seriesHomeTabFragment, InterfaceC1364105Vn<? super C1577870rA9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seriesHomeTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1577870rA9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIILJJIL;
        Aweme awemeLJIIIIZZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        C1C7U.LIZ("SeriesHomeTabFragment@e10.onResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1590820rV2 c1590820rV2 = new C1590820rV2("enter_homepage_series");
        c1590820rV2.LIZLLL = "open_app";
        c1590820rV2.LJIJ = "open_app";
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null || (strLJIILJJIL = interfaceC1577520r9aLIZIZ.LJIILJJIL()) == null) {
            strLJIILJJIL = "";
        }
        c1590820rV2.LJ("series_tab_location", strLJIILJJIL);
        C128Y c128y = this.LL.LLILZ;
        if (c128y instanceof InterfaceC1593630rZZ) {
            c1590820rV2.LJIJJLI = ((InterfaceC1593630rZZ) c128y).T();
        }
        SeriesFeedViewHolder seriesFeedViewHolder = this.LL.LLJ;
        if (seriesFeedViewHolder != null && (awemeLJIIIIZZ = seriesFeedViewHolder.LJIIIIZZ()) != null) {
            c1590820rV2.LJIILLIIL(awemeLJIIIIZZ);
        }
        c1590820rV2.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesHomeTabFragment@e10.onResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
