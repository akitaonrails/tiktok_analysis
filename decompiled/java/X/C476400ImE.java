package X;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsDataProvider;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ImE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476400ImE implements SettingsDataProvider {
    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final Map<String, LiveSettingModel> getLiveSettingMap() {
        try {
            Object objNewInstance = Class.forName("com.bytedance.android.live.settings.initializer.SettingsInitializer").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof InterfaceC476410ImF) {
                return ((InterfaceC476410ImF) objNewInstance).getModelMap();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            HashMap map = new HashMap(1);
            map.put("error_msg", e.toString());
            map.put("error_event", "getModelsMap");
            C1CC2.LJII(1, "ttlive_get_settings_error", map);
        }
        return new LinkedHashMap();
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final Map<String, CacheLevel> getPreciseLiveSettings() {
        try {
            Object objNewInstance = Class.forName("com.bytedance.android.live.settings.initializer.SettingsInitializer").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof InterfaceC476410ImF) {
                return ((InterfaceC476410ImF) objNewInstance).getPreciseSettingInfo();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            HashMap map = new HashMap(1);
            map.put("error_msg", e.toString());
            map.put("error_event", "getPreciseSettingInfo");
            C1CC2.LJII(1, "ttlive_get_settings_error", map);
        }
        return new LinkedHashMap();
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final String getCurrentUid() {
        return C471030IdZ.LIZ().getEnableUserInfoFetchOpt() ? String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()) : String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final void deleteUselessExposedVids(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteUselessExposedVids: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LivePreciseExposure", C2188811AlT.LIZIZ(sbLIZ));
        ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).deleteUselessExposedVids(str);
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final void setExposedVids(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExposedVids: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LivePreciseExposure", C2188811AlT.LIZIZ(sbLIZ));
        ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).setExposedVids(str);
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final void setExposedVidsByUid(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExposedVidsByUid: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LivePreciseExposure", C2188811AlT.LIZIZ(sbLIZ));
        ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).setExposedVidsByUid(str);
    }
}
