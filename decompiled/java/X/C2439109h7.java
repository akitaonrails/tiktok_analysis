package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2439109h7 {
    public static boolean LIZJ;
    public Rect LIZ;
    public final Bitmap LIZIZ;

    public final void LIZ(int i) {
        Rect rect = this.LIZ;
        if (rect != null) {
            rect.bottom = i;
            if (Unit.LIZ != null) {
                return;
            }
        }
        this.LIZ = new Rect(0, 0, this.LIZIZ.getWidth(), i);
    }

    public final void LIZJ(int i) {
        Rect rect = this.LIZ;
        if (rect != null) {
            rect.top = i;
            if (Unit.LIZ != null) {
                return;
            }
        }
        this.LIZ = new Rect(0, i, this.LIZIZ.getWidth(), this.LIZIZ.getHeight());
    }

    public C2439109h7(Bitmap bitmap, Rect rect) {
        this.LIZ = rect;
        if (bitmap.getConfig() == Bitmap.Config.RGB_565 || (LIZJ && bitmap.getConfig() == Bitmap.Config.ARGB_8888)) {
            this.LIZIZ = bitmap;
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.LIZIZ = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size(), options);
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        this.LIZ = new Rect(i, i2, i3, i4);
    }
}
