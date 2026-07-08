package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NaO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596460NaO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        long jLongValue;
        Long lLJIILIIL;
        String strLIZIZ = C596440NaM.LIZ.LIZIZ("showcase_pin_product_duration_track", "");
        if (!a0.LJJJIL(strLIZIZ)) {
            try {
                HashMap map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<HashMap<String, String>>() { // from class: X.0NaP
                }.getType());
                if (map != null) {
                    String str2 = (String) map.get("start_pin_time");
                    if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (Intrinsics.LJFF(str, map.get("room_id"))) {
                        map.put("duration", String.valueOf(System.currentTimeMillis() - jLongValue));
                        C1421105hJ.LIZJ("livesdk_tiktokec_pin_product_duration", map);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C596440NaM.LIZ.LIZ.erase("showcase_pin_product_duration_track");
        }
    }
}
