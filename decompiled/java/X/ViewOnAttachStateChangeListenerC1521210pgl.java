package X;

import android.view.View;
import com.lynx.tasm.LynxViewClient;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ViewOnAttachStateChangeListenerC1521210pgl extends AbstractC1514820pWS<C1521150pgf> implements InterfaceC1522060pi8, View.OnAttachStateChangeListener {
    public C1521530phH LLJILLL;
    public WeakReference<LynxViewClient> LLJJ;
    public String LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public final EnumC1520910pgH LLJJIJIIJIL;

    public final C1521410ph5 LJII() {
        return (C1521410ph5) this.LLJJIII.getValue();
    }

    public final boolean LJIIIIZZ() {
        return EnumC1521240pgo.monitor.isEnabled() && EnumC1521240pgo.lynxMonitor.isEnabled() && this.LLJILLL.LIZIZ;
    }

    @Override // X.AbstractC1514820pWS
    public final EnumC1520910pgH LIZJ() {
        return this.LLJJIJIIJIL;
    }

    public ViewOnAttachStateChangeListenerC1521210pgl(View view) {
        super(view);
        this.LLJILLL = new C1521530phH("__hybrid_default");
        this.LLJJIII = C452501pT.LIZIZ(new AwS567S0100000_23(this, 227));
        this.LLJJIJIIJIL = EnumC1520910pgH.LYNX;
    }

    @Override // X.InterfaceC1522060pi8
    public void onEventPost(C1520560pfi c1520560pfi) {
        C1521150pgf c1521150pgf;
        if (LJIIIIZZ() && (c1521150pgf = (C1521150pgf) this.LLJIJIL) != null) {
            c1521150pgf.onEventPost(c1520560pfi);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!LJIIIIZZ()) {
            return;
        }
        LJII().LJIIIIZZ = System.currentTimeMillis();
        if (!this.LLJJIJI) {
            this.LLJJIJI = true;
            LIZIZ().LIZIZ(EnumC1521260pgq.LYNX_ON_VIEW_ATTACHED_TO_WINDOW, null);
        }
        LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_ATTACHED_TO_WINDOW.getKey(), Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!LJIIIIZZ()) {
            return;
        }
        LJII().LJIIIZ = System.currentTimeMillis();
        C1521150pgf c1521150pgf = (C1521150pgf) this.LLJIJIL;
        if (c1521150pgf != null) {
            c1521150pgf.LJIIZILJ();
        }
        LIZIZ().LIZIZ(EnumC1521260pgq.LYNX_ON_VIEW_DETACHED_FROM_WINDOW, null);
    }
}
