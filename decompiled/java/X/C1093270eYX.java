package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS15S1300000_17;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093270eYX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(187));

    public static void LIZ(C473440IhS c473440IhS) {
        ((ExecutorService) LIZ.getValue()).submit(new ARunnableS117S0100000_17(c473440IhS, 204));
    }

    public static void LIZIZ(AbstractC1093440eYo abstractC1093440eYo, List list, String str, Long l) {
        ((ExecutorService) LIZ.getValue()).submit(new ARunnableS15S1300000_17(str, abstractC1093440eYo, list, l, 1));
    }
}
