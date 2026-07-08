package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v6J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729250v6J {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str, String str2, String str3, boolean z, String str4, Integer num) {
        String str5;
        int i;
        boolean z2;
        Pair[] pairArr = new Pair[5];
        int i2 = 0;
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            str5 = "before_live";
        } else {
            str5 = "during_live";
        }
        pairArr[1] = new Pair("live_status", str5);
        pairArr[2] = new Pair("room_id", str);
        pairArr[3] = new Pair("author_id", str2);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[4] = new Pair("is_new", Integer.valueOf(i));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str4 != null) {
            mapLJIIJ.put("page_name", str4);
        }
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            mapLJIIJ.put("user_type", "author");
        } else {
            mapLJIIJ.put("user_type", "moderator");
            mapLJIIJ.put("moderator_id", str3);
        }
        if (num != null) {
            num.intValue();
            if (num.intValue() == 2) {
                i2 = 1;
            }
            mapLJIIJ.put("is_from_sug_template", Integer.valueOf(i2));
        }
        return mapLJIIJ;
    }

    public static void LJI(int i, String str, String str2, String str3, String str4, boolean z) {
        Map mapLIZ = LIZ(str, str2, str4, z, "notice_board_template", Integer.valueOf(i));
        mapLIZ.put("button_name", str3);
        C1421105hJ.LIZJ("livesdk_tiktokec_button_click", mapLIZ);
    }

    public static void LJII(String str, String str2, boolean z, boolean z2, String str3, int i, String str4, String str5) {
        Map mapLIZ = LIZ(str, str2, str5, z, "notice_board_template", Integer.valueOf(i));
        mapLIZ.put("is_success", Integer.valueOf(z2 ? 1 : 0));
        mapLIZ.put("result_name", str3);
        if (str4 != null) {
            mapLIZ.put("fail_reason", str4);
        }
        mapLIZ.put("photo_num", 1);
        C1421105hJ.LIZJ("livesdk_tiktokec_result_show", mapLIZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2) {
        Map mapLIZ = LIZ(str, str2, str5, z, "notice_board_edit", Integer.valueOf(i2));
        mapLIZ.put("button_name", str4);
        mapLIZ.put("template_id", str3);
        mapLIZ.put("template_type", Integer.valueOf(i));
        mapLIZ.put("is_suggested_template", Integer.valueOf(z2 ? 1 : 0));
        C1421105hJ.LIZJ("livesdk_tiktokec_button_click", mapLIZ);
    }

    public static void LJ(String str, String str2, long j, boolean z, String str3, int i, String str4, String str5, int i2, boolean z2) {
        Map mapLIZ = LIZ(str, str2, str5, z, "notice_board_edit", Integer.valueOf(i2));
        mapLIZ.put("stay_time", Long.valueOf(j));
        mapLIZ.put("quit_type", str4);
        mapLIZ.put("template_id", str3);
        mapLIZ.put("template_type", Integer.valueOf(i));
        mapLIZ.put("is_suggested_template", Integer.valueOf(z2 ? 1 : 0));
        C1421105hJ.LIZJ("livesdk_tiktokec_stay_page", mapLIZ);
    }

    public static void LJFF(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        int i3;
        Map mapLIZ = LIZ(str, str2, str5, z, "notice_board_template", Integer.valueOf(i2));
        mapLIZ.put("button_name", str3);
        mapLIZ.put("template_id", str4);
        if (z2) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        mapLIZ.put("is_org_template", Integer.valueOf(i3));
        mapLIZ.put("template_type", Integer.valueOf(i));
        mapLIZ.put("is_suggested_template", Integer.valueOf(z3 ? 1 : 0));
        C1421105hJ.LIZJ("livesdk_tiktokec_button_click", mapLIZ);
    }

    public static void LIZLLL(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, boolean z4, Boolean bool, Integer num, Boolean bool2, Boolean bool3, long j, String str5, String str6, String str7, String str8, int i) {
        String str9;
        String str10 = str8;
        String str11 = str7;
        String str12 = str6;
        String str13 = str5;
        if ((i & 256) != 0) {
            bool = null;
        }
        if ((i & 512) != 0) {
            num = null;
        }
        if ((i & 1024) != 0) {
            bool2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool3 = null;
        }
        if ((i & 8192) != 0) {
            str13 = null;
        }
        if ((i & 16384) != 0) {
            str12 = null;
        }
        if ((65536 & i) != 0) {
            str11 = null;
        }
        if ((i & 131072) != 0) {
            str10 = null;
        }
        Map mapLIZ = LIZ(str, str2, null, z, "", null);
        mapLIZ.remove("page_name");
        mapLIZ.put("is_live_take_default", Integer.valueOf(z2 ? 1 : 0));
        mapLIZ.put("resource_id", str3);
        mapLIZ.put("sticker_id", str4);
        if (z3) {
            str9 = "template";
        } else {
            str9 = "photo";
        }
        mapLIZ.put("billboard_type", str9);
        if (str13 != null) {
            mapLIZ.put("photo_id", str13);
        }
        if (str12 != null) {
            mapLIZ.put("template_id", str12);
        }
        if (bool != null) {
            mapLIZ.put("is_org_template", Integer.valueOf(!bool.booleanValue() ? 1 : 0));
        }
        mapLIZ.put("is_auto_display", Integer.valueOf(z4 ? 1 : 0));
        if (num != null) {
            mapLIZ.put("template_type", Integer.valueOf(num.intValue()));
        }
        if (bool2 != null) {
            mapLIZ.put("is_suggested_template", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (bool3 != null) {
            mapLIZ.put("is_collage_template", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        if (str11 != null) {
            mapLIZ.put("product_id", str11);
        }
        mapLIZ.put("use_time", Long.valueOf(j));
        if (str10 == null) {
            str10 = "";
        }
        mapLIZ.put("operated_from", str10);
        C1421105hJ.LIZJ("livesdk_tiktokec_billboard_use_time", mapLIZ);
    }

    public static void LJIIIIZZ(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, boolean z4, Boolean bool, Integer num, Boolean bool2, Boolean bool3, String str5, String str6, String str7, String str8, String str9, int i) {
        String str10;
        String str11 = str9;
        String str12 = str8;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        if ((i & 256) != 0) {
            bool = null;
        }
        if ((i & 512) != 0) {
            num = null;
        }
        if ((i & 1024) != 0) {
            bool2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool3 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str15 = null;
        }
        if ((i & 8192) != 0) {
            str14 = null;
        }
        if ((32768 & i) != 0) {
            str13 = null;
        }
        if ((65536 & i) != 0) {
            str12 = null;
        }
        if ((i & 131072) != 0) {
            str11 = null;
        }
        Map mapLIZ = LIZ(str, str2, null, z, "", null);
        mapLIZ.remove("page_name");
        mapLIZ.put("is_live_take_default", Integer.valueOf(z2 ? 1 : 0));
        mapLIZ.put("resource_id", str3);
        mapLIZ.put("sticker_id", str4);
        if (z3) {
            str10 = "template";
        } else {
            str10 = "photo";
        }
        mapLIZ.put("billboard_type", str10);
        if (str14 != null) {
            mapLIZ.put("photo_id", str14);
        }
        if (str15 != null) {
            mapLIZ.put("template_id", str15);
        }
        if (bool != null) {
            mapLIZ.put("is_org_template", Integer.valueOf(!bool.booleanValue() ? 1 : 0));
        }
        mapLIZ.put("is_auto_display", Integer.valueOf(z4 ? 1 : 0));
        if (num != null) {
            mapLIZ.put("template_type", Integer.valueOf(num.intValue()));
        }
        if (bool2 != null) {
            mapLIZ.put("is_suggested_template", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (bool3 != null) {
            mapLIZ.put("is_collage_template", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        if (str13 != null) {
            mapLIZ.put("product_id", str13);
        }
        if (str12 != null) {
            mapLIZ.put("previous_page", str12);
        }
        if (str11 == null) {
            str11 = "";
        }
        mapLIZ.put("operated_from", str11);
        C1421105hJ.LIZJ("livesdk_tiktokec_billboard_select", mapLIZ);
    }
}
