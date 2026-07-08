package X;

/* JADX INFO: renamed from: X.0guJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183650guJ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1985406959:
                    if (str.equals("anchor_show_preload")) {
                        return "feed_ctr";
                    }
                    break;
                case -53302717:
                    if (str.equals("video_anchor_touch_preload")) {
                        return "video_touch";
                    }
                    break;
                case 137823816:
                    if (str.equals("anchor_click_preload")) {
                        return "click";
                    }
                    break;
                case 810067679:
                    if (str.equals("comment_anchor_touch_preload")) {
                        return "comment_touch";
                    }
                    break;
            }
        }
        return str;
    }
}
