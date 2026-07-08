package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC740170T1r implements Runnable, Comparable<RunnableC740170T1r> {
    public final C0T0O LL;
    public final Runnable LLILLJJLI;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RxPriorityScheduler$ComparableRunnable@caf8.run");
        try {
            this.LLILLJJLI.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RxPriorityScheduler$ComparableRunnable@caf8.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComparableRunnable{taskInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(RunnableC740170T1r runnableC740170T1r) {
        RunnableC740170T1r runnableC740170T1r2 = runnableC740170T1r;
        if (runnableC740170T1r2 == null) {
            return 1;
        }
        return runnableC740170T1r2.LL.LIZJ - this.LL.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.LJFF(RunnableC740170T1r.class, obj.getClass())) {
            return this.LL.equals(((RunnableC740170T1r) obj).LL);
        }
        return false;
    }

    public RunnableC740170T1r(C0T0O c0t0o, Runnable runnable) {
        this.LL = c0t0o;
        this.LLILLJJLI = runnable;
    }
}
