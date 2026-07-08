package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419860GdE extends Drawable {
    public final Drawable LIZ;
    public final Drawable LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LIZ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LIZ.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZLLL + (this.LJFF / 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZJ + (this.LJ / 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iMax;
        canvas.save();
        int i = this.LJI;
        int i2 = this.LJIIIIZZ / 2;
        int i3 = this.LIZLLL;
        int i4 = i2 - (i3 / 2);
        this.LIZ.setBounds(i, i4, this.LIZJ + i, i3 + i4);
        this.LIZ.draw(canvas);
        if (C444960Hcc.LIZIZ()) {
            iMax = Math.max(0, i - (this.LJ / 2));
        } else {
            iMax = (this.LIZJ + i) - (this.LJ / 2);
        }
        int iMax2 = Math.max(0, i4 - (this.LJFF / 2));
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draw, iconLeft: ");
        sbLIZ.append(i);
        sbLIZ.append(", iconTop: ");
        sbLIZ.append(i4);
        sbLIZ.append(", badgeLeft: ");
        sbLIZ.append(iMax);
        sbLIZ.append(", badgeTop: ");
        sbLIZ.append(iMax2);
        C1720106oR.LJI("Profile_CustomCompoundDrawable", C2188811AlT.LIZIZ(sbLIZ));
        canvas.translate(iMax, iMax2);
        this.LIZIZ.setBounds(iMax, iMax2, this.LJ + iMax, this.LJFF + iMax2);
        this.LIZIZ.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
        this.LIZIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
        this.LIZIZ.setColorFilter(colorFilter);
    }

    public C419860GdE(Drawable drawable, Drawable drawable2) {
        int iWidth;
        int iHeight;
        int iWidth2;
        int iHeight2;
        this.LIZ = drawable;
        this.LIZIZ = drawable2;
        if (drawable.getIntrinsicWidth() > 0) {
            iWidth = drawable.getIntrinsicWidth();
        } else {
            iWidth = drawable.getBounds().width();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            iHeight = drawable.getIntrinsicHeight();
        } else {
            iHeight = drawable.getBounds().height();
        }
        if (drawable2.getIntrinsicWidth() > 0) {
            iWidth2 = drawable2.getIntrinsicWidth();
        } else {
            iWidth2 = drawable2.getBounds().width();
        }
        this.LJ = iWidth2;
        if (drawable2.getIntrinsicHeight() > 0) {
            iHeight2 = drawable2.getIntrinsicHeight();
        } else {
            iHeight2 = drawable2.getBounds().height();
        }
        this.LJFF = iHeight2;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createBadgedDrawable, badgeWidth: ");
        sbLIZ.append(iWidth2);
        sbLIZ.append(", badgeHeight: ");
        sbLIZ.append(iHeight2);
        sbLIZ.append(", originalWidth: ");
        sbLIZ.append(iWidth);
        sbLIZ.append(", originalHeight: ");
        sbLIZ.append(iHeight);
        sbLIZ.append(", boundWidth: ");
        sbLIZ.append(drawable.getBounds().width());
        sbLIZ.append(", boundHeight: ");
        sbLIZ.append(drawable.getBounds().height());
        C1720106oR.LJI("Profile_CustomCompoundDrawable", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = iWidth <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : iWidth;
        this.LIZLLL = iHeight <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : iHeight;
        this.LJ = iWidth2 <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : iWidth2;
        this.LJFF = iHeight2 <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : iHeight2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.LJI = i;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        super.setBounds(i, i2, i + i3, i2 + i4);
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBounds, left: ");
        sbLIZ.append(i);
        sbLIZ.append(", top: ");
        sbLIZ.append(i2);
        sbLIZ.append(", right: ");
        sbLIZ.append(i3);
        sbLIZ.append(", bottom: ");
        sbLIZ.append(i4);
        sbLIZ.append(", totalWidth: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", totalHeight: ");
        sbLIZ.append(this.LJIIIIZZ);
        C1720106oR.LJI("Profile_CustomCompoundDrawable", C2188811AlT.LIZIZ(sbLIZ));
    }
}
