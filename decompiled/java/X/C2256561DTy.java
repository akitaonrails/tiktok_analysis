package X;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256561DTy extends C1DU5 {
    public static final SparseIntArray LLJJLIIIJLLLLLLLZ;
    public long LLJJL;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        synchronized (this) {
            try {
                this.LLJJL = 0L;
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
                return this.LLJJL != 0;
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
                this.LLJJL = 1L;
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

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLJJLIIIJLLLLLLLZ = sparseIntArray;
        sparseIntArray.put(R.id.jij, 4);
        sparseIntArray.put(R.id.jxe, 5);
        sparseIntArray.put(R.id.user_right_sheet_title, 6);
        sparseIntArray.put(R.id.fmu, 7);
        sparseIntArray.put(R.id.sil, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2256561DTy(C03GW c03gw, View[] viewArr) {
        Object[] objArrLJIIJ = ViewDataBinding.LJIIJ(c03gw, viewArr, 9, LLJJLIIIJLLLLLLLZ);
        super(c03gw, viewArr[0], (ConstraintLayout) objArrLJIIJ[2], (LinearLayout) objArrLJIIJ[3], (TuxIconView) objArrLJIIJ[0], (ConstraintLayout) objArrLJIIJ[1]);
        this.LLJJL = -1L;
        this.LLJJJIL.setTag(null);
        this.LLJJJJ.setTag(null);
        this.LLJJJJJIL.setTag(null);
        this.LLJJJJLIIL.setTag(null);
        for (View view : viewArr) {
            view.setTag(R.id.ffn, this);
        }
        LJII();
    }
}
