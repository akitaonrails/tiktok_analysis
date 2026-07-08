package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mTE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397500mTE extends FrameLayout {
    public C1397500mTE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xt);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final void LIZ(C1397510mTF c1397510mTF, AbstractC1391440mJS abstractC1391440mJS) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        if (abstractC1391440mJS == null) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        } else {
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            abstractC1391440mJS.LIZ(c1397510mTF);
            addView(abstractC1391440mJS.LIZIZ());
        }
    }
}
