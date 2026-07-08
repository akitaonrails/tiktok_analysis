package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622160Oak {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(673));

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bb_db_rebuild_count::");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(String str) {
        LIZIZ().storeInt(LIZ(str), LIZIZ().getInt(LIZ(str), 0) + 1);
        if (LIZIZ().getLong(LIZLLL(str), 0L) == 0) {
            LIZIZ().storeLong(LIZLLL(str), System.currentTimeMillis());
        }
    }

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bb_db_rebuild_window_start::");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
