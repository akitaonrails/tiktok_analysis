package X;

import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HD1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HD1 extends AbstractC426530Gnz implements InterfaceC21415718rT {
    public int LL;
    public final float LLILLJJLI;
    public final Object LLILLL;
    public Function1<Object, Unit> LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC21415718rT
    public final void LIZIZ() {
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC21415718rT
    public final void LIZLLL() {
        this.LLILZIL = false;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Function1<Object, Unit> function1;
        if (!C0OBG.LIZIZ(view) && (function1 = this.LLILZ) != null) {
            function1.invoke(this.LLILLL);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f;
        int i = this.LL;
        if (i == 0) {
            i = textPaint.linkColor;
        }
        float fAlpha = Color.alpha(i);
        if (this.LLILZIL) {
            f = this.LLILLJJLI;
        } else {
            f = 1.0f;
        }
        textPaint.setColor(Color.argb((int) (fAlpha * f), Color.red(i), Color.green(i), Color.blue(i)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0HD1(int i, Object obj, int i2) {
        float f;
        if ((i2 & 2) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this(f, i, (i2 & 4) != 0 ? null : obj);
    }

    public C0HD1(float f, int i, Object obj) {
        this.LL = i;
        this.LLILLJJLI = f;
        this.LLILLL = obj;
    }
}
