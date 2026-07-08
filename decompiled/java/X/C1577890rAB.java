package X;

import android.os.Bundle;
import com.bytedance.hox.Hox;

/* JADX INFO: renamed from: X.0rAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577890rAB {
    public static String LIZ = "click_tab";

    public static void LIZ(C19EG c19eg, String str) {
        C1590820rV2 c1590820rV2 = new C1590820rV2("enter_homepage_hot");
        if (str == null) {
            str = "";
        }
        c1590820rV2.LIZLLL = str;
        c1590820rV2.LJIJ = "click_to_fyp_button";
        c1590820rV2.LJIILJJIL();
        Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
        LIZ = "click_switch_to_fyp_button";
        hoxLIZ.TQ2(bundle, "For You", false);
    }
}
