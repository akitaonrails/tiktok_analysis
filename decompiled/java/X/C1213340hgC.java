package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213340hgC extends ScrollView {
    public boolean LL;
    public Function0<Unit> LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1213340hgC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == 0 && this.LL) {
            this.LL = false;
            Function0<Unit> function0 = this.LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
            this.LLILLJJLI = null;
        }
    }
}
