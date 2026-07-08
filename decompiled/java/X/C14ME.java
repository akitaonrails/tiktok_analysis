package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14ME, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ME implements C14MD {
    public final int[] LIZ = {2130969189, 2130969187, 2130969113};
    public final int[] LIZIZ = {2130969137, R.drawable.a2t, R.drawable.a22, R.drawable.a1x, R.drawable.a1y, R.drawable.a21, R.drawable.a20};
    public final int[] LIZJ = {2130969186, 2130969188, 2130969130, R.drawable.a33, 2130969183, 2130969184, 2130969185};
    public final int[] LIZLLL = {2130969162, R.drawable.a1m, 2130969161};
    public final int[] LJ = {R.drawable.a31, R.drawable.a3a};
    public final int[] LJFF = {R.drawable.a1a, R.drawable.a1g, R.drawable.a1b, R.drawable.a1h};

    public static boolean LIZ(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList LIZIZ(int i, Context context) {
        int iLIZIZ = C14MF.LIZIZ(R.attr.big, context);
        return new ColorStateList(new int[][]{C14MF.LIZIZ, C14MF.LIZLLL, C14MF.LIZJ, C14MF.LJFF}, new int[]{C14MF.LIZ(R.attr.bie, context), C2441009hQ.LJIIJ(iLIZIZ, i), C2441009hQ.LJIIJ(iLIZIZ, i), i});
    }

    public final ColorStateList LIZLLL(int i, Context context) {
        if (i == R.drawable.a1r) {
            return C838410Wul.LIZIZ(R.color.f574ec, context);
        }
        if (i == 2130969179) {
            return C838410Wul.LIZIZ(R.color.ef, context);
        }
        if (i == R.drawable.a2z) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListLIZJ = C14MF.LIZJ(R.attr.biy, context);
            if (colorStateListLIZJ != null && colorStateListLIZJ.isStateful()) {
                int[] iArr3 = C14MF.LIZIZ;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListLIZJ.getColorForState(iArr3, 0);
                iArr[1] = C14MF.LJ;
                iArr2[1] = C14MF.LIZIZ(R.attr.bif, context);
                iArr[2] = C14MF.LJFF;
                iArr2[2] = colorStateListLIZJ.getDefaultColor();
            } else {
                iArr[0] = C14MF.LIZIZ;
                iArr2[0] = C14MF.LIZ(R.attr.biy, context);
                iArr[1] = C14MF.LJ;
                iArr2[1] = C14MF.LIZIZ(R.attr.bif, context);
                iArr[2] = C14MF.LJFF;
                iArr2[2] = C14MF.LIZIZ(R.attr.biy, context);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.a1f) {
            return LIZIZ(C14MF.LIZIZ(R.attr.bie, context), context);
        }
        if (i == R.drawable.a1_) {
            return LIZIZ(0, context);
        }
        if (i == R.drawable.a1e) {
            return LIZIZ(C14MF.LIZIZ(R.attr.bic, context), context);
        }
        if (i != 2130969174 && i != R.drawable.a2w) {
            if (LIZ(i, this.LIZIZ)) {
                return C14MF.LIZJ(R.attr.bih, context);
            }
            if (LIZ(i, this.LJ)) {
                return C838410Wul.LIZIZ(R.color.eb, context);
            }
            if (LIZ(i, this.LJFF)) {
                return C838410Wul.LIZIZ(R.color.ea, context);
            }
            if (i == R.drawable.a2s) {
                return C838410Wul.LIZIZ(R.color.ed, context);
            }
            return null;
        }
        return C838410Wul.LIZIZ(R.color.ee, context);
    }

    public static LayerDrawable LIZJ(C14MA c14ma, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableLJFF = c14ma.LJFF(context, R.drawable.a2x);
        Drawable drawableLJFF2 = c14ma.LJFF(context, R.drawable.a2y);
        if ((drawableLJFF instanceof BitmapDrawable) && drawableLJFF.getIntrinsicWidth() == dimensionPixelSize && drawableLJFF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableLJFF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableLJFF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableLJFF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if (!(drawableLJFF2 instanceof BitmapDrawable) || drawableLJFF2.getIntrinsicWidth() != dimensionPixelSize || drawableLJFF2.getIntrinsicHeight() != dimensionPixelSize) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableLJFF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableLJFF2.draw(canvas2);
            drawableLJFF2 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, drawableLJFF2, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void LJ(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C14MG.LIZIZ;
        }
        drawableMutate.setColorFilter(C14MG.LIZJ(i, mode));
    }
}
