package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20515015Pg {
    public final C20516415Pu LIZ = new C20516415Pu(0);
    public final Context LIZIZ;
    public final ViewGroup LIZJ;
    public C20514815Pe LIZLLL;

    public final C20514815Pe LIZ() {
        Context context = this.LIZIZ;
        ViewGroup viewGroup = this.LIZJ;
        if (context == null) {
            "context must not be null".toString();
            throw new IllegalStateException("context must not be null");
        }
        if (viewGroup == null) {
            "parent must not be null".toString();
            throw new IllegalStateException("parent must not be null");
        }
        C20514815Pe c20514815Pe = new C20514815Pe(viewGroup, this.LIZ, context);
        this.LIZLLL = c20514815Pe;
        try {
            c20514815Pe.measure(0, 0);
            c20514815Pe.LJIL();
            C20516315Pt c20516315Pt = c20514815Pe.LLJL;
            float f = c20516315Pt.LLJILLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20516315Pt);
            c20516315Pt.setTranslationY(f);
            c20514815Pe.LLJL.LIZ(true);
            if (c20514815Pe.LLJJLIIIJLLLLLLLZ.LIZJ) {
                C786410Ut5.LJLIIL(c20514815Pe.LLJJLIIIJLLLLLLLZ.LIZIZ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS131S0100000_31(c20514815Pe, 149));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this.LIZLLL;
    }

    public C20515015Pg(ViewGroup viewGroup) {
        this.LIZJ = viewGroup;
        this.LIZIZ = viewGroup.getContext();
    }
}
