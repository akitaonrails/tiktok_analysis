package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1pSDK implements AFg1vSDK {
    public final Context AFInAppEventType;
    public final AppsFlyerProperties values;

    @Override // com.appsflyer.internal.AFg1vSDK
    public final AFg1qSDK valueOf() {
        String string;
        if (!Boolean.parseBoolean(this.values.getString("enableTCFDataCollection"))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFInAppEventType);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                str = string;
            }
            return new AFg1qSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFg1fSDK.e$default(AFLogger.INSTANCE, AFg1aSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }

    public AFg1pSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        this.AFInAppEventType = context;
        this.values = appsFlyerProperties;
    }
}
