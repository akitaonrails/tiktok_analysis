package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T5H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T5H implements Comparable<Object>, Runnable, C0T5I<Runnable> {
    public final Comparable<Object> LL;
    public final Runnable LLILLJJLI;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // X.C0T5I
    public final Runnable LIZJ() {
        Runnable runnable = this.LLILLJJLI;
        if (!(runnable instanceof C0T5I)) {
            return runnable;
        }
        ?? LIZJ = ((C0T5I) runnable).LIZJ();
        return (!(LIZJ instanceof Runnable) || LIZJ == 0) ? this.LLILLJJLI : LIZJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILLJJLI.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof C0T5H) {
            return this.LL.compareTo(((C0T5H) obj).LL);
        }
        return this.LL.compareTo(obj);
    }

    public C0T5H(Comparable<Object> comparable, Runnable runnable) {
        this.LL = comparable;
        this.LLILLJJLI = runnable;
    }
}
