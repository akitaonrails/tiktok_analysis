package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0wHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774750wHh extends AbstractC1086560eNi {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1749180vcS.LIZ.getClass();
        if (C1749180vcS.LIZLLL(this, this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1749180vcS.LIZ.getClass();
        if (C1749180vcS.LJ(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public C1774750wHh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJIFFI(int i, final int i2) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
            stopScroll();
            final Context context = getContext();
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0wHi
                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIIIIZZ(int i3, int i4, int i5, int i6, int i7) {
                    return (i5 - i3) + i2;
                }
            };
            c21674119s3.LIZ = i;
            layoutManager.startSmoothScroll(c21674119s3);
        }
    }

    public C1774750wHh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
