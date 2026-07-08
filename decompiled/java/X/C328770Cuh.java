package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.experiment.QueryExpConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328770Cuh extends C09AY implements Function0<QueryExpConfig> {
    public C328770Cuh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.experiment.QueryExpConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final QueryExpConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        QueryExpConfig queryExpConfig = C328780Cui.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_peer_ab_experiment_config", QueryExpConfig.class, queryExpConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : queryExpConfig;
    }
}
