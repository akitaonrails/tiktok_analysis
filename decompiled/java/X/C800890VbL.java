package X;

import com.ss.android.ugc.aweme.experiment.CommitConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800890VbL extends C09AY implements Function0<CommitConfig> {
    public C800890VbL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.CommitConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final CommitConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CommitConfig commitConfig = C800880VbK.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(CommitConfig.class, commitConfig, "commit_opt_scene_ab", true);
        return LJJII != 0 ? LJJII : commitConfig;
    }
}
