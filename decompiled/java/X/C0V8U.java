package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.apm6.traffic.TrafficTransportService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V8U implements C0V8P {
    public boolean LIZ;
    public C0V8X LIZIZ;
    public final C0V8Z LIZJ = new InterfaceC792740V7w() { // from class: X.0V8Z
        @Override // X.InterfaceC792740V7w
        public final void LIZ(String str, JSONObject jSONObject) {
            C0V8U c0v8u = this.LIZ;
            if (!c0v8u.LIZ) {
                return;
            }
            c0v8u.LJ(str, jSONObject);
        }
    };

    @Override // X.C0V8P
    public final C823150WQv<C0V88> LIZ() {
        return null;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LIZIZ() {
        return null;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LIZJ() {
        return null;
    }

    @Override // X.C0V8P
    public final void LIZLLL(double d) {
    }

    @Override // X.C0V8P
    public final void LJII(double d) {
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIIIZZ() {
        return null;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIIZ(String str) {
        return null;
    }

    @Override // X.C0V8P
    public final long LJIIJ() {
        return 0L;
    }

    @Override // X.C0V8P
    public final void LJIIJJI(String str) {
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIIL() {
        return null;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIILIIL() {
        return null;
    }

    @Override // X.C0V8P
    public final Map<String, C0V83> LJIILJJIL() {
        return null;
    }

    @Override // X.C0V8P
    public final void clear() {
    }

    @Override // X.C0V8P
    public final void start() throws Throwable {
        if (C792400V6o.LJIIIIZZ()) {
            C792910V8n.LIZLLL("APM-Traffic-Detail", "SubBiz start called");
        }
        this.LIZ = true;
        C0V5B.LIZ = true;
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: X.0ViO
            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                this.LL.LIZIZ = null;
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                C0V8X c810640Vr4 = null;
                C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/apm/perf/traffic/biz/SubProcessBizTrafficStats$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+69e88kG+WhQ/OG6MM/SDImlbZr2GRH5h5+OdNk04acFRwUzenA1yIHgM", null)));
                if (c0wsuLIZIZ.LIZ) {
                    return;
                }
                Object[] objArr = c0wsuLIZIZ.LIZJ;
                if (objArr != null) {
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    if (obj2 != null) {
                        iBinder = (IBinder) obj2;
                    }
                }
                C0V8U c0v8u = this.LL;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C0V8X)) {
                        c810640Vr4 = (C0V8X) iInterfaceQueryLocalInterface;
                    } else {
                        c810640Vr4 = new C810640Vr4(iBinder);
                    }
                }
                c0v8u.LIZIZ = c810640Vr4;
            }
        };
        Context context = C792400V6o.LIZ;
        C2204961BRm.LJJJJ(context, new Intent(context, (Class<?>) TrafficTransportService.class), serviceConnection, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtca89QmsQRZ3CnWOe/DBVdwQK3PwcmDeCR8f7dJzWS4=", null));
        C787960Uva.LIZ.LJIIIZ(this.LIZJ);
        C792310V6f.LJIIIZ().LLJ = new InterfaceC792330V6h() { // from class: X.0V8Y
            @Override // X.InterfaceC792330V6h
            public final void LIZ(String str, JSONObject jSONObject) {
                if (this.LIZ.LIZ && "image_monitor_v2".equals(str)) {
                    this.LIZ.LJI(jSONObject);
                }
            }
        };
    }

    @Override // X.C0V8P
    public final void LJI(JSONObject jSONObject) {
        String strJ3;
        if (this.LIZIZ != null) {
            if (jSONObject != null) {
                try {
                    strJ3 = C786410Ut5.J3(jSONObject);
                } catch (RemoteException | NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            } else {
                strJ3 = "";
            }
            this.LIZIZ.LJLIIL(strJ3);
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SubBiz httpImageApiTrafficStats extJson=");
                sbLIZ.append(strJ3);
                C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.C0V8P
    public final void LJJLIIIJ(String str) {
        C0V8X c0v8x = this.LIZIZ;
        if (c0v8x != null) {
            try {
                c0v8x.LJJLIIIJ(str);
                if (C792400V6o.LJIIIIZZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SubBiz initCustomMetricBizTrafficStats ");
                    sbLIZ.append(str);
                    C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C0V8P
    public final void LJ(String str, JSONObject jSONObject) {
        String strJ3;
        if (this.LIZIZ != null) {
            if (jSONObject != null) {
                try {
                    strJ3 = C786410Ut5.J3(jSONObject);
                } catch (RemoteException | NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            } else {
                strJ3 = "";
            }
            this.LIZIZ.LLILII(str, strJ3);
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SubBiz httpApiTrafficStats url=");
                sbLIZ.append(str);
                sbLIZ.append(", extJson=");
                sbLIZ.append(strJ3);
                C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.C0V8P
    public final void LJFF(final long j, final String str, final String str2, final String str3, final JSONObject jSONObject, final JSONObject jSONObject2) {
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0V8W
            public final void LIZ() {
                if (this.LLIZ.LIZIZ != null) {
                    try {
                        JSONObject jSONObject3 = jSONObject;
                        String strJ3 = jSONObject3 != null ? C786410Ut5.J3(jSONObject3) : "";
                        JSONObject jSONObject4 = jSONObject2;
                        String strJ32 = jSONObject4 != null ? C786410Ut5.J3(jSONObject4) : "";
                        this.LLIZ.LIZIZ.Q(j, str, str2, str3, strJ3, strJ32);
                        if (C792400V6o.LJIIIIZZ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SubBiz trafficStats(trafficBytes=");
                            sbLIZ.append(j);
                            sbLIZ.append(", sourceId=");
                            sbLIZ.append(str);
                            sbLIZ.append(", business=");
                            sbLIZ.append(str2);
                            sbLIZ.append(", scene=");
                            sbLIZ.append(str3);
                            sbLIZ.append(", extraStatus=");
                            sbLIZ.append(strJ3);
                            sbLIZ.append(", extraLog=");
                            sbLIZ.append(strJ32);
                            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubProcessBizTrafficStats@3173.trafficStats$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubProcessBizTrafficStats@3173.trafficStats$1");
            }
        });
    }
}
