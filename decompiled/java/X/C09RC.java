package X;

import android.text.SpannableStringBuilder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09RC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09RC {
    public static final void LIZ(Appendable appendable, CharSequence... charSequenceArr) {
        for (CharSequence charSequence : charSequenceArr) {
            ((SpannableStringBuilder) appendable).append(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void LIZIZ(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        if (function1 != null) {
            ((StringBuilder) appendable).append(function1.invoke(t));
            return;
        }
        if (t != 0 && !(t instanceof CharSequence)) {
            if (t instanceof Character) {
                ((StringBuilder) appendable).append(((Character) t).charValue());
                return;
            } else {
                ((StringBuilder) appendable).append((CharSequence) t.toString());
                return;
            }
        }
        ((StringBuilder) appendable).append((CharSequence) t);
    }
}
