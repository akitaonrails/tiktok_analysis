package X;

import Y.ARunnableS103S0200000_34;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.msg.utils.WeakHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1By7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222131By7 implements IMessageWsClient.Callback {
    public final /* synthetic */ C2222141By8 LIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketConnected() {
        Handler handler;
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWebSocketConnected, current state: ");
        sbLIZ.append(this.LIZ.LIZ.LIZ.e8().LIZ);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJIL(EnumC2222181ByC.WS_CONNECTED);
        C2222141By8 c2222141By8 = this.LIZ;
        c2222141By8.LJJIIJ++;
        c2222141By8.LIZIZ();
        this.LIZ.LIZLLL();
        this.LIZ.LJIJI();
        C2222141By8 c2222141By82 = this.LIZ;
        Handler handler2 = c2222141By82.LJIJ;
        if (handler2 != null && !handler2.hasMessages(116) && (handler = c2222141By82.LJIJ) != null) {
            C786410Ut5.LJLILLLLZI(handler, 116);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onWebSocketConnected();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketDisconnected() {
        this.LIZ.LJIL(EnumC2222181ByC.HTTP);
        C2222141By8 c2222141By8 = this.LIZ;
        c2222141By8.LJIILIIL++;
        c2222141By8.LJIJJLI = 0L;
        MessageMonitor messageMonitorLIZIZ = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWebSocketDisconnected, ws connect failed count is ");
        sbLIZ.append(this.LIZ.LJIILIIL);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJ();
        this.LIZ.LIZLLL();
        this.LIZ.LIZIZ();
        this.LIZ.LJFF();
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onWebSocketDisconnected();
        }
        this.LIZ.LIZ.LIZ.LIZIZ().monitorWSReuseCount(this.LIZ.LJJIIZ);
        C2222141By8 c2222141By82 = this.LIZ;
        c2222141By82.LJJIIZ = 0;
        c2222141By82.LIZLLL.disconnectFromWebSocket("ws_disconnect_re_determine");
        Handler handler = this.LIZ.LJIJI;
        if (handler == null || !handler.hasMessages(109)) {
            C2222141By8 c2222141By83 = this.LIZ;
            long j = c2222141By83.LJII > 0 ? c2222141By83.LJII : 1000L;
            MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("re determine message strategy ");
            sbLIZ2.append(j);
            messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
            Handler handler2 = this.LIZ.LJIJI;
            if (handler2 != null) {
                C786410Ut5.LJLJJI(109, j, handler2);
            }
            C2222511Byj c2222511Byj = this.LIZ.LJIJJ;
            if (c2222511Byj != null) {
                c2222511Byj.LIZLLL();
            }
        }
    }

    public C2222131By7(C2222141By8 c2222141By8) {
        this.LIZ = c2222141By8;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onHostWebSocketMessage(PayloadItem payloadItem) {
        Message messageObtainMessage;
        this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onHostWebSocketMessage");
        Map<String, Object> extraParams = payloadItem.getExtraParams();
        MessageMonitor.Stage stage = MessageMonitor.Stage.START;
        extraParams.put(MessageMonitor.getLiveMessageStageName("receive_raw_msg", stage), Long.valueOf(MessageMonitor.getExtraParamsTime(payloadItem.getExtraParams(), "all_time", stage)));
        payloadItem.getExtraParams().put(MessageMonitor.getLiveMessageStageName("receive_raw_msg", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
        Handler handler = this.LIZ.LJIJ;
        if (handler != null && (messageObtainMessage = handler.obtainMessage(111, payloadItem)) != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketMessage(PayloadItem payloadItem) {
        C2222511Byj c2222511Byj;
        WeakHandler weakHandler;
        Message messageObtainMessage;
        Message messageObtainMessage2;
        Handler handler;
        C2222241ByI c2222241ByI;
        Message messageObtainMessage3;
        C2222081By2 c2222081By2;
        boolean z;
        C2222241ByI c2222241ByI2;
        Message messageObtainMessage4;
        C01GW c01gw = C20340414iQ.LIZ;
        C20340414iQ.LIZIZ(new AwS578S0100000_34(payloadItem, 140));
        C20340414iQ.LIZJ(new AwS578S0100000_34(payloadItem, 141));
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWebSocketMessage: payload type is ");
        sbLIZ.append(payloadItem.getPayloadType());
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.equals(payloadItem.getPayloadType(), "msg")) {
            this.LIZ.LJIIJ = System.currentTimeMillis();
            Map<String, Object> extraParams = payloadItem.getExtraParams();
            MessageMonitor.Stage stage = MessageMonitor.Stage.START;
            extraParams.put(MessageMonitor.getLiveMessageStageName("receive_raw_msg", stage), Long.valueOf(MessageMonitor.getExtraParamsTime(payloadItem.getExtraParams(), "all_time", stage)));
            payloadItem.getExtraParams().put(MessageMonitor.getLiveMessageStageName("receive_raw_msg", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
            Handler handler2 = this.LIZ.LJIJ;
            if (handler2 != null && (messageObtainMessage4 = handler2.obtainMessage(107, payloadItem)) != null) {
                messageObtainMessage4.sendToTarget();
                return;
            }
            return;
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "close")) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onWebSocketMessage: payload type is close, fallback to http");
            this.LIZ.LJJ("service_close_cmd");
            return;
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "hb")) {
            C2222141By8 c2222141By8 = this.LIZ;
            c2222141By8.getClass();
            try {
                String strValueOf = String.valueOf(payloadItem.getSeqId());
                long j = c2222141By8.LJIILL;
                long serverTime = payloadItem.getServerTime();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis - j;
                MessageMonitor messageMonitorLIZIZ2 = c2222141By8.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendPacketTime = ");
                sbLIZ2.append(j);
                sbLIZ2.append(", serverTime = ");
                sbLIZ2.append(serverTime);
                sbLIZ2.append(", receivePacketTime = ");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append(", serverTimeGap = ");
                long j3 = 2;
                sbLIZ2.append(((j2 / j3) + serverTime) - jCurrentTimeMillis);
                messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
                if (!TextUtils.equals(strValueOf, c2222141By8.LJIILLIIL)) {
                    MessageMonitor messageMonitorLIZIZ3 = c2222141By8.LIZ.LIZ.LIZIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("not match, discard packetSeqId: ");
                    sbLIZ3.append(strValueOf);
                    sbLIZ3.append(", heartbeatSendPacketSeqId: ");
                    sbLIZ3.append(c2222141By8.LJIILLIIL);
                    messageMonitorLIZIZ3.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                C2222081By2 c2222081By22 = c2222141By8.LJJIJIIJI;
                if (c2222081By22 == null) {
                    c2222081By2 = null;
                } else {
                    c2222081By2 = c2222081By22;
                }
                if (c2222081By2.LIZLLL == null) {
                    C2222241ByI c2222241ByI3 = c2222081By2.LIZIZ.LIZIZ;
                    if (c2222241ByI3 == null) {
                        z = false;
                    } else {
                        z = c2222241ByI3.LJ;
                    }
                } else {
                    z = true;
                }
                long j4 = 1000;
                if (z) {
                    if (jCurrentTimeMillis <= j || j <= 0 || serverTime <= 0) {
                        return;
                    }
                    if (c2222081By22 == null) {
                        c2222081By22 = null;
                    }
                    if (c2222081By22.LIZLLL == null && (c2222241ByI2 = c2222081By22.LIZIZ.LIZIZ) != null) {
                        j4 = c2222241ByI2.LIZLLL;
                    }
                    if (j2 > j4) {
                        return;
                    }
                } else if (jCurrentTimeMillis <= j || j <= 0 || serverTime <= 0 || serverTime < jCurrentTimeMillis || j2 > 1000) {
                    return;
                }
                c2222141By8.LIZLLL.setWebSocketServerTimeGap((serverTime + (j2 / j3)) - jCurrentTimeMillis);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (TextUtils.equals(payloadItem.getPayloadType(), "im_enter_room_resp")) {
            this.LIZ.LJIIJ = System.currentTimeMillis();
            this.LIZ.LJIL(EnumC2222181ByC.WS_CONNECTED_AND_ENTER_ROOM_RESP);
            this.LIZ.LJFF();
            this.LIZ.LIZIZ();
            MessageMonitor messageMonitorLIZIZ4 = this.LIZ.LIZ.LIZ.LIZIZ();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C2222141By8 c2222141By82 = this.LIZ;
            messageMonitorLIZIZ4.monitorImEnterRoomDelay(jCurrentTimeMillis2 - c2222141By82.LJJI, c2222141By82.LJJIII);
            this.LIZ.LJJIFFI++;
            Map<String, Object> extraParams2 = payloadItem.getExtraParams();
            MessageMonitor.Stage stage2 = MessageMonitor.Stage.START;
            extraParams2.put(MessageMonitor.getLiveMessageStageName("receive_raw_msg", stage2), Long.valueOf(MessageMonitor.getExtraParamsTime(payloadItem.getExtraParams(), "all_time", stage2)));
            payloadItem.getExtraParams().put(MessageMonitor.getLiveMessageStageName("receive_raw_msg", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
            Handler handler3 = this.LIZ.LJIJ;
            if (handler3 != null && (messageObtainMessage3 = handler3.obtainMessage(107, payloadItem)) != null) {
                messageObtainMessage3.sendToTarget();
            }
            if (payloadItem.getServerTime() > 0) {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                this.LIZ.LIZLLL.setWebSocketServerTimeGap((payloadItem.getServerTime() + ((jCurrentTimeMillis3 - this.LIZ.LJJI) / ((long) 2))) - jCurrentTimeMillis3);
            }
            C2222141By8 c2222141By83 = this.LIZ;
            C2222081By2 c2222081By23 = c2222141By83.LJJIJIIJI;
            if (c2222081By23 == null) {
                c2222081By23 = null;
            }
            if ((c2222081By23.LIZLLL == null && ((c2222241ByI = c2222081By23.LIZIZ.LIZIZ) == null || !c2222241ByI.LJFF)) || !c2222141By83.LIZLLL.isWsConnected()) {
                return;
            }
            c2222141By83.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "trigger heartbeat timer");
            c2222141By83.LJ();
            Handler handler4 = c2222141By83.LJIJ;
            if (handler4 == null || (messageObtainMessage2 = handler4.obtainMessage(110)) == null || (handler = c2222141By83.LJIJ) == null) {
                return;
            }
            C786410Ut5.LJLJJL(handler, messageObtainMessage2);
            return;
        }
        if (!TextUtils.equals(payloadItem.getPayloadType(), "uplink_im_gateway") || (c2222511Byj = this.LIZ.LJIJJ) == null || (weakHandler = c2222511Byj.LJII) == null || (messageObtainMessage = weakHandler.obtainMessage(12346, payloadItem)) == null) {
            return;
        }
        messageObtainMessage.sendToTarget();
    }

    public final void LIZ(long j, List list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2222141By8 c2222141By8 = this.LIZ;
        long j2 = jCurrentTimeMillis - c2222141By8.LJIIJ;
        if (j2 > 0) {
            ((CopyOnWriteArrayList) c2222141By8.LJ).add(Long.valueOf(j2));
            if (((CopyOnWriteArrayList) this.LIZ.LJ).size() > 5) {
                C19719612Di.LJJIIZI(this.LIZ.LJ);
            }
        }
        C2222341ByS c2222341BySContext = this.LIZ.LIZ.LIZ.context();
        Long l = (Long) C13LP.LJJLIIIJLJLI(this.LIZ.LJ);
        if (l != null) {
            l.longValue();
        }
        c2222341BySContext.getClass();
        this.LIZ.LIZ.LIZ.LJIIIIZZ().LJII(j, list);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onApiError(Exception exc, int i) {
        long j;
        ((CopyOnWriteArraySet) this.LIZ.LJIIJJI).remove(Integer.valueOf(i));
        C2222141By8 c2222141By8 = this.LIZ;
        int i2 = c2222141By8.LJFF + 1;
        c2222141By8.LJFF = i2;
        if (i2 > 3) {
            j = Mp4ScreenVideoLoadTimeout.CONTROL;
        } else {
            j = ((long) i2) * 1000;
        }
        MessageMonitor messageMonitorLIZIZ = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onApiError: ");
        sbLIZ.append(exc);
        sbLIZ.append(". failed count: ");
        sbLIZ.append(this.LIZ.LJFF);
        sbLIZ.append(", retry after ");
        sbLIZ.append(j);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
            Handler handler = this.LIZ.LJIJI;
            if (handler != null) {
                C786410Ut5.LJLJJI(113, j, handler);
            }
        } else {
            this.LIZ.LJIJJLI();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onImFetchFailed(exc);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z) {
        Integer numValueOf;
        C2222371ByV c2222371ByV;
        if (!this.LIZ.LJIIJ(protoApiResult.dimension)) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onHostWebSocketPayloadDecoded, but checkDimensionValid false");
            return;
        }
        C2222141By8 c2222141By8 = this.LIZ;
        if (!c2222141By8.LJJ && (c2222371ByV = c2222141By8.LJI) != null && c2222371ByV.LIZ) {
            c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "isStarted = false, resetCursor = true");
            return;
        }
        MessageMonitor messageMonitorLIZIZ = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostWebSocketMessage, cursor: ");
        sbLIZ.append(this.LIZ.LJIIIZ);
        sbLIZ.append(", fetch_interval: ");
        sbLIZ.append(this.LIZ.LJII);
        sbLIZ.append(", timestamp: ");
        sbLIZ.append(this.LIZ.LJIIIIZZ);
        sbLIZ.append(", size: ");
        List<IMessage> list = protoApiResult.messages;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", heartbeat duration is ");
        sbLIZ.append(this.LIZ.LJIIL);
        messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
        LIZ(protoApiResult.delayTimeBeforeDispatch, protoApiResult.messages);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z) {
        String str;
        Message messageObtainMessage;
        C2222371ByV c2222371ByV;
        if (!this.LIZ.LJIIJ(protoApiResult.dimension)) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onWebSocketPayloadDecoded, but checkDimensionValid false");
            C01GW c01gw = C20340414iQ.LIZ;
            C20340414iQ.LIZIZ(new AwS578S0100000_34(protoApiResult, 142));
            return;
        }
        C2222141By8 c2222141By8 = this.LIZ;
        long j = protoApiResult.enterUniqueId;
        MessageMonitor messageMonitorLIZIZ = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkEnterUniqueIdValid, result enterUniqueId: ");
        sbLIZ.append(j);
        sbLIZ.append(", portal currentEnterUniqueId: ");
        sbLIZ.append(c2222141By8.LJIJJLI);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        if (j != 0 && j != c2222141By8.LJIJJLI) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onWebSocketPayloadDecoded, but checkEnterUniqueId false");
            C01GW c01gw2 = C20340414iQ.LIZ;
            C20340414iQ.LIZIZ(new AwS578S0100000_34(protoApiResult, 143));
            return;
        }
        if (!this.LIZ.LJIILIIL(protoApiResult.isFirst)) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onWebSocketPayloadDecoded, but checkFirstMessageValid false");
            return;
        }
        C2222141By8 c2222141By82 = this.LIZ;
        if (!c2222141By82.LJJ && (c2222371ByV = c2222141By82.LJI) != null && c2222371ByV.LIZ) {
            c2222141By82.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "isStarted = false, resetCursor = true");
            return;
        }
        C2222081By2 c2222081By2 = c2222141By82.LJJIJIIJI;
        Integer numValueOf = null;
        if (c2222081By2 == null) {
            c2222081By2 = null;
        }
        if ((c2222081By2.LIZLLL != null || c2222081By2.LIZ.LJIILJJIL) && ((str = protoApiResult.cursor) == null || str.length() == 0)) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "triggered empty im_cursor Optimization, not update");
        } else {
            String str2 = protoApiResult.cursor;
            if (str2 != null) {
                this.LIZ.LJIIIZ = str2;
            }
        }
        C2222141By8 c2222141By83 = this.LIZ;
        long j2 = protoApiResult.fetchInterval;
        c2222141By83.LIZ.LIZ.context().getClass();
        c2222141By83.LJII = j2;
        this.LIZ.LJIIIIZZ = protoApiResult.now;
        this.LIZ.LJIIL = Math.max(10L, protoApiResult.heartbeatDuration);
        MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onWebSocketPayloadDecoded, cursor: ");
        sbLIZ2.append(this.LIZ.LJIIIZ);
        sbLIZ2.append(", fetch_interval: ");
        sbLIZ2.append(this.LIZ.LJII);
        sbLIZ2.append(", timestamp: ");
        sbLIZ2.append(this.LIZ.LJIIIIZZ);
        sbLIZ2.append(", size: ");
        List<IMessage> list = protoApiResult.messages;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", heartbeat duration is ");
        sbLIZ2.append(this.LIZ.LJIIL);
        messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
        LIZ(protoApiResult.delayTimeBeforeDispatch, protoApiResult.messages);
        if ((TextUtils.equals(protoApiResult.payloadType, "msg") || TextUtils.equals(protoApiResult.payloadType, "im_enter_room_resp")) && protoApiResult.needAck) {
            MessageMonitor messageMonitorLIZIZ3 = this.LIZ.LIZ.LIZ.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onWebSocketPayloadDecoded, need send ack: ");
            sbLIZ3.append(protoApiResult.getFormatAckInfo());
            messageMonitorLIZIZ3.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ3));
            Handler handler = this.LIZ.LJIJ;
            if (handler != null && (messageObtainMessage = handler.obtainMessage(108, protoApiResult)) != null) {
                messageObtainMessage.sendToTarget();
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
    public final void onApiSuccess(ProtoApiResult protoApiResult, int i, boolean z) {
        long size;
        Message messageObtainMessage;
        Handler handler;
        Message messageObtainMessage2;
        C2222371ByV c2222371ByV;
        C01GW c01gw = C20340414iQ.LIZ;
        C20340414iQ.LIZIZ(new AwS578S0100000_34(protoApiResult, 139));
        ((CopyOnWriteArraySet) this.LIZ.LJIIJJI).remove(Integer.valueOf(i));
        if (!this.LIZ.LJIIJ(protoApiResult.dimension)) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onApiSuccess, but checkDimensionValid false");
            return;
        }
        if (!this.LIZ.LJIILIIL(protoApiResult.isFirst)) {
            this.LIZ.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onApiSuccess, but checkFirstMessageValid false");
            return;
        }
        C2222141By8 c2222141By8 = this.LIZ;
        if (!c2222141By8.LJJ && (c2222371ByV = c2222141By8.LJI) != null && c2222371ByV.LIZ) {
            c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "isStarted = false, resetCursor = true");
            return;
        }
        c2222141By8.LJFF = 0;
        c2222141By8.LJIIIZ = protoApiResult.cursor;
        C2222141By8 c2222141By82 = this.LIZ;
        long j = protoApiResult.fetchInterval;
        c2222141By82.LIZ.LIZ.context().getClass();
        c2222141By82.LJII = j;
        this.LIZ.LJIIIIZZ = protoApiResult.now;
        List<IMessage> list = protoApiResult.messages;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onApiSuccess, cursor: ");
        sbLIZ.append(this.LIZ.LJIIIZ);
        sbLIZ.append(", fetch_interval: ");
        sbLIZ.append(this.LIZ.LJII);
        sbLIZ.append(", timestamp: ");
        sbLIZ.append(this.LIZ.LJIIIIZZ);
        sbLIZ.append(", size: ");
        sbLIZ.append(size);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler2 = this.LIZ.LJIJ;
        if (handler2 != null) {
            C786410Ut5.LJJZZIII(handler2, new ARunnableS103S0200000_34(this, protoApiResult, 33));
        }
        long j2 = 1000;
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
            C2222141By8 c2222141By83 = this.LIZ;
            if (c2222141By83.LJII > 0) {
                j2 = c2222141By83.LJII;
            }
            MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZ.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("call api after ");
            sbLIZ2.append(j2);
            messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
            Handler handler3 = this.LIZ.LJIJI;
            if (handler3 != null) {
                C786410Ut5.LJLJJI(113, j2, handler3);
            }
        } else if (i == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
            C2222141By8 c2222141By84 = this.LIZ;
            int i2 = protoApiResult.fetchType;
            Map<String, String> map = protoApiResult.routeParams;
            MessageMonitor messageMonitorLIZIZ3 = c2222141By84.LIZ.LIZ.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onStrategyDetermined, fetchType: ");
            sbLIZ3.append(i2);
            sbLIZ3.append(", isStarted: ");
            sbLIZ3.append(c2222141By84.LJJ);
            messageMonitorLIZIZ3.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ3));
            if (c2222141By84.LJJ) {
                if (MessageApiConstant.FetchType.WEBSOCKET_REUSE == i2) {
                    c2222141By84.LJIL(EnumC2222181ByC.WS_CONNECTING);
                    Handler handler4 = c2222141By84.LJIJ;
                    if (handler4 != null && (messageObtainMessage2 = handler4.obtainMessage(105, map)) != null) {
                        messageObtainMessage2.sendToTarget();
                    }
                    Handler handler5 = c2222141By84.LJIJI;
                    if (handler5 != null && (messageObtainMessage = handler5.obtainMessage(113)) != null && (handler = c2222141By84.LJIJI) != null) {
                        C786410Ut5.LJLJLJ(handler, messageObtainMessage, 1000L);
                    }
                } else {
                    c2222141By84.LJIL(EnumC2222181ByC.HTTP);
                    c2222141By84.LJIJJLI();
                }
            }
        } else {
            this.LIZ.LJIJJLI();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onImFetchSucceeded();
        }
    }
}
