package X;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: X.19SG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SG {
    public static final int[] LIZJ = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final ProgressBar LIZ;
    public Bitmap LIZIZ;

    public C19SG(ProgressBar progressBar) {
        this.LIZ = progressBar;
    }

    public void LIZ(AttributeSet attributeSet, int i) {
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(this.LIZ.getContext(), attributeSet, LIZJ, i, 0);
        Drawable drawableLJFF = c21411918qrLJIILIIL.LJFF(0);
        if (drawableLJFF != null) {
            ProgressBar progressBar = this.LIZ;
            if (drawableLJFF instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableLJFF;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableLIZIZ = LIZIZ(animationDrawable.getFrame(i2), true);
                    drawableLIZIZ.setLevel(10000);
                    animationDrawable2.addFrame(drawableLIZIZ, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableLJFF = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableLJFF);
        }
        Drawable drawableLJFF2 = c21411918qrLJIILIIL.LJFF(1);
        if (drawableLJFF2 != null) {
            this.LIZ.setProgressDrawable(LIZIZ(drawableLJFF2, false));
        }
        c21411918qrLJIILIIL.LJIILJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable LIZIZ(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof C14SS) {
            C14SS c14ss = (C14SS) drawable;
            Drawable drawableLIZIZ = c14ss.LIZIZ();
            if (drawableLIZIZ != null) {
                c14ss.LIZ(LIZIZ(drawableLIZIZ, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (id != 16908301 && id != 16908303) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    drawableArr[i] = LIZIZ(drawable2, z2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.LIZIZ == null) {
                    this.LIZIZ = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }
}
