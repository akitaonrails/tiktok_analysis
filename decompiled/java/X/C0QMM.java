package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0QMM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew$showSearchBarIconGuide$listener$1$onEnd$1", f = "SearchResultFragmentNew.kt", l = {2170}, m = "invokeSuspend")
public final class C0QMM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ SearchResultFragmentNew LLILLL;
    public final /* synthetic */ TuxIconView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QMM(SearchResultFragmentNew searchResultFragmentNew, TuxIconView tuxIconView, InterfaceC1364105Vn<? super C0QMM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchResultFragmentNew;
        this.LLILZ = tuxIconView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QMM(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C0QJ6 c0qj6;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        TuxIconView tuxIconView3;
        View view;
        Context context;
        C1C7U.LIZ("SearchResultFragmentNew@2882.showSearchBarIconGuide$listener$1$onEnd$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                z = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0QMN c0qmn = C0QMN.LIZIZ;
            c0qmn.LIZ.getClass();
            z = C1619270sEv.LIZJ;
            c0qmn.LIZ.getClass();
            C1619270sEv.LIZIZ();
            C01GW c01gw = C0BDA.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                long jIntValue = ((Number) c01gw.getValue()).intValue();
                this.LL = z;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchResultFragmentNew@2882.showSearchBarIconGuide$listener$1$onEnd$1");
                    return objLJFF;
                }
            }
        }
        SearchStartViewModel searchStartViewModel = this.LLILLL.LLJLL;
        if (searchStartViewModel != null && (c0qj6 = searchStartViewModel.LLJJJIL) != null && c0qj6.LIZ() == 1 && (tuxIconView = this.LLILZ) != null && tuxIconView.getVisibility() == 0 && ((((tuxIconView2 = this.LLILLL.LLJILJILJ) != null && tuxIconView2.getVisibility() == 0) || ((tuxIconView3 = this.LLILLL.LLJIJIL) != null && tuxIconView3.getVisibility() == 0 && (view = this.LLILLL.LLJ) != null && view.getVisibility() == 0)) && ((z || ((!C1487905s5.LIZ.getBoolean((String) C1487905s5.LIZIZ.getValue(), false) && !C0BD2.LIZ()) || ((Boolean) C0A4R.LIZ.getValue()).booleanValue())) && (context = this.LLILLL.getContext()) != null))) {
            TuxIconView tuxIconView4 = this.LLILZ;
            SearchResultFragmentNew searchResultFragmentNew = this.LLILLL;
            C450720Hlu c450720Hlu = new C450720Hlu(context);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = tuxIconView4;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c450720Hlu.LLILZ = context.getString(2131858265);
            c450720Hlu.LJIIIZ(true, null);
            c450720Hlu.LJ(new AwS554S0100000_10(searchResultFragmentNew, 1332));
            c450720Hlu.LIZJ(new AwS589S0100000_10(searchResultFragmentNew, 666));
            c450720Hlu.LLILLJJLI.LJIJJ = true;
            c450720Hlu.LIZIZ().show();
            C1487905s5.LIZ.storeBoolean((String) C1487905s5.LIZIZ.getValue(), true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchResultFragmentNew@2882.showSearchBarIconGuide$listener$1$onEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
