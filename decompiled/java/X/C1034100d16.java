package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0d16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034100d16 {
    public static final int[] LIZ = new int[2];

    public static final Rect LIZ(View view) {
        int[] iArr = LIZ;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }
}
