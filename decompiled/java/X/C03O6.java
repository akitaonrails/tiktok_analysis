package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.PageContextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.ProductInfoMeta;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03O6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O6 {
    public OrderSubmitAssemViewModel LIZ;
    public int LIZIZ;

    public final void LIZJ() {
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        HashMap<String, Object> map3;
        HashMap<String, Object> map4;
        if (this.LIZIZ == 104) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
            if (orderSubmitAssemViewModel != null && (map4 = orderSubmitAssemViewModel.LLLIL) != null) {
                map4.put("enter_method", "add_on_entrance");
            }
        } else {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
            if (orderSubmitAssemViewModel2 != null && (map = orderSubmitAssemViewModel2.LLLIL) != null) {
                map.put("enter_method", "place_order_button");
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
        if (orderSubmitAssemViewModel3 != null && (map3 = orderSubmitAssemViewModel3.LLLIL) != null) {
            map3.put("entrance_form", "pure_goods_card");
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LIZ;
        if (orderSubmitAssemViewModel4 == null || (map2 = orderSubmitAssemViewModel4.LLLIL) == null) {
            return;
        }
        map2.put("source_module", "rec_add_item_interception_outer_flow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SelectedSkuInfo] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.ss.android.ugc.aweme.ecommerce.base.addon.dto.AddonPanelLayoutPassThroughParam] */
    public final GetAddonPanelLayoutRequest LIZ(int i) {
        String strLJIIIIZZ;
        Object obj;
        C752702wn c752702wn;
        AddonPanelInfo addonPanelInfo;
        Integer num;
        String str;
        HashMap<String, Object> map;
        int iIntValue = i;
        List<OrderShopDigest> listBR2 = null;
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        String str2 = "";
        if (pageSourceInfoLJ == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ)) == null) {
            strLJIIIIZZ = "";
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
        if (orderSubmitAssemViewModel != null && (map = orderSubmitAssemViewModel.LLLIL) != null) {
            obj = map.get("previous_page");
        } else {
            obj = null;
        }
        if ((obj instanceof String) && (str = (String) obj) != null) {
            str2 = str;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
        if (orderSubmitAssemViewModel2 != null) {
            c752702wn = orderSubmitAssemViewModel2.LLILZLL;
        } else {
            c752702wn = null;
        }
        Boolean bool = Boolean.FALSE;
        String str3 = null;
        List<String> listLIZJ = C7848034s.LIZJ(c752702wn, bool, null, bool);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
        if (orderSubmitAssemViewModel3 != null) {
            str3 = null;
            listBR2 = orderSubmitAssemViewModel3.BR2(orderSubmitAssemViewModel3.LLILZIL, orderSubmitAssemViewModel3.LLILZLL, listLIZJ, null, null);
        }
        ArrayList arrayList = new ArrayList();
        if (listBR2 != null) {
            Iterator<OrderShopDigest> it2 = listBR2.iterator();
            while (it2.hasNext()) {
                List<OrderSKUDTO> list = it2.next().orderSKUs;
                if (list != null) {
                    for (OrderSKUDTO orderSKUDTO : list) {
                        arrayList.add(new ProductInfoMeta(orderSKUDTO.productId, orderSKUDTO.skuId, str3, str3, str3, orderSKUDTO.bizType, str3, str3, str3, str3, str3, str3));
                    }
                }
            }
        }
        PageContextInfo pageContextInfo = new PageContextInfo(str2, "order_submit");
        if (iIntValue == 4) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LIZ;
            if (orderSubmitAssemViewModel4 != null && (addonPanelInfo = orderSubmitAssemViewModel4.t) != null && (num = addonPanelInfo.addonPanelScene) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        }
        return new GetAddonPanelLayoutRequest(strLJIIIIZZ, pageContextInfo, iIntValue, C13LP.LLIIII(arrayList), str3, str3, str3, str3, str3);
    }

    public final GetAddonPanelLayoutRequest LIZIZ(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        int i;
        Integer numValueOf;
        GetAddonPanelLayoutRequest getAddonPanelLayoutRequestLIZ = LIZ(this.LIZIZ);
        int i2 = this.LIZIZ;
        if (i2 == 13) {
            i = 4;
        } else {
            i = i2;
            if (i2 == 4) {
                if (orderSubmitAssemViewModel != null) {
                    AddonPanelInfo addonPanelInfo = orderSubmitAssemViewModel.t;
                    if (addonPanelInfo != null) {
                        numValueOf = addonPanelInfo.addonPanelScene;
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = 0;
                }
            }
            return new GetAddonPanelLayoutRequest(getAddonPanelLayoutRequestLIZ.sourceInfo, getAddonPanelLayoutRequestLIZ.pageContext, i, getAddonPanelLayoutRequestLIZ.productInfoList, numValueOf, getAddonPanelLayoutRequestLIZ.winnerItemList, getAddonPanelLayoutRequestLIZ.buyerAddrId, getAddonPanelLayoutRequestLIZ.shipToAddr, getAddonPanelLayoutRequestLIZ.passThroughParam);
        }
        numValueOf = Integer.valueOf(i2);
        return new GetAddonPanelLayoutRequest(getAddonPanelLayoutRequestLIZ.sourceInfo, getAddonPanelLayoutRequestLIZ.pageContext, i, getAddonPanelLayoutRequestLIZ.productInfoList, numValueOf, getAddonPanelLayoutRequestLIZ.winnerItemList, getAddonPanelLayoutRequestLIZ.buyerAddrId, getAddonPanelLayoutRequestLIZ.shipToAddr, getAddonPanelLayoutRequestLIZ.passThroughParam);
    }

    public final void LIZLLL(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2;
        this.LIZ = orderSubmitAssemViewModel;
        if (orderSubmitAssemViewModel != null) {
            if (orderSubmitAssemViewModel.t != null) {
                if (orderSubmitAssemViewModel != null) {
                    C948503nH.LJI(orderSubmitAssemViewModel, C23271099x.INSTANCE, new C03Q1(this, 4, null));
                } else {
                    return;
                }
            } else if (orderSubmitAssemViewModel == null) {
                return;
            }
            if (orderSubmitAssemViewModel.u != null && (orderSubmitAssemViewModel2 = this.LIZ) != null) {
                C948503nH.LJI(orderSubmitAssemViewModel2, C23271099x.INSTANCE, new C03Q0(this, 104, null));
            }
        }
    }

    public final void LJ(Context context, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2;
        C817603Hi c817603Hi;
        List<String> list = orderSubmitAssemViewModel.LLLIIL;
        if (list != null) {
            ((ArrayList) list).add("open_addon_panel");
        }
        this.LIZIZ = 104;
        this.LIZ = orderSubmitAssemViewModel;
        orderSubmitAssemViewModel.w = 104;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
        String strLIZJ = null;
        if (orderSubmitAssemViewModel3 != null && (c817603Hi = orderSubmitAssemViewModel3.LLLZLZ) != null) {
            strLIZJ = c817603Hi.LIZJ("c7497.d4784", null);
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LIZ;
        if (orderSubmitAssemViewModel4 != null && (getAddonPanelLayoutResponseData = orderSubmitAssemViewModel4.LLZ) != null && Intrinsics.LJFF(getAddonPanelLayoutResponseData.showPanel, Boolean.TRUE) && (orderSubmitAssemViewModel2 = this.LIZ) != null && orderSubmitAssemViewModel2.v != null && orderSubmitAssemViewModel2 != null) {
            orderSubmitAssemViewModel2.xQ2(new AwS43S1300000_1(this, context, orderSubmitAssemViewModel, strLIZJ, 21), true);
        }
    }
}
