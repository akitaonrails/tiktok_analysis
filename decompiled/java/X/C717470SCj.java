package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AwS412S0200000_11;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717470SCj implements C0S9I {
    public static final C717470SCj LIZ = new C717470SCj();
    public static final String LIZIZ = "perf_transition_monitor_event";
    public static String LIZJ;
    public static String LIZLLL;
    public static long LJ;
    public static Long LJFF;
    public static Long LJI;
    public static Long LJII;
    public static Long LJIIIIZZ;

    public static final void LIZ() {
        if (LJFF == null) {
            LJFF = Long.valueOf(System.currentTimeMillis() - LJ);
        }
    }

    public static final void LIZJ() {
        if (LJI == null) {
            LJI = Long.valueOf(System.currentTimeMillis() - LJ);
        }
    }

    public final void LIZIZ() {
        if (LJIIIIZZ == null || LJII == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("enter_method", LIZLLL).putOpt("enter_from", LIZJ).putOpt("router_cost_time", LJI).putOpt("transition_cost_time", LJII).putOpt("first_image_cost_time", LJIIIIZZ);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZIZ);
            sbLIZ.append(" ---> ");
            sbLIZ.append(jSONObject);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11(this, jSONObject, 104);
            C786410Ut5.f3(new C512801zC(awS412S0200000_11, 1), Looper.getMainLooper().getQueue());
            C0S9H.LIZ(this, strLIZIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LIZLLL = "";
        LIZJ = "";
        LJFF = null;
        LJI = null;
        LJIIIIZZ = null;
        LJII = null;
    }

    @Override // X.C0S9I
    public final String getEventName() {
        return LIZIZ;
    }
}
