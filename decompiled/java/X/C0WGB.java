package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0WGB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WGB extends C0WGC {
    public final AtomicReference<Bundle> LL = new AtomicReference<>();
    public boolean LLILLJJLI;

    @Override // X.InterfaceC19804212e8
    public final void LJJ(Bundle bundle) {
        synchronized (this.LL) {
            try {
                try {
                    this.LL.set(bundle);
                    this.LLILLJJLI = true;
                    this.LL.notify();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LL.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final Bundle LLILLIZIL(long j) {
        Bundle bundle;
        synchronized (this.LL) {
            try {
                if (!this.LLILLJJLI) {
                    try {
                        this.LL.wait(j);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
                bundle = this.LL.get();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return bundle;
    }

    public final String LLLLII(long j) {
        return (String) LLLIIL(LLILLIZIL(j), String.class);
    }

    public static <T> T LLLIIL(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle != null) {
            try {
                obj = bundle.get("r");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null) {
                try {
                    return cls.cast(obj);
                } catch (ClassCastException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw e3;
                }
            }
        }
        return null;
    }
}
