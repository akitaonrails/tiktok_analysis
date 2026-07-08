package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings.PinCardDelayConfig;

/* JADX INFO: renamed from: X.0BeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293290BeZ {
    public static final PinCardDelayConfig LIZ = new PinCardDelayConfig(0, true);

    public static PinCardDelayConfig LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PinCardDelayConfig pinCardDelayConfig = LIZ;
            PinCardDelayConfig pinCardDelayConfig2 = (PinCardDelayConfig) c0c64LJIILLIIL.LJJII(PinCardDelayConfig.class, pinCardDelayConfig, "ttec_pin_card_delay", true);
            return pinCardDelayConfig2 != null ? pinCardDelayConfig2 : pinCardDelayConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
