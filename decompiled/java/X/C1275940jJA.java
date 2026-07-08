package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Stack;

/* JADX INFO: renamed from: X.0jJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275940jJA<T> {
    public final int LL;
    public final InterfaceC1275950jJB LLILLL;
    public final InterfaceC1275740jIq<T> LLILZ;
    public int LLILZLL;
    public final boolean LLILLJJLI = true;
    public final Stack<T> LLILZIL = new Stack<>();

    public final T LIZ() {
        T tLIZIZ = null;
        boolean zLIZIZ = true;
        while (zLIZIZ) {
            if (this.LLILLJJLI) {
                synchronized (this) {
                    try {
                        tLIZIZ = LIZIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                tLIZIZ = LIZIZ();
            }
            if (tLIZIZ != null) {
                break;
            }
            zLIZIZ = this.LLILLL.LIZIZ();
        }
        return tLIZIZ;
    }

    public final T LIZIZ() {
        if (this.LLILZIL.size() > 0) {
            return this.LLILZIL.pop();
        }
        int i = this.LLILZLL;
        if (i >= this.LL) {
            return null;
        }
        this.LLILZLL = i + 1;
        return this.LLILZ.LIZ(this);
    }

    public final void LIZJ(T t) {
        if (t == null) {
            return;
        }
        if (this.LLILLJJLI) {
            synchronized (this) {
                try {
                    this.LLILZIL.add(t);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            this.LLILZIL.add(t);
        }
        this.LLILLL.LIZ();
    }

    public C1275940jJA(int i, InterfaceC1275950jJB interfaceC1275950jJB, InterfaceC1275740jIq interfaceC1275740jIq) {
        this.LL = i;
        this.LLILLL = interfaceC1275950jJB;
        this.LLILZ = interfaceC1275740jIq;
    }
}
