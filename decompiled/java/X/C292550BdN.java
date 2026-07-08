package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.DeeplinkAttributionConfig;

/* JADX INFO: renamed from: X.0BdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292550BdN {
    public static final DeeplinkAttributionConfig LIZ = new DeeplinkAttributionConfig(true, 200);

    public static final DeeplinkAttributionConfig LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            DeeplinkAttributionConfig deeplinkAttributionConfig = LIZ;
            DeeplinkAttributionConfig deeplinkAttributionConfig2 = (DeeplinkAttributionConfig) c0c64LJIILLIIL.LJJIIJ(true, "deeplink_pass_through_config", 31744, DeeplinkAttributionConfig.class, deeplinkAttributionConfig, 1);
            return deeplinkAttributionConfig2 != null ? deeplinkAttributionConfig2 : deeplinkAttributionConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
