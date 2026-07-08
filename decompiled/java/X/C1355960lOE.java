package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import java.util.List;

/* JADX INFO: renamed from: X.0lOE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355960lOE {
    public static void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String authorUid;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJFF("author_id", authorUid);
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        Integer numValueOf;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
    }

    public static void LIZJ(C2344009Gk c2344009Gk, PostModeDetailParams postModeDetailParams) {
        String str;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        c2344009Gk.LJFF("enter_from", str);
    }

    public static void LIZLLL(C2344009Gk c2344009Gk, Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJFF("group_id", aid);
    }

    public static void LJ(C2344009Gk c2344009Gk, Aweme aweme) {
        Integer numValueOf;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            numValueOf = Integer.valueOf(imageList.size());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "pic_cnt");
    }
}
