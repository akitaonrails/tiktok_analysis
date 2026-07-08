package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FeaturePollExperimentConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117600cY {
    public static final FeaturePollExperimentConfig LIZ = new FeaturePollExperimentConfig(false, 0, 0, 0, false, 0, 0, 0, 0, 0, null, null, null, 8191, null);

    public static final FeaturePollExperimentConfig LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (FeaturePollExperimentConfig) C0C64.LJIILLIIL().LJJII(FeaturePollExperimentConfig.class, LIZ, "exit_reason_feature_poll_config", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FeaturePollExperimentConfig featurePollExperimentConfig = (FeaturePollExperimentConfig) c098200Yq;
        return featurePollExperimentConfig == null ? LIZ : featurePollExperimentConfig;
    }

    public static Map LIZIZ(Map map) {
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = a0.LJLIIIL(str).toString();
                String string2 = a0.LJLIIIL(str2).toString();
                if (string.length() != 0 && string2.length() != 0) {
                    linkedHashMap.put(string, string2);
                    if (linkedHashMap.size() >= 50) {
                        break;
                    }
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }
}
