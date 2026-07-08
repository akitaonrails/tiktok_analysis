package X;

import com.tiktok.json.gson.GsonOrigin;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.09Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2344009Gk {
    public final Map<String, String> LIZ = new HashMap();

    public static C2344009Gk LJIIJ() {
        return new C2344009Gk();
    }

    public final void LJI(HashMap map) {
        if (map != null) {
            ((HashMap) this.LIZ).putAll(map);
        }
    }

    public final void LJII(Map map) {
        if (map != null) {
            ((HashMap) this.LIZ).putAll(map);
        }
    }

    public final String LJIIIZ(String str) {
        Map<String, String> map = this.LIZ;
        if (map != null && ((HashMap) map).containsKey(str)) {
            return (String) ((HashMap) this.LIZ).get(str);
        }
        return "";
    }

    public final void LIZ(double d, String str) {
        LJ(Double.valueOf(d), str);
    }

    public final void LIZIZ(float f, String str) {
        LJ(Float.valueOf(f), str);
    }

    public final void LIZJ(int i, String str) {
        LJIIIIZZ(str, String.valueOf(i));
    }

    public final void LIZLLL(long j, String str) {
        LJIIIIZZ(str, String.valueOf(j));
    }

    public final void LJ(Object obj, String str) {
        if (obj != null) {
            LJFF(str, GsonOrigin.toJson(C08JS.LIZIZ(), obj));
        }
    }

    public final void LJFF(String str, String str2) {
        LJIIIIZZ(str, str2);
    }

    public final void LJIIIIZZ(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C2344109Gl.LIZ(str2));
    }
}
