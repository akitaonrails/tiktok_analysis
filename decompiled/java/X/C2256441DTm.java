package X;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256441DTm extends AbstractC1824980xai {
    public final View LLJJJJ;
    public long LLJJJJJIL;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        synchronized (this) {
            try {
                this.LLJJJJJIL = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJI() {
        synchronized (this) {
            try {
                return this.LLJJJJJIL != 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJII() {
        synchronized (this) {
            try {
                this.LLJJJJJIL = 1L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIILIIL();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2256441DTm(C03GW c03gw, View[] viewArr) {
        Object[] objArrLJIIJ = ViewDataBinding.LJIIJ(c03gw, viewArr, 2, null);
        super(c03gw, viewArr[0], (TuxTextView) objArrLJIIJ[1]);
        this.LLJJJJJIL = -1L;
        View view = (View) objArrLJIIJ[0];
        this.LLJJJJ = view;
        view.setTag(null);
        this.LLJJJIL.setTag(null);
        for (View view2 : viewArr) {
            view2.setTag(R.id.ffn, this);
        }
        LJII();
    }
}
