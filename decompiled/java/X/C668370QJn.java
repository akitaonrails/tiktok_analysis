package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668370QJn {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LJI(int i) {
        if (i == EnumC644330PPb.POI.getValue()) {
            return Integer.valueOf(R.raw.icon_map_thumbtack);
        }
        if (i == EnumC644330PPb.ECOM.getValue()) {
            return Integer.valueOf(R.raw.icon_bag_bold);
        }
        if (i == EnumC644330PPb.USER.getValue()) {
            return Integer.valueOf(R.raw.icon_person_bold);
        }
        if (i == EnumC644330PPb.LIVE.getValue()) {
            return Integer.valueOf(R.raw.icon_vertical_bars);
        }
        return null;
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, Drawable drawable, Context context) {
        if (context != null && drawable != null) {
            spannableStringBuilder.append(" ");
            C419890GdH c419890GdH = new C419890GdH(drawable, 2);
            c419890GdH.LIZIZ(0, 0, C426750GoL.LIZLLL(context));
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
    }

    public static void LIZIZ(SpannableStringBuilder spannableStringBuilder, Integer num, Context context) {
        if (context != null && num != null) {
            spannableStringBuilder.append(" ");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = num.intValue();
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1r);
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, context), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
    }

    public static void LIZJ(Context context, SpannableStringBuilder spannableStringBuilder, String str) {
        if (context != null && C123100dR.LIZ(str)) {
            spannableStringBuilder.append((CharSequence) str);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            }
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
        }
    }

    public static Layout LIZLLL(Context context, C1360500lVY c1360500lVY, int i) {
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJ = i;
        c444830HcP.LIZLLL = true;
        c444830HcP.LJIILIIL(c1360500lVY);
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJIIIZ(1);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJI = alignment;
        c444840HcQ.LJII = TextUtils.TruncateAt.END;
        c444830HcP.LJIILJJIL(C475630Ikz.LIZIZ(R.attr.a1h, context));
        c444830HcP.LJII(C301210BrL.LIZ());
        return c444830HcP.LIZIZ();
    }

    public static C1360500lVY LJ(CharSequence charSequence, String str, boolean z) {
        C1360520lVa c1360520lVa = new C1360520lVa();
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append((char) 8230);
            c1360520lVa.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1360520lVa.LIZLLL(str);
        }
        c1360520lVa.LIZ.append(charSequence);
        return c1360520lVa.LIZ;
    }

    public static C1360500lVY LJFF(CharSequence charSequence, String str, boolean z) {
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append(charSequence);
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append((char) 8230);
            c1360520lVa.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1360520lVa.LIZLLL(str);
        }
        return c1360520lVa.LIZ;
    }
}
