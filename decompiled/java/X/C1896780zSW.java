package X;

import com.bytedance.touchpoint.core.experiment.IncentiveNewUserActivityConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896780zSW extends C09AY implements Function0<IncentiveNewUserActivityConfig> {
    public C1896780zSW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.touchpoint.core.experiment.IncentiveNewUserActivityConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IncentiveNewUserActivityConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        IncentiveNewUserActivityConfig incentiveNewUserActivityConfig = C1896770zSV.LIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "inc_new_user_activity_config", 31744, IncentiveNewUserActivityConfig.class, incentiveNewUserActivityConfig, 1);
        return LJJIIJ != 0 ? LJJIIJ : incentiveNewUserActivityConfig;
    }
}
