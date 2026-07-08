package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.128t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197077128t {
    public final C128X LIZ;
    public final Map<String, AutoCloseable> LIZIZ;
    public final Set<AutoCloseable> LIZJ;
    public volatile boolean LIZLLL;

    public C197077128t() {
        this.LIZ = new C128X();
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashSet();
    }

    public C197077128t(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = new C128X();
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashSet();
        LIZ("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new C197058128a(interfaceC497601wk.getCoroutineContext()));
    }

    public static void LIZIZ(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
    }

    public C197077128t(AutoCloseable... autoCloseableArr) {
        this.LIZ = new C128X();
        this.LIZIZ = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZJ = linkedHashSet;
        C19719612Di.LJJII(linkedHashSet, autoCloseableArr);
    }

    public C197077128t(InterfaceC497601wk interfaceC497601wk, AutoCloseable... autoCloseableArr) {
        this.LIZ = new C128X();
        this.LIZIZ = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZJ = linkedHashSet;
        LIZ("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new C197058128a(interfaceC497601wk.getCoroutineContext()));
        C19719612Di.LJJII(linkedHashSet, autoCloseableArr);
    }

    public final void LIZ(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseablePut;
        if (this.LIZLLL) {
            LIZIZ(autoCloseable);
            return;
        }
        synchronized (this.LIZ) {
            try {
                autoCloseablePut = this.LIZIZ.put(str, autoCloseable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZIZ(autoCloseablePut);
    }
}
