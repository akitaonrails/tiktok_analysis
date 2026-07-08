package X;

import com.bytedance.android.livesdk.game.data.GameOnDeviceMomentData;
import com.bytedance.android.livesdk.model.message.GameMomentMessage;

/* JADX INFO: renamed from: X.151y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204544151y {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(C204543151x c204543151x, long j) {
        long j2;
        long j3 = 0;
        if (c204543151x.LIZJ() == 0) {
            return 1;
        }
        int i = c204543151x.LIZ;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3 && j > c204543151x.LIZLLL()) {
                    return 2;
                }
            } else {
                GameOnDeviceMomentData gameOnDeviceMomentData = c204543151x.LIZLLL;
                if (gameOnDeviceMomentData != null) {
                    j2 = gameOnDeviceMomentData.momentDelay;
                } else {
                    j2 = 0;
                }
                if (j2 > c204543151x.LIZLLL()) {
                    return 2;
                }
            }
        } else if (j > c204543151x.LIZLLL()) {
            return 2;
        }
        if (c204543151x.LIZ == 0) {
            GameMomentMessage gameMomentMessage = c204543151x.LIZIZ;
            if (gameMomentMessage != null) {
                j3 = gameMomentMessage.eventTime;
            }
            if (j < j3) {
                return 3;
            }
        }
        return 0;
    }
}
