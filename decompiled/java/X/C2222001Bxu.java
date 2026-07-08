package X;

import Y.ARunnableS134S0100000_34;
import Y.ARunnableS67S0300000_34;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchSettingAnchor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.MessageMonitorExtKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageTrackTimeInfo;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS160S0400000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222001Bxu implements InterfaceC2222251ByJ {
    public final InterfaceC2222101By4 LIZ;
    public InterfaceC2222291ByN LIZJ;
    public C2222061By0 LIZLLL;
    public final C2222071By1 LJII;
    public IMessageWsClient LJIIIIZZ;
    public long LJIIJ;
    public int LJIIJJI;
    public InterfaceC2222281ByM LJIIL;
    public final C2222031Bxx LJIILIIL;
    public boolean LJIILJJIL;
    public BPEAHandler LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJI;
    public C2222081By2 LJIJJLI;
    public int LIZIZ = 512;
    public final List<IInterceptor> LJ = new CopyOnWriteArrayList();
    public final SparseArray<Set<OnMessageListener>> LJFF = new SparseArray<>();
    public final SparseArray<Set<OnIMMessageListener>> LJI = new SparseArray<>();
    public boolean LJIIIZ = true;
    public final ConcurrentHashMap<String, Object> LJIJ = new ConcurrentHashMap<>();
    public final SparseArray<LinkedList<Pair<IMessage, Long>>> LJIJJ = new SparseArray<>();
    public C2222231ByH LJIL = new C2222231ByH();

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        this.LJIJI = false;
        this.LJIIL.onRelease();
        this.LJIILIIL.onRelease();
        ((CopyOnWriteArrayList) this.LJ).clear();
        this.LJFF.clear();
        this.LJII.LIZIZ();
        this.LJI.clear();
        this.LJIIJ = 0L;
        BPEAHandler bPEAHandler = this.LJIILL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LJIJ.clear();
        this.LJIJJ.clear();
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        this.LJIJI = true;
        this.LJIIJ = SystemClock.elapsedRealtime();
        this.LJIIJJI++;
        this.LJIIL.onStart();
        this.LJIILIIL.getClass();
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        this.LJIILL = new BPEAHandler(Looper.getMainLooper());
        this.LJIIL.LIZ();
        this.LJIILIIL.LIZ();
    }

    public final InterfaceC2222291ByN LJIIIIZZ() {
        C2222331ByR c2222331ByR = (C2222331ByR) this.LIZ.LJ().LIZLLL(C2222331ByR.class);
        if (c2222331ByR != null) {
            C2222061By0 c2222061By0 = this.LIZLLL;
            if (c2222061By0 == null) {
                c2222061By0 = new C2222061By0((int) c2222331ByR.LIZIZ, this.LIZ);
            }
            c2222061By0.LIZIZ = (int) c2222331ByR.LIZIZ;
            this.LIZLLL = c2222061By0;
            return c2222061By0;
        }
        InterfaceC2222291ByN interfaceC2222291ByN = this.LIZJ;
        if (interfaceC2222291ByN != null) {
            return interfaceC2222291ByN;
        }
        C2222081By2 c2222081By2 = this.LJIJJLI;
        if (c2222081By2 == null) {
            c2222081By2 = null;
        }
        C2221721BxS c2221721BxS = c2222081By2.LIZLLL;
        int iDispatchLimitDuration = c2221721BxS == null ? c2222081By2.LIZ.LJIIJJI : c2221721BxS.LIZ ? LiveMessageDispatchSettingAnchor.INSTANCE.dispatchLimitDuration() : LiveMessageDispatchSetting.INSTANCE.dispatchLimitDuration();
        InterfaceC2222291ByN c2222061By02 = iDispatchLimitDuration <= 0 ? new InterfaceC2222291ByN() { // from class: X.1By5
            @Override // X.InterfaceC2222291ByN
            public final int LIZ(List<? extends IMessage> list, C2222001Bxu c2222001Bxu) throws Exception {
                ArrayList arrayList = (ArrayList) list;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c2222001Bxu.LJIIJ((IMessage) it2.next());
                }
                return arrayList.size();
            }
        } : new C2222061By0(iDispatchLimitDuration, this.LIZ);
        this.LIZJ = c2222061By02;
        return c2222061By02;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        this.LJIIL.onDestroy();
        this.LJIILIIL.onDestroy();
        ((CopyOnWriteArrayList) this.LJ).clear();
        this.LJFF.clear();
        this.LJI.clear();
        this.LJII.LIZIZ();
        this.LJIIJJI = 0;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        BPEAHandler bPEAHandler = this.LJIILL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LJIJ.clear();
    }

    public C2222001Bxu(InterfaceC2222101By4 interfaceC2222101By4) {
        this.LIZ = interfaceC2222101By4;
        this.LJII = new C2222071By1(this.LIZIZ, interfaceC2222101By4);
        this.LJIIL = new C2222021Bxw(interfaceC2222101By4, this);
        this.LJIILIIL = new C2222031Bxx(interfaceC2222101By4, this);
    }

    public final void LIZLLL(IMessage iMessage) {
        long currentTimeMillis;
        boolean z;
        long jLongValue;
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onPreDispatchMessage(iMessage);
        }
        IMessageWsClient iMessageWsClient = this.LJIIIIZZ;
        if (iMessageWsClient != null) {
            iMessage.setDispatchAtMillis(iMessageWsClient.getCurrentTimeMillis());
        }
        MessageTrackTimeInfo messageTrackTimeInfo = iMessage.getMessageTrackTimeInfo();
        IMessageWsClient iMessageWsClient2 = this.LJIIIIZZ;
        if (iMessageWsClient2 != null) {
            currentTimeMillis = iMessageWsClient2.getCurrentTimeMillis();
        } else {
            currentTimeMillis = 0;
        }
        messageTrackTimeInfo.deliverMessageTime = currentTimeMillis;
        iMessage.getExtraParams().put("dispatch_strategy", Integer.valueOf(this.LJIIL.LIZJ()));
        iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("dispatch_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
        ArrayList arrayList = new ArrayList();
        MessageMonitorExtKt.logDebug(this.LIZ.LIZIZ(), "MessageDispatch", new AwS578S0100000_34(iMessage, 123));
        Iterator it3 = C1697810uHb.LJIIJJI(this.LJI, this.LJFF).iterator();
        boolean z2 = true;
        while (it3.hasNext()) {
            Set set = (Set) ((SparseArray) it3.next()).get(iMessage.getIntType());
            if (set != null && set.size() > 0) {
                z2 = false;
            }
        }
        boolean zContains = this.LJIL.LIZIZ.contains(iMessage.getMethodName());
        if (z2) {
            MessageMonitorExtKt.logDebug(this.LIZ.LIZIZ(), "MessageDispatch", new AwS578S0100000_34(iMessage, 124));
            this.LIZ.LIZIZ().monitorNoListenerMessageConsume(iMessage.getMethodName(), Boolean.valueOf(zContains), SystemClock.elapsedRealtime() - this.LJIIJ);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIIJ;
        C2222231ByH c2222231ByH = this.LJIL;
        int i = c2222231ByH.LJ;
        if (jElapsedRealtime < i) {
            z = true;
        } else {
            z = false;
        }
        if (zContains && c2222231ByH.LIZ && (i == 0 || z)) {
            LinkedList<Pair<IMessage, Long>> linkedList = this.LJIJJ.get(iMessage.getIntType());
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.LJIJJ.put(iMessage.getIntType(), linkedList);
            }
            linkedList.offer(new Pair<>(iMessage, Long.valueOf(SystemClock.elapsedRealtime())));
            if (this.LJIL.LIZLLL != 0) {
                while (linkedList.size() > 0) {
                    Pair<IMessage, Long> pairPeek = linkedList.peek();
                    if (pairPeek != null) {
                        jLongValue = pairPeek.getSecond().longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jLongValue + ((long) this.LJIL.LIZLLL) >= SystemClock.elapsedRealtime()) {
                        break;
                    } else {
                        linkedList.poll();
                    }
                }
            }
            if (this.LJIL.LIZJ != 0) {
                while (linkedList.size() > 0 && linkedList.size() > this.LJIL.LIZJ) {
                    linkedList.poll();
                }
            }
        }
        Set<OnIMMessageListener> set2 = this.LJI.get(iMessage.getIntType());
        if (set2 != null) {
            for (OnIMMessageListener onIMMessageListener : set2) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (C1087590ePN.LIZ[onIMMessageListener.messageListenerType().ordinal()] == 1) {
                    LJ(onIMMessageListener, iMessage);
                } else {
                    C01GW c01gw = C20320014f8.LIZ;
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        LJ(onIMMessageListener, iMessage);
                    } else {
                        BPEAHandler bPEAHandler = this.LJIILL;
                        if (bPEAHandler != null) {
                            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS67S0300000_34(this, onIMMessageListener, iMessage, 19));
                        }
                    }
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                C2222081By2 c2222081By2 = this.LJIJJLI;
                if (c2222081By2 == null) {
                    c2222081By2 = null;
                }
                if (jElapsedRealtime3 >= c2222081By2.LIZ()) {
                    arrayList.add(onIMMessageListener.getClass().getSimpleName());
                    if (C20338614i8.LIZ) {
                        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("a message has timeout!!! ");
                        sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime2);
                        sbLIZ.append("ms, method: ");
                        sbLIZ.append(iMessage.getMethodName());
                        sbLIZ.append(", from: ");
                        sbLIZ.append(onIMMessageListener.getClass());
                        messageMonitorLIZIZ.log("MessageDispatchDelegate", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
        Set<OnMessageListener> set3 = this.LJFF.get(iMessage.getIntType());
        if (set3 != null) {
            AwS160S0400000_34 awS160S0400000_34 = new AwS160S0400000_34((Set) set3, (Set<OnMessageListener>) iMessage, (IMessage) this, (C2222001Bxu) arrayList, (List<String>) 0);
            C01GW c01gw2 = C20320014f8.LIZ;
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                awS160S0400000_34.invoke();
            } else {
                BPEAHandler bPEAHandler2 = this.LJIILL;
                if (bPEAHandler2 != null) {
                    C786410Ut5.LJJZZIII(bPEAHandler2, new ARunnableS134S0100000_34(awS160S0400000_34, 58));
                }
            }
        }
        Map<String, Object> extraParams = iMessage.getExtraParams();
        MessageMonitor.Stage stage = MessageMonitor.Stage.END;
        extraParams.put(MessageMonitor.getLiveMessageStageName("dispatch_time", stage), Long.valueOf(SystemClock.elapsedRealtime()));
        iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("all_time", stage), Long.valueOf(SystemClock.elapsedRealtime()));
        this.LIZ.LIZJ().LJIIJ(iMessage);
        Iterator it4 = ((CopyOnWriteArrayList) this.LIZ.LIZLLL().LIZ).iterator();
        while (it4.hasNext()) {
            ((EventListener) it4.next()).onDispatchMessage(iMessage);
        }
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            this.LIZ.LIZIZ().monitorMessageFirstDispatch(iMessage, this.LJIIJ, this.LJIIJJI, this.LJIIL.LIZJ(), this.LJIJ);
        }
        C01GW c01gw3 = C20340414iQ.LIZ;
        C20340414iQ.LIZIZ(new AwS578S0100000_34(iMessage, 125));
    }

    public final boolean LJFF(IMessage iMessage) {
        boolean zDirectDispatchP2pMsg;
        List<String> listDirectDispatchAllowList;
        List<String> listDirectDispatchP2pBlockList;
        List<String> listByPassDispatchAllowList;
        C2222081By2 c2222081By2 = null;
        if (iMessage.getDispatchStrategy() == 1) {
            C2222081By2 c2222081By22 = this.LJIJJLI;
            if (c2222081By22 == null) {
                c2222081By22 = null;
            }
            C2221721BxS c2221721BxS = c2222081By22.LIZLLL;
            if (c2221721BxS == null) {
                listByPassDispatchAllowList = c2222081By22.LIZ.LJ;
            } else if (c2221721BxS.LIZ) {
                listByPassDispatchAllowList = LiveMessageDispatchSettingAnchor.INSTANCE.byPassDispatchAllowList();
            } else {
                listByPassDispatchAllowList = LiveMessageDispatchSetting.INSTANCE.byPassDispatchAllowList();
            }
            if (listByPassDispatchAllowList.contains(iMessage.getMethodName())) {
                return true;
            }
        }
        C2222081By2 c2222081By23 = this.LJIJJLI;
        if (c2222081By23 == null) {
            c2222081By23 = null;
        }
        C2221721BxS c2221721BxS2 = c2222081By23.LIZLLL;
        if (c2221721BxS2 == null) {
            zDirectDispatchP2pMsg = c2222081By23.LIZ.LIZJ;
        } else if (c2221721BxS2.LIZ) {
            zDirectDispatchP2pMsg = LiveMessageDispatchSettingAnchor.INSTANCE.directDispatchP2pMsg();
        } else {
            zDirectDispatchP2pMsg = LiveMessageDispatchSetting.INSTANCE.directDispatchP2pMsg();
        }
        if (zDirectDispatchP2pMsg) {
            C2222081By2 c2222081By24 = this.LJIJJLI;
            if (c2222081By24 == null) {
                c2222081By24 = null;
            }
            C2221721BxS c2221721BxS3 = c2222081By24.LIZLLL;
            if (c2221721BxS3 == null) {
                listDirectDispatchAllowList = c2222081By24.LIZ.LIZLLL;
            } else if (c2221721BxS3.LIZ) {
                listDirectDispatchAllowList = LiveMessageDispatchSettingAnchor.INSTANCE.directDispatchAllowList();
            } else {
                listDirectDispatchAllowList = LiveMessageDispatchSetting.INSTANCE.directDispatchAllowList();
            }
            if (!listDirectDispatchAllowList.contains(iMessage.getMethodName())) {
                if (C2221841Bxe.LIZJ(iMessage.getGeneralMessageType())) {
                    C2222081By2 c2222081By25 = this.LJIJJLI;
                    if (c2222081By25 != null) {
                        c2222081By2 = c2222081By25;
                    }
                    C2221721BxS c2221721BxS4 = c2222081By2.LIZLLL;
                    if (c2221721BxS4 == null) {
                        listDirectDispatchP2pBlockList = c2222081By2.LIZ.LJFF;
                    } else if (c2221721BxS4.LIZ) {
                        listDirectDispatchP2pBlockList = LiveMessageDispatchSettingAnchor.INSTANCE.directDispatchP2pBlockList();
                    } else {
                        listDirectDispatchP2pBlockList = LiveMessageDispatchSetting.INSTANCE.directDispatchP2pBlockList();
                    }
                    if (listDirectDispatchP2pBlockList.contains(iMessage.getMethodName())) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        int iDispatchStrategy;
        boolean z;
        InterfaceC2222281ByM c2222021Bxw;
        IMessageWsClient iMessageWsClient;
        this.LJIJJLI = c2222081By2;
        C2222091By3 c2222091By3 = c2222081By2.LIZ;
        this.LJIL = c2222091By3.LJIILL;
        this.LIZIZ = c2222091By3.LIZ;
        C2221721BxS c2221721BxS = c2222081By2.LIZLLL;
        if (c2221721BxS == null) {
            iDispatchStrategy = c2222091By3.LJIIIIZZ;
        } else if (c2221721BxS.LIZ) {
            iDispatchStrategy = LiveMessageDispatchSettingAnchor.INSTANCE.dispatchStrategy();
        } else {
            iDispatchStrategy = LiveMessageDispatchSetting.INSTANCE.dispatchStrategy();
        }
        if (iDispatchStrategy == 6) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILJJIL = z;
        if (iDispatchStrategy == 1 || iDispatchStrategy != 6) {
            c2222021Bxw = new C2222021Bxw(this.LIZ, this);
        } else {
            c2222021Bxw = new C2222011Bxv(this.LIZ, this);
        }
        this.LJIIL = c2222021Bxw;
        c2222021Bxw.LJIIIZ(c2222081By2);
        this.LJIILIIL.getClass();
        ((CopyOnWriteArrayList) this.LJ).clear();
        ((CopyOnWriteArrayList) this.LJ).addAll(c2222081By2.LIZIZ.LIZ);
        C2222241ByI c2222241ByI = c2222081By2.LIZIZ.LIZIZ;
        if (c2222241ByI != null) {
            iMessageWsClient = c2222241ByI.LIZ;
        } else {
            iMessageWsClient = null;
        }
        this.LJIIIIZZ = iMessageWsClient;
        this.LJIIIZ = true;
        this.LJIIJJI = 0;
    }

    public final void LJIIJ(IMessage iMessage) throws Exception {
        if (!this.LJIJI) {
            C2222081By2 c2222081By2 = this.LJIJJLI;
            if (c2222081By2 == null) {
                c2222081By2 = null;
            }
            if (c2222081By2.LIZIZ()) {
                MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("but isStarted is false onMessage roomid=");
                sbLIZ.append(iMessage.getDimension());
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        iMessage.getExtraParams().put("window_count_dequeue", Integer.valueOf(this.LJIIL.LJIIJJI()));
        iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("enqueue_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
        iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("interceptor_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
        C01GW c01gw = C20340414iQ.LIZ;
        C20340414iQ.LIZJ(new AwS578S0100000_34(iMessage, 127));
        synchronized (this) {
            if (iMessage.getIntercepted() == null) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LJ).iterator();
                while (it2.hasNext()) {
                    if (((IInterceptor) it2.next()).onMessage(iMessage)) {
                        Iterator it3 = ((CopyOnWriteArrayList) this.LIZ.LIZLLL().LIZ).iterator();
                        while (it3.hasNext()) {
                            ((EventListener) it3.next()).onInterceptMessage(iMessage);
                        }
                        iMessage.setIntercepted(Boolean.TRUE);
                        return;
                    }
                }
                iMessage.setIntercepted(Boolean.FALSE);
            } else {
                boolean zLJFF = Intrinsics.LJFF(iMessage.getIntercepted(), Boolean.TRUE);
                if (zLJFF) {
                    return;
                }
            }
            iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("interceptor_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
            try {
                LIZLLL(iMessage);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Iterator it4 = ((CopyOnWriteArrayList) this.LIZ.LIZLLL().LIZ).iterator();
                while (it4.hasNext()) {
                    ((EventListener) it4.next()).onMessageConsumeException(iMessage);
                }
                throw e;
            }
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        this.LJIJI = false;
        this.LJIIL.LJIIL(c2222371ByV);
        this.LJIILIIL.LJIIL(c2222371ByV);
    }

    public final void LIZIZ(int i, OnMessageListener onMessageListener) throws Exception {
        long jLongValue;
        LinkedList<Pair<IMessage, Long>> linkedList = this.LJIJJ.get(i);
        if (linkedList == null) {
            return;
        }
        while (linkedList.size() > 0) {
            Pair<IMessage, Long> pairPeek = linkedList.peek();
            if (pairPeek != null) {
                jLongValue = pairPeek.getSecond().longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue + ((long) this.LJIL.LIZLLL) >= SystemClock.elapsedRealtime()) {
                break;
            } else {
                linkedList.poll();
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        Iterator<Pair<IMessage, Long>> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            try {
                onMessageListener.onMessage(it2.next().getFirst());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("call sticky listener exception:");
                sbLIZ.append(e);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                if (C20338614i8.LIZ) {
                    throw e;
                }
            }
        }
        String str = C001A.values()[i].wsMethod;
        this.LIZ.LIZIZ().monitorStickyMessageRelease(str, onMessageListener.getClass().getName(), linkedList.size(), SystemClock.elapsedRealtime() - this.LJIIJ);
    }

    public final void LJ(OnIMMessageListener onIMMessageListener, IMessage iMessage) {
        MessageMonitorExtKt.logDebug(this.LIZ.LIZIZ(), "MessageDispatch", new AwS578S0100000_34(iMessage, 126));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        onIMMessageListener.onMessage(iMessage);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        C2222081By2 c2222081By2 = this.LJIJJLI;
        if (c2222081By2 == null) {
            c2222081By2 = null;
        }
        if (jElapsedRealtime2 >= c2222081By2.LIZ() && C20338614i8.LIZ) {
            MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a message has timeout!!! ");
            sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
            sbLIZ.append("ms, method: ");
            sbLIZ.append(iMessage.getMethodName());
            sbLIZ.append(", from: ");
            sbLIZ.append(onIMMessageListener.getClass());
            messageMonitorLIZIZ.log("MessageDispatchDelegate", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJII(long j, List list) {
        boolean z;
        if (!this.LJIJI) {
            C2222081By2 c2222081By2 = this.LJIJJLI;
            if (c2222081By2 == null) {
                c2222081By2 = null;
            }
            if (c2222081By2.LIZIZ()) {
                this.LIZ.LIZIZ().log("MessagePortal", "but isStarted is false dispatchMessage");
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            IMessage iMessage = (IMessage) it2.next();
            iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("deal_raw_msg", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
            iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("enqueue_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
            C01GW c01gw = C20340414iQ.LIZ;
            C20340414iQ.LIZJ(new AwS578S0100000_34(iMessage, 128));
            C2222081By2 c2222081By22 = this.LJIJJLI;
            if (c2222081By22 == null) {
                c2222081By22 = null;
            }
            C2221721BxS c2221721BxS = c2222081By22.LIZLLL;
            if (c2221721BxS == null) {
                z = c2222081By22.LIZ.LIZIZ;
            } else {
                z = !c2221721BxS.LIZ;
            }
            if (!z) {
                iMessage.getExtraParams().put("is_feature_msg", 0);
                arrayList.add(iMessage);
            } else {
                if (iMessage.getMessageSEI() != null && iMessage.getDispatchTimeoutMillis() <= 0) {
                    iMessage.removeMessageSEI();
                }
                if (iMessage.getMessageSEI() == null && iMessage.getDependID() == null) {
                    iMessage.getExtraParams().put("is_feature_msg", 0);
                    arrayList.add(iMessage);
                } else {
                    iMessage.getExtraParams().put("is_feature_msg", 1);
                    arrayList2.add(iMessage);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = ((CopyOnWriteArrayList) this.LIZ.LIZLLL().LIZ).iterator();
            while (it3.hasNext()) {
                ((EventListener) it3.next()).onPreDispatchMessages(arrayList);
            }
            this.LJIIL.LJII(j, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            this.LJIILIIL.LJII(j, arrayList2);
        }
    }

    public final void LJIILIIL(int i, OnIMMessageListener onIMMessageListener) {
        if (this.LJIILJJIL) {
            Set<OnIMMessageListener> copyOnWriteArraySet = this.LJI.get(i);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                this.LJI.put(i, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(onIMMessageListener);
            return;
        }
        LJIIZILJ(i, onIMMessageListener);
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
        ((CopyOnWriteArrayList) this.LJ).clear();
        this.LJII.LIZIZ();
        ((CopyOnWriteArrayList) this.LJ).addAll(c2222081By2.LIZIZ.LIZ);
        this.LJIIIZ = true;
        this.LJIJJ.clear();
    }

    public final void LJIIZILJ(int i, OnMessageListener onMessageListener) {
        Set<OnMessageListener> copyOnWriteArraySet = this.LJFF.get(i);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.LJFF.put(i, copyOnWriteArraySet);
        }
        copyOnWriteArraySet.add(onMessageListener);
    }

    public final void LJIJ(Integer num, OnMessageListener onMessageListener) {
        SparseArray<Set<OnMessageListener>> sparseArray = this.LJFF;
        if (num != null) {
            Set<OnMessageListener> set = sparseArray.get(num.intValue());
            if (set != null && (!set.isEmpty())) {
                set.remove(onMessageListener);
                return;
            }
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Set<OnMessageListener> setValueAt = sparseArray.valueAt(i);
            if (setValueAt != null) {
                setValueAt.remove(onMessageListener);
            }
        }
    }
}
