package X;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HBM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HBM {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZIZ(int i, int i2) {
        boolean z;
        Drawable drawableLIZJ;
        C01GW c01gw = C0BCO.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        int iIntValue = ((Number) c01gw.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue != 4 || (drawableLIZJ = LIZJ(R.drawable.d4k, i)) == null) {
                        return null;
                    }
                    Drawable drawableMutate = drawableLIZJ.mutate();
                    C16GF.LJI(drawableMutate, i2);
                    return drawableMutate;
                }
                return LIZ(i, R.raw.icon_camera, i2);
            }
            Drawable drawableLIZJ2 = LIZJ(R.drawable.d4j, i);
            if (drawableLIZJ2 == null) {
                return null;
            }
            Drawable drawableMutate2 = drawableLIZJ2.mutate();
            C16GF.LJI(drawableMutate2, i2);
            return drawableMutate2;
        }
        return LIZ(i, R.raw.icon_scan_magnifying_glass, i2);
    }

    public static Drawable LIZJ(int i, int i2) {
        Application applicationLIZ = C1BWL.LIZ();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(applicationLIZ.getResources(), i);
        if (bitmapDecodeResource == null) {
            return null;
        }
        return new BitmapDrawable(applicationLIZ.getResources(), Bitmap.createScaledBitmap(bitmapDecodeResource, i2, i2, true));
    }

    public static TuxIconDrawable LIZ(int i, int i2, int i3) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i2;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        c419910GdJ.LIZLLL = Integer.valueOf(i3);
        c419910GdJ.LJFF = false;
        return c419910GdJ.LIZ(C1BWL.LIZ());
    }
}
