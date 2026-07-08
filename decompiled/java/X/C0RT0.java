package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0RT0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RT0 extends FrameLayout {
    public final ArrayList<View.OnTouchListener> LL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final int getOnTouchListenerSize() {
        return this.LL.size();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<View.OnTouchListener> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onTouch(this, motionEvent);
        }
        return true;
    }

    public C0RT0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
    }
}
