package X;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Bxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222011Bxv implements InterfaceC2222281ByM {
    public final InterfaceC2222101By4 LIZ;
    public final C2222001Bxu LIZIZ;
    public int LIZLLL;
    public Handler LJ;
    public C2222081By2 LJI;
    public int LIZJ = 3;
    public final List<IMessage> LJFF = new CopyOnWriteArrayList();

    @Override // X.InterfaceC2222281ByM
    public final int LIZJ() {
        return 6;
    }

    @Override // X.InterfaceC2222281ByM
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        this.LJ = this.LIZ.LJFF(new C1D12(this, 1));
    }

    public final void LIZIZ() {
        int iMin;
        Handler handler;
        Handler handler2;
        this.LIZLLL++;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before dispatch, message queue size is ");
        sbLIZ.append(((CopyOnWriteArrayList) this.LJFF).size());
        messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
        int size = ((CopyOnWriteArrayList) this.LJFF).size();
        int size2 = this.LIZJ;
        if (size < size2) {
            size2 = ((CopyOnWriteArrayList) this.LJFF).size();
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((CopyOnWriteArrayList) this.LJFF).subList(0, size2));
            iMin = Math.min(this.LIZIZ.LJIIIIZZ().LIZ(arrayList, this.LIZIZ), arrayList.size());
        } catch (Exception e) {
            e = e;
            iMin = 0;
        }
        try {
            List<IMessage> list = this.LJFF;
            List<IMessage> listSubList = ((CopyOnWriteArrayList) list).subList(0, Math.min(iMin, ((CopyOnWriteArrayList) list).size()));
            C2222271ByL c2222271ByLLIZLLL = this.LIZ.LIZLLL();
            List<IMessage> list2 = this.LJFF;
            Iterator it2 = ((CopyOnWriteArrayList) c2222271ByLLIZLLL.LIZ).iterator();
            while (it2.hasNext()) {
                ((EventListener) it2.next()).onEnqueueMessage(list2, listSubList);
            }
            listSubList.clear();
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("messageList clear error:");
            sbLIZ2.append(e);
            messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
        }
        MessageMonitor messageMonitorLIZIZ3 = this.LIZ.LIZIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("after dispatch, message queue size is ");
        sbLIZ3.append(((CopyOnWriteArrayList) this.LJFF).size());
        messageMonitorLIZIZ3.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ3));
        this.LIZ.LIZJ().LJIIIIZZ(((CopyOnWriteArrayList) this.LJFF).size());
        if (((CopyOnWriteArrayList) this.LJFF).size() > 0 && (((handler = this.LJ) == null || !handler.hasMessages(212)) && (handler2 = this.LJ) != null)) {
            C2222081By2 c2222081By2 = this.LJI;
            if (c2222081By2 == null) {
                c2222081By2 = null;
            }
            C786410Ut5.LJLJJI(212, c2222081By2.LIZLLL(), handler2);
        }
        C01GW c01gw = C20340414iQ.LIZ;
        C20340414iQ.LIZIZ(new AwS578S0100000_34(this, 117));
        this.LIZ.LIZIZ().monitorMsgDispatchListDelay(SystemClock.elapsedRealtime() - jElapsedRealtime, size2, iMin, ((CopyOnWriteArrayList) this.LJFF).size(), 6);
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJFF).clear();
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        ((CopyOnWriteArrayList) this.LJFF).clear();
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC2222281ByM
    public final List<IMessage> LJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC2222281ByM
    public final int LJIIJJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        this.LJI = c2222081By2;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        Handler handler;
        Handler handler2 = this.LJ;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        if (c2222371ByV.LIZ && (handler = this.LJ) != null) {
            C786410Ut5.LJLILLLLZI(handler, 213);
        }
    }

    public C2222011Bxv(InterfaceC2222101By4 interfaceC2222101By4, C2222001Bxu c2222001Bxu) {
        this.LIZ = interfaceC2222101By4;
        this.LIZIZ = c2222001Bxu;
    }

    @Override // X.InterfaceC2222281ByM
    public final void LJII(long j, List list) throws Exception {
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("thread receive message list, size is ");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            C2222081By2 c2222081By2 = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i + 1;
                if (i >= 0) {
                    IMessage iMessage = (IMessage) next;
                    if (this.LIZIZ.LJII.onMessage(iMessage)) {
                        C01GW c01gw = C20340414iQ.LIZ;
                        C20340414iQ.LIZJ(new AwS578S0100000_34(iMessage, 118));
                    } else {
                        C01GW c01gw2 = C20340414iQ.LIZ;
                        C20340414iQ.LIZJ(new AwS578S0100000_34(iMessage, 119));
                        if (this.LIZIZ.LJFF(iMessage)) {
                            iMessage.getExtraParams().put("front_msg_size", Integer.valueOf(i2));
                            iMessage.getExtraParams().put("is_direct_dispatch", 1);
                            this.LIZIZ.LJIIJ(iMessage);
                            i2++;
                        } else {
                            iMessage.getExtraParams().put("window_count_enqueue", Integer.valueOf(this.LIZLLL));
                            iMessage.getExtraParams().put("is_direct_dispatch", 0);
                            iMessage.getExtraParams().put("front_msg_size", Integer.valueOf(((CopyOnWriteArrayList) this.LJFF).size()));
                            ((CopyOnWriteArrayList) this.LJFF).add(iMessage);
                        }
                    }
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                C2222081By2 c2222081By22 = this.LJI;
                if (c2222081By22 == null) {
                    c2222081By22 = null;
                }
                int iLIZLLL = (int) (1000 / c2222081By22.LIZLLL());
                MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("expect dispatch count: ");
                sbLIZ2.append(iLIZLLL);
                messageMonitorLIZIZ2.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ = ((CopyOnWriteArrayList) this.LJFF).size() / iLIZLLL;
                C2222081By2 c2222081By23 = this.LJI;
                if (c2222081By23 == null) {
                    c2222081By23 = null;
                }
                int iLIZJ = c2222081By23.LIZJ();
                int i4 = this.LIZJ;
                if (i4 >= iLIZJ) {
                    iLIZJ = i4;
                }
                this.LIZJ = iLIZJ;
                MessageMonitor messageMonitorLIZIZ3 = this.LIZ.LIZIZ();
                int i5 = this.LIZJ;
                int size = ((CopyOnWriteArrayList) this.LJFF).size();
                C2222081By2 c2222081By24 = this.LJI;
                if (c2222081By24 != null) {
                    c2222081By2 = c2222081By24;
                }
                messageMonitorLIZIZ3.monitorMsgDispatchSize(i5, size, 1000L, c2222081By2.LIZLLL(), this.LIZ.context().LIZIZ, this.LIZ.context().LIZJ, 6);
                MessageMonitor messageMonitorLIZIZ4 = this.LIZ.LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("next time dispatch size: ");
                sbLIZ3.append(this.LIZJ);
                messageMonitorLIZIZ4.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ3));
                if (((CopyOnWriteArrayList) this.LJFF).size() > 0) {
                    LIZIZ();
                    return;
                }
                return;
            }
        }
    }
}
