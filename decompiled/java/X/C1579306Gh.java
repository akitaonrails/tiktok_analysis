package X;

import android.text.SpannableString;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1579306Gh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(String str) {
        int i;
        int iLJJJ = a0.LJJJ(str, "{s_fireIcon}", 0, false, 6);
        if (iLJJJ >= 0 && (i = iLJJJ + 12) < str.length() && str.charAt(i) == ' ') {
            return a0.LJJJJZI(i, i + 1, str).toString();
        }
        return str;
    }

    public static CharSequence LIZ(String str, EnumC1578706Gb enumC1578706Gb, int i, int i2, C06IE c06ie) {
        int iLJJJ = a0.LJJJ(str, "{s_fireIcon}", 0, false, 6);
        if (iLJJJ < 0) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, C06K1.LIZ(new C06K2(enumC1578706Gb, i2, i, true, c06ie)), iLJJJ, iLJJJ + 12, 33);
        return spannableString;
    }
}
