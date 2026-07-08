package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344850DfX {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.CharSequence r9, java.lang.String r10, java.lang.Integer r11, float r12) {
        /*
            X.0D4I r8 = X.C2273431Dyf.LIZLLL(r10)
            int r0 = r8.LIZLLL
            if (r0 != 0) goto L9
            return
        L9:
            java.util.Locale r0 = r8.LJ     // Catch: java.lang.Exception -> L2c
            java.text.NumberFormat r1 = java.text.NumberFormat.getInstance(r0)     // Catch: java.lang.Exception -> L2c
            boolean r0 = r1 instanceof java.text.DecimalFormat     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L30
            java.text.DecimalFormat r1 = (java.text.DecimalFormat) r1     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L30
            java.text.DecimalFormatSymbols r0 = r1.getDecimalFormatSymbols()     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L30
            char r0 = r0.getDecimalSeparator()     // Catch: java.lang.Exception -> L2c
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L2c
            if (r7 == 0) goto L30
            goto L32
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L30:
            java.lang.String r7 = "."
        L32:
            r6 = 0
            r3 = 0
        L34:
            r5 = r9
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            int r0 = r5.length()
            if (r3 >= r0) goto L7d
            r0 = 4
            int r4 = kotlin.text.a0.LJJJ(r9, r7, r3, r6, r0)
            r0 = -1
            if (r4 == r0) goto L7d
            int r2 = r4 + 1
            r3 = r2
        L48:
            int r0 = r5.length()
            if (r3 >= r0) goto L61
            char r0 = r5.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L61
            int r1 = r3 - r4
            int r0 = r8.LIZLLL
            if (r1 > r0) goto L61
            int r3 = r3 + 1
            goto L48
        L61:
            if (r3 <= r2) goto L34
            r2 = 17
            if (r11 == 0) goto L74
            X.0HcY r1 = new X.0HcY
            int r0 = r11.intValue()
            r1.<init>(r0, r6)
            X.C786410Ut5.q2(r5, r1, r4, r3, r2)
            goto L34
        L74:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r12)
            X.C786410Ut5.q2(r5, r0, r4, r3, r2)
            goto L34
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344850DfX.LIZ(java.lang.CharSequence, java.lang.String, java.lang.Integer, float):void");
    }

    public static void LIZIZ(TuxTextView tuxTextView, double d, double d2, String str, Context context, Integer num, Integer num2, Integer num3) {
        String str2;
        C0D4I c0d4iLIZLLL = C2273431Dyf.LIZLLL(str);
        if (c0d4iLIZLLL.LIZJ) {
            str2 = " ";
        } else {
            str2 = "";
        }
        String strLIZJ = C2273431Dyf.LIZJ(d, str);
        String strLIZJ2 = C2273431Dyf.LIZJ(d2, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(" - ");
        sbLIZ.append(strLIZJ2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C041W c041w = new C041W();
        c041w.LIZJ(c0d4iLIZLLL.LIZIZ, strLIZIZ, c0d4iLIZLLL.LIZ, str2);
        c041w.LJII = R.attr.a1h;
        if (num != null && num2 != null) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            c041w.LJ = iIntValue;
            c041w.LJFF = iIntValue2;
        } else {
            c041w.LIZLLL(1);
        }
        CharSequence charSequenceLIZIZ = c041w.LIZIZ(context);
        LIZ(charSequenceLIZIZ, str, num3, 0.7f);
        tuxTextView.setText(charSequenceLIZIZ);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }

    public static void LJ(TuxTextView tuxTextView, String str, String str2, Context context, int i, Integer num, Integer num2, Integer num3, float f, int i2) {
        float f2 = f;
        Integer num4 = num2;
        Integer num5 = num;
        int i3 = i;
        if ((i2 & 16) != 0) {
            i3 = 3;
        }
        Integer num6 = null;
        if ((i2 & 32) != 0) {
            num5 = null;
        }
        if ((i2 & 64) != 0) {
            num4 = null;
        }
        if ((i2 & 128) == 0) {
            num6 = num3;
        }
        if ((i2 & 256) != 0) {
            f2 = 0.7f;
        }
        LIZJ(tuxTextView, str, str2, context, i3, R.attr.a1k, true, num5, num4, num6, f2);
    }

    public static void LIZJ(TuxTextView tuxTextView, String str, String str2, Context context, int i, int i2, boolean z, Integer num, Integer num2, Integer num3, float f) {
        C0D4I c0d4iLIZLLL = C2273431Dyf.LIZLLL(str2);
        String str3 = c0d4iLIZLLL.LIZ;
        boolean z2 = c0d4iLIZLLL.LIZJ;
        if (u.LJJIIJZLJL(str, str3, false)) {
            str = a0.LJJJJZ(str3, str);
        }
        String str4 = " ";
        if (z2 && u.LJJIIJZLJL(str, " ", false)) {
            str = a0.LJJJJZ(" ", str);
        }
        if (u.LJIIZILJ(str, str3, false)) {
            str = a0.LJJJLL(str3, str);
        }
        if (z2 && u.LJIIZILJ(str, " ", false)) {
            str = a0.LJJJLL(" ", str);
        }
        String string = a0.LJLIIIL(str).toString();
        if (!c0d4iLIZLLL.LIZJ) {
            str4 = "";
        }
        C041W c041w = new C041W();
        c041w.LIZJ(c0d4iLIZLLL.LIZIZ, string, c0d4iLIZLLL.LIZ, str4);
        c041w.LJII = i2;
        c041w.LJIIIIZZ = z;
        if (num != null && num2 != null) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            c041w.LJ = iIntValue;
            c041w.LJFF = iIntValue2;
        } else {
            c041w.LIZLLL(i);
        }
        CharSequence charSequenceLIZIZ = c041w.LIZIZ(context);
        LIZ(charSequenceLIZIZ, str2, num3, f);
        tuxTextView.setText(charSequenceLIZIZ);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }
}
