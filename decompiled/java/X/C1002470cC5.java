package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: renamed from: X.0cC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002470cC5 extends AbstractC1023470cjx {
    public final Aweme LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return new C1023630ckD[0];
    }

    public C1002470cC5(Aweme aweme) {
        super(aweme);
        this.LIZ = aweme;
    }

    public static String LJJIIZ(Aweme aweme) {
        Video video;
        VideoUrlModel playAddr;
        if (aweme == null || (video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null) {
            return null;
        }
        return playAddr.getOriginUri();
    }
}
