package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.10dS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19290410dS {
    public final GestureDetector LIZ;

    public C19290410dS() {
        throw null;
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        return this.LIZ.onTouchEvent(motionEvent);
    }

    public final void LIZIZ(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.LIZ.setOnDoubleTapListener(onDoubleTapListener);
    }

    public C19290410dS(Context context, GestureDetector.OnGestureListener onGestureListener, BPEAHandler bPEAHandler) {
        this.LIZ = new GestureDetector(context, onGestureListener, bPEAHandler);
    }
}
