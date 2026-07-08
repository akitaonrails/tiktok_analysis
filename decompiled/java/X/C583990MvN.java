package X;

import com.ss.android.ugc.aweme.ab.DynamicPullStreamConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583990MvN extends C09AY implements Function0<DynamicPullStreamConfig> {
    public C583990MvN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.DynamicPullStreamConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final DynamicPullStreamConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        DynamicPullStreamConfig dynamicPullStreamConfig = C583980MvM.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(DynamicPullStreamConfig.class, dynamicPullStreamConfig, "live_preview_dynamic_pre_pull_config", true);
        return LJJII != 0 ? LJJII : dynamicPullStreamConfig;
    }
}
