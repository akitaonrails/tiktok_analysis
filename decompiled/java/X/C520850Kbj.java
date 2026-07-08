package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520850Kbj extends AbstractC471570IeR {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LJII() {
        RecyclerView.LayoutManager layoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    public final void LJIIIIZZ() {
        Unit unit;
        AbstractC21673619ry adapter;
        if (this.LIZJ && this.LIZIZ) {
            try {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
                if (viewOnAttachStateChangeListenerC20604515jv == null || (adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter()) == null) {
                    unit = null;
                } else {
                    adapter.unregisterAdapterDataObserver(this);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LIZIZ = false;
        }
    }

    @Override // X.AbstractC471570IeR
    public final void LIZ() {
        LJII();
        LJIIIIZZ();
    }

    public C520850Kbj(C18Z9 c18z9) {
        this.LIZ = c18z9;
    }

    @Override // X.AbstractC471570IeR
    public final void LIZIZ(int i, int i2) {
        if (i == 0 && i2 > 0) {
            LJII();
            LJIIIIZZ();
        }
    }

    @Override // X.AbstractC471570IeR
    public final void LIZLLL(int i, int i2) {
        if (i == 0 && i2 > 0) {
            LJII();
            LJIIIIZZ();
        }
    }

    @Override // X.AbstractC471570IeR
    public final void LIZJ(int i, int i2, Object obj) {
        LIZIZ(i, i2);
        if (i == 0 && i2 > 0) {
            LJII();
            LJIIIIZZ();
        }
    }
}
