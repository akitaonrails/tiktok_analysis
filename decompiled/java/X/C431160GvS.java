package X;

import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0GvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431160GvS<T> extends AbstractC431150GvR implements InterfaceC431140GvQ {
    public final int LL;
    public final float LLILLJJLI;
    public final T LLILLL;
    public final Function1<T, Unit> LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC431140GvQ
    public final void LIZIZ() {
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC431140GvQ
    public final void LIZJ() {
        this.LLILZIL = false;
    }

    @Override // X.InterfaceC431140GvQ
    public final void LIZ(TextView textView) {
        this.LLILZIL = false;
        onClick(textView);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Function1<T, Unit> function1;
        if (!C0OBG.LIZIZ(view) && (function1 = this.LLILZ) != null) {
            function1.invoke(this.LLILLL);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f;
        float fAlpha = Color.alpha(this.LL);
        if (this.LLILZIL) {
            f = this.LLILLJJLI;
        } else {
            f = 1.0f;
        }
        textPaint.setColor(Color.argb((int) (fAlpha * f), Color.red(this.LL), Color.green(this.LL), Color.blue(this.LL)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C431160GvS(int i, float f, Object obj, AwS589S0100000_10 awS589S0100000_10) {
        this.LL = i;
        this.LLILLJJLI = f;
        this.LLILLL = obj;
        this.LLILZ = awS589S0100000_10;
    }
}
