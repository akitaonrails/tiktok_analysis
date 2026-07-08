package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.012S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012S implements Runnable {
    public final WeakReference<C686940Qx2> LL;
    public final WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> LLILLJJLI;

    public final void LIZ() {
        WeakReference<C686940Qx2> weakReference = this.LL;
        C686940Qx2 c686940Qx2 = weakReference != null ? weakReference.get() : null;
        WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> weakReference2 = this.LLILLJJLI;
        ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap = weakReference2 != null ? weakReference2.get() : null;
        if (c686940Qx2 == null || concurrentHashMap == null) {
            return;
        }
        for (Pair pair : (ArrayList) c686940Qx2.LIZ) {
            Object first = pair.getFirst();
            int iIntValue = ((Number) pair.getSecond()).intValue();
            int iIntValue2 = ((Number) first).intValue();
            LinkedList<View> linkedList = concurrentHashMap.get(Integer.valueOf(iIntValue2));
            if (linkedList != null) {
                if (linkedList.size() > iIntValue) {
                    synchronized (linkedList) {
                        int i = 0;
                        while (true) {
                            if (i >= iIntValue) {
                                break;
                            }
                            try {
                                if (linkedList.poll() == null) {
                                    break;
                                } else {
                                    i++;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                } else {
                    concurrentHashMap.remove(Integer.valueOf(iIntValue2));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ViewGcRunnable@9950.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewGcRunnable@9950.run");
    }

    public C012S(C686940Qx2 c686940Qx2, ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap) {
        this.LL = new WeakReference<>(c686940Qx2);
        this.LLILLJJLI = new WeakReference<>(concurrentHashMap);
    }
}
