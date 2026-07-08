package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.ab.ExpandSmartCommentConfig;
import com.ss.android.ugc.aweme.ml.api.SmartCommentConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511590pRF {
    public static boolean LIZ(String str) {
        Map<String, SmartCommentConfig> map;
        SmartCommentConfig smartCommentConfig;
        if (!Intrinsics.LJFF(str, "homepage_hot") ? C1511580pRE.LIZIZ(str) : (smartCommentConfig = (SmartCommentConfig) C1511640pRK.LIZ.getValue()) != null && smartCommentConfig.getTriggerSceneId() > 0) {
            return true;
        }
        if (str != null) {
            try {
                ExpandSmartCommentConfig expandSmartCommentConfig = (ExpandSmartCommentConfig) C1511600pRG.LIZ.getValue();
                if (expandSmartCommentConfig != null && (map = expandSmartCommentConfig.preloadConfigs) != null) {
                    if (map.get(str) != null) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
