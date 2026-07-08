package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0uwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723230uwb {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static SpannableString LIZ(Context context, CharSequence charSequence, int i, Integer num, Integer num2, Integer num3) {
        Integer numValueOf;
        if (charSequence.length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (num2 != null) {
            C786410Ut5.p2(spannableString, new C444920HcY(num2.intValue(), false), 0, spannableString.length(), 33);
        }
        if (num3 != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(num3.intValue()), 0, spannableString.length(), 33);
        }
        Matcher matcher = PatternProtector.compile("\\{tux_icon:(.+?)\\}").matcher(charSequence);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tux://icon?token=");
            sbLIZ.append(strGroup);
            sbLIZ.append("&from=ug_incentive_bubble");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null && (numValueOf = Integer.valueOf(abstractC1896090zRP.LJIJJLI(context, strLIZIZ))) != null && numValueOf.intValue() != 0) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = numValueOf.intValue();
                c419910GdJ.LIZIZ = i;
                c419910GdJ.LIZJ = i;
                c419910GdJ.LIZLLL = num;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
                tuxIconDrawableLIZ.setBounds(0, 0, i, i);
                C786410Ut5.p2(spannableString, c419890GdH, matcher.start(), matcher.end(), 33);
            }
        }
        return spannableString;
    }
}
