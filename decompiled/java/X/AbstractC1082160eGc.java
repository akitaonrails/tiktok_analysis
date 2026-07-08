package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1082160eGc extends AbstractC1078100eA4 {
    public final View LIZ;
    public final View LIZIZ;
    public final InterfaceC1082180eGe LIZJ;
    public final boolean LJFF;
    public boolean LJII;
    public float LIZLLL = 4.0f;
    public float LJ = 0.8f;
    public float LJI = 1.0f;

    public void LJFF(float f) {
    }

    public abstract void LJII(boolean z, EnumC1083180eIG enumC1083180eIG);

    public void LIZLLL() {
        C20441214yg.LJIIIZ("LivePinch", "onDestroy");
    }

    public void LJIIIZ() {
        C20441214yg.LJIIIZ("LivePinch", "setCurScaleToZoomFilled");
    }

    @Override // X.InterfaceC1082220eGi
    public boolean LIZ(C1082200eGg c1082200eGg) {
        float f;
        View view = this.LIZIZ;
        if (view != null) {
            float f2 = c1082200eGg.LIZJ;
            if (f2 > 0.0f) {
                f = c1082200eGg.LIZIZ / f2;
            } else {
                f = 1.0f;
            }
            float fLIZLLL = C13LZ.LIZLLL(f * this.LJI, this.LJ, this.LIZLLL);
            if (!Float.isNaN(fLIZLLL)) {
                C786410Ut5.Ob(view, fLIZLLL);
                C786410Ut5.pc(view, fLIZLLL);
                LJIIIIZZ(fLIZLLL);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1082220eGi
    public void LIZIZ(C1082200eGg c1082200eGg) {
        this.LIZJ.onScaleBegin();
        C20441214yg.LJIIIZ("LivePinch", "PinchBegin");
    }

    public void LJ(boolean z) {
        C20441214yg.LJIIIZ("LivePinch", "onLandscapeSplitScreenEvent");
    }

    public final void LJIIIIZZ(float f) {
        boolean z;
        this.LJI = f;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = !z;
        LJFF(f);
    }

    public void LJI(boolean z, EnumC1083180eIG enumC1083180eIG) {
        ViewGroup viewGroup;
        LJII(z, enumC1083180eIG);
        View view = this.LIZ;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        this.LIZ.setEnabled(this.LJFF);
    }

    public AbstractC1082160eGc(View view, View view2, InterfaceC1082180eGe interfaceC1082180eGe) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = interfaceC1082180eGe;
        this.LJFF = view.isEnabled();
    }
}
