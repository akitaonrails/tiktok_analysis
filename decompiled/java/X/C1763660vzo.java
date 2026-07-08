package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0vzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763660vzo {
    public static ColorStateList LIZ(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode LIZIZ(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void LIZJ(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void LIZLLL(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
