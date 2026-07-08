package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.09mW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2472609mW implements Closeable {
    public final Object LL = new Object();
    public final List<C2472809mY> LLILLJJLI = new ArrayList();
    public boolean LLILLL;
    public boolean LLILZ;

    public final C2472709mX LIZ() {
        C2472709mX c2472709mX;
        synchronized (this.LL) {
            try {
                LIZLLL();
                c2472709mX = new C2472709mX(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2472709mX;
    }

    public final boolean LIZIZ() {
        boolean z;
        synchronized (this.LL) {
            try {
                LIZLLL();
                z = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LIZLLL() {
        if (this.LLILZ) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public final void cancel() {
        synchronized (this.LL) {
            try {
                LIZLLL();
                if (this.LLILLL) {
                    return;
                }
                this.LLILLL = true;
                Iterator it2 = new ArrayList(this.LLILLJJLI).iterator();
                while (it2.hasNext()) {
                    it2.next();
                    C2472809mY.LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LL) {
            try {
                if (this.LLILZ) {
                    return;
                }
                Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
                while (it2.hasNext()) {
                    ((C2472809mY) it2.next()).close();
                }
                ((ArrayList) this.LLILLJJLI).clear();
                this.LLILZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final String toString() {
        return C786410Ut5.k4(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{C2472609mW.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(LIZIZ())});
    }

    public C2472609mW() {
        C2206308kf c2206308kf = C2206308kf.LIZJ;
        C823050WQl.LJ();
    }

    public final void LJFF(C2472809mY c2472809mY) {
        synchronized (this.LL) {
            try {
                LIZLLL();
                ((ArrayList) this.LLILLJJLI).remove(c2472809mY);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
