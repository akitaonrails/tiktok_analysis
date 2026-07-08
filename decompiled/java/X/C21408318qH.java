package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.text.style.UpdateLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21408318qH extends C11G2 implements SpanWatcher {
    public final C21408418qI LLILLJJLI;
    public final C21408618qK LLILLL;
    public final List<C21408718qL> LLILZ;
    public final C21408718qL LLILZIL;
    public final C21408918qN LLILZLL;
    public final boolean LLIZ;
    public final ArrayList<Layout> LLIZLLLIL;
    public final TextPaint LLJ;
    public final Rect LLJI;
    public final Paint LLJIJIL;
    public final Rect LLJILJIL;
    public final Paint LLJILJILJ;
    public final GradientDrawable LLJILLL;
    public final Paint LLJJ;
    public boolean LLJJI;
    public final GradientDrawable LLJJIII;
    public int LLJJIJI;
    public InterfaceC328600CuQ LLJJIJIIJIL;

    public final int LIZLLL() {
        C21408418qI c21408418qI = this.LLILLJJLI;
        int i = c21408418qI.LJII;
        if (i < 0) {
            i = c21408418qI.LJJI;
        }
        int i2 = c21408418qI.LJIIIIZZ;
        if (i2 < 0) {
            i2 = c21408418qI.LJJI;
        }
        return i + i2;
    }

    public final int LJ() {
        C21408418qI c21408418qI = this.LLILLJJLI;
        return c21408418qI.LJIL == 1 ? this.LLILZIL.LIZ == 0 ? C445120Hcs.LIZ(4) : c21408418qI.LJJ : c21408418qI.LJJ;
    }

    public final int LJFF() {
        Iterator<Layout> it2 = this.LLIZLLLIL.iterator();
        int width = 0;
        while (it2.hasNext()) {
            width += it2.next().getWidth() + LIZLLL();
        }
        return width;
    }

    public final int LJI() {
        C21408418qI c21408418qI = this.LLILLJJLI;
        return c21408418qI.LJIJ ? c21408418qI.LJ - this.LLJJIJI : Math.min(LJFF(), this.LLILLJJLI.LJ - this.LLJJIJI);
    }

    @Override // X.C11G2
    public final <Span> Span[] LIZ(int i, int i2, Class<Span> cls) {
        Spanned spanned;
        int iLJ = i2 - LJ();
        int iLIZIZ = i - C814420VxA.LIZIZ(this.LLILZLL.LIZIZ);
        C21408418qI c21408418qI = this.LLILLJJLI;
        int iLIZLLL = c21408418qI.LJII;
        if (iLIZLLL < 0) {
            iLIZLLL = c21408418qI.LJJI;
        }
        for (Layout layout : this.LLIZLLLIL) {
            int width = layout.getWidth() + iLIZLLL;
            if (iLIZLLL <= iLIZIZ && iLIZIZ <= width && iLJ >= 0 && iLJ <= layout.getHeight()) {
                int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(iLJ), iLIZIZ - iLIZLLL);
                CharSequence text = layout.getText();
                if (!(text instanceof Spanned) || (spanned = (Spanned) text) == null) {
                    return null;
                }
                return (Span[]) spanned.getSpans(iU3, iU3, cls);
            }
            iLIZLLL = LIZLLL() + width;
        }
        return null;
    }

    public final int LIZJ(C21408518qJ c21408518qJ, int i, int i2) {
        if (this.LLILLJJLI.LJIL == 1) {
            int iCeil = 0;
            while (this.LLILZIL.LIZIZ.iterator().hasNext()) {
                iCeil += ((int) Math.ceil(r4.next().LJ)) + i;
            }
            int iCeil2 = ((int) Math.ceil(c21408518qJ.LJ)) + i;
            C21408418qI c21408418qI = this.LLILLJJLI;
            if (iCeil < c21408418qI.LJ) {
                return iCeil2 + i2;
            }
            return Math.min(Math.max(c21408418qI.LJFF, ((int) Math.ceil(c21408518qJ.LJ)) + i), this.LLILLJJLI.LJI) + i2;
        }
        int size = this.LLILZIL.LIZIZ.size();
        float f = (c21408518qJ.LJ + i) * size;
        if (this.LLILLJJLI.LJIJ && f <= LJI() && size > 0) {
            return LJI() / size;
        }
        return Math.min(Math.max(this.LLILLJJLI.LJFF, ((int) c21408518qJ.LJ) + i), this.LLILLJJLI.LJI) + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r11, int r12, java.lang.CharSequence r13) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21408318qH.LJIIIIZZ(int, int, java.lang.CharSequence):void");
    }

    public final Layout LJIIIZ(CharSequence charSequence, int i, Layout.Alignment alignment) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LLJ, i).setIncludePad(false).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setMaxLines(Integer.MAX_VALUE).build();
    }

    public final void LJII(int i, CharSequence charSequence, C21408518qJ c21408518qJ, int i2) {
        Layout.Alignment alignment;
        Spanned spanned;
        int i3;
        int i4;
        SpannableString spannableString = new SpannableString(c21408518qJ.LIZIZ);
        if ((charSequence instanceof Spanned) && (i3 = c21408518qJ.LIZJ) > -1 && (i4 = c21408518qJ.LIZLLL) > -1) {
            for (CharacterStyle characterStyle : (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class)) {
                if (characterStyle != this) {
                    C786410Ut5.p2(spannableString, characterStyle, 0, spannableString.length(), 33);
                }
            }
        }
        int iLIZLLL = LIZLLL();
        int iLIZJ = LIZJ(c21408518qJ, iLIZLLL, i2) - iLIZLLL;
        int i5 = c21408518qJ.LIZ;
        if (i5 != 1) {
            if (i5 != 2) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout layoutLJIIIZ = LJIIIZ(spannableString, iLIZJ, alignment);
        C448970Hj5[] c448970Hj5Arr = (C448970Hj5[]) spannableString.getSpans(0, spannableString.length(), C448970Hj5.class);
        if (c448970Hj5Arr != null) {
            for (C448970Hj5 c448970Hj5 : c448970Hj5Arr) {
                spannableString.removeSpan(c448970Hj5);
            }
        }
        C786410Ut5.o2(spannableString, new C448970Hj5(layoutLJIIIZ), 0, spannableString.length(), 18);
        ListProtector.add(this.LLIZLLLIL, i, layoutLJIIIZ);
        if (this.LLJJIJIIJIL != null) {
            CharSequence text = layoutLJIIIZ.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                InterfaceC431020GvE[] interfaceC431020GvEArr = (InterfaceC431020GvE[]) spanned.getSpans(0, spanned.length(), InterfaceC431020GvE.class);
                if (interfaceC431020GvEArr != null) {
                    for (InterfaceC431020GvE interfaceC431020GvE : interfaceC431020GvEArr) {
                        interfaceC431020GvE.LJFF(this.LLJJIJIIJIL);
                    }
                }
            } else {
                return;
            }
        }
        C448880Hiw[] c448880HiwArr = (C448880Hiw[]) spannableString.getSpans(0, spannableString.length(), C448880Hiw.class);
        if (c448880HiwArr != null && c448880HiwArr.length != 0) {
            C089E c089e = new C089E(c448880HiwArr);
            while (c089e.hasNext()) {
                C448890Hix c448890Hix = ((C448880Hiw) c089e.next()).LLILLJJLI;
                if (c448890Hix.getCallback() == null) {
                    c448890Hix.LIZJ(new Drawable.Callback() { // from class: X.10nI
                        @Override // android.graphics.drawable.Drawable.Callback
                        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                        }

                        @Override // android.graphics.drawable.Drawable.Callback
                        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                        }

                        @Override // android.graphics.drawable.Drawable.Callback
                        public final void invalidateDrawable(Drawable drawable) {
                            C19351310nH c19351310nH = this.LL.LL;
                            if (c19351310nH != null) {
                                HandlerHook.viewRemoveCallbacks(c19351310nH.LIZIZ, c19351310nH.LIZ);
                                HandlerHook.viewPost(c19351310nH.LIZIZ, c19351310nH.LIZ);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof UpdateAppearance) && !(obj instanceof UpdateLayout)) {
            this.LLJJI = true;
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if ((obj instanceof UpdateAppearance) && !(obj instanceof UpdateLayout)) {
            this.LLJJI = true;
        }
    }

    public static final void LIZIZ(C21408318qH c21408318qH, C817403Hg c817403Hg, C817403Hg c817403Hg2, Canvas canvas, boolean z) {
        float fMax;
        float fMax2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (z) {
            fMax = c21408318qH.LLJILLL.getBounds().left;
        } else {
            float f9 = c21408318qH.LLJILLL.getBounds().right;
            C21408418qI c21408418qI = c21408318qH.LLILLJJLI;
            fMax = f9 - Math.max(c21408418qI.LJIIL, c21408418qI.LJIIJJI);
        }
        float f10 = c21408318qH.LLJILLL.getBounds().top;
        if (z) {
            float f11 = c21408318qH.LLJILLL.getBounds().left;
            C21408418qI c21408418qI2 = c21408318qH.LLILLJJLI;
            fMax2 = f11 + Math.max(c21408418qI2.LJIIL, c21408418qI2.LJIIJJI);
        } else {
            fMax2 = c21408318qH.LLJILLL.getBounds().right;
        }
        RectF rectF = new RectF(fMax, f10, fMax2, c21408318qH.LLJILLL.getBounds().bottom);
        Paint paint = c21408318qH.LLJJ;
        if (z) {
            f = rectF.left;
        } else {
            f = rectF.right;
        }
        float f12 = 0.0f;
        if (z) {
            f2 = rectF.right;
        } else {
            f2 = rectF.left;
        }
        paint.setShader(new LinearGradient(f, 0.0f, f2, 0.0f, new int[]{c21408318qH.LLILLJJLI.LJIIIZ, 0}, (float[]) null, Shader.TileMode.CLAMP));
        Path path = new Path();
        float[] fArr = new float[8];
        float f13 = 0.0f;
        if (z) {
            f12 = c817403Hg.element;
        }
        fArr[0] = f12;
        if (z) {
            f3 = c817403Hg.element;
        } else {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = c817403Hg.element;
        }
        fArr[2] = f4;
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = c817403Hg.element;
        }
        fArr[3] = f5;
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = c817403Hg2.element;
        }
        fArr[4] = f6;
        if (z) {
            f7 = 0.0f;
        } else {
            f7 = c817403Hg2.element;
        }
        fArr[5] = f7;
        if (z) {
            f8 = c817403Hg2.element;
        } else {
            f8 = 0.0f;
        }
        fArr[6] = f8;
        if (z) {
            f13 = c817403Hg2.element;
        }
        fArr[7] = f13;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, c21408318qH.LLJJ);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iMax;
        LJIIIIZZ(i, i2, charSequence);
        C21408918qN c21408918qN = this.LLILZLL;
        c21408918qN.LIZJ = Math.max(0.0f, Math.max(c21408918qN.LIZJ, LJFF() - (this.LLILLJJLI.LJ - this.LLJJIJI)));
        if (this.LLIZLLLIL.size() > 0 && fontMetricsInt != null) {
            if (this.LLILZIL.LIZ == C1697810uHb.LJIIJ(this.LLILZ)) {
                iMax = Math.max(this.LLILLJJLI.LJJ, C814420VxA.LIZIZ(this.LLILLL.LIZIZ + 0.0f));
            } else {
                iMax = this.LLILLJJLI.LJJ;
            }
            ArrayList<Layout> arrayList = this.LLIZLLLIL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator<Layout> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(it2.next().getHeight()));
            }
            int i3 = -(((Number) C13LP.LJJLJ(arrayList2)).intValue() + LJ() + iMax);
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
            this.LLJJI = false;
        }
        return LJI();
    }

    public C21408318qH(C21408418qI c21408418qI, C21408618qK c21408618qK, List<C21408718qL> list, C21408718qL c21408718qL, C21408918qN c21408918qN, boolean z) {
        this.LLILLJJLI = c21408418qI;
        this.LLILLL = c21408618qK;
        this.LLILZ = list;
        this.LLILZIL = c21408718qL;
        this.LLILZLL = c21408918qN;
        this.LLIZ = z;
        this.LLIZLLLIL = new ArrayList<>(c21408718qL.LIZIZ.size());
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(c21408418qI.LJIIJ);
        textPaint.setColor(c21408418qI.LJIILJJIL);
        this.LLJ = textPaint;
        this.LLJI = new Rect();
        Paint paint = new Paint(1);
        paint.setColor(c21408418qI.LIZ);
        this.LLJIJIL = paint;
        this.LLJILJIL = new Rect();
        this.LLJILJILJ = new Paint(1);
        this.LLJILLL = new GradientDrawable();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.LLJJ = paint2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(c21408618qK.LIZJ);
        gradientDrawable.setBounds(0, 0, c21408618qK.LIZ, c21408618qK.LIZIZ);
        gradientDrawable.setCornerRadius(c21408618qK.LIZIZ * 0.5f);
        this.LLJJIII = gradientDrawable;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if ((obj instanceof UpdateAppearance) && !(obj instanceof UpdateLayout)) {
            this.LLJJI = true;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Drawable drawableLIZ;
        int iSave;
        int iLJI;
        int i7;
        int i8;
        float fMax;
        float fMax2;
        float f2;
        if (this.LLJJI) {
            LJIIIIZZ(i, i2, charSequence);
        }
        Paint paint2 = this.LLJILJILJ;
        C21408718qL c21408718qL = this.LLILZIL;
        if (c21408718qL.LIZJ) {
            i6 = this.LLILLJJLI.LIZLLL;
        } else if (c21408718qL.LIZ % 2 == 1) {
            i6 = this.LLILLJJLI.LIZJ;
        } else {
            this.LLILLJJLI.getClass();
            i6 = 0;
        }
        paint2.setColor(i6);
        this.LLJILJILJ.setStyle(Paint.Style.FILL);
        C21408418qI c21408418qI = this.LLILLJJLI;
        Paint paint3 = this.LLJILJILJ;
        int strokeWidth = c21408418qI.LIZIZ;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint3.getStrokeWidth() + 0.5f);
        }
        int i9 = strokeWidth / 2;
        C817403Hg c817403Hg = new C817403Hg();
        C21408418qI c21408418qI2 = this.LLILLJJLI;
        c817403Hg.element = Math.max(c21408418qI2.LJIILIIL, c21408418qI2.LJIIJJI);
        C817403Hg c817403Hg2 = new C817403Hg();
        C21408418qI c21408418qI3 = this.LLILLJJLI;
        c817403Hg2.element = Math.max(c21408418qI3.LJIIL, c21408418qI3.LJIIJJI);
        InterfaceC1860300yVg interfaceC1860300yVg = this.LLILLJJLI.LJIILL;
        if (interfaceC1860300yVg != null) {
            drawableLIZ = interfaceC1860300yVg.LIZ(i, i2, charSequence);
        } else {
            drawableLIZ = null;
        }
        if (this.LLJILJILJ.getColor() != 0 || this.LLILLJJLI.LIZ != 0 || drawableLIZ != null) {
            iSave = canvas.save();
            try {
                this.LLJILLL.setStroke(strokeWidth, this.LLILLJJLI.LIZ);
                if (this.LLILLJJLI.LJIJJLI == 1) {
                    iLJI = LJFF();
                } else {
                    iLJI = LJI();
                }
                int i10 = this.LLILZIL.LIZ;
                if (i10 == 0) {
                    i7 = 0;
                } else {
                    i7 = -i9;
                }
                if (i10 == C1697810uHb.LJIIJ(this.LLILZ)) {
                    i8 = i5 - i3;
                } else {
                    i8 = (i5 - i3) + i9;
                }
                this.LLJILLL.setBounds(0, i7, iLJI, i8);
                if (this.LLILZIL.LIZ == 0) {
                    C21408418qI c21408418qI4 = this.LLILLJJLI;
                    fMax = Math.max(c21408418qI4.LJIILIIL, c21408418qI4.LJIIJJI);
                } else {
                    fMax = 0.0f;
                }
                c817403Hg.element = fMax;
                if (this.LLILZIL.LIZ == C1697810uHb.LJIIJ(this.LLILZ)) {
                    C21408418qI c21408418qI5 = this.LLILLJJLI;
                    fMax2 = Math.max(c21408418qI5.LJIIL, c21408418qI5.LJIIJJI);
                } else {
                    fMax2 = 0.0f;
                }
                c817403Hg2.element = fMax2;
                float f3 = c817403Hg.element;
                if (f3 == 0.0f && fMax2 == 0.0f) {
                    this.LLJILLL.setCornerRadius(0.0f);
                } else {
                    this.LLJILLL.setCornerRadii(new float[]{f3, f3, f3, f3, fMax2, fMax2, fMax2, fMax2});
                }
                this.LLJILLL.setColor(this.LLJILJILJ.getColor());
                if (this.LLILLJJLI.LJIJJLI == 1) {
                    f2 = this.LLILZLL.LIZIZ;
                } else {
                    f2 = 0.0f;
                }
                canvas.translate(f2 + f, i3);
                if (this.LLILLJJLI.LJIL == 1) {
                    if (this.LLILZIL.LIZ != C1697810uHb.LJIIJ(this.LLILZ)) {
                        float f4 = i8;
                        float f5 = strokeWidth / 2.0f;
                        this.LLJI.set(0, (int) (f4 - f5), iLJI, (int) (f4 + f5));
                        canvas.drawRect(this.LLJI, this.LLJIJIL);
                    }
                } else {
                    this.LLJILLL.draw(canvas);
                }
                if (drawableLIZ != null) {
                    drawableLIZ.setBounds(this.LLJILLL.getBounds());
                    drawableLIZ.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
            }
        }
        this.LLJILJILJ.set(paint);
        C21408418qI c21408418qI6 = this.LLILLJJLI;
        Paint paint4 = this.LLJILJILJ;
        int iLIZ = c21408418qI6.LIZ;
        if (iLIZ == 0) {
            iLIZ = AbstractC445040Hck.LIZ(paint4.getColor(), 75);
        }
        paint4.setColor(iLIZ);
        paint4.setStyle(Paint.Style.FILL);
        int i11 = i5 - i3;
        int i12 = 0;
        int width = 0;
        for (Layout layout : this.LLIZLLLIL) {
            int i13 = i12 + 1;
            if (i12 >= 0) {
                Layout layout2 = layout;
                iSave = canvas.save();
                int i14 = (int) f;
                try {
                    canvas.clipRect(i14, i3, LJI() + i14, i5);
                    canvas.translate(width + f + this.LLILZLL.LIZIZ, i3);
                    width += layout2.getWidth() + LIZLLL();
                    if (this.LLIZ && strokeWidth > 0 && i12 != 0) {
                        this.LLJILJIL.set(-i9, 0, i9, i11);
                        canvas.drawRect(this.LLJILJIL, this.LLJILJILJ);
                    }
                    C21408418qI c21408418qI7 = this.LLILLJJLI;
                    int i15 = c21408418qI7.LJII;
                    if (i15 < 0) {
                        i15 = c21408418qI7.LJJI;
                    }
                    canvas.translate(i15, LJ() + strokeWidth);
                    layout2.draw(canvas);
                    canvas.restoreToCount(iSave);
                    i12 = i13;
                } finally {
                }
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (this.LLILZLL.LIZJ > 0.0f) {
            C21408418qI c21408418qI8 = this.LLILLJJLI;
            if (c21408418qI8.LJIIIZ != 0 && (c21408418qI8.LJIIL != 0.0f || c21408418qI8.LJIIJJI != 0.0f)) {
                int iSave2 = canvas.save();
                canvas.translate(f, i3);
                if (Math.abs(this.LLILZLL.LIZIZ) > 0.0f) {
                    LIZIZ(this, c817403Hg, c817403Hg2, canvas, true);
                }
                if (Math.abs(this.LLILZLL.LIZIZ) < this.LLILZLL.LIZJ) {
                    LIZIZ(this, c817403Hg, c817403Hg2, canvas, false);
                }
                canvas.restoreToCount(iSave2);
            }
        }
        if (this.LLILZIL.LIZ == C1697810uHb.LJIIJ(this.LLILZ)) {
            iSave = canvas.save();
            try {
                C21408918qN c21408918qN = this.LLILZLL;
                float f6 = (-c21408918qN.LIZIZ) / c21408918qN.LIZJ;
                int i16 = this.LLILLJJLI.LJ - this.LLJJIJI;
                C21408618qK c21408618qK = this.LLILLL;
                canvas.translate(f6 * (i16 - c21408618qK.LIZ), (i5 - c21408618qK.LIZIZ) - 0.0f);
                if (this.LLJJIII.getBounds().left == 0) {
                    this.LLJJIII.getBounds().left += this.LLJJIJI;
                    this.LLJJIII.getBounds().right += this.LLJJIJI;
                }
                this.LLJJIII.draw(canvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
    }
}
