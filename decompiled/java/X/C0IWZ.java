package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEntranceDisableDislikeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IWZ {
    public static final C0IWZ LIZ = new C0IWZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(379));

    public static final boolean LJ(String str, String str2, boolean z) {
        if ((Intrinsics.LJFF(str, "homepage_hot") && (Intrinsics.LJFF(str2, "story_fixed_icon") || Intrinsics.LJFF(str2, "live_cover"))) || LiveEntranceDisableDislikeSetting.INSTANCE.enable(str, str2)) {
            return false;
        }
        if (C13LP.LJJJJ(str, (ArrayList) LIZIZ.getValue())) {
            return true;
        }
        if (z && TextUtils.equals("homepage_follow", str)) {
            return true;
        }
        if (Intrinsics.LJFF("follow_widget", str) && Intrinsics.LJFF("live_merge", str2)) {
            return true;
        }
        return false;
    }

    public static final void LIZ(C1106210etP c1106210etP, String str, boolean z, boolean z2) {
        Room room = c1106210etP.LJJIIZ;
        if (room == null) {
            return;
        }
        String str2 = c1106210etP.LJIL;
        String str3 = c1106210etP.LJJ;
        String str4 = c1106210etP.LJJJJLL;
        if (!z || z2) {
            C784440Upu.LIZ().LIZIZ(new C0IK8(room.getId(), C0IK6.DISLIKE));
            C766270U4b.LIZLLL(2131842709);
            if (z2) {
                return;
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        C468190IXp.LIZ(room, str2, str3, str, str4, null, null, null, c1106210etP.LJL);
    }

    public final void LIZLLL(C1106210etP c1106210etP, String str, String str2, Map map) {
        LIZJ(c1106210etP.LJJIIZ, c1106210etP.LJIL, c1106210etP.LJJ, "sharing_panel", c1106210etP.LJJJJLL, str, str2, map, c1106210etP.LJL);
    }

    public static final void LIZIZ(Room room, String str, String str2, String str3, int i, boolean z, Map map) {
        String str4;
        if (room == null) {
            return;
        }
        if (z) {
            C766270U4b.LIZLLL(2131844033);
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap.put(key, value);
            }
        }
        C0IMI.LIZ(linkedHashMap, room, str, str2, "long_press");
        if (Intrinsics.LJFF(str3, "fyp")) {
            linkedHashMap.put("live_window_mode", "preview_card");
        }
        if (!linkedHashMap.containsKey("is_guest_connection")) {
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            if (c924810aApLJ != null && c924810aApLJ.LJJII > 0) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_guest_connection", str4);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dislike_sec_submit");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "reason_id");
        c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "video_id");
        c474500IjALIZ.LJJII(str3, "event_page");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(Room room, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, ShareFromInfo shareFromInfo) {
        String str7 = str;
        if (room == null) {
            return;
        }
        C784440Upu.LIZ().LIZIZ(new C0IK8(room.getId(), C0IK6.DISLIKE));
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (str2 != null) {
            str8 = str2;
        }
        C468190IXp.LIZ(room, str7, str8, str3, str4, str5, str6, map, shareFromInfo);
    }
}
