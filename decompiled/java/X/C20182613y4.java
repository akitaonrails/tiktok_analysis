package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20182613y4 {
    public static volatile C20182613y4 LJ;
    public C20182313y1 LIZ;
    public C20182413y2 LIZIZ;
    public C20182413y2 LIZJ;
    public C20182313y1 LIZLLL;

    public static C20182613y4 LIZLLL() {
        if (LJ == null) {
            synchronized (C20182613y4.class) {
                try {
                    if (LJ == null) {
                        LJ = new C20182613y4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final C20182313y1 LIZJ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = C20182313y1.LIZJ("scene_feed_fluency");
        }
        return this.LIZLLL;
    }

    public final C20182413y2 LJ() {
        if (this.LIZIZ == null) {
            LJFF();
        }
        return this.LIZIZ;
    }

    public C20182613y4() {
        C20182713y5 c20182713y5 = new C20182713y5();
        if (!C20182313y1.LJFF.compareAndSet(false, true)) {
            throw new IllegalStateException("TimeLogger repeated initialization");
        }
        C20182313y1.LJI = true;
        C20182313y1.LJII = false;
        C20182313y1.LJIIIIZZ = c20182713y5;
    }

    public final void LJFF() {
        C20182613y4 c20182613y4LIZLLL = LIZLLL();
        if (c20182613y4LIZLLL.LIZ == null) {
            c20182613y4LIZLLL.LIZ = C20182313y1.LIZJ("scene_first_feed");
        }
        C20182413y2 c20182413y2LIZ = c20182613y4LIZLLL.LIZ.LIZ("feed_total");
        this.LIZJ = c20182413y2LIZ;
        this.LIZIZ = c20182413y2LIZ.LIZ("app_start_to_main_focus");
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.startsWith("(cpu)")) {
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jSONObject2;
    }

    public static void LIZ(List list, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!C2401009ay.LIZ(list)) {
                for (C20182513y3 c20182513y3 : (ArrayList) list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("metric_name", c20182513y3.LIZ);
                    jSONObject2.put("start_time", c20182513y3.LIZIZ);
                    jSONObject2.put("end_time", c20182513y3.LIZJ);
                    arrayList.add(jSONObject2);
                }
            }
            jSONObject.put("metric_extra", arrayList);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
