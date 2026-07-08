package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.0ETr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365250ETr extends View {
    public final C365260ETs LL;
    public EnumC365230ETp LLILLJJLI;
    public final Drawable LLILLL;
    public final Drawable LLILZ;
    public final Rect LLILZIL;
    public final Rect LLILZLL;
    public final RectF LLIZ;
    public final Paint LLIZLLLIL;

    public final int getRightHandlerX$tools_camera_edit_release() {
        return getRight() - this.LL.LJFF;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = C365240ETq.LIZ[this.LLILLJJLI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            Drawable drawable = this.LLILZ;
                            if (drawable != null) {
                                drawable.setBounds(this.LLILZLL);
                            }
                            Drawable drawable2 = this.LLILZ;
                            if (drawable2 != null) {
                                drawable2.draw(canvas);
                            }
                            canvas.drawRoundRect(this.LLIZ, 0.0f, 0.0f, this.LLIZLLLIL);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        Drawable drawable3 = this.LLILLL;
                        if (drawable3 != null) {
                            drawable3.setBounds(this.LLILZIL);
                        }
                        Drawable drawable4 = this.LLILLL;
                        if (drawable4 != null) {
                            drawable4.draw(canvas);
                        }
                        canvas.drawRoundRect(this.LLIZ, 0.0f, 0.0f, this.LLIZLLLIL);
                    }
                } else {
                    Drawable drawable5 = this.LLILLL;
                    if (drawable5 != null) {
                        drawable5.setBounds(this.LLILZIL);
                    }
                    Drawable drawable6 = this.LLILLL;
                    if (drawable6 != null) {
                        drawable6.draw(canvas);
                    }
                    Drawable drawable7 = this.LLILZ;
                    if (drawable7 != null) {
                        drawable7.setBounds(this.LLILZLL);
                    }
                    Drawable drawable8 = this.LLILZ;
                    if (drawable8 != null) {
                        drawable8.draw(canvas);
                    }
                    canvas.drawRoundRect(this.LLIZ, 0.0f, 0.0f, this.LLIZLLLIL);
                }
            } else {
                RectF rectF = this.LLIZ;
                float f = this.LL.LIZLLL;
                canvas.drawRoundRect(rectF, f, f, this.LLIZLLLIL);
            }
            super.onDraw(canvas);
        }
    }

    public final void setSlot$tools_camera_edit_release(EnumC365230ETp enumC365230ETp) {
        this.LLILLJJLI = enumC365230ETp;
        invalidate();
    }

    public C365250ETr(C365260ETs c365260ETs, Context context) {
        super(context, null, 0);
        this.LL = c365260ETs;
        this.LLILLJJLI = EnumC365230ETp.NONE;
        this.LLILLL = C800330VaR.LIZIZ(context, c365260ETs.LIZ);
        this.LLILZ = C800330VaR.LIZIZ(context, c365260ETs.LIZIZ);
        this.LLILZIL = new Rect();
        this.LLILZLL = new Rect();
        this.LLIZ = new RectF();
        Paint paint = new Paint();
        paint.setColor(C960203pA.LIZ(c365260ETs.LIZJ, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(c365260ETs.LJ);
        this.LLIZLLLIL = paint;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.LLILZIL.set(0, 0, this.LL.LJFF, i6);
        this.LLILZLL.set(i5 - this.LL.LJFF, 0, i5, i6);
        RectF rectF = this.LLIZ;
        C365260ETs c365260ETs = this.LL;
        int i7 = c365260ETs.LJFF;
        rectF.set(i7 - r1, c365260ETs.LJ / 2, (i5 - i7) + r1, i6 - r1);
        setElevation(C418440Gaw.LIZIZ(3));
    }
}
