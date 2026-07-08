package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0mRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396530mRf extends AbstractC1396720mRy<C1384300m7w> implements Drawable.Callback {
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final boolean LLJJIJIL = C293660BfA.LIZ();
    public final AbstractC1396720mRy<?> LLJILLL;
    public int LLJJI;
    public C1396550mRh LLJJIJI;
    public final C1396490mRb LLJJ = new AbstractC1396720mRy<C1052760dVC>() { // from class: X.0mRb
        public final Paint LLJILLL;
        public float LLJJ;

        @Override // X.AbstractC1396720mRy
        public final int LJFF() {
            return 1001;
        }

        {
            Paint paint = new Paint(5);
            paint.setFlags(5);
            this.LLJILLL = paint;
        }

        @Override // X.AbstractC1396720mRy
        public final void LJJII() {
            super.LJJII();
            this.LLJILLL.reset();
        }

        @Override // X.AbstractC1396720mRy
        public final void LJIL(C1384750m8f c1384750m8f) {
            CharSequence charSequence;
            float f;
            int iIntValue;
            Integer num;
            int length;
            float f2;
            float f3;
            CharSequence charSequence2;
            C1052760dVC c1052760dVC = (C1052760dVC) this.LL;
            CharSequence charSequence3 = null;
            if (c1052760dVC != null) {
                charSequence = c1052760dVC.LJIIJJI;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.LLJILLL.setTextSize(c1384750m8f.LJ.LIZ);
                this.LLJILLL.setTypeface(c1384750m8f.LJ.LIZJ);
                Paint paint = this.LLJILLL;
                C1052760dVC c1052760dVC2 = (C1052760dVC) this.LL;
                if (c1052760dVC2 != null) {
                    charSequence3 = c1052760dVC2.LJIIJJI;
                }
                if (c1052760dVC2 != null && (charSequence2 = c1052760dVC2.LJIIJJI) != null) {
                    length = charSequence2.length();
                } else {
                    length = 0;
                }
                this.LLILZIL = paint.measureText(charSequence3, 0, length);
                boolean z = c1384750m8f.LJ.LJFF;
                Paint paint2 = this.LLJILLL;
                if (z) {
                    f2 = paint2.getFontMetrics().bottom;
                    f3 = paint2.getFontMetrics().top;
                } else {
                    f2 = paint2.getFontMetrics().bottom;
                    f3 = paint2.getFontMetrics().ascent;
                }
                this.LLILZLL = f2 - f3;
            } else {
                this.LLILZIL = 0.0f;
                this.LLILZLL = 0.0f;
            }
            boolean z2 = c1384750m8f.LJ.LJFF;
            Paint.FontMetrics fontMetrics = this.LLJILLL.getFontMetrics();
            if (z2) {
                f = fontMetrics.top;
            } else {
                f = fontMetrics.ascent;
            }
            this.LLJJ = f;
            if (this.LLILZIL > 0.0f) {
                this.LLJILLL.setStyle(Paint.Style.FILL);
                Paint paint3 = this.LLJILLL;
                C1052760dVC c1052760dVC3 = (C1052760dVC) this.LL;
                if (c1052760dVC3 != null && (num = c1052760dVC3.LJIIL) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = c1384750m8f.LJ.LIZIZ;
                }
                paint3.setColor(iIntValue);
                this.LLJILLL.setStrokeWidth(0.0f);
            }
        }

        @Override // X.AbstractC1396720mRy
        public final void LJJIFFI(C1384750m8f c1384750m8f) {
            int iIntValue;
            Integer num;
            Paint paint = this.LLJILLL;
            C1052760dVC c1052760dVC = (C1052760dVC) this.LL;
            if (c1052760dVC != null && (num = c1052760dVC.LJIIL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1384750m8f.LJ.LIZIZ;
            }
            paint.setColor(iIntValue);
        }

        @Override // X.AbstractC1396720mRy
        public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
            int iIntValue;
            Paint paint = this.LLJILLL;
            Integer num = ((C1052760dVC) abstractC1384320m7y).LJIIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1384750m8f.LJ.LIZIZ;
            }
            paint.setColor(iIntValue);
        }

        @Override // X.AbstractC1396720mRy
        public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
            C1052760dVC c1052760dVC;
            CharSequence charSequence;
            Paint paint = this.LLJILLL;
            if (this.LLILZIL != 0.0f && this.LLILZLL != 0.0f && (c1052760dVC = (C1052760dVC) this.LL) != null && (charSequence = c1052760dVC.LJIIJJI) != null) {
                canvas.drawText(charSequence, 0, charSequence.length(), this.LLILLJJLI, this.LLILLL - this.LLJJ, paint);
            }
        }
    };
    public final boolean LLJJIII = C444960Hcc.LIZIZ();

    @Override // X.AbstractC1396720mRy
    public final int LJFF() {
        return 20004;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJII() {
        if (LLJJIJIL) {
            super.LJJII();
            LJJII();
            C1396550mRh c1396550mRh = this.LLJJIJI;
            if (c1396550mRh != null) {
                c1396550mRh.LIZIZ(0);
                C1085660eMG<C1396550mRh> c1085660eMG = C1396600mRm.LIZ;
                C1085660eMG<C1396550mRh> c1085660eMG2 = C1396600mRm.LIZ;
                c1396550mRh.setCallback(null);
                c1085660eMG2.LIZ(c1396550mRh);
                this.LLJJIJI = null;
            }
        }
    }

    public final boolean LJJIZ() {
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        if (c1384300m7w != null) {
            if (c1384300m7w.LJIILJJIL) {
                if (c1384300m7w.LJIIL > 0) {
                    return true;
                }
            } else if (c1384300m7w.LJJI) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJJJ() {
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        return c1384300m7w != null && c1384300m7w.LJIILJJIL && c1384300m7w.LJIIL > 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mRb] */
    public C1396530mRf(AbstractC1396720mRy<?> abstractC1396720mRy) {
        this.LLJILLL = abstractC1396720mRy;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIL(C1384750m8f c1384750m8f) {
        if (!LLJJIJIL) {
            return;
        }
        if (LJJJ()) {
            LJIL(c1384750m8f);
        }
        float fLJI = this.LLJILLL.LJI();
        this.LLILZLL = fLJI;
        this.LLILZIL = this.LLJJ.LLILZIL + fLJI + LLJJIJIIJIL;
        this.LLJJI = (int) (fLJI * 0.14f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJI(C1384750m8f c1384750m8f) {
        C1384300m7w c1384300m7w;
        if ((LLJJIJIL || LJJIZ()) && (c1384300m7w = (C1384300m7w) this.LL) != null) {
            C1396550mRh c1396550mRhLIZIZ = C1396600mRm.LIZ.LIZIZ();
            if (c1396550mRhLIZIZ == null) {
                c1396550mRhLIZIZ = new C1396550mRh();
            }
            this.LLJJIJI = c1396550mRhLIZIZ;
            c1396550mRhLIZIZ.setAlpha(c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue());
            C1396550mRh c1396550mRh = this.LLJJIJI;
            if (c1396550mRh != null) {
                c1396550mRh.setCallback(this);
            }
            C1396550mRh c1396550mRh2 = this.LLJJIJI;
            if (c1396550mRh2 != null) {
                int i = (int) (this.LLILZLL - (this.LLJJI * 2));
                c1396550mRh2.setBounds(0, 0, i, i);
            }
            c1384300m7w.LJJIIJZLJL = new AwS387S0200000_21(this, c1384300m7w, 66);
            if (c1384300m7w.LJJI) {
                C1396550mRh c1396550mRh3 = this.LLJJIJI;
                if (c1396550mRh3 != null) {
                    c1396550mRh3.LIZIZ(1);
                    return;
                }
                return;
            }
            C1396550mRh c1396550mRh4 = this.LLJJIJI;
            if (c1396550mRh4 == null) {
                return;
            }
            c1396550mRh4.LIZIZ(2);
        }
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJIFFI(C1384750m8f c1384750m8f) {
        C1396550mRh c1396550mRh = this.LLJJIJI;
        if (c1396550mRh != null) {
            c1396550mRh.setAlpha(c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue());
        }
        C1052760dVC c1052760dVC = (C1052760dVC) this.LLJJ.LL;
        if (c1052760dVC != null) {
            c1052760dVC.LJIIL = Integer.valueOf(C1396380mRQ.LIZ(-1056964609, c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue()));
        }
        LJJIFFI(c1384750m8f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1052760dVC c1052760dVC;
        String strLIZIZ;
        boolean z;
        Function0<Unit> function0;
        if (!LLJJIJIL) {
            return;
        }
        C1052760dVC c1052760dVC2 = (C1052760dVC) this.LLJJ.LL;
        if (c1052760dVC2 != null) {
            c1052760dVC2.LJIIL = -1056964609;
        }
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        if (c1384300m7w != null && (function0 = c1384300m7w.LJJIIJ) != null) {
            function0.invoke();
        }
        C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
        if (c1384300m7w2 != null) {
            C1396550mRh c1396550mRh = this.LLJJIJI;
            if (c1396550mRh != null && c1396550mRh.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            c1384300m7w2.LJJIII = z;
        }
        C1396550mRh c1396550mRh2 = this.LLJJIJI;
        if ((c1396550mRh2 != null && c1396550mRh2.LIZ()) || (c1052760dVC = (C1052760dVC) this.LLJJ.LL) == null) {
            return;
        }
        C1384300m7w c1384300m7w3 = (C1384300m7w) this.LL;
        if (c1384300m7w3 != null) {
            strLIZIZ = C1843500y4a.LIZIZ(c1384300m7w3.LJIIL);
        } else {
            strLIZIZ = null;
        }
        c1052760dVC.LJIIJJI = strLIZIZ;
    }

    @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
    public final int LIZ(float f, float f2) {
        if (LLJJIJIL && LJJIZ()) {
            float f3 = this.LLILLJJLI;
            if (f > f3 && f < f3 + this.LLILZIL) {
                float f4 = this.LLILLL;
                if (f2 > f4 && f2 < f4 + this.LLILZLL) {
                    C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
                    if (c1384300m7w == null || !c1384300m7w.LJJI) {
                        return 1;
                    }
                    return 2;
                }
            }
        }
        return 0;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
        C1384300m7w c1384300m7w = (C1384300m7w) abstractC1384320m7y;
        if (LLJJIJIL) {
            C1396490mRb c1396490mRb = this.LLJJ;
            C1052760dVC c1052760dVC = new C1052760dVC();
            c1052760dVC.LJIIL = Integer.valueOf(C1396380mRQ.LIZ(-1056964609, c1384750m8f.LIZLLL.LIZLLL.invoke(c1384300m7w).intValue()));
            c1052760dVC.LJIILIIL = null;
            c1052760dVC.LJIIJJI = C1843500y4a.LIZIZ(c1384300m7w.LJIIL);
            c1396490mRb.LIZJ(c1052760dVC, c1384750m8f);
        }
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
        if (!LLJJIJIL) {
            return;
        }
        if (this.LLJJIII) {
            if (LJJJ()) {
                C1052760dVC c1052760dVC = (C1052760dVC) this.LLJJ.LL;
                if (c1052760dVC != null) {
                    c1052760dVC.LJIILIIL = -16777216;
                }
                LIZLLL(canvas, c1384750m8f);
            }
            canvas.save();
            float f = this.LLILLJJLI + this.LLJJ.LLILZIL;
            float f2 = this.LLJJI;
            canvas.translate(f + f2, this.LLILLL + f2 + 0.75f);
            LJJIL(canvas, c1384750m8f);
            canvas.restore();
            return;
        }
        canvas.save();
        float f3 = this.LLILLJJLI;
        float f4 = this.LLJJI;
        canvas.translate(f3 + f4, this.LLILLL + f4 + 0.75f);
        LJJIL(canvas, c1384750m8f);
        canvas.restore();
        if (!LJJJ()) {
            return;
        }
        C1052760dVC c1052760dVC2 = (C1052760dVC) this.LLJJ.LL;
        if (c1052760dVC2 != null) {
            c1052760dVC2.LJIILIIL = -16777216;
        }
        LIZLLL(canvas, c1384750m8f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJLI(float f, float f2) {
        if (!LLJJIJIL) {
            return;
        }
        if (this.LLJJIII) {
            LJIILLIIL(f, f2);
        } else {
            C1396490mRb c1396490mRb = this.LLJJ;
            c1396490mRb.LJIILLIIL((f + this.LLILZIL) - c1396490mRb.LLILZIL, f2);
        }
    }

    public final void LJJIL(Canvas canvas, C1384750m8f c1384750m8f) {
        C1396550mRh c1396550mRh;
        AbstractC1384320m7y abstractC1384320m7y = this.LL;
        C1384300m7w c1384300m7w = (C1384300m7w) abstractC1384320m7y;
        if (c1384300m7w != null && c1384300m7w.LJJIII && (c1396550mRh = this.LLJJIJI) != null) {
            c1396550mRh.setAlpha(c1384750m8f.LIZLLL.LIZLLL.invoke(abstractC1384320m7y).intValue());
        }
        C1396550mRh c1396550mRh2 = this.LLJJIJI;
        if (c1396550mRh2 != null) {
            c1396550mRh2.draw(canvas);
        }
    }
}
