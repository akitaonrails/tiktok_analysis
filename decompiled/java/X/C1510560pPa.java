package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.feature.expriment.ForceUploadConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510560pPa extends C09AY implements Function0<ForceUploadConfig> {
    public C1510560pPa() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ForceUploadConfig invoke() {
        try {
            C0C64.LJIILLIIL().getClass();
            ForceUploadConfig forceUploadConfig = (ForceUploadConfig) C0C64.LJJIFFI(true, "force_upload_monitor", 31744, ForceUploadConfig.class, 2);
            return forceUploadConfig == null ? C1510550pPZ.LIZ : forceUploadConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1510550pPZ.LIZ;
        }
    }
}
