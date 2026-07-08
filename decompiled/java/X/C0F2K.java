package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS77S0100000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.0F2K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2K extends FrameLayout {
    public final boolean LL;
    public final float LLILLJJLI;
    public final Paint LLILLL;
    public final RectF LLILZ;
    public final float[] LLILZIL;
    public final Path LLILZLL;
    public final float[] LLIZ;
    public boolean LLIZLLLIL;
    public final C197039127h LLJ;
    public Function0<Unit> LLJI;

    public final void LIZ() {
        float[] fArr = this.LLILZIL;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        this.LLIZLLLIL = f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f;
        this.LLILZLL.reset();
        if (!this.LLIZLLLIL || this.LLILZ.isEmpty()) {
            return;
        }
        float[] fArr2 = this.LLIZ;
        fArr2[0] = f;
        fArr2[1] = f;
        fArr2[2] = f2;
        fArr2[3] = f2;
        fArr2[4] = f3;
        fArr2[5] = f3;
        fArr2[6] = f4;
        fArr2[7] = f4;
        this.LLILZLL.addRoundRect(this.LLILZ, fArr2, Path.Direction.CW);
    }

    public final Function0<Unit> getOnAlbumBtnClicked() {
        return this.LLJI;
    }

    public C0F2K(Context context) {
        int iIntValue;
        super(context, null);
        C1446760nkg.LIZ.getClass();
        boolean zLIZJ = C1446760nkg.LIZJ();
        this.LL = zLIZJ;
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        this.LLILLJJLI = fLIZIZ;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fLIZIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LLILLL = paint;
        this.LLILZ = new RectF();
        this.LLILZIL = new float[4];
        this.LLILZLL = new Path();
        this.LLIZ = new float[8];
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.5f))));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.5f)));
        C786410Ut5.J6(c197039127h, layoutParams);
        c197039127h.setButtonSize(1);
        c197039127h.setButtonVariant(2);
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_image_alt_1));
        c197039127h.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        c197039127h.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        c197039127h.setIconTintColorRes(R.attr.z_);
        c197039127h.LJJJJL(new AwS580S0100000_1(context, 901));
        this.LLJ = c197039127h;
        if (zLIZJ) {
            setWillNotDraw(false);
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a0p);
            setBackground(c384050F3z.LIZ(getContext()));
        }
        addView(c197039127h);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.LL) {
            return;
        }
        if (this.LLIZLLLIL) {
            canvas.drawPath(this.LLILZLL, this.LLILLL);
        } else {
            canvas.drawRect(this.LLILZ, this.LLILLL);
        }
    }

    public final void setOnAlbumBtnClicked(Function0<Unit> function0) {
        this.LLJI = function0;
        if (function0 != null) {
            C786410Ut5.I7(new AkS77S0100000_5((Function0) function0, 8), this.LLJ);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.LL) {
            return;
        }
        float f = this.LLILLJJLI / 2.0f;
        this.LLILZ.set(f, f, i - f, i2 - f);
        LIZ();
    }
}
