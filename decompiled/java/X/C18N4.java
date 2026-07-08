package X;

import android.content.ComponentCallbacks2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18N4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.view.ECommerceCustomMultiAnchorBusiness$bindData$1", f = "ECommerceCustomMultiAnchorBusiness.kt", l = {}, m = "invokeSuspend")
public final class C18N4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21273218Mw LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;
    public final /* synthetic */ InterfaceC1392640mLO LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18N4(C21273218Mw c21273218Mw, AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, boolean z, int i, Function0<Unit> function0, InterfaceC1364105Vn<? super C18N4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21273218Mw;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = interfaceC1392640mLO;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18N4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnchorCommonViewModel anchorCommonViewModel;
        InterfaceC21275218Nq c18nt;
        ViewModelStoreOwner viewModelStoreOwner;
        C1C7U.LIZ("ECommerceCustomMultiAnchorBusiness@4558.bindData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme awemeLJJLIIIJJIZ = null;
        this.LL.LLILLJJLI.IQ2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
        C21273218Mw c21273218Mw = this.LL;
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(c21273218Mw.LL.getContext());
        Aweme awemeLJJLIIIJJIZ2 = null;
        if ((componentCallbacks2LIZ instanceof ViewModelStoreOwner) && (viewModelStoreOwner = (ViewModelStoreOwner) componentCallbacks2LIZ) != null) {
            String aid = this.LLILLL.LJJLIIIJJIZ().getAid();
            if (aid == null) {
                aid = "";
            }
            anchorCommonViewModel = (AnchorCommonViewModel) new ViewModelProvider(viewModelStoreOwner, new C20154413tW(aid)).get(AnchorCommonViewModel.class);
        } else {
            anchorCommonViewModel = null;
        }
        c21273218Mw.LLILLL = anchorCommonViewModel;
        C21273218Mw c21273218Mw2 = this.LL;
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = c21273218Mw2.LLILLJJLI.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        }
        List<AnchorProductInfoModel> list = this.LL.LLILLJJLI.LLILZIL;
        c21272618Mq.getClass();
        if (C21272618Mq.LJFF(awemeLJJLIIIJJIZ, list)) {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LL.LLILLJJLI;
            eCommerceAnchorPanelViewModel.LLJILLL = "video_main_anchor";
            InterfaceC1392640mLO interfaceC1392640mLO2 = eCommerceAnchorPanelViewModel.LL;
            if (interfaceC1392640mLO2 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
            }
            if (C21272618Mq.LJIIJ(awemeLJJLIIIJJIZ2)) {
                C21273218Mw c21273218Mw3 = this.LL;
                c18nt = new C18NO(c21273218Mw3.LL, c21273218Mw3.LLILLJJLI);
            } else {
                C21273218Mw c21273218Mw4 = this.LL;
                c18nt = new C18NP(c21273218Mw4.LL, c21273218Mw4.LLILLJJLI, c21273218Mw4.LLILLL);
            }
        } else {
            C21273218Mw c21273218Mw5 = this.LL;
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = c21273218Mw5.LLILLJJLI;
            eCommerceAnchorPanelViewModel2.LLJILLL = "video_multi_anchor";
            c18nt = new C18NT(c21273218Mw5.LL, eCommerceAnchorPanelViewModel2, c21273218Mw5.LLILLL);
        }
        c21273218Mw2.LLIZ = c18nt;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LL.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZIZ();
        }
        InterfaceC21275218Nq interfaceC21275218Nq2 = this.LL.LLIZ;
        if (interfaceC21275218Nq2 != null) {
            interfaceC21275218Nq2.onInit();
        }
        InterfaceC21275218Nq interfaceC21275218Nq3 = this.LL.LLIZ;
        if (interfaceC21275218Nq3 != null) {
            interfaceC21275218Nq3.LJ(this.LLILZLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceCustomMultiAnchorBusiness@4558.bindData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
