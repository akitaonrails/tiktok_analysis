package X;

import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: X.111A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C111A {
    public static C11G2[] LIZ(TextView textView) {
        CharSequence text = textView.getText();
        if (!TextUtils.isEmpty(text) && (text instanceof Spanned)) {
            return (C11G2[]) ((Spanned) text).getSpans(0, text.length(), C11G2.class);
        }
        return null;
    }
}
