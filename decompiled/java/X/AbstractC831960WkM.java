package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0WkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831960WkM {
    public static final Set<AbstractC831960WkM> LIZ = Collections.newSetFromMap(new WeakHashMap());

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean LJIIJJI();

    public abstract void LJIILJJIL(C832070WkX c832070WkX);

    public static Set<AbstractC831960WkM> LJII() {
        Set<AbstractC831960WkM> set = LIZ;
        synchronized (set) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return set;
    }

    public Context LJIIIZ() {
        throw new UnsupportedOperationException();
    }

    public Looper LJIIJ() {
        throw new UnsupportedOperationException();
    }

    public void LJIILIIL() {
        throw new UnsupportedOperationException();
    }

    public <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LJI(T t) {
        throw new UnsupportedOperationException();
    }

    public InterfaceC831160Wj4 LJIIIIZZ(C832160Wkg c832160Wkg) {
        throw new UnsupportedOperationException();
    }

    public boolean LJIIL(InterfaceC832980Wm0 interfaceC832980Wm0) {
        throw new UnsupportedOperationException();
    }
}
