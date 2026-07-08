package X;

import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VH7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VH7 implements Runnable {
    public final C0VI1 LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    static {
        C0VI8.LIZIZ("StopWorkRunnable");
    }

    public final void LIZ() {
        boolean zContainsKey;
        boolean zLJIIJ;
        C0VI1 c0vi1 = this.LL;
        WorkDatabase workDatabase = c0vi1.LIZJ;
        C0VH8 c0vh8 = c0vi1.LJFF;
        InterfaceC794970VGl interfaceC794970VGlLJIIIIZZ = workDatabase.LJIIIIZZ();
        workDatabase.beginTransaction();
        try {
            String str = this.LLILLJJLI;
            synchronized (c0vh8.LLJIJIL) {
                try {
                    zContainsKey = ((HashMap) c0vh8.LLILZLL).containsKey(str);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (this.LLILLL) {
                zLJIIJ = this.LL.LJFF.LJIIIZ(this.LLILLJJLI);
            } else {
                if (!zContainsKey) {
                    C0VIH c0vih = (C0VIH) interfaceC794970VGlLJIIIIZZ;
                    if (c0vih.LJFF(this.LLILLJJLI) == C0VIP.RUNNING) {
                        c0vih.LJIILLIIL(C0VIP.ENQUEUED, this.LLILLJJLI);
                    }
                }
                zLJIIJ = this.LL.LJFF.LJIIJ(this.LLILLJJLI);
            }
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.LLILLJJLI, Boolean.valueOf(zLJIIJ)});
            c0vi8LIZ.getClass();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C0VH7(C0VI1 c0vi1, String str, boolean z) {
        this.LL = c0vi1;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }
}
