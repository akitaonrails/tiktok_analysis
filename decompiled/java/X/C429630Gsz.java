package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0Gsz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429630Gsz extends ConstraintLayout {
    public boolean LL;
    public int LLILLJJLI;
    public int LLILLL;

    public final void e0(boolean z) {
        this.LL = z;
        int i = 4;
        this.LLILLJJLI = 4;
        if (!z) {
            i = this.LLILLL;
        }
        super.setVisibility(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.LLILLL = i;
        if (this.LL) {
            i = this.LLILLJJLI;
        }
        super.setVisibility(i);
    }

    public C429630Gsz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C429630Gsz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = 8;
        this.LLILLL = getVisibility();
    }
}
