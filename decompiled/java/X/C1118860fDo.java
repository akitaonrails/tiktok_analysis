package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;

/* JADX INFO: renamed from: X.0fDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118860fDo {
    public final C1118850fDn LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0fDn] */
    public C1118860fDo(final View view) {
        this.LIZ = new InputFilter(view) { // from class: X.0fDn
            public final View LL;

            {
                this.LL = view;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (!this.LL.isInEditMode() && (charSequence instanceof String)) {
                    return C1834150xpV.LIZIZ((String) charSequence);
                }
                return charSequence;
            }
        };
    }
}
