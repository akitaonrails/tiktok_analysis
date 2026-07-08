package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0C6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308340C6u {
    public static final boolean LIZ() {
        float fLIZIZ = LIZIZ();
        return fLIZIZ > 0.0f && fLIZIZ <= 1.0f;
    }

    public static final float LIZIZ() {
        try {
            return CastFloatProtector.parseFloat(C0C64.LJIILLIIL().LJJ(31744, "studio_hippo_attribution_sample_rate_num_string", "-1", true));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1.0f;
        }
    }
}
