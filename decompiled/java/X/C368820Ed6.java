package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0Ed6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368820Ed6 extends AbstractC368670Ecr {
    @Override // X.AbstractC368670Ecr
    public final void LIZ() {
    }

    public C368820Ed6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int screenWidth = (getScreenWidth() / 2) - (C368690Ect.LJIIJ / 2);
        C369030EdR.LIZJ(this, screenWidth, getPaddingTop(), screenWidth, getPaddingBottom());
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int screenWidth = (getScreenWidth() / 2) - (C368690Ect.LJIIJ / 2);
        C369030EdR.LIZJ(this, screenWidth, getPaddingTop(), screenWidth, getPaddingBottom());
    }
}
