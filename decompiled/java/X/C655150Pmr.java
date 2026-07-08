package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Pmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem$bindProductDynamicAnchor$1", f = "SearchMixLiveCardContentAssem.kt", l = {729}, m = "invokeSuspend")
public final class C655150Pmr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchMixLiveCardContentAssem LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC655060Pmi LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C655150Pmr(SearchMixLiveCardContentAssem searchMixLiveCardContentAssem, String str, InterfaceC655060Pmi interfaceC655060Pmi, Aweme aweme, String str2, InterfaceC1364105Vn<? super C655150Pmr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchMixLiveCardContentAssem;
        this.LLILZ = str;
        this.LLILZIL = interfaceC655060Pmi;
        this.LLILZLL = aweme;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C655150Pmr c655150Pmr = new C655150Pmr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c655150Pmr.LLILLJJLI = obj;
        return c655150Pmr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String aid;
        ViewGroup viewGroup;
        Object tag;
        Aweme aweme;
        C1C7U.LIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Map<String, ? extends Object> map = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            C01UJ c01uj = new C01UJ(this.LLIZ, null);
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c01uj);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
                return objLJFF;
            }
        }
        ViewObjectWrapper viewObjectWrapper = (ViewObjectWrapper) obj;
        C655000Pmc c655000Pmc = this.LLILLL.LLLF;
        if (c655000Pmc != null && (aweme = c655000Pmc.LLILLJJLI) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LLILZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
            return unit;
        }
        if (viewObjectWrapper == null) {
            this.LLILLL.Ep();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
            return unit2;
        }
        View viewSp = this.LLILLL.sp();
        if ((viewSp instanceof ViewGroup) && (viewGroup = (ViewGroup) viewSp) != null) {
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != null) {
                    tag = childAt.getTag();
                } else {
                    tag = null;
                }
                if (Intrinsics.LJFF(tag, "dynamic_anchor_view")) {
                    C786410Ut5.LJJLIL(childCount, viewGroup);
                } else if (childAt != null) {
                    C786410Ut5.LJLLLLLL(8, childAt);
                }
            }
            View viewLIZ = this.LLILZIL.LIZ(viewObjectWrapper);
            if (viewLIZ == null) {
                this.LLILLL.Ep();
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
                return unit3;
            }
            viewLIZ.setTag("dynamic_anchor_view");
            viewGroup.addView(viewLIZ);
            View viewSp2 = this.LLILLL.sp();
            if (viewSp2 != null) {
                C786410Ut5.LJLLLLLL(0, viewSp2);
            }
            SearchMixLiveCardContentAssem searchMixLiveCardContentAssem = this.LLILLL;
            searchMixLiveCardContentAssem.LLLFFI = true;
            searchMixLiveCardContentAssem.Ap();
            SearchMixLiveCardContentAssem searchMixLiveCardContentAssem2 = this.LLILLL;
            List<? extends InterfaceC655280Pn4> listLIZIZ = this.LLILZIL.LIZIZ(C13LE.LIZ(InterfaceC655280Pn4.class));
            if (listLIZIZ == null) {
                listLIZIZ = C13BV.INSTANCE;
            }
            searchMixLiveCardContentAssem2.LLLIIIL = listLIZIZ;
            SearchMixLiveCardContentAssem searchMixLiveCardContentAssem3 = this.LLILLL;
            List<? extends InterfaceC655250Pn1> listLIZIZ2 = this.LLILZIL.LIZIZ(C13LE.LIZ(InterfaceC655250Pn1.class));
            if (listLIZIZ2 == null) {
                listLIZIZ2 = C13BV.INSTANCE;
            }
            searchMixLiveCardContentAssem3.LLLIIL = listLIZIZ2;
            SearchMixLiveCardContentAssem searchMixLiveCardContentAssem4 = this.LLILLL;
            CommonLogParams commonLogParams = viewObjectWrapper.commonLogParams;
            if (commonLogParams != null) {
                map = commonLogParams.cardLog;
            }
            searchMixLiveCardContentAssem4.LLLIILIL = map;
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
            return unit4;
        }
        this.LLILLL.Ep();
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("SearchMixLiveCardContentAssem@e348.bindProductDynamicAnchor$1");
        return unit5;
    }
}
