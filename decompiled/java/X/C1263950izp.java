package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Set;

/* JADX INFO: renamed from: X.0izp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263950izp {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"3-10", "3-11", "3-12", "3-13", "3-14"});

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct r10, X.C1056470dbB r11) {
        /*
            X.0db2 r9 = X.C1056380db2.LIZ
            r5 = 0
            if (r10 == 0) goto L2b
            boolean r0 = r10.isValid()
            if (r0 == 0) goto L2b
            java.lang.String r0 = r10.cacheReason
            r4 = 0
            r6 = 51
            r3 = 1
            if (r0 == 0) goto L2f
            java.lang.String r0 = r10.hashedPhoneNumber
            if (r0 == 0) goto L1d
            int r0 = r0.length()
            if (r0 != 0) goto L1e
        L1d:
            r4 = 1
        L1e:
            if (r4 != 0) goto L2c
            X.0dxf r0 = X.EnumC1070410dxf.CONTACT
        L22:
            X.0dbB r0 = X.C1056470dbB.LJ(r11, r0, r3, r5, r6)
            r0.LIZLLL(r5)
            java.lang.String r5 = r10.cacheReason
        L2b:
            return r5
        L2c:
            X.0dxf r0 = X.EnumC1070410dxf.FACEBOOK
            goto L22
        L2f:
            java.lang.String r1 = r10.hashedPhoneNumber
            java.lang.String r0 = r10.externalUsername
            if (r0 == 0) goto L53
            java.lang.String r8 = X.C447550Hgn.LIZ(r0)
        L39:
            r0 = 2131845976(0x7f116358, float:1.9325388E38)
            java.lang.String r2 = X.C20642515q3.LJI(r0)
            if (r1 == 0) goto L8d
            int r0 = r1.length()
            if (r0 != 0) goto L51
            r0 = 1
        L49:
            if (r0 == 0) goto L4c
            r1 = r5
        L4c:
            if (r1 == 0) goto L8d
            X.0dxf r7 = X.EnumC1070410dxf.CONTACT
            goto L55
        L51:
            r0 = 0
            goto L49
        L53:
            r8 = r5
            goto L39
        L55:
            java.lang.String r1 = r9.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6d
            X.0dbB r0 = X.C1056470dbB.LJ(r11, r7, r3, r5, r6)     // Catch: java.lang.Throwable -> L6d
            r0.LIZLLL(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6d
            r0[r4] = r1     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = X.C786410Ut5.j4(r2, r0)     // Catch: java.lang.Throwable -> L6d
            goto L8b
        L6d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof X.C1056400db4
            if (r0 == 0) goto Lb2
            X.0db4 r1 = (X.C1056400db4) r1
        L77:
            if (r1 == 0) goto L7f
            X.0db3 r1 = r1.getReason()
            if (r1 != 0) goto L81
        L7f:
            X.0db3 r1 = X.EnumC1056390db3.UNKNOWN
        L81:
            r0 = 35
            X.0dbB r0 = X.C1056470dbB.LJ(r11, r7, r4, r1, r0)
            r0.LIZLLL(r5)
            r0 = r5
        L8b:
            if (r0 != 0) goto Lad
        L8d:
            if (r8 == 0) goto Lae
            boolean r0 = kotlin.text.a0.LJJJIL(r8)
            if (r0 == 0) goto L96
            r8 = r5
        L96:
            if (r8 == 0) goto Lae
            X.0dxf r0 = X.EnumC1070410dxf.FACEBOOK
            X.0dbB r0 = X.C1056470dbB.LJ(r11, r0, r3, r5, r6)
            r0.LIZLLL(r5)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r8
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = X.C786410Ut5.j4(r2, r0)
        Lad:
            r5 = r0
        Lae:
            r10.setCacheReason(r5)
            return r5
        Lb2:
            r1 = r5
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263950izp.LIZ(com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct, X.0dbB):java.lang.String");
    }

    public static void LIZIZ(User user, Context context, String str, String str2, String str3, String str4, EnumC1260920iuw enumC1260920iuw, boolean z, Integer num, String str5, String str6, String str7, Boolean bool, String str8, boolean z2, View view, int i, Boolean bool2, int i2) {
        boolean zIsRelatedRec;
        C1261860iwS c1261860iwS;
        C1261860iwS c1261860iwS2;
        Boolean bool3 = bool2;
        String str9 = str8;
        String str10 = str6;
        String str11 = str5;
        Boolean bool4 = bool;
        Integer num2 = num;
        int i3 = i;
        boolean z3 = z;
        EnumC1260920iuw enumC1260920iuw2 = enumC1260920iuw;
        String str12 = str4;
        String str13 = str3;
        boolean z4 = z2;
        String str14 = str2;
        String str15 = "";
        if ((i2 & 4) != 0) {
            str14 = "";
        }
        if ((i2 & 8) != 0) {
            str13 = "";
        }
        if ((i2 & 16) != 0) {
            str12 = "";
        }
        AbstractC1261010iv5 from = null;
        if ((i2 & 32) != 0) {
            enumC1260920iuw2 = null;
        }
        if ((i2 & 64) != 0) {
            z3 = false;
        }
        if ((i2 & 256) != 0) {
            num2 = null;
        }
        if ((i2 & 512) != 0) {
            str11 = null;
        }
        if ((i2 & 1024) != 0) {
            str10 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str7 = "";
        }
        if ((i2 & 8192) != 0) {
            bool4 = Boolean.FALSE;
        }
        if ((i2 & 16384) != 0) {
            str9 = null;
        }
        if ((32768 & i2) != 0) {
            z4 = false;
        }
        if ((65536 & i2) != 0) {
            view = null;
        }
        if ((131072 & i2) != 0) {
            i3 = 0;
        }
        if ((i2 & 262144) != 0) {
            bool3 = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", str12);
        smartRouteBuildRoute.withParam("enter_from_request_id", user.getRequestId());
        smartRouteBuildRoute.withParam("extra_from_pre_page", str13);
        smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
        smartRouteBuildRoute.withParam("need_track_compare_recommend_reason", 1);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recommendReason = matchedFriendStruct.recommendReason;
            } else {
                recommendReason = null;
            }
        }
        smartRouteBuildRoute.withParam("previous_recommend_reason", recommendReason);
        smartRouteBuildRoute.withParam("recommend_from_type", "card");
        if (enumC1260920iuw2 == null) {
            enumC1260920iuw2 = EnumC1260920iuw.CARD;
        }
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                recType = matchedFriendStruct2.recType;
            } else {
                recType = null;
            }
        }
        C1252610ihX.Companion.getClass();
        EnumC736410Sud enumC736410SudLIZ = C736420Sue.LIZ(user);
        String uid = user.getUid();
        String requestId = user.getRequestId();
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
            if (matchedFriendStruct3 != null) {
                friendTypeStr = matchedFriendStruct3.relationType;
            } else {
                friendTypeStr = null;
            }
        }
        String socialInfo = user.getSocialInfo();
        if (socialInfo == null) {
            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
            if (matchedFriendStruct4 != null) {
                socialInfo = matchedFriendStruct4.socialInfo;
            } else {
                socialInfo = null;
            }
        }
        MatchedFriendStruct matchedFriendStruct5 = user.getMatchedFriendStruct();
        boolean z5 = user instanceof C1261860iwS;
        if (z5 && (c1261860iwS2 = (C1261860iwS) user) != null) {
            from = c1261860iwS2.getFrom();
        }
        if (z5 && (c1261860iwS = (C1261860iwS) user) != null) {
            zIsRelatedRec = c1261860iwS.isRelatedRec();
        } else {
            zIsRelatedRec = false;
        }
        smartRouteBuildRoute.withParam("recommend_enter_profile_params", new C1252610ihX(str, str13, enumC1260920iuw2, recType, enumC736410SudLIZ, uid, null, str11, requestId, str14, friendTypeStr, socialInfo, matchedFriendStruct5, null, num2, from, zIsRelatedRec, str12, str10, null, null, false, str9, z4, bool3));
        smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", z3);
        if (str7 != null) {
            str15 = str7;
        }
        smartRouteBuildRoute.withParam("source_page", str15);
        smartRouteBuildRoute.withParam("is_new_suggested", bool4);
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c0877.d8220_i");
        sbLIZ.append(i3);
        smartRouteBuildRoute.withParam("source_btm_token", btmSDK.createJumpSourceBtmToken(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(view), null));
        smartRouteBuildRoute.open();
    }
}
