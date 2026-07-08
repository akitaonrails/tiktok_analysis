package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus.SeaBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount.USPlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04JF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JF implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
        }
    }

    public static final void onCheckedChanged$0(C04JF c04jf, CompoundButton compoundButton, boolean z) {
        if (Intrinsics.LJFF(((BonusInfo) c04jf.l0).redeemCanBeUsed, Boolean.TRUE)) {
            C1748720vbi.LIZLLL((C21411818qq) c04jf.l1, new C10516049i(), new AwS210S0300000_1((SeaBonusCell) c04jf.l2, (SeaBonusCell) c04jf.l3, (HashMap<String, Object>) c04jf.l0, (BonusInfo) 54));
            C1748720vbi.LIZLLL((C21411818qq) c04jf.l1, new C049Y(), new AwS210S0300000_1(compoundButton, (SeaBonusCell) c04jf.l2, (BonusInfo) c04jf.l0, 55));
            ((SeaBonusCell) c04jf.l2).L5().f348X = true;
            ((SeaBonusCell) c04jf.l2).L5().q = compoundButton.isChecked();
            OrderSubmitAssemViewModel.OS2(((SeaBonusCell) c04jf.l2).L5(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.USE_BONUS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
            return;
        }
        compoundButton.setChecked(!z);
        BonusInfo bonusInfo = (BonusInfo) c04jf.l0;
        String str = bonusInfo.nonRedeemReason;
        if (str == null) {
            return;
        }
        C21411818qq c21411818qq = (C21411818qq) c04jf.l1;
        C1389880mGw c1389880mGw = new C1389880mGw(c21411818qq);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LIZLLL(3000L);
        c1389880mGw.LJIIJ();
        C1748720vbi.LIZLLL(c21411818qq, new AnonymousClass0481(), new AwS580S0100000_1(bonusInfo, 459));
    }

    public static final void onCheckedChanged$1(C04JF c04jf, CompoundButton compoundButton, boolean z) {
        if (Intrinsics.LJFF(((BonusInfo) c04jf.l0).redeemCanBeUsed, Boolean.TRUE)) {
            C0P0T c0p0t = ((USPlatformDiscountsCell) c04jf.l1).LLJIJIL;
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
            ((USPlatformDiscountsCell) c04jf.l1).L5().q = compoundButton.isChecked();
            OrderSubmitAssemViewModel.OS2(((USPlatformDiscountsCell) c04jf.l1).L5(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.USE_BONUS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        }
        C1748720vbi.LIZLLL((C21411818qq) c04jf.l2, new C10516049i(), new AwS367S0200000_1((USPlatformDiscountsCell) c04jf.l1, (USPlatformDiscountsCell) c04jf.l3, (HashMap<String, Object>) 195));
    }

    public static final void onCheckedChanged$2(C04JF c04jf, CompoundButton compoundButton, boolean z) {
        InsuranceInfo insuranceInfoCopy;
        HashMap<String, Object> map;
        String str;
        String str2;
        String str3;
        InsuranceInfo insuranceInfoCopy2;
        String str4 = null;
        if (z) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) c04jf.l0;
            if (orderSubmitAssemViewModel != null) {
                Map<String, InsuranceInfo> map2 = orderSubmitAssemViewModel.K;
                String str5 = ((AnonymousClass0380) c04jf.l1).LLJ;
                InsuranceInfo insuranceInfo = (InsuranceInfo) c04jf.l2;
                if (insuranceInfo != null) {
                    insuranceInfoCopy2 = insuranceInfo.copy(insuranceInfo.insuranceType, insuranceInfo.insuranceProtectionCode, insuranceInfo.insuranceProtectionType, insuranceInfo.description, insuranceInfo.introduceUrl, insuranceInfo.priority, insuranceInfo.insuranceProductId, insuranceInfo.insuranceProductName, insuranceInfo.insuranceProductNameEn, Integer.valueOf(C03CX.USER_SELECTED.getValue()), insuranceInfo.insuranceProductNameLocale, insuranceInfo.insurancePremiumPayment, insuranceInfo.insurancePremium, insuranceInfo.insurancePremiumBeforePromotion, insuranceInfo.insurancePrice, insuranceInfo.currency, insuranceInfo.insurancePartnerId, insuranceInfo.insurancePartnerName, insuranceInfo.promotionId, insuranceInfo.insurancePayType, insuranceInfo.protectionPriority, insuranceInfo.abnormalDescription, insuranceInfo.toast, insuranceInfo.billPreSpiltSkuSalePrice, insuranceInfo.currencySymbol);
                } else {
                    insuranceInfoCopy2 = null;
                }
                map2.put(str5, insuranceInfoCopy2);
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) c04jf.l0;
            if (orderSubmitAssemViewModel2 != null) {
                orderSubmitAssemViewModel2.M = ((AnonymousClass0380) c04jf.l1).LLJ;
            }
        } else {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = (OrderSubmitAssemViewModel) c04jf.l0;
            if (orderSubmitAssemViewModel3 != null) {
                Map<String, InsuranceInfo> map3 = orderSubmitAssemViewModel3.K;
                AnonymousClass0380 anonymousClass0380 = (AnonymousClass0380) c04jf.l1;
                String str6 = anonymousClass0380.LLJ;
                InsuranceInfo insuranceInfo2 = anonymousClass0380.LLIZLLLIL;
                if (insuranceInfo2 != null) {
                    insuranceInfoCopy = insuranceInfo2.copy(insuranceInfo2.insuranceType, insuranceInfo2.insuranceProtectionCode, insuranceInfo2.insuranceProtectionType, insuranceInfo2.description, insuranceInfo2.introduceUrl, insuranceInfo2.priority, insuranceInfo2.insuranceProductId, insuranceInfo2.insuranceProductName, insuranceInfo2.insuranceProductNameEn, Integer.valueOf(C03CX.INVERT_SELECTED.getValue()), insuranceInfo2.insuranceProductNameLocale, insuranceInfo2.insurancePremiumPayment, insuranceInfo2.insurancePremium, insuranceInfo2.insurancePremiumBeforePromotion, insuranceInfo2.insurancePrice, insuranceInfo2.currency, insuranceInfo2.insurancePartnerId, insuranceInfo2.insurancePartnerName, insuranceInfo2.promotionId, insuranceInfo2.insurancePayType, insuranceInfo2.protectionPriority, insuranceInfo2.abnormalDescription, insuranceInfo2.toast, insuranceInfo2.billPreSpiltSkuSalePrice, insuranceInfo2.currencySymbol);
                } else {
                    insuranceInfoCopy = null;
                }
                map3.put(str6, insuranceInfoCopy);
            }
        }
        C03O0 c03o0 = C03O0.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = (OrderSubmitAssemViewModel) c04jf.l0;
        if (orderSubmitAssemViewModel4 != null) {
            map = orderSubmitAssemViewModel4.hi1(false);
            InsuranceInfo insuranceInfo3 = (InsuranceInfo) c04jf.l2;
            AnonymousClass0380 anonymousClass03802 = (AnonymousClass0380) c04jf.l1;
            C719102rN c719102rN = (C719102rN) c04jf.l3;
            map.put("module_status", insuranceInfo3.selectInsuranceStatus(false));
            if (anonymousClass03802.getInsuranceCheckBox().isChecked()) {
                str = "circle";
            } else {
                str = "cancel";
            }
            map.put("module_type", str);
            if (c719102rN != null) {
                str4 = c719102rN.LLLJ;
            }
            String str7 = "";
            if (C703302op.LIZ(str4)) {
                if (c719102rN != null) {
                    str2 = c719102rN.LLLJ;
                    if (str2 != null) {
                    }
                    if (c719102rN != null && (str3 = c719102rN.LLJIJIL) != null) {
                        str7 = str3;
                    }
                }
                map.put("sale_price", str7);
            } else if (c719102rN == null || (str2 = c719102rN.LLJIJIL) == null) {
                str2 = "";
            }
            map.put("original_price", str2);
            if (c719102rN != null) {
                str7 = str3;
            }
            map.put("sale_price", str7);
        } else {
            map = new HashMap<>();
        }
        C03O0.LJJJLZIJ(c03o0, "protection", map, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048572);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel5 = (OrderSubmitAssemViewModel) c04jf.l0;
        if (orderSubmitAssemViewModel5 != null) {
            OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModel5, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.INSURANCE_INFO.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        }
    }

    public static final void onCheckedChanged$3(C04JF c04jf, CompoundButton compoundButton, boolean z) {
        if (Intrinsics.LJFF(((BonusInfo) c04jf.l0).redeemCanBeUsed, Boolean.TRUE)) {
            ((USHalfPageOrderSummaryFragment) c04jf.l1).gS().q = compoundButton.isChecked();
            OrderSubmitAssemViewModel.OS2(((USHalfPageOrderSummaryFragment) c04jf.l1).gS(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.USE_BONUS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        }
        C1748720vbi.LIZLLL((C21411818qq) c04jf.l2, new C10516049i(), new AwS367S0200000_1((USHalfPageOrderSummaryFragment) c04jf.l1, (USHalfPageOrderSummaryFragment) c04jf.l3, (HashMap<String, Object>) 338));
    }

    public static final void onCheckedChanged$4(C04JF c04jf, CompoundButton compoundButton, boolean z) {
        if (Intrinsics.LJFF(((BonusInfo) c04jf.l0).redeemCanBeUsed, Boolean.TRUE)) {
            C1748720vbi.LIZLLL((C21411818qq) c04jf.l1, new C10516049i(), new AwS367S0200000_1((PlatformDiscountsCell) c04jf.l2, (HashMap) c04jf.l3, 367));
            C1748720vbi.LIZLLL((C21411818qq) c04jf.l1, new C049Y(), new AwS367S0200000_1(compoundButton, (PlatformDiscountsCell) c04jf.l2, 368));
            ((PlatformDiscountsCell) c04jf.l2).T5().f348X = true;
            ((PlatformDiscountsCell) c04jf.l2).T5().q = compoundButton.isChecked();
            OrderSubmitAssemViewModel.OS2(((PlatformDiscountsCell) c04jf.l2).T5(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.USE_BONUS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
            return;
        }
        compoundButton.setChecked(!z);
        BonusInfo bonusInfo = (BonusInfo) c04jf.l0;
        String str = bonusInfo.nonRedeemReason;
        if (str == null) {
            return;
        }
        C21411818qq c21411818qq = (C21411818qq) c04jf.l1;
        C1389880mGw c1389880mGw = new C1389880mGw(c21411818qq);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LIZLLL(3000L);
        c1389880mGw.LJIIJ();
        C1748720vbi.LIZLLL(c21411818qq, new AnonymousClass0481(), new AwS580S0100000_1(bonusInfo, 1008));
    }

    public C04JF(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
        this.l3 = obj4;
    }
}
