package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Stq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735920Stq extends C09AY implements Function2<FeedAvatarDefaultAssem, C581630MrZ, Unit> {
    public C735920Stq() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C581630MrZ c581630MrZ) {
        Aweme aweme;
        String aid;
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        C581630MrZ c581630MrZ2 = c581630MrZ;
        if (c581630MrZ2 != null && c581630MrZ2.LIZ == 2 && (aweme = ((VideoItemParams) C631370Opb.LIZ(feedAvatarDefaultAssem2)).getAweme()) != null && (aid = aweme.getAid()) != null && TextUtils.equals(c581630MrZ2.LIZIZ, aid)) {
            feedAvatarDefaultAssem2.dp();
        }
        return Unit.LIZ;
    }
}
