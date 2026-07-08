package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.12Mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19742912Mh extends LinearLayout {
    public C19743212Mk LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C19743212Mk c19743212Mk;
        C737190Svt.LIZ.getClass();
        if (C737190Svt.LIZIZ() && (c19743212Mk = this.LL) != null) {
            if (motionEvent.getActionMasked() == 1) {
                c19743212Mk.LIZ.LL = null;
                c19743212Mk.LIZIZ.onNext(motionEvent);
                c19743212Mk.LIZIZ.onComplete();
            } else if (motionEvent.getActionMasked() == 2) {
                c19743212Mk.LIZIZ.onNext(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C19742912Mh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
