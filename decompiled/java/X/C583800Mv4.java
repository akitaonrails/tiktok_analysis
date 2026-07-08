package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.experiment.FeedPlayProgressContinueConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583800Mv4 extends C09AY implements Function0<FeedPlayProgressContinueConfig> {
    public C583800Mv4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.experiment.FeedPlayProgressContinueConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedPlayProgressContinueConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FeedPlayProgressContinueConfig feedPlayProgressContinueConfig = C583790Mv3.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("feed_play_progress_continue_config", FeedPlayProgressContinueConfig.class, feedPlayProgressContinueConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : feedPlayProgressContinueConfig;
    }
}
