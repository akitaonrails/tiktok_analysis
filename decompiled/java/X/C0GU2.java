package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0GU2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GU2 extends FrameLayout {
    public final float LL;
    public final float LLILLJJLI;
    public final Paint LLILLL;
    public final Path LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C01GW LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public boolean LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final float LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public final float LLJJIJIL;
    public final Path LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    public C0GU2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final Drawable getMusicIconDrawable() {
        return (Drawable) this.LLIZ.getValue();
    }

    private final Paint getSwapBadgePaint() {
        return (Paint) this.LLJJJIL.getValue();
    }

    private final Drawable getSwapMusicIconDrawable() {
        return (Drawable) this.LLJJJJ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLJILJIL) {
            super.dispatchDraw(canvas);
            canvas.save();
            canvas.translate(this.LLJJIJIIJIL, this.LLJJIJIL);
            canvas.drawPath(this.LLJJJ, getSwapBadgePaint());
            canvas.restore();
            canvas.save();
            canvas.translate(this.LLJJIII, this.LLJJIJI);
            Drawable swapMusicIconDrawable = getSwapMusicIconDrawable();
            int i = this.LLJJ;
            int i2 = this.LLJJI;
            swapMusicIconDrawable.setBounds(i, i2, this.LLJILJILJ + i, this.LLJILLL + i2);
            getSwapMusicIconDrawable().draw(canvas);
            canvas.restore();
            return;
        }
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        canvas.translate(this.LL, this.LLILLJJLI);
        canvas.drawPath(this.LLILZ, this.LLILLL);
        canvas.restore();
        getMusicIconDrawable().setBounds(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
        getMusicIconDrawable().draw(canvas);
    }

    public final void setSwapMode(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        invalidate();
    }

    public C0GU2(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        float fLIZIZ = C418440Gaw.LIZIZ(10);
        float fLIZIZ2 = C418440Gaw.LIZIZ(10);
        float dimension = fLIZIZ + (context.getResources().getDimension(R.dimen.ahw) / 2);
        this.LL = dimension;
        float fLIZIZ3 = fLIZIZ2 + C418440Gaw.LIZIZ(8);
        this.LLILLJJLI = fLIZIZ3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLILLL = paint;
        Path path = new Path();
        path.moveTo(0.0f, C418440Gaw.LIZIZ(Float.valueOf(7.22217f)));
        float fLIZIZ4 = C418440Gaw.LIZIZ(Float.valueOf(4.19251f));
        Float fValueOf = Float.valueOf(2.2586f);
        float fLIZIZ5 = C418440Gaw.LIZIZ(fValueOf);
        float fLIZIZ6 = C418440Gaw.LIZIZ(Float.valueOf(1.63819f));
        Float fValueOf2 = Float.valueOf(5.26546f);
        path.cubicTo(0.0f, fLIZIZ4, fLIZIZ5, fLIZIZ6, C418440Gaw.LIZIZ(fValueOf2), C418440Gaw.LIZIZ(Float.valueOf(1.26729f)));
        Float fValueOf3 = Float.valueOf(12.0f);
        path.lineTo(C418440Gaw.LIZIZ(fValueOf3), C418440Gaw.LIZIZ(Float.valueOf(0.0f)));
        float fLIZIZ7 = C418440Gaw.LIZIZ(fValueOf3);
        Float fValueOf4 = Float.valueOf(15.0f);
        path.lineTo(fLIZIZ7, C418440Gaw.LIZIZ(fValueOf4));
        path.lineTo(0.0f, C418440Gaw.LIZIZ(fValueOf4));
        path.close();
        this.LLILZ = path;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLILZIL = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLILZLL = iLIZIZ2;
        this.LLIZ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 38));
        int iLIZIZ3 = (int) (dimension + C418440Gaw.LIZIZ(2));
        this.LLIZLLLIL = iLIZIZ3;
        int iLIZIZ4 = (int) (fLIZIZ3 + C418440Gaw.LIZIZ(2));
        this.LLJ = iLIZIZ4;
        this.LLJI = iLIZIZ3 + iLIZIZ;
        this.LLJIJIL = iLIZIZ4 + iLIZIZ2;
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        Double dValueOf = Double.valueOf(-0.5d);
        this.LLJJIII = C418440Gaw.LIZIZ(dValueOf);
        this.LLJJIJI = C418440Gaw.LIZIZ(dValueOf);
        this.LLJJIJIIJIL = C418440Gaw.LIZIZ(Double.valueOf(16.5d));
        this.LLJJIJIL = C418440Gaw.LIZIZ(15);
        Path path2 = new Path();
        path2.moveTo(0.0f, C418440Gaw.LIZIZ(Float.valueOf(6.72217f)));
        path2.cubicTo(0.0f, C418440Gaw.LIZIZ(Float.valueOf(3.69251f)), C418440Gaw.LIZIZ(fValueOf), C418440Gaw.LIZIZ(Float.valueOf(1.13819f)), C418440Gaw.LIZIZ(fValueOf2), C418440Gaw.LIZIZ(Float.valueOf(0.76729f)));
        Float fValueOf5 = Float.valueOf(11.4858f);
        path2.lineTo(C418440Gaw.LIZIZ(fValueOf5), 0.0f);
        float fLIZIZ8 = C418440Gaw.LIZIZ(fValueOf5);
        Float fValueOf6 = Float.valueOf(13.6636f);
        path2.lineTo(fLIZIZ8, C418440Gaw.LIZIZ(fValueOf6));
        path2.lineTo(0.0f, C418440Gaw.LIZIZ(fValueOf6));
        path2.close();
        this.LLJJJ = path2;
        this.LLJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(333));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 39));
        setWillNotDraw(false);
    }
}
