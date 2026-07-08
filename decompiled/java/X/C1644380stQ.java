package X;

import Y.ALAdapterS20S0100000_25;
import Y.AObserverS186S0200000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.LiveData;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0stQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644380stQ {
    public final InterfaceC1461390o8H LIZ;
    public final InterfaceC1455860nzM LIZIZ;
    public final InterfaceC1465710oFF LIZJ;
    public final InterfaceC1639870sm9 LIZLLL;
    public final LiveData<C1453000nuk> LJ;
    public final int LJFF;
    public final C1644400stS LJI;
    public C1644340stM LJII;
    public FilterBean LJIIIIZZ;
    public FilterBean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final ALAdapterS20S0100000_25 LJIILIIL;
    public final AUListenerS273S0100000_25 LJIILJJIL;

    public static int LIZJ(int i, int i2, boolean z) {
        if (z) {
            return i >= 1 ? i - 1 : i2 - 1;
        }
        if (i < i2 - 1) {
            return i + 1;
        }
        return 0;
    }

    public final void LIZ(float f) {
        boolean z;
        byte b;
        int i;
        int i2 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b = 0;
        } else if (f < 0.0f) {
            b = -1;
        } else {
            b = 1;
        }
        InterfaceC1640320sms interfaceC1640320smsLJJI = this.LIZLLL.LJJI();
        int size = C1453230nv7.LJFF(interfaceC1640320smsLJJI).size();
        int iLIZIZ = LIZIZ(interfaceC1640320smsLJJI);
        if (size == 0) {
            return;
        }
        if (b != -1) {
            if (b != 0) {
                i = iLIZIZ + 1;
            } else {
                i = iLIZIZ;
            }
        } else {
            i = iLIZIZ;
            iLIZIZ--;
        }
        if (iLIZIZ >= 0 && i < size) {
            i2 = i;
        } else {
            iLIZIZ = size - 1;
        }
        if (this.LJIIL && b != 0) {
            if (b == -1) {
                if (C1453840nw6.LIZJ(C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, iLIZIZ))) {
                    iLIZIZ = ((iLIZIZ - 1) + size) % size;
                }
            } else if (b == 1 && C1453840nw6.LIZJ(C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, i2))) {
                i2 = (i2 + 1) % size;
            }
        }
        FilterBean filterBeanLIZLLL = C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, iLIZIZ);
        FilterBean filterBeanLIZLLL2 = C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, i2);
        C1644340stM c1644340stM = this.LJII;
        if (c1644340stM != null) {
            c1644340stM.LIZ.LLLIILIL().rt1(filterBeanLIZLLL, filterBeanLIZLLL2, f);
        }
    }

    public final int LIZIZ(InterfaceC1640320sms interfaceC1640320sms) {
        if (((Number) C298350Bmj.LIZ.getValue()).intValue() == 1 && this.LJIIIIZZ == null) {
            return -1;
        }
        return C1453230nv7.LJI(this.LJIIIIZZ, interfaceC1640320sms);
    }

    public final boolean LIZLLL(float f, float f2) {
        boolean z;
        ValueAnimator valueAnimatorOfFloat;
        float fAbs;
        float fAbs2;
        if (!this.LJIIJ) {
            return false;
        }
        int width = this.LIZ.getRootView().getWidth();
        InterfaceC1640320sms interfaceC1640320smsLJJI = this.LIZLLL.LJJI();
        int size = C1453230nv7.LJFF(interfaceC1640320smsLJJI).size();
        if (Math.signum(f2) == Math.signum(f)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LJIIIZ = this.LJIIIIZZ;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, 0.0f);
            fAbs = (long) (width * Math.abs(f2));
            fAbs2 = Math.abs(f);
        } else {
            if (f >= 1.0E-5f) {
                int iLIZJ = LIZJ(LIZIZ(interfaceC1640320smsLJJI), size, true);
                if (this.LJIIL && C1453840nw6.LIZJ(C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, iLIZJ))) {
                    iLIZJ = LIZJ(iLIZJ, size, true);
                }
                this.LJIIIZ = C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, iLIZJ);
                valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, -1.0f);
            } else {
                int iLIZJ2 = LIZJ(LIZIZ(interfaceC1640320smsLJJI), size, false);
                if (this.LJIIL && C1453840nw6.LIZJ(C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, iLIZJ2))) {
                    iLIZJ2 = LIZJ(iLIZJ2, size, false);
                }
                this.LJIIIZ = C1453230nv7.LIZLLL(interfaceC1640320smsLJJI, iLIZJ2);
                valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, 1.0f);
            }
            fAbs = (long) (width * (1 - Math.abs(f2)));
            fAbs2 = Math.abs(f);
        }
        long jMin = Math.min((long) (fAbs / ((fAbs2 / LSPassThroughRecordSizeConfig.DEFAULT) / 2)), 400L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(jMin);
        valueAnimatorOfFloat.addUpdateListener(this.LJIILJJIL);
        valueAnimatorOfFloat.addListener(this.LJIILIIL);
        valueAnimatorOfFloat.start();
        return true;
    }

    public C1644380stQ(C1644130st1 c1644130st1, InterfaceC1461390o8H interfaceC1461390o8H, InterfaceC1455860nzM interfaceC1455860nzM, C1644310stJ c1644310stJ, InterfaceC1639870sm9 interfaceC1639870sm9, LiveData liveData, int i, AwS604S0100000_25 awS604S0100000_25) {
        boolean z;
        this.LIZ = interfaceC1461390o8H;
        this.LIZIZ = interfaceC1455860nzM;
        this.LIZJ = c1644310stJ;
        this.LIZLLL = interfaceC1639870sm9;
        this.LJ = liveData;
        this.LJFF = i;
        C1644400stS c1644400stS = new C1644400stS(this, interfaceC1461390o8H.getRootView());
        this.LJI = c1644400stS;
        this.LJIIJJI = 10;
        if (((Number) C298350Bmj.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIL = z;
        interfaceC1461390o8H.LIZIZ(new GestureInteractItem(0, c1644400stS));
        this.LJ.observe(c1644130st1, new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) awS604S0100000_25, (l0) 5));
        this.LJIILIIL = new ALAdapterS20S0100000_25(this, 9);
        this.LJIILJJIL = new AUListenerS273S0100000_25(this, 8);
    }
}
