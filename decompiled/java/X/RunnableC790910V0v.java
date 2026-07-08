package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sliver.SliverAllThreadSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0V0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC790910V0v implements Runnable {
    public final int LL;
    public List<Thread> LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SliverAllThreadSupport$SliverThreadMonitor@f800.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SliverAllThreadSupport$SliverThreadMonitor@f800.run");
    }

    public final void LIZ() {
        List<Thread> allThread = SliverAllThreadSupport.getAllThread();
        if (this.LLILLJJLI == null) {
            LIZIZ(allThread);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Thread thread : allThread) {
                if (!this.LLILLJJLI.contains(thread)) {
                    arrayList.add(thread);
                }
            }
            for (Thread thread2 : this.LLILLJJLI) {
                if (!allThread.contains(thread2)) {
                    arrayList2.add(thread2);
                }
            }
            for (Object obj : arrayList2) {
                int i = 1;
                while (true) {
                    List<C790920V0w> list = SliverAllThreadSupport.threadGroups;
                    if (i < list.size()) {
                        C790920V0w c790920V0w = (C790920V0w) ListProtector.get(list, i);
                        synchronized (c790920V0w) {
                            if (!c790920V0w.LIZJ.isEmpty()) {
                                if (c790920V0w.LIZJ.remove(obj)) {
                                    c790920V0w.LJI = true;
                                }
                            }
                            i++;
                        }
                        break;
                    }
                }
            }
            LIZIZ(arrayList);
        }
        this.LLILLJJLI = allThread;
        Iterator<C790920V0w> it2 = SliverAllThreadSupport.threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        C786410Ut5.LJLIIL(this.LL, SliverAllThreadSupport.newThreadHandler(), this);
    }

    public RunnableC790910V0v(int i) {
        this.LL = i;
    }

    public static void LIZIZ(List list) {
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = 1;
            while (i < size) {
                List<C790920V0w> list2 = SliverAllThreadSupport.threadGroups;
                C790920V0w c790920V0w = (C790920V0w) ListProtector.get(list2, i2);
                Object obj = ListProtector.get(list, i);
                synchronized (c790920V0w) {
                    c790920V0w.LIZJ.add((Thread) obj);
                    c790920V0w.LJI = true;
                }
                i++;
                i2++;
                if (i2 >= list2.size()) {
                    break;
                }
            }
            return;
        }
    }
}
