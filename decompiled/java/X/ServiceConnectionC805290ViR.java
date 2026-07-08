package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ViR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC805290ViR implements ServiceConnection {
    public final Intent LL;
    public final Context LLILLJJLI;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.LLILLJJLI.unbindService(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public ServiceConnectionC805290ViR(Context context, Intent intent) {
        this.LL = intent;
        this.LLILLJJLI = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        Context context;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/newmedia/redbadge/RedbadgeServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI7zvlIurF4sWI3hJJTlPxZk2VoDhTWf8eEFQ==", null)));
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
        Messenger messenger = new Messenger(iBinder);
        Message message = new Message();
        try {
            try {
                try {
                    message.what = 101;
                    C786410Ut5.LJJIJL(message.getData(), "intent", this.LL);
                    messenger.send(message);
                    context = this.LLILLJJLI;
                } catch (Exception e) {
                    context = this.LLILLJJLI;
                }
                context.unbindService(this);
            } catch (Throwable e2) {
            }
        } catch (Throwable e22) {
            try {
                this.LLILLJJLI.unbindService(this);
                throw e22;
            } finally {
                TryCatchGuardChecker.doCheck(e22);
            }
        }
    }
}
