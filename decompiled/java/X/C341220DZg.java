package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionPreview;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341220DZg implements C0DZT {
    public static final C341220DZg LIZ = new C341220DZg();

    public static final void LJIILJJIL() {
        LJIIZILJ("note_reach_max_char", C2097908Jt.LIZJ(new Pair("is_new_thought", 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJIILL(User user, String str) {
        Object c098200Yq;
        C11NZ<C1641660sp2<User>> c11nzLJIIIZ;
        C735840Sti.LIZ.getClass();
        int iLJIIIIZZ = C735840Sti.LJIIIIZZ(user);
        boolean z = true;
        if (iLJIIIIZZ >= 1) {
            return String.valueOf(iLJIIIIZZ);
        }
        int i = 0;
        if (str != null) {
            if (str.length() <= 0) {
                z = false;
            }
            Object obj = null;
            if (!z) {
                str = null;
            }
            if (str != null) {
                try {
                    IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                    if (iUserService != null && (c11nzLJIIIZ = iUserService.LJIIIZ(str)) != null) {
                        c098200Yq = (User) ((C1641660sp2) c11nzLJIIIZ.LJLJI(50L, TimeUnit.MILLISECONDS).LIZLLL()).LIZ();
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                C735840Sti.LIZ.getClass();
                int iMax = Math.max(iLJIIIIZZ, C735840Sti.LJIIIIZZ((User) obj));
                if (iMax >= 0) {
                    i = iMax;
                }
                return String.valueOf(i);
            }
        }
        if (iLJIIIIZZ < 0) {
            iLJIIIIZZ = 0;
        }
        return String.valueOf(iLJIIIIZZ);
    }

    public static void LJIIZILJ(String str, Map map) {
        C0LAB c0lab = new C0LAB();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                c0lab.LJ(str2, value.toString());
            }
        }
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }

    public static Map LJ(ThoughtInfo thoughtInfo, String str, String str2) {
        long jLongValue;
        String str3;
        ThoughtInteractionPreview thoughtInteractionPreview;
        Long l;
        if (thoughtInfo != null && (thoughtInteractionPreview = thoughtInfo.interactionPreview) != null && (l = thoughtInteractionPreview.interactionCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Pair[] pairArr = new Pair[6];
        int i = 0;
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        if (thoughtInfo == null || (str3 = thoughtInfo.thoughtId) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("thought_id", str3);
        pairArr[3] = new Pair("is_mention", 0);
        pairArr[4] = new Pair("mention_count", 0);
        if (jLongValue > 0) {
            i = 1;
        }
        pairArr[5] = new Pair("is_like", Integer.valueOf(i));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LJII(ThoughtInfo thoughtInfo, String str, String str2) {
        String str3;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        if (thoughtInfo == null || (str3 = thoughtInfo.thoughtId) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("thought_id", str3);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final void LJIIIIZZ(ThoughtInfo thoughtInfo, String str, String str2) {
        LJIIZILJ("ttsocial_creator_thought_view_panel_show", LJ(thoughtInfo, str, str2));
    }

    public static final void LJIIL(String str, String str2, boolean z) {
        LJIIZILJ("ttsocial_thought_edit_panel_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("has_thought", Integer.valueOf(z ? 1 : 0))));
    }

    public static void LJIIJJI(ThoughtInfo thoughtInfo, String str, String str2, boolean z, String str3) {
        String str4;
        long jLongValue;
        ThoughtInteractionPreview thoughtInteractionPreview;
        Long l;
        String str5;
        Pair[] pairArr = new Pair[9];
        int length = 0;
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        String str6 = null;
        if (thoughtInfo != null) {
            str6 = thoughtInfo.authorUid;
        }
        if (str6 == null) {
            str6 = "";
        }
        pairArr[2] = new Pair("author_id", str6);
        if (thoughtInfo != null && (str5 = thoughtInfo.textContent) != null) {
            length = str5.length();
        }
        pairArr[3] = new Pair("content_length", Integer.valueOf(length));
        pairArr[4] = new Pair("is_mention", 0);
        pairArr[5] = new Pair("mention_count", 0);
        if (thoughtInfo == null || (str4 = thoughtInfo.thoughtId) == null) {
            str4 = "";
        }
        pairArr[6] = new Pair("thought_id", str4);
        if (thoughtInfo != null && (thoughtInteractionPreview = thoughtInfo.interactionPreview) != null && (l = thoughtInteractionPreview.interactionCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        pairArr[7] = new Pair("like_count", Long.valueOf(jLongValue));
        pairArr[8] = new Pair("result", Integer.valueOf(z ? 1 : 0));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (!z) {
            if (str3 == null) {
                str3 = "";
            }
            mapLJIIJ.put("fail_reason", str3);
        }
        LJIIZILJ("ttsocial_thought_delete_result", mapLJIIJ);
    }

    public static Map LJI(int i, String str, String str2, boolean z, String str3, boolean z2) {
        Pair[] pairArr = new Pair[8];
        int i2 = 0;
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        if (z) {
            i2 = 1;
        }
        pairArr[2] = new Pair("has_thought", Integer.valueOf(i2));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("author_id", str3);
        pairArr[4] = new Pair("content_length", Integer.valueOf(i));
        pairArr[5] = new Pair("is_mention", 0);
        pairArr[6] = new Pair("mention_count", 0);
        pairArr[7] = new Pair("is_restore", Integer.valueOf(z2 ? 1 : 0));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static void LJIILIIL(String str, String str2, String str3, ThoughtInfo thoughtInfo, String str4, boolean z) {
        String str5;
        String str6;
        if (z) {
            str5 = "like";
        } else {
            str5 = "like_cancel";
        }
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_position", str2);
        pairArr[2] = new Pair("enter_method", str3);
        pairArr[3] = new Pair("story_type", "story");
        String str7 = null;
        if (thoughtInfo != null) {
            str7 = thoughtInfo.authorUid;
        }
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        pairArr[4] = new Pair("author_id", str7);
        if (thoughtInfo != null && (str6 = thoughtInfo.thoughtId) != null) {
            str8 = str6;
        }
        pairArr[5] = new Pair("thought_id", str8);
        pairArr[6] = new Pair("is_new_thought", 1);
        pairArr[7] = new Pair("is_note", 1);
        pairArr[8] = new Pair("follow_status", str4);
        LJIIZILJ(str5, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static Map LJIILLIIL(int i, String str, String str2, String str3, String str4, boolean z) {
        Pair[] pairArr = new Pair[8];
        int i2 = 0;
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        if (z) {
            i2 = 1;
        }
        pairArr[2] = new Pair("has_thought", Integer.valueOf(i2));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("author_id", str3);
        pairArr[4] = new Pair("content_length", Integer.valueOf(i));
        pairArr[5] = new Pair("is_mention", 0);
        pairArr[6] = new Pair("mention_count", 0);
        pairArr[7] = new Pair("restore_scene", str4);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.C0DZT
    public final void LIZ(int i, String str, String str2, String str3, String str4, boolean z) {
        LJIIZILJ("ttsocial_thought_restore_click", LJIILLIIL(i, str, str2, str3, str4, z));
    }

    @Override // X.C0DZT
    public final void LIZIZ(int i, String str, String str2, String str3, String str4, boolean z) {
        LJIIZILJ("ttsocial_thought_restore_show", LJIILLIIL(i, str, str2, str3, str4, z));
    }

    @Override // X.C0DZT
    public final void LIZLLL(int i, String str, String str2, boolean z, String str3, boolean z2) {
        LJIIZILJ("ttsocial_thought_post_click", LJI(i, str, str2, z, str3, z2));
    }

    public static Map LJFF(String str, ThoughtInfo thoughtInfo, String str2, String str3, boolean z, String str4, String str5, Integer num, String str6) {
        String str7;
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("enter_from", str2);
        pairArr[1] = new Pair("enter_method", str3);
        String str8 = "";
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("author_id", str);
        pairArr[3] = new Pair("is_mention", 0);
        pairArr[4] = new Pair("is_creation_bubble", Integer.valueOf(z ? 1 : 0));
        pairArr[5] = new Pair("ring_status", str4);
        pairArr[6] = new Pair("is_new_thought", 1);
        pairArr[7] = new Pair("num", num);
        pairArr[8] = new Pair("req_id", str6);
        pairArr[9] = new Pair("follow_status", str5);
        if (thoughtInfo != null && (str7 = thoughtInfo.thoughtId) != null) {
            str8 = str7;
        }
        pairArr[10] = new Pair("thought_id", str8);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final void LJIIIZ(String str, ThoughtInfo thoughtInfo, String str2, String str3, boolean z, String str4, String str5, Integer num, String str6) {
        LJIIZILJ("ttsocial_thought_bubble_click", LJFF(str, thoughtInfo, str2, str3, z, str4, str5, num, str6));
    }

    public static final void LJIIJ(String str, ThoughtInfo thoughtInfo, String str2, String str3, boolean z, String str4, String str5, Integer num, String str6) {
        LJIIZILJ("ttsocial_thought_bubble_show", LJFF(str, thoughtInfo, str2, str3, z, str4, str5, num, str6));
    }

    @Override // X.C0DZT
    public final void LIZJ(String str, String str2, boolean z, String str3, int i, String str4, boolean z2, String str5, Long l, Long l2, boolean z3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJI(i, str, str2, z, str3, z3));
        String str6 = "";
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("thought_id", str4);
        linkedHashMap.put("result", Integer.valueOf(z2 ? 1 : 0));
        if (!z2) {
            if (str5 != null) {
                str6 = str5;
            }
            linkedHashMap.put("fail_reason", str6);
        }
        if (l != null) {
            linkedHashMap.put("client_publish_time_in_ms", Long.valueOf(l.longValue()));
        }
        if (l2 != null) {
            linkedHashMap.put("server_publish_time_in_ms", Long.valueOf(l2.longValue()));
        }
        LJIIZILJ("ttsocial_thought_post_result", linkedHashMap);
    }
}
