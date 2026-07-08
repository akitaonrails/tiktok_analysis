package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0CdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317900CdA {
    public static final C317900CdA LIZ = new C317900CdA();

    public static void LIZ(String str, String str2, String str3, int i, String str4, Map map, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            map = C2097608Jq.LJ();
        }
        if (!C2524609uu.LIZ) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_type", str);
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("panel_scene", str3);
            c2344009Gk.LJIIIIZZ("component_name", str4);
            c2344009Gk.LIZJ(i, "error_type");
            c2344009Gk.LJII(map);
            C20684815ws.LJIILLIIL("feed_platform_component_monitor", c2344009Gk.LIZ);
        }
    }
}
