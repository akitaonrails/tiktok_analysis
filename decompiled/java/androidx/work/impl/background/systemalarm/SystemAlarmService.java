package androidx.work.impl.background.systemalarm;

import X.C0VI8;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C789740UyS;
import X.C795000VGo;
import X.C817700W5w;
import X.InterfaceC794980VGm;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.lifecycle.LifecycleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class SystemAlarmService extends LifecycleService implements InterfaceC794980VGm {
    public C795000VGo LL;
    public boolean LLILLJJLI;

    public final void LIZ() {
        this.LLILLJJLI = true;
        C0VI8.LIZ().getClass();
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C789740UyS.LIZ;
        synchronized (weakHashMap) {
            try {
                map.putAll(weakHashMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C786410Ut5.j4("WakeLock held for %s", new Object[]{map.get(wakeLock)});
                C0VI8.LIZ().getClass();
            }
        }
        stopSelf();
    }

    static {
        C0VI8.LIZIZ("SystemAlarmService");
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C795000VGo c795000VGo = new C795000VGo(this);
        this.LL = c795000VGo;
        if (c795000VGo.LLJI != null) {
            C0VI8.LIZ().getClass();
        } else {
            c795000VGo.LLJI = this;
        }
        this.LLILLJJLI = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI = true;
        this.LL.LJ();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.LLILLJJLI) {
            C0VI8.LIZ().getClass();
            this.LL.LJ();
            C795000VGo c795000VGo = new C795000VGo(this);
            this.LL = c795000VGo;
            if (c795000VGo.LLJI != null) {
                C0VI8.LIZ().getClass();
            } else {
                c795000VGo.LLJI = this;
            }
            this.LLILLJJLI = false;
        }
        if (intent != null) {
            this.LL.LIZ(i2, intent);
            return 3;
        }
        return 3;
    }
}
