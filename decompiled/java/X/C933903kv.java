package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C933903kv implements TextWatcher {
    public final EditText LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.LLILLJJLI <= 0) {
            return;
        }
        String string = editable.toString();
        int i = 0;
        int length = u.LJJIFFI(string.substring(0, this.LL.getSelectionStart()), this.LLILLL, "", false).length();
        StringBuilder sb = new StringBuilder();
        int length2 = string.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt = string.charAt(i3);
            if (cCharAt != this.LLILLL.charAt(0)) {
                sb.append(cCharAt);
                if ((sb.length() - i2) % this.LLILLJJLI == 0) {
                    sb.append(this.LLILLL);
                    i2++;
                }
            }
        }
        int iLastIndexOf = sb.lastIndexOf(this.LLILLL);
        if (iLastIndexOf >= 0 && iLastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(iLastIndexOf);
        }
        String string2 = sb.toString();
        int length3 = string2.length();
        int i4 = this.LLILZ;
        if (length3 > i4) {
            string2 = string2.substring(0, i4);
        }
        int i5 = this.LLILLJJLI;
        int i6 = i5 + 1;
        int i7 = ((length / i5) * i6) + (length % i5);
        if (i7 % i6 == 0) {
            i7--;
        }
        int length4 = string2.length();
        if (i7 >= 0) {
            i = i7;
        }
        if (i <= length4) {
            length4 = i;
        }
        if (!Intrinsics.LJFF(string2, string)) {
            this.LL.setText(string2);
        }
        this.LL.setSelection(length4);
    }

    public C933903kv(EditText editText, int i, String str, int i2) {
        int i3;
        this.LL = editText;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        int i4 = (i2 / i) + i2;
        if (i2 % i > 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.LLILZ = i4 - i3;
    }
}
