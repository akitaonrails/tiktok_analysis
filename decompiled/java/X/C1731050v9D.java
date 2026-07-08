package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.Arrays;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0v9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731050v9D {
    public static final void LIZ(C0I7D c0i7d) {
        if (c0i7d.isFocused()) {
            c0i7d.clearFocus();
        }
    }

    public static final void LIZIZ(C0I7D c0i7d) {
        C1972407o2 c1972407o2 = new InputFilter() { // from class: X.07o2
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return u.LJJIFFI(charSequence.toString(), "\n", "", false);
            }
        };
        InputFilter[] filters = c0i7d.getFilters();
        int length = filters.length;
        Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
        objArrCopyOf[length] = c1972407o2;
        c0i7d.setFilters((InputFilter[]) objArrCopyOf);
    }
}
