package Y;

import X.C0I7D;
import X.C0P0T;
import X.C1427310nFJ;
import X.C1639070skr;
import X.C1641890spP;
import X.C1641900spQ;
import X.C1643710ssL;
import X.C1643750ssP;
import X.C1654280t9O;
import X.C1659480tHm;
import X.C1659580tHw;
import X.C1674850tgZ;
import X.C1749260vca;
import X.C1ER1;
import X.C21356818hy;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1070180dxI;
import android.app.Activity;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public class ATListenerS457S0100000_25 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

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
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS457S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        C0P0T c0p0t = ((C1654280t9O) aTListenerS457S0100000_25.l0).LLJILLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C1ER1.LIZIZ.LJJIIJZLJL().LIZIZ(((C1641900spQ) aTListenerS457S0100000_25.l0).LLLIIIIL().getCreationId(), ((C1641900spQ) aTListenerS457S0100000_25.l0).LLLIIIIL().shootWay, ((C1641900spQ) aTListenerS457S0100000_25.l0).LLLIIIIL().LJIJJLI());
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getActionMasked() == 0 && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        ((GestureDetector) aTListenerS457S0100000_25.l0).onTouchEvent(motionEvent);
        return true;
    }

    public static final boolean onTouch$3(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior;
        if (motionEvent.getAction() == 0 && (viewPagerBottomSheetBehavior = ((C1641890spP) aTListenerS457S0100000_25.l0).LLJJI) != null && viewPagerBottomSheetBehavior.getState() == 3) {
            Rect rect = new Rect();
            View viewFindViewById = ((C1641890spP) aTListenerS457S0100000_25.l0).findViewById(R.id.fpl);
            if (viewFindViewById != null) {
                viewFindViewById.getGlobalVisibleRect(rect);
            }
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                ((C1641890spP) aTListenerS457S0100000_25.l0).LLLII().kR2(C1639070skr.LIZ);
            }
        }
        return true;
    }

    public static final boolean onTouch$4(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            ((C1674850tgZ) aTListenerS457S0100000_25.l0).LLILLJJLI.animate().scaleX(1.0f).scaleY(1.0f).setDuration(50L).start();
            return false;
        }
        ((C1674850tgZ) aTListenerS457S0100000_25.l0).LLILLJJLI.animate().scaleX(0.9f).scaleY(0.9f).setDuration(50L).start();
        return false;
    }

    public static final boolean onTouch$5(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C1643710ssL c1643710ssL = (C1643710ssL) aTListenerS457S0100000_25.l0;
            if (!c1643710ssL.LJIILLIIL) {
                c1643710ssL.LJIILLIIL = true;
                C786410Ut5.LJLLLLLL(0, c1643710ssL.LIZLLL);
                c1643710ssL.LIZJ().loadData();
                EditText editText = c1643710ssL.LJIIJ;
                SoftKeyBoardListener softKeyBoardListener = null;
                if (editText == null) {
                    editText = null;
                }
                HandlerHook.viewPost(editText, new ARunnableS125S0100000_25(c1643710ssL, 85));
                if (c1643710ssL.LJI) {
                    C21356818hy c21356818hy = c1643710ssL.LJIILIIL;
                    if (c21356818hy == null) {
                        c21356818hy = null;
                    }
                    c21356818hy.LIZ(true);
                }
                Activity activity = c1643710ssL.LJ;
                if (activity != null) {
                    softKeyBoardListener = new SoftKeyBoardListener(activity, null, null, null, 12);
                }
                c1643710ssL.LJIJJ = softKeyBoardListener;
                SoftKeyBoardListener softKeyBoardListener2 = c1643710ssL.LJIJJ;
                if (softKeyBoardListener2 != null) {
                    softKeyBoardListener2.LIZIZ(c1643710ssL.LJIJJLI);
                }
                c1643710ssL.LJIILL.onNext(Boolean.TRUE);
            }
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        SoftKeyBoardListener softKeyBoardListener;
        C0I7D editTextView;
        if (motionEvent.getAction() == 1) {
            C1643750ssP c1643750ssP = (C1643750ssP) aTListenerS457S0100000_25.l0;
            if (!c1643750ssP.LJIIIZ) {
                c1643750ssP.LJIIIZ = true;
                C786410Ut5.LJLLLLLL(0, c1643750ssP.LIZLLL);
                c1643750ssP.LIZJ().loadData();
                C1749260vca c1749260vca = c1643750ssP.LJIIIIZZ;
                if (c1749260vca != null && (editTextView = c1749260vca.getEditTextView()) != null) {
                    HandlerHook.viewPost(editTextView, new ARunnableS94S0200000_25(editTextView, c1643750ssP, 27));
                }
                C1749260vca c1749260vca2 = c1643750ssP.LJIIIIZZ;
                if (c1749260vca2 != null) {
                    C1427310nFJ c1427310nFJ = new C1427310nFJ();
                    c1427310nFJ.LIZIZ(EnumC1070180dxI.SECONDARY);
                    c1427310nFJ.LJI = R.raw.icon_chevron_left_ltr;
                    TuxIconView tuxIconView = c1427310nFJ.LJII;
                    if (tuxIconView != null) {
                        tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
                    }
                    c1427310nFJ.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                    ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(new AwS604S0100000_25(c1643750ssP, 661), (Function1<? super View, Unit>) 261);
                    c1427310nFJ.LJFF = aCListenerS154S0100000_19;
                    TuxIconView tuxIconView2 = c1427310nFJ.LJII;
                    if (tuxIconView2 != null) {
                        C786410Ut5.a9(tuxIconView2, aCListenerS154S0100000_19);
                    }
                    c1749260vca2.setStartAction(c1427310nFJ);
                }
                Activity activity = c1643750ssP.LJ;
                if (activity != null) {
                    softKeyBoardListener = new SoftKeyBoardListener(activity, null, null, null, 12);
                } else {
                    softKeyBoardListener = null;
                }
                c1643750ssP.LJIILJJIL = softKeyBoardListener;
                SoftKeyBoardListener softKeyBoardListener2 = c1643750ssP.LJIILJJIL;
                if (softKeyBoardListener2 != null) {
                    softKeyBoardListener2.LIZIZ(c1643750ssP.LJIILL);
                }
                c1643750ssP.LJIILIIL.onNext(Boolean.TRUE);
            }
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        FrameLayout frameLayout = ((C1659480tHm) aTListenerS457S0100000_25.l0).LLJILJIL;
        if (frameLayout != null) {
            Rect rect = new Rect();
            frameLayout.getLocalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return view.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$8(ATListenerS457S0100000_25 aTListenerS457S0100000_25, View view, MotionEvent motionEvent) {
        FrameLayout frameLayout = ((C1659580tHw) aTListenerS457S0100000_25.l0).LJIILL;
        if (frameLayout != null) {
            Rect rect = new Rect();
            frameLayout.getLocalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return view.onTouchEvent(motionEvent);
    }
}
