package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: X.0HaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443530HaJ extends AbstractC443520HaI {
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        LIZLLL();
        outline.setRoundRect(this.LJII, this.LJI);
    }

    public C443530HaJ(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // X.AbstractC443520HaI
    public final void LIZ(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
