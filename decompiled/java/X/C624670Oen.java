package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Oen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624670Oen {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C624680Oeo());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C624700Oeq());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C624690Oep());
    public static final C01GW LIZLLL;
    public static final List<Integer> LJ;
    public static final List<Integer> LJFF;
    public static final Map<Integer, Integer> LJI;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(525));
        LIZLLL = c01gwLIZIZ;
        LJ = C1697810uHb.LJIIJJI(50, 100, 150, 200);
        LJFF = C1697810uHb.LJIIJJI(60, 120, 240, 480);
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair(50, 60);
        pairArr[1] = new Pair(100, 120);
        pairArr[2] = ((Boolean) c01gwLIZIZ.getValue()).booleanValue() ? new Pair(150, 240) : new Pair(150, 120);
        pairArr[3] = new Pair(200, 240);
        pairArr[4] = new Pair(480, 200);
        pairArr[5] = new Pair(240, 200);
        pairArr[6] = new Pair(120, 100);
        pairArr[7] = new Pair(60, 50);
        LJI = C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static int LIZ() {
        if (LIZIZ()) {
            return 120;
        }
        return ((Boolean) LIZLLL.getValue()).booleanValue() ? 60 : 50;
    }

    public static List LJ() {
        return (LIZIZ() || ((Boolean) LIZLLL.getValue()).booleanValue()) ? LJFF : LJ;
    }

    public static Integer LJFF(Context context) {
        if (LIZIZ()) {
            if (context != null) {
                return C1308910kAL.LIZJ(R.attr.a1b, context);
            }
            return null;
        }
        if (context != null) {
            return C1308910kAL.LIZJ(R.attr.zp, context);
        }
        return null;
    }

    public static String LJI(EnumC624770Oex enumC624770Oex, boolean z, C19EG c19eg) {
        String string;
        if (enumC624770Oex == EnumC624770Oex.PAUSE_STORAGE) {
            if (c19eg != null && (string = c19eg.getString(2131838594)) != null) {
                return u.LJJIFFI(string, "%1$s", "2", false);
            }
            return null;
        }
        if (z) {
            if (enumC624770Oex == EnumC624770Oex.PAUSE_NOT_WIFI) {
                if (c19eg != null) {
                    return c19eg.getString(2131838587);
                }
                return null;
            }
            if (enumC624770Oex == EnumC624770Oex.PAUSE_NO_NETWORK) {
                if (c19eg != null) {
                    return c19eg.getString(2131838573);
                }
                return null;
            }
        } else {
            if (enumC624770Oex == EnumC624770Oex.PAUSE_NOT_WIFI) {
                if (c19eg != null) {
                    return c19eg.getString(2131838595);
                }
                return null;
            }
            if (enumC624770Oex == EnumC624770Oex.PAUSE_NO_NETWORK) {
                if (c19eg != null) {
                    return c19eg.getString(2131838593);
                }
                return null;
            }
        }
        if (enumC624770Oex.canResume() && c19eg != null) {
            return c19eg.getString(2131838601);
        }
        return null;
    }
}
