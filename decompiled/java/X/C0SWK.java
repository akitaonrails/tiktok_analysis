package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SWK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWK extends Comment {
    public static final int $stable = 8;
    public final Aweme LL;
    public final C0SPY LLILLJJLI;
    public boolean LLILLL = true;
    public boolean LLILZ = true;
    public boolean LLILZIL = true;

    public final Aweme getAweme() {
        return this.LL;
    }

    public final C0SPY getMobParams() {
        return this.LLILLJJLI;
    }

    public final boolean isAnchorsFold() {
        return this.LLILZ;
    }

    public final boolean isTaggedPeopleFold() {
        return this.LLILLL;
    }

    public final boolean isVideoMusicTitleDisplayOnFeed() {
        return this.LLILZIL;
    }

    public final void setAnchorsFold(boolean z) {
        this.LLILZ = z;
    }

    public final void setTaggedPeopleFold(boolean z) {
        this.LLILLL = z;
    }

    public final void setVideoMusicTitleDisplayOnFeed(boolean z) {
        this.LLILZIL = z;
    }

    public C0SWK(Aweme aweme, C0SPY c0spy) {
        this.LL = aweme;
        this.LLILLJJLI = c0spy;
    }
}
