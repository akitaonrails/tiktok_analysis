package Y;

import X.AbstractC848400XPy;
import X.C07WV;
import X.C0XQ7;
import X.C1255320ilu;
import X.C1255340ilw;
import X.C1255350ilx;
import X.C1255390im1;
import X.C1261090ivD;
import X.C1261200ivO;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C296550Bjp;
import X.C660220Pv2;
import X.C735410St1;
import X.C786410Ut5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.ViewOnClickListenerC1255430im5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.org.AssociateAccountInfo;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.model.ProfileIdentifierCellAffiliateAccount;
import com.ss.android.ugc.profile.platform.base.data.Action;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS55S0400000_19 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS55S0400000_19 aCListenerS55S0400000_19, View view) {
        ((Function0) aCListenerS55S0400000_19.l0).invoke();
        C1261200ivO c1261200ivO = (C1261200ivO) aCListenerS55S0400000_19.l1;
        Aweme aweme = (Aweme) aCListenerS55S0400000_19.l2;
        C1261090ivD c1261090ivD = (C1261090ivD) aCListenerS55S0400000_19.l3;
        c1261200ivO.getClass();
        User user = c1261090ivD.LIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickRepostVideoCell with aweme.aid as ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        c1261200ivO.LIZ(EnumC1260930iux.CLICK_REPOST, c1261090ivD.LJ, user);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        C786410Ut5.LJJJI("video_from", "REPOSTED_LIST_ENTRANCE", bundle);
        C786410Ut5.LJJJI("enter_from", "find_friends_page", bundle);
        C786410Ut5.LJJJI("tab_name", "repost_history", bundle);
        C786410Ut5.LJJJI("from_activity_hash_code", user.getUid(), bundle);
        C786410Ut5.LJJJI("previous_page", "find_friends_page", bundle);
        C786410Ut5.LJJIZ(bundle, "follow_recommend_nav_param", new C07WV(user.getRequestId(), false));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c1261200ivO.getContext(), "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS55S0400000_19 aCListenerS55S0400000_19, View view) {
        ((Function0) aCListenerS55S0400000_19.l0).invoke();
        C1261200ivO c1261200ivO = (C1261200ivO) aCListenerS55S0400000_19.l1;
        Aweme aweme = (Aweme) aCListenerS55S0400000_19.l2;
        C1261090ivD c1261090ivD = (C1261090ivD) aCListenerS55S0400000_19.l3;
        c1261200ivO.getClass();
        User user = c1261090ivD.LIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickNormalVideoPostCell with aweme.aid as ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        c1261200ivO.LIZ(EnumC1260930iux.CLICK_POST, c1261090ivD.LJ, user);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c1261200ivO.getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam("enter_from", "find_friends_page");
        smartRouteBuildRoute.withParam("video_from", "[UserCard]_DETAIL");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        smartRouteBuildRoute.withParam("userid", user.getUid());
        smartRouteBuildRoute.withParam("sec_userid", user.getSecUid());
        smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
        smartRouteBuildRoute.withParam("previous_page", "find_friends_page");
        smartRouteBuildRoute.withParam("matched_friend_strcut", user.getMatchedFriendStruct());
        smartRouteBuildRoute.withParam("is_card", true);
        smartRouteBuildRoute.withParam("follow_recommned_enter_from", "find_friends_page");
        smartRouteBuildRoute.withParam("scene_type", EnumC1260920iuw.CARD.getType());
        if (C296550Bjp.LIZ()) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "follow_recommend_nav_param", new C07WV(user.getRequestId(), false));
            smartRouteBuildRoute.withParam(bundle);
        }
        smartRouteBuildRoute.open();
    }

    public static final void onClick$2(ACListenerS55S0400000_19 aCListenerS55S0400000_19, View view) {
        String str;
        ((ViewOnClickListenerC1255430im5) aCListenerS55S0400000_19.l0).onClick(view);
        long jCurrentTimeMillis = System.currentTimeMillis() - ((C1255340ilw) aCListenerS55S0400000_19.l1).LLIZ;
        if (Intrinsics.LJFF(((SignificantUserInfo) aCListenerS55S0400000_19.l2).uid, "-1")) {
            str = "click_add_account";
        } else {
            str = "click_login";
        }
        C1255350ilx c1255350ilx = (C1255350ilx) aCListenerS55S0400000_19.l3;
        C1255390im1 c1255390im1 = ((C1255340ilw) aCListenerS55S0400000_19.l1).LLILLJJLI;
        String str2 = c1255390im1.LIZ;
        String str3 = c1255390im1.LIZIZ;
        String str4 = c1255350ilx.LL;
        if (str4 != null && str4.length() != 0 && !Intrinsics.LJFF(c1255350ilx.LL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            C1255320ilu c1255320ilu = C1255320ilu.LIZ;
            String str5 = c1255350ilx.LL;
            c1255320ilu.getClass();
            long jLIZ = C1255320ilu.LIZ(str5);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(c1255350ilx.LLIZ.getCount(), "notification_cnt");
            c2344009Gk.LJIIIIZZ("account_user_id", c1255350ilx.LL);
            c2344009Gk.LIZJ(c1255350ilx.getAdapterPosition(), "order");
            c2344009Gk.LIZLLL(jLIZ, "dm_notification_cnt");
            if (str2 != null) {
                c2344009Gk.LJFF("enter_from", str2);
            }
            if (str3 != null) {
                c2344009Gk.LJFF("enter_method", str3);
            }
            c2344009Gk.LJFF("action_type", str);
            if (jCurrentTimeMillis > 0) {
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            }
            C20684815ws.LJIILLIIL("account_list_click", c2344009Gk.LIZ);
        }
        C1255320ilu c1255320ilu2 = C1255320ilu.LIZ;
        String str6 = ((C1255350ilx) aCListenerS55S0400000_19.l3).LL;
        c1255320ilu2.getClass();
        if (str6 != null && str6.length() != 0) {
            HashMap<String, Long> map = C1255320ilu.LIZJ;
            if (map != null) {
                map.get(str6);
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            HashMap<String, Long> map2 = C1255320ilu.LIZJ;
            if (map2 != null) {
                map2.clear();
            }
        }
    }

    public static final void onClick$3(ACListenerS55S0400000_19 aCListenerS55S0400000_19, View view) {
        String str;
        String str2;
        String str3;
        UrlModel urlModel;
        if (C660220Pv2.LIZ((ViewGroup) aCListenerS55S0400000_19.l0)) {
            return;
        }
        User user = new User();
        ProfileIdentifierCellAffiliateAccount profileIdentifierCellAffiliateAccount = (ProfileIdentifierCellAffiliateAccount) aCListenerS55S0400000_19.l3;
        AssociateAccountInfo associateAccountInfo = profileIdentifierCellAffiliateAccount.getAssociateAccountInfo();
        String url = null;
        if (associateAccountInfo != null) {
            str = associateAccountInfo.uid;
        } else {
            str = null;
        }
        user.setUid(str);
        AssociateAccountInfo associateAccountInfo2 = profileIdentifierCellAffiliateAccount.getAssociateAccountInfo();
        if (associateAccountInfo2 != null) {
            str2 = associateAccountInfo2.secUid;
        } else {
            str2 = null;
        }
        user.setSecUid(str2);
        AssociateAccountInfo associateAccountInfo3 = profileIdentifierCellAffiliateAccount.getAssociateAccountInfo();
        if (associateAccountInfo3 != null) {
            str3 = associateAccountInfo3.nickname;
        } else {
            str3 = null;
        }
        user.setNickname(str3);
        AssociateAccountInfo associateAccountInfo4 = profileIdentifierCellAffiliateAccount.getAssociateAccountInfo();
        if (associateAccountInfo4 != null) {
            urlModel = associateAccountInfo4.avatarThumb;
        } else {
            urlModel = null;
        }
        user.setAvatarThumb(urlModel);
        IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class);
        if (iUserProfilePreload != null) {
            iUserProfilePreload.LIZ(user);
        }
        Context context = ((ViewGroup) aCListenerS55S0400000_19.l0).getContext();
        Action.RouterInfo router = ((Action) aCListenerS55S0400000_19.l1).getRouter();
        if (router != null) {
            url = router.getUrl();
        }
        SmartRouter.buildRoute(context, url).open();
        C735410St1 c735410St1 = new C735410St1();
        ProfileIdentifierFragment profileIdentifierFragment = (ProfileIdentifierFragment) aCListenerS55S0400000_19.l2;
        String str4 = profileIdentifierFragment.LL;
        if (str4 == null) {
            str4 = "";
        }
        c735410St1.LIZLLL = str4;
        c735410St1.LJJLIIIJILLIZJL = "click_from_account_info_page";
        c735410St1.LJJLIIJ = profileIdentifierFragment.LLILLJJLI;
        c735410St1.LJIILJJIL();
    }

    public ACListenerS55S0400000_19(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
