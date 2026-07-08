package X;

import android.os.Looper;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078890eBL {
    public Gift LIZ;
    public final long LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 5));

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[PHI: r1
      0x0013: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x0011, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdk.model.message.common.Text LIZ() {
        /*
            com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationBubbleTextSetting r0 = com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationBubbleTextSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationBubbleTextSetting$LiveFansStarlingKeyConfig r0 = r0.getValue()
            com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationBubbleTextSetting$LiveFansStarlingKey r0 = r0.claimKey
            java.lang.String r3 = ""
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.pattern
            if (r1 != 0) goto L13
        L10:
            r1 = r3
            if (r0 == 0) goto L18
        L13:
            java.lang.String r0 = r0.key
            if (r0 == 0) goto L18
            r3 = r0
        L18:
            com.bytedance.android.livesdk.model.message.common.Text r2 = new com.bytedance.android.livesdk.model.message.common.Text
            r2.<init>()
            r2.key = r3
            r2.defaultPattern = r1
            com.bytedance.android.livesdk.model.message.common.TextFormat r1 = new com.bytedance.android.livesdk.model.message.common.TextFormat
            r1.<init>()
            java.lang.String r0 = "#ffffff"
            r1.color = r0
            r0 = 400(0x190, float:5.6E-43)
            r1.weight = r0
            r0 = 0
            r1.italic = r0
            r2.defaultFormat = r1
            X.13BV r0 = X.C13BV.INSTANCE
            r2.pieces = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1078890eBL.LIZ():com.bytedance.android.livesdk.model.message.common.Text");
    }

    public C1078890eBL(DataChannel dataChannel) {
        long jLJJLIIIJ;
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        this.LIZIZ = jLJJLIIIJ;
    }
}
