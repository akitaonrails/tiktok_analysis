package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CJ {
    public static final CopyOnWriteArrayList<C589920NBu<Object>> LIZ = new CopyOnWriteArrayList<>();
    public static Object LIZIZ;
    public static C589920NBu<Object> LIZJ;
    public static C589920NBu<Object> LIZLLL;
    public static String LJ;

    public static Object LIZ() {
        if (C18CS.LIZ.LIZIZ().LJFF() != 1) {
            return LIZIZ;
        }
        C589920NBu<Object> c589920NBu = LIZJ;
        if (c589920NBu != null) {
            return c589920NBu.get();
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object objLIZ = LIZ();
            jSONObject.put("resumedPage", objLIZ != null ? objLIZ.getClass().getCanonicalName() : null);
            JSONArray jSONArray = new JSONArray();
            Iterator<C589920NBu<Object>> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                Object obj = it2.next().get();
                jSONArray.put(obj != null ? obj.getClass().getCanonicalName() : null);
            }
            jSONObject.put("stack", jSONArray);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static void LIZIZ(Object obj) {
        if (C18CS.LIZ.LIZIZ().LJFF() == 1) {
            LIZJ = new C589920NBu<>(obj);
        } else {
            LIZIZ = obj;
        }
    }
}
