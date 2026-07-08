package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0GdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420010GdT {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(View view) {
        if (!view.isAttachedToWindow()) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, (int) (i + (view.getWidth() * view.getScaleX())), (int) (i2 + (view.getHeight() * view.getScaleY())));
    }
}
