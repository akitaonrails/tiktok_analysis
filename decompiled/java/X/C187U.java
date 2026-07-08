package X;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.187U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187U {
    public final List<C187W> LIZ = new ArrayList();

    public final CharSequence LIZJ() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (C187W c187w : (ArrayList) this.LIZ) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c187w.LIZ);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(c187w.LIZIZ, false), length, spannableStringBuilder.length(), 17);
            Integer num = c187w.LJ;
            if (num != null) {
                C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(num.intValue()), length, spannableStringBuilder.length(), 17);
            }
            Integer num2 = c187w.LIZLLL;
            if (num2 != null) {
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(num2.intValue()), length, spannableStringBuilder.length(), 17);
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(c187w.LIZJ), length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final void LIZ(C187W c187w) {
        ((ArrayList) this.LIZ).add(c187w);
    }

    public final void LIZIZ(C187W c187w) {
        ListProtector.add(this.LIZ, 0, c187w);
    }

    public static C187W LIZLLL(String str, int i, int i2, int i3, int i4, Integer num) {
        if (str.length() == 0) {
            return null;
        }
        return new C187W(str, i, i2, num);
    }
}
