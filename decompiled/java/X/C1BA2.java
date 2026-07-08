package X;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BA2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BA2 implements C0XDL {
    public static final List<String> LJ = Collections.singletonList("CustomHeaderAdapter");
    public final C2209901BeO LIZ;
    public volatile SharedPreferences LIZIZ;
    public volatile JSONObject LIZJ;
    public final InterfaceC844530XBb LIZLLL;

    public final JSONObject LIZIZ() {
        if (this.LIZJ == null) {
            try {
                SharedPreferences sharedPreferencesLIZJ = LIZJ();
                if (sharedPreferencesLIZJ != null) {
                    String string = sharedPreferencesLIZJ.getString("header_custom_info", null);
                    if (C2200271B9l.LJII(string)) {
                        this.LIZJ = new JSONObject(string);
                    } else {
                        this.LIZJ = new JSONObject();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.LJJZZI.LJIIZILJ(LJ, "getCustomInfo failed", th, new Object[0]);
            }
        }
        return this.LIZJ;
    }

    public final SharedPreferences LIZJ() {
        if (this.LIZIZ == null && this.LIZ.LJIIJ != null) {
            this.LIZIZ = C810670Vr7.LIZJ(this.LIZ.LJIIJ, 0, C1BF5.LIZIZ(this.LIZ, "header_custom"));
        }
        return this.LIZIZ;
    }

    public final void LIZ(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            try {
                JSONObject jSONObjectLIZIZ = LIZIZ();
                if (jSONObjectLIZIZ != null) {
                    Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (C2200271B9l.LJI(it2.next().getKey()) || !(!Objects.equals(jSONObjectLIZIZ.opt(r2.getKey()), r2.getValue()))) {
                        }
                    }
                    this.LIZ.LJJZZI.LJIIIZ(0, LJ, "appendHeaderInfo no value changed", new Object[0]);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (jSONObjectLIZIZ != null) {
                    C2200271B9l.LIZLLL(jSONObject, jSONObjectLIZIZ);
                }
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (C2200271B9l.LJII(entry.getKey())) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                LIZLLL(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.LJJZZI.LJIIZILJ(LJ, "appendHeaderInfo failed", th, new Object[0]);
            }
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        this.LIZJ = jSONObject;
        SharedPreferences sharedPreferencesLIZJ = LIZJ();
        if (sharedPreferencesLIZJ != null) {
            sharedPreferencesLIZJ.edit().putString("header_custom_info", C786410Ut5.J3(jSONObject)).apply();
        }
        InterfaceC844530XBb interfaceC844530XBb = this.LIZLLL;
        Application application = this.LIZ.LJIIJ;
        C0XCI c0xci = (C0XCI) interfaceC844530XBb;
        c0xci.getClass();
        HashMap map = new HashMap();
        map.put("custom", jSONObject);
        c0xci.LJFF.LIZIZ(application).LIZJ(map);
    }

    public C1BA2(C2209901BeO c2209901BeO, InterfaceC844530XBb interfaceC844530XBb) {
        this.LIZ = c2209901BeO;
        this.LIZLLL = interfaceC844530XBb;
    }
}
