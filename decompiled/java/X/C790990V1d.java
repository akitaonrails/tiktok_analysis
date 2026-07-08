package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790990V1d implements InterfaceC788120Uvq {
    public final HashMap<String, C791010V1f> LLILLJJLI = new HashMap<>();
    public boolean LL = true;

    public C790990V1d() {
        C787900UvU.LIZ.LIZ(this);
    }

    @Override // X.InterfaceC788120Uvq
    public final void LIZIZ(long j) {
        float f;
        if (!this.LLILLJJLI.isEmpty()) {
            Iterator<Map.Entry<String, C791010V1f>> it2 = this.LLILLJJLI.entrySet().iterator();
            int i = C0VXC.LIZIZ;
            while (it2.hasNext()) {
                Map.Entry<String, C791010V1f> next = it2.next();
                String key = next.getKey();
                C791010V1f value = next.getValue();
                boolean z = true;
                if (j - value.LIZIZ > 120000) {
                    it2.remove();
                    int i2 = value.LIZJ;
                    if (i2 > 0) {
                        f = value.LIZ / i2;
                    } else {
                        f = -1.0f;
                    }
                    if (C792400V6o.LJIIIIZZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aggregate fps: ");
                        sbLIZ.append(key);
                        sbLIZ.append(" , value: ");
                        sbLIZ.append(f);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (f > 0.0f) {
                        float f2 = i;
                        if (f > f2) {
                            f = f2;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", f);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(Scene.SCENE_SERVICE, key);
                            C791160V1u c791160V1u = new C791160V1u("fps", key, jSONObject, jSONObject2, null);
                            C791030V1h.LIZ(c791160V1u, true);
                            JSONObject jSONObject3 = c791160V1u.LJFF;
                            jSONObject3.put("refresh_rate", i);
                            if (this.LL) {
                                this.LL = false;
                                jSONObject3.put("device_max_refresh_rate", C0VXC.LIZJ);
                                if (C0VXC.LIZLLL) {
                                    z = false;
                                }
                                jSONObject3.put("refresh_rate_restricted", z);
                            }
                            C792310V6f.LJIIIZ().LIZJ(c791160V1u);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }
    }
}
