package com.bytedance.android.live.setting;

import X.C00FN;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_toolbar_load_optimize_ecom_enable")
public final class LiveToolbarLoadOptEcomEnableSetting {
    public static final LiveToolbarLoadOptEcomEnableSetting INSTANCE = new LiveToolbarLoadOptEcomEnableSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_toolbar_load_optimize_ecom_enable", DEFAULT);

    public final boolean disableOpt(Room room) {
        String str;
        int i = value;
        if ((i & 1) == 1) {
            if (room != null) {
                try {
                    CommerceStruct commerceStruct = room.getCommerceStruct();
                    if (commerceStruct != null && (str = commerceStruct.oecInitDataString) != null && str.length() > 0) {
                        if (new JSONObject(commerceStruct.oecInitDataString).optInt("product_num", -1) > 0) {
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isEcom ");
                    sbLIZ.append(th);
                    C20441214yg.LJ("ArgumentsBuilder", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return false;
        }
        if ((i & 2) != 2 || room == null || !C00FN.LIZJ(room)) {
            return false;
        }
        return true;
    }
}
