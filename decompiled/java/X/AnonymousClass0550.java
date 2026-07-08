package X;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.0550, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0550 {
    public static final String LIZ(int i, String str) {
        String str2;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            str2 = "\u061c";
        } else {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append(i);
        sbLIZ.append(str);
        sbLIZ.append('%');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
