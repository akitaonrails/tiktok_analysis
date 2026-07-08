package X;

import com.bytedance.lynx.hybrid.i18n.storage.I18nResBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546870qM9 {
    public final File LIZ;
    public final Function1<Throwable, Unit> LIZIZ;
    public final C20143313rj LIZJ;
    public final C1546970qMJ LIZLLL;
    public final C1546970qMJ LJ;

    public C1546870qM9() {
        throw null;
    }

    public C1546870qM9(File file) {
        this.LIZ = file;
        this.LIZIZ = null;
        this.LIZJ = new C20143313rj();
        this.LIZLLL = new C1546970qMJ(EnumC1546920qME.LastAccess);
        this.LJ = new C1546970qMJ(EnumC1546920qME.GeckoChannel);
    }

    public final C0VSJ LIZ(String str) {
        File file = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".json");
        return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final I18nResBundle LIZIZ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        Function1<Throwable, Unit> function1;
        Function1<Throwable, Unit> function12;
        try {
            C20143313rj c20143313rj = this.LIZJ;
            C1546980qMK c1546980qMK = new C1546980qMK(this, str);
            Lock lock = c20143313rj.LIZ(str).readLock();
            lock.lock();
            try {
                Object objInvoke = c1546980qMK.invoke();
                lock.unlock();
                c20143313rj.LIZIZ(str);
                c098200Yq = (String) objInvoke;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                c20143313rj.LIZIZ(str);
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && (function12 = this.LIZIZ) != null) {
            function12.invoke(thM5exceptionOrNullimpl);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null) {
            return null;
        }
        try {
            c098200Yq2 = (I18nResBundle) C1058250de3.LIZ(str2, I18nResBundle.class);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null && (function1 = this.LIZIZ) != null) {
            function1.invoke(thM5exceptionOrNullimpl2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        return (I18nResBundle) obj;
    }

    public final void LIZJ(String str, I18nResBundle i18nResBundle) {
        Object c098200Yq;
        Function1<Throwable, Unit> function1;
        try {
            String strLIZLLL = C1058250de3.LIZLLL(I18nResBundle.LIZ(i18nResBundle, null, null, null, null, System.currentTimeMillis(), 127));
            if (strLIZLLL == null) {
                return;
            }
            c098200Yq = (Unit) this.LIZJ.LIZJ(str, new C1546880qMA(this, str, i18nResBundle, strLIZLLL));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && (function1 = this.LIZIZ) != null) {
            function1.invoke(thM5exceptionOrNullimpl);
        }
        C189200o6.m7isFailureimpl(c098200Yq);
    }
}
