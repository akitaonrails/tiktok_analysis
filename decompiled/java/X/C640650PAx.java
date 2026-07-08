package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$clearOldData$1$2", f = "SearchJediMixFeedFragment.kt", l = {}, m = "invokeSuspend")
public final class C640650PAx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchJediMixFeedFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640650PAx(SearchJediMixFeedFragment searchJediMixFeedFragment, InterfaceC1364105Vn<? super C640650PAx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchJediMixFeedFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640650PAx(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.clearOldData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C641860PFo c641860PFo = C641860PFo.LIZ;
        SearchJediMixFeedFragment searchJediMixFeedFragment = this.LL;
        c641860PFo.getClass();
        View view = searchJediMixFeedFragment.getView();
        View viewFindViewById = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.i_6);
        }
        if ((viewFindViewById instanceof ViewGroup) && viewFindViewById != null) {
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.i5y);
            if ((viewFindViewById2 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById2) != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
        }
        SearchJediMixFeedFragment searchJediMixFeedFragment2 = this.LL;
        if (searchJediMixFeedFragment2.isViewValid()) {
            if (searchJediMixFeedFragment2.LLJZ != null) {
                searchJediMixFeedFragment2.QS().LIZ();
            }
            if (searchJediMixFeedFragment2.LLJLLL != null) {
                searchJediMixFeedFragment2.ES().setRefreshing(false);
            }
        }
        C645870PUz c645870PUz = this.LL.LLLIIIIL;
        if (c645870PUz != null) {
            int visibility = c645870PUz.getVisibility();
            c645870PUz.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c645870PUz);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.clearOldData$1$2");
        return unit;
    }
}
