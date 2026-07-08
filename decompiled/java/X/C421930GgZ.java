package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421930GgZ extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final Drawable getSelectedDrawable() {
        return (Drawable) this.LLILZIL.getValue();
    }

    private final Drawable getUnselectedDrawable() {
        return (Drawable) this.LLILZLL.getValue();
    }

    public final void LIZ(int i) {
        ImageView imageView;
        Drawable unselectedDrawable;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof ImageView) && (imageView = (ImageView) childAt) != null) {
                if (i2 == i) {
                    unselectedDrawable = getSelectedDrawable();
                } else {
                    unselectedDrawable = getUnselectedDrawable();
                }
                imageView.setImageDrawable(unselectedDrawable);
            }
        }
    }

    public final void setDotCount(int i) {
        boolean z;
        Drawable unselectedDrawable;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView = new ImageView(getContext());
            int i3 = this.LLILLL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            layoutParams.setMarginEnd(this.LLILZ);
            C786410Ut5.c6(imageView, layoutParams);
            if (z) {
                unselectedDrawable = getSelectedDrawable();
            } else {
                unselectedDrawable = getUnselectedDrawable();
            }
            imageView.setImageDrawable(unselectedDrawable);
            addView(imageView);
        }
    }

    public C421930GgZ(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        setOrientation(0);
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.z4);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, c1361400lX0);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a01, c1361400lX0);
        this.LLILLJJLI = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1544));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1545));
    }
}
