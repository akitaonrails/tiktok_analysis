package X;

import android.view.View;

/* JADX INFO: renamed from: X.0DPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338720DPq {
    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        view.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }
}
