package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0UXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773810UXb extends ConstraintLayout {
    public final ConcurrentHashSet<InterfaceC773840UXe> LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator<InterfaceC773840UXe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C773810UXb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C773810UXb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ConcurrentHashSet<>();
    }
}
