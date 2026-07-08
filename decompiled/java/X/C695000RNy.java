package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695000RNy {
    public static boolean LIZ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Integer numValueOf;
        C01GW c01gw = C281340B0y.LIZIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C728060ShA.LIZ.getClass();
            if (C728060ShA.LIZ()) {
                C0RF0 c0rf0 = c690870R8b.LIZLLL;
                if (c0rf0 != null) {
                    numValueOf = Integer.valueOf(c0rf0.LJIILJJIL);
                } else {
                    numValueOf = null;
                }
                if (!C729510SjV.LJIILLIIL(numValueOf)) {
                    C1256560inu c1256560inu = C1256560inu.LIZ;
                    Aweme aweme = videoItemParams.getAweme();
                    c1256560inu.getClass();
                    if (((Boolean) c01gw.getValue()).booleanValue() && C1256560inu.LJ(aweme)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
