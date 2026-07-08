package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLetsDanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;

/* JADX INFO: renamed from: X.0aco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942160aco {
    public static boolean LIZ() {
        if (!C950220apo.LJI()) {
            return MultiGuestSocialGameLetsDanceSetting.config().participantLetsDanceEnabled && !C930540aK4.LJJIJ();
        }
        boolean z = MultiGuestLetsDanceSetting.INSTANCE.isEnable() && !C930540aK4.LJJIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLetsDanceEnableForAnchor=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LetsDanceConfigUtils", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}
