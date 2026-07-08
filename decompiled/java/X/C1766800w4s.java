package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0w4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766800w4s extends TuxTextView {
    public String LLJJJJ;
    public String LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public Spanned LLJJLIIIJLLLLLLLZ;

    public final void LJJJJJ() {
        Spanned spanned = this.LLJJLIIIJLLLLLLLZ;
        if (spanned instanceof SpannableStringBuilder) {
            C089E c089e = new C089E(spanned.getSpans(0, spanned.length(), ImageSpan.class));
            while (c089e.hasNext()) {
                ImageSpan imageSpan = (ImageSpan) c089e.next();
                int spanStart = this.LLJJLIIIJLLLLLLLZ.getSpanStart(imageSpan);
                int spanEnd = this.LLJJLIIIJLLLLLLLZ.getSpanEnd(imageSpan);
                final Drawable drawable = imageSpan.getDrawable();
                C786410Ut5.q2((SpannableStringBuilder) this.LLJJLIIIJLLLLLLLZ, new ImageSpan(drawable) { // from class: X.0GVe
                    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                        canvas.save();
                        canvas.translate(f, ((i5 - i3) / 2) - (getDrawable().getBounds().height() / 2));
                        getDrawable().draw(canvas);
                        canvas.restore();
                    }
                }, spanStart, spanEnd, 34);
                ((SpannableStringBuilder) this.LLJJLIIIJLLLLLLLZ).removeSpan(imageSpan);
            }
        }
        setText(this.LLJJLIIIJLLLLLLLZ);
    }

    public C1766800w4s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
        this.LLJJLIIIJLLLLLLLZ = new SpannableStringBuilder();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(java.lang.CharSequence r11, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo> r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1766800w4s.LJJJJL(java.lang.CharSequence, java.util.List):void");
    }
}
