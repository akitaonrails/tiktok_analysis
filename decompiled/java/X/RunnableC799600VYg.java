package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC799600VYg implements Runnable, Comparable<RunnableC799600VYg> {
    public final C0CCZ LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    @Override // java.lang.Runnable
    public void run() {
        boolean zLIZ;
        C1C7U.LIZ("LegoExecutor$PriorityRunnable@eb97.run");
        try {
            C799900VZk.LIZ.getClass();
            C799900VZk.LIZIZ.LJ(this.LL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LegoExecutor$PriorityRunnable@eb97.run");
    }

    @Override // java.lang.Comparable
    public final int compareTo(RunnableC799600VYg runnableC799600VYg) {
        int iPriority;
        RunnableC799600VYg runnableC799600VYg2 = runnableC799600VYg;
        if (this.LLILLL) {
            C0CCZ c0ccz = this.LL;
            int iPriority2 = 1;
            if (c0ccz instanceof InterfaceC799590VYf) {
                iPriority = ((InterfaceC799590VYf) c0ccz).priority();
            } else {
                iPriority = 1;
            }
            C0CCZ c0ccz2 = runnableC799600VYg2.LL;
            if (c0ccz2 instanceof InterfaceC799590VYf) {
                iPriority2 = ((InterfaceC799590VYf) c0ccz2).priority();
            }
            if (iPriority != iPriority2) {
                return Intrinsics.LJI(iPriority2, iPriority);
            }
        }
        return Intrinsics.LJI(this.LLILLJJLI, runnableC799600VYg2.LLILLJJLI);
    }

    public RunnableC799600VYg(C0CCZ c0ccz, int i, boolean z) {
        this.LL = c0ccz;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }
}
