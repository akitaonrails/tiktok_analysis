package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Sti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735840Sti {
    public static final C735840Sti LIZ = new C735840Sti();
    public static String LIZIZ = "slide";

    public static int LJIIIIZZ(User user) {
        if (user == null) {
            return -1;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[EDGE_INSN: B:75:0x0085->B:46:0x0085 BREAK  A[LOOP:1: B:34:0x005c->B:79:0x005c]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIIIZ(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C735840Sti.LJIIIZ(com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    public static long LJIJJ(Aweme aweme) {
        Story story;
        if (aweme != null && (story = aweme.getStory()) != null) {
            return story.storyStyleVersion;
        }
        return 0L;
    }

    public static void LIZIZ(Aweme aweme, Object obj) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LIZ(LIZ, new AwS625S0100000_11(obj, (Object) 109), aweme, null, null, null, true, null, null, 192)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIJ(String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", str);
        if (C123100dR.LIZ(str2)) {
            c0lab.LJ("position", str2);
        }
        C20684815ws.LJIILLIIL("story_archive_notification", c0lab.LIZ);
    }

    public static void LJIJI(boolean z, boolean z2) {
        String str;
        C0LAB c0lab = new C0LAB();
        String str2 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_success", str);
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("data_filter", str2);
        C20684815ws.LJIILLIIL("story_immersive_loadmore_monitor", c0lab.LIZ);
    }

    public static String LJIIJ(Context context, String str, String str2) {
        String str3 = C0SUC.LIZ(context).getExtra().get("enter_position");
        if (str3 != null) {
            return str3;
        }
        if (C1600750rl3.LJ(str2)) {
            return "top_cell";
        }
        if (C13LP.LJJJJ(str2, C1697810uHb.LJIIJJI("STORY_ENTRANCE_AVATAR", "STORY_ENTRANCE_MINE", "STORY_ENTRANCE_OTHER"))) {
            return "head";
        }
        if (Intrinsics.LJFF(str2, "STORY_ENTRANCE_PREVIEW")) {
            return "";
        }
        if (!Intrinsics.LJFF("homepage_follow", str) && !Intrinsics.LJFF("homepage_hot", str) && !Intrinsics.LJFF("homepage_nearby", str) && !Intrinsics.LJFF("homepage_friends", str)) {
            return "video_cover";
        }
        return "feed";
    }

    public static void LJIIJJI(Object obj, String str, Object obj2) throws JSONException {
        if (obj instanceof AbstractC1386130mAt) {
            if (obj2 instanceof String) {
                ((AbstractC1386130mAt) obj).LJ(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((AbstractC1386130mAt) obj).LIZLLL(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((AbstractC1386130mAt) obj).LJI(str, ((Boolean) obj2).booleanValue());
                return;
            } else {
                ((AbstractC1386130mAt) obj).LJ(str, obj2.toString());
                return;
            }
        }
        if (obj instanceof C2241008qG) {
            if (obj2 instanceof String) {
                ((C2241008qG) obj).LIZLLL(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C2241008qG) obj).LIZIZ((Integer) obj2, str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C2241008qG) obj).LIZ((Boolean) obj2, str);
                return;
            } else {
                ((C2241008qG) obj).LIZLLL(str, obj2.toString());
                return;
            }
        }
        if (obj instanceof C0LAB) {
            if (obj2 instanceof String) {
                ((C0LAB) obj).LJ(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C0LAB) obj).LIZ(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C0LAB) obj).LJFF(str, ((Boolean) obj2).booleanValue());
                return;
            } else {
                ((C0LAB) obj).LJ(str, obj2.toString());
                return;
            }
        }
        if (obj instanceof C2344009Gk) {
            if (obj2 instanceof String) {
                ((C2344009Gk) obj).LJFF(str, (String) obj2);
                return;
            }
            if (obj2 instanceof Integer) {
                ((C2344009Gk) obj).LIZJ(((Number) obj2).intValue(), str);
                return;
            } else if (obj2 instanceof Boolean) {
                ((C2344009Gk) obj).LJ(obj2, str);
                return;
            } else {
                ((C2344009Gk) obj).LJFF(str, obj2.toString());
                return;
            }
        }
        if (!(obj instanceof JSONObject)) {
            return;
        }
        if (obj2 instanceof String) {
            ((JSONObject) obj).put(str, obj2);
            return;
        }
        if (obj2 instanceof Integer) {
            ((JSONObject) obj).put(str, ((Number) obj2).intValue());
        } else if (obj2 instanceof Boolean) {
            ((JSONObject) obj).put(str, ((Boolean) obj2).booleanValue());
        } else {
            ((JSONObject) obj).put(str, obj2.toString());
        }
    }

    public static void LJIIL(String str, String str2, String str3) {
        C20684815ws.LJIILLIIL("ttsocial_story_reveal_banner_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("button_type", str3)));
    }

    public static void LJIILL(String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", str);
        c0lab.LJ("position", str2);
        c0lab.LJ("enter_from", str3);
        C20684815ws.LJIILLIIL("story_archive", c0lab.LIZ);
    }

    public static void LJI(Object obj, C735890Stn c735890Stn, String str, String str2) {
        try {
            C735840Sti c735840Sti = LIZ;
            C735860Stk c735860Stk = new C735860Stk(obj);
            c735840Sti.getClass();
            LJII(c735860Stk, c735890Stn, str, str2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJII(C735860Stk c735860Stk, C735890Stn c735890Stn, String str, String str2) {
        int iIntValue;
        long jLongValue;
        Long l;
        Integer num;
        Integer num2;
        int iIntValue2 = 0;
        if (c735890Stn != null && (num2 = c735890Stn.LIZ) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        c735860Stk.invoke("story_start_num", Integer.valueOf(iIntValue));
        if (c735890Stn != null && (num = c735890Stn.LIZIZ) != null) {
            iIntValue2 = num.intValue();
        }
        c735860Stk.invoke("story_current_num", Integer.valueOf(iIntValue2));
        if (c735890Stn != null && (l = c735890Stn.LIZJ) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 1;
        }
        c735860Stk.invoke("item_cnt", Integer.valueOf((int) jLongValue));
        c735860Stk.invoke("enter_method", LIZIZ);
        if (C123100dR.LIZ(str)) {
            c735860Stk.invoke("enter_position", str);
        }
        if (C123100dR.LIZ(str2)) {
            c735860Stk.invoke("enter_play_method", str2);
        }
    }

    public static void LIZJ(Object obj, Aweme aweme, String str, String str2, Context context, Fragment fragment) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LIZ(LIZ, new C735870Stl(obj), aweme, str, str2, context, false, fragment, null, 32)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILIIL(int i, String str, String str2, String str3, String str4, String str5) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("story_reveal_status", str3), new Pair("is_centralized_avatar", str4), new Pair("follow_status", String.valueOf(i)), new Pair("is_guide", str5));
        if (str2 != null) {
            mapLJIIJ.put("group_id", str2);
        }
        C20684815ws.LJIILLIIL("ttsocial_story_reveal_unlock_click", mapLJIIJ);
    }

    public static void LJIILJJIL(int i, String str, String str2, String str3, String str4, String str5) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("is_centralized_avatar", str3), new Pair("follow_status", String.valueOf(i)), new Pair("is_guide", str4));
        if (str2 != null) {
            mapLJIIJ.put("group_id", str2);
        }
        if (str5 != null) {
            mapLJIIJ.put("story_reveal_status", str5);
        }
        C20684815ws.LJIILLIIL("ttsocial_story_reveal_unlock_show", mapLJIIJ);
    }

    public static void LIZLLL(Object obj, Aweme aweme, String str, String str2, Context context, Fragment fragment, Map map) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(LIZ(LIZ, new C735880Stm(obj), aweme, str, str2, context, false, fragment, map, 32)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(C735840Sti c735840Sti, Function2 function2, Aweme aweme, String str, String str2, Context context, boolean z, Fragment fragment, Map map, int i) {
        Object[] objArr;
        String str3;
        Object obj;
        Fragment fragment2 = fragment;
        Map map2 = map;
        if ((i & 16) != 0) {
            context = null;
        }
        int i2 = 0;
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            fragment2 = null;
        }
        if ((i & 128) != 0) {
            map2 = null;
        }
        c735840Sti.getClass();
        if (aweme == null) {
            return false;
        }
        function2.invoke("story_theme", C729510SjV.LJIIIIZZ(aweme));
        boolean zLJJIJIL = C729510SjV.LJJIJIL(aweme);
        function2.invoke("is_preview_during_publishing", Integer.valueOf(C729510SjV.LJIJ(aweme) ? 1 : 0));
        String str4 = "1";
        if (zLJJIJIL) {
            function2.invoke("story_type", "story");
            if (C729510SjV.LJIJI(aweme)) {
                if (C729510SjV.LJIJJ(aweme)) {
                    str3 = "unlocked";
                } else {
                    str3 = "locked";
                }
                function2.invoke("story_reveal_status", str3);
                if (map2 == null || (obj = map2.get("is_centralized_avatar")) == null) {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                function2.invoke("is_centralized_avatar", obj);
            }
            if (z) {
                if (!C729510SjV.LJJIIZI(aweme)) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                function2.invoke("is_note", str4);
                function2.invoke("follow_status", Integer.valueOf(LJIIIIZZ(aweme.getAuthor())));
                return zLJJIJIL;
            }
            function2.invoke("story_collection_id", C729510SjV.LJII(aweme));
            if (str != null) {
                function2.invoke("enter_position", LJIIJ(context, str, str2));
            }
            function2.invoke("story_style_version", Long.valueOf(LJIJJ(aweme)));
            if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(fragment2) && aweme.getRequestId() != null) {
                function2.invoke("request_id", aweme.getRequestId());
            }
        } else {
            function2.invoke("story_type", "post");
        }
        if (C729510SjV.LJJIIZI(aweme)) {
            objArr = "1";
        } else {
            objArr = CardStruct.IStatusCode.DEFAULT;
        }
        function2.invoke("is_note", objArr);
        if (aweme.getIsStoryToNormal()) {
            i2 = 1;
        }
        function2.invoke("is_story_to_normal", Integer.valueOf(i2));
        function2.invoke("follow_status", Integer.valueOf(LJIIIIZZ(aweme.getAuthor())));
        if (!AwemeBizExtKt.getHasFriendsTag(aweme)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        function2.invoke("has_friends_tag", str4);
        return zLJJIJIL;
    }

    public static void LJIILLIIL(User user, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, Aweme aweme, boolean z3, String str4, Boolean bool, Boolean bool2, boolean z4, String str5, String str6, List list) {
        Integer numValueOf;
        StoryNoteInfo storyNoteInfo;
        StoryNoteInfo storyNoteInfo2;
        if (user == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("enter_method", str3);
        c0lab.LJ("author_id", user.getUid());
        c0lab.LIZ(LJIIIIZZ(user), "follow_status");
        c0lab.LJ("req_id", user.getRequestId());
        c0lab.LIZ(i, "num");
        c0lab.LIZ(i2, "bubble_num");
        c0lab.LIZ(z ? 1 : 0, "is_creation_bubble");
        c0lab.LIZ(z2 ? 1 : 0, "has_gif");
        c0lab.LIZ(z3 ? 1 : 0, "has_note_prompt");
        c0lab.LJ("note_prompt_text", str4);
        Integer numValueOf2 = null;
        if (aweme != null && (storyNoteInfo2 = aweme.storyNoteInfo) != null) {
            numValueOf = Integer.valueOf(storyNoteInfo2.subType);
        } else {
            numValueOf = null;
        }
        C1609930rzr.LJII(numValueOf, c0lab);
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null) {
            numValueOf2 = Integer.valueOf(storyNoteInfo.subType);
        }
        C1609930rzr.LJIIIZ(numValueOf2, c0lab);
        if (aweme != null) {
            C1609930rzr.LJIJI(aweme, c0lab);
        } else {
            C1609930rzr.LIZ(c0lab, "thought_text_type", C1609930rzr.LJJI(str6, list));
        }
        Boolean bool3 = Boolean.TRUE;
        c0lab.LIZ(Intrinsics.LJFF(bool, bool3) ? 1 : 0, "has_avatar_prompt");
        c0lab.LIZ(Intrinsics.LJFF(bool2, bool3) ? 1 : 0, "is_avatar_thought");
        C1609930rzr.LJIIL(str5, c0lab, Boolean.valueOf(z4));
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
