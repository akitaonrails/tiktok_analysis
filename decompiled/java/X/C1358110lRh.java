package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358110lRh {
    public static final C1358110lRh LIZ = new C1358110lRh();

    public static void LIZ(Activity activity, String str, UpvoteStruct upvoteStruct, String str2, String str3, String str4) {
        if (activity == null || str == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "recommend_panel");
        c2344009Gk.LJIIIIZZ("previous_page", str2);
        c2344009Gk.LJIIIIZZ("enter_position", str3);
        c2344009Gk.LJIIIIZZ("rec_uid", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str);
        C1D0F c1d0f = C1D0F.LIZ;
        c2344009Gk.LJ(Boolean.valueOf(c1d0f.isConnected()), c1d0f.LIZ());
        c2344009Gk.LJIIIIZZ(c1d0f.LIZIZ(), c1d0f.LIZJ());
        c2344009Gk.LJIIIIZZ("tab_name", str4);
        c2344009Gk.LIZJ(1, "is_recommend");
        c2344009Gk.LIZJ(C1359720lUI.LJ(upvoteStruct) ? 1 : 0, "with_recommendation");
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("uid", str);
        smartRouteBuildRoute.withParam("enter_from", "recommend_panel");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "recommend_panel");
        smartRouteBuildRoute.open();
    }

    public static void LIZIZ(C1358110lRh c1358110lRh, Activity activity, User user, UpvoteStruct upvoteStruct, String str, String str2, String str3, boolean z, String str4, int i) {
        String str5;
        IMAIMojiSticker iMAIMojiStickerLIZJ;
        String str6;
        boolean z2;
        String str7;
        String str8 = str4;
        String str9 = str3;
        if ((i & 32) != 0) {
            str9 = null;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        String strJ3 = "";
        if ((i & 128) != 0) {
            str8 = "";
        }
        c1358110lRh.getClass();
        if (activity != null && user != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (str9 == null) {
                str5 = "recommend_panel";
            } else {
                str5 = str9;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str5);
            c2344009Gk.LJIIIIZZ("previous_page", str);
            c2344009Gk.LJIIIIZZ("enter_position", str2);
            c2344009Gk.LJIIIIZZ("rec_uid", user.getUid());
            c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
            c2344009Gk.LJIIIIZZ("req_id", user.getRequestId());
            c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(user));
            c2344009Gk.LJIIIIZZ("rec_type", user.getRecType());
            c2344009Gk.LJIIIIZZ("relation_type", user.getFriendTypeStr());
            C1D0F c1d0f = C1D0F.LIZ;
            c2344009Gk.LJ(Boolean.valueOf(c1d0f.isConnected()), c1d0f.LIZ());
            c2344009Gk.LJIIIIZZ(c1d0f.LIZIZ(), c1d0f.LIZJ());
            c2344009Gk.LJIIIIZZ("tab_name", str8);
            c2344009Gk.LIZJ(1, "is_recommend");
            C1365450ldX.LJ(c2344009Gk, user);
            c2344009Gk.LIZJ(C1359720lUI.LJ(upvoteStruct) ? 1 : 0, "with_recommendation");
            if (upvoteStruct != null) {
                iMAIMojiStickerLIZJ = C1359720lUI.LIZJ(upvoteStruct);
            } else {
                iMAIMojiStickerLIZJ = null;
            }
            C1358170lRn.LIZIZ(c2344009Gk, iMAIMojiStickerLIZJ);
            c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
            C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
            if (upvoteStruct != null) {
                C1358770lSl.LIZ.getClass();
                if (C1358770lSl.LJ(upvoteStruct)) {
                    C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                    EnumC1260930iux enumC1260930iux = EnumC1260930iux.ENTER_PROFILE;
                    c1358550lSP.getClass();
                    C1358550lSP.LIZJ(user, enumC1260930iux, str9);
                }
            }
            ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LIZ(user);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://user/profile/");
            sbLIZ.append(user.getUid());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("uid", user.getUid());
            smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
            if (str9 == null) {
                str6 = "recommend_panel";
            } else {
                str6 = str9;
            }
            smartRouteBuildRoute.withParam("enter_from", str6);
            smartRouteBuildRoute.withParam("extra_from_pre_page", "recommend_panel");
            if (z) {
                z2 = true;
                smartRouteBuildRoute.withParam("from_repost_avatar_sticker", true);
            } else {
                z2 = true;
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "repost_tab_default_route", z2, false) && (str9 == null || Intrinsics.LJFF(str9, "recommend_panel"))) {
                smartRouteBuildRoute.withParam("from_scene", "1036");
            }
            if (upvoteStruct != null) {
                C1358770lSl.LIZ.getClass();
                if (C1358770lSl.LJ(upvoteStruct) == z2) {
                    try {
                        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("scene_type", EnumC1260920iuw.CARD);
                        jSONObject.put("position", "repost_sheet");
                        String recType = user.getRecType();
                        if (recType == null) {
                            recType = "";
                        }
                        jSONObject.put("rec_type", recType);
                        if (matchedFriendStruct == null || (str7 = matchedFriendStruct.relationType) == null) {
                            str7 = "";
                        }
                        jSONObject.put("relation_type", str7);
                        jSONObject.put("to_user_id", user.getUid());
                        String requestId = user.getRequestId();
                        if (requestId == null) {
                            requestId = "";
                        }
                        jSONObject.put("req_id", requestId);
                        C1365450ldX.LIZJ(user.getSocialInfo(), jSONObject);
                        strJ3 = C786410Ut5.J3(jSONObject);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
            smartRouteBuildRoute.withParam("event_keys", strJ3);
            smartRouteBuildRoute.open();
        }
    }
}
