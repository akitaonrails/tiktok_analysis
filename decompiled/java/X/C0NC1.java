package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0NC1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NC1 {
    public static final C0NC1 LIZ = new C0NC1();

    public static boolean LIZ(float f, Aweme aweme, String str, String str2) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJIZ()) {
            C589960NBy.LIZ.getClass();
            if (!C589960NBy.LIZ(aweme)) {
                return false;
            }
        }
        C589960NBy.LIZ.getClass();
        if (!C589960NBy.LIZLLL(f, aweme)) {
            return false;
        }
        float fLIZIZ = C589960NBy.LIZIZ(aweme);
        C1386110mAr c1386110mAr = C1386110mAr.LIZ;
        Float fValueOf = Float.valueOf(fLIZIZ);
        HashMap map = new HashMap();
        c1386110mAr.getClass();
        C1386110mAr.LIZIZ(f, aweme, fValueOf, str, str2, map);
        C589960NBy.LJ(f, aweme, str, str2);
        C1386110mAr.LIZIZ = str2;
        if (c19252910Tv.LIZLLL().LJIJI().LJJIJL() && C589960NBy.LJI) {
            C589960NBy.LJI = true;
            C589960NBy.LJII = C589960NBy.LIZLLL;
        }
        return true;
    }
}
