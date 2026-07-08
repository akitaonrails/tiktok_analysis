package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.story.ability.StoryViewMoreButtonAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610550s0r extends C09AY implements Function0<StoryViewMoreButtonAbility> {
    public final /* synthetic */ FeedAvatarDefaultAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610550s0r(FeedAvatarDefaultAssem feedAvatarDefaultAssem) {
        super(0);
        this.LL = feedAvatarDefaultAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.story.ability.StoryViewMoreButtonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final StoryViewMoreButtonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), StoryViewMoreButtonAbility.class, null);
    }
}
