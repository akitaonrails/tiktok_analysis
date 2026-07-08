package X;

import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0JnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502680JnW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, TextView textView, boolean z) {
        if (!z || textView == null) {
            return;
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        int iLJIIZILJ = ((C497740JfY.LJIIZILJ() * 2) / 3) - i;
        if (iLJIIZILJ > 0) {
            textView.setMaxWidth(iLJIIZILJ);
        }
    }
}
