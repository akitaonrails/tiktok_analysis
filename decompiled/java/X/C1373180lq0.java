package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373180lq0 {
    public static String LIZ(User user, String str) {
        if (str != null && str.length() != 0 && user != null) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (AnonymousClass0652.LIZ(user.getUid())) {
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    c2089008Gi.LIZLLL("item_author_type", CardStruct.IStatusCode.DEFAULT);
                } else if (Intrinsics.LJFF(user.getUid(), curUser.getUid())) {
                    c2089008Gi.LIZLLL("item_author_type", "1");
                } else {
                    c2089008Gi.LIZLLL("item_author_type", "2");
                }
            }
            return c2089008Gi.LJ();
        }
        return str;
    }

    public static void LIZIZ(String str, User user, SharePackage sharePackage) {
        String str2;
        String str3;
        String string;
        Bundle bundle;
        if (user != null) {
            C735800Ste c735800Ste = new C735800Ste("share_person");
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            c735800Ste.LJFF("platform", str, c2082308Dt);
            c735800Ste.LJFF("target_id", user.getUid(), c2082308Dt);
            if (C10EU.LJIILLIIL(user)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            c735800Ste.LJFF("enter_from", str2, c2082308Dt);
            if (user.isSecret()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c735800Ste.LJFF("is_private_profile", str3, c2082308Dt);
            if (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("related_gid")) == null) {
                string = "";
            }
            c735800Ste.LJFF("from_gid", string, c2082308Dt);
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                c735800Ste.LJ("item_author_type", CardStruct.IStatusCode.DEFAULT);
            } else if (C10EU.LJIILLIIL(user)) {
                c735800Ste.LJ("item_author_type", "1");
            } else {
                c735800Ste.LJ("item_author_type", "2");
            }
            c735800Ste.LJIILJJIL();
        }
    }

    public static void LIZJ(String str, boolean z, User user) {
        if (!z || user == null) {
            return;
        }
        C1260870iur c1260870iur = new C1260870iur();
        c1260870iur.LJIIJ(new C1373260lq8());
        C1387280mCk c1387280mCk = new C1387280mCk();
        c1387280mCk.LIZ = user.getUid();
        c1387280mCk.LIZIZ = 1;
        c1387280mCk.LJI = 4;
        c1387280mCk.LJII = str;
        c1260870iur.LIZJ(c1387280mCk.LIZ());
    }

    public static UserSharePackage LIZLLL(User user, Context context, List list, String str, String str2) {
        String shareTitle;
        String shareDesc;
        String strLIZ;
        String shareUrl;
        String strLIZJ;
        String strLJ;
        String strLJFF;
        C1370940lmO c1370940lmO = new C1370940lmO();
        String uid = user.getUid();
        String uniqueId = "";
        if (uid == null) {
            uid = "";
        }
        c1370940lmO.LIZIZ = uid;
        C786410Ut5.LJJJI("app_name", context.getString(R.string.drg), c1370940lmO.LJII);
        ShareInfo shareInfo = user.getShareInfo();
        if (shareInfo == null || (shareTitle = shareInfo.getShareTitle()) == null) {
            shareTitle = "";
        }
        c1370940lmO.LIZLLL = shareTitle;
        ShareInfo shareInfo2 = user.getShareInfo();
        if (shareInfo2 == null || (shareDesc = shareInfo2.getShareDesc()) == null) {
            shareDesc = "";
        }
        c1370940lmO.LJ = shareDesc;
        ShareInfo shareInfo3 = user.getShareInfo();
        if (shareInfo3 == null || (shareUrl = shareInfo3.getShareUrl()) == null || (strLIZJ = C1375500ltk.LIZJ(shareUrl)) == null || (strLJ = C1375500ltk.LJ(strLIZJ)) == null || (strLJFF = C1375500ltk.LJFF(strLJ)) == null || (strLIZ = LIZ(user, strLJFF)) == null) {
            strLIZ = "";
        }
        c1370940lmO.LJFF = strLIZ;
        c1370940lmO.LIZ = "user";
        String uid2 = user.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        C786410Ut5.LJJJI("uid", uid2, c1370940lmO.LJII);
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        C786410Ut5.LJJJI("sec_user_id", secUid, c1370940lmO.LJII);
        String nickname = user.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        C786410Ut5.LJJJI("name", nickname, c1370940lmO.LJII);
        String uniqueId2 = user.getUniqueId();
        if (uniqueId2 != null && uniqueId2.length() != 0) {
            uniqueId = user.getUniqueId();
        } else {
            String shortId = user.getShortId();
            if (shortId != null) {
                uniqueId = shortId;
            }
        }
        C786410Ut5.LJJJI("desc", uniqueId, c1370940lmO.LJII);
        c1370940lmO.LIZJ = new ShareContentType[]{ShareContentType.LINK};
        if (!C10EU.LJIILL(user, C10EU.LJIILLIIL(user)) && list != null && list.size() >= 3) {
            C630030OnR.LIZIZ(c1370940lmO.LJII, "aweme_cover_list", list);
        }
        Bundle bundle = c1370940lmO.LJII;
        String uid3 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C786410Ut5.LJJJI("item_author_type", CardStruct.IStatusCode.DEFAULT, bundle);
        } else if (Intrinsics.LJFF(user.getUid(), uid3)) {
            C786410Ut5.LJJJI("item_author_type", "1", bundle);
        } else {
            C786410Ut5.LJJJI("item_author_type", "2", bundle);
        }
        C786410Ut5.LJJIZ(c1370940lmO.LJII, "video_cover", user.getAvatarMedium());
        C786410Ut5.LJJJI("enter_from", str, c1370940lmO.LJII);
        C786410Ut5.LJJJI("panel_source", str2, c1370940lmO.LJII);
        Bundle bundle2 = c1370940lmO.LJII;
        C735840Sti.LIZ.getClass();
        bundle2.putInt("follow_status", C735840Sti.LJIIIIZZ(user));
        UserSharePackage userSharePackage = new UserSharePackage(c1370940lmO);
        userSharePackage.user = user;
        return userSharePackage;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(final com.bytedance.common.utility.collection.WeakHandler r15, android.app.Activity r16, final com.ss.android.ugc.aweme.profile.model.User r17, java.util.List r18, final java.lang.String r19, boolean r20, java.lang.String r21, final java.lang.Integer r22) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373180lq0.LJ(com.bytedance.common.utility.collection.WeakHandler, android.app.Activity, com.ss.android.ugc.aweme.profile.model.User, java.util.List, java.lang.String, boolean, java.lang.String, java.lang.Integer):void");
    }
}
