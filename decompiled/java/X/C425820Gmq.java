package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425820Gmq extends FrameLayout {
    public final C427660Gpo LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public boolean LLILZIL;
    public final Path LLILZLL;
    public final Path LLIZ;
    public int LLIZLLLIL;
    public final Paint LLJ;
    public final TuxIconDrawable LLJI;
    public final /* synthetic */ C425830Gmr LLJIJIL;

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void LIZ(UrlModel urlModel) {
        ImageUrlModel imageUrlModelLIZ;
        if (urlModel != null && (imageUrlModelLIZ = C438710HIf.LIZ(urlModel)) != null) {
            C427660Gpo.LJIIJJI(this.LL, imageUrlModelLIZ, false, null, null, false, false, null, null, false, null, 1022);
        } else {
            this.LL.setImageDrawable(this.LLJI);
        }
    }

    public final void LIZIZ(boolean z) {
        if (this.LLILZIL != z) {
            this.LLILZIL = z;
            setClipToOutline(z);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        Path path;
        if (this.LLILZIL) {
            super.dispatchDraw(canvas);
            float f2 = this.LLILLJJLI;
            canvas.drawCircle(f2, f2, (f2 - 1.0f) - (this.LLILLL / 2.0f), this.LLJ);
            return;
        }
        int iSave = canvas.save();
        int width = getWidth() << 1;
        if (getLayoutDirection() == 1) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = width | i;
        if (i2 == this.LLIZLLLIL) {
            path = this.LLILZLL;
        } else {
            if (getLayoutDirection() == 1) {
                f = this.LLILLJJLI - this.LLJIJIL.LLILLL;
            } else {
                f = this.LLJIJIL.LLILLL + this.LLILLJJLI;
            }
            this.LLILZLL.reset();
            Path path2 = this.LLILZLL;
            float f3 = this.LLILLJJLI;
            path2.addCircle(f3, f3, f3 - 1.0f, Path.Direction.CW);
            this.LLIZ.reset();
            Path path3 = this.LLIZ;
            float f4 = this.LLILLJJLI;
            path3.addCircle(f, f4, this.LLILZ + f4, Path.Direction.CW);
            this.LLILZLL.op(this.LLIZ, Path.Op.DIFFERENCE);
            this.LLIZLLLIL = i2;
            path = this.LLILZLL;
        }
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        float f5 = this.LLILLJJLI;
        canvas.drawCircle(f5, f5, (f5 - 1.0f) - (this.LLILLL / 2.0f), this.LLJ);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C425820Gmq(C425830Gmr c425830Gmr, Context context) {
        int iIntValue;
        super(context);
        this.LLJIJIL = c425830Gmr;
        C427660Gpo c427660Gpo = new C427660Gpo(context, null, 6, 0);
        this.LL = c427660Gpo;
        this.LLILLJJLI = c425830Gmr.LLILLJJLI / 2.0f;
        float f = c425830Gmr.LL;
        float f2 = 0.3f * f;
        this.LLILLL = f2;
        this.LLILZ = f * 1.5f;
        this.LLILZIL = true;
        this.LLILZLL = new Path();
        this.LLIZ = new Path();
        this.LLIZLLLIL = -1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -3355444;
        }
        paint.setColor(iIntValue);
        this.LLJ = paint;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        this.LLJI = tuxIconDrawableLIZ;
        setClipChildren(false);
        setOutlineProvider(new C0ID9(27));
        setClipToOutline(true);
        c427660Gpo.setPlaceholderImage(tuxIconDrawableLIZ);
        addView(c427660Gpo, new FrameLayout.LayoutParams(-1, -1));
    }
}
