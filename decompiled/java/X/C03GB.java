package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.03GB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GB {
    public static HashMap LIZ(boolean z) {
        HashMap map = new HashMap();
        map.put("disableBounces", 1);
        if (!z) {
            map.put("__status_bar", Boolean.TRUE);
            map.put("hide_nav_bar", 1);
            map.put("container_color_auto_dark", 1);
            map.put("should_full_screen", 1);
            return map;
        }
        map.put("use_webview_title", 1);
        return map;
    }
}
