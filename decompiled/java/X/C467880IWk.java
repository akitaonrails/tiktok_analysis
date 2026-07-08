package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0IWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C467880IWk extends C1099140ei0 {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 3) {
            C784440Upu.LIZ().LIZIZ(new C469280Iak(1));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C467880IWk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
