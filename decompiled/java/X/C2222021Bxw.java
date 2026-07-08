package X;

import android.os.Handler;
import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1Bxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222021Bxw implements InterfaceC2222281ByM {
    public final InterfaceC2222101By4 LIZ;
    public final C2222001Bxu LIZIZ;
    public int LIZLLL;
    public Handler LJ;
    public C2222081By2 LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public int LIZJ = 3;
    public final List<IMessage> LJFF = new CopyOnWriteArrayList();
    public final transient Object LJI = new Object();

    @Override // X.InterfaceC2222281ByM
    public final int LIZJ() {
        return 1;
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
        this.LJ = this.LIZ.LJI(new C1D12(this, 4));
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

    public final void LIZIZ(boolean z) {
        C2222321ByQ c2222321ByQ = (C2222321ByQ) this.LIZ.LJ().LIZLLL(C2222321ByQ.class);
        if (c2222321ByQ != null) {
            if (!this.LJIIIIZZ) {
                this.LJIIIZ = SystemClock.elapsedRealtime();
            }
            if (((CopyOnWriteArrayList) this.LJFF).size() > c2222321ByQ.LIZIZ) {
                this.LIZ.LJ().LIZIZ.remove(C2222321ByQ.class);
            } else {
                this.LJIIIIZZ = true;
                return;
            }
        }
        if (this.LJIIIIZZ) {
            this.LJIIIIZZ = false;
            this.LIZ.LIZIZ().monitorHoldDispatchRelease(Long.valueOf(SystemClock.elapsedRealtime() - this.LJIIIZ), Integer.valueOf(((CopyOnWriteArrayList) this.LJFF).size()));
        }
        Handler handler = this.LJ;
        if (handler != null && handler.hasMessages(212)) {
            return;
        }
        if (!z) {
            Handler handler2 = this.LJ;
            if (handler2 != null) {
                C786410Ut5.LJLILLLLZI(handler2, 212);
                return;
            }
            return;
        }
        C2222081By2 c2222081By2 = this.LJII;
        if (c2222081By2 == null) {
            c2222081By2 = null;
        }
        long jLIZLLL = c2222081By2.LIZLLL();
        C2222311ByP c2222311ByP = (C2222311ByP) this.LIZ.LJ().LIZLLL(C2222311ByP.class);
        if (c2222311ByP != null) {
            jLIZLLL = c2222311ByP.LIZIZ;
        }
        Handler handler3 = this.LJ;
        if (handler3 == null) {
            return;
        }
        C786410Ut5.LJLJJI(212, jLIZLLL, handler3);
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        this.LJII = c2222081By2;
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

    public C2222021Bxw(InterfaceC2222101By4 interfaceC2222101By4, C2222001Bxu c2222001Bxu) {
        this.LIZ = interfaceC2222101By4;
        this.LIZIZ = c2222001Bxu;
    }

    @Override // X.InterfaceC2222281ByM
    public final void LJII(long j, List list) {
        Handler handler = this.LJ;
        if (handler != null) {
            C786410Ut5.LJLJLJ(handler, handler.obtainMessage(211, list), j);
        }
    }
}
