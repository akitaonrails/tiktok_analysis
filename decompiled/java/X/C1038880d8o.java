package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038880d8o extends FrameLayout {
    public final C01GW LL;
    public View.OnClickListener LLILLJJLI;
    public final C1077570e9D LLILLL;

    private final GestureDetector getWebViewGestureDetector() {
        return (GestureDetector) this.LL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Boolean boolValueOf;
        if (motionEvent != null) {
            boolValueOf = Boolean.valueOf(getWebViewGestureDetector().onTouchEvent(motionEvent));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.LLILLJJLI = onClickListener;
    }

    public C1038880d8o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS417S0200000_16(context, this, 74));
        this.LLILLL = new C1077570e9D(this, 4);
    }
}
