package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827950Wdt {
    public static final boolean LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "comment_keyboard_workaround", true, false);
    public static final long LIZIZ = TimeUnit.DAYS.toMillis(3);
    public static final Keva LIZJ = Keva.getRepo("comment");
    public static long LIZLLL;
    public static int LJ;

    public static void LIZ(boolean z) {
        String str;
        if (z) {
            str = "by_network";
        } else {
            str = "by_local";
        }
        try {
            HashMap mapLJI = C2097608Jq.LJI(new Pair("wont_dismiss_type", str));
            C2344809Gs.LJFF("comment_keyboard_wont_dismiss", str);
            C793770VBv.LJ("comment_keyboard_wont_dismiss", new JSONObject(C2097608Jq.LJIIZILJ(mapLJI)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
