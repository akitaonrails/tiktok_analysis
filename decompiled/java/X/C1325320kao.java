package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325320kao extends ReplacementSpan implements InterfaceC21337118en {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final float LLILZ;
    public final String LLILZIL;
    public final C21328118dL LLILZLL;
    public final InterfaceC1321110kU1 LLIZ;
    public final Map<String, Object> LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public WeakReference<View> LLJIJIL = new WeakReference<>(null);
    public Drawable LLJILJIL;
    public final C1320770kTT<C1331070kk5> LLJILJILJ;

    public final int LIZLLL() {
        int i = this.LLILLL;
        if (i >= 0) {
            return i;
        }
        int i2 = this.LLILLJJLI;
        if (i2 > 0) {
            float f = this.LLILZ;
            if (f > 0.0f) {
                return Math.round(i2 / f);
            }
        }
        return this.LLJI;
    }

    @Override // X.InterfaceC21337118en
    public final void LJ() {
        C1320770kTT<C1331070kk5> c1320770kTT = this.LLJILJILJ;
        if (c1320770kTT.LLILLJJLI) {
            return;
        }
        c1320770kTT.LJFF();
    }

    @Override // X.InterfaceC21337118en
    public final void LJFF() {
        this.LLJILJILJ.LJI();
    }

    public final int LJI() {
        int i = this.LLILLJJLI;
        if (i >= 0) {
            return i;
        }
        int i2 = this.LLILLL;
        if (i2 > 0) {
            float f = this.LLILZ;
            if (f > 0.0f) {
                return Math.round(i2 * f);
            }
        }
        return this.LLJ;
    }

    @Override // X.InterfaceC21337118en
    public final Drawable LIZ() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC21337118en
    public final void LIZJ(View view) {
        C1325330kap c1325330kap = new C1325330kap(view, this);
        this.LLJIJIL = new WeakReference<>(view);
        if (this.LLJILJIL == null) {
            InterfaceC1321110kU1 interfaceC1321110kU1 = this.LLIZ;
            if (interfaceC1321110kU1 != null) {
                interfaceC1321110kU1.LIZ(this.LLILZIL, view.getContext(), C0N7L.INLINE_IMAGE, new Pair(Integer.valueOf(LJI()), Integer.valueOf(LIZLLL())), this.LLILZLL, this.LLIZLLLIL, c1325330kap);
            } else {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LLILZIL);
                c1331670kl3LJIIIZ.LJJIJL(view.getContext());
                if (LJI() > 0 && LIZLLL() > 0) {
                    int iLJI = LJI();
                    int iLIZLLL = LIZLLL();
                    c1331670kl3LJIIIZ.LJIIIIZZ = iLJI;
                    c1331670kl3LJIIIZ.LJIIIZ = iLIZLLL;
                }
                c1331670kl3LJIIIZ.LJJII(new C1339370kxT(c1325330kap, 4));
            }
            Drawable drawableLIZLLL = this.LLJILJILJ.LIZLLL();
            if (drawableLIZLLL != null) {
                this.LLJILJIL = drawableLIZLLL;
                if (LJI() > 0 && LIZLLL() > 0) {
                    drawableLIZLLL.setBounds(0, 0, LJI(), LIZLLL());
                }
            }
        }
        Drawable drawable = this.LLJILJIL;
        if (drawable != null) {
            drawable.setCallback(view);
        }
        Drawable drawable2 = this.LLJILJIL;
        if (drawable2 != null) {
            drawable2.setCallback(view);
        }
    }

    @Override // X.InterfaceC21337118en
    public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, Drawable.Callback callback) {
        C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(105), C2097608Jq.LJ());
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int iLIZLLL = fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - LIZLLL()) / 2);
            int iLIZLLL2 = LIZLLL() + iLIZLLL;
            if (iLIZLLL < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = iLIZLLL;
            }
            if (iLIZLLL < fontMetricsInt.top) {
                fontMetricsInt.top = iLIZLLL;
            }
            if (iLIZLLL2 > fontMetricsInt.descent) {
                fontMetricsInt.descent = iLIZLLL2;
            }
            if (iLIZLLL2 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = iLIZLLL2;
            }
        }
        return LJI();
    }

    public C1325320kao(Resources resources, String str, int i, int i2, float f, String str2, C21328118dL c21328118dL, InterfaceC1321110kU1 interfaceC1321110kU1, Map<String, ? extends Object> map) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = f;
        this.LLILZIL = str2;
        this.LLILZLL = c21328118dL;
        this.LLIZ = interfaceC1321110kU1;
        this.LLIZLLLIL = map;
        C1320770kTT<C1331070kk5> c1320770kTT = new C1320770kTT<>(new C1331090kk7(resources).LIZ());
        DH dh = c1320770kTT.LLILZ;
        dh.getClass();
        ((C1331070kk5) dh).LJIIZILJ(InterfaceC1320380kSq.LIZ);
        this.LLJILJILJ = c1320770kTT;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable;
        if (!Intrinsics.LJFF(this.LL, "hidden") && (drawable = this.LLJILJIL) != null) {
            canvas.save();
            canvas.translate(f, Math.round(i3 + (((i5 - i3) - LIZLLL()) / 2.0f)));
            drawable.draw(canvas);
            canvas.restore();
        }
    }
}
