package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.marketing.detect.MessageDetectApi;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageTrackTimeInfo;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C163700jz implements OnMessageListener {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final boolean LL;

    public C163700jz(boolean z) {
        this.LL = z;
    }

    public final synchronized String LIZJ(MsgDetectMessage msgDetectMessage) {
        String strLJIILL;
        try {
            strLJIILL = C19748512Ol.LIZIZ.LJIILL(msgDetectMessage);
            if (strLJIILL == null) {
                strLJIILL = "";
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        return strLJIILL;
    }

    public final void LIZLLL(MsgDetectMessage msgDetectMessage) {
        IMessageManager iMessageManager;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String domain = null;
        if (room != null) {
            iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(room.getId());
        } else {
            iMessageManager = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_im_delay_detect");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LL ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(msgDetectMessage.getMessageId()), "msg_id");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(msgDetectMessage.getMessageFrom()), "msg_from");
        c474500IjALIZ.LJJII(Integer.valueOf(msgDetectMessage.getGeneralMessageType()), "msg_type");
        MsgDetectMessage.TimeInfo timeInfo = msgDetectMessage.timeInfo;
        if (timeInfo != null) {
            lValueOf2 = Long.valueOf(timeInfo.clientStartMs);
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "client_start_ms");
        MsgDetectMessage.TimeInfo timeInfo2 = msgDetectMessage.timeInfo;
        if (timeInfo2 != null) {
            lValueOf3 = Long.valueOf(timeInfo2.apiRecvTimeMs);
        } else {
            lValueOf3 = null;
        }
        c474500IjALIZ.LJJII(lValueOf3, "api_recv_time_ms");
        MsgDetectMessage.TimeInfo timeInfo3 = msgDetectMessage.timeInfo;
        if (timeInfo3 != null) {
            lValueOf4 = Long.valueOf(timeInfo3.apiSendToGoimMs);
        } else {
            lValueOf4 = null;
        }
        c474500IjALIZ.LJJII(lValueOf4, "api_send_to_goim_ms");
        c474500IjALIZ.LJJII(Long.valueOf(msgDetectMessage.messageTrackTimeInfo.receiveMessageTime), "imsdk_recv_time_ms");
        c474500IjALIZ.LJJII(Long.valueOf(msgDetectMessage.messageTrackTimeInfo.deliverMessageTime), "imsdk_deliver_time_ms");
        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ()), "report_time_ms");
        c474500IjALIZ.LJJII(msgDetectMessage.baseMessage.fromIdc, "from_idc");
        c474500IjALIZ.LJJII(msgDetectMessage.fromRegion, "from_region");
        if (iMessageManager != null) {
            domain = iMessageManager.getDomain();
        }
        c474500IjALIZ.LJJII(domain, "domain");
        c474500IjALIZ.LIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long id;
        long id2;
        long ownerUserId;
        long id3;
        long ownerUserId2;
        long id4;
        long j;
        long j2;
        if (!(iMessage instanceof MsgDetectMessage)) {
            return;
        }
        MsgDetectMessage msgDetectMessage = (MsgDetectMessage) iMessage;
        int i = msgDetectMessage.detectType;
        long ownerUserId3 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZLLL(msgDetectMessage);
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    C480460Ism.LIZ().getClass();
                    MessageDetectApi messageDetectApi = (MessageDetectApi) C480460Ism.LIZLLL(MessageDetectApi.class);
                    if (room != null) {
                        id4 = room.getId();
                    } else {
                        id4 = 0;
                    }
                    int generalMessageType = msgDetectMessage.getGeneralMessageType();
                    MsgDetectMessage.TimeInfo timeInfo = msgDetectMessage.timeInfo;
                    if (timeInfo != null) {
                        j = timeInfo.clientStartMs;
                        j2 = timeInfo.apiRecvTimeMs;
                        ownerUserId3 = timeInfo.apiSendToGoimMs;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    MessageTrackTimeInfo messageTrackTimeInfo = msgDetectMessage.messageTrackTimeInfo;
                    messageDetectApi.imDetectReport(id4, generalMessageType, j, j2, ownerUserId3, messageTrackTimeInfo.receiveMessageTime, messageTrackTimeInfo.deliverMessageTime).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00ND
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("MessageDetectListener@1c48.timeDelayReportApi$1");
                            C1C7U.LIZIZ("MessageDetectListener@1c48.timeDelayReportApi$1");
                        }
                    }, new C09JN() { // from class: X.00NE
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("MessageDetectListener@1c48.timeDelayReportApi$2");
                            C1C7U.LIZIZ("MessageDetectListener@1c48.timeDelayReportApi$2");
                        }
                    });
                    return;
                }
                return;
            }
            LIZLLL(msgDetectMessage);
            return;
        }
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        MsgDetectMessage.TriggerCondition triggerCondition = msgDetectMessage.triggerCondition;
        if (triggerCondition != null && Intrinsics.LJFF(triggerCondition.uplinkDetectHTTP, Boolean.TRUE)) {
            MsgDetectMessage.TriggerCondition triggerCondition2 = msgDetectMessage.triggerCondition;
            if (triggerCondition2 != null && Intrinsics.LJFF(triggerCondition2.httpOptimize, Boolean.TRUE)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C480460Ism.LIZ().getClass();
                MessageDetectApi messageDetectApi2 = (MessageDetectApi) C480460Ism.LIZJ(MessageDetectApi.class);
                if (room2 != null) {
                    id3 = room2.getId();
                } else {
                    id3 = 0;
                }
                if (room2 != null) {
                    ownerUserId2 = room2.getOwnerUserId();
                } else {
                    ownerUserId2 = 0;
                }
                long jLIZ = C158B.LIZ();
                String strLIZJ = LIZJ(msgDetectMessage);
                C1515210pX5.LIZLLL().getClass();
                messageDetectApi2.imDetect(id3, 0L, ownerUserId2, jLIZ, strLIZJ, C1515210pX5.LIZIZ()).LJIILIIL(new C0UO0()).LJJLL(new C515601ze(jElapsedRealtime, this, msgDetectMessage, 5), new C515601ze(jElapsedRealtime, this, msgDetectMessage, 6));
            } else {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                C480460Ism.LIZ().getClass();
                MessageDetectApi messageDetectApi3 = (MessageDetectApi) C480460Ism.LIZLLL(MessageDetectApi.class);
                if (room2 != null) {
                    id2 = room2.getId();
                } else {
                    id2 = 0;
                }
                if (room2 != null) {
                    ownerUserId = room2.getOwnerUserId();
                } else {
                    ownerUserId = 0;
                }
                messageDetectApi3.imDetect(id2, 0L, ownerUserId, C158B.LIZ(), LIZJ(msgDetectMessage), C2097608Jq.LJ()).LJIILIIL(new C0UO0()).LJJLL(new C515601ze(jElapsedRealtime2, this, msgDetectMessage, 3), new C515601ze(jElapsedRealtime2, this, msgDetectMessage, 4));
            }
        }
        MsgDetectMessage.TriggerCondition triggerCondition3 = msgDetectMessage.triggerCondition;
        if (triggerCondition3 == null || !Intrinsics.LJFF(triggerCondition3.uplinkDetectWebsocket, Boolean.TRUE)) {
            return;
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        MessageDetectApi messageDetectApi4 = (MessageDetectApi) ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).create(MessageDetectApi.class);
        if (messageDetectApi4 == null) {
            return;
        }
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        if (room2 != null) {
            ownerUserId3 = room2.getOwnerUserId();
        }
        C11NZ<C470590Icr<n>> c11nzImDetect = messageDetectApi4.imDetect(id, 0L, ownerUserId3, C158B.LIZ(), LIZJ(msgDetectMessage), C2097608Jq.LJ());
        if (c11nzImDetect == null) {
            return;
        }
        c11nzImDetect.LJIILIIL(new C0UO0()).LJJLL(new C515601ze(jElapsedRealtime3, this, msgDetectMessage, 7), new C515601ze(jElapsedRealtime3, this, msgDetectMessage, 8));
    }

    public static C474500IjA LIZIZ(MsgDetectMessage msgDetectMessage, long j, int i) {
        String str;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_im_detect_api", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(msgDetectMessage.detectType), "detect_type");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "condition_type");
        c474500IjALIZIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - j), "delay");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZIZ.LJJII(str, "is_anchor");
        return c474500IjALIZIZ;
    }

    public static int LIZ(C163700jz c163700jz, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        c163700jz.getClass();
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        if (!z3) {
            return 0;
        }
        return 3;
    }
}
