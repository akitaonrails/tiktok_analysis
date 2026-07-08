package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.DeeplinkBcmConfigModel;

/* JADX INFO: renamed from: X.014r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2751014r {
    public static final DeeplinkBcmConfigModel LIZ = new DeeplinkBcmConfigModel(null, null, 3, null);

    public static final DeeplinkBcmConfigModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            DeeplinkBcmConfigModel deeplinkBcmConfigModel = LIZ;
            DeeplinkBcmConfigModel deeplinkBcmConfigModel2 = (DeeplinkBcmConfigModel) settingsManagerLIZLLL.LJIIIIZZ("deeplink_bcm_config", DeeplinkBcmConfigModel.class, deeplinkBcmConfigModel);
            return deeplinkBcmConfigModel2 != null ? deeplinkBcmConfigModel2 : deeplinkBcmConfigModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
