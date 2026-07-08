package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0J2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485690J2x extends ConstraintLayout {
    public final List<View.OnTouchListener> LL;
    public final List<View.OnTouchListener> LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Iterator<View.OnTouchListener> it2 = this.LL.iterator();
        loop0: while (true) {
            z = false;
            while (it2.hasNext()) {
                if (it2.next().onTouch(this, motionEvent) || z) {
                    z = true;
                }
            }
        }
        if (z) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!zOnTouchEvent) {
            Iterator<View.OnTouchListener> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                if (!it2.next().onTouch(this, motionEvent) && !zOnTouchEvent) {
                    zOnTouchEvent = false;
                } else {
                    zOnTouchEvent = true;
                }
            }
        }
        return zOnTouchEvent;
    }

    public C485690J2x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C485690J2x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
    }
}
