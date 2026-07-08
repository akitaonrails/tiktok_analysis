package X;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: renamed from: X.0jn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294440jn0 extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public C1294440jn0() {
    }

    public C1294440jn0(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = C1295100jo4.LIZ;
            setColor((Math.max(0, Math.min(255, i)) << 24) | (color & 16777215));
        } else {
            PointF pointF2 = C1295100jo4.LIZ;
            super.setAlpha(Math.max(0, Math.min(255, i)));
        }
    }

    public C1294440jn0(int i) {
        super(i);
    }

    public C1294440jn0(PorterDuff.Mode mode, int i) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
