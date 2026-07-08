package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.124Y, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C124Y extends C21410318qb {
    public abstract void LJIIIIZZ(int i);

    public abstract int getDefaultTextSize();

    public abstract int getEditFontSize();

    public abstract void setDefaultTextSize(int i);

    public abstract void setEditFontSize(int i);

    public abstract void setFontTypeChangedListener(C0F50 c0f50);

    public final void setFontSize(int i) {
        getLineSpacingExtra();
        getDefaultTextSize();
        LJIIIIZZ(i);
    }

    public C124Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
