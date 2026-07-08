package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS45S0102000_18;

/* JADX INFO: renamed from: X.0hEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196110hEP extends TuxTextView {
    public ViewPager LLJJJJ;
    public final C1196120hEQ LLJJJJJIL;

    public final void setViewPager(ViewPager viewPager) {
        int currentItem;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.LLJJJJ = viewPager;
            viewPager.removeOnPageChangeListener(this.LLJJJJJIL);
            ViewPager viewPager2 = this.LLJJJJ;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(this.LLJJJJJIL);
            }
            C1196120hEQ c1196120hEQ = this.LLJJJJJIL;
            ViewPager viewPager3 = this.LLJJJJ;
            if (viewPager3 != null) {
                currentItem = viewPager3.getCurrentItem();
            } else {
                currentItem = 0;
            }
            c1196120hEQ.onPageSelected(currentItem);
        }
    }

    public C1196110hEP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJJIL = new C1196120hEQ(this);
        setTextColor(C960203pA.LIZ(R.attr.ef, getContext()));
        setTuxFont(33);
    }

    public final void LJJJJJ(int i, int i2) {
        C0CNO.LIZLLL(0L, new AwS45S0102000_18(this, i, i2, 2));
    }
}
