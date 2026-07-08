package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DUN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUN extends RecyclerView {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    public C0DUN(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Number numberValueOf;
        Number numberValueOf2 = 0;
        if (motionEvent != null) {
            numberValueOf = Float.valueOf(motionEvent.getX());
        } else {
            numberValueOf = numberValueOf2;
        }
        int iIntValue = numberValueOf.intValue();
        if (motionEvent != null) {
            numberValueOf2 = Float.valueOf(motionEvent.getY());
        }
        int iIntValue2 = numberValueOf2.intValue();
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2 && (!this.LLILLL || Math.abs(iIntValue2 - this.LLILLJJLI) < Math.abs(iIntValue - this.LL))) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.LL = iIntValue;
        this.LLILLJJLI = iIntValue2;
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setIsOpen(boolean z) {
        this.LLILLL = z;
    }
}
