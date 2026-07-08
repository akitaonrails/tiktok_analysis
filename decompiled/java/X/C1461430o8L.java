package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import kotlin.jvm.functions.Function0;
import zoo.b;

/* JADX INFO: renamed from: X.0o8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461430o8L extends AbstractC1461450o8N {
    public final InterfaceC1461390o8H LIZ;

    @Override // X.InterfaceC21664819qY
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // X.InterfaceC21664819qY
    public final boolean onScaleBegin() {
        return false;
    }

    @Override // X.InterfaceC21664819qY
    public final boolean setExposureSeekBarProgress(float f) {
        return false;
    }

    public C1461430o8L(InterfaceC1461390o8H interfaceC1461390o8H, final Function0<Rect> function0) {
        this.LIZ = interfaceC1461390o8H;
        final C0FEW rootView = interfaceC1461390o8H.getRootView();
        interfaceC1461390o8H.LIZIZ(new GestureInteractItem(0, new GestureLayout$OnGestureListener(rootView, function0) { // from class: X.0o8M
            public final View LL;
            public final Function0<Rect> LLILLJJLI;

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZLLL() {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJ() {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJFF(b bVar) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJIIIZ(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJIJJ(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJJIJIIJIL(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJJLIIIJLJLI(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLJI(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void onTouchEvent(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                return false;
            }

            {
                this.LL = rootView;
                ViewConfiguration.get(C0CHQ.LIZ).getScaledPagingTouchSlop();
                C0CHQ.LIZ.getResources().getDisplayMetrics();
                this.LLILLJJLI = function0;
            }
        }));
    }
}
