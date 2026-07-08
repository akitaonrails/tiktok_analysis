package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EED, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EED extends C09AY implements Function0<InnerPushExperienceOptimize.Config> {
    public C1EED() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize$Config, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InnerPushExperienceOptimize.Config invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        InnerPushExperienceOptimize.Config config = InnerPushExperienceOptimize.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(InnerPushExperienceOptimize.Config.class, config, "inner_push_experience_optimize", true);
        return LJJII != 0 ? LJJII : config;
    }
}
