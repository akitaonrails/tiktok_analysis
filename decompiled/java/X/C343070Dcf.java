package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.gamora.recorder.DelayMinorComponentConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343070Dcf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4489));

    public static final int LIZLLL() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZ() {
        return LIZLLL() != 0;
    }

    public static boolean LIZIZ() {
        return LIZLLL() >= 2;
    }

    public static boolean LIZJ(C1DRG c1drg) {
        String str;
        if (EffectFullWidthHorizontalCarouselAB.isEnabled() && ((Boolean) C267050AdL.LIZ.getValue()).booleanValue()) {
            return false;
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        if (shortVideoContext != null && (str = shortVideoContext.shootWay) != null) {
            C01GW c01gw = C343080Dcg.LIZIZ;
            if (((DelayMinorComponentConfig) c01gw.getValue()).enable && !((DelayMinorComponentConfig) c01gw.getValue()).blackList.contains(str)) {
                return true;
            }
        }
        if (LIZLLL() < 3) {
            return false;
        }
        return true;
    }

    public static boolean LJ(C1DRG c1drg) {
        return Intrinsics.LJFF(c1drg.LJIIL("enableDelayToolbar", Boolean.class), Boolean.TRUE);
    }
}
