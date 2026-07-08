package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Vu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class RunnableC812520Vu6 implements Runnable {
    public final /* synthetic */ ServiceConnectionC812530Vu7 LL;

    public /* synthetic */ RunnableC812520Vu6(ServiceConnectionC812530Vu7 serviceConnectionC812530Vu7) {
        this.LL = serviceConnectionC812530Vu7;
    }

    public final void LIZ() {
        final ServiceConnectionC812530Vu7 serviceConnectionC812530Vu7 = this.LL;
        while (true) {
            synchronized (serviceConnectionC812530Vu7) {
                try {
                    if (serviceConnectionC812530Vu7.LL != 2) {
                        return;
                    }
                    if (((ArrayDeque) serviceConnectionC812530Vu7.LLILZ).isEmpty()) {
                        serviceConnectionC812530Vu7.LIZJ();
                        return;
                    }
                    final AbstractC812540Vu8<?> abstractC812540Vu8 = (AbstractC812540Vu8) ((ArrayDeque) serviceConnectionC812530Vu7.LLILZ).poll();
                    serviceConnectionC812530Vu7.LLILZIL.put(abstractC812540Vu8.LIZ, abstractC812540Vu8);
                    serviceConnectionC812530Vu7.LLILZLL.LIZIZ.schedule(new Runnable() { // from class: X.0VuB
                        public final void LIZ() {
                            ServiceConnectionC812530Vu7 serviceConnectionC812530Vu72 = serviceConnectionC812530Vu7;
                            int i = abstractC812540Vu8.LIZ;
                            synchronized (serviceConnectionC812530Vu72) {
                                AbstractC812540Vu8<?> abstractC812540Vu82 = serviceConnectionC812530Vu72.LLILZIL.get(i);
                                if (abstractC812540Vu82 != null) {
                                    serviceConnectionC812530Vu72.LLILZIL.remove(i);
                                    abstractC812540Vu82.LIZJ(new C812620VuG("Timed out waiting for response", null));
                                    serviceConnectionC812530Vu72.LIZJ();
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzk@95dd.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzk@95dd.run");
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        new StringBuilder(String.valueOf(abstractC812540Vu8).length() + 8);
                    }
                    Context context = serviceConnectionC812530Vu7.LLILZLL.LIZ;
                    Messenger messenger = serviceConnectionC812530Vu7.LLILLJJLI;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = abstractC812540Vu8.LIZJ;
                    messageObtain.arg1 = abstractC812540Vu8.LIZ;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC812540Vu8.LIZIZ());
                    C786410Ut5.LJJJI("pkg", context.getPackageName(), bundle);
                    C786410Ut5.LJJIIZI(bundle, abstractC812540Vu8.LIZLLL, "data");
                    messageObtain.setData(bundle);
                    try {
                        C812510Vu5 c812510Vu5 = serviceConnectionC812530Vu7.LLILLL;
                        Messenger messenger2 = c812510Vu5.LIZ;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = c812510Vu5.LIZIZ;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.LL;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        serviceConnectionC812530Vu7.LIZ(2, e.getMessage());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzh@95e0.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzh@95e0.run");
    }
}
