package X;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.style.LineHeightSpan;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838530xwZ {
    public final EditText LIZ;
    public final C1838550xwb LIZIZ;
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final RectF LJ;

    public final void LIZ() throws Throwable {
        Paint.FontMetricsInt fontMetricsInt = this.LIZ.getPaint().getFontMetricsInt();
        int i = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i < 1) {
            i = 1;
        }
        float f = i;
        if (f <= 0.0f) {
            return;
        }
        this.LIZ.setLineSpacing(f * this.LIZIZ.LJFF, 1.0f);
        Editable editableLLJILLL = C2204961BRm.LLJILLL(this.LIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HZz8IVm6AtN3vWxiGjZj1sH4hNhh4LUGrTxdEXcO5skEsq1vsCJXzjO9M4NOuMrgja+JEHCPA==", null));
        for (Object obj : editableLLJILLL.getSpans(0, editableLLJILLL.length(), C416650GVj.class)) {
            editableLLJILLL.removeSpan(obj);
        }
        C1838550xwb c1838550xwb = this.LIZIZ;
        final float f2 = c1838550xwb.LIZ;
        final float f3 = c1838550xwb.LIZIZ;
        final int i2 = fontMetricsInt.ascent;
        final int i3 = fontMetricsInt.descent;
        editableLLJILLL.setSpan(new LineHeightSpan(f2, f3, i2, i3) { // from class: X.0GVj
            public final float LL;
            public final float LLILLJJLI;
            public final int LLILLL;
            public final int LLILZ;
            public final int LLILZIL;

            {
                this.LL = f2;
                this.LLILLJJLI = f3;
                this.LLILLL = i2;
                this.LLILZ = i3;
                int i4 = i3 - i2;
                this.LLILZIL = i4 < 1 ? 1 : i4;
            }

            @Override // android.text.style.LineHeightSpan
            public final void chooseHeight(CharSequence charSequence, int i4, int i5, int i6, int i7, Paint.FontMetricsInt fontMetricsInt2) {
                int iCeil = (int) Math.ceil(((double) this.LL) * ((double) this.LLILZIL));
                int i8 = 0;
                if (iCeil < 0) {
                    iCeil = 0;
                }
                int iCeil2 = (int) Math.ceil(((double) this.LLILLJJLI) * ((double) this.LLILZIL));
                if (iCeil2 >= 0) {
                    i8 = iCeil2;
                }
                int i9 = this.LLILLL - iCeil;
                fontMetricsInt2.ascent = i9;
                fontMetricsInt2.top = Math.min(fontMetricsInt2.top, i9);
                int i10 = this.LLILZ + i8;
                fontMetricsInt2.descent = i10;
                fontMetricsInt2.bottom = Math.max(fontMetricsInt2.bottom, i10);
            }
        }, 0, editableLLJILLL.length(), 18);
    }

    public final int LIZJ() {
        Paint.FontMetricsInt fontMetricsInt = this.LIZ.getPaint().getFontMetricsInt();
        int i = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i <= 0) {
            return 0;
        }
        return i;
    }

    public final int LIZIZ() {
        int iLIZJ = (int) (this.LIZIZ.LJ * LIZJ());
        if (iLIZJ < 0) {
            return 0;
        }
        return iLIZJ;
    }

    public final int LIZLLL() {
        int iLIZJ = (int) (this.LIZIZ.LIZLLL * LIZJ());
        if (iLIZJ < 0) {
            return 0;
        }
        return iLIZJ;
    }

    public C1838530xwZ(EditText editText) {
        this.LIZ = editText;
        C1838550xwb c1838550xwb = new C1838550xwb();
        this.LIZIZ = c1838550xwb;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(c1838550xwb.LJI);
        this.LIZJ = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(c1838550xwb.LJIIIZ);
        paint2.setColor(c1838550xwb.LJIIIIZZ);
        this.LIZLLL = paint2;
        this.LJ = new RectF();
    }

    public final void LJ(Function1<? super C1838550xwb, Unit> function1) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1838550xwb c1838550xwb = this.LIZIZ;
        float f = c1838550xwb.LIZ;
        float f2 = c1838550xwb.LIZIZ;
        float f3 = c1838550xwb.LIZJ;
        float f4 = c1838550xwb.LIZLLL;
        float f5 = c1838550xwb.LJ;
        float f6 = c1838550xwb.LJFF;
        int i = c1838550xwb.LJI;
        boolean z5 = c1838550xwb.LJII;
        int i2 = c1838550xwb.LJIIIIZZ;
        float f7 = c1838550xwb.LJIIIZ;
        function1.invoke(c1838550xwb);
        C1838550xwb c1838550xwb2 = this.LIZIZ;
        c1838550xwb2.LJIIIZ = Math.max(0.0f, c1838550xwb2.LJIIIZ);
        int i3 = this.LIZIZ.LJI;
        if (i != i3) {
            this.LIZJ.setColor(i3);
            z = true;
        } else {
            z = false;
        }
        int i4 = this.LIZIZ.LJIIIIZZ;
        if (i2 != i4) {
            this.LIZLLL.setColor(i4);
            z = true;
        }
        float f8 = this.LIZIZ.LJIIIZ;
        if (f7 != f8) {
            this.LIZLLL.setStrokeWidth(f8);
            z = true;
        }
        C1838550xwb c1838550xwb3 = this.LIZIZ;
        if (f4 == c1838550xwb3.LIZLLL && f5 == c1838550xwb3.LJ) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (f == c1838550xwb3.LIZ && f2 == c1838550xwb3.LIZIZ && f6 == c1838550xwb3.LJFF) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (f3 == c1838550xwb3.LIZJ && z5 == c1838550xwb3.LJII) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3) {
            LIZ();
            this.LIZ.requestLayout();
            z = true;
        }
        if (z2) {
            this.LIZ.requestLayout();
            z = true;
        }
        if (z4 || z) {
            this.LIZ.invalidate();
        }
        C20441214yg.LIZIZ("DSLInlineBgCfg", C09AZ.LIZJ("\n            updateConfig() configId:" + this.LIZIZ.hashCode() + " controllerId:" + hashCode() + "\n            ├─ paddingTopPctOfA    : " + f + " -> " + this.LIZIZ.LIZ + "\n            ├─ paddingBottomPctOfA : " + f2 + " -> " + this.LIZIZ.LIZIZ + "\n            ├─ paddingStartPctOfA  : " + f4 + " -> " + this.LIZIZ.LIZLLL + "\n            ├─ paddingEndPctOfA    : " + f5 + " -> " + this.LIZIZ.LJ + "\n            ├─ cornerRadiusPctOfA  : " + f3 + " -> " + this.LIZIZ.LIZJ + "\n            ├─ lineSpacingPctOfA   : " + f6 + " -> " + this.LIZIZ.LJFF + "\n            ├─ bgColor             : 0x" + C19970013Bq.LIZJ(i) + " -> 0x" + C19970013Bq.LIZJ(this.LIZIZ.LJI) + "\n            ├─ debugDrawAMidline   : " + z5 + " -> " + this.LIZIZ.LJII + "\n            ├─ debugLineColor      : 0x" + C19970013Bq.LIZJ(i2) + " -> 0x" + C19970013Bq.LIZJ(this.LIZIZ.LJIIIIZZ) + "\n            ├─ debugLineWidthPx    : " + f7 + " -> " + this.LIZIZ.LJIIIZ + "\n            ├─ affectsTextMeasure  : " + z2 + "\n            ├─ affectsLineSpacing  : " + z3 + "\n            └─ affectsDrawOnly     : " + z4 + "\n            "));
    }
}
