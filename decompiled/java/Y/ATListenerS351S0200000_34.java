package Y;

import X.C11HI;
import X.C19674911yN;
import X.C2212051Bhr;
import X.C2212201Bi6;
import X.C2212921BjG;
import X.C2212931BjH;
import X.C2213051BjT;
import X.C2213111BjZ;
import X.C2213141Bjc;
import X.C2213171Bjf;
import X.C2213201Bji;
import X.InterfaceC2213131Bjb;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.skydoves.balloon.Balloon;

/* JADX INFO: loaded from: classes35.dex */
public class ATListenerS351S0200000_34 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS351S0200000_34(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS351S0200000_34 aTListenerS351S0200000_34, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            Balloon balloon = (Balloon) aTListenerS351S0200000_34.l0;
            if (balloon.LLILLJJLI.LJJIIZI) {
                balloon.dismiss();
            }
            C11HI c11hi = (C11HI) aTListenerS351S0200000_34.l1;
            if (c11hi != null) {
                c11hi.LIZ(motionEvent, view);
                return true;
            }
            return true;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS351S0200000_34 aTListenerS351S0200000_34, View view, MotionEvent motionEvent) {
        C2213171Bjf c2213171Bjf;
        int i;
        if (((C2212931BjH) aTListenerS351S0200000_34.l1).getTouchDelegate() != null && ((C2212931BjH) aTListenerS351S0200000_34.l1).getTouchDelegate().onTouchEvent(motionEvent)) {
            return true;
        }
        C2212931BjH c2212931BjH = (C2212931BjH) aTListenerS351S0200000_34.l1;
        C19674911yN c19674911yN = c2212931BjH.LLLI;
        if (c19674911yN != null && ((i = c19674911yN.LIZIZ.LLLLII) == 7 || i == 6)) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    float x = motionEvent.getX() - c19674911yN.LJFF.x;
                    float y = motionEvent.getY() - c19674911yN.LJFF.y;
                    if (Math.abs(x) <= Math.abs(y) && y < 0.0f && Math.abs(y) >= c19674911yN.LJI) {
                        C2213141Bjc c2213141Bjc = (C2213141Bjc) c19674911yN.LJ;
                        c2213141Bjc.LIZ.LJIILIIL();
                        C2212921BjG c2212921BjG = (C2212921BjG) c2213141Bjc.LIZ.LLJLILLLLZIIL;
                        InterfaceC2213131Bjb interfaceC2213131Bjb = c2212921BjG.LIZ;
                        C2213201Bji c2213201Bji = new C2213201Bji();
                        c2213201Bji.LIZ = 4;
                        interfaceC2213131Bjb.LIZLLL(c2213201Bji);
                        c2212921BjG.LIZIZ();
                        C2212931BjH c2212931BjH2 = c2213141Bjc.LIZ;
                        if (c2212931BjH2.LLLII != null) {
                            c2212931BjH2.LLJJJJLIIL = 8;
                            c2212931BjH2.LJIILL();
                        }
                        C2212051Bhr.LIZJ().LJIIIZ(c2213141Bjc.LIZ.LLJLIL, "swipe_up");
                        return true;
                    }
                }
            } else {
                c19674911yN.LJFF.set(motionEvent.getX(), motionEvent.getY());
            }
        }
        GestureDetector gestureDetector = c2212931BjH.LLLF;
        if ((gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) && ((motionEvent.getAction() != 1 || (c2213171Bjf = c2212931BjH.LLLFF) == null || !c2213171Bjf.LIZ()) && !c2212931BjH.LLLIIIIL && motionEvent.getAction() == 1)) {
            ((C2212931BjH) aTListenerS351S0200000_34.l1).LIZIZ((C2212201Bi6) aTListenerS351S0200000_34.l0, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS351S0200000_34 aTListenerS351S0200000_34, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((C2212931BjH) aTListenerS351S0200000_34.l1).LJIILIIL();
            C2213111BjZ c2213111BjZ = new C2213111BjZ();
            c2213111BjZ.LIZ = -1;
            c2213111BjZ.LJ = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            C2212931BjH c2212931BjH = (C2212931BjH) aTListenerS351S0200000_34.l1;
            c2213111BjZ.LIZLLL = c2212931BjH.LLJJJIL;
            c2213111BjZ.LIZJ = "click_open_app_area";
            C2213051BjT c2213051BjT = new C2213051BjT(c2213111BjZ);
            ((C2212921BjG) c2212931BjH.LLJLILLLLZIIL).LIZLLL((C2212201Bi6) aTListenerS351S0200000_34.l0, c2213051BjT);
            ((C2212921BjG) ((C2212931BjH) aTListenerS351S0200000_34.l1).LLJLILLLLZIIL).LJ();
        }
        return true;
    }
}
