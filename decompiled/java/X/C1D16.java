package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1D16, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D16 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C1D16 c1d16) {
        C2248351CzJ c2248351CzJ = (C2248351CzJ) c1d16.l0;
        if (c2248351CzJ.LJII) {
            c2248351CzJ.LJI = c2248351CzJ.LIZ.getHeight();
            c2248351CzJ.LJII = false;
        }
        Rect rect = new Rect();
        c2248351CzJ.LIZ.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != c2248351CzJ.LJ) {
            int height = c2248351CzJ.LIZ.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                c2248351CzJ.LJFF.height = (c2248351CzJ.LJI - i2) + c2248351CzJ.LIZJ + c2248351CzJ.LIZLLL;
            } else {
                c2248351CzJ.LJFF.height = c2248351CzJ.LJI;
                if (c2248351CzJ.LIZJ == 0) {
                    c2248351CzJ.LIZJ = c2248351CzJ.LIZIZ.getPaddingBottom();
                }
                if (c2248351CzJ.LIZLLL == 0) {
                    c2248351CzJ.LIZLLL = c2248351CzJ.LIZIZ.getPaddingTop();
                }
            }
            c2248351CzJ.LIZ.requestLayout();
            c2248351CzJ.LJ = i;
        }
    }

    public static final void onGlobalLayout$1(C1D16 c1d16) {
        Rect rect = new Rect();
        View view = ((C2246401CwA) c1d16.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height();
        C2246401CwA c2246401CwA = (C2246401CwA) c1d16.l0;
        int i = c2246401CwA.LIZIZ;
        if (i != iHeight && i != 0) {
            InterfaceC2246541CwO interfaceC2246541CwO = c2246401CwA.LIZJ;
            if (interfaceC2246541CwO != null) {
                int i2 = i - iHeight;
                if (i2 > 200) {
                    interfaceC2246541CwO.LJJIIJ(i2);
                } else if (i > iHeight) {
                    interfaceC2246541CwO.LLLL(i2);
                } else if (iHeight - i > 200) {
                    interfaceC2246541CwO.LIZ();
                } else if (i < iHeight) {
                    interfaceC2246541CwO.LLLL(i2);
                }
            }
            ((C2246401CwA) c1d16.l0).LIZIZ = iHeight;
        }
    }

    public static final void onGlobalLayout$2(C1D16 c1d16) {
        View view;
        AbstractC2248231Cz7 abstractC2248231Cz7 = (AbstractC2248231Cz7) c1d16.l0;
        if (abstractC2248231Cz7.LJIILL && (view = abstractC2248231Cz7.LIZLLL) != null) {
            HandlerHook.viewRemoveCallbacks(view, abstractC2248231Cz7.LJIJI);
            HandlerHook.viewPostDelay(abstractC2248231Cz7.LIZLLL, abstractC2248231Cz7.LJIJI, 100L);
        }
    }

    public C1D16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
