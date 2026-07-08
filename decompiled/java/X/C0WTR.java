package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WTR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTR implements Runnable, Comparable<C0WTR> {
    public final C0WTP LL;
    public final Runnable LLILLJJLI;
    public final long LLILLL;
    public final String LLILZ;
    public final long LLILZIL;
    public final String LLILZLL;
    public final Function0<Unit> LLIZ;
    public volatile long LLIZLLLIL;
    public final String LLJ;

    public C0WTR() {
        throw null;
    }

    public final void LIZJ() {
        Function0<Unit> function0 = this.LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLIZLLLIL = System.currentTimeMillis();
        try {
            this.LLILLJJLI.run();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LLIZLLLIL > 0) {
                long j = this.LLIZLLLIL - this.LLILZIL;
                long j2 = jCurrentTimeMillis - this.LLIZLLLIL;
                String simpleName = this.LLILZ;
                if (simpleName == null) {
                    simpleName = this.LLILLJJLI.getClass().getSimpleName();
                }
                C823800WTi.LIZIZ(j, j2, simpleName, this.LLILZLL);
                Runnable runnable = this.LLILLJJLI;
                String str = this.LLILZ;
                String str2 = this.LLJ;
                this.LL.name();
                C786410Ut5.u3().getName();
                C0JDZ.LJ(runnable, str, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (this.LLIZLLLIL > 0) {
                long j3 = this.LLIZLLLIL - this.LLILZIL;
                long j4 = jCurrentTimeMillis2 - this.LLIZLLLIL;
                String simpleName2 = this.LLILZ;
                if (simpleName2 == null) {
                    simpleName2 = this.LLILLJJLI.getClass().getSimpleName();
                }
                C823800WTi.LIZIZ(j3, j4, simpleName2, this.LLILZLL);
                Runnable runnable2 = this.LLILLJJLI;
                String str3 = this.LLILZ;
                String str4 = this.LLJ;
                this.LL.name();
                C786410Ut5.u3().getName();
                C0JDZ.LJ(runnable2, str3, str4);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveThreadManager$PriorityRunnable@d9a3.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveThreadManager$PriorityRunnable@d9a3.run");
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0WTR c0wtr) {
        C0WTR c0wtr2 = c0wtr;
        int iLJI = Intrinsics.LJI(this.LL.getValue(), c0wtr2.LL.getValue());
        if (iLJI == 0) {
            return Intrinsics.LJII(this.LLILLL, c0wtr2.LLILLL);
        }
        return iLJI;
    }

    public C0WTR(C0WTP c0wtp, Runnable runnable, long j, String str, String str2, Function0 function0, int i) {
        long jCurrentTimeMillis;
        Object c098200Yq;
        String str3 = null;
        str = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        str2 = (i & 32) != 0 ? "" : str2;
        function0 = (i & 64) != 0 ? null : function0;
        this.LL = c0wtp;
        this.LLILLJJLI = runnable;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = jCurrentTimeMillis;
        this.LLILZLL = str2;
        this.LLIZ = function0;
        if (C0JDZ.LIZJ) {
            try {
                C0JDZ.LIZ.getClass();
                c098200Yq = C0JDZ.LIZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            str3 = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            if (str3 == null) {
                str3 = "";
            }
        }
        this.LLJ = str3;
    }
}
