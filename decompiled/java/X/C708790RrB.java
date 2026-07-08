package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708790RrB {
    public static final C708790RrB LIZ = new C708790RrB();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(505));
    public static volatile String LIZJ;
    public static volatile long LIZLLL;

    public static long LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (Intrinsics.LJFF(curUserId, LIZJ)) {
            return LIZLLL;
        }
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("k_top_story_center_row_two_priority_one_container_whee_story_first_show_");
        sbLIZ.append(curUserId);
        long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        LIZLLL = j;
        LIZJ = curUserId;
        return j;
    }
}
