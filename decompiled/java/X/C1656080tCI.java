package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.AwS76S0210000_25;

/* JADX INFO: renamed from: X.0tCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656080tCI {
    public final C1656050tCF<?> LIZ;
    public final C1656110tCL LIZIZ;
    public final SafeHandler LIZJ;
    public final InterfaceC1656170tCR LIZLLL;
    public final InterfaceC2254081DKk LJ;

    public final void onEvent(C1644050sst c1644050sst) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StopRecordCommandEventHandlerFactory.onEvent,reason:");
        sbLIZ.append(c1644050sst.LJFF);
        sbLIZ.append(",recordState:");
        sbLIZ.append(c1644050sst.LIZ);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.Jv2().LIZJ().booleanValue()) {
            this.LIZ.tu0(new C1644050sst("status is alredy stopped"));
            return;
        }
        C2219091BtD.LIZLLL().i("set hasStopped to true");
        this.LIZ.L6(true);
        InterfaceC576950Mk1 interfaceC576950Mk1O7 = this.LIZ.o7();
        String strSQ0 = this.LIZ.sQ0();
        C1656090tCJ c1656090tCJ = (C1656090tCJ) interfaceC576950Mk1O7;
        InterfaceC1656400tCo interfaceC1656400tCo = c1656090tCJ.LJIILL;
        if (interfaceC1656400tCo != null) {
            ((C1656300tCe) interfaceC1656400tCo).LIZ.pa();
        }
        boolean z2 = false;
        c1656090tCJ.LJIIL = false;
        if (strSQ0 != null) {
            c1656090tCJ.LJIL.put(strSQ0, Boolean.FALSE);
        }
        int i = c1644050sst.LIZ;
        if (i == 6) {
            z = true;
        } else {
            z = false;
            if (i == 3) {
                z2 = true;
            }
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("recordState: ");
        sbLIZ2.append(c1644050sst.LIZ);
        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
        if (!z2) {
            this.LIZLLL.LIZ(this.LJ, new AwS76S0210000_25(this, z, c1644050sst, jCurrentTimeMillis, 0));
            if (z) {
                this.LIZ.N6(true);
                C2219091BtD.LIZLLL().i("stopRecord() called");
                this.LIZ.E3(c1644050sst);
            }
        } else {
            this.LIZ.N6(true);
            this.LIZ.H3();
        }
        this.LIZ.m3();
        this.LIZ.z80(0L);
        InterfaceC1656370tCl interfaceC1656370tCl = this.LIZIZ.LIZLLL;
        if (interfaceC1656370tCl != null) {
            interfaceC1656370tCl.LIZ();
        }
    }

    public C1656080tCI(InterfaceC1650230t2r interfaceC1650230t2r, C1656050tCF<?> c1656050tCF, C1656110tCL c1656110tCL, SafeHandler safeHandler, InterfaceC1656170tCR interfaceC1656170tCR) {
        this.LIZ = c1656050tCF;
        this.LIZIZ = c1656110tCL;
        this.LIZJ = safeHandler;
        this.LIZLLL = interfaceC1656170tCR;
        this.LJ = interfaceC1650230t2r.St2();
    }
}
