package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.037b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC7909037b implements View.OnClickListener {
    public final /* synthetic */ C723002s0 LL;
    public final /* synthetic */ EnumC804103Cd LLILLJJLI;
    public final /* synthetic */ OspShopViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ LogisticExpressionArea LLJ;
    public final /* synthetic */ C03CY LLJI;

    public ViewOnClickListenerC7909037b(C723002s0 c723002s0, EnumC804103Cd enumC804103Cd, OspShopViewModel ospShopViewModel, Context context, View view, int i, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, LogisticExpressionArea logisticExpressionArea, C03CY c03cy) {
        this.LL = c723002s0;
        this.LLILLJJLI = enumC804103Cd;
        this.LLILLL = ospShopViewModel;
        this.LLILZ = context;
        this.LLILZIL = view;
        this.LLILZLL = i;
        this.LLIZ = orderSubmitAssemViewModel;
        this.LLIZLLLIL = str;
        this.LLJ = logisticExpressionArea;
        this.LLJI = c03cy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String value;
        Float fLJIIIIZZ;
        String currency;
        String str;
        LogisticTextDTO logisticTextDTO;
        Price price;
        Price price2;
        String priceVal;
        Boolean bool;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        Map<String, String> map;
        List<LogisticDTO> list = this.LL.LLILZ;
        if (list != null) {
            EnumC804103Cd enumC804103Cd = this.LLILLJJLI;
            ?? BooleanValue = 0;
            BooleanValue = 0;
            if (list.size() > 1 || enumC804103Cd == EnumC804103Cd.PICKUP) {
                OspShopViewModel ospShopViewModel = this.LLILLL;
                C723002s0 c723002s0 = this.LL;
                Context context = this.LLILZ;
                View view2 = this.LLILZIL;
                int i = this.LLILZLL;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLIZ;
                EnumC804103Cd enumC804103Cd2 = this.LLILLJJLI;
                String str3 = this.LLIZLLLIL;
                LogisticExpressionArea logisticExpressionArea = this.LLJ;
                C03CY c03cy = this.LLJI;
                if (view2 == null) {
                    view2 = view;
                }
                ospShopViewModel.xQ2(c723002s0, list, context, C960603pE.LIZLLL(view2), new C817803Hk("c3646.d29091", Integer.valueOf(i)), orderSubmitAssemViewModel, enumC804103Cd2, str3);
                HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
                LogisticDTO logisticDTO = c723002s0.LLILZIL;
                if (logisticDTO != null && (map = logisticDTO.eventTrackInfo) != null) {
                    mapHi1.putAll(map);
                }
                if (logisticExpressionArea != null && (logisticsExpressionAreaExtraInfo = logisticExpressionArea.extraInfo) != null && (str2 = logisticsExpressionAreaExtraInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                    mapHi1.putAll(mapLJIIJ);
                }
                LogisticDTO logisticDTO2 = c723002s0.LLILZIL;
                if (logisticDTO2 != null && (bool = logisticDTO2.isDefault) != null) {
                    BooleanValue = bool.booleanValue();
                }
                mapHi1.put("is_default", Integer.valueOf((int) BooleanValue));
                if (c03cy == null || (value = c03cy.getValue()) == null) {
                    value = "other";
                }
                mapHi1.put("click_area", value);
                String strIR2 = orderSubmitAssemViewModel.iR2();
                if (strIR2 == null) {
                    strIR2 = "";
                }
                mapHi1.put("delivery_info", strIR2);
                mapHi1.putAll(orderSubmitAssemViewModel.MR2(c723002s0));
                C03O0 c03o0 = C03O0.LIZ;
                LogisticDTO logisticDTO3 = c723002s0.LLILZIL;
                if (logisticDTO3 != null && (price2 = logisticDTO3.shippingFee) != null && (priceVal = price2.getPriceVal()) != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
                } else {
                    fLJIIIIZZ = null;
                }
                LogisticDTO logisticDTO4 = c723002s0.LLILZIL;
                if (logisticDTO4 != null && (price = logisticDTO4.shippingFee) != null) {
                    currency = price.getCurrency();
                } else {
                    currency = null;
                }
                LogisticDTO logisticDTO5 = c723002s0.LLILZIL;
                if (logisticDTO5 != null && (logisticTextDTO = logisticDTO5.logisticText) != null) {
                    str = logisticTextDTO.thresholdTextEn;
                } else {
                    str = null;
                }
                C03O0.LJJJLZIJ(c03o0, "logistics", mapHi1, null, null, fLJIIIIZZ, currency, str, null, null, null, null, null, orderSubmitAssemViewModel.LLLZLZ.LIZIZ(new C817803Hk("c3646.d29091", Integer.valueOf(i))), C7806033c.LJIIJ(orderSubmitAssemViewModel), null, null, 851740);
            }
        }
    }
}
