package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Pmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveWithVideoItemViewHolder$bindProductDynamicAnchor$1", f = "SearchLiveWithVideoItemViewHolder.kt", l = {1353}, m = "invokeSuspend")
public final class C654990Pmb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC655110Pmn LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C654990Pmb(ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn, String str, Aweme aweme, String str2, InterfaceC1364105Vn<? super C654990Pmb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = viewOnAttachStateChangeListenerC655110Pmn;
        this.LLILZ = str;
        this.LLILZIL = aweme;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C654990Pmb c654990Pmb = new C654990Pmb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c654990Pmb.LLILLJJLI = obj;
        return c654990Pmb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String aid;
        View view;
        View viewLIZ;
        InterfaceC655280Pn4 interfaceC655280Pn4;
        List<? extends InterfaceC655250Pn1> listLIZIZ;
        Object tag;
        C1C7U.LIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
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
            C01UK c01uk = new C01UK(this.LLILZLL, null);
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c01uk);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
                return objLJFF;
            }
        }
        ViewObjectWrapper viewObjectWrapper = (ViewObjectWrapper) obj;
        Aweme aweme = this.LLILLL.LLJLLIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LLILZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
            return unit;
        }
        if (viewObjectWrapper == null) {
            this.LLILLL.R5();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
            return unit2;
        }
        InterfaceC655280Pn4 interfaceC655280Pn42 = this.LLILLL.LLLFZ;
        if (interfaceC655280Pn42 != null) {
            interfaceC655280Pn42.stop();
        }
        LinearLayout linearLayoutA6 = this.LLILLL.a6();
        if (linearLayoutA6 == null) {
            this.LLILLL.R5();
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
            return unit3;
        }
        this.LLILLL.r6(true);
        for (int childCount = linearLayoutA6.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = linearLayoutA6.getChildAt(childCount);
            if (childAt != null) {
                tag = childAt.getTag();
            } else {
                tag = null;
            }
            if (Intrinsics.LJFF(tag, "dynamic_anchor_view")) {
                C786410Ut5.LJJLJ(childCount, linearLayoutA6);
            }
        }
        Object objX5 = this.LLILLL.X5();
        if (objX5 instanceof View) {
            view = (View) objX5;
        } else {
            view = null;
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        InterfaceC655060Pmi interfaceC655060Pmi = (InterfaceC655060Pmi) this.LLILLL.LLLFFI.getValue();
        if (interfaceC655060Pmi != null && (viewLIZ = interfaceC655060Pmi.LIZ(viewObjectWrapper)) != null) {
            viewLIZ.setTag("dynamic_anchor_view");
            linearLayoutA6.addView(viewLIZ, new LinearLayout.LayoutParams(-1, -2));
            C786410Ut5.LJZL(0, linearLayoutA6);
            C786410Ut5.LLIL(this.LLILLL.W5(), 8);
            this.LLILLL.e6(true);
            this.LLILLL.P5(true);
            ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = this.LLILLL;
            viewOnAttachStateChangeListenerC655110Pmn.LLLILZ = true;
            viewOnAttachStateChangeListenerC655110Pmn.LLJZ = true;
            InterfaceC655060Pmi interfaceC655060Pmi2 = (InterfaceC655060Pmi) viewOnAttachStateChangeListenerC655110Pmn.LLLFFI.getValue();
            if (interfaceC655060Pmi2 != null) {
                interfaceC655280Pn4 = (InterfaceC655280Pn4) interfaceC655060Pmi2.LIZJ(C13LE.LIZ(InterfaceC655280Pn4.class));
            } else {
                interfaceC655280Pn4 = null;
            }
            viewOnAttachStateChangeListenerC655110Pmn.LLLFZ = interfaceC655280Pn4;
            ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn2 = this.LLILLL;
            InterfaceC655060Pmi interfaceC655060Pmi3 = (InterfaceC655060Pmi) viewOnAttachStateChangeListenerC655110Pmn2.LLLFFI.getValue();
            if (interfaceC655060Pmi3 == null || (listLIZIZ = interfaceC655060Pmi3.LIZIZ(C13LE.LIZ(InterfaceC655250Pn1.class))) == null) {
                listLIZIZ = C13BV.INSTANCE;
            }
            viewOnAttachStateChangeListenerC655110Pmn2.LLLI = listLIZIZ;
            ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn3 = this.LLILLL;
            CommonLogParams commonLogParams = viewObjectWrapper.commonLogParams;
            if (commonLogParams != null) {
                map = commonLogParams.cardLog;
            }
            viewOnAttachStateChangeListenerC655110Pmn3.LLLII = map;
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
            return unit4;
        }
        this.LLILLL.R5();
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1");
        return unit5;
    }
}
