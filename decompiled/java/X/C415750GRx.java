package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415750GRx extends Drawable {
    public final Context LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C415750GRx(Context context) {
        int iIntValue;
        this.LIZ = context;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(501));
        this.LIZIZ = c01gwLIZIZ;
        this.LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(502));
        ((Paint) c01gwLIZIZ.getValue()).setStyle(Paint.Style.FILL);
        Paint paint = (Paint) c01gwLIZIZ.getValue();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        if (C426750GoL.LIZLLL(this.LIZ)) {
            canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        }
        canvas.drawPath((Path) this.LIZJ.getValue(), (Paint) this.LIZIZ.getValue());
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((Paint) this.LIZIZ.getValue()).setAlpha(i);
    }
}
