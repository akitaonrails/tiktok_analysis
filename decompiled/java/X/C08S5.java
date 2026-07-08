package X;

import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08S5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08S5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            if (a0.LJJIIZI(lowerCase, "application/json", false) || a0.LJJIIZI(lowerCase, "text/plain", false)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
