package X;

import com.bytedance.android.livesdk.chatroom.model.StreamStatusReqMessage;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import webcast.api.room.EventTrackingReportReqMessage;

/* JADX INFO: renamed from: X.0UYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYZ {
    public static final void LIZ(EventTrackingReportReqMessage eventTrackingReportReqMessage) {
        byte[] bArrLJ = C1516000pYM.LJ(eventTrackingReportReqMessage);
        if (bArrLJ != null) {
            ((C1528270ps9) ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager()).LIZLLL(new C1528300psC(bArrLJ, 4));
        }
    }

    public static final void LIZIZ(int i, long j, long j2, long j3) {
        StreamStatusReqMessage streamStatusReqMessage = new StreamStatusReqMessage();
        streamStatusReqMessage.roomId = j;
        streamStatusReqMessage.status = i;
        streamStatusReqMessage.streamId = j2;
        streamStatusReqMessage.timestamp = j3;
        byte[] bArrLJ = C1516000pYM.LJ(streamStatusReqMessage);
        if (bArrLJ != null) {
            ((C1528270ps9) ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager()).LIZLLL(new C1528300psC(bArrLJ, 3));
        }
    }
}
