package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0HAS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAS {
    public static WeakReference<BitmapDrawable> LIZ = new WeakReference<>(null);
    public static WeakReference<LayerDrawable> LIZIZ = new WeakReference<>(null);
    public static WeakReference<LayerDrawable> LIZJ;

    static {
        new WeakReference(null);
        LIZJ = new WeakReference<>(null);
    }

    public static LayerDrawable LIZ(Context context) {
        LayerDrawable layerDrawable = LIZIZ.get();
        if (layerDrawable != null) {
            return layerDrawable;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setColors(new int[]{C497740JfY.LIZLLL(R.attr.esj, context), C497740JfY.LIZLLL(R.attr.esk, context), C497740JfY.LIZLLL(R.attr.esl, context)});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setGradientCenter(0.5f, 0.5f);
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable, new InsetDrawable((Drawable) LIZIZ(context), 0, 0, 0, (int) C497740JfY.LIZIZ(220.0f))});
        LIZIZ = new WeakReference<>(layerDrawable2);
        return layerDrawable2;
    }

    public static BitmapDrawable LIZIZ(Context context) {
        BitmapDrawable bitmapDrawable = LIZ.get();
        if (bitmapDrawable != null && bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
            return bitmapDrawable;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), R.drawable.dj_));
        bitmapDrawable2.setGravity(1);
        LIZ = new WeakReference<>(bitmapDrawable2);
        return bitmapDrawable2;
    }
}
