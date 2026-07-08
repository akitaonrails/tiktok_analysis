package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0QFO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFO {
    public static final void LIZ(String str) {
        Object obj;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLJFF = C2211621BhA.LJFF(str);
        if (c2211641BhCLJFF != null) {
            C0QFT c0qft = new C0QFT(c2211641BhCLJFF);
            C0QFM.LIZ.getClass();
            ReentrantLock reentrantLock = C0QFM.LIZIZ;
            reentrantLock.lock();
            try {
                if (C0QFM.LIZ(c0qft) == null) {
                    c0qft.getPageInfo();
                    C0QFQ c0qfq = new C0QFQ();
                    ((Map) C0QFM.LIZJ.getValue()).put(C0QFM.LIZIZ(c0qft), c0qfq);
                    WeakReference<?> host = c0qft.getHost();
                    if (host != null && (obj = host.get()) != null) {
                        if (obj instanceof C19EG) {
                            interfaceC665370Q7zLIZIZ = C1558360qeg.LJI((C19EG) obj, null);
                        } else if (obj instanceof Fragment) {
                            interfaceC665370Q7zLIZIZ = C1558360qeg.LJFF((Fragment) obj, null);
                        } else if (obj instanceof InterfaceC713360RyY) {
                            interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ((InterfaceC713360RyY) obj);
                        }
                        if (interfaceC665370Q7zLIZIZ != null) {
                            C1554960qZC.LIZ(interfaceC665370Q7zLIZIZ, c0qfq, C0QFQ.class, "source_default_key");
                        }
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public static final String LIZIZ(String str) {
        try {
            String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6).toArray(new String[0]);
            if (strArr.length > 1) {
                return strArr[1];
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
