package androidx.browser.trusted;

import X.BinderC2456109jr;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC2456209js;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TrustedWebActivityService extends Service {
    public NotificationManager LL;
    public int LLILLJJLI = -1;
    public final BinderC2456109jr LLILLL = new BinderC2456109jr(this);

    public abstract InterfaceC2456209js LIZJ();

    public final int LIZLLL() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public final void LIZIZ() {
        if (this.LL == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.LL = (NotificationManager) getSystemService("notification");
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.toLowerCase(Locale.ROOT).replace(' ', '_'));
        sbLIZ.append("_channel_id");
        return C2188811AlT.LIZIZ(sbLIZ);
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
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "androidx/browser/trusted/TrustedWebActivityService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dTF6Tg0zW9KSV0UuUgGBdArK4mrUU7p2lQFkJiR43oD+C3Rm9zJmf2txk/RXu1CFVOY=", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return this.LLILLL;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.LLILLJJLI = -1;
        return super.onUnbind(intent);
    }
}
