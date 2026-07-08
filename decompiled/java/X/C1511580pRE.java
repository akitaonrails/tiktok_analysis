package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.ab.ExpandSmartCommentConfig;
import com.ss.android.ugc.aweme.ml.api.SmartCommentConfig;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0pRE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511580pRE {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(260));

    public static SmartCommentConfig LIZ(String str) {
        Map<String, SmartCommentConfig> map;
        SmartCommentConfig smartCommentConfig;
        if (str == null) {
            return null;
        }
        ExpandSmartCommentConfig expandSmartCommentConfig = (ExpandSmartCommentConfig) LIZ.getValue();
        if (expandSmartCommentConfig == null || (map = expandSmartCommentConfig.preloadConfigs) == null || (smartCommentConfig = map.get(str)) == null) {
            return (SmartCommentConfig) C1511640pRK.LIZ.getValue();
        }
        return smartCommentConfig;
    }

    public static boolean LIZIZ(String str) {
        Map<String, SmartCommentConfig> map;
        Set<String> setKeySet;
        Map<String, SmartCommentConfig> map2;
        if (str == null) {
            return false;
        }
        try {
            C01GW c01gw = LIZ;
            ExpandSmartCommentConfig expandSmartCommentConfig = (ExpandSmartCommentConfig) c01gw.getValue();
            if (expandSmartCommentConfig != null && (map = expandSmartCommentConfig.preloadConfigs) != null && (setKeySet = map.keySet()) != null && setKeySet.contains(str)) {
                ExpandSmartCommentConfig expandSmartCommentConfig2 = (ExpandSmartCommentConfig) c01gw.getValue();
                if (expandSmartCommentConfig2 == null || (map2 = expandSmartCommentConfig2.preloadConfigs) == null || map2.get(str) == null) {
                    SmartCommentConfig smartCommentConfig = (SmartCommentConfig) C1511640pRK.LIZ.getValue();
                    if (smartCommentConfig != null) {
                        if (smartCommentConfig.getTriggerSceneId() > 0) {
                        }
                    }
                }
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
