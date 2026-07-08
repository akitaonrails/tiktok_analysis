package X;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.apm6.traffic.TrafficTransportService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V8T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V8T implements C0V89 {
    public C0V8X LL;
    public boolean LLILLJJLI;
    public final ServiceConnectionC805270ViP LLILLL = new ServiceConnection() { // from class: X.0ViP
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.LL.LL = null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
            C0V8X c810640Vr4 = null;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/apm/perf/traffic/collector/SubProcessCollector$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+69e88kG+WhQ/OG6MM/XJ9el6TmehqfbR3OfmKzcnqIfzM/LWB1QwMj2w", null)));
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
            C0V8T c0v8t = this.LL;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C0V8X)) {
                    c810640Vr4 = (C0V8X) iInterfaceQueryLocalInterface;
                } else {
                    c810640Vr4 = new C810640Vr4(iBinder);
                }
            }
            c0v8t.LL = c810640Vr4;
        }
    };

    @Override // X.C0V89
    public final void LIZ(C792560V7e c792560V7e) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SubCollector updateConfig: ");
            sbLIZ.append(c792560V7e.LIZIZ);
            C792910V8n.LIZLLL("APM-Traffic-Detail", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c792560V7e.LIZIZ) {
            C0V8S.LIZ.start();
        }
    }

    @Override // X.C0V89
    public final void LJJIJLIJ(String str) {
        C0V8X c0v8x = this.LL;
        if (c0v8x != null) {
            try {
                c0v8x.LJJIJLIJ(str);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C0V89
    public final void LIZIZ(boolean z, boolean z2) throws Throwable {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        C792590V7h.LIZ(InterfaceC792570V7f.class);
        Application application = C792190V5t.LIZIZ;
        C2204961BRm.LJJJJ(application, new Intent(application, (Class<?>) TrafficTransportService.class), this.LLILLL, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhvmtca89QmsQRZ3CnWOe/DBVdwQK3PwcmDeCR8f7dJzWS4=", null));
    }

    @Override // X.C0V89
    public final void LJJLJLI(String str, boolean z) {
        C0V8X c0v8x = this.LL;
        if (c0v8x != null) {
            try {
                c0v8x.LJJLJLI(str, z);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
