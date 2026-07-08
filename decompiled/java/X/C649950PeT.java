package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0PeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649950PeT extends C650210Pet {
    public int LLILZLL;
    public boolean LLIZ;
    public EnumC094100Xb LLIZLLLIL;
    public float LLJ;

    public final boolean LIZLLL(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (motionEvent == null || !this.LLIZ) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LLJ = motionEvent.getX();
        }
        if (motionEvent.getAction() == 2) {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLIZLLLIL == EnumC094100Xb.START) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z ^ z2) {
                if (motionEvent.getX() - this.LLJ > 0.0f) {
                    return true;
                }
            } else if (motionEvent.getX() - this.LLJ < 0.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C650210Pet, X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((Number) C0BQJ.LIZ.getValue()).intValue() == 1 && LIZLLL(motionEvent)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C650210Pet, X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (((Number) C0BQJ.LIZ.getValue()).intValue() == 1 && LIZLLL(motionEvent)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public C649950PeT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = EnumC094100Xb.START;
    }
}
