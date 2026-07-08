package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Suc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736400Suc {
    public static final C736400Suc LIZ = new C736400Suc();

    public static void LIZ(Activity activity) {
        Intent intent;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                String stringExtra = intent.getStringExtra("extra_params");
                if (stringExtra != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        if (jSONObject.isNull("follow_recommend_params")) {
                            return;
                        }
                        jSONObject.remove("follow_recommend_params");
                        intent.putExtra("extra_params", C786410Ut5.J3(jSONObject));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    activity.setIntent(intent);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LIZLLL(User user, String str, String str2) {
        if (user != null && Intrinsics.LJFF(str, "guide_dm")) {
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LJJIJLIJ("notification_page");
            c1260910iuv.LJJIL("guide_dm");
            c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJJLIIIJJI = C1260910iuv.LJJIZ(str2);
            c1260910iuv.LJJJJZI(user);
            c1260910iuv.LJJJJLI(user.getRequestId());
            c1260910iuv.LJJJJIZL("inbox_first_page");
            c1260910iuv.LJIILJJIL();
        }
    }

    public static void LIZIZ(Aweme aweme, Context context, String str, EnumC721820STc enumC721820STc) {
        C2189821An6 c2189821An6LIZ;
        User author;
        User author2;
        User author3;
        String requestId;
        User author4;
        User author5;
        User author6;
        String requestId2 = null;
        if (context != null) {
            c2189821An6LIZ = C0SUC.LIZ(context);
        } else {
            c2189821An6LIZ = null;
        }
        if (c2189821An6LIZ != null && c2189821An6LIZ.isCard()) {
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            String followRecommendTrackEnterFrom = c2189821An6LIZ.getFollowRecommendTrackEnterFrom();
            if (followRecommendTrackEnterFrom == null) {
                followRecommendTrackEnterFrom = c2189821An6LIZ.getEventType();
            }
            c1260910iuv.LJJIJLIJ(followRecommendTrackEnterFrom);
            c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
            c1260910iuv.LJJLL = enumC721820STc.getType();
            c1260910iuv.LJIJI(aweme);
            if (aweme != null) {
                author4 = aweme.getAuthor();
            } else {
                author4 = null;
            }
            c1260910iuv.LJJJJZI(author4);
            if (C296550Bjp.LIZ()) {
                String strLIZ = C721800STa.LIZ(c2189821An6LIZ);
                if (strLIZ != null || (aweme != null && (author6 = aweme.getAuthor()) != null && (strLIZ = author6.getRequestId()) != null)) {
                    c1260910iuv.LJJJJLI(strLIZ);
                }
            } else {
                if (aweme != null && (author5 = aweme.getAuthor()) != null) {
                    requestId2 = author5.getRequestId();
                }
                c1260910iuv.LJJJJLI(requestId2);
            }
            c1260910iuv.LJJJIL(c2189821An6LIZ.getMatchedFriendStructTrack());
            c1260910iuv.LJLJI = c2189821An6LIZ.isBigCard();
            ((AbstractC1386130mAt) c19651011uW.LJIIIZ(aweme, c1260910iuv)).LJIILJJIL();
            return;
        }
        C1360540lVc c1360540lVc = C1360540lVc.LIZIZ;
        C19651011uW c19651011uW2 = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv2 = new C1260910iuv(0);
        if (str == null) {
            if (c2189821An6LIZ != null) {
                str = c2189821An6LIZ.getEventType();
            } else {
                str = null;
            }
        }
        c1260910iuv2.LJJIJLIJ(str);
        c1260910iuv2.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
        c1260910iuv2.LJJJJLL();
        c1260910iuv2.LJJLIIIJJI = EnumC1260930iux.ENTER_PROFILE;
        c1260910iuv2.LJJLL = enumC721820STc.getType();
        c1260910iuv2.LJIJI(aweme);
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c1260910iuv2.LJJJJZI(author);
        if (C296550Bjp.LIZ()) {
            if ((c2189821An6LIZ != null && (requestId = C721800STa.LIZ(c2189821An6LIZ)) != null) || (aweme != null && (author3 = aweme.getAuthor()) != null && (requestId = author3.getRequestId()) != null)) {
                c1260910iuv2.LJJJJLI(requestId);
            }
        } else {
            if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                requestId2 = author2.getRequestId();
            }
            c1260910iuv2.LJJJJLI(requestId2);
        }
        c1260910iuv2.LJLL = C0SXF.LJJIII(context, aweme);
        ((C1260910iuv) c1360540lVc.LIZ(aweme, c19651011uW2.LJIIIZ(aweme, c1260910iuv2))).LJJJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[PHI: r6
      0x0083: PHI (r6v1 X.0Sud) = (r6v0 X.0Sud), (r6v2 X.0Sud), (r6v3 X.0Sud) binds: [B:20:0x005e, B:22:0x006a, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.app.Activity r8, java.lang.String r9, X.EnumC1584370rKd r10, com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C736400Suc.LIZJ(android.app.Activity, java.lang.String, X.0rKd, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static void LJ(User user, String str, String str2, String str3, String str4, String str5, Aweme aweme) {
        String recType;
        MatchedFriendStruct matchedFriendStruct;
        String str6;
        EnumC1260930iux enumC1260930iuxLJJIZ = null;
        if (user != null) {
            recType = user.getRecType();
        } else {
            recType = null;
        }
        if (((recType != null && recType.length() != 0) || ((user != null && (matchedFriendStruct = user.getMatchedFriendStruct()) != null && (str6 = matchedFriendStruct.recType) != null && str6.length() != 0) || (str4 != null && str4.length() != 0))) && str3 != null && str3.length() != 0) {
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            c1260910iuv.LJJJJJL(str4);
            c1260910iuv.LJJJJZI(user);
            c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
            c1260910iuv.LJJJJLL();
            if (str != null) {
                enumC1260930iuxLJJIZ = C1260910iuv.LJJIZ(str);
            }
            c1260910iuv.LJJLIIIJJI = enumC1260930iuxLJJIZ;
            C1260910iuv c1260910iuv2 = (C1260910iuv) c19651011uW.LJIIIZ(aweme, c1260910iuv);
            if (Intrinsics.LJFF(str2, "find_friends")) {
                c1260910iuv2.LJJIJLIJ("search_result");
                c1260910iuv2.LJJJJJ(str3);
            } else if (Intrinsics.LJFF(str2, "general_search") || Intrinsics.LJFF(str2, "search_result") || C1ER1.LIZIZ.LLJJL(str2)) {
                c1260910iuv2.LJJIJLIJ(str2);
                c1260910iuv2.LJJJJJ(str3);
            }
            if (C123100dR.LIZ(str5)) {
                c1260910iuv2.LJJIL(str5);
            }
            c1260910iuv2.LJIILJJIL();
        }
    }
}
