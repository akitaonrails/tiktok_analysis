package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.ECLiveAnimDowngradeSetting;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1E2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274801E2c {
    public static final ECLiveAnimDowngradeSetting LIZ = new ECLiveAnimDowngradeSetting(false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(141));

    public static ECLiveAnimDowngradeSetting LIZ() {
        if (C1972307o1.LIZ() > C0C64.LJIILLIIL().LJIJ(31744, 6, "ec_live_low_device_score", true)) {
            return LIZ;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ECLiveAnimDowngradeSetting eCLiveAnimDowngradeSetting = LIZ;
        ECLiveAnimDowngradeSetting eCLiveAnimDowngradeSetting2 = (ECLiveAnimDowngradeSetting) c0c64LJIILLIIL.LJJII(ECLiveAnimDowngradeSetting.class, eCLiveAnimDowngradeSetting, "ec_live_low_end_anim_downgrade", true);
        return eCLiveAnimDowngradeSetting2 != null ? eCLiveAnimDowngradeSetting2 : eCLiveAnimDowngradeSetting;
    }
}
