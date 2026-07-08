package Y;

import X.C10516049i;
import X.C1421105hJ;
import X.C1708610uZ1;
import X.C1712670ufZ;
import X.C1729250v6J;
import X.C1730880v8w;
import X.C1731700vAG;
import X.C1733740vDY;
import X.C1748720vbi;
import X.C1749160vcQ;
import X.C2097608Jq;
import X.C786410Ut5;
import X.C919503ib;
import X.InterfaceC1709310ua9;
import X.InterfaceC1749170vcR;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductActionCardViewHolder;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.powerlist.ProductListCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.viewmodel.ProductListViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.refund.embedded.vo.RefundOptionCell;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS60S1200000_26 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS60S1200000_26 aCListenerS60S1200000_26, View view) {
        AssemVMLazy assemVMLazy = ((ProductListCell) aCListenerS60S1200000_26.l1).LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ProductListCell.LLIZ;
        ProductListViewModel productListViewModel = (ProductListViewModel) assemVMLazy.getValue();
        C1731700vAG c1731700vAG = (C1731700vAG) aCListenerS60S1200000_26.l2;
        String str = aCListenerS60S1200000_26.s0;
        RootData rootData = (RootData) ((ProductListCell) aCListenerS60S1200000_26.l1).LLILLL.getValue();
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        boolean z = rootData.isNewUser;
        String strLIZ = rootData.LIZ();
        String str4 = c1731700vAG.LL;
        Map mapLIZ = C1729250v6J.LIZ(str2, str3, strLIZ, z, "template_product_list", null);
        mapLIZ.put("module_name", "template_product");
        mapLIZ.put("product_id", str4);
        C1421105hJ.LIZJ("livesdk_tiktokec_module_click", mapLIZ);
        AwS605S0100000_26 awS605S0100000_26 = productListViewModel.LLILLJJLI;
        if (awS605S0100000_26 != null) {
            awS605S0100000_26.invoke(new C1730880v8w(c1731700vAG.LL, c1731700vAG.LLILLJJLI, str, c1731700vAG.LLJI));
        }
    }

    public static final void onClick$1(ACListenerS60S1200000_26 aCListenerS60S1200000_26, View view) {
        String string;
        String strLIZIZ;
        Object obj;
        ProductActionCardViewHolder productActionCardViewHolder = (ProductActionCardViewHolder) aCListenerS60S1200000_26.l1;
        Map map = (Map) aCListenerS60S1200000_26.l2;
        productActionCardViewHolder.getClass();
        String str = null;
        if (map == null || (obj = map.get("btm")) == null || (string = obj.toString()) == null || !(!a0.LJJJIL(string))) {
            string = null;
        }
        ProductActionCardViewHolder productActionCardViewHolder2 = (ProductActionCardViewHolder) aCListenerS60S1200000_26.l1;
        View view2 = productActionCardViewHolder2.itemView;
        C1748720vbi.LJ(view2, new C10516049i(), string, PageFinder.via(view2), new AwS392S0200000_26(productActionCardViewHolder2, (ProductActionCardViewHolder) aCListenerS60S1200000_26.l2, (Map<String, ? extends Object>) 3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = aCListenerS60S1200000_26.s0;
        View view3 = ((ProductActionCardViewHolder) aCListenerS60S1200000_26.l1).itemView;
        if (string != null && (strLIZIZ = C1733740vDY.LIZIZ(view3, string)) != null && (!a0.LJJJIL(strLIZIZ))) {
            str = strLIZIZ;
        }
        C919503ib.LIZIZ(((ProductActionCardViewHolder) aCListenerS60S1200000_26.l1).itemView.getContext(), C1733740vDY.LIZ(str2, str), C2097608Jq.LJI(new Pair("start_click_time", Long.valueOf(jCurrentTimeMillis))), false).open();
    }

    public static final void onClick$2(ACListenerS60S1200000_26 aCListenerS60S1200000_26, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = C1708610uZ1.LIZ.get(((C1712670ufZ) aCListenerS60S1200000_26.l1).LLILLL);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("page_name", ((RefundOptionCell) aCListenerS60S1200000_26.l2).LL);
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("option_name", aCListenerS60S1200000_26.s0);
        Context context = ((RefundOptionCell) aCListenerS60S1200000_26.l2).itemView.getContext();
        String str = ((C1712670ufZ) aCListenerS60S1200000_26.l1).LLJILJIL.schema;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        smartRouteBuildRoute.withParam("event_json", C786410Ut5.J3(jSONObject));
        smartRouteBuildRoute.open();
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(((C1712670ufZ) aCListenerS60S1200000_26.l1).LLILLL);
        String str3 = ((RefundOptionCell) aCListenerS60S1200000_26.l2).LL;
        String str4 = ((C1712670ufZ) aCListenerS60S1200000_26.l1).LLJILJIL.buttonName;
        if (str4 != null) {
            str2 = str4;
        }
        interfaceC1709310ua9LIZIZ.LJIIL(str3, str2, null, C2097608Jq.LJIIIIZZ(new Pair("page_name", str3), new Pair("payment_option", aCListenerS60S1200000_26.s0)));
    }

    public static final void onClick$3(ACListenerS60S1200000_26 aCListenerS60S1200000_26, View view) {
        InterfaceC1749170vcR interfaceC1749170vcR = ((C1749160vcQ) aCListenerS60S1200000_26.l1).LLIZLLLIL;
        if (interfaceC1749170vcR != null) {
            interfaceC1749170vcR.LIZLLL((PopUpButton) aCListenerS60S1200000_26.l2, aCListenerS60S1200000_26.s0, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS60S1200000_26(Object obj, ProductActionCardViewHolder productActionCardViewHolder, Map<String, ? extends Object> map, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = productActionCardViewHolder;
        this.s0 = map;
    }

    public ACListenerS60S1200000_26(C1749160vcQ c1749160vcQ, PopUpButton popUpButton, String str, BasicPopUp basicPopUp, int i) {
        this.$t = i;
        this.l1 = c1749160vcQ;
        this.l2 = popUpButton;
        this.s0 = str;
    }
}
