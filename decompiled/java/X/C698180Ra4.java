package X;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ra4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698180Ra4 {
    public static final int LIZ = (int) C339190DRl.LIZ(4);
    public static final String LIZIZ = "…";
    public static final int LIZJ = 50;

    public static final Spannable LIZ(TuxTextView tuxTextView, Pair<Integer, Integer> pair, C698160Ra2 c698160Ra2, int i) {
        C419890GdH c419890GdHLIZIZ;
        int i2;
        int i3;
        String strSubstring = c698160Ra2.LIZ.substring(0, Math.min(pair.getSecond().intValue(), c698160Ra2.LIZ.length()));
        float f = i;
        int length = strSubstring.length() - ((int) Math.ceil(f / tuxTextView.getPaint().measureText(String.valueOf(strSubstring.charAt(0)))));
        while (true) {
            if (-1 >= length) {
                break;
            }
            if (tuxTextView.getPaint().measureText(strSubstring.substring(length, strSubstring.length())) >= f) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring.substring(0, length));
                sbLIZ.append(LIZIZ);
                strSubstring = C2188811AlT.LIZIZ(sbLIZ);
                break;
            }
            length--;
        }
        C738680SyI c738680SyI = new C738680SyI(c698160Ra2, 1);
        C698190Ra5 c698190Ra5LIZJ = c698160Ra2.LIZJ(tuxTextView.getContext());
        if (c698190Ra5LIZJ != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = c698190Ra5LIZJ.LIZ;
            Integer numLIZJ = c698190Ra5LIZJ.LIZIZ;
            if (numLIZJ == null) {
                numLIZJ = C1308910kAL.LIZJ(C697960RZi.LIZJ, tuxTextView.getContext());
            }
            c419910GdJ.LIZLLL = numLIZJ;
            C698170Ra3 c698170Ra3 = c698160Ra2.LJFF;
            if (c698170Ra3 != null) {
                i2 = c698170Ra3.LIZJ;
            } else {
                i2 = C697960RZi.LIZIZ;
            }
            c419910GdJ.LIZJ = i2;
            if (c698170Ra3 != null) {
                i3 = c698170Ra3.LIZIZ;
            } else {
                i3 = C697960RZi.LIZ;
            }
            c419910GdJ.LIZIZ = i3;
            c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, tuxTextView.getContext());
        } else {
            c419890GdHLIZIZ = null;
        }
        if (c419890GdHLIZIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strSubstring);
            sbLIZ2.append(' ');
            strSubstring = C2188811AlT.LIZIZ(sbLIZ2);
        }
        SpannableString spannableString = new SpannableString(strSubstring);
        if (c419890GdHLIZIZ != null) {
            try {
                C786410Ut5.p2(spannableString, c419890GdHLIZIZ, strSubstring.length() - 1, strSubstring.length(), 33);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("FcpAnnotationContainer createLastSpan error");
                return spannableString;
            }
        }
        C786410Ut5.p2(spannableString, c738680SyI, 0, strSubstring.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.Spannable LIZIZ(com.bytedance.tux.input.TuxTextView r13, boolean r14, boolean r15, X.C698160Ra2 r16) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C698180Ra4.LIZIZ(com.bytedance.tux.input.TuxTextView, boolean, boolean, X.0Ra2):android.text.Spannable");
    }
}
