package Y;

import X.C1245880iWg;
import X.C1261070ivB;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C426230GnV;
import X.C786410Ut5;
import X.EnumC1231460i9Q;
import X.EnumC1245890iWh;
import X.EnumC1246000iWs;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS0S0521000_19 implements View.OnClickListener {
    public final int $t;
    public int i7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;
    public boolean z6;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS0S0521000_19 aCListenerS0S0521000_19, View view) {
        C1245880iWg.LIZJ(C1245880iWg.LIZ, aCListenerS0S0521000_19.z5, aCListenerS0S0521000_19.z6, ((User) aCListenerS0S0521000_19.l0).getFollowStatus(), ((User) aCListenerS0S0521000_19.l0).getFollowerStatus(), (EnumC1245890iWh) aCListenerS0S0521000_19.l1, aCListenerS0S0521000_19.i7, EnumC1246000iWs.CLICK_ITEM);
        C426230GnV c426230GnV = (C426230GnV) aCListenerS0S0521000_19.l2;
        Aweme aweme = (Aweme) aCListenerS0S0521000_19.l3;
        C1261070ivB c1261070ivB = (C1261070ivB) aCListenerS0S0521000_19.l4;
        c426230GnV.getClass();
        User user = c1261070ivB.LIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickRepostVideoCell with aweme.aid as ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        String paramValue = EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE.getParamValue();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        C786410Ut5.LJJJI("video_from", "REPOSTED_LIST_ENTRANCE", bundle);
        C786410Ut5.LJJJI("enter_from", paramValue, bundle);
        C786410Ut5.LJJJI("follow_recommned_enter_from", paramValue, bundle);
        C786410Ut5.LJJJI("tab_name", "repost_history", bundle);
        C786410Ut5.LJJJI("from_activity_hash_code", user.getUid(), bundle);
        C786410Ut5.LJJJI("previous_page", "find_friends_page", bundle);
        C786410Ut5.LJJJI("enter_position", c1261070ivB.LJ.getParamValue(), bundle);
        bundle.putBoolean("is_recommend", false);
        bundle.putInt("page_type", 54);
        bundle.putBoolean("extra_load_more_upon_entrance", true);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c426230GnV.getContext(), "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS0S0521000_19 aCListenerS0S0521000_19, View view) {
        C1245880iWg.LIZJ(C1245880iWg.LIZ, aCListenerS0S0521000_19.z5, aCListenerS0S0521000_19.z6, ((User) aCListenerS0S0521000_19.l0).getFollowStatus(), ((User) aCListenerS0S0521000_19.l0).getFollowerStatus(), (EnumC1245890iWh) aCListenerS0S0521000_19.l1, aCListenerS0S0521000_19.i7, EnumC1246000iWs.CLICK_ITEM);
        C426230GnV c426230GnV = (C426230GnV) aCListenerS0S0521000_19.l2;
        Aweme aweme = (Aweme) aCListenerS0S0521000_19.l3;
        C1261070ivB c1261070ivB = (C1261070ivB) aCListenerS0S0521000_19.l4;
        c426230GnV.getClass();
        User user = c1261070ivB.LIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickNormalVideoPostCell with aweme.aid as ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        String paramValue = EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE.getParamValue();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c426230GnV.getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam("enter_from", paramValue);
        smartRouteBuildRoute.withParam("video_from", "[UserCard]_DETAIL");
        smartRouteBuildRoute.withParam("follow_recommned_enter_from", paramValue);
        smartRouteBuildRoute.withParam("page_type", 54);
        smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
        smartRouteBuildRoute.withParam("is_recommend", false);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        smartRouteBuildRoute.withParam("userid", user.getUid());
        smartRouteBuildRoute.withParam("sec_userid", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_position", c1261070ivB.LJ.getParamValue());
        smartRouteBuildRoute.withParam("previous_page", paramValue);
        smartRouteBuildRoute.withParam("matched_friend_strcut", user.getMatchedFriendStruct());
        smartRouteBuildRoute.open();
    }

    public ACListenerS0S0521000_19(boolean z, boolean z2, User user, EnumC1245890iWh enumC1245890iWh, int i, C426230GnV c426230GnV, Aweme aweme, C1261070ivB c1261070ivB, int i2) {
        this.$t = i2;
        this.z5 = z;
        this.z6 = z2;
        this.l0 = user;
        this.l1 = enumC1245890iWh;
        this.i7 = i;
        this.l2 = c426230GnV;
        this.l3 = aweme;
        this.l4 = c1261070ivB;
    }
}
