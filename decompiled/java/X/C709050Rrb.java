package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Rrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C709050Rrb extends LinearLayout implements C0DR8 {
    public C709050Rrb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0DR8.LJLLILLLL.getClass();
        if (C0DR7.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }

    public C709050Rrb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
