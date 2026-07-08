package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0RGO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGO {
    public static boolean LIZ() {
        if (!((Boolean) C105100aX.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!C0S11.LLJ) {
            C0S11.LLJ = Keva.getRepo("tt_story_viewer_list_popup").getBoolean("key_has_show_viewer_list_popup", false);
        }
        return !C0S11.LLJ;
    }
}
