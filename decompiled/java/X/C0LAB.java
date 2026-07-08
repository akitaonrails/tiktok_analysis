package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0LAB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0LAB {
    public Map<String, String> LIZ = new HashMap();

    public static C0LAB LJIIIZ() {
        return new C0LAB();
    }

    public final void LJI(Map map) {
        if (map != null) {
            this.LIZ.putAll(map);
        }
    }

    public final String LJIIIIZZ(String str) {
        return this.LIZ.get(str);
    }

    public final void LIZ(int i, String str) {
        this.LIZ.put(str, C0LAC.LIZ(String.valueOf(i)));
    }

    public final void LIZIZ(long j, String str) {
        this.LIZ.put(str, C0LAC.LIZ(String.valueOf(j)));
    }

    public final void LIZJ(Float f, String str) {
        this.LIZ.put(str, C0LAC.LIZ(String.valueOf(f)));
    }

    public final void LIZLLL(Object obj, String str) {
        if (obj != null) {
            LJ(str, GsonProtectorUtils.toJson(new Gson(), obj));
        }
    }

    public final void LJ(String str, String str2) {
        this.LIZ.put(str, C0LAC.LIZ(str2));
    }

    public final void LJFF(String str, boolean z) {
        this.LIZ.put(str, C0LAC.LIZ(String.valueOf(z)));
    }

    public final C0LAB LJII(String str, String str2, boolean z) {
        if (!z) {
            return this;
        }
        LJ(str, str2);
        return this;
    }
}
