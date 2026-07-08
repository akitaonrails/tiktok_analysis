package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: X.0GYA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYA extends FrameLayout {
    public int LL;
    public ProgressBar LLILLJJLI;
    public ProgressBar LLILLL;
    public ProgressBar LLILZ;
    public final ValueAnimator LLILZIL;

    public final ProgressBar getProcessBarView1() {
        ProgressBar progressBar = this.LLILLJJLI;
        if (progressBar != null) {
            return progressBar;
        }
        return null;
    }

    public final ProgressBar getProcessBarView2() {
        ProgressBar progressBar = this.LLILLL;
        if (progressBar != null) {
            return progressBar;
        }
        return null;
    }

    public final ProgressBar getProcessBarView3() {
        ProgressBar progressBar = this.LLILZ;
        if (progressBar != null) {
            return progressBar;
        }
        return null;
    }

    public final int getTotalPage() {
        return this.LL;
    }

    public final void setProcessBarView1(ProgressBar progressBar) {
        this.LLILLJJLI = progressBar;
    }

    public final void setProcessBarView2(ProgressBar progressBar) {
        this.LLILLL = progressBar;
    }

    public final void setProcessBarView3(ProgressBar progressBar) {
        this.LLILZ = progressBar;
    }

    public final void setTotalPage(int i) {
        this.LL = i;
    }

    public C0GYA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 2;
        this.LLILZIL = ValueAnimator.ofInt(1, 10);
    }
}
