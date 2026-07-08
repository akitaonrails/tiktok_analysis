package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418760GbS extends FrameLayout {
    public C418760GbS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Drawable drawableLIZ = C19733712It.LIZ(context, attributeSet);
        if (drawableLIZ != null) {
            setBackground(drawableLIZ);
        }
    }
}
