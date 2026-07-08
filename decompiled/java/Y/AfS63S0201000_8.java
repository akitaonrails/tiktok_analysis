package Y;

import X.AbstractC530360Kr4;
import X.C09JN;
import X.C0CHQ;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C533790Kwb;
import X.C535700Kzg;
import X.InterfaceC535290Kz1;

/* JADX INFO: loaded from: classes9.dex */
public class AfS63S0201000_8 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS63S0201000_8 afS63S0201000_8, Object obj) {
        AbstractC530360Kr4 abstractC530360Kr4 = (AbstractC530360Kr4) afS63S0201000_8.l0;
        int i = afS63S0201000_8.i2;
        InterfaceC535290Kz1 interfaceC535290Kz1 = (InterfaceC535290Kz1) afS63S0201000_8.l1;
        C535700Kzg c535700Kzg = (C535700Kzg) obj;
        C1C7U.LIZ("MediaManager@e18e.loadMedia$1L");
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMedia--- withRefreshType:");
        sbLIZ.append(abstractC530360Kr4);
        sbLIZ.append(",mediaType:");
        sbLIZ.append(i);
        sbLIZ.append(",result:");
        sbLIZ.append(c535700Kzg.LIZIZ.size());
        C201955140j.LIZLLL(c533790Kwb, "MediaManager", C2188811AlT.LIZIZ(sbLIZ));
        interfaceC535290Kz1.LIZ(true, c535700Kzg.LIZ.LIZ, c535700Kzg.LIZIZ, abstractC530360Kr4);
        C1C7U.LIZIZ("MediaManager@e18e.loadMedia$1L");
    }

    public static final void accept$1(AfS63S0201000_8 afS63S0201000_8, Object obj) {
        InterfaceC535290Kz1 interfaceC535290Kz1 = (InterfaceC535290Kz1) afS63S0201000_8.l0;
        int i = afS63S0201000_8.i2;
        AbstractC530360Kr4 abstractC530360Kr4 = (AbstractC530360Kr4) afS63S0201000_8.l1;
        C1C7U.LIZ("MediaManager@e18e.loadMedia$2L");
        C0CHQ.LIZ().isDebugConfigOpen();
        interfaceC535290Kz1.LIZ(false, i, null, abstractC530360Kr4);
        C1C7U.LIZIZ("MediaManager@e18e.loadMedia$2L");
    }

    public AfS63S0201000_8(int i, AbstractC530360Kr4 abstractC530360Kr4, InterfaceC535290Kz1 interfaceC535290Kz1, int i2) {
        this.$t = i2;
        if (i2 != 0) {
            this.l0 = interfaceC535290Kz1;
            this.i2 = i;
            this.l1 = abstractC530360Kr4;
        } else {
            this.l0 = abstractC530360Kr4;
            this.i2 = i;
            this.l1 = interfaceC535290Kz1;
        }
    }
}
