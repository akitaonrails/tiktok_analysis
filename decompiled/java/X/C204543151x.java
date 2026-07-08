package X;

import com.bytedance.android.livesdk.game.data.GameClientAIMomentData;
import com.bytedance.android.livesdk.game.data.GameOnDeviceMomentData;
import com.bytedance.android.livesdk.model.message.GameMomentMessage;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.151x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204543151x {
    public int LIZ;
    public GameMomentMessage LIZIZ;
    public GameClientAIMomentData LIZJ;
    public GameOnDeviceMomentData LIZLLL;

    public final List<Integer> LIZ() {
        List<Integer> list;
        List<Integer> list2;
        List<Integer> list3;
        List<Integer> list4;
        int i = this.LIZ;
        if (i == 0) {
            GameMomentMessage gameMomentMessage = this.LIZIZ;
            return (gameMomentMessage == null || (list = gameMomentMessage.momentEffects) == null) ? new ArrayList() : list;
        }
        if (i == 1) {
            GameClientAIMomentData gameClientAIMomentData = this.LIZJ;
            return (gameClientAIMomentData == null || (list2 = gameClientAIMomentData.momentEffects) == null) ? new ArrayList() : list2;
        }
        if (i == 2) {
            GameOnDeviceMomentData gameOnDeviceMomentData = this.LIZLLL;
            return (gameOnDeviceMomentData == null || (list3 = gameOnDeviceMomentData.momentEffects) == null) ? new ArrayList() : list3;
        }
        if (i != 3) {
            return new ArrayList();
        }
        GameClientAIMomentData gameClientAIMomentData2 = this.LIZJ;
        return (gameClientAIMomentData2 == null || (list4 = gameClientAIMomentData2.momentEffects) == null) ? new ArrayList() : list4;
    }

    public final int LIZIZ() {
        GameClientAIMomentData gameClientAIMomentData;
        int i = this.LIZ;
        if (i == 0) {
            GameMomentMessage gameMomentMessage = this.LIZIZ;
            if (gameMomentMessage != null) {
                return gameMomentMessage.messageType;
            }
            return 0;
        }
        if (i == 1) {
            GameClientAIMomentData gameClientAIMomentData2 = this.LIZJ;
            if (gameClientAIMomentData2 != null) {
                return gameClientAIMomentData2.messageType;
            }
            return 0;
        }
        if (i != 2) {
            if (i != 3 || (gameClientAIMomentData = this.LIZJ) == null) {
                return 0;
            }
            return gameClientAIMomentData.messageType;
        }
        GameOnDeviceMomentData gameOnDeviceMomentData = this.LIZLLL;
        if (gameOnDeviceMomentData != null) {
            return gameOnDeviceMomentData.messageType;
        }
        return 0;
    }

    public final long LIZJ() {
        GameClientAIMomentData gameClientAIMomentData;
        int i = this.LIZ;
        if (i == 0) {
            GameMomentMessage gameMomentMessage = this.LIZIZ;
            if (gameMomentMessage != null) {
                return gameMomentMessage.eventTime;
            }
            return 0L;
        }
        if (i == 1) {
            GameClientAIMomentData gameClientAIMomentData2 = this.LIZJ;
            if (gameClientAIMomentData2 != null) {
                return gameClientAIMomentData2.eventTime;
            }
            return 0L;
        }
        if (i != 2) {
            if (i != 3 || (gameClientAIMomentData = this.LIZJ) == null) {
                return 0L;
            }
            return gameClientAIMomentData.eventTime;
        }
        GameOnDeviceMomentData gameOnDeviceMomentData = this.LIZLLL;
        if (gameOnDeviceMomentData != null) {
            return gameOnDeviceMomentData.momentLiveDuration;
        }
        return 0L;
    }

    public final long LIZLLL() {
        int i = this.LIZ;
        long j = 0;
        if (i == 0) {
            GameMomentMessage gameMomentMessage = this.LIZIZ;
            if (gameMomentMessage != null) {
                return gameMomentMessage.maxTime;
            }
            return 0L;
        }
        if (i == 1) {
            GameClientAIMomentData gameClientAIMomentData = this.LIZJ;
            if (gameClientAIMomentData != null) {
                j = gameClientAIMomentData.eventTime;
            }
        } else {
            if (i == 2) {
                GameOnDeviceMomentData gameOnDeviceMomentData = this.LIZLLL;
                return gameOnDeviceMomentData != null ? gameOnDeviceMomentData.maxTime : Mp4ScreenVideoLoadTimeout.CONTROL;
            }
            if (i != 3) {
                return 0L;
            }
            GameClientAIMomentData gameClientAIMomentData2 = this.LIZJ;
            if (gameClientAIMomentData2 != null) {
                j = gameClientAIMomentData2.eventTime;
            }
        }
        return j + ((long) 5000);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002a A[PHI: r0
      0x002a: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v6 java.lang.String), (r0v9 java.lang.String) binds: [B:23:0x0027, B:18:0x001e, B:13:0x0015] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ() {
        /*
            r3 = this;
            int r2 = r3.LIZ
            if (r2 == 0) goto L2b
            r0 = 1
            java.lang.String r1 = ""
            if (r2 == r0) goto L21
            r0 = 2
            if (r2 == r0) goto L18
            r0 = 3
            if (r2 != r0) goto L17
            com.bytedance.android.livesdk.game.data.GameClientAIMomentData r0 = r3.LIZJ
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.recognitionEnd
            if (r0 != 0) goto L2a
        L17:
            return r1
        L18:
            com.bytedance.android.livesdk.game.data.GameOnDeviceMomentData r0 = r3.LIZLLL
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.recognitionEnd
            if (r0 != 0) goto L2a
            return r1
        L21:
            com.bytedance.android.livesdk.game.data.GameClientAIMomentData r0 = r3.LIZJ
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.recognitionEnd
            if (r0 != 0) goto L2a
            return r1
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "server"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204543151x.LJ():java.lang.String");
    }

    public final String LJFF() {
        String str;
        int i = this.LIZ;
        if (i == 0) {
            return "OCR";
        }
        if (i == 1) {
            return "image";
        }
        if (i != 2) {
            return i == 3 ? "sound_effect" : "";
        }
        GameOnDeviceMomentData gameOnDeviceMomentData = this.LIZLLL;
        return (gameOnDeviceMomentData == null || (str = gameOnDeviceMomentData.recognitionMethod) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0033 A[PHI: r0
      0x0033: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v5 java.lang.String), (r0v8 java.lang.String), (r0v11 java.lang.String) binds: [B:28:0x0030, B:23:0x0027, B:18:0x001e, B:13:0x0015] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI() {
        /*
            r3 = this;
            int r2 = r3.LIZ
            java.lang.String r1 = ""
            if (r2 == 0) goto L2a
            r0 = 1
            if (r2 == r0) goto L21
            r0 = 2
            if (r2 == r0) goto L18
            r0 = 3
            if (r2 != r0) goto L17
            com.bytedance.android.livesdk.game.data.GameClientAIMomentData r0 = r3.LIZJ
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.uniqueId
            if (r0 != 0) goto L33
        L17:
            return r1
        L18:
            com.bytedance.android.livesdk.game.data.GameOnDeviceMomentData r0 = r3.LIZLLL
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.uniqueId
            if (r0 != 0) goto L33
            return r1
        L21:
            com.bytedance.android.livesdk.game.data.GameClientAIMomentData r0 = r3.LIZJ
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.uniqueId
            if (r0 != 0) goto L33
            return r1
        L2a:
            com.bytedance.android.livesdk.model.message.GameMomentMessage r0 = r3.LIZIZ
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.uniqueId
            if (r0 != 0) goto L33
            return r1
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204543151x.LJI():java.lang.String");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gameMomentType = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uniqueId = ");
        sbLIZ.append(LJI());
        sbLIZ.append(" , messageType = ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", recognitionEnd = ");
        sbLIZ.append(LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
