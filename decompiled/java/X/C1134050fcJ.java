package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134050fcJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        String str3;
        HashMap map = new HashMap();
        map.put("type", "gifting");
        if (Intrinsics.LJFF(str, "reject")) {
            str3 = "dark_pattern_group";
        } else {
            str3 = "frequency";
        }
        map.put("risk_control_scenario", str3);
        map.put("click_type", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hit_risk_control_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
