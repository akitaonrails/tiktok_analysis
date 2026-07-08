package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367260Eaa extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final float LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public final int LLIZLLLIL;
    public final RectF LLJ;

    public final int getMaxProgress() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLJ;
        float f = this.LLILZIL;
        float f2 = 2;
        rectF.set(f / f2, f / f2, getWidth() - (this.LLILZIL / f2), getHeight() - (this.LLILZIL / f2));
        this.LL.setColor(this.LLILLL);
        canvas.drawArc(this.LLJ, -90.0f, (this.LLILZLL / this.LLIZLLLIL) * 360, false, this.LL);
        this.LL.setColor(this.LLILZ);
        canvas.drawArc(this.LLJ, -90.0f, 360.0f, false, this.LL);
        canvas.drawText(this.LLIZ, getWidth() / 2.0f, (getHeight() / 2) + (Math.abs(this.LLILLJJLI.ascent() + this.LLILLJJLI.descent()) / f2), this.LLILLJJLI);
    }

    public final void setProgress(int i) {
        this.LLILZLL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        this.LLIZ = C2188811AlT.LIZIZ(sbLIZ);
        invalidate();
    }

    public C367260Eaa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        int color = getResources().getColor(R.color.to);
        this.LLILLL = color;
        this.LLILZ = getResources().getColor(R.color.tn);
        float fLIZ = C390810FTz.LIZ(2.0f);
        this.LLILZIL = fLIZ;
        this.LLILZLL = 40;
        this.LLIZ = "100%";
        this.LLIZLLLIL = 100;
        this.LLJ = new RectF();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fLIZ);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(C390810FTz.LIZ(11.0f));
        paint2.setColor(color);
    }
}
