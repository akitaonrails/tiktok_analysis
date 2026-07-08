package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341690DaR extends FrameLayout {
    public final List<Function0<Unit>> LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (zDispatchTouchEvent) {
            Iterator<Function0<Unit>> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
        }
        return zDispatchTouchEvent;
    }

    public C341690DaR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList();
    }
}
