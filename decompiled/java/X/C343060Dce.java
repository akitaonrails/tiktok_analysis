package X;

import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.gamora.recorder.DelayMinorComponentConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Dce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343060Dce {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3532));

    public static boolean LIZ(String str) {
        if (!EffectFullWidthHorizontalCarouselAB.isEnabled()) {
            return false;
        }
        if (str != null) {
            C01GW c01gw = C343080Dcg.LIZIZ;
            if (((DelayMinorComponentConfig) c01gw.getValue()).enable && !((DelayMinorComponentConfig) c01gw.getValue()).blackList.contains(str)) {
                return false;
            }
        }
        return ((Boolean) LIZ.getValue()).booleanValue();
    }
}
