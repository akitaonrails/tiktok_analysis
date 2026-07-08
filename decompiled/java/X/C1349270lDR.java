package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349270lDR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(614));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(615));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(616));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(613));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(617));
    public static int LJFF;
    public static int LJI;
    public static int LJII;

    public static int LIZ() {
        int i = LJFF;
        return i <= 0 ? LIZJ(false) : i;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static int LIZJ(boolean z) {
        if (z) {
            return LIZIZ().getInt("keyboard_height_landscape", ((Number) LIZ.getValue()).intValue());
        }
        return LIZIZ().getInt("keyboard_height_portrait", ((Number) LIZIZ.getValue()).intValue());
    }
}
