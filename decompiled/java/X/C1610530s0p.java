package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610530s0p extends C09AY implements Function2<FeedAvatarDefaultAssem, C739360SzO, Unit> {
    public C1610530s0p() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C739360SzO c739360SzO) {
        Aweme aweme;
        String str;
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        C739360SzO c739360SzO2 = c739360SzO;
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(feedAvatarDefaultAssem2);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            if (c739360SzO2 != null) {
                str = c739360SzO2.LIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, aweme.getAid())) {
                feedAvatarDefaultAssem2.ep().UB1();
            }
        }
        return Unit.LIZ;
    }
}
