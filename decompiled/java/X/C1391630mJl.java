package X;

import Y.ARunnableS121S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391630mJl implements C0P0T {
    public final View LL;
    public final ViewGroup LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C1391600mJi LLILZIL;
    public final C1391610mJj LLILZLL;
    public AbstractC1391670mJp LLIZ;

    public final void LIZ() {
        C786410Ut5.LJLLLLLL(8, this.LL);
        ViewGroup viewGroup = this.LLILZIL.LIZJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this.LL, viewGroup);
        }
        this.LLILZ = true;
        InterfaceC1340660kzY interfaceC1340660kzY = this.LLILZIL.LJJI;
        if (interfaceC1340660kzY != null) {
            interfaceC1340660kzY.LIZ(this.LLIZ);
        }
    }

    public final void LIZIZ() {
        if (this.LLILZ) {
            return;
        }
        if (!this.LLILZIL.LJIIJJI) {
            LIZ();
            return;
        }
        if (this.LLILLL) {
            return;
        }
        C1391610mJj c1391610mJj = this.LLILZLL;
        c1391610mJj.LJIIJ(c1391610mJj.LJIIL, false);
        this.LLILLL = true;
        C786410Ut5.LJLIIL(this.LLILZIL.LJIIJ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 152));
    }

    public final void LIZJ() {
        InterfaceC1348590lCL interfaceC1348590lCL = this.LLILZIL.LJIILIIL;
        if (interfaceC1348590lCL != null) {
            interfaceC1348590lCL.LIZ(this.LLILZLL.LJIIL);
        }
        ViewGroup viewGroup = this.LLILZIL.LIZJ;
        if (viewGroup != null) {
            viewGroup.addView(this.LL);
        }
        C786410Ut5.LJLLLLLL(0, this.LL);
        this.LLILZ = false;
        C786410Ut5.Ed(this.LLILZLL.LJIIL.LIZ, this.LLILLJJLI);
        C786410Ut5.Kd(this.LLILZLL.LJIIL.LIZIZ, this.LLILLJJLI);
        C1391610mJj c1391610mJj = this.LLILZLL;
        c1391610mJj.LJIIJ(c1391610mJj.LJIIL, true);
        InterfaceC1391650mJn interfaceC1391650mJn = this.LLILZIL.LJJIFFI;
        if (interfaceC1391650mJn != null) {
            interfaceC1391650mJn.onShow();
        }
        if (this.LLILZIL.LJII != -1001) {
            C786410Ut5.LJLIIL(this.LLILZIL.LJII, new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 153));
        }
    }

    @Override // X.C0P0T
    public final void LJ() {
        this.LLILZLL.LJIIIZ();
        C786410Ut5.Ed(this.LLILZLL.LJIIL.LIZ, this.LLILLJJLI);
        C786410Ut5.Kd(this.LLILZLL.LJIIL.LIZIZ, this.LLILLJJLI);
    }

    @Override // X.C0P0T
    public final C1391600mJi LJIILL() {
        return this.LLILZLL.LIZIZ;
    }

    @Override // X.C0P0T
    public final void dismiss() {
        this.LLIZ = C1391690mJr.LIZ;
        LIZIZ();
    }

    @Override // X.C0P0T
    public final boolean isShowing() {
        return !this.LLILZ;
    }

    @Override // X.C0P0T
    public final void show() {
        C1391600mJi c1391600mJi = this.LLILZIL;
        if ((c1391600mJi.LIZIZ != null || (c1391600mJi.LJIILJJIL >= 0 && c1391600mJi.LJIILL >= 0)) && c1391600mJi.LIZJ != null && this.LLILZ) {
            if (this.LLILZLL.LJIIIZ()) {
                LIZJ();
            } else {
                int i = C1235720iGI.LIZ[this.LLILZIL.LIZLLL.ordinal()];
                if (i == 1) {
                    this.LLILZIL.LIZLLL = EnumC1235690iGF.END;
                } else if (i == 2) {
                    this.LLILZIL.LIZLLL = EnumC1235690iGF.START;
                } else if (i == 3) {
                    this.LLILZIL.LIZLLL = EnumC1235690iGF.TOP;
                } else {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    this.LLILZIL.LIZLLL = EnumC1235690iGF.BOTTOM;
                }
                this.LLILZLL.LJI();
                this.LLILZLL.LJII();
                if (this.LLILZLL.LJIIIZ() || this.LLILZIL.LJIIIZ) {
                    LIZJ();
                }
            }
        }
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    @Override // X.C0P0T
    public final void LIZLLL(boolean z) {
        this.LLILZIL.LJIJJ = z;
        if (z) {
            this.LL.setOnTouchListener(new ATListenerS454S0100000_21(this, 26));
        } else {
            this.LL.setOnTouchListener(null);
        }
    }

    @Override // X.C0P0T
    public final void LJIIIZ(InterfaceC1340660kzY interfaceC1340660kzY) {
        this.LLILZIL.LJJI = interfaceC1340660kzY;
    }

    @Override // X.C0P0T
    public final void LJIIL(C731670Smz c731670Smz) {
        this.LLIZ = c731670Smz;
        LIZIZ();
    }

    @Override // X.C0P0T
    public final void LJIILJJIL(Function2<? super View, ? super Boolean, AnimatorSet> function2) {
        this.LLILZIL.LJJII = function2;
    }

    @Override // X.C0P0T
    public final void LJIJ(InterfaceC1391650mJn interfaceC1391650mJn) {
        this.LLILZIL.LJJIFFI = interfaceC1391650mJn;
    }

    public C1391630mJl(Context context, C1391600mJi c1391600mJi) {
        View viewSd = C786410Ut5.Sd(R.layout.fy, C786410Ut5.ne(context), null);
        this.LL = viewSd;
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.ex3);
        this.LLILLJJLI = viewGroup;
        this.LLILZ = true;
        this.LLIZ = C1391690mJr.LIZ;
        viewGroup.setWillNotDraw(false);
        C1391610mJj c1391610mJj = new C1391610mJj(context, c1391600mJi, this, viewGroup, false);
        this.LLILZLL = c1391610mJj;
        this.LLILZIL = c1391610mJj.LIZIZ;
        c1391610mJj.LJFF();
        c1391610mJj.LJI();
        c1391610mJj.LJII();
    }

    @Override // X.C0P0T
    public final void LJJII(boolean z, View.OnClickListener onClickListener) {
        this.LLILZIL.LJIL = onClickListener;
        C786410Ut5.K7(this.LLILLJJLI, onClickListener);
        this.LLILLJJLI.setClickable(z);
    }
}
