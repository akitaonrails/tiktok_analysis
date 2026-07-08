package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.zhiliaoapp.musically.R;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0Xim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856460Xim {
    public final C19EG LIZ;

    public final int LIZ() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this.LIZ);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -7829368;
    }

    public C856460Xim(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    public final SpannableString LIZIZ(int i) {
        SpannableString spannableString;
        String quantityString;
        if (1 <= i && i < 3) {
            Resources resources = this.LIZ.getResources();
            if (resources != null) {
                int i2 = 3 - i;
                quantityString = resources.getQuantityString(2131755179, i2, String.valueOf(i2));
            } else {
                quantityString = null;
            }
            spannableString = new SpannableString(quantityString);
        } else {
            spannableString = new SpannableString(this.LIZ.getString(2131829792));
        }
        if (C1697810uHb.LJIIJJI(2, 6).contains(Integer.valueOf(C855980Xi0.LIZLLL()))) {
            return LIZJ(spannableString);
        }
        return spannableString;
    }

    public final SpannableString LIZJ(SpannableString spannableString) {
        int iRgb;
        Matcher matcher = PatternProtector.compile("\\d+\\s+").matcher(spannableString);
        SpannableString spannableString2 = new SpannableString(spannableString);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, this.LIZ);
            if (numLIZJ != null) {
                iRgb = numLIZJ.intValue();
            } else {
                iRgb = Color.rgb(254, 124, 2);
            }
            C786410Ut5.p2(spannableString2, new ForegroundColorSpan(iRgb), iStart, iEnd, 33);
        }
        return spannableString2;
    }
}
