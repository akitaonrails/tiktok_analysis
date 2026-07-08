package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ectracker.EcTrackerConfigModel;

/* JADX INFO: renamed from: X.0XQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848520XQk {
    public static final EcTrackerConfigModel LIZ = new EcTrackerConfigModel(false, false, Long.MAX_VALUE, C13BV.INSTANCE);

    public static final EcTrackerConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcTrackerConfigModel ecTrackerConfigModel = LIZ;
        EcTrackerConfigModel ecTrackerConfigModel2 = (EcTrackerConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_tracker_config", EcTrackerConfigModel.class, ecTrackerConfigModel);
        return ecTrackerConfigModel2 != null ? ecTrackerConfigModel2 : ecTrackerConfigModel;
    }
}
