package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AR0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AR0 {
    public static final C1AQY LJ;
    public static final C1AR8 LJFF;
    public final C1AR6 LIZ;
    public InterfaceC2179131AQd LIZIZ;
    public C1AQY LIZJ = LJ;
    public C1AR8 LIZLLL = LJFF;

    static {
        C1AQY c1aqy = C1AQY.SEQUENCE;
        LJ = c1aqy;
        LJFF = C1AR1.LIZ(c1aqy);
    }

    public C1AR0(C1ARP c1arp) {
        this.LIZ = c1arp;
    }

    public final void LIZ(InterfaceC2179261AQq interfaceC2179261AQq) {
        String id;
        InterfaceC2179131AQd interfaceC2179131AQd = this.LIZIZ;
        if (interfaceC2179131AQd != null) {
            int i = -1;
            List<InterfaceC2179261AQq> listLIZIZ = interfaceC2179131AQd.LIZIZ();
            if (listLIZIZ != null) {
                Iterator<InterfaceC2179261AQq> it2 = listLIZIZ.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String id2 = it2.next().getId();
                    if (interfaceC2179261AQq != null) {
                        id = interfaceC2179261AQq.getId();
                    } else {
                        id = null;
                    }
                    if (Intrinsics.LJFF(id2, id)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            interfaceC2179131AQd.LIZ(i);
        }
        this.LIZ.LJI(interfaceC2179261AQq);
    }
}
