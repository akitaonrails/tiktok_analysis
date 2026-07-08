package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07TY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TY {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("origin", "original");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("lv_sync", "others", "others_share", "add_yours");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("edit_page_recommend", "edit_page_list", "shoot_page_recommend", "shoot_page_list", "profile_photo", "video_capsule_recommend", "effect_music_recommend", "prop_music_recommended", "sticker_rec", "profile_photo", "slideshow_rec", "sync_page_recommend");
    public static final List<String> LIZLLL = Collections.singletonList("l8_import");

    public static final void LIZ(String str, Map<String, String> map) {
        String str2 = map.get("music_id");
        String str3 = map.get("music_log_id");
        if ((str2 == null || str2.length() == 0) && str3 != null && str3.length() != 0) {
            C01CY.LIZJ(str, map, Collections.singletonList("music_log_id"), null, "music_id is empty but music_log_id not empty.");
        }
        if (Intrinsics.LJFF(map.get("shoot_way"), "stitch") && str2 != null && str2.length() != 0) {
            if (str3 == null || str3.length() == 0) {
                C01CY.LIZJ(str, map, Collections.singletonList("music_id"), null, "music_id not empty but music_log_id is empty.");
            }
        }
    }

    public static final void LIZJ(String str, Map<String, String> map) {
        boolean z;
        String str2;
        String str3 = map.get("music_id");
        String str4 = map.get("music_selected_from");
        String str5 = map.get("music_log_id");
        if (C13LP.LJJJJ(map.get("shoot_way"), LIZLLL) || C13LP.LJJJJ(str4, LIZIZ)) {
            return;
        }
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str6 = "";
        if (!z) {
            if (u.LJJIIJZLJL(str3, "-", false)) {
                return;
            }
            if (str4 == null || str4.length() == 0 || Intrinsics.LJFF(str4, "origin") || Intrinsics.LJFF(str4, "original")) {
                str6 = "music_selected_from should not be in (null, origin, original)";
            }
            if (str6.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str6);
                sbLIZ.append(" when music_id is not null");
                C01CY.LIZJ(str, map, C1697810uHb.LJIIJJI("music_id", "music_log_id", "music_selected_from"), null, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            LIZIZ(str, str4, str5, map);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str4 == null || str4.length() == 0 || Intrinsics.LJFF(str4, "origin") || Intrinsics.LJFF(str4, "original")) {
            str2 = "";
        } else {
            str2 = "music_selected_from should be in (null, original, origin)";
        }
        if (str5 != null && str5.length() != 0) {
            str6 = "music_log_id should be empty";
        }
        sb.append(str2);
        if (sb.length() > 0 && str6.length() > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" and ");
            sbLIZ2.append(str6);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        } else if (sb.length() == 0 && str6.length() > 0) {
            sb.append(str6);
        }
        if (sb.length() == 0) {
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append((Object) sb);
        sbLIZ3.append(" when music_id is empty");
        C01CY.LIZJ(str, map, C1697810uHb.LJIIJJI("music_id", "music_log_id", "music_selected_from"), null, C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final void LIZIZ(String str, String str2, String str3, Map<String, String> map) {
        String str4;
        if (C13LP.LJJJJ(str2, LIZJ)) {
            if (str3 != null && str3.length() != 0) {
                str4 = "";
            } else {
                str4 = "music_log_id should not be empty";
            }
            if (str4.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str4);
                sbLIZ.append(" when music_id is not empty");
                C01CY.LIZJ(str, map, C1697810uHb.LJIIJJI("music_id", "music_log_id", "music_selected_from"), null, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
