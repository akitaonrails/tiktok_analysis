package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735790vGr extends FrameLayout {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        return this.LL;
    }

    public C1735790vGr(Context context) {
        super(context, null, 0);
    }

    public static void LIZ(int i, String str, String str2) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("schema", str);
        pairArr[1] = new Pair("error_code", String.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("error_msg", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_inbox_lynx_load", mapLJIIIIZZ);
    }
}
