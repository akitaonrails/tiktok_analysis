package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0GbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418790GbV extends RelativeLayout {
    public C418790GbV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Drawable drawableLIZ = C19733712It.LIZ(context, attributeSet);
        if (drawableLIZ != null) {
            setBackground(drawableLIZ);
        }
    }
}
