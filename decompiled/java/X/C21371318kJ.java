package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21371318kJ implements Spannable {
    public static final /* synthetic */ int LLILZ = 0;
    public final Spannable LL;
    public final C21370918kF LLILLJJLI;
    public final PrecomputedText LLILLL;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LL.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LL.toString();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LL.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.LL.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.LL.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.LL.getSpanStart(obj);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.LLILLL.removeSpan(obj);
                return;
            } else {
                this.LL.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public C21371318kJ(PrecomputedText precomputedText, C21370918kF c21370918kF) {
        C21371418kK.LIZ(precomputedText);
        this.LL = precomputedText;
        this.LLILLJJLI = c21370918kF;
        this.LLILLL = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.LL.subSequence(i, i2);
    }

    public C21371318kJ(CharSequence charSequence, C21370918kF c21370918kF) {
        this.LL = new SpannableString(charSequence);
        this.LLILLJJLI = c21370918kF;
        this.LLILLL = null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.LLILLL.getSpans(i, i2, cls);
        }
        return (T[]) this.LL.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.LL.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    this.LLILLL.setSpan(obj, i, i2, i3);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            C786410Ut5.o2(this.LL, obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }
}
