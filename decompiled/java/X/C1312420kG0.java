package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;

/* JADX INFO: renamed from: X.0kG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312420kG0 extends PictureDrawable {
    public C1312420kG0(Picture picture) {
        super(picture);
    }

    @Override // android.graphics.drawable.PictureDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        if (getPicture() != null) {
            canvas.translate(bounds.left, bounds.top);
            canvas.drawPicture(getPicture());
        }
        canvas.restore();
    }
}
