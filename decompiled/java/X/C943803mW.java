package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03mW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C943803mW extends LinearLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    public final void LIZ() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        int i = this.LL;
        int i2 = 1;
        if (1 > i) {
            return;
        }
        while (true) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.LLILZLL);
            layoutParams.weight = 1.0f;
            if (i2 != this.LL) {
                int i3 = this.LLILZIL;
                layoutParams.rightMargin = i3;
                layoutParams.setMarginEnd(i3);
            }
            C786410Ut5.W5(view, layoutParams);
            if (i2 <= this.LLILLJJLI) {
                view.setBackgroundColor(this.LLILLL);
            } else {
                view.setBackgroundColor(this.LLILZ);
            }
            addView(view);
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final int getDarkColor() {
        return this.LLILZ;
    }

    public final int getLightColor() {
        return this.LLILLL;
    }

    public final int getLightStep() {
        return this.LLILLJJLI;
    }

    public final int getTotalStep() {
        return this.LL;
    }

    public final void setDarkColor(int i) {
        this.LLILZ = i;
    }

    public final void setLightColor(int i) {
        this.LLILLL = i;
    }

    public final void setLightStep(int i) {
        if (i <= 0) {
            this.LLILLJJLI = 0;
        } else {
            this.LLILLJJLI = i;
        }
        LIZ();
    }

    public final void setTotalStep(int i) {
        this.LL = i;
        LIZ();
    }

    public C943803mW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 3;
        this.LLILLJJLI = 1;
        this.LLILLL = C960203pA.LIZ(R.attr.a04, context);
        this.LLILZ = C960203pA.LIZ(R.attr.br, context);
        int iLIZJ = (int) C12ES.LIZJ(2.0f, context);
        this.LLILZIL = iLIZJ;
        this.LLILZLL = iLIZJ;
        setOrientation(0);
        if (isInEditMode()) {
            LIZ();
        }
    }
}
