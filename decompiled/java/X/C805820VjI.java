package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.OutAppPushWsReconnectConfigModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0VjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805820VjI {
    public static final OutAppPushWsReconnectConfigModel LIZ = new OutAppPushWsReconnectConfigModel(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, false, LSPassThroughRecordSizeConfig.DEFAULT, 800000, 1750000);

    public static final OutAppPushWsReconnectConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OutAppPushWsReconnectConfigModel outAppPushWsReconnectConfigModel = LIZ;
        OutAppPushWsReconnectConfigModel outAppPushWsReconnectConfigModel2 = (OutAppPushWsReconnectConfigModel) settingsManagerLIZLLL.LJIIIIZZ("out_app_push_ws_reconnect_config", OutAppPushWsReconnectConfigModel.class, outAppPushWsReconnectConfigModel);
        return outAppPushWsReconnectConfigModel2 != null ? outAppPushWsReconnectConfigModel2 : outAppPushWsReconnectConfigModel;
    }
}
