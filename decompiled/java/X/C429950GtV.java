package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429950GtV extends Drawable {
    public final TextView LIZ;
    public float LIZIZ;
    public final C429960GtW LIZJ;
    public final Paint LIZLLL;
    public final List<C429970GtX> LJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C429950GtV(C431640GwE c431640GwE) {
        int iIntValue;
        Integer numLIZJ;
        this.LIZ = c431640GwE;
        Context context = c431640GwE.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zz, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZJ = new C429960GtW();
        Paint paint = new Paint();
        paint.setColor(iIntValue);
        this.LIZLLL = paint;
        this.LJ = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C429950GtV.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZLLL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
    }
}
