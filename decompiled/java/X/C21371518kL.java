package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: X.18kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21371518kL implements Spannable {
    public boolean LL;
    public Spannable LLILLJJLI;

    public final void LIZ() {
        Spannable spannable = this.LLILLJJLI;
        if (!this.LL) {
            if ((Build.VERSION.SDK_INT < 28 ? new C21371718kN() : new C21371718kN() { // from class: X.18kM
                @Override // X.C21371718kN
                public final boolean LIZ(CharSequence charSequence) {
                    if (!(charSequence instanceof PrecomputedText) && !(charSequence instanceof C21371318kJ)) {
                        return false;
                    }
                    return true;
                }
            }).LIZ(spannable)) {
                this.LLILLJJLI = new SpannableString(spannable);
            }
        }
        this.LL = true;
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.LLILLJJLI.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.LLILLJJLI.codePoints();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LLILLJJLI.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LLILLJJLI.toString();
    }

    public C21371518kL(CharSequence charSequence) {
        this.LLILLJJLI = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LLILLJJLI.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.LLILLJJLI.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.LLILLJJLI.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.LLILLJJLI.getSpanStart(obj);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        LIZ();
        this.LLILLJJLI.removeSpan(obj);
    }

    public C21371518kL(Spannable spannable) {
        this.LLILLJJLI = spannable;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.LLILLJJLI.subSequence(i, i2);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.LLILLJJLI.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.LLILLJJLI.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        LIZ();
        C786410Ut5.o2(this.LLILLJJLI, obj, i, i2, i3);
    }
}
