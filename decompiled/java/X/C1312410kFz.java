package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0kFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312410kFz extends PictureDrawable {
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

    public C1312410kFz(C2257191DWj c2257191DWj, C1DX7 c1dx7, C1290350jgP c1290350jgP) {
        super(null);
        Picture pictureLJ = c2257191DWj.LJ(c1dx7, c1290350jgP);
        if (pictureLJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderToPicture success.svgHashCode:");
            sbLIZ.append(c2257191DWj.hashCode());
            sbLIZ.append(" picture hashCode:");
            sbLIZ.append(pictureLJ.hashCode());
            LynxLog.i("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ));
        }
        setPicture(pictureLJ);
    }
}
