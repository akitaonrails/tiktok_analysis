package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Uu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C787020Uu4 extends RecyclerView {
    public double LL;

    public void setflingScale(double d) {
        this.LL = d;
    }

    public C787020Uu4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        return super.fling((int) (((double) i) * this.LL), i2);
    }
}
