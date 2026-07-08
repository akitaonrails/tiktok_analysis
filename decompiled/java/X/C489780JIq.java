package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489780JIq extends C0JN0 implements InterfaceC489790JIr {
    public final GestureDetector LLILLL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            getPlayerChannel().LJI.setValue(Boolean.FALSE);
        }
        if (this.LLILLL.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public C489780JIq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dff, this, true);
        this.LLILLL = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0JIo
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                this.LL.getClass();
                return false;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                this.LL.getPlayerChannel().LJI.setValue(Boolean.TRUE);
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C489780JIq c489780JIq = this.LL;
                C23250099c.LIZLLL(c489780JIq.getCoroutineScope(), null, null, new C489750JIn(c489780JIq, null), 3);
                return true;
            }
        });
    }
}
