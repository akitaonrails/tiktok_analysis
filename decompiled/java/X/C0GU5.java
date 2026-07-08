package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GU5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GU5 {
    public static final Paint LIZ;
    public static Paint LIZIZ;
    public static final RectF LIZJ;

    static {
        Paint paint = new Paint();
        LIZ = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setColor(0);
        LIZJ = new RectF();
    }
}
