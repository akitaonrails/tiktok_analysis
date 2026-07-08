package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Vu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC812530Vu7 implements ServiceConnection {
    public int LL;
    public C812510Vu5 LLILLL;
    public final /* synthetic */ C811800Vsw LLILZLL;
    public final Messenger LLILLJJLI = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0VuA
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC812530Vu7 serviceConnectionC812530Vu7 = this.LL;
            int i = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            synchronized (serviceConnectionC812530Vu7) {
                try {
                    AbstractC812540Vu8<?> abstractC812540Vu8 = serviceConnectionC812530Vu7.LLILZIL.get(i);
                    if (abstractC812540Vu8 != null) {
                        serviceConnectionC812530Vu7.LLILZIL.remove(i);
                        serviceConnectionC812530Vu7.LIZJ();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            abstractC812540Vu8.LIZJ(new C812620VuG("Not supported by GmsCore", null));
                            return true;
                        }
                        abstractC812540Vu8.LIZ(data);
                        return true;
                    }
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }));
    public final Queue<AbstractC812540Vu8<?>> LLILZ = new ArrayDeque();
    public final SparseArray<AbstractC812540Vu8<?>> LLILZIL = new SparseArray<>();

    public final synchronized void LIZJ() {
        if (this.LL == 2 && ((ArrayDeque) this.LLILZ).isEmpty() && this.LLILZIL.size() == 0) {
            this.LL = 3;
            C812630VuH.LIZIZ().LIZJ(this.LLILZLL.LIZ, this);
        }
    }

    public final synchronized boolean LIZLLL(AbstractC812540Vu8<?> abstractC812540Vu8) {
        boolean z;
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                ((ArrayDeque) this.LLILZ).add(abstractC812540Vu8);
                this.LLILZLL.LIZIZ.execute(new RunnableC812520Vu6(this));
                return true;
            }
            ((ArrayDeque) this.LLILZ).add(abstractC812540Vu8);
            return true;
        }
        ((ArrayDeque) this.LLILZ).add(abstractC812540Vu8);
        if (this.LL == 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LJIIJJI(z);
        this.LL = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!C812630VuH.LIZIZ().LIZ(this.LLILZLL.LIZ, intent, this, 1)) {
                LIZ(0, "Unable to bind to service");
            } else {
                this.LLILZLL.LIZIZ.schedule(new Runnable() { // from class: X.0VuC
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzi@95df.run");
                        try {
                            ServiceConnectionC812530Vu7 serviceConnectionC812530Vu7 = this.LL;
                            synchronized (serviceConnectionC812530Vu7) {
                                if (serviceConnectionC812530Vu7.LL == 1) {
                                    serviceConnectionC812530Vu7.LIZ(1, "Timed out while binding");
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzi@95df.run");
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LLILZLL.LIZIZ.execute(new Runnable() { // from class: X.0VuE
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzg@95e1.run");
                try {
                    this.LL.LIZ(2, "Service disconnected");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzg@95e1.run");
            }
        });
    }

    public final synchronized void LIZ(int i, String str) {
        LIZIZ(i, str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/cloudmessaging/zzm", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/clleillJIqyg/Yvs7TtrAeQ=", new String[]{"016a9"})));
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
        this.LLILZLL.LIZIZ.execute(new Runnable() { // from class: X.0Vu9
            public final void LIZ() {
                ServiceConnectionC812530Vu7 serviceConnectionC812530Vu7 = this.LL;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC812530Vu7) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC812530Vu7.LIZ(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC812530Vu7.LLILLL = new C812510Vu5(iBinder2);
                            serviceConnectionC812530Vu7.LL = 2;
                            serviceConnectionC812530Vu7.LLILZLL.LIZIZ.execute(new RunnableC812520Vu6(serviceConnectionC812530Vu7));
                        } catch (RemoteException e) {
                            TryCatchGuardChecker.doCheck(e);
                            serviceConnectionC812530Vu7.LIZ(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzj@95de.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzj@95de.run");
            }
        });
    }

    public final synchronized void LIZIZ(int i, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                "Disconnected: ".concat(strValueOf);
            }
        }
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.LL = 4;
                return;
            }
            this.LL = 4;
            C812630VuH.LIZIZ().LIZJ(this.LLILZLL.LIZ, this);
            C812620VuG c812620VuG = new C812620VuG(str, th);
            Iterator it2 = ((ArrayDeque) this.LLILZ).iterator();
            while (it2.hasNext()) {
                ((AbstractC812540Vu8) it2.next()).LIZJ(c812620VuG);
            }
            ((ArrayDeque) this.LLILZ).clear();
            for (int i3 = 0; i3 < this.LLILZIL.size(); i3++) {
                this.LLILZIL.valueAt(i3).LIZJ(c812620VuG);
            }
            this.LLILZIL.clear();
            return;
        }
        throw new IllegalStateException();
    }
}
