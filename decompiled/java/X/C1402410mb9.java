package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;

/* JADX INFO: renamed from: X.0mb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402410mb9 extends C21648719nx {
    public final int $t;
    public Object l0;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return 1 - this.$t != 0 ? super.onDoubleTap(motionEvent) : onDoubleTap$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return 1 - this.$t != 0 ? super.onFling(motionEvent, motionEvent2, f, f2) : onFling$0(this, motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (1 - this.$t != 0) {
            super.onLongPress(motionEvent);
        } else {
            onLongPress$0(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return 1 - this.$t != 0 ? super.onScroll(motionEvent, motionEvent2, f, f2) : onScroll$0(this, motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return 1 - this.$t != 0 ? super.onSingleTapConfirmed(motionEvent) : onSingleTapConfirmed$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.$t != 0 ? super.onSingleTapUp(motionEvent) : onSingleTapUp$0(this, motionEvent);
    }

    public C1402410mb9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDoubleTap$0(C1402410mb9 c1402410mb9, MotionEvent motionEvent) {
        float x;
        C1355780lNw c1355780lNw = (C1355780lNw) c1402410mb9.l0;
        float f = c1355780lNw.LJIIJ;
        if (f < 1.0f) {
            return true;
        }
        if (f > 1.0f) {
            InterfaceC1355840lO2 interfaceC1355840lO2 = c1355780lNw.LJFF;
            if (interfaceC1355840lO2 != null) {
                interfaceC1355840lO2.Oj("double_tap");
            }
            ((C1355780lNw) c1402410mb9.l0).LJIIJJI();
            return true;
        }
        InterfaceC1355840lO2 interfaceC1355840lO22 = c1355780lNw.LJFF;
        if (interfaceC1355840lO22 != null) {
            float y = -1.0f;
            if (motionEvent != null) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            } else {
                x = -1.0f;
            }
            interfaceC1355840lO22.ai(x, y);
        }
        return true;
    }

    public static final void onLongPress$0(C1402410mb9 c1402410mb9, MotionEvent motionEvent) {
        ViewGroup viewGroup;
        C1355780lNw c1355780lNw = (C1355780lNw) c1402410mb9.l0;
        if (c1355780lNw.LJIIJ == 1.0f && c1355780lNw.LJJIJIIJIL) {
            InterfaceC1355840lO2 interfaceC1355840lO2 = c1355780lNw.LJFF;
            if (interfaceC1355840lO2 != null) {
                interfaceC1355840lO2.O1();
            }
            C1355780lNw c1355780lNw2 = (C1355780lNw) c1402410mb9.l0;
            c1355780lNw2.LJJIJ = true;
            ViewParent parent = c1355780lNw2.LIZJ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public static final boolean onSingleTapConfirmed$0(C1402410mb9 c1402410mb9, MotionEvent motionEvent) {
        InterfaceC1355840lO2 interfaceC1355840lO2;
        C1355780lNw c1355780lNw = (C1355780lNw) c1402410mb9.l0;
        if (c1355780lNw.LJIIJ > 1.0f) {
            InterfaceC1355840lO2 interfaceC1355840lO22 = c1355780lNw.LJFF;
            if (interfaceC1355840lO22 != null) {
                interfaceC1355840lO22.Oj("single_tap");
            }
            ((C1355780lNw) c1402410mb9.l0).LJIIJJI();
            return true;
        }
        C01GW c01gw = C0A8Y.LIZ;
        if (!C0A8Y.LIZIZ || (interfaceC1355840lO2 = c1355780lNw.LJFF) == null) {
            return true;
        }
        interfaceC1355840lO2.LLZZ();
        return true;
    }

    public static final boolean onSingleTapUp$0(C1402410mb9 c1402410mb9, MotionEvent motionEvent) {
        ICommentMentionAssemAbility iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((RefactorKeyboardPanelV2) c1402410mb9.l0), ICommentMentionAssemAbility.class, null);
        if (iCommentMentionAssemAbility != null && iCommentMentionAssemAbility.tS()) {
            iCommentMentionAssemAbility.A51(true);
        }
        return super.onSingleTapUp(motionEvent);
    }

    public static final boolean onFling$0(C1402410mb9 c1402410mb9, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        boolean z2;
        C1355780lNw c1355780lNw = (C1355780lNw) c1402410mb9.l0;
        if (c1355780lNw.LJIIJ <= 1.0f) {
            return false;
        }
        RectF rectFLJI = c1355780lNw.LJI();
        float width = c1355780lNw.LJ.getWidth();
        float height = c1355780lNw.LJ.getHeight();
        if (rectFLJI.width() <= width && rectFLJI.height() <= height) {
            return false;
        }
        int i = -((int) Math.max(rectFLJI.right - width, 0.0f));
        int iMax = (int) Math.max(0.0f - rectFLJI.left, 0.0f);
        int i2 = -((int) Math.max(rectFLJI.bottom - height, 0.0f));
        int iMax2 = (int) Math.max(0.0f - rectFLJI.top, 0.0f);
        if (i == 0 && iMax == 0 && i2 == 0 && iMax2 == 0) {
            return false;
        }
        if ((f > 0.0f && iMax > 0) || (f < 0.0f && i < 0)) {
            z = true;
        } else {
            z = false;
        }
        if ((f2 > 0.0f && iMax2 > 0) || (f2 < 0.0f && i2 < 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        c1355780lNw.LJIILIIL = 0;
        c1355780lNw.LJIILJJIL = 0;
        c1355780lNw.LJII().fling(0, 0, (int) f, (int) f2, i, iMax, i2, iMax2);
        c1355780lNw.LIZJ.postInvalidateOnAnimation();
        return true;
    }

    public static final boolean onScroll$0(C1402410mb9 c1402410mb9, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getPointerCount() < 2) {
            return false;
        }
        C1355780lNw c1355780lNw = (C1355780lNw) c1402410mb9.l0;
        if (!c1355780lNw.LJJIJIIJI) {
            return false;
        }
        c1355780lNw.LJII.postTranslate(-f, -f2);
        c1355780lNw.LIZJ.setDisplayMatrix(c1355780lNw.LJII);
        ((C1355780lNw) c1402410mb9.l0).LJ();
        return true;
    }
}
