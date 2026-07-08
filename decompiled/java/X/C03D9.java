package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03D9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03D9 extends LinearLayout {
    public int LL;

    public C03D9(Context context) {
        super(context);
        setOrientation(0);
    }

    public final void setCount(int i) {
        float f;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        if (i <= 1) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        int visibility2 = getVisibility();
        int i2 = 0;
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        do {
            View view = new View(getContext());
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ);
            if (i2 > 0) {
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            }
            C786410Ut5.W5(view, layoutParams);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
            view.setBackground(c384050F3z.LIZ(getContext()));
            if (i2 == this.LL) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.T4(view, f);
            addView(view);
            i2++;
        } while (i2 < i);
    }

    public final void setSelected(int i) {
        float f;
        if (i == this.LL) {
            return;
        }
        this.LL = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if (i2 == this.LL) {
                    f = 1.0f;
                } else {
                    f = 0.4f;
                }
                C786410Ut5.T4(childAt, f);
            }
        }
    }
}
