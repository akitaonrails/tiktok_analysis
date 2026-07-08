package X;

import com.bytedance.android.livesdk.dataChannel.GlobalInflowMessage;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.jvm.internal.AwS125S0110000_7;

/* JADX INFO: renamed from: X.0Ius, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481760Ius implements InterfaceC486470J5x, C0CW2<DownlinkLiveStatusData> {
    public static InterfaceC481880Iv4 LLILLJJLI;
    public static volatile boolean LLILLL;
    public static boolean LLILZIL;
    public static final C481760Ius LL = new C481760Ius();
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C481800Iuw());

    public static String LIZJ(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedUserRoomMonitorMessage(anchorId=");
        sbLIZ.append(feedUserRoomMonitorMessage.anchorId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(feedUserRoomMonitorMessage.roomId);
        sbLIZ.append(", roomStatus=");
        sbLIZ.append(feedUserRoomMonitorMessage.roomStatus);
        sbLIZ.append(", roomTime=");
        sbLIZ.append(feedUserRoomMonitorMessage.roomTime);
        sbLIZ.append(", streamStatus=");
        sbLIZ.append(feedUserRoomMonitorMessage.streamStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        boolean zBooleanValue;
        ProtoMessageFetchResult protoMessageFetchResult;
        List<ProtoMessageFetchResult.BaseProtoMessage> list;
        FeedUserRoomMonitorMessage feedUserRoomMonitorMessage;
        long j;
        long j2;
        C20441214yg.LIZIZ("LiveHostRoomStateListener", "onReceivedWsMsg");
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(GlobalInflowMessage.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LLILZIL = zBooleanValue;
        if (wsChannelMsg.service == 134217784) {
            long jLIZJ = C963140bAe.LIZJ();
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(ProtoMessageFetchResult.class);
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(wsChannelMsg.LIZ()));
            if (c0imdLJI != null && (protoMessageFetchResult = (ProtoMessageFetchResult) c0imdLJI.LIZJ(c1516680pZS)) != null && (list = protoMessageFetchResult.messages) != null && (!list.isEmpty())) {
                C1515210pX5.LIZLLL().getClass();
                C0IMD c0imdLJI2 = C1515210pX5.LJI(FeedUserRoomMonitorMessage.class);
                byte[] bArr = ((ProtoMessageFetchResult.BaseProtoMessage) ListProtector.get(protoMessageFetchResult.messages, 0)).payload;
                C1516680pZS c1516680pZS2 = new C1516680pZS();
                c1516680pZS2.LJIIL(new C1506330pIl(bArr));
                if (c0imdLJI2 != null && (feedUserRoomMonitorMessage = (FeedUserRoomMonitorMessage) c0imdLJI2.LIZJ(c1516680pZS2)) != null) {
                    long j3 = feedUserRoomMonitorMessage.roomTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    CommonMessageData commonMessageData = feedUserRoomMonitorMessage.baseMessage;
                    if (commonMessageData != null) {
                        j = commonMessageData.createTime;
                    } else {
                        j = 0;
                    }
                    if (protoMessageFetchResult != null) {
                        j2 = protoMessageFetchResult.now;
                    } else {
                        j2 = 0;
                    }
                    C01TT.LIZLLL(new C481750Iur(feedUserRoomMonitorMessage, jLIZJ, j, j3, j2));
                }
            }
        }
    }

    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
        boolean zBooleanValue;
        DownlinkLiveStatusData downlinkLiveStatusData = (DownlinkLiveStatusData) baseDownlinkData;
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(GlobalInflowMessage.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LLILZIL = zBooleanValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHostRoomStateListener.onDownlinkMessageReceived: isInflow=");
        sbLIZ.append(LLILZIL);
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("SignalingRoomState", C2188811AlT.LIZIZ(sbLIZ));
        C01TT.LIZLLL(new C481770Iut(downlinkLiveStatusData, uplinkMessageResponse.subType, uplinkMessageResponse, awS125S0110000_7));
    }

    public static void LIZ(String str, FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, String str2, int i, long j, long j2, long j3, long j4, long j5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(feedUserRoomMonitorMessage.roomStatus, "im_push_room_status");
        c2344009Gk.LIZLLL(j - j2, "room_action_change_to_server_call_imsdk_duration");
        c2344009Gk.LIZLLL(j3 - j, "server_call_imsdk_to_imsdk_call_frontier_duration");
        c2344009Gk.LIZLLL(j4 - j3, "imsdk_call_frontier_to_client_receive_im_duration");
        c2344009Gk.LIZLLL(j5, "client_receive_im_to_avatar_update_duration");
        c2344009Gk.LIZLLL(j4 - j2, "room_action_change_to_client_receive_im_duration");
        c2344009Gk.LJIIIIZZ("is_hit", str2);
        c2344009Gk.LIZJ(i, "im_source");
        c2344009Gk.LIZLLL(feedUserRoomMonitorMessage.roomId, "room_id");
        c2344009Gk.LJIIIIZZ("handle_source", str);
        C20684815ws.LJIILLIIL("livesdk_live_outer_im_reach", c2344009Gk.LIZ);
    }
}
