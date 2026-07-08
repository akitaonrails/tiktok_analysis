package X;

import com.ss.android.ugc.aweme.config.Crowd;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0QzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688300QzE {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(767));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        Integer num;
        int iIntValue;
        if (LIZ() != 2 && LIZ() != 3) {
            return false;
        }
        C311300CIe.LIZ.getClass();
        Crowd crowdLIZ = C311300CIe.LIZ();
        return crowdLIZ != null && (num = crowdLIZ.enableFeedbarSugReason) != null && 100 <= (iIntValue = num.intValue()) && iIntValue < 200;
    }
}
