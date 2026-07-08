package X;

import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792750V7x implements InterfaceC792030V5d {
    public static volatile C792750V7x LLILZIL;
    public static final AtomicBoolean LLILZLL = new AtomicBoolean(false);
    public boolean LL;
    public boolean LLILLJJLI = true;
    public JSONObject LLILLL;
    public JSONObject LLILZ;

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
    }

    public static C792750V7x LIZIZ() {
        IConfigManager iConfigManager;
        if (LLILZIL == null) {
            synchronized (C792750V7x.class) {
                try {
                    if (LLILZIL == null) {
                        LLILZIL = new C792750V7x();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        AtomicBoolean atomicBoolean = LLILZLL;
        if (!atomicBoolean.get() && (iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class)) != null) {
            atomicBoolean.set(true);
            iConfigManager.registerConfigListener(LLILZIL);
        }
        return LLILZIL;
    }

    public final byte LIZJ(String str, boolean z) {
        JSONObject jSONObject;
        byte b = 0;
        if (!this.LLILLJJLI) {
            return (byte) 0;
        }
        if (z && ((jSONObject = this.LLILZ) == null || jSONObject.optDouble(str, -1.0d) > 0.0d)) {
            b = (byte) 16;
        }
        JSONObject jSONObject2 = this.LLILLL;
        if (jSONObject2 != null && jSONObject2.optDouble(str, -1.0d) > 0.0d) {
            return (byte) (b | 1);
        }
        return b;
    }

    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, boolean z) {
        boolean zOptBoolean;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("tracing")) != null) {
            zOptBoolean = jSONObjectOptJSONObject.optBoolean("enable_open", true);
        } else {
            zOptBoolean = true;
        }
        this.LLILLJJLI = zOptBoolean;
        if (!this.LL) {
            this.LLILLL = C0V3O.LJ("tracing", "allow_service_list", jSONObject);
            this.LLILZ = C0V3O.LJ("tracing", "allow_error_list", jSONObject);
            this.LL = true;
        }
    }
}
