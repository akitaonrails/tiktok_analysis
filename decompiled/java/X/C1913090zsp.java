package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913090zsp {
    public static long LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static long LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static Function0<Unit> LJIIL;
    public static final C1913090zsp LIZ = new C1913090zsp();
    public static final C2252321DDq LJIIIZ = C1BNE.LIZ(Boolean.FALSE);
    public static final List<InterfaceC1913100zsq> LJIIJJI = new ArrayList(C13BV.INSTANCE);

    public static void LIZ(boolean z) {
        long jUptimeMillis;
        try {
            if (LIZLLL) {
                return;
            }
            if (LIZJ) {
                jUptimeMillis = SystemClock.uptimeMillis() - LIZIZ;
            } else {
                jUptimeMillis = 0;
            }
            LIZLLL = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_start_to_feed_exposed_duration", jUptimeMillis);
            C1913090zsp c1913090zsp = LIZ;
            boolean z2 = LJ;
            c1913090zsp.getClass();
            jSONObject.put("is_video_pre_load", z2 ? 1 : 0);
            jSONObject.put("is_cold_start_first_launch", z ? 1 : 0);
            AppLogNewUtils.onEventV3("feed_page_exposure", jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duration:");
            sbLIZ.append(jUptimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(Pair pair) {
        LJ = true;
        LJIIIZ.setValue(Boolean.TRUE);
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            LJII = true;
        }
        if (!((Boolean) pair.getSecond()).booleanValue()) {
            LJIIIIZZ = true;
        }
        Iterator it2 = ((ArrayList) LJIIJJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1913100zsq) it2.next()).LIZIZ();
        }
    }
}
