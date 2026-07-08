package X;

import com.bytedance.apm.config.SlardarConfigManagerImpl;

/* JADX INFO: renamed from: X.0V5V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V5V implements Runnable {
    public static boolean LLILLJJLI;
    public final Object LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TTBootPerfSlardarOptLancet$FetchConfigLancetRunnable@54cf.run");
        try {
            LLILLJJLI = true;
            ((SlardarConfigManagerImpl) this.LL).fetchConfig();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTBootPerfSlardarOptLancet$FetchConfigLancetRunnable@54cf.run");
    }

    public C0V5V(Object obj) {
        this.LL = obj;
    }
}
