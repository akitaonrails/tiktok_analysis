package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.reddot.RedDotService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587170rP9 {
    public static final C1587170rP9 LIZ = new C1587170rP9();
    public static long LIZIZ;
    public static final HashMap<EnumC1586610rOF, String> LIZJ;
    public static final HashMap<EnumC1586610rOF, String> LIZLLL;

    public static void LJI() {
        C20684815ws.LJIJI("friends_tab_show", LJ());
    }

    static {
        EnumC1586610rOF enumC1586610rOF = EnumC1586610rOF.UNKNOWN;
        EnumC1586610rOF enumC1586610rOF2 = EnumC1586610rOF.FRIENDS_FEED;
        EnumC1586610rOF enumC1586610rOF3 = EnumC1586610rOF.REPOST_FEED;
        LIZJ = C2097608Jq.LJI(new Pair(enumC1586610rOF, "avatar_uid_list_friends"), new Pair(enumC1586610rOF2, "avatar_uid_list_friends"), new Pair(enumC1586610rOF3, "avatar_uid_list_repost"));
        LIZLLL = C2097608Jq.LJI(new Pair(enumC1586610rOF, "avatar_score_list_friends"), new Pair(enumC1586610rOF2, "avatar_score_list_friends"), new Pair(enumC1586610rOF3, "avatar_score_list_repost"));
    }

    public static Pair LJ() {
        return C1589640rT8.LIZIZ.F2() ? new Pair(1, "is_top_tab") : new Pair(0, "is_top_tab");
    }

    public static long LIZJ(UserNewContent userNewContent) {
        long jLongValue;
        if (userNewContent == null) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long startShowTimeStamp = userNewContent.getStartShowTimeStamp();
        if (startShowTimeStamp != null) {
            jLongValue = startShowTimeStamp.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        return (Math.max(0L, (jCurrentTimeMillis - jLongValue) + userNewContent.getTotalShowDuration()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 60);
    }

    public static String LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (C729510SjV.LJJIJIL(aweme)) {
            return "story";
        }
        if (aweme.getAwemeType() == 101) {
            return "live";
        }
        return "post";
    }

    public static void LJIIIZ(C1393110mM9 c1393110mM9) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1393120mMA(c1393110mM9, null), 3);
    }

    public static C443120HZe LIZIZ(String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        try {
            C0O0R c0o0r = C0O0R.LIZ;
            if (str == null) {
                str = "";
            }
            c0o0r.getClass();
            C0O0R.LJFF = str;
            C0O0R.LJ = z;
            C1586930rOl redDotMetadataBeforeEnteringTab = C1595430rcT.LIZIZ.LIZIZ().getRedDotMetadataBeforeEnteringTab();
            if (!redDotMetadataBeforeEnteringTab.LIZ.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (redDotMetadataBeforeEnteringTab.LIZJ > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!C1219904px.LIZ() && ((Number) C281160B0g.LIZ.getValue()).intValue() <= 0) {
                C0O0R.LJII = z3;
                C0O0R.LJIIIIZZ = z2;
            } else if (z2) {
                C0O0R.LJII = true;
                C0O0R.LJIIIIZZ = true;
            } else if (z3) {
                C0O0R.LJII = true;
                C0O0R.LJIIIIZZ = false;
            } else {
                C0O0R.LJII = false;
                C0O0R.LJIIIIZZ = false;
            }
            if (C0O0R.LIZIZ() <= 30000) {
                z4 = true;
            } else {
                z4 = false;
            }
            String str2 = "1";
            if (z4) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            if (C0O0R.LIZIZ() > C538540LAe.LLJJJIL) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            return new C443120HZe(new Pair(obj, "is_30s_enter"), new Pair(str2, "is_60s_enter"), new Pair(String.valueOf(C0O0R.LIZIZ()), "cold_start_enter_friends_time_ms"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return new C443120HZe(null, null, null);
        }
    }

    public static void LJII(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        LIZIZ = 0L;
        C20684815ws.LJIJI("homepage_friends_notice", new Pair(str, "enter_from"), new Pair("red_dot", "notice_type"), new Pair("click", "action_type"), new Pair(Long.valueOf(jCurrentTimeMillis), "show_click_interval_ms"), new Pair("friends", "icon"), new Pair(str2, "composition"), LJ(), new Pair("first_time_notice", "notice_from"));
    }

    public static void LJIIIIZZ(String str, String str2) {
        if (LIZIZ == 0) {
            LIZIZ = System.currentTimeMillis();
        }
        C20684815ws.LJIJI("homepage_friends_notice", new Pair(str, "enter_from"), new Pair("red_dot", "notice_type"), new Pair("show", "action_type"), new Pair("friends", "icon"), new Pair(str2, "composition"), LJ(), new Pair("first_time_notice", "notice_from"));
        RedDotService.LIZ.getClass();
        RedDotService redDotServiceLIZ = C04R9.LIZ();
        if (redDotServiceLIZ != null) {
            redDotServiceLIZ.LIZJ(new C1255570imJ(EnumC1584360rKc.FRIENDS, new C1255550imH(), EnumC1255080ilW.HOMEPAGE, null, 241));
        }
    }

    public static void LJIIJ(String str, C1393190mMH c1393190mMH) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1393180mMG(str, c1393190mMH, null), 3);
    }

    public static C2344009Gk LIZ(C2344009Gk c2344009Gk, C1587210rPD c1587210rPD, String str) {
        UserNewContent userNewContent;
        FriendsRedDotUser user;
        String str2;
        Object objValueOf;
        String str3;
        if ((!Intrinsics.LJFF(str, "head_number") && !Intrinsics.LJFF(str, "head_dot")) || c1587210rPD == null || (userNewContent = c1587210rPD.LIZIZ) == null || (user = userNewContent.getUser()) == null) {
            return c2344009Gk;
        }
        long jLIZJ = LIZJ(userNewContent);
        C1587220rPE c1587220rPE = C1587220rPE.LIZ;
        String str4 = user.uid;
        c1587220rPE.getClass();
        int iLIZJ = C1587220rPE.LIZJ(str4);
        c2344009Gk.LJFF("heads_user_id", user.uid);
        c2344009Gk.LIZIZ(user.affinityScore, "affinity_score");
        c2344009Gk.LIZLLL(jLIZJ, "duration");
        c2344009Gk.LIZJ(iLIZJ, "show_count");
        if (c1587210rPD.LIZIZ.isStory() && C292350Bd3.LIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_story_circle", str2);
        Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> map = c1587210rPD.LIZJ;
        if (map != null) {
            for (Map.Entry<EnumC1586610rOF, ArrayList<? extends UserNewContent>> entry : map.entrySet()) {
                EnumC1586610rOF key = entry.getKey();
                ArrayList<? extends UserNewContent> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    String str5 = LIZJ.get(key);
                    String str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<? extends UserNewContent> it2 = value.iterator();
                    while (it2.hasNext()) {
                        FriendsRedDotUser user2 = it2.next().getUser();
                        if (user2 != null && (str3 = user2.uid) != null) {
                            arrayList.add(str3);
                        }
                    }
                    c2344009Gk.LJFF(str5, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                    String str7 = LIZLLL.get(key);
                    if (str7 != null) {
                        str6 = str7;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<? extends UserNewContent> it3 = value.iterator();
                    while (it3.hasNext()) {
                        FriendsRedDotUser user3 = it3.next().getUser();
                        if (user3 != null) {
                            objValueOf = Float.valueOf(user3.affinityScore);
                        } else {
                            objValueOf = 0;
                        }
                        arrayList2.add(objValueOf);
                    }
                    c2344009Gk.LJFF(str6, C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
                }
            }
        }
        return c2344009Gk;
    }

    public static void LJFF(String str, String str2, String str3) {
        String str4;
        if (Intrinsics.LJFF(str2, "click_bottom")) {
            str2 = "click";
        }
        Pair[] pairArr = new Pair[3];
        if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
            str4 = "homepage_friends";
        } else if (Intrinsics.LJFF(str, "REPOST_FEED")) {
            str4 = "repost_feed";
        } else {
            str4 = "";
        }
        pairArr[0] = new Pair(str4, "enter_from");
        pairArr[1] = new Pair(str2, "enter_method");
        pairArr[2] = new Pair(str3, "previous_page");
        C20684815ws.LJIJI("enter_social_sub_tab", pairArr);
    }

    public static void LJIILJJIL(int i, String str, String str2, String str3) {
        String str4;
        Pair[] pairArr = new Pair[5];
        String str5 = "";
        if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
            str4 = "homepage_friends";
        } else if (!Intrinsics.LJFF(str, "REPOST_FEED")) {
            str4 = "";
        } else {
            str4 = "repost_feed";
        }
        pairArr[0] = new Pair(str4, "enter_from");
        pairArr[1] = new Pair(str3, "style");
        pairArr[2] = new Pair(str2, "action_type");
        pairArr[3] = new Pair(Integer.valueOf(i), "number_cnt");
        if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
            str5 = "friends";
        } else if (Intrinsics.LJFF(str, "REPOST_FEED")) {
            str5 = "repost";
        }
        pairArr[4] = new Pair(str5, "tab_kind");
        C20684815ws.LJIJI("friendpage_sub_tab_top_notice", pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.String r8, int r9, int r10, int r11, java.lang.String r12, com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility r13, java.lang.String r14) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = X.C1587170rP9.LIZIZ
            long r0 = r0 - r2
            r2 = 0
            X.C1587170rP9.LIZIZ = r2
            if (r13 == 0) goto L8e
            X.0rPD r4 = r13.pm0()
            if (r4 == 0) goto L8f
            r3 = 1
        L14:
            X.1EK7 r2 = X.C1EK7.LIZ
            r2.getClass()
            boolean r2 = X.C1EK7.LIZ()
            if (r3 == 0) goto L86
            if (r2 == 0) goto L83
            java.lang.String r3 = "head_dot"
        L23:
            kotlin.Pair r7 = LJ()
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r5 = "enter_from"
            r2.LJIIIIZZ(r5, r8)
            java.lang.String r5 = "notice_type"
            r2.LJIIIIZZ(r5, r3)
            java.lang.String r6 = "action_type"
            java.lang.String r5 = "click"
            r2.LJIIIIZZ(r6, r5)
            java.lang.String r5 = "show_click_interval_ms"
            r2.LIZLLL(r0, r5)
            java.lang.String r1 = "icon"
            java.lang.String r0 = "friends"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "friends_tab_number_cnt"
            r2.LIZJ(r10, r0)
            java.lang.String r0 = "friends_tab_real_number_cnt"
            r2.LIZJ(r11, r0)
            java.lang.String r0 = "notice_reason"
            r2.LJIIIIZZ(r0, r12)
            java.lang.Object r1 = r7.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r7.getFirst()
            r2.LJ(r0, r1)
            LIZ(r2, r4, r3)
            java.lang.String r0 = "composition"
            r2.LJIIIIZZ(r0, r14)
            java.lang.String r1 = "notice_from"
            java.lang.String r0 = "new_publish"
            r2.LJIIIIZZ(r1, r0)
            if (r9 <= 0) goto L7b
            java.lang.String r0 = "number_cnt"
            r2.LIZJ(r9, r0)
        L7b:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "homepage_friends_notice"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L83:
            java.lang.String r3 = "head_number"
            goto L23
        L86:
            if (r2 == 0) goto L8b
            java.lang.String r3 = "red_dot"
            goto L23
        L8b:
            java.lang.String r3 = "number_dot"
            goto L23
        L8e:
            r4 = 0
        L8f:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587170rP9.LJIIJJI(java.lang.String, int, int, int, java.lang.String, com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility, java.lang.String):void");
    }

    public static void LJIIL(int i, int i2, int i3, IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbility, EnumC1586970rOp enumC1586970rOp, String str, String str2, String str3) {
        C087Q.LIZ(new C1587190rPB(i, i3, i2, iBottomFriendsTabAvatarAbility, enumC1586970rOp, str, str2, str3));
    }
}
