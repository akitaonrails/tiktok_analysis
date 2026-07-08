package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.03ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C977203ru extends C197039127h {
    public boolean LLLIIIL;

    public C977203ru(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setNeedCustomColor(boolean z) {
        this.LLLIIIL = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (!this.LLLIIIL) {
            super.setPressed(z);
        }
    }

    public C977203ru(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
