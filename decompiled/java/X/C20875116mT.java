package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.16mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20875116mT extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new C16G0(context, attributeSet) { // from class: X.0kZM
            public boolean LLJJL;

            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (this.LLJJL) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            public final void setNoClick(boolean z) {
                this.LLJJL = z;
            }
        };
    }
}
