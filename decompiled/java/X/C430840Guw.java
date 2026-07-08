package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Guw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430840Guw {
    public static final C430840Guw LIZ = new C430840Guw();

    public static GradientDrawable LIZJ(Context context) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{iIntValue, iIntValue, 0});
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
        return gradientDrawable;
    }

    public static CharSequence LIZ(Context context, Long l, String str) {
        long jLongValue;
        String strLJJIFFI;
        Spannable spannableStringBuilder;
        int length;
        int iIntValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue <= 1514736000) {
            strLJJIFFI = "";
        } else {
            strLJJIFFI = u.LJJIFFI(C2215101Bmm.LJIIIZ(TimeUnit.SECONDS.toMillis(jLongValue)), " ", " ", false);
        }
        if (strLJJIFFI.length() == 0) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(strLJJIFFI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str.length() == 0) {
            spannableStringBuilder = new SpannableString(strLJJIFFI);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        }
        if (str.length() == 0) {
            length = 0;
        } else {
            length = str.length();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.o2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), length, spannableStringBuilder.length(), 33);
        C786410Ut5.o2(spannableStringBuilder, new C444920HcY(71, false), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void LIZLLL(TuxTextView tuxTextView, C1360500lVY c1360500lVY, Context context) {
        tuxTextView.setEllipsize(null);
        tuxTextView.setText(c1360500lVY);
        C786410Ut5.y3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC462840IDa(context, tuxTextView, 1));
    }

    public static StaticLayout LIZIZ(int i, int i2, TuxTextView tuxTextView, CharSequence charSequence) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), tuxTextView.getPaint(), i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(tuxTextView.getIncludeFontPadding()).setLineSpacing(tuxTextView.getLineSpacingExtra(), tuxTextView.getLineSpacingMultiplier()).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i2);
        if (tuxTextView.getTextDirection() == 4) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        return maxLines.setTextDirection(textDirectionHeuristic).build();
    }
}
