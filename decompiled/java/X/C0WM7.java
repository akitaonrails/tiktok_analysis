package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService;
import com.bytedance.pumbaa.hybrid.governance.api.lifecycle.IHybridLifecycleService;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WM7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WM7<T> implements IHybridGovService<T> {
    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public void LIZJ(C0WMB c0wmb) {
    }

    public abstract void LIZLLL(T t);

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public void addAction(C0WMB c0wmb) {
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void updateConfig() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0WM3] */
    static {
        IHybridLifecycleService iHybridLifecycleServiceLIZ = C04TG.LIZ();
        iHybridLifecycleServiceLIZ.LIZLLL(new C0WM5() { // from class: X.0WM3
            public final ConcurrentHashMap<C0WN8, Long> LIZ = new ConcurrentHashMap<>();
            public final ConcurrentHashMap<Integer, Long> LIZIZ = new ConcurrentHashMap<>();

            @Override // X.C0WM5
            public final void LIZ(C0WN8 c0wn8) {
                this.LIZ.put(c0wn8, Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.C0WM5
            public final void LIZIZ(C0WN8 c0wn8) throws JSONException {
                Long lRemove = this.LIZ.remove(c0wn8);
                if (lRemove == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
                if (jElapsedRealtime < 0) {
                    jElapsedRealtime = 0;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aspect", c0wn8.getValue());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", jElapsedRealtime);
                C0WLQ.LIZIZ("pbh_plugin_init_finish", jSONObject, jSONObject2);
            }

            @Override // X.C0WM5
            public final void LJFF(C0WN8 c0wn8, List<C0WMF> list, C0WMD c0wmd) {
                int iIdentityHashCode;
                Object objLIZ = c0wmd.LIZ();
                if (objLIZ != null) {
                    iIdentityHashCode = objLIZ.hashCode();
                } else {
                    iIdentityHashCode = System.identityHashCode(c0wmd);
                }
                this.LIZIZ.put(Integer.valueOf(iIdentityHashCode), Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.C0WM5
            public final void LIZLLL(C0WN8 c0wn8, C0WMF c0wmf, C0WMD c0wmd, C0WM1 c0wm1) throws JSONException {
                int iIdentityHashCode;
                Object objValueOf;
                C821780WLo c821780WLo;
                InterfaceC821860WLw interfaceC821860WLw;
                Object objLIZ = c0wmd.LIZ();
                if (objLIZ != null) {
                    iIdentityHashCode = objLIZ.hashCode();
                } else {
                    iIdentityHashCode = System.identityHashCode(c0wmd);
                }
                Long lRemove = this.LIZIZ.remove(Integer.valueOf(iIdentityHashCode));
                if (lRemove == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
                if (jElapsedRealtime < 0) {
                    jElapsedRealtime = 0;
                }
                JSONObject jSONObject = new JSONObject();
                C821850WLv c821850WLv = c0wm1.LIZLLL;
                if (c821850WLv != null && (c821780WLo = c821850WLv.LJ) != null && (interfaceC821860WLw = c821780WLo.LIZ) != null) {
                    objValueOf = Integer.valueOf(interfaceC821860WLw.getCode());
                } else {
                    objValueOf = JSONObject.NULL;
                }
                jSONObject.put("result_code", objValueOf);
                jSONObject.put("aspect", c0wn8.getValue());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", jElapsedRealtime);
                C0WLQ.LIZIZ("pbh_plugin_execute_finish", jSONObject, jSONObject2);
            }
        });
        iHybridLifecycleServiceLIZ.LIZJ(new C0WM8() { // from class: X.0WM0
            public final ConcurrentHashMap<Integer, Long> LIZ = new ConcurrentHashMap<>();

            @Override // X.C0WM8
            public final void LJI(C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel) {
            }

            @Override // X.C0WM8
            public final void LJ(Context context, C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel, C0WMD c0wmd) {
                int iIdentityHashCode;
                Object objLIZ = c0wmd.LIZ();
                if (objLIZ != null) {
                    iIdentityHashCode = objLIZ.hashCode();
                } else {
                    iIdentityHashCode = System.identityHashCode(c0wmd);
                }
                this.LIZ.put(Integer.valueOf(iIdentityHashCode), Long.valueOf(SystemClock.elapsedRealtimeNanos()));
                if (baseGovernanceModel.reportEnable) {
                    C0VZK.LIZIZ().LIZLLL(c0wmf.LIZ, baseGovernanceModel.auditMeta);
                }
            }

            @Override // X.C0WM8
            public final void LIZJ(Context context, C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel, C0WMD c0wmd, C0WM1 c0wm1) throws JSONException {
                int iIdentityHashCode;
                C821850WLv c821850WLv;
                C821780WLo c821780WLo;
                InterfaceC821860WLw interfaceC821860WLw;
                JSONObject jSONObject;
                Object objLIZ = c0wmd.LIZ();
                if (objLIZ != null) {
                    iIdentityHashCode = objLIZ.hashCode();
                } else {
                    iIdentityHashCode = System.identityHashCode(c0wmd);
                }
                Long lRemove = this.LIZ.remove(Integer.valueOf(iIdentityHashCode));
                long j = 0;
                if (lRemove != null) {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - lRemove.longValue();
                    if (jElapsedRealtimeNanos >= 0) {
                        j = jElapsedRealtimeNanos;
                    }
                }
                if (baseGovernanceModel.reportEnable && c0wm1 != null && c0wm1.LIZIZ != null) {
                    C0VZK.LIZIZ().monitorEvent("pns_hybrid_dm_shutdown", c0wm1.LIZIZ, null, null);
                }
                int code = 0;
                if (c0wm1 != null && c0wm1.LIZ && (jSONObject = c0wm1.LIZJ) != null) {
                    C0VZK.LIZIZ().LIZIZ(jSONObject, c0wmf.LIZ, baseGovernanceModel.auditMeta);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("aspect", c0wmf.LIZIZ.getValue());
                if (c0wm1 != null && (c821850WLv = c0wm1.LIZLLL) != null && (c821780WLo = c821850WLv.LJ) != null && (interfaceC821860WLw = c821780WLo.LIZ) != null) {
                    code = interfaceC821860WLw.getCode();
                }
                jSONObject2.put("result_code", code);
                jSONObject2.put("interceptor", c0wmf.LIZ);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("duration", j);
                C0WLQ.LIZIZ("pbh_interceptor_execute_finish", jSONObject2, jSONObject3);
            }
        });
        iHybridLifecycleServiceLIZ.LIZJ(new C822050WMp());
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.IHybridGovService
    public final void LIZ(T t) {
        C0WN8 c0wn8LIZIZ = LIZIZ();
        C0WM6 c0wm6 = C0WM6.LIZ;
        c0wm6.LIZ(c0wn8LIZIZ);
        LIZLLL(t);
        c0wm6.LIZIZ(LIZIZ());
    }
}
