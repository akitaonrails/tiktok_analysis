package X;

import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07MI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1438));
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"RefactorTTReviewCell", "RefactorTabelogReviewCell", "RefactorTripAdvisorReviewCell"});

    public static boolean LIZ(Class cls) {
        if (((Number) LIZ.getValue()).intValue() < 1 || !LIZIZ.contains(cls.getSimpleName())) {
            return false;
        }
        return true;
    }
}
