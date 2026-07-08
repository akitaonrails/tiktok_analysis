package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qtb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem$setListData$1$2", f = "SearchMultiSummaryBaseAssem.kt", l = {}, m = "invokeSuspend")
public final class C684810Qtb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchMultiSummaryBaseAssem<ITEM> LL;

    /* JADX INFO: Incorrect field signature: TITEM; */
    public final /* synthetic */ InterfaceC684740QtU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/ss/android/ugc/aweme/search/pages/result/pov/ui/multisummary/SearchMultiSummaryBaseAssem<TITEM;>;TITEM;LX/05Vn<-LX/0Qtb;>;)V */
    public C684810Qtb(SearchMultiSummaryBaseAssem searchMultiSummaryBaseAssem, InterfaceC684740QtU interfaceC684740QtU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchMultiSummaryBaseAssem;
        this.LLILLJJLI = interfaceC684740QtU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C684810Qtb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMultiSummaryBaseAssem@ae94.setListData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> listEG2 = null;
        ISearchPovCardAbility iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ(SearchMultiSummaryBaseAssem.op(this.LL), ISearchPovCardAbility.class, null);
        if (iSearchPovCardAbility != null) {
            listEG2 = iSearchPovCardAbility.EG2();
        }
        C653450Pk7<Aweme> c653450Pk7 = this.LL.LLJL;
        if (c653450Pk7 != null) {
            c653450Pk7.LIZLLL(this.LLILLJJLI.getVideoList(), listEG2, AFwS241S0000000_10.get$arr$(285));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMultiSummaryBaseAssem@ae94.setListData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
