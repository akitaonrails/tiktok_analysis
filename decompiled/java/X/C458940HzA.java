package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458940HzA implements InputFilter {
    public final int LL;
    public final View LLILLJJLI;
    public final Function0<Unit> LLILLL;

    public C458940HzA(View view, int i, Function0 function0) {
        this.LL = i;
        this.LLILLJJLI = view;
        this.LLILLL = function0;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        int length = this.LL - (spanned.length() - (i4 - i3));
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (length <= 0) {
                this.LLILLL.invoke();
                return "";
            }
            if (length < i2 - i) {
                int i5 = length + i;
                if (Character.isHighSurrogate(charSequence.charAt(i5 - 1)) && i5 - 1 == i) {
                    this.LLILLL.invoke();
                    return "";
                }
                this.LLILLL.invoke();
                return charSequence.subSequence(i, i5);
            }
        }
        return null;
    }
}
