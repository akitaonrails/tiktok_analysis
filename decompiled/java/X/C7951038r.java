package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.038r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7951038r {
    public static final void LIZ(int i, int i2, SpannableStringBuilder spannableStringBuilder, TextView textView, final C7944038k c7944038k) {
        int currentTextColor;
        String str;
        Typeface typefaceLIZIZ;
        final C013C c013c = new C013C();
        c013c.element = true;
        final RunnableC514801zW runnableC514801zW = new RunnableC514801zW(c013c, 138);
        Integer num = c7944038k.LIZJ;
        if (num != null) {
            C444920HcY c444920HcY = new C444920HcY(num.intValue(), false);
            Integer num2 = c7944038k.LIZLLL;
            if (num2 != null && (typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, num2.intValue(), 0.0f, 0.0f, null, 0.0f, 0, null, 253)) != null) {
                c444920HcY.LL = typefaceLIZIZ;
            }
            C786410Ut5.q2(spannableStringBuilder, c444920HcY, i, i2, 33);
        }
        Integer num3 = c7944038k.LJIIJ;
        if (num3 != null) {
            currentTextColor = num3.intValue();
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(currentTextColor), i, i2, 33);
        Integer num4 = c7944038k.LJIIJJI;
        if (num4 != null) {
            C786410Ut5.q2(spannableStringBuilder, new BackgroundColorSpan(num4.intValue()), i, i2, 33);
        }
        if (c7944038k.LJ) {
            C786410Ut5.q2(spannableStringBuilder, new UnderlineSpan(), i, i2, 33);
        }
        if (c7944038k.LJFF) {
            C786410Ut5.q2(spannableStringBuilder, new StrikethroughSpan(), i, i2, 33);
        }
        if (c7944038k.LJI) {
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(2), i, i2, 33);
        }
        final InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq = c7944038k.LJIIL;
        if (interfaceC1631620sYq != null && (!c7944038k.LJIIIIZZ || ((str = c7944038k.LIZIZ) != null && str.length() != 0))) {
            MovementMethod linkMovementMethod = c7944038k.LJIIIZ;
            if (linkMovementMethod == null) {
                linkMovementMethod = LinkMovementMethod.getInstance();
            }
            textView.setMovementMethod(linkMovementMethod);
            final int i3 = currentTextColor;
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.038q
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    long j;
                    if (Intrinsics.LJFF(c7944038k.LJII, Boolean.TRUE)) {
                        j = 700;
                    } else {
                        j = 0;
                    }
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        c013c2.element = false;
                        HandlerHook.viewPostDelay(view, runnableC514801zW, j);
                        InterfaceC1631620sYq<View, String, ECRichTextExtraInfo, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        C7944038k c7944038k2 = c7944038k;
                        interfaceC1631620sYq2.invoke(view, c7944038k2.LIZIZ, c7944038k2.LJIILIIL);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(i3);
                    if (!c7944038k.LJ) {
                        textPaint.setUnderlineText(false);
                    }
                    if (!c7944038k.LJFF) {
                        textPaint.setStrikeThruText(false);
                    }
                }
            }, i, i2, 33);
        }
        if (c7944038k.LJIIL == null && c7944038k.LIZIZ != null) {
            MovementMethod linkMovementMethod2 = c7944038k.LJIIIZ;
            if (linkMovementMethod2 == null) {
                linkMovementMethod2 = LinkMovementMethod.getInstance();
            }
            textView.setMovementMethod(linkMovementMethod2);
            C786410Ut5.q2(spannableStringBuilder, new C04J4(currentTextColor, textView, c7944038k, 3), i, i2, 33);
        }
    }
}
