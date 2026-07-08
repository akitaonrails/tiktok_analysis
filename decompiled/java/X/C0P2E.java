package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0P2E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P2E {
    public static final C0P2E LIZ = new C0P2E();

    public static void LIZ(C718360SFu c718360SFu, String str) {
        String aid;
        String authorUid;
        BannerCommonKey bannerCommonKey;
        String str2 = c718360SFu.LJFF;
        Aweme aweme = c718360SFu.LIZJ;
        String str3 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = c718360SFu.LIZJ;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
        if (bannerCommonStruct != null && (bannerCommonKey = bannerCommonStruct.bannerKey) != null) {
            str3 = bannerCommonKey.componentKey;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("group_id", aid);
        c0lab.LJ("author_id", authorUid);
        c0lab.LJ("component_key", str3);
        c0lab.LJ("component_type", "bottom_banner");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL("click_core_fdmt_component", c0lab.LIZ);
    }
}
