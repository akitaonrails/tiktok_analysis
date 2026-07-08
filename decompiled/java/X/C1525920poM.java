package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0poM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525920poM implements InterfaceC1526020poW, Handler.Callback {
    public final InterfaceC1526260pou LL;
    public final C1525910poL LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1525940poO(this));

    public final Handler LJI() {
        return (Handler) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1526020poW
    public final void LJJIJL() {
        this.LLILLJJLI.LIZLLL.LIZ();
    }

    @Override // X.InterfaceC1526020poW
    public final void LJJLL() {
        if (LJI().hasMessages(102)) {
            return;
        }
        LJI().obtainMessage(102).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 101) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj != null) {
                C801520VcM c801520VcM = (C801520VcM) messageObj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[PayloadSendServiceV4] ");
                sbLIZ.append("do insert upstream msg -> ");
                sbLIZ.append(c801520VcM);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJLIIIJ(c801520VcM);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1526710ppd.LIZJ().ensureNotReachHere(e, "execute sql failed when insertUploadPayload");
                }
                if (!LJI().hasMessages(102)) {
                    LJI().obtainMessage(102).sendToTarget();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.sync.v4.presistence.table.UploadItemV4");
            }
        }
        if (message.what == 103) {
            Object messageObj2 = HandlerHook.getMessageObj(message.obj);
            if (messageObj2 != null) {
                List list = (List) messageObj2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[PayloadSendServiceV4] ");
                sbLIZ2.append("do insert upstream msg -> ");
                sbLIZ2.append(list);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJL(list);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1526710ppd.LIZJ().ensureNotReachHere(e2, "execute sql failed when insertUploadPayload");
                }
                if (!LJI().hasMessages(102)) {
                    LJI().obtainMessage(102).sendToTarget();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.bytedance.sync.v4.presistence.table.UploadItemV4>");
            }
        }
        if (message.what == 102) {
            C1525910poL c1525910poL = this.LLILLJJLI;
            if (((LinkedList) c1525910poL.LIZLLL.LIZ).size() > 0) {
                C1527890prX.LIZJ(Intrinsics.LJIIJJI("there is upstream task in queue,throw current one", "[BusinessMsgSenderV4] "));
            } else {
                c1525910poL.LIZLLL.LIZIZ(new ARunnableS123S0100000_23(c1525910poL, 181));
                return false;
            }
        }
        return false;
    }

    public C1525920poM(Context context, C1526570ppP c1526570ppP, C1526870ppt c1526870ppt, C1526350pp3 c1526350pp3) {
        this.LL = c1526870ppt;
        this.LLILLJJLI = new C1525910poL(context, c1526350pp3);
    }
}
