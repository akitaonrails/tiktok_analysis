package X;

import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L2M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0L2M {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS108S0100000_8 LIZIZ = new ARunnableS108S0100000_8(this, 141);
    public final Set<Object> LIZJ = new HashSet();
    public volatile boolean LIZLLL;
    public Integer LJ;

    public static Activity LJFF() {
        Object c098200Yq;
        AbstractC1387200mCc abstractC1387200mCc;
        try {
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            int length = abstractC1387200mCcArrLJII.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    abstractC1387200mCc = null;
                    break;
                }
                abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
                C1397950mTx c1397950mTx = abstractC1387200mCc instanceof C1397950mTx ? (C1397950mTx) abstractC1387200mCc : null;
                if ((c1397950mTx != null ? c1397950mTx.LIZLLL : null) instanceof InterfaceC1603190roz) {
                    break;
                }
                i++;
            }
            C1397950mTx c1397950mTx2 = abstractC1387200mCc instanceof C1397950mTx ? (C1397950mTx) abstractC1387200mCc : null;
            c098200Yq = c1397950mTx2 != null ? c1397950mTx2.LIZLLL : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Activity) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final synchronized void LIZIZ() {
        if (!((HashSet) this.LIZJ).isEmpty() || this.LIZLLL) {
            Activity activityLJFF = LJFF();
            Integer numValueOf = activityLJFF != null ? Integer.valueOf(System.identityHashCode(activityLJFF)) : null;
            Integer num = this.LJ;
            this.LJ = numValueOf;
            if (num == null || numValueOf == null || Intrinsics.LJFF(num, numValueOf)) {
                return;
            }
            ((HashSet) this.LIZJ).clear();
            LIZJ();
        }
    }

    public final synchronized void LIZJ() {
        if (this.LIZLLL) {
            this.LIZ.removeCallbacks(this.LIZIZ);
            LJIIIZ(false);
            this.LIZLLL = false;
        }
    }

    public abstract void LJ();

    public abstract boolean LJI();

    public abstract long LJII();

    public final synchronized void LJIIIIZZ() {
        if (this.LIZLLL || ((HashSet) this.LIZJ).isEmpty()) {
            return;
        }
        if (LJI()) {
            return;
        }
        LJIIIZ(true);
        this.LIZLLL = true;
        long jLJII = LJII();
        if (jLJII > 0) {
            this.LIZ.removeCallbacks(this.LIZIZ);
            C786410Ut5.LJLIIL(jLJII, this.LIZ, this.LIZIZ);
        }
    }

    public abstract void LJIIIZ(boolean z);

    public final synchronized void LIZ(Object obj) {
        if (!((HashSet) this.LIZJ).add(obj)) {
            return;
        }
        LJIIIIZZ();
    }

    public final synchronized void LIZLLL(Object obj) {
        if (!((HashSet) this.LIZJ).remove(obj)) {
            return;
        }
        if (((HashSet) this.LIZJ).isEmpty()) {
            LIZJ();
        }
    }
}
