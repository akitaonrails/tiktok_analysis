package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0s0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610580s0u extends C09AY implements Function2<FeedAvatarDefaultAssem, FollowStatusEvent, Unit> {
    public C1610580s0u() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, FollowStatusEvent followStatusEvent) throws JSONException {
        feedAvatarDefaultAssem.sp(followStatusEvent);
        return Unit.LIZ;
    }
}
