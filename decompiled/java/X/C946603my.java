package X;

import android.text.Spanned;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: X.03my, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C946603my {
    public static void LIZ(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        boolean z;
        boolean z2;
        CharSequence text = appCompatTextView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else {
                if (charSequence == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (text == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    if (charSequence != null) {
                        String str = (String) charSequence;
                        int length = str.length();
                        if (length == text.length()) {
                            for (int i = 0; i < length; i++) {
                                if (str.charAt(i) == text.charAt(i)) {
                                }
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            appCompatTextView.setText(charSequence);
        }
    }
}
