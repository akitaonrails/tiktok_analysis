package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723210SYl extends C09AY implements Function2<FeedAvatarAssemWrap, C723240SYo, Unit> {
    public C723210SYl() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarAssemWrap feedAvatarAssemWrap, C723240SYo c723240SYo) {
        Object obj;
        Object obj2;
        FeedAvatarAssemWrap feedAvatarAssemWrap2 = feedAvatarAssemWrap;
        C723240SYo c723240SYo2 = c723240SYo;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(feedAvatarAssemWrap2)).getAweme();
        if (aweme != null && c723240SYo2 != null && !c723240SYo2.LIZIZ && aweme.getAuthor() != null && Intrinsics.LJFF(c723240SYo2.LIZ, aweme.getAuthor().getUid()) && feedAvatarAssemWrap2.LLL) {
            C724270Sb3 c724270Sb3 = feedAvatarAssemWrap2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            boolean zLJFF = Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_popular");
            C724270Sb3 c724270Sb32 = feedAvatarAssemWrap2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            boolean zLJFF2 = Intrinsics.LJFF(((VideoItemParams) obj2).mEventType, "homepage_nearby");
            FeedAvatarAssemWrap.LLLFZ.getClass();
            if (!C1019620cdk.LIZIZ(3, aweme) && C1602720roE.LIZIZ(aweme, null) && !zLJFF && !zLJFF2 && feedAvatarAssemWrap2.Fp().LL == C0N0E.IDLE) {
                if (C123100dR.LIZ(c723240SYo2.LIZJ) && Intrinsics.LJFF(aweme.getAid(), c723240SYo2.LIZJ)) {
                    feedAvatarAssemWrap2.Fp().LL = C0N0E.FRONTIER_LOAD;
                } else {
                    feedAvatarAssemWrap2.Fp().LL = C0N0E.BIND_LOAD;
                }
                C723830SaL.LJ(feedAvatarAssemWrap2, C13LE.LIZ(FeedAvatarLiveAssem.class), true, null);
            }
        }
        return Unit.LIZ;
    }
}
