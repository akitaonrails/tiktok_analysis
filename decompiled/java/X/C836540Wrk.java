package X;

import android.os.Binder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C836540Wrk {
    public static <V> V LIZ(InterfaceC836550Wrl<V> interfaceC836550Wrl) {
        try {
            return interfaceC836550Wrl.zza();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                V vZza = interfaceC836550Wrl.zza();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return vZza;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
    }
}
