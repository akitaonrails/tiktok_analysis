package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2456409ju {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(String str) {
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
