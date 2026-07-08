package X;

import android.text.Editable;

/* JADX INFO: renamed from: X.0DSM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DSM {
    public static final void LIZ(C0I7D c0i7d) {
        Editable editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhidbMhcItHPj03ruksdkyR7nLnVMSGxw=", null));
        String string = editableLLJILLL.toString();
        int length = string.length();
        if (((Boolean) C280900Azg.LIZ.getValue()).booleanValue() && string.length() == 0) {
            return;
        }
        int i = 0;
        while (i < length && string.charAt(i) == ' ') {
            i++;
        }
        int i2 = length;
        while (i2 > i) {
            int i3 = i2 - 1;
            if (string.charAt(i3) != ' ') {
                break;
            } else {
                i2 = i3;
            }
        }
        if (i < i2) {
            int i4 = i2 + 1;
            if (i4 < length) {
                editableLLJILLL.delete(i4, length);
            }
            editableLLJILLL.delete(0, i);
            return;
        }
        c0i7d.setText("");
    }
}
