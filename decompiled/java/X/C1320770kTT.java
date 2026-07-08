package X;

import X.InterfaceC1316360kMM;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0kTT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320770kTT<DH extends InterfaceC1316360kMM> implements InterfaceC1321160kU6 {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL = true;
    public DH LLILZ;
    public InterfaceC1320850kTb LLILZIL;
    public final C1320840kTa LLILZLL;

    public final void LIZIZ() {
        if (this.LL) {
            return;
        }
        this.LLILZLL.LIZ(EnumC1320760kTS.ON_ATTACH_CONTROLLER);
        this.LL = true;
        InterfaceC1320850kTb interfaceC1320850kTb = this.LLILZIL;
        if (interfaceC1320850kTb == null || interfaceC1320850kTb.LIZLLL() == null) {
            return;
        }
        this.LLILZIL.onAttach();
    }

    public final void LIZJ() {
        if (this.LLILLJJLI && this.LLILLL) {
            LIZIZ();
            return;
        }
        if (this.LL) {
            this.LLILZLL.LIZ(EnumC1320760kTS.ON_DETACH_CONTROLLER);
            this.LL = false;
            if (LJ()) {
                this.LLILZIL.onDetach();
            }
        }
    }

    public Drawable LIZLLL() {
        DH dh = this.LLILZ;
        if (dh == null) {
            return null;
        }
        return dh.LIZIZ();
    }

    public final boolean LJ() {
        InterfaceC1320850kTb interfaceC1320850kTb = this.LLILZIL;
        return interfaceC1320850kTb != null && interfaceC1320850kTb.LIZLLL() == this.LLILZ;
    }

    public void LJFF() {
        this.LLILZLL.LIZ(EnumC1320760kTS.ON_HOLDER_ATTACH);
        this.LLILLJJLI = true;
        LIZJ();
    }

    public void LJI() {
        this.LLILZLL.LIZ(EnumC1320760kTS.ON_HOLDER_DETACH);
        this.LLILLJJLI = false;
        LIZJ();
    }

    @Override // X.InterfaceC1321160kU6
    public final void onDraw() {
        if (this.LL) {
            return;
        }
        C1328570kg3.LJIIZILJ(C1320840kTa.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.LLILZIL)), toString());
        this.LLILLJJLI = true;
        this.LLILLL = true;
        LIZJ();
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZ("controllerAttached", this.LL);
        c1320100kSOLIZIZ.LIZ("holderAttached", this.LLILLJJLI);
        c1320100kSOLIZIZ.LIZ("drawableVisible", this.LLILLL);
        c1320100kSOLIZIZ.LIZIZ(this.LLILZLL.toString(), "events");
        return c1320100kSOLIZIZ.toString();
    }

    public C1320770kTT(C1331070kk5 c1331070kk5) {
        C1320840kTa c1320840kTa;
        if (C1320840kTa.LIZJ) {
            c1320840kTa = new C1320840kTa();
        } else {
            c1320840kTa = C1320840kTa.LIZIZ;
        }
        this.LLILZLL = c1320840kTa;
        if (c1331070kk5 != null) {
            LJIIIZ(c1331070kk5);
        }
    }

    @Override // X.InterfaceC1321160kU6
    public final void LIZ(boolean z) {
        EnumC1320760kTS enumC1320760kTS;
        if (this.LLILLL == z) {
            return;
        }
        C1320840kTa c1320840kTa = this.LLILZLL;
        if (z) {
            enumC1320760kTS = EnumC1320760kTS.ON_DRAWABLE_SHOW;
        } else {
            enumC1320760kTS = EnumC1320760kTS.ON_DRAWABLE_HIDE;
        }
        c1320840kTa.LIZ(enumC1320760kTS);
        this.LLILLL = z;
        LIZJ();
    }

    public final boolean LJII(MotionEvent motionEvent) {
        if (!LJ()) {
            return false;
        }
        return this.LLILZIL.onTouchEvent(motionEvent);
    }

    public final void LJIIIIZZ(InterfaceC1320850kTb interfaceC1320850kTb) {
        boolean z = this.LL;
        if (z) {
            this.LLILZLL.LIZ(EnumC1320760kTS.ON_DETACH_CONTROLLER);
            this.LL = false;
            if (LJ()) {
                this.LLILZIL.onDetach();
            }
        }
        if (LJ()) {
            this.LLILZLL.LIZ(EnumC1320760kTS.ON_CLEAR_OLD_CONTROLLER);
            this.LLILZIL.LIZJ(null);
        }
        this.LLILZIL = interfaceC1320850kTb;
        if (interfaceC1320850kTb != null) {
            this.LLILZLL.LIZ(EnumC1320760kTS.ON_SET_CONTROLLER);
            this.LLILZIL.LIZJ(this.LLILZ);
        } else {
            this.LLILZLL.LIZ(EnumC1320760kTS.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            LIZIZ();
        }
    }

    public final void LJIIIZ(DH dh) {
        boolean z;
        this.LLILZLL.LIZ(EnumC1320760kTS.ON_SET_HIERARCHY);
        boolean zLJ = LJ();
        Object objLIZLLL = LIZLLL();
        if (objLIZLLL instanceof InterfaceC1320910kTh) {
            ((InterfaceC1320910kTh) objLIZLLL).LIZLLL(null);
        }
        dh.getClass();
        this.LLILZ = dh;
        C1321120kU2 c1321120kU2LIZIZ = dh.LIZIZ();
        if (c1321120kU2LIZIZ != null && !c1321120kU2LIZIZ.isVisible()) {
            z = false;
        } else {
            z = true;
        }
        LIZ(z);
        Object objLIZLLL2 = LIZLLL();
        if (objLIZLLL2 instanceof InterfaceC1320910kTh) {
            ((InterfaceC1320910kTh) objLIZLLL2).LIZLLL(this);
        }
        if (zLJ) {
            this.LLILZIL.LIZJ(dh);
        }
    }
}
