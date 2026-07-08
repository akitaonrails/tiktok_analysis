package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0lCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1348840lCk extends LinearLayout {
    public C1348860lCm LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;

    public C1348860lCm getKeyBoardObservable() {
        return this.LL;
    }

    public void setKeyBoardObservable(C1348860lCm c1348860lCm) {
        this.LL = c1348860lCm;
    }

    public C1348840lCk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = -1;
        this.LL = new C1348860lCm();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILZLL) {
            if ((System.nanoTime() / 1000000) - this.LLILZIL > 1000) {
                this.LLILZLL = false;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        int i3 = this.LLILLL;
        int i4 = this.LLILLJJLI;
        if (i3 == i4) {
            C1348860lCm c1348860lCm = this.LL;
            if (c1348860lCm != null) {
                c1348860lCm.LIZIZ(i2, getContext());
            }
        } else {
            this.LLILLL = i4;
        }
        super.onMeasure(i, i2);
    }
}
