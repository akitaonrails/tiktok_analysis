package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class RunnableC1527050pqB implements Runnable {
    public final /* synthetic */ C1526990pq5 LL;

    public final void LIZ() {
        InterfaceC1525970poR interfaceC1525970poRLIZIZ = C1526890ppv.LIZJ(this.LL.LLILZIL).LIZIZ();
        C1527890prX.LIZJ("[SendMsgV4] start send msg to server....");
        while (true) {
            C1527500pqu c1527500pquPoll = this.LL.LLILLJJLI.poll();
            if (c1527500pquPoll == null) {
                break;
            }
            if (!c1527500pquPoll.LIZJ && c1527500pquPoll.LIZLLL == null) {
                c1527500pquPoll.LIZLLL = new AbstractC1527490pqt() { // from class: X.0pqb
                    @Override // X.AbstractC1527490pqt
                    public final void LIZ() {
                        JSONObject jSONObject = new JSONObject();
                        C1499090p75.LIZ(this.LIZ, "send_method", jSONObject);
                        C1499090p75.LIZ(this.LIZIZ, "send_result", jSONObject);
                        C1499090p75.LIZ(this.LIZJ, "send_msg_type", jSONObject);
                        C1499090p75.LIZ(this.LIZLLL, "ws_connect", jSONObject);
                        C1526300poy.LIZ("sync_sdk_socket_percentage", jSONObject, null, null);
                    }
                };
            }
            if (!interfaceC1525970poRLIZIZ.LJIIIIZZ() || c1527500pquPoll.LIZJ) {
                this.LL.LLILLL.LJJLIIIJL(c1527500pquPoll);
            } else {
                try {
                    this.LL.LLILZ.LJJLIIIJL(c1527500pquPoll);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ws sender send err: ");
                    sbLIZ.append(th);
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        synchronized (this.LL) {
            try {
                boolean zIsEmpty = this.LL.LLILLJJLI.isEmpty();
                this.LL.LL.set(!zIsEmpty);
                if (!zIsEmpty) {
                    try {
                        C1527540pqy.LIZ.LIZIZ(new Object[0]).submit(new RunnableC1527050pqB(this.LL));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        C1527890prX.LIZJ("[SendMsgV4] send msg to server finish");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MsgSenderV4$SendMsgTask@5f21.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MsgSenderV4$SendMsgTask@5f21.run");
    }

    public RunnableC1527050pqB(C1526990pq5 c1526990pq5) {
        this.LL = c1526990pq5;
    }
}
