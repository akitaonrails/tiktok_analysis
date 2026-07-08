package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0SK2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SK2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0SK6());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0SK8());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0SK9());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0SK7());
    public static final C01GW LJ = C452501pT.LIZIZ(new C0SK4());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C0SK5());
    public static final C01GW LJI = C452501pT.LIZIZ(new C295270Bhl());
    public static final C01GW LJII = C452501pT.LIZIZ(new C0SK3());

    public static boolean LIZIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static int LIZJ() {
        return ((Number) LJI.getValue()).intValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) LJII.getValue()).booleanValue();
    }

    public static boolean LIZ(Aweme aweme, boolean z) {
        if (aweme == null || aweme.isAd() || z || C729510SjV.LJJIJIL(aweme) || AwemeExtKt.isPhotoMode(aweme) || C0NC0.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Aweme aweme, boolean z) {
        if (!LIZLLL() || !LIZ(aweme, z)) {
            return false;
        }
        return true;
    }
}
