package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Map;

/* JADX INFO: renamed from: X.0oQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472760oQc extends C1469760oLm {
    public C650110Pej LLILLL;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        player.LIZJ(206, this.LLILLJJLI.LJIIIZ().get(5));
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJIIJI() {
        SparseIntArray sparseIntArrayLJIIIZ = this.LLILLJJLI.LJIIIZ();
        TTVideoEngineLog.turnOn(1, sparseIntArrayLJIIIZ.get(6));
        sparseIntArrayLJIIIZ.get(80);
        if (((Boolean) C1474810oTv.LLLLLLL.getValue()).booleanValue()) {
            TTVideoEngineLog.setLogNotifyLevel(2, 0);
            TTVideoEngineLog.setLogNotifyLevel(1, 0);
        }
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        if (iRadarTransmitterLJIIIZ == null || !iRadarTransmitterLJIIIZ.sdkTransmitEnabled()) {
            return;
        }
        if (iRadarTransmitterLJIIIZ.ttSDKALogOptEnabled()) {
            TTVideoEngine.LLFII(1501, iRadarTransmitterLJIIIZ.kernelLogLeverPrecise());
        } else {
            TTVideoEngine.LLFII(702, iRadarTransmitterLJIIIZ.kernelLogLever());
        }
        long aLogSimpleWriteFuncAddr = iRadarTransmitterLJIIIZ.getALogSimpleWriteFuncAddr();
        if (aLogSimpleWriteFuncAddr != -1 && iRadarTransmitterLJIIIZ.aLogWriteFuncAddrEnabled()) {
            TTVideoEngine.LLIIIILZ(217, aLogSimpleWriteFuncAddr);
        }
        TTVideoEngineLog.setLogNotifyLevel(iRadarTransmitterLJIIIZ.logNotifyLevel(), 1);
    }

    public C1472760oQc(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIJZLJL(Map<String, Object> map) {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        IRadarTransmitter iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ();
        if (iRadarTransmitterLJIIIZ != null && iRadarTransmitterLJIIIZ.ttSDKALogOptEnabled()) {
            player.LIZJ(1502, 1);
            return;
        }
        if (map.get("enable_alog") != null && (map.get("enable_alog") instanceof Integer)) {
            player.LIZJ(320, ((Integer) map.get("enable_alog")).intValue());
        }
        if (iRadarTransmitterLJIIIZ == null || !iRadarTransmitterLJIIIZ.enabled() || !iRadarTransmitterLJIIIZ.sdkTransmitEnabled()) {
            return;
        }
        player.LIZJ(320, 1);
    }
}
