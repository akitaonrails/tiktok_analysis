package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0lDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349220lDM extends C21594419fC {
    public boolean LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setScrollable(boolean z) {
        this.LLILZIL = z;
    }

    public C1349220lDM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
    }
}
