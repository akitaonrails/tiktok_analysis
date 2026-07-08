package X;

import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0l1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341810l1P {
    public static CommentStruct LIZ(Aweme aweme) {
        CommentStruct adCommentStruct = AwemeExtKt.getAdCommentStruct(aweme);
        if (adCommentStruct == null) {
            return null;
        }
        adCommentStruct.setAwemeId(aweme.getAid());
        User user = new User();
        user.setUid(AwemeExtKt.getAuthorUid(aweme));
        user.setAvatarThumb(adCommentStruct.getAvatarIcon());
        adCommentStruct.setUser(user);
        adCommentStruct.setCommentType(10);
        return adCommentStruct;
    }

    public static CommentStruct LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (AwemeExtKt.isAdTraffic(aweme) && LIZ(aweme) != null) {
            if (!LIZLLL(aweme) || !LJ(aweme)) {
                return null;
            }
            return LIZ(aweme);
        }
        return C1343460l44.LIZ(aweme);
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || aweme.isCmtSwt() || C1017070cZd.LJJLIL(aweme)) {
            return false;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isCommentAreaSwitch()) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        CommentStruct adCommentStruct = AwemeExtKt.getAdCommentStruct(aweme);
        if (!LIZJ(aweme) || adCommentStruct == null || !adCommentStruct.showAsDefault()) {
            return false;
        }
        return true;
    }
}
