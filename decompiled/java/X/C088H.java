package X;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.088H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088H implements Handler.Callback {
    public static final C088H LLILLL = new C088H();
    public static Map<IBinder, Service> LLILZ;
    public final List<C088I> LL = new ArrayList();
    public Handler.Callback LLILLJJLI;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String LIZ(android.os.IBinder r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<android.os.IBinder, android.app.Service> r0 = X.C088H.LLILZ     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L20
            java.lang.Object r2 = X.C1966607n6.LIZLLL()     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "mServices"
            java.lang.reflect.Field r0 = X.C1963407ma.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L1c
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L1c
            X.C088H.LLILZ = r0     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3e
        L20:
            java.util.Map<android.os.IBinder, android.app.Service> r0 = X.C088H.LLILZ     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3b
            java.util.Map<android.os.IBinder, android.app.Service> r0 = X.C088H.LLILZ     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L3e
            android.app.Service r0 = (android.app.Service) r0     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L3e
            goto L3c
        L3b:
            r0 = 0
        L3c:
            monitor-exit(r3)
            return r0
        L3e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C088H.LIZ(android.os.IBinder):java.lang.String");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (C088G.LIZIZ(message)) {
            if (message.arg2 != 9529) {
                try {
                    ((ArrayList) this.LL).add(C088I.LIZ(message));
                    if (((ArrayList) this.LL).size() > 100) {
                        ((ArrayList) this.LL).subList(0, 50).clear();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                message.arg2 = 9529;
            } else {
                return true;
            }
        }
        Handler.Callback callback = this.LLILLJJLI;
        if (callback == null) {
            return false;
        }
        return callback.handleMessage(message);
    }
}
