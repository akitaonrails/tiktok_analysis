package X;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0vjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753610vjb {
    public static RectF LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r3, view.getHeight() + r2);
    }
}
