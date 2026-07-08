package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654250PlP {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableString LIZ(Context context, C654120PlC c654120PlC) {
        String string;
        String strLIZIZ;
        int i;
        int length;
        int length2;
        Float f = c654120PlC.LIZ;
        String strLIZIZ2 = null;
        if (f != null) {
            string = f.toString();
        } else {
            string = null;
        }
        Long l = c654120PlC.LIZIZ;
        if (l != null) {
            long jLongValue = l.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(C1843500y4a.LIZIZ(jLongValue));
            sbLIZ.append(')');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C426750GoL.LIZLLL(context)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMDb");
            sbLIZ2.append(" · ");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append("￼");
            sbLIZ2.append(" 10/");
            sbLIZ2.append(string);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(string);
            sbLIZ3.append("/10");
            sbLIZ3.append("￼");
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(" · ");
            sbLIZ3.append("IMDb");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        SpannableString spannableString = new SpannableString(strLIZIZ);
        StyleSpan styleSpan = new StyleSpan(1);
        if (C426750GoL.LIZLLL(context)) {
            int length3 = strLIZIZ.length();
            if (string != null) {
                length2 = string.length();
            } else {
                length2 = 0;
            }
            i = length3 - length2;
        } else {
            i = 0;
        }
        if (C426750GoL.LIZLLL(context)) {
            length = strLIZIZ.length();
        } else if (string != null) {
            length = string.length();
        } else {
            length = 0;
        }
        C786410Ut5.p2(spannableString, styleSpan, i, length, 33);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_star_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ny);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        int iLJJJ = a0.LJJJ(spannableString, "￼", 0, false, 6);
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), false);
        C786410Ut5.p2(spannableString, c419890GdHLIZIZ, iLJJJ, iLJJJ + 1, 33);
        return spannableString;
    }
}
