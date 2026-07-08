package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.124s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196972124s extends C21410318qb {
    public int LLIZ;

    public final int getSelectionMinIndex() {
        return this.LLIZ;
    }

    public final void setSelectionMinIndex(int i) {
        this.LLIZ = i;
    }

    public C196972124s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        int i3 = this.LLIZ;
        if (i <= i3) {
            setSelection(i3);
        }
        super.onSelectionChanged(i, i2);
    }
}
