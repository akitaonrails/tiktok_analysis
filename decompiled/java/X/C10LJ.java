package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS434S0200000_33;

/* JADX INFO: renamed from: X.10LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LJ {
    public static final boolean LIZIZ(Aweme aweme) {
        if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(aweme.getCreateTime()) <= TimeUnit.DAYS.toMillis(C1A9E.LIZ().stackCard.newPostThreshold)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(C1261860iwS c1261860iwS) {
        MatchedFriendStruct matchedFriendStruct;
        List<? extends Aweme> list;
        List<? extends Aweme> list2;
        int i = C1A9E.LIZ().stackCard.uiStyle;
        if (i != 2 && i != 4) {
            return true;
        }
        MatchedFriendStruct matchedFriendStruct2 = c1261860iwS.getMatchedFriendStruct();
        if (((matchedFriendStruct2 != null && (list2 = matchedFriendStruct2.awemeList) != null && (!list2.isEmpty())) || ((matchedFriendStruct = c1261860iwS.getMatchedFriendStruct()) != null && (list = matchedFriendStruct.repostAwemeList) != null && (!list.isEmpty()))) && !c1261860iwS.getPrivateAccountForMonitor() && !c1261860iwS.getSecretForMonitor()) {
            return true;
        }
        return false;
    }

    public static final void LJ(Aweme aweme, C1261860iwS c1261860iwS, Context context) {
        if (c1261860iwS.getUid() != null && c1261860iwS.getSecUid() != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
            C786410Ut5.LJJJI("video_from", "REPOSTED_LIST_ENTRANCE", bundle);
            C786410Ut5.LJJJI("enter_from", "big_card", bundle);
            C786410Ut5.LJJJI("tab_name", "repost_history", bundle);
            C786410Ut5.LJJJI("from_activity_hash_code", c1261860iwS.getUid(), bundle);
            C786410Ut5.LJJJI("previous_page", "big_card", bundle);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ(final View view, final float f, final float f2, final Function0 function0) {
        view.animate().scaleX(0.97f).scaleY(0.97f).setDuration(100L).withEndAction(new Runnable() { // from class: X.19im
            public final void LIZ() {
                C21581419d6 c21581419d6 = new C21581419d6(1.0f);
                float f3 = f;
                float f4 = f2;
                c21581419d6.LIZIZ(f3);
                c21581419d6.LIZ(f4);
                final AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(new C118300cf(), (C118300cf) function0, (Function0<Unit>) 156);
                C21616519il c21616519il = new C21616519il(view, AbstractC21616419ik.LJIILL, 1.0f);
                c21616519il.LJJ = c21581419d6;
                c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.19iq
                    @Override // X.InterfaceC1427630nFp
                    public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f5, float f6) {
                        awS434S0200000_33.invoke();
                    }
                });
                c21616519il.LJIIIZ();
                C21616519il c21616519il2 = new C21616519il(view, AbstractC21616419ik.LJIILLIIL, 1.0f);
                c21616519il2.LJJ = c21581419d6;
                c21616519il2.LIZIZ(new InterfaceC1427630nFp() { // from class: X.19ir
                    @Override // X.InterfaceC1427630nFp
                    public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f5, float f6) {
                        awS434S0200000_33.invoke();
                    }
                });
                c21616519il2.LJIIIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PerformanceUserCardExtKt@e85d.animateSpring$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PerformanceUserCardExtKt@e85d.animateSpring$1");
            }
        }).start();
    }

    public static final void LIZLLL(Aweme aweme, C1261860iwS c1261860iwS, Context context, String str) {
        if (c1261860iwS.getUid() != null && c1261860iwS.getSecUid() != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("video_from", "[UserCard]_DETAIL");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
            smartRouteBuildRoute.withParam("userid", c1261860iwS.getUid());
            smartRouteBuildRoute.withParam("sec_userid", c1261860iwS.getSecUid());
            smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
            if (!C296550Bjp.LIZ()) {
                smartRouteBuildRoute.withParam("refer", "others_homepage");
            }
            smartRouteBuildRoute.withParam("previous_page", str);
            smartRouteBuildRoute.withParam("matched_friend_strcut", c1261860iwS.getMatchedFriendStruct());
            smartRouteBuildRoute.withParam("is_card", true);
            smartRouteBuildRoute.withParam("is_big_card", true);
            smartRouteBuildRoute.withParam("follow_recommned_enter_from", str);
            smartRouteBuildRoute.withParam("scene_type", EnumC1260920iuw.CARD.getType());
            smartRouteBuildRoute.open();
        }
    }
}
