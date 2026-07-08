package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0a3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920330a3b {
    public static LinkLayerRTCMessage LIZ(String str) {
        try {
            return (LinkLayerRTCMessage) C19748512Ol.LIZIZ.LJII(str, LinkLayerRTCMessage.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append("_RtcMessageReaderV3_");
            sbLIZ.append(22);
            C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "unpackRoomMsgV3 failed", e.getMessage(), null);
            return null;
        }
    }
}
