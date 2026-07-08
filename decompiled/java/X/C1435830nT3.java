package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.aigc.aifingerprint.AIFingerprintConfigModel;

/* JADX INFO: renamed from: X.0nT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435830nT3 {
    public static final AIFingerprintConfigModel LIZ = new AIFingerprintConfigModel("lens_wm_embed_conv11", "anti_cut_resize_0", 1, 0, false, "999", 3, 1000);

    public static final AIFingerprintConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AIFingerprintConfigModel aIFingerprintConfigModel = LIZ;
        AIFingerprintConfigModel aIFingerprintConfigModel2 = (AIFingerprintConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ai_fingerprint_config", AIFingerprintConfigModel.class, aIFingerprintConfigModel);
        return aIFingerprintConfigModel2 != null ? aIFingerprintConfigModel2 : aIFingerprintConfigModel;
    }
}
