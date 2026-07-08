package X;

import android.text.InputFilter;
import android.widget.EditText;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0uuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722190uuv {
    public static final void LIZ(EditText editText, int i) {
        InputFilter[] inputFilterArr;
        if (editText != null && i >= 0) {
            if (editText.getFilters().length == 0) {
                inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
            } else {
                inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(editText.getFilters()), AFwS268S0000000_26.get$arr$(580)), new InputFilter.LengthFilter(i))).toArray(new InputFilter[0]);
            }
            editText.setFilters(inputFilterArr);
        }
    }
}
