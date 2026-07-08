package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel.ECommerceShowcaseAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18NW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.showcase.view.ECommerceShowcaseCustomSingleAnchorBusiness$bindData$1", f = "ECommerceShowcaseCustomSingleAnchorBusiness.kt", l = {}, m = "invokeSuspend")
public final class C18NW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C18NV LL;
    public final /* synthetic */ InterfaceC1392640mLO LLILLJJLI;
    public final /* synthetic */ AnchorCommonStruct LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18NW(C18NV c18nv, InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C18NW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c18nv;
        this.LLILLJJLI = interfaceC1392640mLO;
        this.LLILLL = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18NW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme awemeLJJLIIIJJIZ;
        String strLJIIIIZZ;
        C1C7U.LIZ("ECommerceShowcaseCustomSingleAnchorBusiness@d761.bindData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C18NV c18nv = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI;
        c18nv.LLIZ = interfaceC1392640mLO;
        ECommerceShowcaseAnchorViewModel eCommerceShowcaseAnchorViewModel = c18nv.LLILZLL;
        AnchorCommonStruct anchorCommonStruct = this.LLILLL;
        String strCf = null;
        if (interfaceC1392640mLO != null) {
            eCommerceShowcaseAnchorViewModel.getClass();
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        eCommerceShowcaseAnchorViewModel.LL = awemeLJJLIIIJJIZ;
        if (interfaceC1392640mLO != null) {
            strCf = interfaceC1392640mLO.Cf();
        }
        eCommerceShowcaseAnchorViewModel.LLILLJJLI = strCf;
        eCommerceShowcaseAnchorViewModel.LLILZIL = anchorCommonStruct;
        C18NJ.LIZ.getClass();
        eCommerceShowcaseAnchorViewModel.LLILZLL = C18NJ.LIZIZ(anchorCommonStruct);
        eCommerceShowcaseAnchorViewModel.LLIZLLLIL = interfaceC1392640mLO;
        C18N7 c18n7 = C18N7.LIZ;
        Aweme aweme = eCommerceShowcaseAnchorViewModel.LL;
        c18n7.getClass();
        eCommerceShowcaseAnchorViewModel.LLIZ = C18N7.LIZIZ(aweme);
        C18NV c18nv2 = this.LL;
        C18NN c18nn = new C18NN(c18nv2.LLILLJJLI, c18nv2);
        c18nv2.LLILLL = c18nn;
        c18nn.LIZIZ();
        C18NN c18nn2 = this.LL.LLILLL;
        if (c18nn2 != null) {
            c18nn2.onInit();
        }
        IEComOfflineService iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class);
        HashMap map = new HashMap();
        C18NV c18nv3 = this.LL;
        AnchorCommonStruct anchorCommonStruct2 = this.LLILLL;
        for (Map.Entry entry : ((LinkedHashMap) c18nv3.LLILZLL.LLILLL).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        C18NJ.LIZ.getClass();
        ShowcaseContent showcaseContentLIZIZ = C18NJ.LIZIZ(anchorCommonStruct2);
        if (showcaseContentLIZIZ == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(showcaseContentLIZIZ)) == null) {
            strLJIIIIZZ = "";
        }
        map.put("showcase_anchor", strLJIIIIZZ);
        iEComOfflineService.LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceShowcaseCustomSingleAnchorBusiness@d761.bindData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
