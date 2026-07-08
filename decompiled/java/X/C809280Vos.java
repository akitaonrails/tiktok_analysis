package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C809280Vos {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("launch", this.LIZ);
            jSONObject.put("leave", this.LIZIZ);
            jSONObject.put("badge", this.LIZJ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    public C809280Vos() {
    }

    public C809280Vos(int i) {
    }

    public static C809280Vos LIZ(String str) {
        C809280Vos c809280Vos = new C809280Vos();
        try {
            JSONObject jSONObject = new JSONObject(str);
            c809280Vos.LIZ = jSONObject.optLong("launch", 0L);
            c809280Vos.LIZIZ = jSONObject.optLong("leave", 0L);
            c809280Vos.LIZJ = jSONObject.optLong("badge", 0L);
            return c809280Vos;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return c809280Vos;
        }
    }
}
