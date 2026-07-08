package Y;

import X.AbstractC19586911kB;
import X.C0H50;
import X.C0H51;
import X.C12ES;
import X.C1388190mED;
import X.C14KQ;
import X.C1C7U;
import X.C418600GbC;
import X.C425410GmB;
import X.C435270H4z;
import X.C786410Ut5;
import X.C960203pA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS6S0100002_6 implements Runnable {
    public final int $t;
    public float f1;
    public float f2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AbstractC19586911kB abstractC19586911kB = (AbstractC19586911kB) this.l0;
        if (abstractC19586911kB.LIZLLL == null) {
            abstractC19586911kB.LIZLLL = new C435270H4z(C1388190mED.LIZ(((AbstractC19586911kB) this.l0).LIZ));
            C435270H4z c435270H4z = ((AbstractC19586911kB) this.l0).LIZLLL;
            if (c435270H4z != null) {
                c435270H4z.LLJJI = 300L;
                c435270H4z.LLJ = false;
                C418600GbC c418600GbC = c435270H4z.LLILLJJLI;
                if (c418600GbC != null) {
                    c418600GbC.setNeedPath(false);
                }
            }
            AbstractC19586911kB abstractC19586911kB2 = (AbstractC19586911kB) this.l0;
            C435270H4z c435270H4z2 = abstractC19586911kB2.LIZLLL;
            if (c435270H4z2 != null) {
                c435270H4z2.LLJI = true;
                c435270H4z2.LLJIJIL = true;
                c435270H4z2.LJJIJ(abstractC19586911kB2.LJIILL());
            }
            AbstractC19586911kB abstractC19586911kB3 = (AbstractC19586911kB) this.l0;
            abstractC19586911kB3.LJIILJJIL(abstractC19586911kB3.LIZLLL);
        }
        AbstractC19586911kB abstractC19586911kB4 = (AbstractC19586911kB) this.l0;
        C435270H4z c435270H4z3 = abstractC19586911kB4.LIZLLL;
        if (c435270H4z3 != null) {
            int iLIZ = C960203pA.LIZ(R.attr.oh, abstractC19586911kB4.LIZ);
            c435270H4z3.LLIZLLLIL = iLIZ;
            C418600GbC c418600GbC2 = c435270H4z3.LLILLJJLI;
            if (c418600GbC2 != null) {
                c418600GbC2.setBgColor(iLIZ);
            }
        }
        C435270H4z c435270H4z4 = ((AbstractC19586911kB) this.l0).LIZLLL;
        if (c435270H4z4 != null) {
            c435270H4z4.LJJIIZ();
        }
        if (((AbstractC19586911kB) this.l0).LIZLLL != null && r0.LJJIIJZLJL() > C14KQ.LJIIIIZZ(((AbstractC19586911kB) this.l0).LIZ) - C12ES.LIZJ(32.0f, ((AbstractC19586911kB) this.l0).LIZ)) {
            C435270H4z c435270H4z5 = ((AbstractC19586911kB) this.l0).LIZLLL;
            int iLJIIIIZZ = (int) (C14KQ.LJIIIIZZ(r0.LIZ) - C12ES.LIZJ(32.0f, ((AbstractC19586911kB) this.l0).LIZ));
            c435270H4z5.LLILLL = iLJIIIIZZ;
            c435270H4z5.setWidth(iLJIIIIZZ);
            C418600GbC.LLJJJJLIIL = iLJIIIIZZ;
            View childAt = ((ViewGroup) ((AbstractC19586911kB) this.l0).LIZLLL.getContentView()).getChildAt(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) (childAt != null ? childAt.getLayoutParams() : null);
            if (layoutParams != null) {
                layoutParams.leftMargin = (int) C12ES.LIZJ(12.0f, ((AbstractC19586911kB) this.l0).LIZ);
                layoutParams.rightMargin = (int) C12ES.LIZJ(12.0f, ((AbstractC19586911kB) this.l0).LIZ);
            }
            View childAt2 = ((ViewGroup) ((AbstractC19586911kB) this.l0).LIZLLL.getContentView()).getChildAt(0);
            if (childAt2 != null) {
                C786410Ut5.W5(childAt2, layoutParams);
            }
            C435270H4z c435270H4z6 = ((AbstractC19586911kB) this.l0).LIZLLL;
            if (c435270H4z6 != null) {
                c435270H4z6.LJJIIZ();
            }
        }
        int[] iArr = new int[2];
        ((AbstractC19586911kB) this.l0).LIZIZ.getLocationOnScreen(iArr);
        final AbstractC19586911kB abstractC19586911kB5 = (AbstractC19586911kB) this.l0;
        C435270H4z c435270H4z7 = abstractC19586911kB5.LIZLLL;
        if (c435270H4z7 != null) {
            c435270H4z7.LLJJIJI = new C0H50(this.f1, this.f2, iArr);
            c435270H4z7.LLJJIJIIJIL = new C0H51(abstractC19586911kB5);
            c435270H4z7.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.11kC
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    InterfaceC19595111lV interfaceC19595111lV;
                    AbstractC19586911kB abstractC19586911kB6 = abstractC19586911kB5;
                    C705930RmZ c705930RmZ = abstractC19586911kB6.LIZJ;
                    if (c705930RmZ == null || (interfaceC19595111lV = c705930RmZ.LJIILIIL) == null) {
                        return;
                    }
                    interfaceC19595111lV.LIZ(abstractC19586911kB6.getStickerType(), false);
                }
            });
        }
        AbstractC19586911kB abstractC19586911kB6 = (AbstractC19586911kB) this.l0;
        C435270H4z c435270H4z8 = abstractC19586911kB6.LIZLLL;
        if (c435270H4z8 != null) {
            c435270H4z8.LLJILJILJ = -1L;
            c435270H4z8.LJJIJIIJI(abstractC19586911kB6.LIZIZ);
        }
    }

    public static final void run$0(ARunnableS6S0100002_6 aRunnableS6S0100002_6) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgCropOverlayView@1919.setDraggableVerticalBounds$1");
        try {
            ((C425410GmB) aRunnableS6S0100002_6.l0).LIZIZ(aRunnableS6S0100002_6.f1, aRunnableS6S0100002_6.f2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgCropOverlayView@1919.setDraggableVerticalBounds$1");
    }

    public static final void run$1(ARunnableS6S0100002_6 aRunnableS6S0100002_6) {
        boolean zLIZ;
        C1C7U.LIZ("BaseInteractStickerView@ab32.tryShowPopWindow$1");
        try {
            aRunnableS6S0100002_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseInteractStickerView@ab32.tryShowPopWindow$1");
    }

    public ARunnableS6S0100002_6(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
