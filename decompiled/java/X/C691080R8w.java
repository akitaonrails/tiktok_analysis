package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.adapter.playerview.EmptyFeedPlayerView;
import com.ss.android.ugc.aweme.feed.adapter.playerview.FeedVideoPlayerView;

/* JADX INFO: renamed from: X.0R8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691080R8w {
    public static final /* synthetic */ int LIZ = 0;

    public static BaseFeedPlayerView LIZ(ViewGroup viewGroup, C0RF0 c0rf0) {
        if (c0rf0.LJIILJJIL == 20) {
            return new EmptyFeedPlayerView(viewGroup.getContext());
        }
        return new FeedVideoPlayerView(viewGroup, c0rf0);
    }
}
