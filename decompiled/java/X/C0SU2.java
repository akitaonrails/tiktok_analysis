package X;

import android.view.View;

/* JADX INFO: renamed from: X.0SU2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU2 {
    public static final int LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1] + view.getHeight();
    }
}
