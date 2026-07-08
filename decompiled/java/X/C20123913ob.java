package X;

import com.ss.android.ugc.aweme.compliance.api.settings.IKidsPumbaaSettingsService;
import com.ss.android.ugc.aweme.compliance.api.settings.SettingsModel;
import com.ss.android.ugc.aweme.compliance.api.settings.StrictModeConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.13ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20123913ob {
    public static volatile String LIZ;

    public static boolean LIZ() {
        SettingsModel settingsModelLIZ;
        StrictModeConfig strictModeConfig;
        IKidsPumbaaSettingsService iKidsPumbaaSettingsService = (IKidsPumbaaSettingsService) PluggableExtentionKt.pluggableSpi(IKidsPumbaaSettingsService.class);
        return (iKidsPumbaaSettingsService == null || (settingsModelLIZ = iKidsPumbaaSettingsService.LIZ()) == null || (strictModeConfig = settingsModelLIZ.strictModeConfigs.get("kids_mode_overseas")) == null || !strictModeConfig.fuseApiIds.contains(102003)) ? false : true;
    }
}
