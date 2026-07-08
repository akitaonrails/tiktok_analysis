package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0rO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586540rO8 {
    public static final String LIZ(EnumC1586970rOp enumC1586970rOp) {
        String strName;
        String lowerCase;
        if (enumC1586970rOp == null || (strName = enumC1586970rOp.name()) == null || (lowerCase = strName.toLowerCase(Locale.ROOT)) == null) {
            return "unknown";
        }
        return lowerCase;
    }
}
