package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137380fhg {
    public static final C1137380fhg LIZ = new C1137380fhg();

    public static void LIZ(C16F5 c16f5, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable background = c16f5.getBackground();
        if ((background instanceof TransitionDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
            layerDrawable.setDrawableByLayerId(R.id.view_bg, drawable);
            layerDrawable.invalidateSelf();
        }
    }
}
