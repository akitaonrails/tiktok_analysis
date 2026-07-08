package X;

import java.util.List;

/* JADX INFO: renamed from: X.0mpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411580mpw {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("enter_video_shoot_page", "enter_clip_edit_page", "enter_video_edit_page", "enter_video_post_page");
    public static long LIZIZ = -1;
    public static String LIZJ = "";

    public static final void LIZ(String str) {
        List<String> list = LIZ;
        if (!list.contains(str)) {
            return;
        }
        if (!list.contains(LIZJ)) {
            LIZJ = str;
        } else if (list.indexOf(LIZJ) < list.indexOf(str)) {
            LIZJ = str;
        }
    }
}
