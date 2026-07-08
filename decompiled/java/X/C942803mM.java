package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C942803mM implements TextWatcher {
    public final EditText LL;
    public boolean LLILLJJLI;

    public C942803mM(EditText editText) {
        this.LL = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String string = editable.toString();
        int i = 0;
        String str = "";
        int length = u.LJJIFFI(string.substring(0, this.LL.getSelectionStart()), "/", "", false).length();
        String strLJJIFFI = u.LJJIFFI(editable.toString(), "/", "", false);
        if (!this.LLILLJJLI && strLJJIFFI.length() == 1 && a0.LJJIJ("23456789", strLJJIFFI.charAt(0))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(strLJJIFFI.charAt(0));
            strLJJIFFI = C2188811AlT.LIZIZ(sbLIZ);
            length++;
        }
        if (!this.LLILLJJLI || strLJJIFFI.length() != 1 || strLJJIFFI.charAt(0) != '0') {
            str = strLJJIFFI;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            int i4 = i3 + 1;
            if (i3 > 0 && i3 % 2 == 0) {
                sb.append("/");
            }
            sb.append(cCharAt);
            i2++;
            i3 = i4;
        }
        String string2 = sb.toString();
        if (string2.length() > 5) {
            string2 = string2.substring(0, 5);
        }
        int i5 = ((length / 2) * 3) + (length % 2);
        if (i5 % 3 == 0) {
            i5--;
        }
        int length2 = string2.length();
        if (i5 >= 0) {
            i = i5;
        }
        if (i <= length2) {
            length2 = i;
        }
        if (!Intrinsics.LJFF(string2, string)) {
            this.LL.setText(string2);
        }
        this.LL.setSelection(length2);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (i2 > i3) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLJJLI = z;
    }
}
