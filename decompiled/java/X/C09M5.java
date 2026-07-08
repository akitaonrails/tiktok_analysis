package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09M5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09M5 implements InputFilter {
    public final int LL;
    public final Function0<Unit> LLILLJJLI;

    public C09M5(int i, Function0<Unit> function0) {
        this.LL = i;
        this.LLILLJJLI = function0;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Function0<Unit> function0;
        int length = this.LL - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (charSequence.length() > 0 && (function0 = this.LLILLJJLI) != null) {
                function0.invoke();
            }
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        if (Character.isHighSurrogate(charSequence.charAt(i5 - 1)) && i5 - 1 == i) {
            Function0<Unit> function02 = this.LLILLJJLI;
            if (function02 != null) {
                function02.invoke();
            }
            return "";
        }
        Function0<Unit> function03 = this.LLILLJJLI;
        if (function03 != null) {
            function03.invoke();
        }
        return charSequence.subSequence(i, i5);
    }
}
