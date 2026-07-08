package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.16gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20837116gL extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new ConstraintLayout(context, attributeSet) { // from class: X.16jj
            @Override // android.view.ViewGroup
            public final boolean drawChild(Canvas canvas, View view, long j) {
                if (C0DG1.LIZ(view) && super.drawChild(canvas, view, j)) {
                    return true;
                }
                return false;
            }
        };
    }
}
