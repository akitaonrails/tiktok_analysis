package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0StT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735690StT {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C735700StU());
    public static final ArrayList<String> LIZIZ = C1697810uHb.LJ("instagram", "instagram_story", "facebook", "facebook_lite");

    public static final boolean LIZIZ() {
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry<String, ?> entry : ((Keva) LIZ.getValue()).getAll().entrySet()) {
            if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() <= 604800000) {
                if (Intrinsics.LJFF(entry.getKey(), "whatsapp") || Intrinsics.LJFF(entry.getKey(), "whatsapp_status")) {
                    z = true;
                }
                if (LIZIZ.contains(entry.getKey())) {
                    z2 = true;
                }
            }
        }
        return z || !z2;
    }

    public static final boolean LIZ(Context context) {
        if (((Number) C0BPP.LIZ.getValue()).intValue() != 2 && !C0BPP.LIZ()) {
            C1004140cEm.LIZ.getClass();
            if (!C1004140cEm.LIZIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "interction_share_button_whatsapp_style", true) != 0 && context != null && C516560KNq.LIZ(context, "com.whatsapp")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
