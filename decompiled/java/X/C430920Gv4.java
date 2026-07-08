package X;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430920Gv4 extends ClickableSpan implements InterfaceC430960Gv8 {
    public final Integer LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final /* synthetic */ C430890Gv1 LLIZ;

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        return 0.0f;
    }

    public C430920Gv4(C430890Gv1 c430890Gv1) {
        int iAlpha;
        this.LLIZ = c430890Gv1;
        Integer seeMoreColor = c430890Gv1.getSeeMoreColor();
        seeMoreColor = seeMoreColor == null ? C1308910kAL.LIZJ(R.attr.a1j, c430890Gv1.getContext()) : seeMoreColor;
        this.LL = seeMoreColor;
        if (seeMoreColor != null) {
            iAlpha = Color.alpha(seeMoreColor.intValue());
        } else {
            iAlpha = 255;
        }
        this.LLILLJJLI = iAlpha;
        this.LLILLL = iAlpha;
        this.LLILZ = 62;
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 540));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 541));
    }

    @Override // android.text.style.ClickableSpan, X.InterfaceC430960Gv8
    public final void onClick(View view) {
        InterfaceC430960Gv8 interfaceC430960Gv8;
        if (!C0OBG.LIZ(200L, view) && (interfaceC430960Gv8 = this.LLIZ.LLJJLIIIJLLLLLLLZ) != null) {
            interfaceC430960Gv8.onClick(view);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Integer num = this.LL;
        if (num != null) {
            int iIntValue = num.intValue();
            textPaint.setColor(Color.argb(this.LLILLL, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
        textPaint.setTypeface((Typeface) this.LLILZLL.getValue());
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        InterfaceC430960Gv8 interfaceC430960Gv8 = this.LLIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC430960Gv8 != null) {
            interfaceC430960Gv8.LIZJ(textView, spanned, i);
        }
        if (!this.LLIZ.LLJLLL) {
            return;
        }
        this.LLILLL = this.LLILLJJLI;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
        InterfaceC430960Gv8 interfaceC430960Gv8 = this.LLIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC430960Gv8 != null) {
            interfaceC430960Gv8.LJ(textView, spanned, i);
        }
        if (!this.LLIZ.LLJLLL) {
            return;
        }
        this.LLILLL = ((Number) this.LLILZIL.getValue()).intValue();
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
        InterfaceC430960Gv8 interfaceC430960Gv8 = this.LLIZ.LLJJLIIIJLLLLLLLZ;
        if (interfaceC430960Gv8 != null) {
            interfaceC430960Gv8.LIZJ(textView, spanned, i);
        }
        if (!this.LLIZ.LLJLLL) {
            return;
        }
        this.LLILLL = this.LLILLJJLI;
    }
}
