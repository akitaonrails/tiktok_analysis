package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: renamed from: X.0vtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759650vtL {
    public static final C1759650vtL LIZ = new C1759650vtL();

    public static void LIZ(PdpComponentCard pdpComponentCard, PdpViewModel pdpViewModel, InterfaceC1748810vbr interfaceC1748810vbr, String str) {
        Integer num = pdpComponentCard.bizType;
        int value = EnumC1759660vtM.BIZ_TYPE_COUPON.getValue();
        if (num != null && num.intValue() == value && interfaceC1748810vbr != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C04CK() { // from class: X.0vgK
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("coupon_id", new C1747940vaS[0]), new C1748840vbu("coupon_type_id", new C1747940vaS[0]), new C1748840vbu("coupon_type_info", new C1747940vaS[0]), new C1748840vbu("coupon_cost_role", new C1747940vaS[0]), new C1748840vbu("coupon_zone", new C1747940vaS[0]), new C1748840vbu("coupon_ignore_type", new C1747940vaS[0]), new C1748840vbu("coupon_threshold_value", new C1747940vaS[0]), new C1748840vbu("coupon_amount_value", new C1747940vaS[0]), new C1748840vbu("benefit_type", new C1747940vaS[0]));
                }
            }, new AwS109S1200000_26(pdpComponentCard, pdpViewModel, str, 17));
        }
    }

    public static void LIZIZ(PdpComponent pdpComponent, PdpViewModel pdpViewModel, View view, String str) {
        C1054004Ag c1054004Ag;
        Integer num = pdpComponent.bizType;
        int value = EnumC1759660vtM.BIZ_TYPE_COUPON.getValue();
        if (num != null && num.intValue() == value) {
            if (view != null) {
                C1748720vbi.LIZLLL(view, new C1751550vgH(), new AwS392S0200000_26(pdpComponent, pdpViewModel, 114));
            }
        } else {
            int value2 = EnumC1759660vtM.BIZ_TYPE_CAMPAIGN.getValue();
            if (num != null && num.intValue() == value2) {
                if (view != null) {
                    C1748720vbi.LIZLLL(view, new C1748030vab(), new AwS605S0100000_26(pdpComponent, 532));
                }
            } else {
                int value3 = EnumC1759660vtM.BIZ_TYPE_ADD_ON_ENTRANCE.getValue();
                if (num != null && num.intValue() == value3 && pdpViewModel != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
                    Map<String, Object> mapLIZ = C1010603xI.LIZ(pdpComponent.daInfo);
                    InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                    if (interfaceC1748810vbrLJJIJLIJ != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04CK() { // from class: X.049m
                            @Override // X.AbstractC1748790vbp
                            public final C1748850vbv LIZ() {
                                C323580CmK c323580CmK = new C323580CmK(9);
                                c323580CmK.LIZ(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("page_name", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("entrance_info", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("entrance_zone", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("campaign_id", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("campaign_type", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("campaign_zone", new C1747940vaS[0]));
                                c323580CmK.LIZ(new C1748840vbu("coupon_zone", new C1747940vaS[0]));
                                c323580CmK.LIZIZ(C048U.LIZ);
                                return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                            }
                        }, new AwS86S1200000_1(c1054004Ag, mapLIZ, 42));
                    }
                }
            }
        }
        Integer num2 = pdpComponent.componentType;
        int value4 = EnumC1759910vtl.COMPONENT_BUTTON.getValue();
        if (num2 != null && num2.intValue() == value4 && view != null) {
            C1748720vbi.LIZLLL(view, new C049Y(), new AwS76S1000000_26(str, 16));
        }
    }
}
