package X;

import Y.ARunnableS0S0301004_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(LIZLLL(view.getContext()));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
        view.setBackground(gradientDrawable);
    }

    public static int[] LIZLLL(Context context) {
        return new int[]{LJ(R.attr.ce, context), LJ(R.attr.ce, context), LJ(R.attr.cc, context), LJ(R.attr.cq, context)};
    }

    public static int LJ(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public static void LIZIZ(ImageView imageView, int[] iArr, float[] fArr, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        Drawable drawable;
        Drawable drawableMutate;
        int width = i2;
        int height = i3;
        if (width <= 0) {
            width = imageView.getWidth();
        }
        if (height <= 0) {
            height = imageView.getHeight();
        }
        if (width != 0 && height != 0 && (drawable = imageView.getDrawable()) != null && drawable.mutate() != null) {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null && (drawableMutate = drawable2.mutate()) != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableMutate.setBounds(0, 0, width, height);
                drawableMutate.draw(canvas);
                Paint paint = new Paint(1);
                float f5 = width;
                float f6 = height;
                paint.setShader(new LinearGradient(f * f5, f3 * f6, f2 * f5, f4 * f6, iArr, fArr, Shader.TileMode.CLAMP));
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawRect(0.0f, 0.0f, f5, f6, paint);
                imageView.setImageBitmap(bitmapCreateBitmap);
                return;
            }
            return;
        }
        if (i < 3) {
            HandlerHook.viewPost(imageView, new ARunnableS0S0301004_6(imageView, iArr, fArr, f, f2, f3, f4, i, 0));
        }
    }
}
