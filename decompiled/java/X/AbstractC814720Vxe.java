package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Vxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC814720Vxe {
    public C813610Vvr LIZ;
    public CharSequence LIZIZ;
    public CharSequence LIZJ;
    public boolean LIZLLL;

    public abstract void LIZIZ(C813530Vvj c813530Vvj);

    public String LJ() {
        return null;
    }

    public RemoteViews LJFF() {
        return null;
    }

    public RemoteViews LJI() {
        return null;
    }

    public void LJII() {
    }

    public void LIZ(Bundle bundle) {
        if (this.LIZLLL) {
            C786410Ut5.LJJIJIIJI(bundle, "android.summaryText", this.LIZJ);
        }
        CharSequence charSequence = this.LIZIZ;
        if (charSequence != null) {
            C786410Ut5.LJJIJIIJI(bundle, "android.title.big", charSequence);
        }
        String strLJ = LJ();
        if (strLJ != null) {
            C786410Ut5.LJJJI("androidx.core.app.extra.COMPAT_TEMPLATE", strLJ, bundle);
        }
    }

    public final void LJIIIIZZ(C813610Vvr c813610Vvr) {
        if (this.LIZ != c813610Vvr) {
            this.LIZ = c813610Vvr;
            if (c813610Vvr != null) {
                c813610Vvr.LJIIJ(this);
            }
        }
    }

    public final Bitmap LIZJ(IconCompat iconCompat, int i, int i2) {
        int intrinsicWidth;
        Context context = this.LIZ.LIZ;
        iconCompat.LIZ(context);
        Drawable drawableLJ = C815270VyX.LJ(C815270VyX.LJFF(iconCompat, context), context);
        if (i2 == 0) {
            intrinsicWidth = drawableLJ.getIntrinsicWidth();
            i2 = drawableLJ.getIntrinsicHeight();
        } else {
            intrinsicWidth = i2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        drawableLJ.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            drawableLJ.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        drawableLJ.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final Bitmap LIZLLL(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = this.LIZ.LIZ;
        context.getClass();
        Bitmap bitmapLIZJ = LIZJ(IconCompat.LJFF(context.getResources(), context.getPackageName(), R.drawable.cq_), i4, i2);
        Canvas canvas = new Canvas(bitmapLIZJ);
        Drawable drawableMutate = this.LIZ.LIZ.getResources().getDrawable(i).mutate();
        drawableMutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        drawableMutate.setBounds(i5, i5, i6, i6);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapLIZJ;
    }
}
