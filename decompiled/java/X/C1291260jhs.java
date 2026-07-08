package X;

import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1291260jhs {
    public static final Map<String, Object> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("animation_type", "");
    }

    public static void LIZ(LynxUI lynxUI, String str, String str2) {
        if (lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
            Map<String, Object> map = LIZ;
            ((HashMap) map).put("animation_type", str2);
            lynxUI.mContext.LLIZ.LIZIZ(new C1298700jts(lynxUI.getSign(), str, map));
        }
    }
}
