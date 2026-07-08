package X;

import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EC9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EC9 extends C09AY implements Function0<LandInboxExperiment.Meta> {
    public C1EC9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment$Meta, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LandInboxExperiment.Meta invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LandInboxExperiment.Meta meta = LandInboxExperiment.LIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "inbox_cold_launch_land_config", 31744, LandInboxExperiment.Meta.class, meta, 2);
        return LJJIIJ != 0 ? LJJIIJ : meta;
    }
}
