package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418770GbT extends View {
    public C418770GbT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Drawable drawableLIZ = C19733712It.LIZ(context, attributeSet);
        if (drawableLIZ != null) {
            setBackground(drawableLIZ);
        }
    }
}
