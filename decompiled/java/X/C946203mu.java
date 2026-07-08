package X;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C946203mu extends AbstractC946303mv implements InterfaceC947003n2 {
    public static final SparseIntArray LLJZIJLIL;
    public final C1087100eOa LLJLILLLLZIIL;
    public final ViewOnClickListenerC946903n1 LLJLL;
    public final ViewOnClickListenerC946903n1 LLJLLIL;
    public final ViewOnClickListenerC946903n1 LLJLLL;
    public long LLJZ;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJI() {
        synchronized (this) {
            try {
                return this.LLJZ != 0;
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
                this.LLJZ = 8L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIILIIL();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LLJZIJLIL = sparseIntArray;
        sparseIntArray.put(R.id.vr7, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b9  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946203mu.LIZLLL():void");
    }

    @Override // X.AbstractC946303mv
    public final void LJIILLIIL(C945403mm c945403mm) {
        this.LLJLIL = c945403mm;
        synchronized (this) {
            try {
                this.LLJZ |= 4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        notifyPropertyChanged(1);
        LJIILIIL();
    }

    public final boolean LJIIZILJ(int i) {
        if (i == 0) {
            synchronized (this) {
                try {
                    this.LLJZ |= 2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C946203mu(View view, C03GW c03gw) {
        Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 10, null, LLJZIJLIL);
        super(c03gw, view, (C0I7D) objArrLJIIIZ[2], (TuxIconView) objArrLJIIIZ[3], (TuxIconView) objArrLJIIIZ[4], (C370460Efk) objArrLJIIIZ[6], (TuxIconView) objArrLJIIIZ[5], (TuxIconView) objArrLJIIIZ[7], (TuxTextView) objArrLJIIIZ[8]);
        this.LLJZ = -1L;
        this.LLJJJIL.setTag(null);
        this.LLJJJJ.setTag(null);
        this.LLJJJJJIL.setTag(null);
        this.LLJJJJLIIL.setTag(null);
        this.LLJJL.setTag(null);
        this.LLJJLIIIJLLLLLLLZ.setTag(null);
        ((View) objArrLJIIIZ[0]).setTag(null);
        C1087100eOa c1087100eOa = (C1087100eOa) objArrLJIIIZ[1];
        this.LLJLILLLLZIIL = c1087100eOa;
        c1087100eOa.setTag(null);
        this.LLJL.setTag(null);
        view.setTag(R.id.ffn, this);
        this.LLJLL = new ViewOnClickListenerC946903n1(this, 3);
        this.LLJLLIL = new ViewOnClickListenerC946903n1(this, 1);
        this.LLJLLL = new ViewOnClickListenerC946903n1(this, 2);
        LJII();
    }

    @Override // X.InterfaceC947003n2
    public final void LIZ(int i, View view) {
        C945103mj c945103mj;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (c945103mj = this.LLJLIL) != null) {
                    c945103mj.getClass();
                    return;
                }
                return;
            }
            C945103mj c945103mj2 = this.LLJLIL;
            if (c945103mj2 == null) {
                return;
            }
            new AwS580S0100000_1(view, 386).invoke(c945103mj2.LLILZ.LIZ);
            return;
        }
        C945103mj c945103mj3 = this.LLJLIL;
        if (c945103mj3 == null) {
            return;
        }
        c945103mj3.getClass();
        c945103mj3.LJFF(C944903mh.LIZ);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean LJIIJJI(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return LJIIZILJ(i2);
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            try {
                this.LLJZ |= 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }
}
