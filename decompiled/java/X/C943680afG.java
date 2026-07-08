package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.text.a0;
import webcast.data.MultiGuestPlayInfo;

/* JADX INFO: renamed from: X.0afG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943680afG {
    public static final LruCache<String, MultiGuestPlayInfo> LIZ = new LruCache<>(5);

    public static Integer LIZ(String str) {
        Map<Integer, Integer> map;
        try {
            MultiGuestPlayInfo multiGuestPlayInfo = LIZ.get(str);
            if (multiGuestPlayInfo == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMultiGuestPlaySceneConfigList return as roomId:");
                sbLIZ.append(str);
                sbLIZ.append(" not found value");
                C20441214yg.LIZIZ("GuestSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            Map<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig> map2 = multiGuestPlayInfo.playSceneToConfigMap;
            int i = 2;
            if (!map2.containsKey(2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getMultiGuestPlaySceneConfigList return as roomId:");
                sbLIZ2.append(str);
                sbLIZ2.append(" playScene");
                sbLIZ2.append(2);
                sbLIZ2.append(" not contains");
                C20441214yg.LIZIZ("GuestSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ2));
                return 0;
            }
            MultiGuestPlayInfo.MultiGuestPlayConfig multiGuestPlayConfig = map2.get(2);
            if (multiGuestPlayConfig != null && (map = multiGuestPlayConfig.featureConfigMap) != null) {
                Integer num = map.get(1001);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getMultiGuestPlaySceneConfigList return as roomId:");
                sbLIZ3.append(str);
                sbLIZ3.append(" playScene");
                sbLIZ3.append(2);
                sbLIZ3.append(" value:");
                sbLIZ3.append(num);
                C20441214yg.LIZIZ("GuestSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ3));
                if (num != null && num.intValue() == 10010001) {
                    i = 1;
                } else if (num == null || num.intValue() != 10010002) {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getMultiGuestPlaySceneConfigList roomId:");
            sbLIZ4.append(str);
            sbLIZ4.append(" notContains");
            C20441214yg.LJFF("GuestSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ4), e);
            return null;
        }
    }

    public static void LIZIZ(String str, MultiGuestPlayInfo multiGuestPlayInfo) {
        if (!a0.LJJJIL(str) && multiGuestPlayInfo != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateValueFromEnterRoom update roomId:");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("GuestSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ));
            LIZ.put(str, multiGuestPlayInfo);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateValueFromEnterRoom return as roomId:");
        sbLIZ2.append(str);
        sbLIZ2.append(" isBlank or multiGuestPlayInfo is null");
        C20441214yg.LIZIZ("GuestSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
