package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0xHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813140xHc {
    public static void LIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("action_type", str2);
        if (str3.length() > 0) {
            linkedHashMap.put("click_type", str3);
        }
        if ("fans_card".length() > 0) {
            linkedHashMap.put("popup_type", "fans_card");
        }
        C485260J1g.LIZ.getClass();
        C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_element_popup", linkedHashMap);
    }

    public final void LIZIZ(C19EG c19eg, boolean z, Function0<Unit> function0) {
        String strLJIJI;
        String str;
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LJII = C497740JfY.LJIJI(2131852395);
        c1391960mKI.LJIIIIZZ = C497740JfY.LJIJI(2131852394);
        c1391960mKI.LJ = AFwS269S0000000_27.get$arr$(354);
        c1391960mKI.LJI = 2;
        if (z) {
            strLJIJI = C497740JfY.LJIJI(2131852393);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131852392);
        }
        c1391960mKI.LIZIZ(strLJIJI, new C1813150xHd(function0, this, z));
        c1391960mKI.LIZ = false;
        c1391960mKI.LIZ().LIZ.show(c19eg.getSupportFragmentManager(), "FansHighlightInfoPanel");
        if (z) {
            str = "setting_page";
        } else {
            str = "live_recording";
        }
        LIZ(str, "show", "");
    }
}
