package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.103l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC191843103l {
    public WeakReference<InterfaceC191845103n> LL;

    public abstract List<AbstractC191840103i> LJ(Context context);

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ() {
    }

    public void LJIIJ() {
    }

    public final void LJIIL() {
        InterfaceC191845103n interfaceC191845103n;
        WeakReference<InterfaceC191845103n> weakReference = this.LL;
        if (weakReference == null || (interfaceC191845103n = weakReference.get()) == null) {
            return;
        }
        interfaceC191845103n.LLJI();
    }

    public void LIZLLL(InterfaceC191845103n interfaceC191845103n) {
        this.LL = new WeakReference<>(interfaceC191845103n);
    }

    public final void LJIIJJI(C10AP c10ap) {
        InterfaceC191845103n interfaceC191845103n;
        WeakReference<InterfaceC191845103n> weakReference = this.LL;
        if (weakReference != null && (interfaceC191845103n = weakReference.get()) != null) {
            interfaceC191845103n.LJJZZIII(c10ap);
        }
    }

    public final CharSequence LJI(C103N c103n, Context context) {
        if (c103n instanceof C191844103m) {
            C191844103m c191844103m = (C191844103m) c103n;
            c191844103m.getClass();
            try {
                return c191844103m.LIZLLL.invoke(this, context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return c191844103m.LIZ(context);
            }
        }
        return c103n.LIZ(context);
    }
}
