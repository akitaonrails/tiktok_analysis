package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.scene.Scene;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0V1P implements InterfaceC792700V7s, InterfaceC792030V5d, InterfaceC788120Uvq {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;

    public void LIZ() {
        this.LL = true;
        if (!this.LLILZ) {
            this.LLILZ = true;
            if (LJIIIZ()) {
                C787900UvU.LIZ.LIZ(this);
            }
        }
        LJIIL();
        this.LLIZ = System.currentTimeMillis();
    }

    public abstract void LIZJ(JSONObject jSONObject);

    @Override // X.InterfaceC792700V7s
    public final void LJ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIIIZZ() {
    }

    public abstract boolean LJIIIZ();

    @Override // X.InterfaceC792700V7s
    public final void LJIIJ(Activity activity) {
    }

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public abstract long LJIILJJIL();

    @Override // X.InterfaceC792700V7s
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityStarted(Activity activity) {
    }

    public final void LJI() {
        if (this.LLILLL) {
            return;
        }
        if (TextUtils.isEmpty(this.LLILZIL)) {
            throw new IllegalStateException("Must set collector Setting key, before init");
        }
        this.LLILLL = true;
        ActivityLifeObserver.getInstance().register(this);
        this.LLILLJJLI = true ^ ActivityLifeObserver.getInstance().isForeground();
        LJIIJJI();
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerConfigListener(this);
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("perf init: ");
            sbLIZ.append(this.LLILZIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIILIIL(C791160V1u c791160V1u) {
        String string;
        Object[] array = C586590MzZ.LIZ().LIZ.toArray();
        if (array == null) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Object obj : array) {
                if (z) {
                    z = false;
                } else {
                    sb.append("#");
                }
                sb.append(obj.toString());
            }
            string = sb.toString();
        }
        if (TextUtils.isEmpty(string)) {
            string = ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
        JSONObject jSONObject = c791160V1u.LJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(string)) {
                string = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put(Scene.SCENE_SERVICE, string);
            jSONObject.put("process_name", C792400V6o.LIZIZ());
            jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            c791160V1u.LJ = jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean zEquals = TextUtils.equals(c791160V1u.LIZ, "memory");
        C586590MzZ c586590MzZLIZ = C586590MzZ.LIZ();
        c586590MzZLIZ.getClass();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : c586590MzZLIZ.LIZIZ.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            if (zEquals) {
                C2165908e9 c2165908e9 = C2166008eA.LIZ;
                c2165908e9.LIZJ(jSONObject2);
                c2165908e9.LIZIZ(jSONObject2);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c791160V1u.LJFF = jSONObject2;
        C792310V6f.LJIIIZ().LIZJ(c791160V1u);
    }

    @Override // X.InterfaceC788120Uvq
    public final void LIZIZ(long j) {
        long jLJIILJJIL = LJIILJJIL();
        if (jLJIILJJIL > 0 && j - this.LLIZ > jLJIILJJIL && this.LL) {
            LJIIL();
            this.LLIZ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC792700V7s
    public void LIZLLL(Activity activity) {
        this.LLILLJJLI = false;
        Context context = C792400V6o.LIZ;
    }

    @Override // X.InterfaceC792700V7s
    public void LJII(Activity activity) {
        this.LLILLJJLI = true;
        Context context = C792400V6o.LIZ;
    }

    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(this.LLILZIL)) == null) {
            return;
        }
        boolean z2 = false;
        if (jSONObjectOptJSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        this.LLILZLL = z2;
        LIZJ(jSONObjectOptJSONObject);
    }
}
