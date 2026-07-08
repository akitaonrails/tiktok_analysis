package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731680vAE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map, boolean z) {
        if (z) {
            C1421105hJ.LIZJ("livesdk_tiktokec_module_show", map);
        } else {
            C1421105hJ.LIZJ("livesdk_tiktokec_module_click", map);
        }
    }

    public static void LIZIZ(Map map, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("popup_name", "on_screen_script_click_confirm");
        if (z) {
            C1421105hJ.LIZJ("livesdk_tiktokec_popup_show", linkedHashMap);
        } else {
            C1421105hJ.LIZJ("livesdk_tiktokec_popup_click", linkedHashMap);
        }
    }

    public static void LIZJ(EnumC1731690vAF enumC1731690vAF, String str, String str2) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", enumC1731690vAF.name().toLowerCase(Locale.ROOT)), new Pair("product_id", String.valueOf(str2)), new Pair("author_id", String.valueOf(str)));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_script_step", mapLJIIIIZZ);
    }
}
