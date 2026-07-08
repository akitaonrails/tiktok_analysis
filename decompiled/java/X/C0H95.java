package X;

import android.text.Layout;
import android.text.TextUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0H95, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H95 {
    public static final boolean LIZ(String str) {
        char cCharAt;
        if (str.length() != 0 && 1424 <= (cCharAt = str.charAt(0)) && cCharAt < 1792) {
            return true;
        }
        return false;
    }

    public static final Pair LIZIZ(int i, int i2, CharSequence charSequence) {
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJ = i;
        c444830HcP.LJIILIIL(charSequence);
        c444830HcP.LJII(101);
        c444830HcP.LJIIIZ(i2);
        if (i2 != Integer.MAX_VALUE) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
            c444840HcQ.LJII = truncateAt;
            c444840HcQ.LJIIIIZZ = i;
        }
        Layout layoutLIZIZ = c444830HcP.LIZIZ();
        int lineCount = layoutLIZIZ.getLineCount();
        int iMax = 0;
        for (int i3 = 0; i3 < lineCount; i3++) {
            iMax = Math.max(iMax, (int) Math.ceil(layoutLIZIZ.getLineRight(i3) - layoutLIZIZ.getLineLeft(i3)));
        }
        return new Pair(Integer.valueOf(iMax), Integer.valueOf(layoutLIZIZ.getHeight()));
    }
}
