package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0WAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C818910WAn implements C0WB1 {
    public static final AtomicReference<C818910WAn> LIZ = new AtomicReference<>();

    @Override // X.C0WB1
    public final void LIZ(boolean z) {
        synchronized (C818880WAk.LJIIIZ) {
            try {
                for (C818880WAk c818880WAk : new ArrayList(C818880WAk.LJIIJJI.values())) {
                    if (c818880WAk.LJ.get()) {
                        Iterator it2 = ((CopyOnWriteArrayList) c818880WAk.LJIIIIZZ).iterator();
                        while (it2.hasNext()) {
                            ((C0WB0) it2.next()).LIZ(z);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
