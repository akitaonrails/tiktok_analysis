package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0XC6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XC6 implements Runnable {
    public final /* synthetic */ C0XC4 LL;
    public final /* synthetic */ C844720XBu LLILLJJLI;

    public final void LIZ() {
        C844770XBz c844770XBz = this.LLILLJJLI.LL;
        if (!c844770XBz.LJIJJ) {
            C844890XCl c844890XClLJIIIZ = this.LL.LJIIIZ();
            C844720XBu c844720XBu = this.LLILLJJLI;
            C0XC4 c0xc4 = this.LL;
            c844720XBu.getClass();
            C844720XBu.LIZLLL(c844890XClLJIIIZ, c0xc4);
            C0XC4 c0xc42 = this.LL;
            if (c0xc42.LJFF || c844890XClLJIIIZ.LIZIZ == 4) {
                return;
            }
            BPEAHandler bPEAHandler = this.LLILLJJLI.LLILLL;
            C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(1235, c0xc42), c844890XClLJIIIZ.LIZJ);
            return;
        }
        C0XC4 c0xc43 = this.LL;
        InterfaceC586790Mzt interfaceC586790Mzt = c0xc43.LJI;
        if (interfaceC586790Mzt != null) {
            c0xc43.LJI = null;
            C844720XBu.LLJILLL.LIZIZ(c844770XBz.LIZJ).LIZIZ(interfaceC586790Mzt);
        }
        C844890XCl c844890XClLJIIIZ2 = this.LL.LJIIIZ();
        C844720XBu c844720XBu2 = this.LLILLJJLI;
        C0XC4 c0xc44 = this.LL;
        c844720XBu2.getClass();
        C844720XBu.LIZLLL(c844890XClLJIIIZ2, c0xc44);
        C0XC4 c0xc45 = this.LL;
        if (c0xc45.LJFF) {
            return;
        }
        if (!c844890XClLJIIIZ2.LIZ) {
            c0xc45.LJ();
            if (c844890XClLJIIIZ2.LIZIZ == 1) {
                InterfaceC586790Mzt interfaceC586790Mzt2 = new InterfaceC586790Mzt() { // from class: X.0XC7
                    @Override // X.InterfaceC586790Mzt
                    public final void LIZ() {
                        C0XC6 c0xc6 = this.LIZ;
                        if (c0xc6.LLILLJJLI.LLILLL.hasMessages(1235, c0xc6.LL)) {
                            C0XC6 c0xc62 = this.LIZ;
                            c0xc62.LLILLJJLI.LLILLL.removeMessages(1235, c0xc62.LL);
                            C0XC6 c0xc63 = this.LIZ;
                            c0xc63.LLILLJJLI.LLILLL.obtainMessage(1235, c0xc63.LL).sendToTarget();
                        }
                        C0XC6 c0xc64 = this.LIZ;
                        c0xc64.LL.LJI = null;
                        C844720XBu.LLJILLL.LIZIZ(c0xc64.LLILLJJLI.LL.LIZJ).LIZIZ(this);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("remove observer ");
                        sbLIZ.append(this.LIZ.LL);
                        sbLIZ.append(", ");
                        sbLIZ.append(this);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC844900XCm interfaceC844900XCm = C844830XCf.LIZIZ;
                        if (interfaceC844900XCm != null) {
                            interfaceC844900XCm.LIZLLL(strLIZIZ, null);
                        }
                    }
                };
                this.LL.LJI = interfaceC586790Mzt2;
                C844720XBu.LLJILLL.LIZIZ(this.LLILLJJLI.LL.LIZJ).LIZ(interfaceC586790Mzt2);
            }
        }
        if (c844890XClLJIIIZ2.LIZIZ != 4) {
            BPEAHandler bPEAHandler2 = this.LLILLJJLI.LLILLL;
            C786410Ut5.LJLJLJ(bPEAHandler2, bPEAHandler2.obtainMessage(1235, this.LL), c844890XClLJIIIZ2.LIZJ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("InstallDispatcher@b733.workAndPostAgain$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InstallDispatcher@b733.workAndPostAgain$1");
    }

    public C0XC6(C844720XBu c844720XBu, C0XC4 c0xc4) {
        this.LLILLJJLI = c844720XBu;
        this.LL = c0xc4;
    }
}
