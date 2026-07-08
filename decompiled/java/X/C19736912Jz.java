package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19736912Jz extends AppCompatImageView {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(String str) {
        int i;
        C21621919jd c21621919jdLIZ = new C21625319kB().LIZ(str, EnumC21623519jt.QR_CODE, 500, 500, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
        int i2 = 0;
        do {
            int i3 = 0;
            do {
                if (c21621919jdLIZ.LIZ(i2, i3)) {
                    i = -16777216;
                } else {
                    i = -1;
                }
                bitmapCreateBitmap.setPixel(i2, i3, i);
                i3++;
            } while (i3 < 500);
            i2++;
        } while (i2 < 500);
        setImageBitmap(bitmapCreateBitmap);
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

    public C19736912Jz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19736912Jz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(C420660GeW.LIZ(getResources(), R.drawable.adp, null));
        setClipToOutline(true);
    }
}
