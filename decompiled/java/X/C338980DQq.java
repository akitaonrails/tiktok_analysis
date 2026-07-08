package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0DQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338980DQq {
    public static final C338980DQq LIZ = new C338980DQq();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2439));

    public static boolean LIZIZ() {
        return ((Number) LIZIZ.getValue()).intValue() == 1;
    }

    public static Spannable LIZ(String str, Context context, C1072030e0H c1072030e0H) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(C20642515q3.LJI(2131829463));
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.p2(spannableString, new C1077130e8V(c1072030e0H, context, 1), str.length(), str.length() + C20642515q3.LJI(2131829463).length() + 1, 33);
        return spannableString;
    }
}
