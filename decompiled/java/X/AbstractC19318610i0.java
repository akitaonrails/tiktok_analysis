package X;

import X.AbstractC19293010ds;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19318610i0<T extends AbstractC19293010ds> implements InterfaceC19318710i1 {
    public T LL;
    public C20600815jK<InterfaceC1891350zJl> LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(672));

    public abstract T LIZLLL();

    public void LJFF(boolean z) {
    }

    @Override // X.InterfaceC19318710i1
    public void onViewDetachedFromWindow() {
    }

    public final T LIZIZ() {
        T t = this.LL;
        if (t != null) {
            return t;
        }
        return null;
    }

    public T LIZJ() {
        this.LL = (T) LIZLLL();
        LIZIZ().LLILZ = this;
        return (T) LIZIZ();
    }

    public final void LJI(Function1<? super T, ? extends T> function1) {
        ReentrantLock reentrantLock = (ReentrantLock) this.LLILLL.getValue();
        reentrantLock.lock();
        try {
            C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLILLJJLI;
            C20600815jK<InterfaceC1891350zJl> c20600815jK2 = null;
            if (c20600815jK == null) {
                c20600815jK = null;
            }
            int iLJIIIZ = c20600815jK.LJIIIZ(LIZIZ());
            if (iLJIIIZ == -1) {
                reentrantLock.unlock();
                return;
            }
            String str = LIZIZ().LLILLL;
            this.LL = function1.invoke(LIZIZ());
            LIZIZ().LLILLL = str;
            this.LL = (T) LIZIZ();
            LIZIZ().LLILZ = this;
            C20600815jK<InterfaceC1891350zJl> c20600815jK3 = this.LLILLJJLI;
            if (c20600815jK3 != null) {
                c20600815jK2 = c20600815jK3;
            }
            c20600815jK2.LJIILJJIL(iLJIIIZ, LIZIZ());
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
