package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303600BvC extends C09AY implements Function0<Boolean> {
    public C303600BvC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            z = ((SparkIABOptimizeConfig.SparkIABOptimizeConfigModel) SparkIABOptimizeConfig.LJ.getValue()).enableSkipMobPureJump;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = SparkIABOptimizeConfig.LIZ.enableSkipMobPureJump;
        }
        return Boolean.valueOf(z);
    }
}
