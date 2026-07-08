package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.api.recommend.ProcessorRemoteConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604990rrt extends C09AY implements Function0<ProcessorRemoteConfig> {
    public C1604990rrt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.api.recommend.ProcessorRemoteConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ProcessorRemoteConfig invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("feed_request_processor_config", ProcessorRemoteConfig.class, C1604980rrs.LIZ);
    }
}
