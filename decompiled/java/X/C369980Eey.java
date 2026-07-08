package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369980Eey extends C370050Ef5 {
    public final Paint LLJI;
    public final Paint LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final RectF LLJILLL;
    public final RectF LLJJ;
    public float LLJJI;
    public int LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;

    public final float getAnchorViewLeft() {
        return this.LLJJIJI;
    }

    public final float getAnchorViewWidth() {
        return this.LLJJIJIIJIL;
    }

    public final float getMarginScrollLeft() {
        return this.LLJJI;
    }

    public final int getOutScrollX() {
        return this.LLJJIII;
    }

    public C369980Eey(Context context) {
        Integer numLIZJ;
        super(context, null, 0);
        Paint paint = new Paint();
        this.LLJI = paint;
        Paint paint2 = new Paint();
        this.LLJIJIL = paint2;
        this.LLJILJIL = C0FU0.LIZ(6.0f);
        this.LLJILJILJ = C0FU0.LIZ(4.0f);
        this.LLJILLL = new RectF();
        this.LLJJ = new RectF();
        this.LLJJI = C0FU0.LIZ(42.0f);
        setLayerType(1, null);
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setAntiAlias(true);
        Integer numValueOf = Integer.valueOf(R.attr.e4);
        if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), context)) != null) {
            paint.setColor(numLIZJ.intValue());
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLJILLL.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.LLJILLL;
        float f = this.LLJILJIL;
        canvas.drawRoundRect(rectF, f, f, this.LLJI);
        float f2 = (this.LLJJIII + this.LLJJIJI) - this.LLJJI;
        this.LLJJ.set(f2, 0.0f, this.LLJJIJIIJIL + f2, getHeight());
        RectF rectF2 = this.LLJJ;
        float f3 = this.LLJILJILJ;
        canvas.drawRoundRect(rectF2, f3, f3, this.LLJIJIL);
    }

    public final void setAnchorViewLeft(float f) {
        this.LLJJIJI = f;
    }

    public final void setAnchorViewWidth(float f) {
        this.LLJJIJIIJIL = f;
    }

    public final void setMarginScrollLeft(float f) {
        this.LLJJI = f;
    }

    public final void setOutScrollX(int i) {
        this.LLJJIII = i;
    }
}
