package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.19cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21576319cH extends RelativeLayout implements InterfaceC21576419cI {
    public final View LL;
    public C19PY LLILLJJLI;
    public final InterfaceC21576419cI LLILLL;

    public boolean LJII() {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        return (interfaceC21576419cI == null || interfaceC21576419cI == this || !interfaceC21576419cI.LJII()) ? false : true;
    }

    @Override // X.InterfaceC21576419cI
    public C19PY getSpinnerStyle() {
        int i;
        C19PY c19py = this.LLILLJJLI;
        if (c19py != null) {
            return c19py;
        }
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            return interfaceC21576419cI.getSpinnerStyle();
        }
        View view = this.LL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C19PS) {
                C19PY c19py2 = ((C19PS) layoutParams).LIZIZ;
                this.LLILLJJLI = c19py2;
                if (c19py2 != null) {
                    return c19py2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                C19PY[] c19pyArr = C19PY.LJI;
                int i2 = 0;
                do {
                    C19PY c19py3 = c19pyArr[i2];
                    if (c19py3.LIZIZ) {
                        this.LLILLJJLI = c19py3;
                        return c19py3;
                    }
                    i2++;
                } while (i2 < 5);
            }
        }
        C19PY c19py4 = C19PY.LIZJ;
        this.LLILLJJLI = c19py4;
        return c19py4;
    }

    @Override // X.InterfaceC21576419cI
    public View getView() {
        View view = this.LL;
        return view == null ? this : view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC21576319cH(View view) {
        InterfaceC21576419cI interfaceC21576419cI;
        super(view.getContext(), null, 0);
        if (view instanceof InterfaceC21576419cI) {
            interfaceC21576419cI = (InterfaceC21576419cI) view;
        } else {
            interfaceC21576419cI = null;
        }
        this.LL = view;
        this.LLILLL = interfaceC21576419cI;
        if ((this instanceof C21576619cK) && (interfaceC21576419cI instanceof InterfaceC21576219cG) && interfaceC21576419cI.getSpinnerStyle() == C19PY.LJFF) {
            C786410Ut5.pc(interfaceC21576419cI.getView(), -1.0f);
        } else {
            if (!(this instanceof C21576719cL) || !(interfaceC21576419cI instanceof InterfaceC21576819cM) || interfaceC21576419cI.getSpinnerStyle() != C19PY.LJFF) {
                return;
            }
            C786410Ut5.pc(interfaceC21576419cI.getView(), -1.0f);
        }
    }

    public final boolean LJIILJJIL(boolean z) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if ((interfaceC21576419cI instanceof InterfaceC21576819cM) && ((InterfaceC21576819cM) interfaceC21576419cI).LJIILJJIL(z)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if ((obj instanceof InterfaceC21576419cI) && getView() == ((InterfaceC21576419cI) obj).getView()) {
            return true;
        }
        return false;
    }

    public void setPrimaryColors(int... iArr) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            interfaceC21576419cI.setPrimaryColors(iArr);
        }
    }

    public AbstractC21576319cH(Context context) {
        super(context, null, 0);
    }

    public int LJIILL(C21576919cN c21576919cN, boolean z) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            return interfaceC21576419cI.LJIILL(c21576919cN, z);
        }
        return 0;
    }

    public void LIZ(C19PU c19pu, int i, int i2) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            interfaceC21576419cI.LIZ(c19pu, i, i2);
        }
    }

    public void LIZJ(C19PU c19pu, int i, int i2) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            interfaceC21576419cI.LIZJ(c19pu, i, i2);
        }
    }

    public void LJIIJ(C19PU c19pu, EnumC21577619cU enumC21577619cU, EnumC21577619cU enumC21577619cU2) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            if ((this instanceof C21576619cK) && (interfaceC21576419cI instanceof InterfaceC21576219cG)) {
                if (enumC21577619cU.isFooter) {
                    enumC21577619cU = enumC21577619cU.toHeader();
                }
                if (enumC21577619cU2.isFooter) {
                    enumC21577619cU2 = enumC21577619cU2.toHeader();
                }
            } else if ((this instanceof C21576719cL) && (interfaceC21576419cI instanceof InterfaceC21576819cM)) {
                if (enumC21577619cU.isHeader) {
                    enumC21577619cU = enumC21577619cU.toFooter();
                }
                if (enumC21577619cU2.isHeader) {
                    enumC21577619cU2 = enumC21577619cU2.toFooter();
                }
            }
            InterfaceC21576419cI interfaceC21576419cI2 = this.LLILLL;
            if (interfaceC21576419cI2 != null) {
                interfaceC21576419cI2.LJIIJ(c19pu, enumC21577619cU, enumC21577619cU2);
            }
        }
    }

    @Override // X.InterfaceC21576419cI
    public final void LJIIJJI(C21577019cO c21577019cO, int i, int i2) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            interfaceC21576419cI.LJIIJJI(c21577019cO, i, i2);
            return;
        }
        View view = this.LL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C19PS)) {
            return;
        }
        int i3 = ((C19PS) layoutParams).LIZ;
        C21576919cN c21576919cN = c21577019cO.LIZ;
        if (c21576919cN.LLLLLL == null && i3 != 0) {
            c21576919cN.LLLLLL = new Paint();
        }
        if (equals(c21577019cO.LIZ.LLLLLILLIL)) {
            c21577019cO.LIZ.LLLLLLLZIL = i3;
        } else {
            if (!equals(c21577019cO.LIZ.LLLLLJIL)) {
                return;
            }
            c21577019cO.LIZ.LLLLLLZ = i3;
        }
    }

    public void LJIIZILJ(float f, int i, int i2) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            interfaceC21576419cI.LJIIZILJ(f, i, i2);
        }
    }

    public void LJIIL(boolean z, float f, int i, int i2, int i3) {
        InterfaceC21576419cI interfaceC21576419cI = this.LLILLL;
        if (interfaceC21576419cI != null && interfaceC21576419cI != this) {
            interfaceC21576419cI.LJIIL(z, f, i, i2, i3);
        }
    }
}
