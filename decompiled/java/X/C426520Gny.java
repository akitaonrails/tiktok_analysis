package X;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426520Gny extends AbstractC426530Gnz implements InterfaceC431250Gvb {
    public final Function0<Unit> LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public int LLILZ;

    public final void LJIIIZ(Spanned spanned) {
        for (Object obj : spanned.getSpans(0, spanned.length(), C419890GdH.class)) {
            int i = this.LLILZ;
            Drawable drawable = ((C419890GdH) obj).LLILZLL;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(Color.argb(this.LLILZ, Color.red(this.LLILLJJLI), Color.green(this.LLILLJJLI), Color.blue(this.LLILLJJLI)));
        if (!this.LLILLL) {
            textPaint.setUnderlineText(true);
        }
    }

    public C426520Gny(int i, boolean z, Function0 function0) {
        this.LL = function0;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = Color.alpha(i);
    }

    @Override // X.InterfaceC431250Gvb
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        this.LLILZ = Color.alpha(this.LLILLJJLI);
        LJIIIZ(spanned);
    }

    @Override // X.InterfaceC431250Gvb
    public final void LJ(TextView textView, Spanned spanned, int i) {
        this.LLILZ = (int) (Color.alpha(this.LLILLJJLI) * C427690Gpr.LIZIZ(textView.getContext()));
        LJIIIZ(spanned);
    }
}
