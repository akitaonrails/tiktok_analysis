package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.040j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C10283040j extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;

    public C10283040j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = getResources().getDimensionPixelOffset(R.dimen.m6);
        this.LLILLJJLI = getResources().getDimensionPixelOffset(R.dimen.m5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.LL * 2), this.LLILLJJLI), 1073741824), i2);
    }
}
