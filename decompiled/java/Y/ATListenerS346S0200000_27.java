package Y;

import X.C1246020iWu;
import X.C1308910kAL;
import X.C1835760xs6;
import X.C1835820xsC;
import X.C1835840xsE;
import X.C1842270y2b;
import X.C1852530yJ9;
import X.C1852540yJA;
import X.C1855790yOP;
import X.C1857690yRT;
import X.C500260Jjc;
import X.InterfaceC1484830ok5;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public class ATListenerS346S0200000_27 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS346S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS346S0200000_27 aTListenerS346S0200000_27, View view, MotionEvent motionEvent) {
        Function2<View, MotionEvent, Unit> function2;
        C1852540yJA c1852540yJA = ((C1852530yJ9) aTListenerS346S0200000_27.l0).LLIZ;
        if (c1852540yJA != null && (function2 = c1852540yJA.LIZJ) != null) {
            function2.invoke((C1842270y2b) aTListenerS346S0200000_27.l1, motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS346S0200000_27 aTListenerS346S0200000_27, View view, MotionEvent motionEvent) {
        Integer numLIZJ;
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action != 1 && action != 3) || (numLIZJ = C1308910kAL.LIZJ(R.attr.d5, ((TuxIconView) aTListenerS346S0200000_27.l0).getContext())) == null) {
                return false;
            }
            ((TuxIconView) aTListenerS346S0200000_27.l0).setTintColor(numLIZJ.intValue());
            return false;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.d5, ((TuxIconView) aTListenerS346S0200000_27.l0).getContext());
        if (numLIZJ2 == null) {
            return false;
        }
        ((TuxIconView) aTListenerS346S0200000_27.l0).setTintColor(C1857690yRT.LJIIIZ(((C1855790yOP) aTListenerS346S0200000_27.l1).getIconPressedAlpha(), numLIZJ2.intValue()));
        return false;
    }

    public static final boolean onTouch$2(ATListenerS346S0200000_27 aTListenerS346S0200000_27, View view, MotionEvent motionEvent) {
        Integer numLIZJ;
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action != 1 && action != 3) || (numLIZJ = C1308910kAL.LIZJ(R.attr.d5, ((TuxIconView) aTListenerS346S0200000_27.l0).getContext())) == null) {
                return false;
            }
            ((TuxIconView) aTListenerS346S0200000_27.l0).setTintColor(numLIZJ.intValue());
            return false;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.d5, ((TuxIconView) aTListenerS346S0200000_27.l0).getContext());
        if (numLIZJ2 == null) {
            return false;
        }
        ((TuxIconView) aTListenerS346S0200000_27.l0).setTintColor(C1857690yRT.LJIIIZ(((C1855790yOP) aTListenerS346S0200000_27.l1).getIconPressedAlpha(), numLIZJ2.intValue()));
        return false;
    }

    public static final boolean onTouch$3(ATListenerS346S0200000_27 aTListenerS346S0200000_27, View view, MotionEvent motionEvent) {
        boolean zOnTouchEvent = ((C1835840xsE) aTListenerS346S0200000_27.l0).LLJJI.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            C1835840xsE c1835840xsE = (C1835840xsE) aTListenerS346S0200000_27.l0;
            if (c1835840xsE.LLJILLL) {
                c1835840xsE.LLJILLL = false;
                C1835820xsC c1835820xsC = c1835840xsE.LLJJ;
                if (c1835820xsC != null) {
                    C1835760xs6 c1835760xs6 = c1835820xsC.LIZ;
                    if (c1835760xs6.LJ) {
                        InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1835760xs6.LIZ();
                        if (interfaceC1484830ok5LIZ != null) {
                            interfaceC1484830ok5LIZ.setSpeed(1.0f);
                        }
                        C500260Jjc.LJIILLIIL(c1835820xsC.LIZIZ.LLJILJIL);
                        C500260Jjc.LJIILLIIL(c1835820xsC.LIZIZ.LLJIJIL);
                        C1246020iWu.LIZ(c1835820xsC.LIZIZ.LLILLL);
                        C1246020iWu.LIZ(c1835820xsC.LIZIZ.LLJI);
                    }
                }
                ((View) aTListenerS346S0200000_27.l1).getParent().requestDisallowInterceptTouchEvent(false);
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }
}
