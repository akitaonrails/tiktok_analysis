package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;

/* JADX INFO: renamed from: X.16HL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HL implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(C16HL c16hl) {
        C157F c157f = (C157F) c16hl.l0;
        if (!c157f.LLILZIL) {
            return true;
        }
        c157f.LLJILJIL.removeCallbacks(c157f.LLJILJILJ);
        C157F c157f2 = (C157F) c16hl.l0;
        int i = c157f2.LLJ + 1;
        c157f2.LLJ = i;
        if (i > 60) {
            C786410Ut5.LJJZZIII(c157f2.LLJILJIL, c157f2.LLJILJILJ);
            return true;
        }
        C786410Ut5.LJLIIL(40L, c157f2.LLJILJIL, c157f2.LLJILJILJ);
        return true;
    }

    public static final boolean onPreDraw$1(C16HL c16hl) {
        ExploreLCPTracker.INSTANCE.recordStage$explore_release(0L, C15V4.PAGE_APPEAR);
        ViewTreeObserver viewTreeObserver = ((View) c16hl.l0).getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c16hl);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16hl, ViewTreeObserver.OnPreDrawListener.class);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$2(C16HL c16hl) {
        ViewTreeObserver viewTreeObserver;
        View view = ((C20496615Ie) c16hl.l0).mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(c16hl);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16hl, ViewTreeObserver.OnPreDrawListener.class);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$3(C16HL c16hl) {
        C786410Ut5.D3(((C20734216Bo) c16hl.l0).getViewTreeObserver(), c16hl);
        C20734216Bo c20734216Bo = (C20734216Bo) c16hl.l0;
        if (!c20734216Bo.LLILZIL) {
            c20734216Bo.LLILZIL = true;
            c20734216Bo.setScrollX(c20734216Bo.LLJJ * C20734216Bo.LLJJIJIL);
            return false;
        }
        return false;
    }

    public C16HL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
