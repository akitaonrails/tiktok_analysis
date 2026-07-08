package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0iKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238280iKQ {
    public static final List<WeakReference<InterfaceC1238260iKO>> LIZ;
    public static final List<InterfaceC1238290iKR> LIZIZ;

    static {
        C2280601EOk c2280601EOk = C2280601EOk.LJFF;
        C2280601EOk c2280601EOk2 = C2280601EOk.LJFF;
        LIZ = new LinkedList();
        LIZIZ = new CopyOnWriteArrayList();
    }

    public static void LIZ(C2280601EOk c2280601EOk) {
        synchronized (C1238280iKQ.class) {
            try {
                Iterator<WeakReference<InterfaceC1238260iKO>> it2 = LIZ.iterator();
                while (it2.hasNext()) {
                    WeakReference<InterfaceC1238260iKO> next = it2.next();
                    if (next.get() == null) {
                        it2.remove();
                    } else {
                        next.get().LIZ(c2280601EOk);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(int i) {
        Iterator it2 = ((CopyOnWriteArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1238290iKR) it2.next()).LLJJ(i);
        }
    }
}
