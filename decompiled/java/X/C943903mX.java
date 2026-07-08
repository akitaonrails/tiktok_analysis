package X;

import android.text.InputFilter;
import android.widget.EditText;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.03mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C943903mX {
    public static final void LIZ(EditText editText, int i) {
        InputFilter[] inputFilterArr;
        if (editText != null && i >= 0) {
            if (editText.getFilters().length == 0) {
                inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
            } else {
                inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(editText.getFilters()), AFwS228S0000000_1.get$arr$(612)), new InputFilter.LengthFilter(i))).toArray(new InputFilter[0]);
            }
            editText.setFilters(inputFilterArr);
        }
    }
}
