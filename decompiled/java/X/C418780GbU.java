package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418780GbU extends LinearLayout {
    public C418780GbU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C418780GbU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawableLIZ = C19733712It.LIZ(context, attributeSet);
        if (drawableLIZ != null) {
            setBackground(drawableLIZ);
        }
    }
}
