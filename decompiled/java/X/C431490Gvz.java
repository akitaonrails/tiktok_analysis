package X;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431490Gvz extends LinkMovementMethod {
    public static final C431490Gvz LIZ = new C431490Gvz();

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return false;
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
