package X;

import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0oso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490240oso implements InterfaceC1490310osv {
    public static volatile C1490240oso LIZJ;
    public final List<C1490350osz> LIZ = new CopyOnWriteArrayList();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static C1490240oso LIZ() {
        if (LIZJ == null) {
            synchronized (C1490240oso.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1490240oso();
                        SsHttpCall.setRequestFlagHandler(LIZJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
