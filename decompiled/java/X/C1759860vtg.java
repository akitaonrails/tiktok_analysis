package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.icon.IconComponentData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.text.TextComponentData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.thumbnail.ThumbnailComponentData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS488S0200000_26;

/* JADX INFO: renamed from: X.0vtg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759860vtg {
    public static final C1759860vtg LIZ = new C1759860vtg();

    public static Object LIZ(PdpComponent pdpComponent) {
        Integer num;
        Integer num2;
        String str;
        if (pdpComponent == null) {
            num2 = null;
        } else {
            try {
                num2 = pdpComponent.componentType;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PdpComponentFactory: create component model error: ");
                if (pdpComponent != null) {
                    num = pdpComponent.componentType;
                } else {
                    num = null;
                }
                sbLIZ.append(num);
                C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int value = EnumC1759910vtl.COMPONENT_TEXT.getValue();
        if (num2 != null && num2.intValue() == value) {
            String str2 = pdpComponent.data;
            if (str2 != null) {
                Gson gson = C051O.LIZ;
                Object objLJ = C051O.LJ(TextComponentData.class, str2);
                if (objLJ == null) {
                    return null;
                }
                return objLJ;
            }
        } else {
            int value2 = EnumC1759910vtl.COMPONENT_ICON.getValue();
            if (num2 != null && num2.intValue() == value2) {
                String str3 = pdpComponent.data;
                if (str3 != null) {
                    Gson gson2 = C051O.LIZ;
                    Object objLJ2 = C051O.LJ(IconComponentData.class, str3);
                    if (objLJ2 == null) {
                        return null;
                    }
                    return objLJ2;
                }
            } else {
                int value3 = EnumC1759910vtl.COMPONENT_BUTTON.getValue();
                if (num2 != null && num2.intValue() == value3) {
                    String str4 = pdpComponent.data;
                    if (str4 != null) {
                        Gson gson3 = C051O.LIZ;
                        Object objLJ3 = C051O.LJ(ButtonComponentData.class, str4);
                        if (objLJ3 == null) {
                            return null;
                        }
                        return objLJ3;
                    }
                } else {
                    int value4 = EnumC1759910vtl.COMPONENT_COUNTDOWN.getValue();
                    if (num2 == null || num2.intValue() != value4) {
                        int value5 = EnumC1759910vtl.COMPONENT_THUMBNAIL.getValue();
                        if (num2 != null && num2.intValue() == value5 && (str = pdpComponent.data) != null) {
                            Gson gson4 = C051O.LIZ;
                            Object objLJ4 = C051O.LJ(ThumbnailComponentData.class, str);
                            if (objLJ4 == null) {
                                return null;
                            }
                            return objLJ4;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void LIZIZ(AbstractC1759870vth abstractC1759870vth, PdpComponent pdpComponent, PdpViewModel pdpViewModel) {
        abstractC1759870vth.LJ = new AwS488S0200000_26(pdpComponent, pdpViewModel, 3);
        abstractC1759870vth.LJFF = new AwS461S0200000_26(pdpComponent, pdpViewModel, 9);
    }
}
