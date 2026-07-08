package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.117P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C117P extends C117Q {
    public final boolean LLILZIL;

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(72091);
        if (this.LLILZIL && super.onTouchEvent(motionEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return z;
    }

    public C117P(final Context context, final AttributeSet attributeSet) {
        new C21594419fC(context, attributeSet) { // from class: X.117Q
            public void setScrollable(boolean z) {
            }

            @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (this.LLILLL && super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        };
        this.LLILZIL = true;
    }
}
