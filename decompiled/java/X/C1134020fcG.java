package X;

import Y.ARunnableS76S0200000_7;
import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0fcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134020fcG implements Closeable {
    public boolean LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C204577153f c204577153f;
        synchronized (C1133980fcC.LJ) {
            try {
                if (this.LL) {
                    return;
                }
                this.LL = true;
                int i = C1133980fcC.LIZLLL;
                if (i <= 0) {
                    C1133980fcC.LIZLLL = 0;
                    return;
                }
                int i2 = i - 1;
                C1133980fcC.LIZLLL = i2;
                if (i2 == 0 && (c204577153f = C1133980fcC.LIZIZ) != null) {
                    try {
                        Collection<InterfaceC204578153g> collectionLJIJJ = c204577153f.LJIJJ();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : collectionLJIJJ) {
                            if (((InterfaceC204578153g) obj).isOpen()) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Context contextLJII = C497740JfY.LJII();
                            if (contextLJII != null) {
                                C786410Ut5.N3(contextLJII);
                            }
                            Activity activityLJJJJI = C204577153f.LJJJJI();
                            arrayList.size();
                            if (activityLJJJJI != null && !activityLJJJJI.isFinishing()) {
                                activityLJJJJI.isDestroyed();
                            }
                            C473410IhP.LIZIZ(new ARunnableS76S0200000_7(c204577153f, arrayList, 82));
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            try {
                                ((InterfaceC204578153g) it2.next()).LIZIZ("gift_queue_server_stopped");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        c204577153f.LJJJIL(500, "");
                        C1133980fcC.LIZIZ = null;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1133980fcC.LIZLLL = 1;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
