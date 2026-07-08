package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848680XRa {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZLLL() {
        try {
            String lowerCase = C0C64.LJIILLIIL().LJJ(31744, "tts_release_red_dot_duration", "", true).toLowerCase(Locale.ROOT);
            Pattern patternCompile = PatternProtector.compile("[0-9]+h");
            Pattern patternCompile2 = PatternProtector.compile("[0-9]+m(?!s)");
            Pattern patternCompile3 = PatternProtector.compile("[0-9]+s");
            Pattern patternCompile4 = PatternProtector.compile("[0-9]+ms");
            Matcher matcher = patternCompile.matcher(lowerCase);
            long jLIZIZ = matcher.find() ? LIZIZ(matcher.group()) + 0 : 0L;
            Matcher matcher2 = patternCompile2.matcher(lowerCase);
            if (matcher2.find()) {
                jLIZIZ += LIZIZ(matcher2.group());
            }
            Matcher matcher3 = patternCompile3.matcher(lowerCase);
            if (matcher3.find()) {
                jLIZIZ += LIZIZ(matcher3.group());
            }
            Matcher matcher4 = patternCompile4.matcher(lowerCase);
            return matcher4.find() ? jLIZIZ + LIZIZ(matcher4.group()) : jLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static boolean LIZJ() {
        return LIZLLL() > 0;
    }

    public static boolean LIZ(long j) {
        if (LIZJ() && j > 0) {
            long jLIZLLL = LIZLLL();
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (jCurrentTimeMillis > j && jCurrentTimeMillis < j + jLIZLLL) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static long LIZIZ(String str) {
        if (u.LJIIZILJ(str, "h", false)) {
            return TimeUnit.HOURS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(a0.LJJLIIIJILLIZJL(str, new String[]{"h"}, 0, 6), 0)));
        }
        if (u.LJIIZILJ(str, "ms", false)) {
            return TimeUnit.MILLISECONDS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(a0.LJJLIIIJILLIZJL(str, new String[]{"ms"}, 0, 6), 0)));
        }
        if (u.LJIIZILJ(str, "m", false)) {
            return TimeUnit.MINUTES.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(a0.LJJLIIIJILLIZJL(str, new String[]{"m"}, 0, 6), 0)));
        }
        if (u.LJIIZILJ(str, "s", false)) {
            return TimeUnit.SECONDS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(a0.LJJLIIIJILLIZJL(str, new String[]{"s"}, 0, 6), 0)));
        }
        return 0L;
    }
}
