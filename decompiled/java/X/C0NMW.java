package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0NMW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMW {
    public static boolean LIZ(Aweme aweme) {
        if (aweme != null) {
            if ((!aweme.isAd() || C293500Beu.LIZIZ) && C0NMR.LIZJ.contains(aweme.getAid())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
