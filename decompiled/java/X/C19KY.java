package X;

import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.19KY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KY {
    public static C19KZ LIZ(String str) {
        String string;
        String lowerCase;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && (lowerCase = string.toLowerCase(Locale.US)) != null) {
            return C19KZ.VALID_TAB_IDS.get(lowerCase);
        }
        return null;
    }
}
