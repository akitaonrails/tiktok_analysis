package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcOspVerifyCenterStyleModel;

/* JADX INFO: renamed from: X.03hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C914103hj {
    public static final EcOspVerifyCenterStyleModel LIZ = new EcOspVerifyCenterStyleModel(false);

    public static final EcOspVerifyCenterStyleModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcOspVerifyCenterStyleModel ecOspVerifyCenterStyleModel = LIZ;
        EcOspVerifyCenterStyleModel ecOspVerifyCenterStyleModel2 = (EcOspVerifyCenterStyleModel) settingsManagerLIZLLL.LJIIIIZZ("ec_osp_verify_center_style", EcOspVerifyCenterStyleModel.class, ecOspVerifyCenterStyleModel);
        return ecOspVerifyCenterStyleModel2 != null ? ecOspVerifyCenterStyleModel2 : ecOspVerifyCenterStyleModel;
    }
}
