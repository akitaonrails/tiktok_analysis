package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0X7F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X7F {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str) {
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            try {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL;
                if (sparkContext == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("user_dvg_");
                sbLIZ.append(str);
                C189200o6.m2constructorimpl(Long.valueOf(C1530570pvr.LIZIZ(sparkContext, C2188811AlT.LIZIZ(sbLIZ))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
