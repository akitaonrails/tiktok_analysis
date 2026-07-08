package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask;
import com.ss.android.ugc.aweme.component.slideupcompoent.model.AnoleUpSlideComponetDataModel;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;

/* JADX INFO: renamed from: X.0e9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077570e9D extends C21648719nx {
    public final int $t;
    public Object l0;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.$t) {
            case 3:
                return onDoubleTapEvent$0(this, motionEvent);
            case 4:
                return onDoubleTapEvent$1(this, motionEvent);
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onDown$0(this, motionEvent);
            case 1:
                return onDown$1(this, motionEvent);
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.$t) {
            case 0:
                return onScroll$0(this, motionEvent, motionEvent2, f, f2);
            case 1:
                return onScroll$1(this, motionEvent, motionEvent2, f, f2);
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.$t) {
            case 3:
                return onSingleTapConfirmed$0(this, motionEvent);
            case 4:
                return onSingleTapConfirmed$1(this, motionEvent);
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                return onSingleTapUp$0(this, motionEvent);
            case 2:
                return onSingleTapUp$1(this, motionEvent);
            case 3:
            case 4:
            default:
                return super.onSingleTapUp(motionEvent);
            case 5:
                return onSingleTapUp$2(this, motionEvent);
        }
    }

    public C1077570e9D(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDoubleTapEvent$0(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        ((C1035340d36) c1077570e9D.l0).LJJII();
        return true;
    }

    public static final boolean onDoubleTapEvent$1(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        C1038880d8o c1038880d8o = (C1038880d8o) c1077570e9D.l0;
        View.OnClickListener onClickListener = c1038880d8o.LLILLJJLI;
        if (onClickListener != null) {
            onClickListener.onClick(c1038880d8o);
            return true;
        }
        return true;
    }

    public static final boolean onDown$0(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        ((C1003650cDz) c1077570e9D.l0).LLJLLL = false;
        return super.onDown(motionEvent);
    }

    public static final boolean onDown$1(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        ((AwesomeSplashNewMask) c1077570e9D.l0).getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public static final boolean onSingleTapConfirmed$0(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        ((C1035340d36) c1077570e9D.l0).LJJII();
        return true;
    }

    public static final boolean onSingleTapConfirmed$1(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        C1038880d8o c1038880d8o = (C1038880d8o) c1077570e9D.l0;
        View.OnClickListener onClickListener = c1038880d8o.LLILLJJLI;
        if (onClickListener != null) {
            onClickListener.onClick(c1038880d8o);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r0 <= (r6 - r9)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onSingleTapUp$0(X.C1077570e9D r11, android.view.MotionEvent r12) {
        /*
            r10 = 1
            if (r12 == 0) goto L81
            java.lang.Object r8 = r11.l0
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask r8 = (com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask) r8
            r8.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r8.LLJJIII
            long r3 = r5 - r0
            r8.LLJJIII = r5
            r1 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r7 = 0
            if (r0 > 0) goto L22
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L22
        L21:
            return r7
        L22:
            com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$ClickableAreaInfo r1 = r8.LLJ
            if (r1 == 0) goto L7e
            android.content.Context r0 = r8.LLILLL
            int r6 = X.C14KQ.LJ(r0)
            android.content.Context r0 = r8.LLILLL
            int r5 = X.C14KQ.LJIIIIZZ(r0)
            int r0 = r1.marginBottom
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r9 = X.C814420VxA.LIZIZ(r0)
            int r0 = r1.marginTop
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
            int r0 = r1.marginLeft
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r3 = X.C814420VxA.LIZIZ(r0)
            int r0 = r1.marginRight
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r2 = X.C814420VxA.LIZIZ(r0)
            float r0 = r12.getRawX()
            int r1 = (int) r0
            float r0 = r12.getRawY()
            int r0 = (int) r0
            if (r3 > r1) goto L21
            int r5 = r5 - r2
            if (r1 > r5) goto L21
            if (r4 > r0) goto L21
            int r6 = r6 - r9
            if (r0 > r6) goto L21
        L7e:
            r8.LIZJ(r7)
        L81:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1077570e9D.onSingleTapUp$0(X.0e9D, android.view.MotionEvent):boolean");
    }

    public static final boolean onSingleTapUp$1(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        C1039440d9i c1039440d9i = (C1039440d9i) c1077570e9D.l0;
        System.currentTimeMillis();
        c1039440d9i.getClass();
        return super.onSingleTapUp(motionEvent);
    }

    public static final boolean onSingleTapUp$2(C1077570e9D c1077570e9D, MotionEvent motionEvent) {
        ((SparkWebViewTouchDelegate) c1077570e9D.l0).LJII = System.currentTimeMillis();
        return super.onSingleTapUp(motionEvent);
    }

    public static final boolean onScroll$0(C1077570e9D c1077570e9D, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2 == null) {
            return false;
        }
        C1003650cDz c1003650cDz = (C1003650cDz) c1077570e9D.l0;
        if (c1003650cDz.LLJLLL) {
            return false;
        }
        if (c1003650cDz.LLJLL.contains((int) motionEvent2.getX(), (int) motionEvent2.getY()) && f2 > 0.0f && Math.abs(f2) > Math.abs(f)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - c1003650cDz.LLJLILLLLZIIL >= 500) {
                c1003650cDz.LLJLILLLLZIIL = jCurrentTimeMillis;
                AnoleUpSlideComponetDataModel anoleUpSlideComponetDataModel = (AnoleUpSlideComponetDataModel) ((C1003650cDz) c1077570e9D.l0).LLJLLIL.getValue();
                if (anoleUpSlideComponetDataModel != null) {
                    C1003650cDz c1003650cDz2 = (C1003650cDz) c1077570e9D.l0;
                    c1003650cDz2.LLJLLL = true;
                    C1003640cDy.LIZIZ(c1003650cDz2, anoleUpSlideComponetDataModel);
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean onScroll$1(C1077570e9D c1077570e9D, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float y;
        boolean z;
        if (motionEvent != null) {
            y = motionEvent.getY();
        } else {
            y = ((AwesomeSplashNewMask) c1077570e9D.l0).LLJJLIIIJLLLLLLLZ;
        }
        if (motionEvent2 != null && Math.abs(f) < Math.abs(f2)) {
            ViewParent parent = ((AwesomeSplashNewMask) c1077570e9D.l0).getParent();
            if (motionEvent2.getY() > y) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return true;
    }
}
