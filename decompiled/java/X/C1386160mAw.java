package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.system.TuxImmersionBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386160mAw {
    public static final void LIZ(RadiusLayout radiusLayout) {
        int i;
        float f;
        Context context = radiusLayout.getContext();
        if (context == null) {
            return;
        }
        if (C960203pA.LIZIZ(context)) {
            i = R.attr.zi;
            f = 0.2f;
        } else {
            i = R.attr.z_;
            f = 0.08f;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            radiusLayout.setBackgroundColor(C2441009hQ.LJIIL(numLIZJ.intValue(), C814420VxA.LIZIZ(f * 255)));
        }
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme) || !C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
            return false;
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJFF(aweme) || C10EU.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 150 || C720360SNm.LJIIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final void LJI(C19EG c19eg) {
        if (((Boolean) C0AI5.LIZ.getValue()).booleanValue()) {
            boolean z = !C960203pA.LIZIZ(c19eg);
            C497270Jen.LJFF(c19eg);
            C497270Jen.LJ(c19eg, z);
            if (z) {
                ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
                TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
                immersionBarLJIILJJIL.LJII(true);
                tuxImmersionBar.LIZ(false);
                tuxImmersionBar.LJFF(-1);
                immersionBarLJIILJJIL.LJIIJ(true);
                tuxImmersionBar.LIZLLL();
                return;
            }
            return;
        }
        C1A6V c1a6v = new C1A6V(c19eg.getWindow(), c19eg.getWindow().getDecorView());
        if (C960203pA.LIZIZ(c19eg)) {
            c1a6v.LIZJ(false);
            c1a6v.LIZIZ(false);
        } else {
            c1a6v.LIZJ(true);
            c1a6v.LIZIZ(true);
        }
    }

    public static final InsertStory LJII(UserNewContent userNewContent) {
        String str;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        if (userNewContent == null) {
            return null;
        }
        if (!userNewContent.isStory()) {
            C0W17.LIZJ("InsertStory", "toInsertStoryInfo, current avatar is not story");
            return null;
        }
        FriendsRedDotUser user = userNewContent.getUser();
        if (user != null && (str = user.uid) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            String itemId = userNewContent.getItemId();
            if (itemId != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(itemId)) != null) {
                return new InsertStory(jLongValue, lLJIILIIL2.longValue());
            }
        }
        return null;
    }

    public static final int LJIIIIZZ(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static final void LIZJ(FriendsV3FeedResponse friendsV3FeedResponse, BaseResponse baseResponse) {
        if (baseResponse == null) {
            return;
        }
        friendsV3FeedResponse.extra = baseResponse.extra;
        friendsV3FeedResponse.error_code = baseResponse.error_code;
        friendsV3FeedResponse.message = baseResponse.message;
        friendsV3FeedResponse.status_code = baseResponse.status_code;
        friendsV3FeedResponse.status_msg = baseResponse.status_msg;
        friendsV3FeedResponse.prompts = baseResponse.prompts;
    }

    public static final boolean LIZLLL(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX < iArr[0] || rawX > r1 + view.getWidth()) {
            return false;
        }
        if (rawY < iArr[1] || rawY > r1 + view.getHeight()) {
            return false;
        }
        return true;
    }

    public static final void LJFF(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void LJIIIZ(InterfaceC1361270lWn interfaceC1361270lWn, Context context, String str, String str2, String str3) {
        User userLLILLL;
        String str4;
        HashMap<String, String> mobParams;
        if (context == null || interfaceC1361270lWn == null || (userLLILLL = interfaceC1361270lWn.LLILLL()) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", userLLILLL.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", userLLILLL.getSecUid());
        smartRouteBuildRoute.withParam("video_id", interfaceC1361270lWn.getAweme().getAid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("extra_from_pre_page", str);
        Aweme aweme = interfaceC1361270lWn.getAweme();
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && Intrinsics.LJFF(mobParams.get("is_from_push"), "1")) {
            smartRouteBuildRoute.withParam("is_from_push", 1);
            String str5 = mobParams.get("push_id");
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            smartRouteBuildRoute.withParam("push_id", str5);
            String str7 = mobParams.get("push_type");
            if (str7 != null) {
                str6 = str7;
            }
            smartRouteBuildRoute.withParam("push_type", str6);
        }
        smartRouteBuildRoute.withParam("enter_method", str2);
        smartRouteBuildRoute.open();
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = str;
        c735410St1.LJJLIIIJILLIZJL = str2;
        c735410St1.LJIJI(interfaceC1361270lWn.getAweme());
        if (C729510SjV.LJJIJIL(interfaceC1361270lWn.getAweme())) {
            str4 = "story";
        } else {
            str4 = "post";
        }
        c735410St1.LJJJLZIJ = str4;
        c735410St1.LJJJZ = C729510SjV.LJII(interfaceC1361270lWn.getAweme());
        c735410St1.LJJLIIIJLLLLLLLZ = userLLILLL.getUid();
        C735840Sti.LIZ.getClass();
        c735410St1.LJJJLL = C735840Sti.LJIIIIZZ(userLLILLL);
        c735410St1.LJJLIIJ = userLLILLL.getUid();
        if (str3.length() > 0) {
            c735410St1.LLIIIL = "feed";
        }
        C1599640rjG.LIZIZ.Ou(c735410St1, new C1360330lVH(str3, null, null, null, 14));
        c735410St1.LJIILJJIL();
    }
}
