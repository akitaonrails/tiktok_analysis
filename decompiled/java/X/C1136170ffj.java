package X;

import Y.ARunnableS104S0100000_4;
import kotlin.jvm.internal.AwS135S0110000_17;

/* JADX INFO: renamed from: X.0ffj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136170ffj {
    public static final C11RO LIZ = C1701940uOG.LIZIZ();

    public static void LIZ(InterfaceC1136020ffU interfaceC1136020ffU, C1136100ffc c1136100ffc, boolean z, AwS135S0110000_17 awS135S0110000_17) {
        c1136100ffc.getClass();
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
        int iLIZJ = C1135870ffF.LIZJ(interfaceC1136020ffU);
        if (interfaceC1136160ffiLJIIIIZZ != null && iLIZJ >= 0) {
            if (C1135870ffF.LJIILIIL(interfaceC1136020ffU)) {
                c1136100ffc.LIZIZ.LJFF(interfaceC1136020ffU);
            } else {
                c1136100ffc.LIZ.LJFF(interfaceC1136020ffU);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offer, gift == null || price < 0, price = ");
            sbLIZ.append(iLIZJ);
            C1133910fc5.LJ("GiftTrayMessageQueueOther", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1136080ffa.LIZLLL(interfaceC1136020ffU, z);
        LIZ.LIZIZ(new ARunnableS104S0100000_4((Object) awS135S0110000_17, 75));
    }
}
