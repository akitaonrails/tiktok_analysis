package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0pq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526960pq2 extends AbstractC1526980pq4 implements InterfaceC1526540ppM, InterfaceC1526550ppN {
    public final Object LLILLJJLI;
    public boolean LLILLL;
    public final InterfaceC1526680ppa LLILZ;
    public final LinkedBlockingQueue<WsChannelMsg> LLILZIL;
    public final InterfaceC1527530pqx LLILZLL;

    @Override // X.InterfaceC1527530pqx
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC1526980pq4
    public final int LJLIL() {
        return 1;
    }

    @Override // X.InterfaceC1526550ppN
    public final void LJJZ() {
        try {
            this.LLILZIL.clear();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1526540ppM
    public final void LJI(boolean z) {
        if (z) {
            synchronized (this.LLILLJJLI) {
                try {
                    C1527890prX.LIZJ("[SendMsgV4] notify ws connected");
                    this.LLILLJJLI.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1527530pqx
    public final void LJJLIIIJL(C1527500pqu c1527500pqu) {
        if (c1527500pqu.LIZJ) {
            this.LLILZLL.LJJLIIIJL(c1527500pqu);
            return;
        }
        C1527060pqC c1527060pqC = c1527500pqu.LIZ;
        if (c1527060pqC == null) {
            C1527890prX.LIZIZ("[SendMsgV4] msg is null ,not send");
            return;
        }
        int iIntValue = C1527180pqO.LIZ(c1527060pqC).intValue();
        WsChannelMsg wsChannelMsgLJJLIIIJLLLLLLLZ = ((InterfaceC1526830ppp) C808470VnZ.LIZ(InterfaceC1526830ppp.class)).LJJLIIIJLLLLLLLZ(this.LL, c1527500pqu.LIZ);
        if (wsChannelMsgLJJLIIIJLLLLLLLZ == null) {
            C1527890prX.LIZIZ("[SendMsgV4] convert msg error, not send");
            return;
        }
        int i = 1;
        if (this.LLILZ.LJII()) {
            this.LLILLL = false;
            this.LLILZ.LIZIZ(wsChannelMsgLJJLIIIJLLLLLLLZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[SendMsgV4] send msg to ws ");
            sbLIZ.append(C1526990pq5.LJI(c1527500pqu.LIZ));
            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            try {
                synchronized (this.LLILLJJLI) {
                    try {
                        if (this.LLILLL && c1527500pqu.LIZIZ) {
                            C1527890prX.LIZJ("[SendMsgV4] ws not connect, but waiting timeout, so not sleep");
                        } else {
                            C1527890prX.LIZJ("[SendMsgV4] ws not connect, sleep...");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            this.LLILLJJLI.wait(Mp4ScreenVideoLoadTimeout.CONTROL);
                            if (System.currentTimeMillis() - jCurrentTimeMillis >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                                this.LLILLL = true;
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (InterruptedException th) {
            }
            boolean zLJII = this.LLILZ.LJII();
            boolean zLJJJJ = ((InterfaceC1526530ppL) C808470VnZ.LIZ(InterfaceC1526530ppL.class)).LJJJJ(this.LL);
            if (zLJII) {
                this.LLILZ.LIZIZ(wsChannelMsgLJJLIIIJLLLLLLLZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[SendMsgV4] send msg to ws again ");
                sbLIZ2.append(C1526990pq5.LJI(c1527500pqu.LIZ));
                C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                if (c1527500pqu.LIZIZ && zLJJJJ) {
                    C1527500pqu c1527500pqu2 = new C1527500pqu();
                    c1527500pqu2.LIZ = c1527500pqu.LIZ;
                    c1527500pqu2.LIZIZ = false;
                    c1527500pqu2.LIZLLL = c1527500pqu.LIZLLL;
                    c1527500pqu2.LJ = c1527500pqu.LJ;
                    this.LLILZLL.LJJLIIIJL(c1527500pqu2);
                    C1527890prX.LIZJ("[SendMsgV4] ws not connect, fallback to http...");
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[SendMsgV4] send payload failed with ws ");
                    sbLIZ3.append(C1526990pq5.LJI(c1527500pqu.LIZ));
                    sbLIZ3.append(", throw it");
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (!zLJII) {
                    if (c1527500pqu.LIZIZ && ((InterfaceC1526530ppL) C808470VnZ.LIZ(InterfaceC1526530ppL.class)).LJJJJ(this.LL)) {
                        return;
                    } else {
                        i = zLJJJJ ? 2 : 3;
                    }
                }
            }
        }
        LJLJI(c1527500pqu, i, iIntValue, this.LLILZ.LJII());
        LJLILLLLZI(c1527500pqu);
    }

    public C1526960pq2(Context context, C1527510pqv c1527510pqv) {
        super(context);
        this.LLILLJJLI = new Object();
        this.LLILZIL = new LinkedBlockingQueue<>();
        this.LLILZ = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().LIZJ;
        this.LLILZLL = c1527510pqv;
        ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
        C08MU.LIZLLL(context);
        ((InterfaceC1526490ppH) C808470VnZ.LIZ(InterfaceC1526490ppH.class)).LJJLIIIJJI(this);
        ((InterfaceC1526480ppG) C808470VnZ.LIZ(InterfaceC1526480ppG.class)).LJJLI(this);
    }
}
