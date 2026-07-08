package Y;

import X.C500260Jjc;
import X.C761750TuP;
import X.C761770TuR;
import X.C761830TuX;
import X.C781300Ukq;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class ATListenerS339S0200000_12 implements View.OnTouchListener {
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

    public ATListenerS339S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS339S0200000_12 aTListenerS339S0200000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            C786410Ut5.LJLLLLLL(8, ((C781300Ukq) aTListenerS339S0200000_12.l0).LIZLLL);
            ((C781300Ukq) aTListenerS339S0200000_12.l0).LIZLLL.setClickable(false);
            ((C781300Ukq) aTListenerS339S0200000_12.l0).LJIIJ.cancelAnimation();
        }
        ((View.OnTouchListener) aTListenerS339S0200000_12.l1).onTouch(view, motionEvent);
        return true;
    }

    public static final boolean onTouch$1(ATListenerS339S0200000_12 aTListenerS339S0200000_12, View view, MotionEvent motionEvent) {
        if (Intrinsics.LJFF(view, (ViewOnAttachStateChangeListenerC20604515jv) aTListenerS339S0200000_12.l0) && ((GestureDetector) aTListenerS339S0200000_12.l1).onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS339S0200000_12 aTListenerS339S0200000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            C761750TuP c761750TuP = (C761750TuP) aTListenerS339S0200000_12.l0;
            if (c761750TuP.LLIZ) {
                C761830TuX.LIZ();
                c761750TuP.LLIZ = false;
                C761770TuR c761770TuR = (C761770TuR) aTListenerS339S0200000_12.l1;
                C500260Jjc.LJLJLJ(c761770TuR.LLILZLL, false);
                ViewParent parent = c761770TuR.LLIZLLLIL.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }
        C761750TuP c761750TuP2 = (C761750TuP) aTListenerS339S0200000_12.l0;
        if (!c761750TuP2.LLIZ) {
            return false;
        }
        C761830TuX.LIZ();
        c761750TuP2.LLIZ = false;
        ((C761750TuP) aTListenerS339S0200000_12.l0).notifyDataSetChanged();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$3(Y.ATListenerS339S0200000_12 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            int r1 = r7.getAction()
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L6d
            if (r1 == r3) goto L53
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto L53
        L10:
            return r2
        L11:
            float r4 = r7.getX()
            float r3 = r7.getY()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            java.lang.Object r0 = r5.l1
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            java.lang.Object r0 = r5.l1
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3d
            return r2
        L3d:
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment r1 = (com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment) r1
            boolean r0 = r1.LLJJIJIL
            if (r0 == 0) goto L10
            r1.LLJJIJIL = r2
            java.lang.Object r0 = r5.l1
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            r1.cS(r0)
            return r2
        L53:
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment r1 = (com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment) r1
            boolean r0 = r1.LLJJIJIL
            if (r0 == 0) goto L66
            java.lang.Object r0 = r5.l1
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            r1.cS(r0)
        L66:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment r0 = (com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment) r0
            r0.LLJJIJIL = r2
            return r2
        L6d:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment r0 = (com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment) r0
            X.19M4 r4 = r0.LLJJIJI
            if (r4 == 0) goto La2
            X.0F3z r1 = new X.0F3z
            r1.<init>()
            r0 = 2131100570(0x7f06039a, float:1.7813525E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            r0 = 99
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.LIZJ = r0
            java.lang.Object r0 = r5.l1
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r4.setBackground(r0)
        La2:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment r0 = (com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment) r0
            android.widget.FrameLayout r0 = r0.LLJJIJIIJIL
            if (r0 == 0) goto Lad
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment.dS(r0, r2, r2)
        Lad:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment r0 = (com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment) r0
            r0.LLJJIJIL = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS339S0200000_12.onTouch$3(Y.ATListenerS339S0200000_12, android.view.View, android.view.MotionEvent):boolean");
    }
}
