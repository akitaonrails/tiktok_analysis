package X;

import com.ss.android.ugc.aweme.ab.HeadStateChangeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0roA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602680roA extends C09AY implements Function0<HeadStateChangeConfig> {
    public C1602680roA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.HeadStateChangeConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final HeadStateChangeConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        HeadStateChangeConfig headStateChangeConfig = C1602670ro9.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(HeadStateChangeConfig.class, headStateChangeConfig, "live_head_state_change_setting", true);
        return LJJII != 0 ? LJJII : headStateChangeConfig;
    }
}
