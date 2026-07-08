package X;

import com.ss.android.ugc.aweme.data.PopupMonitorConfig;

/* JADX INFO: renamed from: X.0mI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390550mI1 {
    public static PopupMonitorConfig LIZ = C1390560mI2.LIZ();
    public static final long LIZIZ = C1514430pVp.LIZ();
    public static final Boolean LIZJ = C1514430pVp.LIZLLL();

    public static boolean LIZ() {
        int i = LIZ.limitDays;
        if (i == -1) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        double dFloor = Math.floor((jCurrentTimeMillis - j) / 8.64E7d);
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Actual days is ");
        sbLIZ.append(dFloor);
        sbLIZ.append(" and current time: ");
        sbLIZ.append(j <= jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        return j <= jCurrentTimeMillis && dFloor < ((double) i);
    }

    public static boolean LIZIZ(int i) {
        if (LIZJ.booleanValue() && i <= LIZ.feedTrackPageVV) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(boolean z) {
        if (!LIZ.isEnabled) {
            C1390650mIB.LIZ.getClass();
            if (z) {
                C1390650mIB.LJ(2);
            }
            return true;
        }
        if (!LIZ()) {
            C1390650mIB.LIZ.getClass();
            if (z) {
                C1390650mIB.LJ(1);
            }
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str, EnumC1390310mHd enumC1390310mHd) {
        int i = C1390320mHe.LIZ[enumC1390310mHd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (!LIZ.ignorePopups.contains(str)) {
                        LIZ.getClass();
                        if (!C2277131EBb.LIZJ.contains(str)) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else if (!LIZ.ignoreRouters.contains(str)) {
                LIZ.getClass();
                if (C2277131EBb.LIZIZ.contains(str)) {
                    return true;
                }
                return false;
            }
        } else if (!LIZ.ignoreActivities.contains(str)) {
            LIZ.getClass();
            if (C2277131EBb.LIZ.contains(str)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
