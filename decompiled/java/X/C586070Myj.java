package X;

import com.ss.android.ugc.aweme.story.experiment.StoryInboxFetchConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Myj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586070Myj extends C09AY implements Function0<StoryInboxFetchConfig> {
    public C586070Myj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.story.experiment.StoryInboxFetchConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final StoryInboxFetchConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        StoryInboxFetchConfig storyInboxFetchConfig = C586060Myi.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(StoryInboxFetchConfig.class, storyInboxFetchConfig, "story_inbox_preload_config", true);
        return LJJII != 0 ? LJJII : storyInboxFetchConfig;
    }
}
