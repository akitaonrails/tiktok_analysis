package X;

import Y.ARunnableS2S0400100_7;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMockCurTime;

/* JADX INFO: renamed from: X.0IQW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQW {
    public final C465560INm LIZ;

    public static long LIZIZ() {
        long curTime = LiveMockCurTime.INSTANCE.getCurTime();
        return curTime <= 0 ? System.currentTimeMillis() : curTime;
    }

    public C0IQW(C465560INm c465560INm) {
        this.LIZ = c465560INm;
    }

    public static String LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_state");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_last_show_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_last_slide_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_type");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Runnable LJFF(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, C1305440k4k c1305440k4k, long j) {
        long jLIZIZ = LIZIZ();
        int iLJFF = c1305440k4k.LJFF(LIZ(j), 0);
        if (iLJFF != 0) {
            if (iLJFF == 1) {
                long jLJI = c1305440k4k.LJI(LIZLLL(j), 0L);
                if (jLJI > 0 && jLIZIZ - jLJI <= 1209600000) {
                    c1305440k4k.LJIIIIZZ(2, LIZ(j));
                    return null;
                }
                long jLJI2 = c1305440k4k.LJI(LIZJ(j), 0L);
                if (jLJI2 > 0 && jLIZIZ - jLJI2 < 86400000) {
                    return null;
                }
                return new ARunnableS2S0400100_7(this, livePlayFragment, livePlayFragment2, c1305440k4k, j, 1);
            }
            return null;
        }
        long jLJI3 = c1305440k4k.LJI(LIZLLL(j), 0L);
        if (jLJI3 > 0 && jLIZIZ - jLJI3 <= 1209600000) {
            return null;
        }
        return new ARunnableS2S0400100_7(this, livePlayFragment, livePlayFragment2, c1305440k4k, j, 0);
    }
}
