package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PUI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$getCSInfoAndStartTimer$1$1$1", f = "SearchVideoHolder.kt", l = {}, m = "invokeSuspend")
public final class C0PUI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchVideoHolder LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0PUE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PUI(SearchVideoHolder searchVideoHolder, int i, C0PUE c0pue, InterfaceC1364105Vn<? super C0PUI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchVideoHolder;
        this.LLILLJJLI = i;
        this.LLILLL = c0pue;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PUI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("SearchVideoHolder@6f53.getCSInfoAndStartTimer$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ClickSearchViewModel clickSearchViewModel = this.LL.LLLLLLIL;
        if (clickSearchViewModel != null) {
            clickSearchViewModel.HQ2(this.LLILLJJLI, false);
        }
        C0PUE c0pue = this.LLILLL;
        Aweme aweme = this.LL.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c0pue.LJIIJ(aid, EnumC1999307sN.AUTO_PLAY);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.getCSInfoAndStartTimer$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
