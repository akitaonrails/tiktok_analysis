package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.1AIW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AIW implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && textView != null) {
            textView.clearFocus();
            return false;
        }
        return false;
    }
}
