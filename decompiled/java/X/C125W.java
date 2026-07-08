package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import zoo.b;

/* JADX INFO: renamed from: X.125W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125W extends AbstractC21664419qU {
    public final EditTextStickerViewModel LL;

    public C125W(EditTextStickerViewModel editTextStickerViewModel) {
        this.LL = editTextStickerViewModel;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        return this.LL.E2(c21645419nQ);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        return this.LL.LJJLIIIJLJLI(f);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        return this.LL.LLLLJI(f);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        return this.LL.LLLZLZ(bVar);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.LL.onDown(motionEvent);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return this.LL.onScale(scaleGestureDetector);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.LL.onScaleBegin(scaleGestureDetector);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.LL.onSingleTapConfirmed(motionEvent);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        return this.LL.onUp(motionEvent);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        return this.LL.LLLLLLLLL(bVar, f, f2);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LL.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LL.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
