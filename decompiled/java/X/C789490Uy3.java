package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;

/* JADX INFO: renamed from: X.0Uy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789490Uy3 extends FrameLayout {
    public boolean LL;

    public C789490Uy3(Context context) {
        this(context, null, 6);
    }

    public C789490Uy3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getView() {
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            return (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) childAt;
        }
        return null;
    }

    public final boolean getInterceptTouchEvent() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LL;
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.LL = z;
    }

    public final void setView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ViewGroup.LayoutParams(-1, -1));
    }

    public C789490Uy3(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
