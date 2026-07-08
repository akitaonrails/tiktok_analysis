package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.11Xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19518111Xv extends FrameLayout {
    public C19518111Xv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19518111Xv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawableLIZIZ = C19734012Iw.LIZIZ(context, attributeSet, true);
        if (gradientDrawableLIZIZ != null) {
            setBackground(gradientDrawableLIZIZ);
        }
    }
}
