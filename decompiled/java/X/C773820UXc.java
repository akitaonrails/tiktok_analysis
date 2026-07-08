package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0UXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773820UXc extends FrameLayout {
    public final ConcurrentHashSet<InterfaceC773840UXe> LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator<InterfaceC773840UXe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C773820UXc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ConcurrentHashSet<>();
    }
}
