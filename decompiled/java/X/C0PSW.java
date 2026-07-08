package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0PSW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSW extends FrameLayout {
    public boolean LL;
    public boolean LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LL || this.LLILLJJLI) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setContainAlphaForStreamPatch(boolean z) {
        float f;
        if (this.LL) {
            return;
        }
        this.LLILLJJLI = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
        invalidate();
    }

    public final void setNullifyStatus(boolean z) {
        float f;
        this.LL = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
        invalidate();
    }

    public C0PSW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (C0DG1.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }
}
