package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0pqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527340pqe implements InterfaceC1527480pqs, Handler.Callback {
    public final C1527280pqY LL = new AbstractC1526380pp6<Handler>() { // from class: X.0pqY
        @Override // X.AbstractC1526380pp6
        public final Handler LIZ(Object[] objArr) {
            return new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get(), this.LIZIZ);
        }
    };
    public final C1526570ppP LLILLJJLI;
    public final InterfaceC1527580pr2 LLILLL;
    public final InterfaceC1525730po3 LLILZ;
    public InterfaceC1525970poR LLILZIL;
    public InterfaceC1527480pqs LLILZLL;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    @Override // X.InterfaceC1527480pqs
    public final void LIZIZ() {
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        if (interfaceC1527480pqs != null) {
            interfaceC1527480pqs.LIZIZ();
        }
    }

    @Override // X.InterfaceC1527550pqz
    public final int LIZLLL() {
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        if (interfaceC1527480pqs == null) {
            return 0;
        }
        return interfaceC1527480pqs instanceof C1527870prV ? 1 : 2;
    }

    @Override // X.InterfaceC1527480pqs
    public final void destroy() {
        C1527890prX.LIZJ("[CompensatorV4] WsFirstCompensator destroy");
        LIZIZ(new Object[0]).removeCallbacksAndMessages(null);
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        if (interfaceC1527480pqs != null) {
            interfaceC1527480pqs.destroy();
        }
    }

    @Override // X.InterfaceC1527480pqs
    public final void LJIIJ(C1527060pqC c1527060pqC) {
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        if (interfaceC1527480pqs != null) {
            interfaceC1527480pqs.LJIIJ(c1527060pqC);
        }
    }

    @Override // X.InterfaceC1527480pqs
    public final void LIZ(InterfaceC1525970poR interfaceC1525970poR, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[CompensatorV4] WsFirst start readyToPoll = ");
        sbLIZ.append(z);
        C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL = interfaceC1525970poR;
        if (this.LLILLJJLI.LIZJ.LJII()) {
            final InterfaceC1527580pr2 interfaceC1527580pr2 = this.LLILLL;
            final C1527280pqY c1527280pqY = this.LL;
            final InterfaceC1525730po3 interfaceC1525730po3 = this.LLILZ;
            this.LLILZLL = new InterfaceC1527480pqs(interfaceC1527580pr2, c1527280pqY, interfaceC1525730po3) { // from class: X.0prV
                public final InterfaceC1527580pr2 LL;
                public final AbstractC1526380pp6<Handler> LLILLJJLI;
                public final InterfaceC1525730po3 LLILLL;
                public AbstractC1527850prT LLILZ;
                public InterfaceC1525970poR LLILZIL;

                @Override // X.InterfaceC1527550pqz
                public final int LIZLLL() {
                    return 1;
                }

                @Override // X.InterfaceC1527480pqs
                public final void LIZIZ() {
                    AbstractC1527850prT abstractC1527850prT = this.LLILZ;
                    if (abstractC1527850prT == null || abstractC1527850prT.LIZJ() == 1) {
                        AbstractC1527850prT abstractC1527850prT2 = this.LLILZ;
                        if (abstractC1527850prT2 != null) {
                            abstractC1527850prT2.LIZ();
                        }
                        C1527900prY c1527900prY = new C1527900prY();
                        c1527900prY.LIZ = this.LLILZIL.LJII();
                        c1527900prY.LIZIZ = this.LLILZIL.LJII();
                        C1527840prS c1527840prS = new C1527840prS(this.LL, this.LLILLL, this.LLILLJJLI, c1527900prY);
                        this.LLILZ = c1527840prS;
                        c1527840prS.LJ();
                    }
                }

                @Override // X.InterfaceC1527480pqs
                public final void destroy() {
                    C1527890prX.LIZJ("[CompensatorV4] WsConnectedCompensator destroy");
                    AbstractC1527850prT abstractC1527850prT = this.LLILZ;
                    if (abstractC1527850prT != null) {
                        abstractC1527850prT.LIZ();
                    }
                }

                @Override // X.InterfaceC1527480pqs
                public final void LJIIJ(C1527060pqC c1527060pqC) {
                    AbstractC1527850prT abstractC1527850prT = this.LLILZ;
                    if (abstractC1527850prT != null) {
                        abstractC1527850prT.LJFF(c1527060pqC);
                    }
                }

                @Override // X.InterfaceC1527480pqs
                public final void LIZ(InterfaceC1525970poR interfaceC1525970poR2, boolean z2) {
                    int iLIZ;
                    int iLJIIJJI;
                    AbstractC1527850prT c1527880prW;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[CompensatorV4] WsConnectedCompensator start readyToPoll = ");
                    sbLIZ2.append(z2);
                    C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLILZIL = interfaceC1525970poR2;
                    C1527900prY c1527900prY = new C1527900prY();
                    if (z2) {
                        iLIZ = interfaceC1525970poR2.poll();
                    } else {
                        iLIZ = interfaceC1525970poR2.LIZ();
                    }
                    c1527900prY.LIZ = iLIZ;
                    if (z2) {
                        iLJIIJJI = interfaceC1525970poR2.LJII();
                    } else {
                        iLJIIJJI = interfaceC1525970poR2.LJIIJJI();
                    }
                    c1527900prY.LIZIZ = iLJIIJJI;
                    if (z2) {
                        c1527880prW = new C1527840prS(this.LL, this.LLILLL, this.LLILLJJLI, c1527900prY);
                    } else {
                        c1527880prW = new C1527880prW(this.LL, this.LLILLL, this.LLILLJJLI, c1527900prY);
                    }
                    this.LLILZ = c1527880prW;
                    c1527880prW.LJ();
                }

                @Override // X.InterfaceC1527480pqs
                public final void LIZJ(InterfaceC1525970poR interfaceC1525970poR2, boolean z2) {
                    int iLJIIJJI;
                    int iLJIIJJI2;
                    this.LLILZIL = interfaceC1525970poR2;
                    C1527900prY c1527900prY = new C1527900prY();
                    if (z2) {
                        iLJIIJJI = interfaceC1525970poR2.LJII();
                    } else {
                        iLJIIJJI = interfaceC1525970poR2.LJIIJJI();
                    }
                    c1527900prY.LIZ = iLJIIJJI;
                    if (z2) {
                        iLJIIJJI2 = interfaceC1525970poR2.LJII();
                    } else {
                        iLJIIJJI2 = interfaceC1525970poR2.LJIIJJI();
                    }
                    c1527900prY.LIZIZ = iLJIIJJI2;
                    this.LLILZ.LJ = c1527900prY;
                }

                {
                    this.LL = interfaceC1527580pr2;
                    this.LLILLJJLI = c1527280pqY;
                    this.LLILLL = interfaceC1525730po3;
                }
            };
        } else {
            this.LLILZLL = new C1527860prU(this.LLILLL, this.LL, this.LLILZ, true, false);
        }
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        this.LLILZLL = interfaceC1527480pqs;
        interfaceC1527480pqs.LIZ(interfaceC1525970poR, z);
    }

    @Override // X.InterfaceC1527480pqs
    public final void LIZJ(InterfaceC1525970poR interfaceC1525970poR, boolean z) {
        this.LLILZIL = interfaceC1525970poR;
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        if (interfaceC1527480pqs != null) {
            interfaceC1527480pqs.LIZJ(interfaceC1525970poR, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0pqY] */
    public C1527340pqe(InterfaceC1527580pr2 interfaceC1527580pr2, C1527000pq6 c1527000pq6, C1526570ppP c1526570ppP) {
        this.LLILLL = interfaceC1527580pr2;
        this.LLILZ = c1527000pq6;
        this.LLILLJJLI = c1526570ppP;
    }
}
