package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: X.1653, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1653 extends C19U1 {
    public boolean LL;

    public final void LIZ() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(33);
        C444890HcV c444890HcV2 = new C444890HcV();
        c444890HcV2.LIZ(32);
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
            int childCount2 = viewGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    textView.setAllCaps(false);
                    C19U0 tabAt = getTabAt(i);
                    if (tabAt == null || !tabAt.LIZ()) {
                        textView.setTypeface(c444890HcV2.getTypeface());
                    } else {
                        textView.setTypeface(c444890HcV.getTypeface());
                    }
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setTabClickEnabled(boolean z) {
        this.LL = z;
    }

    public AnonymousClass1653(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }
}
