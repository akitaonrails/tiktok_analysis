package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C422210Gh1 extends LinearLayout {
    public TextView LL;
    public SeekBar LLILLJJLI;
    public boolean LLILLL;

    public void LIZ() {
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar == null || this.LL == null) {
            return;
        }
        int paddingLeft = seekBar.getPaddingLeft();
        int measuredWidth = (this.LLILLJJLI.getMeasuredWidth() - paddingLeft) - this.LLILLJJLI.getPaddingRight();
        int progress = this.LLILLJJLI.getProgress();
        this.LL.setText(String.valueOf(progress));
        double measuredWidth2 = (((double) paddingLeft) + ((((double) progress) / 100.0d) * ((double) measuredWidth))) - (((double) this.LL.getMeasuredWidth()) / 2.0d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LL.getLayoutParams());
        layoutParams.leftMargin = (int) measuredWidth2;
        C786410Ut5.g6(this.LL, layoutParams);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LL = (TextView) getChildAt(0);
        this.LLILLJJLI = (SeekBar) getChildAt(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (zDispatchTouchEvent) {
            LIZ();
        }
        return zDispatchTouchEvent;
    }

    public C422210Gh1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar != null && seekBar.getMeasuredWidth() != 0 && this.LLILLL) {
            LIZ();
            this.LLILLL = false;
        }
    }
}
