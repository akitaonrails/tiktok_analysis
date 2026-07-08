package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011940cRM extends C21599719g3 {
    public float LLLLZI;
    public boolean LLLLZIL;
    public List<Rect> LLLLZLL;

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public final void setWithinExclusionArea(boolean z) {
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        C1591860rWi.LIZ(this, new C995140c0G(this));
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && getCurrentItem() == 0) {
                if (this.LLLLZI < x) {
                    z = true;
                } else {
                    z = false;
                }
                if (C426750GoL.LIZLLL(getContext())) {
                    if (!z) {
                        return false;
                    }
                } else if (z) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        } else {
            this.LLLLZI = x;
            this.LLLLZIL = true;
            float y = motionEvent.getY();
            List<Rect> list = this.LLLLZLL;
            if (list != null) {
                Iterator<Rect> it2 = list.iterator();
                while (it2.hasNext() && !it2.next().contains((int) x, (int) y)) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setUnderUserAction(boolean z) {
        this.LLLLZIL = z;
    }

    public C1011940cRM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
