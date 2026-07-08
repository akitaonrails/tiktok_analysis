package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostMonitorConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostMonitorRemoteConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078990eBV {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZ(String str, String str2) {
        Boolean boolValueOf;
        Integer num;
        int iIntValue;
        Boolean boolValueOf2;
        if (C958370b2x.LIZJ()) {
            return true;
        }
        LiveCoHostMonitorConfig value = LiveCoHostMonitorRemoteConfigSetting.INSTANCE.getValue();
        if (!value.isEnable) {
            return true;
        }
        if (value.offlineServiceConfig.contains(str)) {
            return false;
        }
        String serverDeviceId = null;
        if (value.offlineEventConfig.containsKey(str)) {
            List<String> list = value.offlineEventConfig.get(str);
            if (list != null) {
                boolValueOf2 = Boolean.valueOf(list.contains(str2));
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                return false;
            }
        }
        if (value.onlineEventConfig.containsKey(str)) {
            Map<String, Integer> map = value.onlineEventConfig.get(str);
            if (map != null) {
                boolValueOf = Boolean.valueOf(map.containsKey(str2));
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf) || map == null || (num = map.get(str2)) == null || (iIntValue = num.intValue()) >= 100) {
                return true;
            }
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            if (LIZ == 0) {
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                if (iHostAppContext != null) {
                    serverDeviceId = iHostAppContext.getServerDeviceId();
                }
                LIZ = C950220apo.LJJ(serverDeviceId);
            }
            long j = LIZ % ((long) 100);
            if (1 > j || j > iIntValue) {
                return false;
            }
        }
        return true;
    }
}
