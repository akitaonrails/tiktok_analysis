package X;

import android.view.View;

/* JADX INFO: renamed from: X.0DVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340140DVc {
    public static final int LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1] + view.getHeight();
    }
}
