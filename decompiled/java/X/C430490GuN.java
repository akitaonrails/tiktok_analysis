package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430490GuN extends C430480GuM {
    public int LLIZLLLIL;

    public int getHookAtMaxWidth() {
        return this.LLIZLLLIL;
    }

    public C430490GuN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C430480GuM, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLIZLLLIL = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }
}
