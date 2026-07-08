package X;

import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481770Iut extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DownlinkLiveStatusData LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ UplinkMessageResponse LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481770Iut(DownlinkLiveStatusData downlinkLiveStatusData, String str, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
        super(0);
        this.LL = downlinkLiveStatusData;
        this.LLILLJJLI = str;
        this.LLILLL = uplinkMessageResponse;
        this.LLILZ = awS125S0110000_7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C481790Iuv c481790IuvQ;
        List<DownlinkLiveStatusItem> liveStatusChangeList = this.LL.getLiveStatusChangeList();
        int i = 0;
        C481790Iuv c481790Iuv = null;
        if (liveStatusChangeList != null) {
            String str = this.LLILLJJLI;
            for (DownlinkLiveStatusItem downlinkLiveStatusItem : liveStatusChangeList) {
                FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = new FeedUserRoomMonitorMessage();
                feedUserRoomMonitorMessage.anchorId = downlinkLiveStatusItem.anchorId;
                feedUserRoomMonitorMessage.roomId = downlinkLiveStatusItem.roomId;
                feedUserRoomMonitorMessage.roomStatus = downlinkLiveStatusItem.roomStatus;
                feedUserRoomMonitorMessage.roomTime = downlinkLiveStatusItem.roomTime;
                feedUserRoomMonitorMessage.streamStatus = downlinkLiveStatusItem.streamStatus;
                feedUserRoomMonitorMessage.LL = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveHostRoomStateListener.onDownlinkMessageReceived: notifyMessage ");
                C481760Ius.LL.getClass();
                sbLIZ.append(C481760Ius.LIZJ(feedUserRoomMonitorMessage));
                C20441214yg.LIZIZ("SignalingRoomState", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC481880Iv4 interfaceC481880Iv4 = C481760Ius.LLILLJJLI;
                if (interfaceC481880Iv4 != null && (c481790IuvQ = interfaceC481880Iv4.q(feedUserRoomMonitorMessage)) != null && c481790IuvQ.LIZ) {
                    c481790Iuv = c481790IuvQ;
                }
            }
            if (c481790Iuv != null) {
                UplinkMessageResponse uplinkMessageResponse = this.LLILLL;
                Function0<Unit> function0 = this.LLILZ;
                if (Intrinsics.LJFF(uplinkMessageResponse.subType, "fyp_skylight_refresh")) {
                    String str2 = c481790Iuv.LIZJ;
                    if (str2 != null) {
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -1002370514) {
                            if (iHashCode != 711029960) {
                                if (iHashCode == 748321728 && str2.equals("FOR_YOU_FEED_SKYLIGHT")) {
                                    i = 1;
                                }
                            } else if (str2.equals("FOLLOWING_FEED_SKYLIGHT")) {
                                i = 2;
                            }
                        } else if (str2.equals("inbox_skylight")) {
                            i = 3;
                        }
                    }
                    C0J67.LIZ(true, uplinkMessageResponse, Integer.valueOf(i));
                } else {
                    function0.invoke();
                }
            }
        }
        return Unit.LIZ;
    }
}
