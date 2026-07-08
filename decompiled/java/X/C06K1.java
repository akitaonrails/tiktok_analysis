package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.06K1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06K1 {
    public static final Rect LIZ = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    public static final Rect LIZIZ = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    public static final Rect LIZJ = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    public static final Rect LIZLLL = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    public static final Rect LJ = new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
    public static final Rect LJFF = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));

    public static Object LIZ(C06K2 c06k2) {
        Rect rect;
        C0I0B.LJFF.LIZJ();
        boolean zLIZLLL = C426750GoL.LIZLLL(C894660Z7w.LIZ());
        int i = C06ID.LIZ[c06k2.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (zLIZLLL) {
                        rect = LJFF;
                    } else {
                        rect = LJ;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else if (zLIZLLL) {
                rect = LIZLLL;
            } else {
                rect = LIZJ;
            }
        } else if (zLIZLLL) {
            rect = LIZIZ;
        } else {
            rect = LIZ;
        }
        final int i2 = c06k2.LIZIZ;
        if (i2 > 0 && c06k2.LIZLLL) {
            int i3 = c06k2.LIZJ;
            EnumC1578706Gb enumC1578706Gb = c06k2.LIZ;
            C06GU c06gu = C06GU.LIZ;
            final Drawable drawableLIZ = c06gu.LIZJ().LIZ(i3, enumC1578706Gb);
            drawableLIZ.setBounds(rect.left, rect.top, rect.right, rect.bottom);
            final int iLIZJ = c06gu.LIZJ().LIZJ(i3, enumC1578706Gb, null);
            return new ReplacementSpan(drawableLIZ, i2, iLIZJ) { // from class: X.0GV6
                public final Drawable LL;
                public final int LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                public int LLILZIL;
                public int LLILZLL;
                public Rect LLIZ;
                public int LLIZLLLIL;

                public final void LIZ() {
                    Rect bounds = this.LL.getBounds();
                    this.LLIZ = bounds;
                    this.LLILZIL = bounds != null ? bounds.width() : 0;
                    Rect rect2 = this.LLIZ;
                    this.LLILZLL = rect2 != null ? rect2.height() : 0;
                }

                {
                    this.LL = drawableLIZ;
                    this.LLILLJJLI = i2;
                    this.LLILLL = iLIZJ;
                    LIZ();
                }

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                    int iIntValue;
                    LIZ();
                    int i6 = this.LLILZIL + this.LLILZ;
                    Integer numValueOf = Integer.valueOf(this.LLIZLLLIL);
                    if (numValueOf.intValue() > 0) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(paint.measureText(String.valueOf(this.LLILLJJLI))));
                        this.LLIZLLLIL = numValueOf2.intValue();
                        iIntValue = numValueOf2.intValue();
                    }
                    return i6 + iIntValue;
                }

                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                    int i9 = i8 + i6;
                    float f2 = (i9 - this.LLILZLL) / 2;
                    canvas.translate(f, f2);
                    this.LL.draw(canvas);
                    canvas.translate(-f, -f2);
                    int color = paint.getColor();
                    paint.setColor(this.LLILLL);
                    Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                    canvas.drawText(String.valueOf(this.LLILLJJLI), f + this.LLILZIL + this.LLILZ, i7 - (((((fontMetricsInt.descent + i7) + i7) + fontMetricsInt.ascent) / 2.0f) - (i9 / 2.0f)), paint);
                    paint.setColor(color);
                }
            };
        }
        Drawable drawableLIZ2 = C06GU.LIZ.LIZJ().LIZ(c06k2.LIZJ, c06k2.LIZ);
        drawableLIZ2.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        return new C419890GdH(drawableLIZ2, 2);
    }
}
