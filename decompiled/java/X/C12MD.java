package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12MD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12MD extends C12ME {
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;

    @Override // X.C12ME, android.widget.ProgressBar
    public int getProgress() {
        String strValueOf;
        int progress = super.getProgress();
        if (this.LLJJIJIL) {
            float f = progress;
            strValueOf = f >= ((float) getMax()) / 2.0f ? String.valueOf((int) (((this.LLJJIJIIJIL / (getMax() / 2.0f)) * f) - this.LLJJIJIIJIL)) : String.valueOf((int) ((((-this.LLJJIJI) / (getMax() / 2.0f)) * f) + this.LLJJIJI));
        } else {
            strValueOf = String.valueOf((int) ((((this.LLJJIJIIJIL - this.LLJJIJI) / getMax()) * progress) + this.LLJJIJI));
        }
        this.LLILLL = strValueOf;
        return progress;
    }

    public final int getMaxValue() {
        return this.LLJJIJIIJIL;
    }

    public final int getMinValue() {
        return this.LLJJIJI;
    }

    public final void setDoubleDirection(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setMaxValue(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setMinValue(int i) {
        this.LLJJIJI = i;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        int progress = super.getProgress();
        super.setProgress(i);
        if (progress == super.getProgress()) {
            invalidate();
        }
    }

    public C12MD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            this.LLILZ.setColor(context.getResources().getColor(R.color.x4));
            this.LLILZ.setFakeBoldText(true);
        }
    }
}
