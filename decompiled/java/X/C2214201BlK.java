package X;

import android.app.Activity;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1BlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC1294060jmO
public final class C2214201BlK {
    public static final C11RK<C0X4A> LIZ = new C11RK<>();
    public static final C11RK<C0X4A> LIZIZ = new C11RK<>();
    public static final C11RK<Activity> LIZJ = new C11RK<>();
    public static final C11RK<Activity> LIZLLL = new C11RK<>();
    public static final C11RK<Activity> LJ = new C11RK<>();
    public static final C11RK<Activity> LJFF = new C11RK<>();
    public static final C11RK<Activity> LJI = new C11RK<>();
    public static final C11RK<C0X4A> LJII = new C11RK<>();
    public static final C11RK<Boolean> LJIIIIZZ = new C11RK<>();
    public static final C11RK<Application> LJIIIZ = new C11RK<>();
    public static final C11RK<C1567000qsc> LJIIJ = new C11RK<>();
    public static volatile boolean LJIIJJI = true;
    public static volatile boolean LJIIL;
    public static int LJIILIIL;
    public static volatile long LJIILJJIL;
    public static volatile long LJIILL;
    public static volatile long LJIILLIIL;
    public static int LJIIZILJ;
    public static InterfaceC2206171BWd LJIJ;
    public static WeakReference<Activity> LJIJI;

    public static C19500811Re LIZ() {
        return LJI.LJJLIIJ();
    }

    public static C19500811Re LIZIZ() {
        return LIZLLL.LJJLIIJ();
    }

    public static C19500811Re LIZJ() {
        return LJFF.LJJLIIJ();
    }

    public static C19500811Re LIZLLL() {
        return LJIIIIZZ.LJJLIIJ();
    }

    public static C19500811Re LJ() {
        return LJIIIZ.LJJLIIJ();
    }

    public static Activity LJFF() {
        WeakReference<Activity> weakReference = LJIJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(Activity activity) {
        AbstractC1387200mCc abstractC1387200mCc;
        if (activity == 0) {
            LJIJI = null;
            C2180271AUn.LIZIZ.getClass();
            ((C2214241BlO) C1807670x8n.LJJIJ()).LIZ = null;
            return;
        }
        LJIJI = new WeakReference<>(activity);
        if (!C294780Bgy.LIZ() ? !(!(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF()) : (activity instanceof InterfaceC214897198d)) {
            if (((InterfaceC214897198d) activity).getUseRootFragmentForPageCallbacks()) {
                return;
            }
        }
        C1397950mTx c1397950mTx = new C1397950mTx(activity);
        C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
        C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
        C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
        if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
            synchronized (c830530Wi3) {
                try {
                    C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                    if (c520050KaR3 == null || (abstractC1387200mCc = c520050KaR3.get()) == null) {
                        c830530Wi3.put(c520050KaR, c520050KaR);
                        abstractC1387200mCc = c1397950mTx;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C2180271AUn.LIZIZ.getClass();
        ((C2214241BlO) C1807670x8n.LJJIJ()).LIZ = new WeakReference<>(abstractC1387200mCc);
    }
}
