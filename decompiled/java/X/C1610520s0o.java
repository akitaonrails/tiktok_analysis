package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0s0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610520s0o extends C09AY implements Function2<FeedAvatarDefaultAssem, C740360T2k, Unit> {
    public C1610520s0o() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C740360T2k c740360T2k) {
        Aweme aweme;
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        C740360T2k c740360T2k2 = c740360T2k;
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(feedAvatarDefaultAssem2);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && c740360T2k2 != null && c740360T2k2.LIZ == 3 && C1017070cZd.LLJI(aweme) && !C1017070cZd.LLJILJIL(aweme)) {
            feedAvatarDefaultAssem2.ep().UB1();
        }
        return Unit.LIZ;
    }
}
