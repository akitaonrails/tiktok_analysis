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
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18MD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$configNavBarLeftArea$1$1$1", f = "AnchorPanelAdapter.kt", l = {}, m = "invokeSuspend")
public final class C18MD extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C18MZ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AnchorProductInfoModel LLILZ;
    public final /* synthetic */ LinearLayout LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18MD(int i, View view, LinearLayout linearLayout, C18MZ c18mz, AnchorProductInfoModel anchorProductInfoModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c18mz;
        this.LLILLL = i;
        this.LLILZ = anchorProductInfoModel;
        this.LLILZIL = linearLayout;
        this.LLILZLL = str;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoProductDaInfo videoProductDaInfo;
        C1C7U.LIZ("AnchorPanelAdapter@4c56.configNavBarLeftArea$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = (View) this.LL;
        String strLIZIZ = C18LA.LIZIZ(this.LLILLJJLI.LLJILJIL, this.LLILLL, "c0417.d4352_iplaceholder_w5505");
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        int i = this.LLILLL;
        C18MZ c18mz = this.LLILLJJLI;
        int i2 = c18mz.LLIZLLLIL.panelStyle;
        ProductListModel productListModel = c18mz.LL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILZ;
        List<SkuItem> listLLLIILIL = c18mz.LLLIILIL(anchorProductInfoModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18MZ c18mz2 = this.LLILLJJLI;
        AnchorProductInfoModel anchorProductInfoModel2 = this.LLILZ;
        View view2 = this.LLIZ;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Map<String, VideoProductDaInfo> map = c18mz2.LLJL;
        Map<String, String> map2 = null;
        if (map != null) {
            videoProductDaInfo = (VideoProductDaInfo) ((LinkedHashMap) map).get(String.valueOf(anchorProductInfoModel2.extraData.productId));
        } else {
            videoProductDaInfo = null;
        }
        anchorBizUtils.getClass();
        Map mapLJJIZ = AnchorBizUtils.LJJIZ(videoProductDaInfo);
        if (mapLJJIZ != null) {
            linkedHashMap.putAll(mapLJJIZ);
        }
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        String strValueOf = String.valueOf(anchorProductInfoModel2.extraData.productId);
        c21272018Mk.getClass();
        C21272018Mk.LIZJ(strValueOf, linkedHashMap);
        linkedHashMap.putAll(C18LA.LIZJ(view2, strLIZIZ));
        c21271918Mj.getClass();
        C21271918Mj.LJIIIIZZ(i, i2, anchorProductInfoModel, productListModel, "contact_seller", listLLLIILIL, linkedHashMap);
        if (!AnchorBizUtils.LJIIL(this.LLILZIL.getContext(), this.LLILZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AnchorPanelAdapter@4c56.configNavBarLeftArea$1$1$1");
            return unit;
        }
        String str = this.LLILZLL;
        View view3 = this.LLIZ;
        BcmStandardTrack bcmStandardTrack = this.LLILZ.extraData.bcmStandardTrack;
        if (bcmStandardTrack != null) {
            map2 = bcmStandardTrack.chainParam;
        }
        String strLJFF = C18LA.LJFF(view3, str, strLIZIZ, map2);
        Context context = view.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJFF);
        sbLIZ.append("&in_window=chat_im");
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AnchorPanelAdapter@4c56.configNavBarLeftArea$1$1$1");
        return unit2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C18MZ c18mz = this.LLILLJJLI;
        int i = this.LLILLL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILZ;
        LinearLayout linearLayout = this.LLILZIL;
        String str = this.LLILZLL;
        C18MD c18md = new C18MD(i, this.LLIZ, linearLayout, c18mz, anchorProductInfoModel, str, interfaceC1364105Vn);
        c18md.LL = view;
        return c18md.invokeSuspend(Unit.LIZ);
    }
}
