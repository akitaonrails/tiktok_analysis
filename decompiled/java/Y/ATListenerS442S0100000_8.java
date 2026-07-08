package Y;

import X.C0MRW;
import X.C0P0T;
import X.C0SXL;
import X.C0WZX;
import X.C1325340kaq;
import X.C1429810nJL;
import X.C1741940vQm;
import X.C201955140j;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C557390LtZ;
import X.C565400MFm;
import X.C565430MFp;
import X.C565450MFr;
import X.C568420MRc;
import X.C576730Mjf;
import X.C577530Mkx;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class ATListenerS442S0100000_8 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS442S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view, MotionEvent motionEvent) {
        C1741940vQm.LIZ(((FTCVideoPublishFragment) aTListenerS442S0100000_8.l0).getActivity());
        return false;
    }

    public static final boolean onTouch$1(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            PreviewVideoScene previewVideoScene = (PreviewVideoScene) aTListenerS442S0100000_8.l0;
            if (previewVideoScene.LLLII) {
                previewVideoScene.LLLII = false;
                previewVideoScene.LLLLLJIL();
            }
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        ValueAnimator valueAnimator;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C0MRW c0mrw = (C0MRW) aTListenerS442S0100000_8.l0;
            c0mrw.getClass();
            C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFirstFingerDown curStage: ");
            sbLIZ.append(c0mrw.LJIIL);
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z = C201955140j.LIZ;
            int i = c0mrw.LJIIL;
            if (i != 0) {
                if (i == 1) {
                    c0mrw.LJ.removeCallbacks(c0mrw.LJIILLIIL);
                    c0mrw.LJ.removeCallbacks(c0mrw.LJIILL);
                    ValueAnimator valueAnimator2 = c0mrw.LJFF;
                    if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = c0mrw.LJFF) != null) {
                        valueAnimator.addListener(new AAListenerS319S0100000_8(c0mrw, 3));
                    }
                }
            } else {
                c0mrw.LJ.removeCallbacks(c0mrw.LJIILJJIL);
                if (!c0mrw.LJIILIIL) {
                    C786410Ut5.LJLIIL(2000L, c0mrw.LJ, c0mrw.LJIILJJIL);
                    return false;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view, MotionEvent motionEvent) {
        C576730Mjf.LJIIIZ("CameraLayoutToolbarScene", "on toolbar panel background clicked");
        if (!((C577530Mkx) aTListenerS442S0100000_8.l0).LLJJJJLIIL.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            ((C577530Mkx) aTListenerS442S0100000_8.l0).LLLLIL().LIZJ.invoke();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view, MotionEvent motionEvent) throws Throwable {
        C565430MFp c565430MFp;
        Layout layout;
        boolean z;
        int iLIZIZ;
        float primaryHorizontal;
        if (view instanceof C565430MFp) {
            c565430MFp = (C565430MFp) view;
        } else {
            c565430MFp = null;
        }
        boolean z2 = false;
        if (c565430MFp == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return ((C565400MFm) aTListenerS442S0100000_8.l0).LLJLILLLLZIIL;
                    }
                    C565400MFm c565400MFm = (C565400MFm) aTListenerS442S0100000_8.l0;
                    c565400MFm.LLJLILLLLZIIL = false;
                    c565400MFm.LLJLIL = null;
                    c565400MFm.LLLLLJIL();
                    return false;
                }
                if (!((C565400MFm) aTListenerS442S0100000_8.l0).LLJLILLLLZIIL) {
                    return false;
                }
                float scaledTouchSlop = ViewConfiguration.get(c565430MFp.getContext()).getScaledTouchSlop();
                if (Math.abs(motionEvent.getX() - ((C565400MFm) aTListenerS442S0100000_8.l0).LLJLL) > scaledTouchSlop || Math.abs(motionEvent.getY() - ((C565400MFm) aTListenerS442S0100000_8.l0).LLJLLIL) > scaledTouchSlop) {
                    C565400MFm c565400MFm2 = (C565400MFm) aTListenerS442S0100000_8.l0;
                    c565400MFm2.LLJLILLLLZIIL = false;
                    c565400MFm2.LLJLIL = null;
                    c565400MFm2.LLLLLJIL();
                    return true;
                }
                return true;
            }
            C565400MFm c565400MFm3 = (C565400MFm) aTListenerS442S0100000_8.l0;
            if (!c565400MFm3.LLJLILLLLZIIL) {
                return false;
            }
            c565400MFm3.LLJLILLLLZIIL = false;
            C557390LtZ c557390LtZ = c565400MFm3.LLJLIL;
            c565400MFm3.LLJLIL = null;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                z2 = true;
            }
            if (c557390LtZ != null && !z2) {
                ((C565400MFm) aTListenerS442S0100000_8.l0).LLLLIL().LJFF.invoke(c557390LtZ);
                Iterator it2 = ((ArrayList) c565430MFp.LLIZ).iterator();
                while (it2.hasNext()) {
                    Function1<C557390LtZ, Unit> function1 = ((C565450MFr) it2.next()).LJ;
                    if (function1 != null) {
                        function1.invoke(c557390LtZ);
                    }
                }
                ((C565430MFp) view).performClick();
                return true;
            }
            return true;
        }
        Editable editableLLLZIL = C2204961BRm.LLLZIL(c565430MFp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null));
        if (editableLLLZIL == null || (layout = c565430MFp.getLayout()) == null) {
            return false;
        }
        float x = (motionEvent.getX() - c565430MFp.getTotalPaddingLeft()) + c565430MFp.getScrollX();
        float y = (motionEvent.getY() - c565430MFp.getTotalPaddingTop()) + c565430MFp.getScrollY();
        if (x >= 0.0f && y >= 0.0f) {
            WeakHashMap<View, C0P0T> weakHashMap = C1325340kaq.LLJILJIL;
            C1325340kaq c1325340kaqLIZ = C0SXL.LIZ(layout, editableLLLZIL, x, y, 0.0f);
            if (c1325340kaqLIZ == null) {
                C565400MFm c565400MFm4 = (C565400MFm) aTListenerS442S0100000_8.l0;
                c565400MFm4.LLJLILLLLZIIL = false;
                c565400MFm4.LLLLLJIL();
                return false;
            }
            C565400MFm c565400MFm5 = (C565400MFm) aTListenerS442S0100000_8.l0;
            c565400MFm5.LLJLILLLLZIIL = true;
            c565400MFm5.LLJLL = motionEvent.getX();
            ((C565400MFm) aTListenerS442S0100000_8.l0).LLJLLIL = motionEvent.getY();
            c565430MFp.getLocationInWindow(new int[2]);
            int lineForVertical = layout.getLineForVertical((int) y);
            int lineBaseline = layout.getLineBaseline(lineForVertical);
            Paint.FontMetrics fontMetrics = c565430MFp.getPaint().getFontMetrics();
            float f = lineBaseline + ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            int spanStart = editableLLLZIL.getSpanStart(c1325340kaqLIZ);
            int i = spanStart - 1;
            if (i < 0) {
                i = 0;
            }
            C1325340kaq[] c1325340kaqArr = (C1325340kaq[]) editableLLLZIL.getSpans(i, spanStart, C1325340kaq.class);
            int length = c1325340kaqArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (editableLLLZIL.getSpanEnd(c1325340kaqArr[i2]) == spanStart) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            int paragraphDirection = layout.getParagraphDirection(lineForVertical);
            float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            if (paragraphDirection < 0) {
                primaryHorizontal = layout.getPrimaryHorizontal(spanStart) - fLIZIZ2;
            } else {
                primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            }
            float f2 = fLIZIZ / 2.0f;
            float f3 = primaryHorizontal + iLIZIZ + f2;
            float f4 = f - f2;
            ((C565400MFm) aTListenerS442S0100000_8.l0).LLJJLIIIJLLLLLLLZ = Integer.valueOf(C814420VxA.LIZIZ(r4[0] + ((f3 + c565430MFp.getTotalPaddingLeft()) - c565430MFp.getScrollX())));
            ((C565400MFm) aTListenerS442S0100000_8.l0).LLJL = Integer.valueOf(C814420VxA.LIZIZ(r4[1] + ((f4 + c565430MFp.getTotalPaddingTop()) - c565430MFp.getScrollY())) - C814420VxA.LIZIZ(c565430MFp.getResources().getDisplayMetrics().density * 3.5f));
            ((C565400MFm) aTListenerS442S0100000_8.l0).LLJLIL = c1325340kaqLIZ.LIZIZ();
            return true;
        }
        C565400MFm c565400MFm6 = (C565400MFm) aTListenerS442S0100000_8.l0;
        c565400MFm6.LLJLILLLLZIIL = false;
        c565400MFm6.LLLLLJIL();
        return false;
    }

    public static final boolean onTouch$5(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C568420MRc) aTListenerS442S0100000_8.l0).getClass();
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        ((C568420MRc) aTListenerS442S0100000_8.l0).getClass();
        return false;
    }
}
