package X;

import Y.ATListenerS439S0100000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Emh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374770Emh extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public View LLILZ;
    public Bitmap LLILZIL;
    public Function2<? super Long, ? super PointF, Unit> LLILZLL;
    public Function0<Unit> LLIZ;
    public Function1<? super Function0<Unit>, Unit> LLIZLLLIL;
    public long LLJ;
    public C376700Epo LLJI;
    public PointF LLJIJIL;
    public PointF LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public final float LLJJI;
    public boolean LLJJIII;

    public final void LIZJ() {
        if (this.LL.getWidth() == 0 || this.LL.getHeight() == 0 || this.LLILLL.getWidth() == 0 || this.LLILLJJLI.getWidth() == 0) {
            return;
        }
        LIZIZ(this.LL.getX() + (this.LL.getWidth() / 2.0f), this.LL.getY() + (this.LL.getHeight() / 2.0f));
    }

    public final void LIZLLL() {
        Bitmap bitmap = this.LLILZIL;
        if (bitmap == null) {
            return;
        }
        float translationX = this.LLILLL.getTranslationX() + (this.LL.getWidth() / 2.0f);
        float width = bitmap.getWidth() - 1.0f;
        if (translationX > width) {
            translationX = width;
        }
        float translationY = this.LLILLL.getTranslationY() + (this.LL.getHeight() / 2.0f);
        float height = bitmap.getHeight() - 1.0f;
        if (translationY > height) {
            translationY = height;
        }
        if (translationX < 0.0f || translationY < 0.0f) {
            return;
        }
        long pixel = ((long) bitmap.getPixel((int) translationX, (int) translationY)) & 4294967295L;
        this.LLJ = pixel;
        setRingColor(pixel);
        Function2<? super Long, ? super PointF, Unit> function2 = this.LLILZLL;
        if (function2 != null) {
            function2.invoke(Long.valueOf(this.LLJ), new PointF(this.LLILLL.getTranslationX(), this.LLILLL.getTranslationY()));
        }
    }

    public final boolean getEnableTouchEvent() {
        return this.LLJJIII;
    }

    public final int LIZ(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    public final void setEnableTouchEvent(boolean z) {
        this.LLJJIII = z;
    }

    public final void setInitialColor$tools_camera_edit_release(long j) {
        this.LLJ = j;
        setRingColor(j);
    }

    public final void setOnBitmapRefreshRequestListener(Function1<? super Function0<Unit>, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setOnColorPickedListener(Function2<? super Long, ? super PointF, Unit> function2) {
        this.LLILZLL = function2;
    }

    public final void setOnColorReleasedListener(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setRingColor(long j) {
        int iLIZ = LIZ(100);
        int iLIZ2 = LIZ(14);
        int iLIZ3 = LIZ(1);
        if (j == 0) {
            View view = this.LLILLJJLI;
            C376700Epo c376700Epo = this.LLJI;
            if (c376700Epo == null) {
                float f = iLIZ3;
                c376700Epo = new C376700Epo(getContext(), iLIZ / 2.0f, iLIZ2 + (2.0f * f), f);
                this.LLJI = c376700Epo;
            }
            view.setBackground(c376700Epo);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i = iLIZ - iLIZ3;
        gradientDrawable.setSize(i, i);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(iLIZ3, -1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        int i2 = (iLIZ - (iLIZ3 * 2)) - iLIZ2;
        gradientDrawable2.setSize(i2, i2);
        gradientDrawable2.setColor(0);
        gradientDrawable2.setStroke(iLIZ2, (int) j);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        int i3 = iLIZ2 + iLIZ3;
        int i4 = (iLIZ - (i3 * 2)) - iLIZ3;
        gradientDrawable3.setSize(i4, i4);
        gradientDrawable3.setColor(0);
        gradientDrawable3.setStroke(iLIZ3, -1);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2, gradientDrawable3});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, iLIZ3, iLIZ3, iLIZ3, iLIZ3);
        layerDrawable.setLayerInset(2, i3, i3, i3, i3);
        this.LLILLJJLI.setBackground(layerDrawable);
    }

    public C374770Emh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJIJIL = new PointF();
        this.LLJILJIL = new PointF();
        this.LLJJI = 10.0f;
        this.LLJJIII = true;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c4l, this, true);
        setClipChildren(false);
        setClipToPadding(false);
        this.LL = findViewById(R.id.ko1);
        this.LLILLJJLI = findViewById(R.id.qfi);
        this.LLILLL = findViewById(R.id.qfg);
        setOnTouchListener(new ATListenerS439S0100000_5(this, 3));
    }

    public final void LIZIZ(float f, float f2) {
        if (this.LL.getWidth() != 0 && this.LL.getHeight() != 0 && this.LLILLL.getWidth() != 0 && this.LLILLJJLI.getWidth() != 0) {
            PointF pointF = this.LLJILJIL;
            float f3 = pointF.x + f;
            float f4 = pointF.y + f2;
            this.LLJIJIL = new PointF(f3, f4);
            float width = this.LLILLL.getWidth() / 2.0f;
            float width2 = this.LL.getWidth();
            float height = this.LL.getHeight();
            float x = f3 - this.LL.getX();
            float y = f4 - this.LL.getY();
            float fLIZLLL = C13LZ.LIZLLL(x - width, 0.0f, width2 - this.LLILLL.getWidth());
            float fLIZLLL2 = C13LZ.LIZLLL(y - width, 0.0f, height - this.LLILLL.getHeight());
            C786410Ut5.Fd(this.LLILLL, fLIZLLL);
            C786410Ut5.Ld(this.LLILLL, fLIZLLL2);
            float x2 = ((this.LL.getX() + fLIZLLL) + width) - (this.LLILLJJLI.getWidth() / 2.0f);
            float y2 = ((this.LL.getY() + fLIZLLL2) + width) - (this.LLILLJJLI.getHeight() / 2.0f);
            C786410Ut5.Fd(this.LLILLJJLI, x2);
            C786410Ut5.Ld(this.LLILLJJLI, y2);
        }
    }
}
