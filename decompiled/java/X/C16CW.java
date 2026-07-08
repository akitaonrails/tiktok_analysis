package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.16CW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16CW {
    public abstract View LIZ();

    public final Rect LIZIZ() {
        View viewLIZ = LIZ();
        if (viewLIZ == null || !viewLIZ.isAttachedToWindow()) {
            return null;
        }
        int[] iArr = new int[2];
        viewLIZ.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, (int) (i + (viewLIZ.getWidth() * viewLIZ.getScaleX())), (int) (i2 + (viewLIZ.getHeight() * viewLIZ.getScaleY())));
    }
}
