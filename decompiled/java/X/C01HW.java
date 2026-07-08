package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.01HW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z) {
        String str;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        map.put("button_action_type", str);
        C0KX4.LIZ("livesdk_multi_anchor_blank_panel_show_layout", map, null, true);
    }
}
