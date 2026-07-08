package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.performance.FeedComponentPerfSettingsData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692120RCw extends C09AY implements Function0<FeedComponentPerfSettingsData> {
    public C692120RCw() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.performance.FeedComponentPerfSettingsData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentPerfSettingsData invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FeedComponentPerfSettingsData feedComponentPerfSettingsData = C692110RCv.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("feed_component_perf_settings", FeedComponentPerfSettingsData.class, feedComponentPerfSettingsData);
        return LJIIIIZZ != 0 ? LJIIIIZZ : feedComponentPerfSettingsData;
    }
}
