package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Gr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428430Gr3 extends AppCompatImageView {
    public final ConcurrentHashMap<Integer, Bitmap> LL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public static boolean LIZ(int i) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (iRed < 30 && iGreen < 30 && iBlue < 30) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setCroppedBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C432320GxK(this, bitmap, null), 3);
        } else {
            setImageBitmap(null);
        }
    }

    public C428430Gr3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C428430Gr3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LL = new ConcurrentHashMap<>();
    }
}
