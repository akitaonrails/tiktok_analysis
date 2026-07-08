package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0R2X, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2X {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 101, 102, 103, 104, 105, 107, 1021, 200, 201, 202, 203, 301, 1001, 1022, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1012);
    public static final Set<Integer> LIZIZ = C13LQ.LJLIIL(new Integer[]{51, 53});

    public static boolean LIZ(Integer num) {
        return C13LP.LJJJJ(num, LIZIZ);
    }

    public static String LIZIZ(Integer num) {
        if (LIZ(num)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static boolean LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1015 || num.intValue() == 1016 || num.intValue() == 1017) {
                return true;
            }
            return false;
        }
        return false;
    }
}
