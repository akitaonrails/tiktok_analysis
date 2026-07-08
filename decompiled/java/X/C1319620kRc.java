package X;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j27.s;

/* JADX INFO: renamed from: X.0kRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319620kRc extends LinearLayout {
    public int LL;

    private Rect getBoundRectForOverflow() {
        int i;
        if (this.LL == 3 || !(getContext() instanceof s)) {
            return null;
        }
        s sVar = (s) getContext();
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = sVar.LLJJJ;
        int i2 = 0;
        if ((getOverflow() & 1) != 0) {
            int i3 = displayMetrics.widthPixels;
            i = -i3;
            width += i3 * 2;
        } else {
            i = 0;
        }
        if ((getOverflow() & 2) != 0) {
            int i4 = displayMetrics.heightPixels;
            i2 = -i4;
            height += i4 * 2;
        }
        return new Rect(i, i2, width + i, height + i2);
    }

    public int getOverflow() {
        return this.LL;
    }

    public C1319620kRc(s sVar) {
        super(sVar);
    }

    public void setOverflow(int i) {
        this.LL = i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LL != 0) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            setClipChildren(false);
            setClipBounds(getBoundRectForOverflow());
            if (getChildAt(0) != null) {
                getChildAt(0).setClipBounds(getBoundRectForOverflow());
            }
        }
    }
}
