package X;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: X.088K, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088K implements Handler.Callback {
    public static final C088K LLILLJJLI = new C088K();
    public static C088J LLILLL = null;
    public static Map<IBinder, Service> LLILZ;
    public Handler.Callback LL;

    public final synchronized String LIZ(IBinder iBinder) {
        Map<IBinder, Service> map;
        String name;
        if (LLILZ == null) {
            try {
                Object objLIZ = C083F.LIZ();
                LLILZ = (Map) C1961107mD.LIZ(objLIZ.getClass(), "mServices").get(objLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            map = LLILZ;
            name = null;
            if (map != null && map.get(iBinder) != null) {
                name = LLILZ.get(iBinder).getClass().getName();
            }
        } else {
            map = LLILZ;
            name = null;
            if (map != null) {
                name = LLILZ.get(iBinder).getClass().getName();
            }
        }
        return name;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            if (((HashSet) C007L.LIZ).contains(Integer.valueOf(message.what))) {
                LLILLL = C088J.LIZ(message);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Handler.Callback callback = this.LL;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
