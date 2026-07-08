package X;

import com.ss.android.ugc.aweme.lancet.PlayerGroupIdRecorderData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0np4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449480np4 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("shoot", "publish", "publish_finish", "enter_video_shoot_page", "record_video", "click_upload_entrance", "enter_video_edit_page", "enter_video_post_page", "click_save_local_on_edit_page", "save_draft", "draft_save", "stay_time", "prop_entrance_show", "click_prop_entrance", "change_record_mode", "enter_text_edit_page", "click_text_next_button", "enter_text_style_edit_page");

    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        Object[] objArr = (Object[]) C303760BvS.LIZ.getValue();
        if (objArr == null) {
            objArr = new String[0];
        }
        if (!LIZ.contains(str) && C13LQ.LJJIJIIJI(str, objArr) < 0) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, String str2) {
        if (Intrinsics.LJFF(str, "draft_load") && str2 != null) {
            C1449490np5.LIZ.getClass();
            if (C1449490np5.LIZJ().contains(str2)) {
                return;
            }
            PlayerGroupIdRecorderData playerGroupIdRecorderDataLJIIIIZZ = C1449490np5.LJIIIIZZ(str2);
            playerGroupIdRecorderDataLJIIIIZZ.lastPlayGid = "";
            playerGroupIdRecorderDataLJIIIIZZ.lastPagePlayGid = "";
            playerGroupIdRecorderDataLJIIIIZZ.lastPageName = "";
            playerGroupIdRecorderDataLJIIIIZZ.prePagePlayGid = "";
            playerGroupIdRecorderDataLJIIIIZZ.prePageName = "";
            playerGroupIdRecorderDataLJIIIIZZ.authorId = "";
            playerGroupIdRecorderDataLJIIIIZZ.requestId = "";
        }
    }
}
