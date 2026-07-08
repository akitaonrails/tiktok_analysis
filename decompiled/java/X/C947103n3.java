package X;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C947103n3 extends AbstractC947203n4 implements InterfaceC947003n2 {
    public static final C1DTZ LLJLIL;
    public final ViewOnClickListenerC946903n1 LLJJLIIIJLLLLLLLZ;
    public long LLJL;

    @Override // androidx.databinding.ViewDataBinding
    public final void LIZLLL() {
        long j;
        C946403mw c946403mw;
        String str;
        synchronized (this) {
            try {
                j = this.LLJL;
                this.LLJL = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C945403mm c945403mm = this.LLJJL;
        C947303n5 c947303n5 = this.LLJJJJLIIL;
        long j2 = 10 & j;
        long j3 = 12 & j;
        if (j3 == 0 || c947303n5 == null) {
            c946403mw = null;
            str = null;
        } else {
            c946403mw = c947303n5.LIZIZ;
            str = c947303n5.LIZ;
        }
        if (j2 != 0) {
            this.LLJJJIL.LJIILLIIL(c945403mm);
        }
        if ((j & 8) != 0) {
            C786410Ut5.a9(this.LLJJJJ, this.LLJJLIIIJLLLLLLLZ);
        }
        if (j3 != 0) {
            C946503mx.LIZIZ(this.LLJJJJ, c946403mw);
            C946603my.LIZ(this.LLJJJJJIL, str);
        }
        this.LLJJJIL.LJ();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJI() {
        synchronized (this) {
            try {
                if (this.LLJL != 0) {
                    return true;
                }
                return this.LLJJJIL.LJI();
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
                this.LLJL = 8L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJJJIL.LJII();
        LJIILIIL();
    }

    static {
        C1DTZ c1dtz = new C1DTZ(4);
        LLJLIL = c1dtz;
        c1dtz.LIZ(new int[]{3}, new int[]{R.layout.an9}, new String[]{"commerce_input_form"});
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        super.LJIILJJIL(lifecycleOwner);
        this.LLJJJIL.LJIILJJIL(lifecycleOwner);
    }

    @Override // X.AbstractC947203n4
    public final void LJIILLIIL(C945403mm c945403mm) {
        this.LLJJL = c945403mm;
        synchronized (this) {
            try {
                this.LLJL |= 2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        notifyPropertyChanged(1);
        LJIILIIL();
    }

    @Override // X.AbstractC947203n4
    public final void LJIIZILJ(C947303n5 c947303n5) {
        this.LLJJJJLIIL = c947303n5;
        synchronized (this) {
            try {
                this.LLJL |= 4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        notifyPropertyChanged(3);
        LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C947103n3(View view, C03GW c03gw) {
        Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 4, LLJLIL, null);
        super(c03gw, view, (AbstractC946303mv) objArrLJIIIZ[3], (TuxIconView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[1]);
        this.LLJL = -1L;
        AbstractC946303mv abstractC946303mv = this.LLJJJIL;
        if (abstractC946303mv != null) {
            abstractC946303mv.LLJIJIL = this;
        }
        ((View) objArrLJIIIZ[0]).setTag(null);
        this.LLJJJJ.setTag(null);
        this.LLJJJJJIL.setTag(null);
        view.setTag(R.id.ffn, this);
        this.LLJJLIIIJLLLLLLLZ = new ViewOnClickListenerC946903n1(this, 1);
        LJII();
    }

    @Override // X.InterfaceC947003n2
    public final void LIZ(int i, View view) {
        C945403mm c945403mm = this.LLJJL;
        if (c945403mm != null) {
            c945403mm.getClass();
            c945403mm.LJFF(C944903mh.LIZ);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        if (i != 0 || i2 != 0) {
            return false;
        }
        synchronized (this) {
            try {
                this.LLJL |= 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }
}
