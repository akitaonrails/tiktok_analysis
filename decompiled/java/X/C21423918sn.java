package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21423918sn implements Appendable, CharSequence {
    public final Deque<C21426318tB> LLILLJJLI = new ArrayDeque(8);
    public final StringBuilder LL = new StringBuilder((CharSequence) "");

    public final C21426418tC LJIIIIZZ() {
        C21426418tC c21426418tC = new C21426418tC(this.LL);
        for (C21426318tB c21426318tB : (ArrayDeque) this.LLILLJJLI) {
            try {
                c21426418tC.setSpan(c21426318tB.LIZ, c21426318tB.LIZIZ, c21426318tB.LIZJ, c21426318tB.LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return c21426418tC;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LL.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LL.toString();
    }

    public C21423918sn() {
        LIZLLL(0, "");
    }

    public final void LIZ(char c) {
        this.LL.append(c);
    }

    public final void LIZIZ(CharSequence charSequence) {
        LIZLLL(length(), charSequence);
        this.LL.append(charSequence);
    }

    public final void LIZJ(String str) {
        this.LL.append(str);
    }

    public final C21426418tC LJFF(int i) {
        C21426318tB c21426318tB;
        int i2;
        int length = length();
        C21426418tC c21426418tC = new C21426418tC(this.LL.subSequence(i, length));
        Iterator it2 = ((ArrayDeque) this.LLILLJJLI).iterator();
        while (it2.hasNext() && (c21426318tB = (C21426318tB) it2.next()) != null) {
            int i3 = c21426318tB.LIZIZ;
            if (i3 >= i && (i2 = c21426318tB.LIZJ) <= length) {
                try {
                    c21426418tC.setSpan(c21426318tB.LIZ, i3 - i, i2 - i, 33);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                it2.remove();
            }
        }
        this.LL.replace(i, length, "");
        return c21426418tC;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.LL.append(c);
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LL.charAt(i);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        LIZIZ(charSequence);
        return this;
    }

    public final void LIZLLL(int i, CharSequence charSequence) {
        int length;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof C21426418tC;
            int i2 = 0;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null && (length = spans.length) > 0) {
                if (!z) {
                    do {
                        Object obj = spans[i2];
                        ((ArrayDeque) this.LLILLJJLI).push(new C21426318tB(spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj), obj));
                        i2++;
                    } while (i2 < length);
                    return;
                }
                while (true) {
                    length--;
                    if (length >= 0) {
                        Object obj2 = spans[length];
                        ((ArrayDeque) this.LLILLJJLI).push(new C21426318tB(spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2), obj2));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final List<C21426318tB> LJ(int i, int i2) {
        int i3;
        int length = length();
        if (i2 > i && i >= 0 && i2 <= length) {
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(this.LLILLJJLI);
                Collections.reverse(arrayList);
                return Collections.unmodifiableList(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(0);
            Iterator itDescendingIterator = ((ArrayDeque) this.LLILLJJLI).descendingIterator();
            while (itDescendingIterator.hasNext()) {
                C21426318tB c21426318tB = (C21426318tB) itDescendingIterator.next();
                int i4 = c21426318tB.LIZIZ;
                if ((i4 >= i && i4 < i2) || (((i3 = c21426318tB.LIZJ) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                    arrayList2.add(c21426318tB);
                }
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.emptyList();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C21426318tB> listLJ = LJ(i, i2);
        if (listLJ.isEmpty()) {
            return this.LL.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LL.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C21426318tB c21426318tB : listLJ) {
            int iMax = Math.max(0, c21426318tB.LIZIZ - i);
            C786410Ut5.q2(spannableStringBuilder, c21426318tB.LIZ, iMax, Math.min(length, (c21426318tB.LIZJ - c21426318tB.LIZIZ) + iMax), c21426318tB.LIZLLL);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        LIZLLL(length(), charSequenceSubSequence);
        this.LL.append(charSequenceSubSequence);
        return this;
    }

    public static void LJI(C21423918sn c21423918sn, Object obj, int i, int i2) {
        if (obj != null) {
            int length = c21423918sn.length();
            if (i2 > i && i >= 0 && i2 <= length) {
                LJII(c21423918sn, obj, i, i2);
            }
        }
    }

    public static void LJII(C21423918sn c21423918sn, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    LJII(c21423918sn, obj2, i, i2);
                }
                return;
            }
            ((ArrayDeque) c21423918sn.LLILLJJLI).push(new C21426318tB(i, i2, 33, obj));
        }
    }
}
