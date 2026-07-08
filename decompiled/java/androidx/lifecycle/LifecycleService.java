package androidx.lifecycle;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.InterfaceC1294060jmO;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes14.dex */
public class LifecycleService extends Service implements LifecycleOwner {
    public final ServiceLifecycleDispatcher dispatcher = new ServiceLifecycleDispatcher(this);

    public void androidx_lifecycle_LifecycleService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_lifecycle_LifecycleService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.dispatcher.getLifecycle();
    }

    @Override // android.app.Service
    public void onCreate() {
        this.dispatcher.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.dispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "androidx/lifecycle/LifecycleService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dTF6Tg0zW9KSWV4nQBGdZfyvgUWbHCGzWMJoV5S8ZRBDETM=", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        this.dispatcher.onServicePreSuperOnBind();
        return null;
    }

    public static void androidx_lifecycle_LifecycleService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(LifecycleService lifecycleService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        lifecycleService.androidx_lifecycle_LifecycleService__attachBaseContext$___twin___(context);
    }

    @Override // android.app.Service
    @InterfaceC1294060jmO
    public void onStart(Intent intent, int i) {
        this.dispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
