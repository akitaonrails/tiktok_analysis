package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcRichtextV3FeatureModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.AwS3S2102000_1;

/* JADX INFO: renamed from: X.034e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7834034e {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, ECRichText eCRichText, String str, String str2, int i2, int i3) {
        int i4 = i2;
        String str3 = str2;
        if ((i3 & 8) != 0) {
            str3 = "";
        }
        if ((i3 & 16) != 0) {
            i4 = 3;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcRichtextV3FeatureModel ecRichtextV3FeatureModel = C7833034d.LIZ;
        EcRichtextV3FeatureModel ecRichtextV3FeatureModel2 = (EcRichtextV3FeatureModel) settingsManagerLIZLLL.LJIIIIZZ("ec_richtext_v3_feature", EcRichtextV3FeatureModel.class, ecRichtextV3FeatureModel);
        if (ecRichtextV3FeatureModel2 != null) {
            ecRichtextV3FeatureModel = ecRichtextV3FeatureModel2;
        }
        if (!ecRichtextV3FeatureModel.sourceBlackList.contains(str)) {
            C1018703yb.LIZLLL("rd_tiktokec_richtext_monitor", new AwS3S2102000_1(i, eCRichText, str3, str, i4, 0));
        }
    }
}
