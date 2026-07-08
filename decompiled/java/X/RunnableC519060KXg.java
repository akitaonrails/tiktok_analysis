package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0KXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC519060KXg implements Runnable, Comparable<RunnableC519060KXg> {
    public final RunnableC519000KXa LL;
    public final long LLILLJJLI;
    public final InterfaceC519080KXi LLILLL;
    public long LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("InnerWrapperTask@ec69.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InnerWrapperTask@ec69.run");
    }

    public final void LIZJ() {
        Object c098200Yq;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("do run task ");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LL.run();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("on task ");
            sbLIZ2.append(this);
            sbLIZ2.append(" finish");
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LLILLL.LIZ(this.LLILLJJLI);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("on task ");
            sbLIZ3.append(this);
            sbLIZ3.append(" finish");
            C2188811AlT.LIZIZ(sbLIZ3);
            this.LLILLL.LIZ(this.LLILLJJLI);
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerWrapperTask[");
        sbLIZ.append(this.LL);
        sbLIZ.append("](taskId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", schedulePriority=");
        sbLIZ.append(1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(RunnableC519060KXg runnableC519060KXg) {
        return this.LL.LLIZ - runnableC519060KXg.LL.LLIZ;
    }

    public RunnableC519060KXg(RunnableC519000KXa runnableC519000KXa, long j, C519090KXj c519090KXj) {
        this.LL = runnableC519000KXa;
        this.LLILLJJLI = j;
        this.LLILLL = c519090KXj;
    }
}
