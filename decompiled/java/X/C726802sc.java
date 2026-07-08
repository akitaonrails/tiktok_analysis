package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C726802sc {
    public final PdpViewModel LIZ;

    public C726802sc(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final boolean LIZ(String str) {
        List<PromotionDiscount> list;
        List<Voucher> list2;
        String voucherID;
        ProductPackStruct productPackStruct = this.LIZ.LLJILLL;
        if (productPackStruct != null && (list = productPackStruct.promotionDiscounts) != null) {
            for (PromotionDiscount promotionDiscount : list) {
                Integer num = promotionDiscount.scene;
                if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                    for (Voucher voucher : list2) {
                        if (Intrinsics.LJFF(voucher.getVoucherTypeID(), str) && ((voucherID = voucher.getVoucherID()) == null || voucherID.length() == 0)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher r79) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C726802sc.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher):void");
    }

    public final void LIZLLL(Voucher voucher) {
        List<PromotionDiscount> list;
        List<Voucher> list2;
        ProductPackStruct productPackStruct = this.LIZ.LLJILLL;
        if (productPackStruct != null && (list = productPackStruct.promotionDiscounts) != null) {
            for (PromotionDiscount promotionDiscount : list) {
                Integer num = promotionDiscount.scene;
                if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (Intrinsics.LJFF(((Voucher) ListProtector.get(arrayList, i)).getVoucherTypeID(), voucher.getVoucherTypeID())) {
                            ListProtector.set(arrayList, i, voucher);
                            break;
                        }
                        i++;
                    }
                    promotionDiscount.discounts = arrayList;
                }
            }
        }
        PdpViewModel pdpViewModel = this.LIZ;
        C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            c1054004Ag.LJJJJJ(pdpViewModel.LLJILLL);
        }
        this.LIZ.setState(new AwS580S0100000_1(this, 995));
    }

    public final void LIZIZ(Context context, String str) {
        String str2;
        Object obj;
        String str3;
        Map<String, Object> map;
        Map<String, Object> map2;
        SellerInfo sellerInfo;
        ArrayList arrayList = new ArrayList();
        ProductPackStruct productPackStruct = this.LIZ.LLJILLL;
        String str4 = null;
        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
            str2 = sellerInfo.sellerId;
        } else {
            str2 = null;
        }
        arrayList.add(String.valueOf(str2));
        C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
        String strLJII = this.LIZ.LLILZIL.LJII("c5815.d0", str, null);
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            obj = map2.get("entrance_info");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZ.LLJI;
        if (pdpEnterParam2 != null) {
            map = pdpEnterParam2.trackParams;
        } else {
            map = null;
        }
        IPdpStarter.LIZ.getClass();
        String strValueOf = String.valueOf(C1013003xg.LIZJ(pdpEnterParam2));
        Boolean boolValueOf = Boolean.valueOf(this.LIZ.LLJIJIL);
        PdpViewModel pdpViewModel = this.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam3 = pdpViewModel.LLJI;
        if (pdpEnterParam3 != null) {
            str4 = pdpEnterParam3.sourceInfo;
        }
        C1013103xh.LIZ(c1013103xh, context, strLJII, str3, map, null, null, strValueOf, boolValueOf, str4, pdpViewModel.getSkuId(), arrayList, false, null, null, 28672);
    }
}
