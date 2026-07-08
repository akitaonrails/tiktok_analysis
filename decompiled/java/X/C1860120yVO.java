package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0yVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860120yVO implements InterfaceC1860300yVg {
    @Override // X.InterfaceC1860300yVg
    public final Drawable LIZ(int i, int i2, CharSequence charSequence) {
        boolean z;
        TextView textViewLIZ;
        C1860100yVM c1860100yVM;
        C2248251Cz9 textSelector;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (charSequence instanceof Spanned) {
            textViewLIZ = C448980Hj6.LIZ((Spanned) charSequence);
        } else {
            textViewLIZ = null;
        }
        if (!(textViewLIZ instanceof C1860130yVP) || (c1860100yVM = (C1860100yVM) textViewLIZ) == null || i < 0 || i2 < i || (textSelector = c1860100yVM.getTextSelector()) == null || !textSelector.LJIILL || i < textSelector.LJIIJJI || i2 > textSelector.LJIIL) {
            return null;
        }
        return new ColorDrawable(c1860100yVM.getSelectedColor());
    }
}
