package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1H, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1H {
    public static final String LIZ(C0RJN c0rjn) {
        if (C1389300mG0.LJJ(c0rjn)) {
            return "repost_feed";
        }
        if (C1389300mG0.LJIIIZ(c0rjn)) {
            return "homepage_friends";
        }
        if (C1389300mG0.LJIL(c0rjn)) {
            return "homepage_hot";
        }
        return "";
    }

    public static final C1A1S LIZIZ(C1A1W c1a1w) {
        if (c1a1w instanceof C1A1X) {
            C1A1X c1a1x = (C1A1X) c1a1w;
            if (!C1389300mG0.LJIIIZ(c1a1x.LIZ) && !C1389300mG0.LJIL(c1a1x.LIZ)) {
                if (C1389300mG0.LJJ(c1a1x.LIZ)) {
                    return new C1A1S(C706070Rmn.LIZ().globalDismissDays, C706070Rmn.LIZ().globalDisplayCountLimit, C706070Rmn.LIZ().dailyDisplayCountLimit, EnumC1154930g9z.REPOST);
                }
                return null;
            }
            return new C1A1S(C705970Rmd.LIZ().globalDismissDays, C705970Rmd.LIZ().globalDisplayCountLimit, C705970Rmd.LIZ().dailyDisplayCountLimit, EnumC1154930g9z.FYP_AND_FRIENDS_MUF_POST);
        }
        if (c1a1w instanceof C1A1Y) {
            C1A1Y c1a1y = (C1A1Y) c1a1w;
            if (C1389300mG0.LJJ(c1a1y.LIZ)) {
                return new C1A1S(C706070Rmn.LIZ().globalDismissDays, C706070Rmn.LIZ().globalDisplayCountLimit, C706070Rmn.LIZ().dailyDisplayCountLimit, EnumC1154930g9z.REPOST);
            }
            if (C1389300mG0.LJIIIZ(c1a1y.LIZ) || C1389300mG0.LJIL(c1a1y.LIZ)) {
                return new C1A1S(C706080Rmo.LIZ().globalDismissDays, C706080Rmo.LIZ().globalDisplayCountLimit, C706080Rmo.LIZ().dailyDisplayCountLimit, EnumC1154930g9z.FYP_AND_FRIENDS_REPOST);
            }
            return null;
        }
        if (Intrinsics.LJFF(c1a1w, C1A1Z.LIZ)) {
            return new C1A1S(C705980Rme.LIZ().globalDismissDays, C705980Rme.LIZ().globalDisplayCountLimit, C705980Rme.LIZ().dailyDisplayCountLimit, EnumC1154930g9z.FYP_AND_FRIENDS_MUF_POST);
        }
        if (!Intrinsics.LJFF(c1a1w, C2172601A1a.LIZ)) {
            throw new C1954807lC();
        }
        return null;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (C10EU.LJIILLIIL(aweme.getAuthor()) || !C1A1M.LIZIZ.LIZ(AwemeExtKt.getAuthorUid(aweme)) || AwemeExtKt.getFollowStatus(aweme) != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        UpvotePreloadStruct upvotePreload;
        UpvoteList upvoteListLJIIIIZZ;
        List<UpvoteStruct> list;
        if (aweme.getUpvoteReason() != null || (((upvotePreload = aweme.getUpvotePreload()) != null && upvotePreload.needPullUpvoteInfo) || ((upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(aweme.getAid())) != null && (list = upvoteListLJIIIIZZ.upvotes) != null && !list.isEmpty()))) {
            return true;
        }
        return false;
    }
}
