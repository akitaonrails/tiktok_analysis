package X;

import android.view.MotionEvent;
import zoo.b;

/* JADX INFO: renamed from: X.0ny6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455080ny6 extends C0FUM {
    public final C1462760oAU LL;

    public C1455080ny6(C1462760oAU c1462760oAU) {
        this.LL = c1462760oAU;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LL.setStartClickTime(System.currentTimeMillis());
        this.LL.LJJJIL(motionEvent);
        this.LL.LJJJJ(motionEvent);
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        return this.LL.getOnViewPagerClickListener().invoke(motionEvent).booleanValue();
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        this.LL.setCanClick(true);
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        this.LL.setCanScroll(true);
        return true;
    }
}
