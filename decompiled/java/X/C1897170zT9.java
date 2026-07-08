package X;

import com.bytedance.touchpoint.api.model.Bubble;

/* JADX INFO: renamed from: X.0zT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897170zT9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bubble bubble) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_type_bubble_");
        sbLIZ.append(bubble.bubbleId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_life_times_bubble_");
        sbLIZ2.append(bubble.bubbleId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("_show_interval_type_bubble_");
        sbLIZ3.append(bubble.bubbleId);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        C1899810zXP c1899810zXP = C710890RuZ.LIZ;
        c1899810zXP.LJ(strLIZIZ);
        c1899810zXP.LIZ.storeInt(strLIZIZ2, c1899810zXP.LIZ.getInt(strLIZIZ2, 0) + 1);
        c1899810zXP.LIZ.storeLong(strLIZIZ3, System.currentTimeMillis());
    }

    public static boolean LIZIZ(Bubble bubble) {
        int iIntValue;
        Integer num = bubble.showTimes;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i = bubble.totalTimes;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_type_bubble_");
        sbLIZ.append(bubble.bubbleId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1899810zXP c1899810zXP = C710890RuZ.LIZ;
        if (c1899810zXP.LIZLLL(strLIZIZ) + 1 > iIntValue) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_life_times_bubble_");
        sbLIZ2.append(bubble.bubbleId);
        if (c1899810zXP.LIZ.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0) >= i) {
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("_show_interval_type_bubble_");
        sbLIZ3.append(bubble.bubbleId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        int i2 = bubble.showInterval;
        if (System.currentTimeMillis() - c1899810zXP.LIZ.getLong(strLIZIZ2, 0L) <= i2 * 86400000) {
            return false;
        }
        return true;
    }
}
