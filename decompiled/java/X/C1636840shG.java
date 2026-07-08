package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0shG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636840shG extends C19518211Xw {
    public boolean LLIZLLLIL;

    @Override // android.view.View
    public final boolean isFocused() {
        return this.LLIZLLLIL;
    }

    public C1636840shG(Context context) {
        super(context, null, 0);
    }

    public final void setMarqueeEnable(boolean z) {
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
            onWindowFocusChanged(z);
        }
    }
}
