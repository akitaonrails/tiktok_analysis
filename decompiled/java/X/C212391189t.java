package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.189t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212391189t {
    public static final C212391189t LIZ = new C212391189t();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C212395189x());
    public static final CopyOnWriteArrayList<InterfaceC212397189z> LIZJ = new CopyOnWriteArrayList<>();
    public static final String LIZLLL;

    static {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        LIZLLL = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
    }

    public static String LIZ(String str, String str2) {
        boolean z;
        String str3 = null;
        if (str == null) {
            return null;
        }
        if (!C770702zh.LIZIZ(str2)) {
            str2 = LIZLLL;
        }
        C212392189u c212392189u = ((C18A0) LIZIZ.getValue()).get(str);
        if (c212392189u == null) {
            return null;
        }
        C212394189w c212394189w = c212392189u.LIZ().get(str2);
        if (c212394189w == null) {
            if (!c212392189u.LIZJ) {
                return null;
            }
            c212394189w = new C212394189w(C1257480ipO.LIZ.getString(c212392189u.LIZIZ(str2), ""), System.currentTimeMillis());
            c212392189u.LIZ().put(str2, c212394189w);
        }
        if (c212394189w.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (c212392189u.LIZLLL > 0 && System.currentTimeMillis() - c212394189w.LIZIZ > c212392189u.LIZLLL) {
            try {
                c212392189u.LIZ().remove(str2);
                return null;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        if (c212392189u.LJ) {
            try {
                str3 = c212392189u.LIZ().remove(str2).LIZ;
                return str3;
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return str3;
            }
        }
        return c212394189w.LIZ;
    }

    public static void LIZIZ(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        if (!C770702zh.LIZIZ(str2)) {
            str2 = LIZLLL;
        }
        Iterator<InterfaceC212397189z> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C212392189u c212392189u = ((C18A0) LIZIZ.getValue()).get(str);
        if (str3 == null) {
            if (c212392189u != null) {
                c212392189u.LIZ().remove(str2);
                if (c212392189u.LIZJ) {
                    C1257480ipO.LIZ.erase(c212392189u.LIZIZ(str2));
                    return;
                }
                return;
            }
            return;
        }
        if (c212392189u != null) {
            c212392189u.LIZ().put(str2, new C212394189w(str3, System.currentTimeMillis()));
            if (c212392189u.LIZJ) {
                C1257480ipO.LIZ.storeString(c212392189u.LIZIZ(str2), str3);
            }
        }
    }
}
