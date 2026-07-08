package X;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import j0b.c;

/* JADX INFO: renamed from: X.04Iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1076204Iu extends AbstractC1076404Iw {
    public static final SparseIntArray LLJLIL;
    public long LLJL;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        int iLIZ;
        int iLJLLL;
        int iLLJILJILJ;
        int iLJJL;
        synchronized (this) {
            try {
                j = this.LLJL;
                this.LLJL = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c cVar = this.LLJJL;
        long j2 = j & 3;
        if (j2 != 0) {
            if (cVar != null) {
                iLIZ = cVar.LIZ();
                iLJLLL = cVar.LJLLL();
                iLJJL = cVar.LJJL();
                iLLJILJILJ = cVar.LLJILJILJ();
            } else {
                iLIZ = 0;
                iLJLLL = 0;
                iLLJILJILJ = 0;
                iLJJL = 0;
                if (j2 == 0) {
                    return;
                }
            }
            C1076504Ix.LIZ(iLLJILJILJ, iLJLLL, this.LLJJJIL);
            C1076304Iv.LIZ(this.LLJJJJLIIL, Integer.valueOf(iLJJL), null, null);
            C1076504Ix.LIZ(iLIZ, 0, this.LLJJJJLIIL);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJI() {
        synchronized (this) {
            try {
                return this.LLJL != 0;
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
                this.LLJL = 2L;
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
        LLJLIL = sparseIntArray;
        sparseIntArray.put(R.id.fmu, 4);
    }

    @Override // X.AbstractC1076404Iw
    public final void LJIILLIIL(c cVar) {
        this.LLJJL = cVar;
        synchronized (this) {
            try {
                this.LLJL |= 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        notifyPropertyChanged(2);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1076204Iu(C03GW c03gw, View[] viewArr) {
        Object[] objArrLJIIJ = ViewDataBinding.LJIIJ(c03gw, viewArr, 5, LLJLIL);
        super(c03gw, viewArr[0], (TuxTextView) objArrLJIIJ[3], (ConstraintLayout) objArrLJIIJ[2], (TuxIconView) objArrLJIIJ[0], (TuxTextView) objArrLJIIJ[1]);
        this.LLJL = -1L;
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
