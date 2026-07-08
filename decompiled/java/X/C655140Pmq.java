package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.search.general.SearchLiveDynamicBottomAnchorAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Pmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.SearchLiveDynamicBottomAnchorAssem$bindDynamicAnchor$2", f = "SearchLiveDynamicBottomAnchorAssem.kt", l = {137}, m = "invokeSuspend")
public final class C655140Pmq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchLiveDynamicBottomAnchorAssem LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C655140Pmq(SearchLiveDynamicBottomAnchorAssem searchLiveDynamicBottomAnchorAssem, String str, Aweme aweme, String str2, InterfaceC1364105Vn<? super C655140Pmq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchLiveDynamicBottomAnchorAssem;
        this.LLILZ = str;
        this.LLILZIL = aweme;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C655140Pmq c655140Pmq = new C655140Pmq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c655140Pmq.LLILLJJLI = obj;
        return c655140Pmq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        List<? extends InterfaceC655280Pn4> listLIZIZ;
        List<? extends InterfaceC655250Pn1> listLIZIZ2;
        View viewLIZ;
        C1C7U.LIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Map<String, ? extends Object> map = null;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            C01UI c01ui = new C01UI(this.LLILZLL, null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c01ui);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
                return objLJFF;
            }
        }
        ViewObjectWrapper viewObjectWrapper = (ViewObjectWrapper) obj;
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
            return unit;
        }
        if (!Intrinsics.LJFF(this.LLILLL.LLJLL, this.LLILZ)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
            return unit2;
        }
        if (viewObjectWrapper == null) {
            this.LLILLL.op();
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
            return unit3;
        }
        FrameLayout frameLayout = (FrameLayout) this.LLILLL.LLJJLIIIJLLLLLLLZ.getValue();
        if (frameLayout != null) {
            SearchLiveDynamicBottomAnchorAssem searchLiveDynamicBottomAnchorAssem = this.LLILLL;
            searchLiveDynamicBottomAnchorAssem.getClass();
            SearchLiveDynamicBottomAnchorAssem.tp(frameLayout);
            InterfaceC655060Pmi interfaceC655060Pmi = (InterfaceC655060Pmi) searchLiveDynamicBottomAnchorAssem.LLJL.getValue();
            if (interfaceC655060Pmi != null && (viewLIZ = interfaceC655060Pmi.LIZ(viewObjectWrapper)) != null) {
                viewLIZ.setTag("dynamic_anchor_view");
                frameLayout.addView(viewLIZ);
                C786410Ut5.LJZ(0, frameLayout);
                C786410Ut5.LJLLLLLL(0, searchLiveDynamicBottomAnchorAssem.getContentView());
            } else {
                searchLiveDynamicBottomAnchorAssem.op();
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
                return unit4;
            }
        }
        SearchLiveDynamicBottomAnchorAssem searchLiveDynamicBottomAnchorAssem2 = this.LLILLL;
        InterfaceC655060Pmi interfaceC655060Pmi2 = (InterfaceC655060Pmi) searchLiveDynamicBottomAnchorAssem2.LLJL.getValue();
        if (interfaceC655060Pmi2 == null || (listLIZIZ = interfaceC655060Pmi2.LIZIZ(C13LE.LIZ(InterfaceC655280Pn4.class))) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        searchLiveDynamicBottomAnchorAssem2.LLJLLL = listLIZIZ;
        SearchLiveDynamicBottomAnchorAssem searchLiveDynamicBottomAnchorAssem3 = this.LLILLL;
        InterfaceC655060Pmi interfaceC655060Pmi3 = (InterfaceC655060Pmi) searchLiveDynamicBottomAnchorAssem3.LLJL.getValue();
        if (interfaceC655060Pmi3 == null || (listLIZIZ2 = interfaceC655060Pmi3.LIZIZ(C13LE.LIZ(InterfaceC655250Pn1.class))) == null) {
            listLIZIZ2 = C13BV.INSTANCE;
        }
        searchLiveDynamicBottomAnchorAssem3.LLJZ = listLIZIZ2;
        SearchLiveDynamicBottomAnchorAssem searchLiveDynamicBottomAnchorAssem4 = this.LLILLL;
        CommonLogParams commonLogParams = viewObjectWrapper.commonLogParams;
        if (commonLogParams != null) {
            map = commonLogParams.cardLog;
        }
        searchLiveDynamicBottomAnchorAssem4.LLJLLIL = map;
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2");
        return unit5;
    }
}
