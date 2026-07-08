package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416520GUw extends ClickableSpan implements LineBackgroundSpan, InterfaceC431020GvE, InterfaceC1859880yV0 {
    public final TextView LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final boolean LLILZIL;
    public C0GV2 LLIZLLLIL;
    public C0GV3 LLJ;
    public final boolean LLILZ = true;
    public int LLILZLL = -1;
    public int LLIZ = -1;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(408));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 984));
    public final C416510GUv LLJILJIL = new C416510GUv();
    public final Path LLJILJILJ = new Path();

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // X.InterfaceC1859880yV0
    public final void LIZ(C0GV2 c0gv2) {
        this.LLIZLLLIL = c0gv2;
    }

    @Override // X.InterfaceC1859880yV0
    public final void LIZIZ(C0GV3 c0gv3) {
        this.LLJ = c0gv3;
    }

    @Override // android.text.style.ClickableSpan, X.InterfaceC431020GvE
    public final void onClick(View view) {
        C0GV2 c0gv2 = this.LLIZLLLIL;
        if (c0gv2 != null) {
            c0gv2.LIZ(view, this, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLILZ);
        }
    }

    public C416520GUw(TextView textView, String str, Integer num, boolean z) {
        this.LL = textView;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZIL = z;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        Layout layout;
        Spanned spanned;
        int i9 = i7;
        int i10 = i6;
        TextView textView = this.LL;
        if (textView != null && (layout = textView.getLayout()) != null) {
            CharSequence text = this.LL.getText();
            RectF rectF = null;
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                int spanStart = spanned.getSpanStart(this);
                int spanEnd = spanned.getSpanEnd(this);
                if (spanStart >= 0 && spanEnd >= 0) {
                    this.LLILZLL = spanStart;
                    this.LLIZ = spanEnd;
                    if (spanEnd <= i9) {
                        i9 = spanEnd;
                    }
                    if (spanStart >= i10) {
                        i10 = spanStart;
                    }
                    if (i10 >= i9) {
                        return;
                    }
                    this.LLJILJIL.reset();
                    C416510GUv c416510GUv = this.LLJILJIL;
                    float f = i4;
                    float fAscent = paint.ascent() + f;
                    float fDescent = f + paint.descent();
                    c416510GUv.LIZIZ = fAscent;
                    c416510GUv.LIZJ = fDescent;
                    layout.getSelectionPath(i10, i9, this.LLJILJIL);
                    if (this.LLILZ) {
                        Iterator<RectF> it2 = this.LLJILJIL.LIZ.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            RectF next = it2.next();
                            RectF rectF2 = next;
                            if (rectF2.width() > 0.0f && C814420VxA.LIZIZ(rectF2.top) >= i3 && C814420VxA.LIZIZ(rectF2.bottom) <= i5) {
                                rectF = next;
                                break;
                            }
                        }
                        RectF rectF3 = rectF;
                        if (rectF3 != null) {
                            this.LLJILJILJ.reset();
                            this.LLJILJILJ.moveTo(rectF3.left + C418440Gaw.LIZIZ(Float.valueOf(0.75f)) + C418440Gaw.LIZIZ(1), rectF3.bottom);
                            this.LLJILJILJ.lineTo(rectF3.right, rectF3.bottom);
                            canvas.drawPath(this.LLJILJILJ, (Paint) this.LLJIJIL.getValue());
                        }
                    }
                    C0GV3 c0gv3 = this.LLJ;
                    if (c0gv3 != null) {
                        c0gv3.LIZ(this, this.LLILLJJLI, spanStart, spanEnd, this.LLILZ);
                    }
                }
            }
        }
    }
}
