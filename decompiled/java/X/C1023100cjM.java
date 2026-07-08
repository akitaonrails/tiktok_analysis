package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023100cjM {
    public static final AbstractC1023090cjL LIZ(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        C623440Oco c623440Oco = C623440Oco.LIZIZ;
        if (!Intrinsics.LJFF(lowerCase, "feed")) {
            C1023110cjN c1023110cjN = C1023110cjN.LIZIZ;
            if (!Intrinsics.LJFF(lowerCase, "iab")) {
                C1023120cjO c1023120cjO = C1023120cjO.LIZIZ;
                if (!Intrinsics.LJFF(lowerCase, "search")) {
                    C1022410ciF c1022410ciF = C1022410ciF.LIZIZ;
                    if (!Intrinsics.LJFF(lowerCase, c1022410ciF.LIZ)) {
                        return C1023040cjG.LIZIZ;
                    }
                    return c1022410ciF;
                }
                return c1023120cjO;
            }
            return c1023110cjN;
        }
        return c623440Oco;
    }
}
