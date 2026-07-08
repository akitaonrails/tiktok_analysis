package X;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.zza;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: X.0VuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractServiceC812790VuX extends Service {
    public Messenger LL = new Messenger(new zza(this, Looper.getMainLooper()));
    public ExecutorService LLILLJJLI;

    public abstract void LIZ(CallbackInput callbackInput);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.LL = new Messenger(new zza(this, Looper.getMainLooper()));
        this.LLILLJJLI = Executors.unconfigurableExecutorService(C807400Vlq.LIZ());
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/google/android/gms/wallet/callback/zzd", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzrf1pHi0ACMr7D5e5PBSfk+LLU", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return this.LL.getBinder();
    }
}
