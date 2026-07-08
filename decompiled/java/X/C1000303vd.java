package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SelectedSKCInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1000303vd {
    public static final void LIZ(PdpViewModel pdpViewModel, String str, String str2) {
        String[] strArr;
        SkuItem skuItem;
        boolean z;
        int iIntValue;
        int i;
        String str3;
        String str4;
        SkuVoucher skuVoucher;
        SkuPanelState skuPanelState;
        String str5;
        SkuVoucher skuVoucher2;
        List<SkuItem> list;
        String str6;
        String str7 = null;
        try {
            if ((Intrinsics.LJFF(str, "ec_ttf_sku_panel_load_page_success") || Intrinsics.LJFF(str, "ec_ttf_sku_panel_close")) && (str2.length() == 0 || Intrinsics.LJFF(str2, "{}"))) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (Intrinsics.LJFF(jSONObject.optString("page_hash", null), String.valueOf(pdpViewModel.hashCode()))) {
                String strOptString = jSONObject.optString("product_id");
                ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
                if (productPackStruct != null) {
                    str6 = productPackStruct.productId;
                } else {
                    str6 = null;
                }
                if (!Intrinsics.LJFF(strOptString, str6)) {
                    return;
                }
            } else {
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (Intrinsics.LJFF(str, "ec_ttf_sku_panel_load_page_success")) {
            pdpViewModel.getClass();
            return;
        }
        if (!Intrinsics.LJFF(str, "ec_ttf_sku_panel_close")) {
            return;
        }
        pdpViewModel.getClass();
        try {
            SelectedSKCInfo selectedSKCInfo = (SelectedSKCInfo) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str2, SelectedSKCInfo.class);
            if (selectedSKCInfo != null) {
                List<String> list2 = selectedSKCInfo.checkedSpecIds;
                if (list2 == null || (strArr = (String[]) list2.toArray(new String[0])) == null) {
                    strArr = new String[0];
                }
                String strLIZ = C968903qZ.LIZ(strArr);
                ProductPackStruct productPackStruct2 = pdpViewModel.LLJILLL;
                if (productPackStruct2 != null && (list = productPackStruct2.skus) != null) {
                    skuItem = (SkuItem) C04AW.LJ(strLIZ, list);
                } else {
                    skuItem = null;
                }
                Integer num = selectedSKCInfo.closeType;
                if (num != null && num.intValue() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                Integer num2 = selectedSKCInfo.quantity;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 1;
                }
                ExceptionUX exceptionUX = selectedSKCInfo.exceptionUX;
                Integer num3 = selectedSKCInfo.closeType;
                if (num3 != null && num3.intValue() == 3) {
                    i = 1;
                } else {
                    Integer num4 = selectedSKCInfo.closeType;
                    if (num4 != null && num4.intValue() == 2) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                SkuPanelState skuPanelStatePv0 = pdpViewModel.Pv0();
                if (skuPanelStatePv0 != null) {
                    if (skuItem != null) {
                        str5 = skuItem.skuId;
                        skuVoucher2 = skuItem.voucherInfo;
                        str7 = skuItem.warehouseId;
                    } else {
                        str5 = null;
                        skuVoucher2 = null;
                    }
                    skuPanelState = SkuPanelState.LIZIZ(skuPanelStatePv0, null, str5, str7, skuVoucher2, strArr, Integer.valueOf(iIntValue), null, null, z, i, exceptionUX, null, null, null, null, null, 67107009);
                } else {
                    ProductPackStruct productPackStruct3 = pdpViewModel.LLJILLL;
                    if (productPackStruct3 == null || (str3 = productPackStruct3.productId) == null) {
                        str3 = "";
                    }
                    if (skuItem != null) {
                        str4 = skuItem.skuId;
                        skuVoucher = skuItem.voucherInfo;
                        str7 = skuItem.warehouseId;
                    } else {
                        str4 = null;
                        skuVoucher = null;
                    }
                    skuPanelState = new SkuPanelState(str3, str4, str7, skuVoucher, strArr, Integer.valueOf(iIntValue), null, null, z, i, exceptionUX, null, null, null, null, null, null, null, null, null, 0, "", null, Boolean.FALSE, null, null);
                }
                SkuPanelStarter.LIZ.getClass();
                SkuPanelStarter.LIZ(skuPanelState);
            }
        } catch (s e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
    }
}
