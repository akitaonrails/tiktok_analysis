package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcRichtextV3FeatureModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7832034c {
    public static final boolean LIZLLL() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            return true;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService2).getChannel(), "local_test");
    }

    public static final boolean LJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcRichtextV3FeatureModel ecRichtextV3FeatureModel = C7833034d.LIZ;
        EcRichtextV3FeatureModel ecRichtextV3FeatureModel2 = (EcRichtextV3FeatureModel) settingsManagerLIZLLL.LJIIIIZZ("ec_richtext_v3_feature", EcRichtextV3FeatureModel.class, ecRichtextV3FeatureModel);
        if (ecRichtextV3FeatureModel2 != null) {
            ecRichtextV3FeatureModel = ecRichtextV3FeatureModel2;
        }
        return ecRichtextV3FeatureModel.enableCheck;
    }

    public static final void LIZ(ECRichText eCRichText, int i, String str, String str2) {
        if (!LJ()) {
            return;
        }
        if (i >= 0 && i < 3) {
            return;
        }
        C7834034e.LIZ(302, eCRichText, str, str2, 0, 16);
    }

    public static final void LIZIZ(ECRichText eCRichText, Size size, String str, String str2) {
        Integer num;
        if (!LJ()) {
            return;
        }
        Integer num2 = size.width;
        if (num2 == null || num2.intValue() <= 0 || (num = size.height) == null || num.intValue() <= 0) {
            C7834034e.LIZ(305, eCRichText, str, str2, 0, 16);
        }
    }

    public static void LIZJ(ECRichText eCRichText, TextAttribute textAttribute, String str, String str2, boolean z, int i) {
        Integer num;
        Integer num2;
        int iIntValue;
        CustomColor customColor;
        String str3;
        CustomColor customColor2;
        String str4;
        String str5 = str2;
        if ((i & 8) != 0) {
            str5 = "";
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if (LJ()) {
            if (!z) {
                if ((textAttribute == null || textAttribute.font == null) && eCRichText.textAttribute == null) {
                    C7834034e.LIZ(202, eCRichText, str, null, 2, 8);
                }
                if ((textAttribute == null || textAttribute.fontColor == null || textAttribute == null || (customColor = textAttribute.fontColor) == null || (str3 = customColor.color) == null || str3.length() == 0 || textAttribute == null || (customColor2 = textAttribute.fontColor) == null || (str4 = customColor2.darkColor) == null || str4.length() == 0) && eCRichText.textAttribute == null) {
                    C7834034e.LIZ(306, eCRichText, str, null, 3, 8);
                }
            }
            if (textAttribute != null) {
                Font font = textAttribute.font;
                if (font != null && (num2 = font.fontWeight) != null && (1 > (iIntValue = num2.intValue()) || iIntValue >= 4)) {
                    C7834034e.LIZ(303, eCRichText, str, str5, 0, 16);
                }
                Font font2 = textAttribute.font;
                if (font2 != null && (num = font2.fontClass) != null) {
                    int iIntValue2 = num.intValue();
                    if (iIntValue2 >= 0 && iIntValue2 < 11) {
                        return;
                    }
                    C7834034e.LIZ(304, eCRichText, str, str5, 0, 16);
                }
            }
        }
    }
}
