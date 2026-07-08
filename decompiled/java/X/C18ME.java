package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18ME, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$configNavBarLeftArea$3$1$1", f = "AnchorPanelAdapter.kt", l = {}, m = "invokeSuspend")
public final class C18ME extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C18MZ LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ AnchorProductInfoModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ LinearLayout LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18ME(int i, View view, LinearLayout linearLayout, C18MZ c18mz, AnchorProductInfoModel anchorProductInfoModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c18mz;
        this.LLILLJJLI = i;
        this.LLILLL = anchorProductInfoModel;
        this.LLILZ = str;
        this.LLILZIL = view;
        this.LLILZLL = linearLayout;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        C1C7U.LIZ("AnchorPanelAdapter@4c56.configNavBarLeftArea$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = C18LA.LIZIZ(this.LL.LLJILJIL, this.LLILLJJLI, "c0417.d4352_iplaceholder_w4472");
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        C18MZ c18mz = this.LL;
        ProductListModel productListModel = c18mz.LL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLL;
        String str = this.LLILZ;
        List<SkuItem> listLLLIILIL = c18mz.LLLIILIL(anchorProductInfoModel);
        Map mapLIZJ = C18LA.LIZJ(this.LLILZIL, strLIZIZ);
        c21271918Mj.getClass();
        C21271918Mj.LJJIIJZLJL("tiktokec_shop_entrance_click", productListModel, anchorProductInfoModel, str, listLLLIILIL, mapLIZJ);
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AnchorProductInfoModel anchorProductInfoModel2 = this.LLILLL;
        Context context = this.LLILZLL.getContext();
        anchorBizUtils.getClass();
        if (!AnchorBizUtils.LJIIL(context, anchorProductInfoModel2)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AnchorPanelAdapter@4c56.configNavBarLeftArea$3$1$1");
            return unit;
        }
        String str2 = this.LLILZ;
        View view = this.LLILZIL;
        BcmStandardTrack bcmStandardTrack = this.LLILLL.extraData.bcmStandardTrack;
        if (bcmStandardTrack != null) {
            map = bcmStandardTrack.chainParam;
        } else {
            map = null;
        }
        SmartRouter.buildRoute(this.LLILZLL.getContext(), C18LA.LJFF(view, str2, strLIZIZ, map)).open();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AnchorPanelAdapter@4c56.configNavBarLeftArea$3$1$1");
        return unit2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C18MZ c18mz = this.LL;
        int i = this.LLILLJJLI;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLL;
        String str = this.LLILZ;
        return new C18ME(i, this.LLILZIL, this.LLILZLL, c18mz, anchorProductInfoModel, str, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
