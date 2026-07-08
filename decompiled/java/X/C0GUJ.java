package X;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUJ extends LinearLayout {
    public final int LL;

    public C0GUJ(Context context) {
        super(context, null, 0);
        this.LL = C418440Gaw.LIZLLL(context) / 2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(Math.min(this.LL, getMeasuredWidth()), getMeasuredHeight());
    }
}
