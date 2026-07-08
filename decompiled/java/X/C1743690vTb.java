package X;

import android.content.res.Resources;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0vTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743690vTb {
    public static final int LIZIZ() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('2');
        sbLIZ.append(LJ());
        sbLIZ.append(LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJ() {
        String strLJJIFFI = u.LJJIFFI(String.valueOf(Math.random()), e3.d, "", false);
        if (strLJJIFFI.length() <= 6) {
            return strLJJIFFI;
        }
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(1, 7);
        return !intRangeLJIILJJIL.isEmpty() ? a0.LJJLIIIJLLLLLLLZ(strLJJIFFI, intRangeLJIILJJIL) : "";
    }

    public static final Pair<Integer, Integer> LIZ(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(strSubstring.substring(a0.LJJIZ(strSubstring, ':', 0, false, 6) + 1, a0.LJJJJ(strSubstring, ':', 0, 6)));
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(strSubstring.substring(a0.LJJJJ(strSubstring, ':', 0, 6) + 1, strSubstring.length()));
        if (numLJIIJJI == null || numLJIIJJI2 == null) {
            return null;
        }
        return new Pair<>(numLJIIJJI, numLJIIJJI2);
    }

    public static final long LIZLLL(Function0<Unit> function0) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        function0.invoke();
        return SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public static final String LJFF(int i, int i2, String str) {
        Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(str);
        if (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(':');
            sbLIZ.append(i);
            sbLIZ.append(':');
            sbLIZ.append(i2);
            return a0.LJJL(str, iStart, iEnd, C2188811AlT.LIZIZ(sbLIZ)).toString();
        }
        return str;
    }

    public static final String LJI(String str, int i, int i2, EnumC1769850w9n enumC1769850w9n) {
        Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(str);
        if (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(':');
            sbLIZ.append(i);
            sbLIZ.append(':');
            sbLIZ.append(i2);
            String string = a0.LJJL(str, iStart, iEnd, C2188811AlT.LIZIZ(sbLIZ)).toString();
            C1334210kp9.LIZIZ(string, enumC1769850w9n, null, null, false, false, null, null);
            return string;
        }
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
        return str;
    }
}
