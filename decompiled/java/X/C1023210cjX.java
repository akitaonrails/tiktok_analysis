package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023210cjX {
    public static final AbstractC1023220cjY LIZ(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        C1023270cjd c1023270cjd = C1023270cjd.LIZ;
        if (!Intrinsics.LJFF(lowerCase, "aweme")) {
            C1023280cje c1023280cje = C1023280cje.LIZ;
            if (!Intrinsics.LJFF(lowerCase, "adinfo")) {
                C1023260cjc c1023260cjc = C1023260cjc.LIZ;
                if (!Intrinsics.LJFF(lowerCase, "anole")) {
                    return C1023290cjf.LIZ;
                }
                return c1023260cjc;
            }
            return c1023280cje;
        }
        return c1023270cjd;
    }
}
