package X;

import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1319130kQp implements Runnable {
    public final WeakReference<C1319140kQq> LL;

    public final void LIZ() {
        boolean zEquals;
        C1319140kQq c1319140kQq = this.LL.get();
        if (c1319140kQq == null) {
            return;
        }
        c1319140kQq.LIZJ = null;
        int i = UIList.LLLL;
        while (c1319140kQq.LIZLLL.size() > 0) {
            C1319120kQo c1319120kQoRemoveFirst = c1319140kQq.LIZLLL.removeFirst();
            if (c1319140kQq.LJI(c1319120kQoRemoveFirst)) {
                Iterator<C1319120kQo> it2 = c1319140kQq.LIZLLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1319120kQo next = it2.next();
                        if (c1319140kQq.LJ(c1319120kQoRemoveFirst, next)) {
                            c1319140kQq.LIZLLL.remove(next);
                            break;
                        }
                    } else {
                        Iterator<C1319120kQo> it3 = c1319140kQq.LJ.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                C1319120kQo next2 = it3.next();
                                if (c1319140kQq.LJ(c1319120kQoRemoveFirst, next2)) {
                                    c1319140kQq.LJ.remove(next2);
                                    break;
                                }
                            } else if (c1319140kQq.LJI(c1319120kQoRemoveFirst)) {
                                UIComponent uIComponent = c1319120kQoRemoveFirst.LIZ.LL.LLILLJJLI;
                                if (uIComponent != null && uIComponent.getEvents() != null) {
                                    zEquals = uIComponent.getEvents().containsKey(c1319120kQoRemoveFirst.LIZIZ);
                                } else if (c1319140kQq.LJFF) {
                                    zEquals = "nodedisappear".equals(c1319120kQoRemoveFirst.LIZIZ);
                                }
                                if (zEquals && c1319140kQq.LJI(c1319120kQoRemoveFirst)) {
                                    int i2 = UIList.LLLL;
                                    C1298110jsv c1298110jsv = new C1298110jsv(c1319120kQoRemoveFirst.LJ, c1319120kQoRemoveFirst.LIZIZ);
                                    c1298110jsv.LIZIZ(Integer.valueOf(c1319120kQoRemoveFirst.LIZJ), "position");
                                    c1298110jsv.LIZIZ(c1319120kQoRemoveFirst.LIZLLL, "key");
                                    c1319140kQq.LIZ.LIZIZ(c1298110jsv);
                                }
                            }
                        }
                    }
                }
            }
        }
        c1319140kQq.LIZLLL = c1319140kQq.LJ;
        c1319140kQq.LJ = new LinkedList<>();
        if (c1319140kQq.LIZLLL.size() > 0) {
            c1319140kQq.LJFF();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AppearEventCourierImpl$Callback@aa4b.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppearEventCourierImpl$Callback@aa4b.run");
    }

    public RunnableC1319130kQp(C1319140kQq c1319140kQq) {
        this.LL = new WeakReference<>(c1319140kQq);
    }
}
