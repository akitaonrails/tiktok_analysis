package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.exp.DMResourceSampleRateSettingsData;
import java.util.Map;

/* JADX INFO: renamed from: X.07Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1844007Kc {
    public static final DMResourceSampleRateSettingsData LIZ;

    static {
        Object c098200Yq;
        try {
            c098200Yq = (DMResourceSampleRateSettingsData) SettingsManager.LIZLLL().LJIIIIZZ("dm_resource_sample_rate_settings", DMResourceSampleRateSettingsData.class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        DMResourceSampleRateSettingsData dMResourceSampleRateSettingsData = (DMResourceSampleRateSettingsData) c098200Yq;
        LIZ = dMResourceSampleRateSettingsData != null ? dMResourceSampleRateSettingsData : null;
    }

    public static double LIZ(String str) {
        Map<String, Double> map;
        Double d;
        DMResourceSampleRateSettingsData dMResourceSampleRateSettingsData = LIZ;
        if (dMResourceSampleRateSettingsData != null && (map = dMResourceSampleRateSettingsData.separateSampleData) != null && (d = map.get(str)) != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }
}
