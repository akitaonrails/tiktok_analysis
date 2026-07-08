package X;

import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0OMW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OMW implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ LayoutInflater LLILLL;

    public C0OMW(int i, int i2, LayoutInflater layoutInflater) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = layoutInflater;
    }

    public final void LIZ() {
        ConcurrentLinkedQueue<View> concurrentLinkedQueuePutIfAbsent;
        ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> concurrentHashMap = C0OMV.LIZ;
        Integer numValueOf = Integer.valueOf(this.LL);
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = concurrentHashMap.get(numValueOf);
        if (concurrentLinkedQueue == null && (concurrentLinkedQueuePutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (concurrentLinkedQueue = new ConcurrentLinkedQueue<>()))) != null) {
            concurrentLinkedQueue = concurrentLinkedQueuePutIfAbsent;
        }
        ConcurrentLinkedQueue<View> concurrentLinkedQueue2 = concurrentLinkedQueue;
        int i = this.LLILLJJLI;
        LayoutInflater layoutInflater = this.LLILLL;
        int i2 = this.LL;
        for (int i3 = 0; i3 < i && concurrentLinkedQueue2.size() < i && C0OMV.LIZIZ != null; i3++) {
            try {
                View viewTd = C786410Ut5.Td(layoutInflater, i2, null, false);
                if (viewTd != null) {
                    concurrentLinkedQueue2.offer(viewTd);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BulletinViewPreloadManager@b000.preload$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinViewPreloadManager@b000.preload$1");
    }
}
