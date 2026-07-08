package X;

import com.bytedance.helios.api.config.AgControlConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841680X0c extends C09AY implements Function0<AgControlConfig> {
    public C841680X0c() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.helios.api.config.AgControlConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AgControlConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AgControlConfig agControlConfig = C841690X0d.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(AgControlConfig.class, agControlConfig, "ag_control_enable", true);
        return LJJII != 0 ? LJJII : agControlConfig;
    }
}
