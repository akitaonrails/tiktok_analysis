package X;

import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$clearOldData$1$1", f = "SearchJediMixFeedFragment.kt", l = {}, m = "invokeSuspend")
public final class C640620PAu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchJediMixFeedFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640620PAu(SearchJediMixFeedFragment searchJediMixFeedFragment, InterfaceC1364105Vn<? super C640620PAu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchJediMixFeedFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640620PAu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.clearOldData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchComponentCenter.TopBarComponent.ISearchTopBarAbility iSearchTopBarAbilityRS = this.LL.RS();
        if (iSearchTopBarAbilityRS != null) {
            iSearchTopBarAbilityRS.YO0();
        }
        C0PN8 c0pn8HU = this.LL.HU(false);
        if (c0pn8HU != null) {
            c0pn8HU.LLJLLL = null;
        }
        this.LL.clearData();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.clearOldData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
