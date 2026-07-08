package X;

import com.ss.android.ugc.feed.platform.ab.ComponentSpacingCheckConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RPM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPM extends C09AY implements Function0<ComponentSpacingCheckConfig> {
    public C0RPM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.ab.ComponentSpacingCheckConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ComponentSpacingCheckConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ComponentSpacingCheckConfig componentSpacingCheckConfig = C0RPL.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(ComponentSpacingCheckConfig.class, componentSpacingCheckConfig, "enable_check_feed_component_spacing", true);
        return LJJII != 0 ? LJJII : componentSpacingCheckConfig;
    }
}
