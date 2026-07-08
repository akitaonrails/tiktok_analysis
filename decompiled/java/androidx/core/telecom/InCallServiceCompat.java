package androidx.core.telecom;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LE;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC1294060jmO;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.telecom.InCallService;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ServiceLifecycleDispatcher;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class InCallServiceCompat extends InCallService implements LifecycleOwner {
    public final ServiceLifecycleDispatcher LL = new ServiceLifecycleDispatcher(this);

    static {
        C13LE.LIZ(InCallService.class).LJI();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.LL.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.LL.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("serviceAttachBaseContext: ");
            sbLIZ2.append(this);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.telecom.InCallService, android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "androidx/core/telecom/InCallServiceCompat", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dTF6Tg0zW9KSVlgzQFyQYxNdAUtEmcwtuNJTwPoujdX6bq7Z05jDrw4=", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        this.LL.onServicePreSuperOnBind();
        return super.onBind(intent);
    }

    @Override // android.app.Service
    @InterfaceC1294060jmO
    public final void onStart(Intent intent, int i) {
        this.LL.onServicePreSuperOnStart();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
