package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0ezd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1110070ezd extends C16F9 {
    public Drawable LLJLLIL;

    public void setVerifiedDrawable(Drawable drawable) {
        this.LLJLLIL = drawable;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJLLIL) {
            return false;
        }
        return true;
    }

    public C1110070ezd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1110070ezd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
