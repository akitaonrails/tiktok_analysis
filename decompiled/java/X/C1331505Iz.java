package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.adapter.strategy.VisualSearchStrategyAction$saveVisualSearchImageCache$1", f = "VisualSearchStrategyAction.kt", l = {}, m = "invokeSuspend")
public final class C1331505Iz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C1379950m0v LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331505Iz(Aweme aweme, C1379950m0v c1379950m0v, Bitmap bitmap, InterfaceC1364105Vn<? super C1331505Iz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = c1379950m0v;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1331505Iz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("VisualSearchStrategyAction@c7de.saveVisualSearchImageCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ISearchVisualSearchService iSearchVisualSearchServiceLIZ = C1255704vj.LIZ();
        Aweme aweme = this.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        iSearchVisualSearchServiceLIZ.LJIIL(this.LLILLJJLI.LLJIJIL, this.LLILLL, aid);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VisualSearchStrategyAction@c7de.saveVisualSearchImageCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
