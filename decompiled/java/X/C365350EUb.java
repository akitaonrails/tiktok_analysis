package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.SeekBar;

/* JADX INFO: renamed from: X.0EUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365350EUb extends C422210Gh1 {
    @Override // X.C422210Gh1
    public final void LIZ() {
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar == null || this.LL == null) {
            return;
        }
        int paddingStart = seekBar.getPaddingStart();
        int measuredWidth = (this.LLILLJJLI.getMeasuredWidth() - paddingStart) - this.LLILLJJLI.getPaddingEnd();
        int progress = this.LLILLJJLI.getProgress();
        this.LL.setText(String.valueOf(((C367060EaG) this.LLILLJJLI).getActualProgress()));
        C426750GoL.LJIIIZ(this.LL, Integer.valueOf((int) ((((double) (((ViewGroup.MarginLayoutParams) this.LLILLJJLI.getLayoutParams()).getMarginStart() + paddingStart)) + (((((double) progress) * 1.0d) / ((double) this.LLILLJJLI.getMax())) * ((double) measuredWidth))) - (((double) this.LL.getMeasuredWidth()) / 2.0d))), null, null, null, false, 30);
    }

    public C365350EUb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
