package X;

import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00z1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256900z1 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2) {
        String lowerCase;
        if (str != null && str.length() != 0 && (lowerCase = str.toLowerCase(Locale.getDefault())) != null && a0.LJJIIZI(lowerCase, str2, false)) {
            return true;
        }
        return false;
    }
}
