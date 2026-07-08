package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageWsReuseTimeoutSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.vesdk.VEEditor;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageID;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.1D12, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D12 implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            case 2:
                return handleMessage$2(this, message);
            case 3:
                return handleMessage$3(this, message);
            case 4:
                return handleMessage$4(this, message);
            case 5:
                return handleMessage$5(this, message);
            case 6:
                return handleMessage$6(this, message);
            case 7:
                return handleMessage$7(this, message);
            default:
                return false;
        }
    }

    public C1D12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(C1D12 c1d12, Message message) {
        if (message.what == 100) {
            C1DOT c1dot = (C1DOT) c1d12.l0;
            Iterator it2 = ((ArrayList) c1dot.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1464120oCg) it2.next()).LIZ(c1dot.LIZIZ().LLJLLIL.getCurPosition());
            }
            if (((C1DOT) c1d12.l0).LIZIZ().LJIL() == VEEditor.VEState.STARTED) {
                C786410Ut5.LJLJJI(100, 100L, ((C1DOT) c1d12.l0).LIZJ());
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$1(C1D12 c1d12, Message message) {
        C2222011Bxv c2222011Bxv = (C2222011Bxv) c1d12.l0;
        c2222011Bxv.getClass();
        int i = message.what;
        if (i != 212) {
            if (i == 213) {
                ((CopyOnWriteArrayList) c2222011Bxv.LJFF).clear();
                c2222011Bxv.LIZIZ.LJII.LIZIZ();
                return true;
            }
            return true;
        }
        c2222011Bxv.LIZIZ();
        return true;
    }

    public static final boolean handleMessage$2(C1D12 c1d12, Message message) throws Exception {
        Handler handler;
        Message messageObtainMessage;
        C2222031Bxx c2222031Bxx = (C2222031Bxx) c1d12.l0;
        c2222031Bxx.getClass();
        if (message.what == 251) {
            for (IMessage iMessage : (List) HandlerHook.getMessageObj(message.obj)) {
                c2222031Bxx.LIZIZ.LJIIJ(iMessage);
                if (iMessage.consumedMessageSEI()) {
                    c2222031Bxx.LIZ.LIZIZ().monitorMsgStreamInteractStatus(0, iMessage.getMethodName(), null, iMessage.getDispatchTimeoutMillis(), 0L);
                }
                if (iMessage.getDependRootID() != null && (handler = c2222031Bxx.LIZLLL) != null && (messageObtainMessage = handler.obtainMessage(153, iMessage.getDependRootID())) != null) {
                    messageObtainMessage.sendToTarget();
                }
            }
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$3(C1D12 c1d12, Message message) {
        String str;
        Handler handler;
        Message messageObtainMessage;
        Handler handler2;
        Handler handler3;
        Message messageObtainMessage2;
        Handler handler4;
        C2222031Bxx c2222031Bxx = (C2222031Bxx) c1d12.l0;
        c2222031Bxx.getClass();
        switch (message.what) {
            case 151:
                MessageSEI messageSEI = (MessageSEI) HandlerHook.getMessageObj(message.obj);
                ArrayList<MessageID> arrayList = new ArrayList();
                for (IMessage iMessage : (CopyOnWriteArrayList) c2222031Bxx.LJ) {
                    MessageSEI messageSEI2 = iMessage.getMessageSEI();
                    if (messageSEI2 != null) {
                        if (TextUtils.equals(messageSEI2.uniqueID.messageScene, messageSEI.uniqueID.messageScene) && TextUtils.equals(messageSEI2.uniqueID.primaryID, messageSEI.uniqueID.primaryID)) {
                            MessageMonitor messageMonitorLIZIZ = c2222031Bxx.LIZ.LIZIZ();
                            long j = messageSEI.localTimestamp - messageSEI2.localTimestamp;
                            messageMonitorLIZIZ.monitorMsgStreamInteractDelay(j, j - iMessage.getDispatchTimeoutMillis(), iMessage.getMethodName());
                            iMessage.removeMessageSEI();
                            if (iMessage.getDependID() != null) {
                                for (MessageID messageID : arrayList) {
                                    if (!TextUtils.equals(messageID.primaryID, iMessage.getDependID().primaryID) || !TextUtils.equals(messageID.messageScene, iMessage.getDependID().messageScene)) {
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iMessage);
                                c2222031Bxx.LIZIZ(arrayList2);
                                ((CopyOnWriteArrayList) c2222031Bxx.LJ).remove(iMessage);
                            } else {
                                ArrayList arrayList22 = new ArrayList();
                                arrayList22.add(iMessage);
                                c2222031Bxx.LIZIZ(arrayList22);
                                ((CopyOnWriteArrayList) c2222031Bxx.LJ).remove(iMessage);
                            }
                            c2222031Bxx.LIZ.LIZIZ().log("MessagePortal", "get MessageSEI and match success, message primaryID=" + messageSEI2.uniqueID.primaryID + " messageScene=" + messageSEI2.uniqueID.messageScene + " methodName=" + iMessage.getMethodName());
                            break;
                        } else if (iMessage.getDependRootID() != null) {
                            arrayList.add(iMessage.getDependRootID());
                        }
                    }
                }
                c2222031Bxx.LIZ.LIZIZ().log("MessagePortal", "get MessageSEI and match fail");
                ((CopyOnWriteArrayList) c2222031Bxx.LJFF).add(messageSEI);
                if (messageSEI.dispatchTimeoutMillis > 0 && (handler3 = c2222031Bxx.LIZLLL) != null && (messageObtainMessage2 = handler3.obtainMessage(156, messageSEI)) != null && (handler4 = c2222031Bxx.LIZLLL) != null) {
                    C786410Ut5.LJLJLJ(handler4, messageObtainMessage2, messageSEI.dispatchTimeoutMillis);
                    break;
                }
                break;
            case 152:
                List<IMessage> list = (List) HandlerHook.getMessageObj(message.obj);
                ArrayList arrayList3 = new ArrayList();
                ArrayList<MessageID> arrayList4 = new ArrayList();
                for (IMessage iMessage2 : (CopyOnWriteArrayList) c2222031Bxx.LJ) {
                    if (iMessage2.getDependRootID() != null) {
                        arrayList4.add(iMessage2.getDependRootID());
                    }
                }
                for (IMessage iMessage3 : list) {
                    Iterator it2 = ((CopyOnWriteArrayList) c2222031Bxx.LJFF).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            MessageSEI messageSEI3 = (MessageSEI) it2.next();
                            MessageSEI messageSEI4 = iMessage3.getMessageSEI();
                            if (messageSEI4 != null && TextUtils.equals(messageSEI4.uniqueID.messageScene, messageSEI3.uniqueID.messageScene) && TextUtils.equals(messageSEI4.uniqueID.primaryID, messageSEI3.uniqueID.primaryID)) {
                                MessageMonitor messageMonitorLIZIZ2 = c2222031Bxx.LIZ.LIZIZ();
                                long j2 = messageSEI3.localTimestamp - messageSEI4.localTimestamp;
                                messageMonitorLIZIZ2.monitorMsgStreamInteractDelay(j2, j2 - iMessage3.getDispatchTimeoutMillis(), iMessage3.getMethodName());
                                iMessage3.removeMessageSEI();
                                ((CopyOnWriteArrayList) c2222031Bxx.LJFF).remove(messageSEI3);
                            }
                        }
                    }
                    if (iMessage3.getDependID() != null) {
                        boolean z = false;
                        for (MessageID messageID2 : arrayList4) {
                            if (TextUtils.equals(messageID2.messageScene, iMessage3.getDependID().messageScene) && TextUtils.equals(messageID2.primaryID, iMessage3.getDependID().primaryID)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            iMessage3.removeDependID();
                        }
                    }
                    if (iMessage3.getMessageSEI() == null && iMessage3.getDependID() == null) {
                        arrayList3.add(iMessage3);
                    } else {
                        c2222031Bxx.LIZ.LIZIZ().log("MessagePortal", "onFeatureMessage match fail, message methodName=" + iMessage3.getMethodName());
                        ((CopyOnWriteArrayList) c2222031Bxx.LJ).add(iMessage3);
                        if (iMessage3.getDispatchTimeoutMillis() > 0 && (handler = c2222031Bxx.LIZLLL) != null && (messageObtainMessage = handler.obtainMessage(154, Long.valueOf(iMessage3.getMessageId()))) != null && (handler2 = c2222031Bxx.LIZLLL) != null) {
                            C786410Ut5.LJLJLJ(handler2, messageObtainMessage, iMessage3.getDispatchTimeoutMillis());
                        }
                        if (iMessage3.getDependRootID() != null) {
                            arrayList4.add(iMessage3.getDependRootID());
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    c2222031Bxx.LIZIZ(arrayList3);
                }
                break;
            case 153:
                MessageID messageID3 = (MessageID) HandlerHook.getMessageObj(message.obj);
                if (messageID3 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (IMessage iMessage4 : (CopyOnWriteArrayList) c2222031Bxx.LJ) {
                        if (iMessage4.getDependID() != null && TextUtils.equals(iMessage4.getDependID().messageScene, messageID3.messageScene) && TextUtils.equals(iMessage4.getDependID().primaryID, messageID3.primaryID)) {
                            iMessage4.removeDependID();
                            if (iMessage4.getMessageSEI() == null) {
                                arrayList5.add(iMessage4);
                                ((CopyOnWriteArrayList) c2222031Bxx.LJ).remove(iMessage4);
                            }
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        c2222031Bxx.LIZIZ(arrayList5);
                    }
                }
                break;
            case 154:
                long jLongValue = ((Long) HandlerHook.getMessageObj(message.obj)).longValue();
                for (IMessage iMessage5 : (CopyOnWriteArrayList) c2222031Bxx.LJ) {
                    if (iMessage5.getMessageSEI() != null && iMessage5.getMessageId() == jLongValue) {
                        c2222031Bxx.LIZ.LIZIZ().monitorMsgStreamInteractStatus(1, iMessage5.getMethodName(), null, iMessage5.getDispatchTimeoutMillis(), 0L);
                        MessageSEI messageSEI5 = iMessage5.getMessageSEI();
                        messageSEI5.dispatchTimeoutMillis = iMessage5.getDispatchTimeoutMillis();
                        ((CopyOnWriteArrayList) c2222031Bxx.LJI).add(messageSEI5);
                        if (((CopyOnWriteArrayList) c2222031Bxx.LJI).size() > 5) {
                            ListProtector.remove(c2222031Bxx.LJI, 0);
                        }
                        iMessage5.removeMessageSEI();
                        if (iMessage5.getDependID() == null) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(iMessage5);
                            c2222031Bxx.LIZIZ(arrayList6);
                            ((CopyOnWriteArrayList) c2222031Bxx.LJ).remove(iMessage5);
                        }
                    }
                }
                break;
            case 156:
                MessageSEI messageSEI6 = (MessageSEI) HandlerHook.getMessageObj(message.obj);
                long j3 = 0;
                long j4 = 0;
                for (MessageSEI messageSEI7 : (CopyOnWriteArrayList) c2222031Bxx.LJI) {
                    if (TextUtils.equals(messageSEI7.uniqueID.messageScene, messageSEI6.uniqueID.messageScene) && TextUtils.equals(messageSEI7.uniqueID.primaryID, messageSEI6.uniqueID.primaryID)) {
                        j3 = messageSEI6.localTimestamp - messageSEI7.localTimestamp;
                        j4 = j3 - messageSEI7.dispatchTimeoutMillis;
                        ((CopyOnWriteArrayList) c2222031Bxx.LJI).remove(messageSEI7);
                    }
                }
                MessageMonitor messageMonitorLIZIZ3 = c2222031Bxx.LIZ.LIZIZ();
                MessageID messageID4 = messageSEI6.uniqueID;
                if (messageID4 != null) {
                    str = messageID4.messageScene;
                } else {
                    str = null;
                }
                messageMonitorLIZIZ3.monitorMsgStreamInteractStatus(2, null, str, j3, j4);
                ((CopyOnWriteArrayList) c2222031Bxx.LJFF).remove(messageSEI6);
                break;
        }
        return true;
    }

    public static final boolean handleMessage$4(C1D12 c1d12, Message message) throws Exception {
        C2222021Bxw c2222021Bxw = (C2222021Bxw) c1d12.l0;
        c2222021Bxw.getClass();
        int i = 0;
        switch (message.what) {
            case 211:
                List list = (List) HandlerHook.getMessageObj(message.obj);
                MessageMonitor messageMonitorLIZIZ = c2222021Bxw.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("main thread receive message list, size is ");
                sbLIZ.append(list.size());
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                Iterator it2 = list.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C2222081By2 c2222081By2 = null;
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        int i4 = i2 + 1;
                        if (i2 >= 0) {
                            IMessage iMessage = (IMessage) next;
                            if (c2222021Bxw.LIZIZ.LJII.onMessage(iMessage)) {
                                C01GW c01gw = C20340414iQ.LIZ;
                                C20340414iQ.LIZJ(new AwS578S0100000_34(iMessage, 120));
                            } else {
                                C01GW c01gw2 = C20340414iQ.LIZ;
                                C20340414iQ.LIZJ(new AwS578S0100000_34(iMessage, 121));
                                if (c2222021Bxw.LIZIZ.LJFF(iMessage)) {
                                    iMessage.getExtraParams().put("front_msg_size", Integer.valueOf(i3));
                                    iMessage.getExtraParams().put("is_direct_dispatch", 1);
                                    c2222021Bxw.LIZIZ.LJIIJ(iMessage);
                                    i3++;
                                } else {
                                    iMessage.getExtraParams().put("window_count_enqueue", Integer.valueOf(c2222021Bxw.LIZLLL));
                                    iMessage.getExtraParams().put("is_direct_dispatch", 0);
                                    iMessage.getExtraParams().put("front_msg_size", Integer.valueOf(((CopyOnWriteArrayList) c2222021Bxw.LJFF).size()));
                                    ((CopyOnWriteArrayList) c2222021Bxw.LJFF).add(iMessage);
                                }
                            }
                            i2 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        C2222081By2 c2222081By22 = c2222021Bxw.LJII;
                        if (c2222081By22 == null) {
                            c2222081By22 = null;
                        }
                        int iLIZLLL = (int) (1000 / c2222081By22.LIZLLL());
                        MessageMonitor messageMonitorLIZIZ2 = c2222021Bxw.LIZ.LIZIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("expect dispatch count: ");
                        sbLIZ2.append(iLIZLLL);
                        messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                        c2222021Bxw.LIZJ = ((CopyOnWriteArrayList) c2222021Bxw.LJFF).size() / iLIZLLL;
                        C2222081By2 c2222081By23 = c2222021Bxw.LJII;
                        if (c2222081By23 == null) {
                            c2222081By23 = null;
                        }
                        int iLIZJ = c2222081By23.LIZJ();
                        int i5 = c2222021Bxw.LIZJ;
                        if (i5 >= iLIZJ) {
                            iLIZJ = i5;
                        }
                        c2222021Bxw.LIZJ = iLIZJ;
                        MessageMonitor messageMonitorLIZIZ3 = c2222021Bxw.LIZ.LIZIZ();
                        int i6 = c2222021Bxw.LIZJ;
                        int size = ((CopyOnWriteArrayList) c2222021Bxw.LJFF).size();
                        C2222081By2 c2222081By24 = c2222021Bxw.LJII;
                        if (c2222081By24 != null) {
                            c2222081By2 = c2222081By24;
                        }
                        messageMonitorLIZIZ3.monitorMsgDispatchSize(i6, size, 1000L, c2222081By2.LIZLLL(), c2222021Bxw.LIZ.context().LIZIZ, c2222021Bxw.LIZ.context().LIZJ, 1);
                        MessageMonitor messageMonitorLIZIZ4 = c2222021Bxw.LIZ.LIZIZ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("next time dispatch size: ");
                        sbLIZ3.append(c2222021Bxw.LIZJ);
                        messageMonitorLIZIZ4.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ3));
                        c2222021Bxw.LIZIZ(false);
                        return true;
                    }
                }
                break;
            case 212:
                c2222021Bxw.LIZLLL++;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                MessageMonitor messageMonitorLIZIZ5 = c2222021Bxw.LIZ.LIZIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("before dispatch, message queue size is ");
                sbLIZ4.append(((CopyOnWriteArrayList) c2222021Bxw.LJFF).size());
                messageMonitorLIZIZ5.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ4));
                int size2 = ((CopyOnWriteArrayList) c2222021Bxw.LJFF).size();
                int size3 = c2222021Bxw.LIZJ;
                if (size2 < size3) {
                    size3 = ((CopyOnWriteArrayList) c2222021Bxw.LJFF).size();
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    synchronized (c2222021Bxw.LJI) {
                        try {
                            arrayList.addAll(((CopyOnWriteArrayList) c2222021Bxw.LJFF).subList(0, size3));
                        } finally {
                        }
                    }
                    int iMin = Math.min(c2222021Bxw.LIZIZ.LJIIIIZZ().LIZ(arrayList, c2222021Bxw.LIZIZ), arrayList.size());
                    try {
                        synchronized (c2222021Bxw.LJI) {
                            try {
                                List<IMessage> list2 = c2222021Bxw.LJFF;
                                List<IMessage> listSubList = ((CopyOnWriteArrayList) list2).subList(0, Math.min(iMin, ((CopyOnWriteArrayList) list2).size()));
                                C2222271ByL c2222271ByLLIZLLL = c2222021Bxw.LIZ.LIZLLL();
                                List<IMessage> list3 = c2222021Bxw.LJFF;
                                Iterator it3 = ((CopyOnWriteArrayList) c2222271ByLLIZLLL.LIZ).iterator();
                                while (it3.hasNext()) {
                                    ((EventListener) it3.next()).onEnqueueMessage(list3, listSubList);
                                }
                                listSubList.clear();
                            } finally {
                            }
                        }
                        i = iMin;
                    } catch (Exception e) {
                        e = e;
                        i = iMin;
                        TryCatchGuardChecker.doCheck(e);
                        MessageMonitor messageMonitorLIZIZ6 = c2222021Bxw.LIZ.LIZIZ();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("messageList clear error:");
                        sbLIZ5.append(e);
                        messageMonitorLIZIZ6.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ5));
                        if (C20338614i8.LIZ) {
                            throw e;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                MessageMonitor messageMonitorLIZIZ7 = c2222021Bxw.LIZ.LIZIZ();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("after dispatch, message queue size is ");
                sbLIZ6.append(((CopyOnWriteArrayList) c2222021Bxw.LJFF).size());
                messageMonitorLIZIZ7.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ6));
                c2222021Bxw.LIZ.LIZJ().LJIIIIZZ(((CopyOnWriteArrayList) c2222021Bxw.LJFF).size());
                if (((CopyOnWriteArrayList) c2222021Bxw.LJFF).size() > 0) {
                    c2222021Bxw.LIZIZ(true);
                }
                C01GW c01gw3 = C20340414iQ.LIZ;
                C20340414iQ.LIZIZ(new AwS578S0100000_34(c2222021Bxw, 122));
                c2222021Bxw.LIZ.LIZIZ().monitorMsgDispatchListDelay(SystemClock.elapsedRealtime() - jElapsedRealtime, size3, i, ((CopyOnWriteArrayList) c2222021Bxw.LJFF).size(), 1);
                return true;
            case 213:
                ((CopyOnWriteArrayList) c2222021Bxw.LJFF).clear();
                c2222021Bxw.LIZIZ.LJII.LIZIZ();
                return true;
            default:
                return true;
        }
    }

    public static final boolean handleMessage$5(C1D12 c1d12, Message message) {
        Handler handler;
        long jWsImEnterRoomTimeout;
        Message messageObtainMessage;
        Handler handler2;
        Object objValueOf;
        Handler handler3;
        C2222141By8 c2222141By8 = (C2222141By8) c1d12.l0;
        MessageMonitor messageMonitorLIZIZ = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleWorkMessage start what: ");
        sbLIZ.append(message.what);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        C2222081By2 c2222081By2 = null;
        boolean z = false;
        switch (message.what) {
            case 101:
                MessageMonitor messageMonitorLIZIZ2 = c2222141By8.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("start message, hasStartFetchMessage: ");
                sbLIZ2.append(false);
                messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
                int i = C2222201ByE.LIZ[c2222141By8.LIZJ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            c2222141By8.LJIL(EnumC2222181ByC.WS_CONNECTING);
                            Handler handler4 = c2222141By8.LJIJ;
                            if (handler4 != null) {
                                C786410Ut5.LJLILLLLZI(handler4, 105);
                            }
                            Handler handler5 = c2222141By8.LJIJI;
                            if (handler5 != null) {
                                C786410Ut5.LJLILLLLZI(handler5, 113);
                            }
                        } else {
                            c2222141By8.LJJIIZ++;
                            Handler handler6 = c2222141By8.LJIJ;
                            if (handler6 != null && !handler6.hasMessages(114) && (handler3 = c2222141By8.LJIJ) != null) {
                                C786410Ut5.LJLILLLLZI(handler3, 114);
                            }
                            Handler handler7 = c2222141By8.LJIJI;
                            if (handler7 != null) {
                                C786410Ut5.LJLJJI(113, 1000L, handler7);
                            }
                        }
                    } else {
                        Handler handler8 = c2222141By8.LJIJI;
                        if (handler8 != null) {
                            C786410Ut5.LJLILLLLZI(handler8, 113);
                        }
                        Handler handler9 = c2222141By8.LJIJ;
                        if (handler9 != null && !handler9.hasMessages(106)) {
                            C2222081By2 c2222081By22 = c2222141By8.LJJIJIIJI;
                            if (c2222081By22 == null) {
                                c2222081By22 = null;
                            }
                            c2222141By8.LJIJ(c2222081By22.LJ());
                        }
                    }
                } else {
                    c2222141By8.LJIL(EnumC2222181ByC.WS_CONNECTING);
                    Handler handler10 = c2222141By8.LJIJ;
                    if (handler10 != null) {
                        C786410Ut5.LJLILLLLZI(handler10, 105);
                    }
                    Handler handler11 = c2222141By8.LJIJI;
                    if (handler11 != null) {
                        C786410Ut5.LJLILLLLZI(handler11, 113);
                    }
                }
                c2222141By8.LIZLLL.onStartMessage();
                c2222141By8.LIZ.LIZ.LJIIIIZZ().LJIJ.put("message_size_before_dispatch", Integer.valueOf(((CopyOnWriteArrayList) c2222141By8.LJJIIZI).size()));
                c2222141By8.LIZ.LIZ.LJIIIIZZ().LJIJ.put("not_decode_size_before_dispatch", Integer.valueOf(((CopyOnWriteArrayList) c2222141By8.LJJIJ).size()));
                c2222141By8.LJJ = true;
                C2222081By2 c2222081By23 = c2222141By8.LJJIJIIJI;
                if (c2222081By23 == null) {
                    c2222081By23 = null;
                }
                C2221741BxU c2221741BxU = c2222081By23.LIZ.LJIILLIIL.LIZ;
                if (c2221741BxU.LIZ) {
                    c2222141By8.LIZ.LIZ.LJ().LIZIZ(new C2222331ByR(c2221741BxU.LIZJ, c2221741BxU.LIZIZ));
                }
                C2222081By2 c2222081By24 = c2222141By8.LJJIJIIJI;
                if (c2222081By24 != null) {
                    c2222081By2 = c2222081By24;
                }
                C2221731BxT c2221731BxT = c2222081By2.LIZ.LJIILLIIL.LIZIZ;
                if (c2221731BxT.LIZ) {
                    c2222141By8.LIZ.LIZ.LJ().LIZIZ(new C2222311ByP(c2221731BxT.LIZJ, c2221731BxT.LIZIZ));
                }
                break;
            case 102:
                C2222371ByV c2222371ByV = (C2222371ByV) HandlerHook.getMessageObj(message.obj);
                c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "stop message manager");
                c2222141By8.LIZIZ();
                c2222141By8.LJFF();
                Handler handler12 = c2222141By8.LJIJI;
                if (handler12 != null) {
                    handler12.removeMessages(109);
                }
                c2222141By8.LIZLLL.onStopMessage(c2222371ByV.LIZ);
                if (c2222371ByV.LIZ) {
                    c2222141By8.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
                    c2222141By8.LJIL = false;
                    c2222141By8.LJIJJLI = 0L;
                }
                if (c2222371ByV.LIZIZ) {
                    c2222141By8.LJIJJ(c2222371ByV.LIZJ);
                }
                break;
            case 105:
                c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "connectToWebSocketReuse");
                c2222141By8.LJJIIJZLJL++;
                c2222141By8.LIZLLL.connectToWebSocketReuse();
                C2222081By2 c2222081By25 = c2222141By8.LJJIJIIJI;
                if (c2222081By25 != null) {
                    c2222081By2 = c2222081By25;
                }
                c2222141By8.LJIJ(c2222081By2.LJ());
                C2222271ByL c2222271ByLLIZLLL = c2222141By8.LIZ.LIZ.LIZLLL();
                int andIncrement = c2222141By8.LJIIZILJ.getAndIncrement();
                Iterator it2 = ((CopyOnWriteArrayList) c2222271ByLLIZLLL.LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onConnectingWebSocket(andIncrement);
                }
                break;
            case 106:
                c2222141By8.LJJ((String) HandlerHook.getMessageObj(message.obj));
                break;
            case 107:
                PayloadItem payloadItem = (PayloadItem) HandlerHook.getMessageObj(message.obj);
                payloadItem.getExtraParams().put(MessageMonitor.getLiveMessageStageName("deal_raw_msg", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
                c2222141By8.LIZLLL.decodeWebSocketPayload(payloadItem, true);
                break;
            case 108:
                ProtoApiResult protoApiResult = (ProtoApiResult) HandlerHook.getMessageObj(message.obj);
                if (protoApiResult.internalExt != null) {
                    List<IMessage> listLJI = c2222141By8.LIZ.LIZ.LJIIIIZZ().LJIIL.LJI();
                    if (listLJI != null) {
                        objValueOf = Integer.valueOf(listLJI.size());
                    } else {
                        objValueOf = "";
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - MessageMonitor.getExtraParamsTime(protoApiResult.extraParams, "all_time", MessageMonitor.Stage.START);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("queue_length", objValueOf.toString());
                    linkedHashMap.put("client_handle_ms", String.valueOf(jElapsedRealtime));
                    IMessageWsClient iMessageWsClient = c2222141By8.LIZLLL;
                    byte[] bytes = protoApiResult.internalExt.getBytes(Charsets.UTF_8);
                    long j = protoApiResult.logId;
                    iMessageWsClient.sendWebSocketMessage("none", "ack", bytes, j, j, linkedHashMap);
                }
                break;
            case 110:
                long jIncrementAndGet = c2222141By8.LJIILJJIL.incrementAndGet();
                c2222141By8.LJIILLIIL = String.valueOf(jIncrementAndGet);
                c2222141By8.LJIILL = System.currentTimeMillis();
                if (c2222141By8.LJIJJLI != 0) {
                    z = true;
                }
                MessageMonitor messageMonitorLIZIZ3 = c2222141By8.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("send heartbeat packet: seqId is ");
                sbLIZ3.append(c2222141By8.LJIILLIIL);
                sbLIZ3.append(", needDimensionInfo: ");
                sbLIZ3.append(z);
                messageMonitorLIZIZ3.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ3));
                c2222141By8.LIZLLL.sendHeartBeatMsg(jIncrementAndGet, jIncrementAndGet, jIncrementAndGet, z);
                c2222141By8.LJIJI();
                break;
            case 111:
                PayloadItem payloadItem2 = (PayloadItem) HandlerHook.getMessageObj(message.obj);
                payloadItem2.getExtraParams().put(MessageMonitor.getLiveMessageStageName("deal_raw_msg", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
                c2222141By8.LIZLLL.decodeHostWebSocketPayload(payloadItem2, true);
                break;
            case 114:
                MessageMonitor messageMonitorLIZIZ4 = c2222141By8.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("start im enter room, cursor: ");
                sbLIZ4.append(c2222141By8.LJIIIZ);
                messageMonitorLIZIZ4.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ4));
                long jNextLong = AbstractC19994813Le.Default.nextLong(1L, Long.MAX_VALUE);
                c2222141By8.LJIJJLI = jNextLong;
                c2222141By8.LJJI = System.currentTimeMillis();
                c2222141By8.LIZLLL.sendImEnterRoomMsg(c2222141By8.LJIIIZ, jNextLong, jNextLong, jNextLong);
                C2222081By2 c2222081By26 = c2222141By8.LJJIJIIJI;
                if (c2222081By26 != null) {
                    c2222081By2 = c2222081By26;
                }
                if (c2222081By2.LIZLLL == null) {
                    C2222241ByI c2222241ByI = c2222081By2.LIZIZ.LIZIZ;
                    if (c2222241ByI == null) {
                        jWsImEnterRoomTimeout = 3000;
                    } else {
                        jWsImEnterRoomTimeout = c2222241ByI.LIZJ;
                    }
                } else {
                    jWsImEnterRoomTimeout = LiveMessageWsReuseTimeoutSetting.INSTANCE.wsImEnterRoomTimeout();
                }
                c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "trigger in enter room timer");
                c2222141By8.LJFF();
                Handler handler13 = c2222141By8.LJIJ;
                if (handler13 != null && (messageObtainMessage = handler13.obtainMessage(115)) != null && (handler2 = c2222141By8.LJIJ) != null) {
                    C786410Ut5.LJLJLJ(handler2, messageObtainMessage, jWsImEnterRoomTimeout);
                }
                break;
            case 115:
                c2222141By8.LJJ("im_enter_room_timeout");
                c2222141By8.LJJII++;
                c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "im enter room timeout");
                break;
            case 116:
                MessageMonitor messageMonitorLIZIZ5 = c2222141By8.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("MSG_WHAT_WS_CONNECTED, isStarted: ");
                sbLIZ5.append(c2222141By8.LJJ);
                messageMonitorLIZIZ5.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ5));
                if (c2222141By8.LJJ) {
                    c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onWebSocketConnected, isStarted = true, sendInRoomEnterMessage");
                    Handler handler14 = c2222141By8.LJIJ;
                    if (handler14 != null && !handler14.hasMessages(114) && (handler = c2222141By8.LJIJ) != null) {
                        C786410Ut5.LJLILLLLZI(handler, 114);
                    }
                    Handler handler15 = c2222141By8.LJIJI;
                    if (handler15 != null) {
                        C786410Ut5.LJLJJI(113, 1000L, handler15);
                    }
                    c2222141By8.LJJIIZ = 1;
                }
                break;
            case 120:
                c2222141By8.LJIL(EnumC2222181ByC.HTTP);
                c2222141By8.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "release delay disconnect");
                c2222141By8.LJ();
                c2222141By8.LIZLLL();
                c2222141By8.LIZIZ();
                c2222141By8.LJFF();
                c2222141By8.LIZLLL.disconnectFromWebSocket("release_too_long");
                break;
            case 122:
                MessageMonitor messageMonitorLIZIZ6 = c2222141By8.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("handle preload data, apiResultList: ");
                sbLIZ6.append(((CopyOnWriteArrayList) c2222141By8.LJJIJ).size());
                sbLIZ6.append(", messageList: ");
                sbLIZ6.append(c2222141By8.LJJIIZI);
                messageMonitorLIZIZ6.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ6));
                for (ProtoApiResult protoApiResult2 : (CopyOnWriteArrayList) c2222141By8.LJJIJ) {
                    c2222141By8.LIZLLL.decodeProtoApiResult(protoApiResult2);
                    c2222141By8.LIZ.LIZ.LJIIIIZZ().LJII(protoApiResult2.delayTimeBeforeDispatch, protoApiResult2.messages);
                }
                ((CopyOnWriteArrayList) c2222141By8.LJJIJ).clear();
                if (!((CopyOnWriteArrayList) c2222141By8.LJJIIZI).isEmpty()) {
                    c2222141By8.LIZ.LIZ.LJIIIIZZ().LJII(0L, c2222141By8.LJJIIZI);
                }
                ((CopyOnWriteArrayList) c2222141By8.LJJIIZI).clear();
                break;
        }
        MessageMonitor messageMonitorLIZIZ7 = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("handleWorkMessage end what: ");
        sbLIZ7.append(message.what);
        messageMonitorLIZIZ7.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ7));
        return true;
    }

    public static final boolean handleMessage$6(C1D12 c1d12, Message message) {
        C2222141By8 c2222141By8 = (C2222141By8) c1d12.l0;
        MessageMonitor messageMonitorLIZIZ = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMessageRequest start what: ");
        sbLIZ.append(message.what);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        int i = message.what;
        if (i != 109) {
            if (i == 113) {
                c2222141By8.LJIIZILJ(MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE);
            }
        } else {
            c2222141By8.LJIIZILJ(MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE);
        }
        MessageMonitor messageMonitorLIZIZ2 = c2222141By8.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleMessageRequest end what: ");
        sbLIZ2.append(message.what);
        messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final boolean handleMessage$7(C1D12 c1d12, Message message) {
        Message messageObtainMessage;
        Handler handler;
        boolean z;
        C2222161ByA c2222161ByA = (C2222161ByA) c1d12.l0;
        c2222161ByA.getClass();
        byte[] bytes = null;
        C2222081By2 c2222081By2 = null;
        switch (message.what) {
            case 101:
                c2222161ByA.LIZ.LIZ.LIZIZ().log("MessagePortal", "start message manager");
                c2222161ByA.LIZJ.onStartMessage();
                c2222161ByA.LJFF(MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE);
                return true;
            case 102:
            case 104:
                c2222161ByA.LIZ.LIZ.LIZIZ().log("MessagePortal", "stop message manager");
                c2222161ByA.LIZIZ();
                Handler handler2 = c2222161ByA.LJIILLIIL;
                if (handler2 != null) {
                    handler2.removeMessages(109);
                }
                IMessageWsClient iMessageWsClient = c2222161ByA.LIZJ;
                if (message.what == 104) {
                    z = true;
                } else {
                    z = false;
                }
                iMessageWsClient.onStopMessage(z);
                c2222161ByA.LIZJ.disconnectFromWebSocket("stop_message");
                if (message.what == 104) {
                    c2222161ByA.LJII = CardStruct.IStatusCode.DEFAULT;
                    return true;
                }
                return true;
            case 103:
            case 112:
            default:
                return true;
            case 105:
                c2222161ByA.LIZJ.connectToWebSocket((Map) HandlerHook.getMessageObj(message.obj), c2222161ByA.LJII);
                C2222081By2 c2222081By22 = c2222161ByA.LJIJ;
                if (c2222081By22 != null) {
                    c2222081By2 = c2222081By22;
                }
                long jLJ = c2222081By2.LJ();
                c2222161ByA.LIZ.LIZ.LIZIZ().log("MessagePortal", "trigger fallback timer");
                c2222161ByA.LIZLLL();
                Handler handler3 = c2222161ByA.LJIILLIIL;
                if (handler3 != null && (messageObtainMessage = handler3.obtainMessage(106, "ws_connect_timeout")) != null && (handler = c2222161ByA.LJIILLIIL) != null) {
                    C786410Ut5.LJLJLJ(handler, messageObtainMessage, jLJ);
                }
                C2222271ByL c2222271ByLLIZLLL = c2222161ByA.LIZ.LIZ.LIZLLL();
                int andIncrement = c2222161ByA.LJIILL.getAndIncrement();
                Iterator it2 = ((CopyOnWriteArrayList) c2222271ByLLIZLLL.LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onConnectingWebSocket(andIncrement);
                }
                return true;
            case 106:
                c2222161ByA.LJIIZILJ((String) HandlerHook.getMessageObj(message.obj));
                return true;
            case 107:
                c2222161ByA.LIZJ.decodeWebSocketPayload((PayloadItem) HandlerHook.getMessageObj(message.obj), true);
                return true;
            case 108:
                ProtoApiResult protoApiResult = (ProtoApiResult) HandlerHook.getMessageObj(message.obj);
                String str = protoApiResult.internalExt;
                if (str != null) {
                    IMessageWsClient iMessageWsClient2 = c2222161ByA.LIZJ;
                    byte[] bytes2 = str.getBytes(Charsets.UTF_8);
                    long j = protoApiResult.logId;
                    iMessageWsClient2.sendWebSocketMessage("none", "ack", bytes2, j, j, null);
                    return true;
                }
                return true;
            case 109:
                c2222161ByA.LJFF(MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE);
                return true;
            case 110:
                long jIncrementAndGet = c2222161ByA.LJIIL.incrementAndGet();
                c2222161ByA.LJIILJJIL = String.valueOf(jIncrementAndGet);
                c2222161ByA.LJIILIIL = System.currentTimeMillis();
                MessageMonitor messageMonitorLIZIZ = c2222161ByA.LIZ.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("send heartbeat packet: seqId is ");
                sbLIZ.append(c2222161ByA.LJIILJJIL);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                IMessageWsClient iMessageWsClient3 = c2222161ByA.LIZJ;
                String str2 = c2222161ByA.LJIILJJIL;
                if (str2 != null) {
                    bytes = str2.getBytes(Charsets.UTF_8);
                }
                iMessageWsClient3.sendWebSocketMessage("none", "hb", bytes, jIncrementAndGet, jIncrementAndGet, null);
                c2222161ByA.LJIIIIZZ();
                return true;
            case 111:
                c2222161ByA.LIZJ.decodeHostWebSocketPayload((PayloadItem) HandlerHook.getMessageObj(message.obj), true);
                return true;
            case 113:
                c2222161ByA.LJFF(MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE);
                return true;
        }
    }
}
