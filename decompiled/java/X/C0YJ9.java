package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJ9 {
    public String LIZ;
    public JSONObject LIZIZ;
    public final C0YJA LIZJ;

    public final void LIZLLL() {
        if (this.LIZ == null || this.LIZIZ == null) {
            return;
        }
        this.LIZJ.LJIIJ().LIZIZ(this.LIZ, this.LIZIZ);
    }

    public final void LJFF() {
        if (this.LIZ == null || this.LIZIZ == null) {
            return;
        }
        this.LIZJ.LJIIJ().LJIIIZ(this.LIZIZ, this.LIZ, 1.0f);
    }

    public C0YJ9(C0YJA c0yja) {
        this.LIZJ = c0yja;
    }

    public static C0YJ9 LJI(C0YEM c0yem) {
        return new C0YJ9(c0yem);
    }

    public final void LIZIZ(Map map) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                this.LIZIZ.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(String str) {
        this.LIZ = str;
        LIZ("imsdk", "params_for_special");
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        this.LIZJ.LJII(this.LIZIZ);
    }

    public final void LJ(float f) {
        if (this.LIZ != null && this.LIZIZ != null) {
            this.LIZJ.LJIIJ().LJIIIZ(this.LIZIZ, this.LIZ, f);
        }
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        try {
            this.LIZIZ.put(str, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
