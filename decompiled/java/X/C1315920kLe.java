package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315920kLe extends Drawable {
    public final InterfaceC1316000kLm LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Matrix LIZLLL;
    public final Matrix LJ = new Matrix();
    public final C1315930kLf LJFF;
    public String LJI;
    public String LJII;

    public final void LIZ() {
        C1315930kLf c1315930kLf = this.LJFF;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int width = c1315930kLf.LIZLLL ? c1315930kLf.LIZ.getWidth() : c1315930kLf.LIZJ.getIntrinsicWidth();
        this.LIZIZ = width;
        int height = c1315930kLf.LIZLLL ? c1315930kLf.LIZ.getHeight() : c1315930kLf.LIZJ.getIntrinsicHeight();
        this.LIZJ = height;
        if (width <= 0 || height <= 0) {
            c1315930kLf.LIZIZ(bounds.left, bounds.top, bounds.right, bounds.bottom);
            this.LIZLLL = null;
            return;
        }
        if (width == iWidth && height == iHeight) {
            c1315930kLf.LIZIZ(bounds.left, bounds.top, bounds.right, bounds.bottom);
            this.LIZLLL = null;
        } else if (this.LIZ == InterfaceC1316000kLm.LIZ) {
            c1315930kLf.LIZIZ(bounds.left, bounds.top, bounds.right, bounds.bottom);
            this.LIZLLL = null;
        } else {
            c1315930kLf.LIZIZ(0, 0, width, height);
            this.LIZ.LIZ(width, height, bounds, this.LJ);
            this.LIZLLL = this.LJ;
        }
    }

    public final void LIZIZ() {
        InterfaceC1316400kMQ interfaceC1316400kMQ;
        C1323050kX9<AbstractC1327750kej> c1323050kX9;
        C1315930kLf c1315930kLf = this.LJFF;
        if (c1315930kLf == null || (interfaceC1316400kMQ = c1315930kLf.LIZIZ) == null || (c1323050kX9 = ((C1315970kLj) interfaceC1316400kMQ).LIZ) == null) {
            return;
        }
        C1323050kX9.LJII(c1323050kX9);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        C1315930kLf c1315930kLf = this.LJFF;
        if (c1315930kLf == null) {
            return 0;
        }
        if (!c1315930kLf.LIZLLL) {
            return c1315930kLf.LIZJ.getOpacity();
        }
        Bitmap bitmap = c1315930kLf.LIZ;
        return (bitmap == null || bitmap.hasAlpha() || c1315930kLf.LJIIIZ.getAlpha() < 255) ? -3 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            X.0kLf r2 = r11.LJFF
            if (r2 == 0) goto L94
            int r1 = r11.LIZIZ
            boolean r0 = r2.LIZLLL
            if (r0 == 0) goto L65
            android.graphics.Bitmap r0 = r2.LIZ
            int r0 = r0.getWidth()
        L10:
            if (r1 != r0) goto L22
            int r2 = r11.LIZJ
            X.0kLf r1 = r11.LJFF
            boolean r0 = r1.LIZLLL
            if (r0 == 0) goto L5e
            android.graphics.Bitmap r0 = r1.LIZ
            int r0 = r0.getHeight()
        L20:
            if (r2 == r0) goto L25
        L22:
            r11.LIZ()
        L25:
            java.lang.String r0 = r11.LJI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = r12
            if (r0 != 0) goto L6c
            X.0kLf r0 = r11.LJFF
            android.graphics.Bitmap r1 = r0.LIZ()
            if (r1 == 0) goto L6c
            android.graphics.Rect r0 = r11.getBounds()
            int r2 = r0.width()
            android.graphics.Rect r0 = r11.getBounds()
            int r3 = r0.height()
            int r4 = r1.getWidth()
            int r5 = r1.getHeight()
            X.0kLm r6 = r11.LIZ
            java.lang.String r7 = r11.LJI
            java.lang.String r8 = r11.LJII
            X.0kLf r0 = r11.LJFF
            android.graphics.Bitmap r10 = r0.LIZ()
            X.C1315910kLd.LIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L5e:
            android.graphics.drawable.Drawable r0 = r1.LIZJ
            int r0 = r0.getIntrinsicHeight()
            goto L20
        L65:
            android.graphics.drawable.Drawable r0 = r2.LIZJ
            int r0 = r0.getIntrinsicWidth()
            goto L10
        L6c:
            android.graphics.Matrix r0 = r11.LIZLLL
            if (r0 == 0) goto L9b
            int r5 = r9.save()
            android.graphics.Rect r0 = r11.getBounds()
            r9.clipRect(r0)
            android.graphics.Matrix r0 = r11.LIZLLL
            r9.concat(r0)
            X.0kLf r4 = r11.LJFF
            boolean r0 = r4.LIZLLL
            if (r0 == 0) goto L95
            android.graphics.Bitmap r3 = r4.LIZ
            android.graphics.Rect r2 = r4.LJIIJ
            android.graphics.Rect r1 = r4.LJIIJJI
            android.graphics.Paint r0 = r4.LJIIIZ
            r9.drawBitmap(r3, r2, r1, r0)
        L91:
            r9.restoreToCount(r5)
        L94:
            return
        L95:
            android.graphics.drawable.Drawable r0 = r4.LIZJ
            r0.draw(r9)
            goto L91
        L9b:
            X.0kLf r4 = r11.LJFF
            boolean r0 = r4.LIZLLL
            if (r0 == 0) goto Lad
            android.graphics.Bitmap r3 = r4.LIZ
            android.graphics.Rect r2 = r4.LJIIJ
            android.graphics.Rect r1 = r4.LJIIJJI
            android.graphics.Paint r0 = r4.LJIIIZ
            r9.drawBitmap(r3, r2, r1, r0)
            return
        Lad:
            android.graphics.drawable.Drawable r0 = r4.LIZJ
            r0.draw(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315920kLe.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.LJFF != null) {
            LIZ();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C1315930kLf c1315930kLf = this.LJFF;
        if (c1315930kLf != null) {
            if (c1315930kLf.LIZLLL) {
                float f = i;
                if (c1315930kLf.LJ != f) {
                    c1315930kLf.LJ = f;
                    c1315930kLf.LJIIIZ.setAlpha(i);
                    return;
                }
                return;
            }
            c1315930kLf.LIZJ.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1315930kLf c1315930kLf = this.LJFF;
        if (c1315930kLf != null) {
            if (c1315930kLf.LIZLLL) {
                c1315930kLf.LJIIIZ.setColorFilter(colorFilter);
            } else {
                c1315930kLf.LIZJ.setColorFilter(colorFilter);
            }
        }
    }

    public C1315920kLe(C1315930kLf c1315930kLf, AbstractC1316100kLw abstractC1316100kLw) {
        this.LJFF = c1315930kLf;
        this.LIZ = abstractC1316100kLw;
    }
}
