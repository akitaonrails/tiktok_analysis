package X;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: renamed from: X.09en, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2424709en {
    public final Context LIZ;

    public C2424709en(Context context) {
        this.LIZ = context;
    }

    public static String LIZ(Locale locale) {
        String strConcat;
        String strT2 = C786410Ut5.t2(locale);
        if (C2204961BRm.g0(locale, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSvAg==", new String[]{"016a9"})).isEmpty()) {
            strConcat = "";
        } else {
            strConcat = "_".concat(String.valueOf(C2204961BRm.g0(locale, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSvAg==", new String[]{"016a9"}))));
        }
        return String.valueOf(strT2).concat(strConcat);
    }
}
