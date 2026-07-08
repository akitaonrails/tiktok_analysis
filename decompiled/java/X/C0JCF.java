package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JCF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JCF {
    public static final void LIZJ(SpannableStringBuilder spannableStringBuilder, Object obj) {
        C786410Ut5.q2(spannableStringBuilder, obj, 0, spannableStringBuilder.length(), 33);
    }

    public static final void LIZ(final Function0 function0, final Function0 function02, Drawable drawable, Integer num, SpannableStringBuilder spannableStringBuilder, List list) {
        if (function0 != null || function02 != null) {
            LIZJ(spannableStringBuilder, new AbstractC1098790ehR() { // from class: X.0JCE
                @Override // X.AbstractC431510Gw1
                public final void LIZ() {
                    Function0<Unit> function03 = function02;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }

                @Override // X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    Function0<Unit> function03 = function0;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            });
        }
        if (drawable != null) {
            LIZJ(spannableStringBuilder, new C416770GVv(drawable));
        }
        if (num != null) {
            LIZJ(spannableStringBuilder, new ForegroundColorSpan(num.intValue()));
        }
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    LIZJ(spannableStringBuilder, obj);
                }
            }
        }
    }
}
