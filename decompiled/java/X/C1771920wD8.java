package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0wD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771920wD8 extends FrameLayout {
    public int LL;
    public int LLILLJJLI;

    public final int getHeightPercent() {
        return this.LLILLJJLI;
    }

    public final int getWidthPercent() {
        return this.LL;
    }

    public C1771920wD8(Context context) {
        super(context);
        this.LL = 100;
        this.LLILLJJLI = 100;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Integer num;
        int iMin;
        int iMax;
        int i;
        super.onConfigurationChanged(configuration);
        if (C1771910wD7.LIZJ() == 1 && (num = C1771910wD7.LIZIZ().enableOrientation) != null && num.intValue() == 1) {
            if (this.LL == 100 && this.LLILLJJLI == 100) {
                return;
            }
            if (configuration != null && configuration.orientation == 2) {
                iMin = Math.max(((View) getParent()).getMeasuredWidth(), ((View) getParent()).getMeasuredHeight());
                iMax = Math.min(((View) getParent()).getMeasuredWidth(), ((View) getParent()).getMeasuredHeight());
            } else {
                iMin = Math.min(((View) getParent()).getMeasuredWidth(), ((View) getParent()).getMeasuredHeight());
                iMax = Math.max(((View) getParent()).getMeasuredWidth(), ((View) getParent()).getMeasuredHeight());
            }
            int iLJ = C13LZ.LJ(this.LL, 0, 100);
            int i2 = -1;
            if (iLJ != 0) {
                if (iLJ != 100) {
                    i = (int) (((double) iMin) * (((double) iLJ) / 100.0d));
                } else {
                    i = -1;
                }
            } else {
                i = -2;
            }
            int iLJ2 = C13LZ.LJ(this.LLILLJJLI, 0, 100);
            if (iLJ2 != 0) {
                if (iLJ2 != 100) {
                    i2 = (int) (((double) iMax) * (((double) iLJ2) / 100.0d));
                }
            } else {
                i2 = -2;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }

    public final void setHeightPercent(int i) {
        this.LLILLJJLI = i;
    }

    public final void setWidthPercent(int i) {
        this.LL = i;
    }
}
