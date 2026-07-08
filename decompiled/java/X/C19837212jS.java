package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.12jS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19837212jS<V> extends FutureTask<V> implements Comparable<C19837212jS<V>> {
    public final long LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final /* synthetic */ C19837112jR LLILZ;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C19837212jS c19837212jS = (C19837212jS) obj;
        boolean z = this.LLILLJJLI;
        if (z != c19837212jS.LLILLJJLI) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        long j = this.LL;
        long j2 = c19837212jS.LL;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.LLILZ.LJIILJJIL().LJI.LIZ(Long.valueOf(this.LL), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.LLILZ.LJIILJJIL().LJFF.LIZ(th, this.LLILLL);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19837212jS(C19837112jR c19837112jR, Callable callable, boolean z) {
        super(callable);
        this.LLILZ = c19837112jR;
        long andIncrement = C19837112jR.LJIIJ.getAndIncrement();
        this.LL = andIncrement;
        this.LLILLL = "Task exception on worker thread";
        this.LLILLJJLI = z;
        if (andIncrement == Long.MAX_VALUE) {
            c19837112jR.LJIILJJIL().LJFF.LIZJ("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19837212jS(C19837112jR c19837112jR, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.LLILZ = c19837112jR;
        long andIncrement = C19837112jR.LJIIJ.getAndIncrement();
        this.LL = andIncrement;
        this.LLILLL = str;
        this.LLILLJJLI = z;
        if (andIncrement == Long.MAX_VALUE) {
            c19837112jR.LJIILJJIL().LJFF.LIZJ("Tasks index overflow");
        }
    }
}
