package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: renamed from: X.13kH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20097113kH {
    public static PointerIcon LIZIZ(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    public static PointerIcon LIZJ(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }

    public static PointerIcon LIZ(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }
}
