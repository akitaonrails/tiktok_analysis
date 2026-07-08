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

/* JADX INFO: renamed from: X.0Gl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424720Gl4 extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    public C424720Gl4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

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

    public C424720Gl4(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setOrientation(0);
        this.LL = C475630Ikz.LIZIZ(R.attr.ee, context);
        this.LLILLJJLI = C475630Ikz.LIZIZ(R.attr.eh, context);
        Double dValueOf = Double.valueOf(5.4d);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 20));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 21));
    }
}
