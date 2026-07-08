package Y;

import X.C013C;
import X.C09JN;
import X.C1758370vrH;
import X.C1758380vrI;
import X.C1758390vrJ;
import X.C1893760zNe;
import X.C19EG;
import X.C1C7U;
import X.C672920QaQ;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;

/* JADX INFO: loaded from: classes27.dex */
public class AfS0S0510300_26 implements C09JN {
    public final int $t;
    public long j6;
    public long j7;
    public long j8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

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

    public static final void accept$0(AfS0S0510300_26 afS0S0510300_26, Object obj) {
        C1C7U.LIZ("PdpStarterOptimized@4303.jump2PdpInterceptor$1$1$requestTask$1");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        C013C c013c = (C013C) afS0S0510300_26.l0;
        if (c013c.element) {
            C672920QaQ.LIZ("wait error 1", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
        } else {
            c013c.element = true;
            if (!afS0S0510300_26.z5 && System.currentTimeMillis() - afS0S0510300_26.j6 > afS0S0510300_26.j7) {
                C672920QaQ.LIZ("wait time out 1", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
            } else {
                C1758370vrH c1758370vrH = (C1758370vrH) afS0S0510300_26.l2;
                if (c1758370vrH.LIZLLL == null) {
                    c1758370vrH.LIZLLL = productPackStruct;
                }
                if (!((C19EG) afS0S0510300_26.l3).isFinishing() && !((C19EG) afS0S0510300_26.l3).isDestroyed() && C1893760zNe.LIZ((C19EG) afS0S0510300_26.l3, false)) {
                    C672920QaQ.LIZ("wait response", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
                    if (((C1758380vrI) afS0S0510300_26.l4).LIZIZ((C19EG) afS0S0510300_26.l3, (C1758370vrH) afS0S0510300_26.l2, (IPdpStarter.PdpEnterParam) afS0S0510300_26.l1, afS0S0510300_26.j8)) {
                        C672920QaQ.LIZ("wait finish", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
                    }
                } else {
                    C672920QaQ.LIZ("wait context error", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
                }
            }
        }
        C1C7U.LIZIZ("PdpStarterOptimized@4303.jump2PdpInterceptor$1$1$requestTask$1");
    }

    public static final void accept$1(AfS0S0510300_26 afS0S0510300_26, Object obj) {
        C1C7U.LIZ("SeaPdpStarterOptimized@3f18.jump2PdpInterceptor$1$1$requestTask$1");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        C013C c013c = (C013C) afS0S0510300_26.l0;
        if (c013c.element) {
            C672920QaQ.LIZ("wait error 1", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
        } else {
            c013c.element = true;
            if (!afS0S0510300_26.z5 && System.currentTimeMillis() - afS0S0510300_26.j6 > afS0S0510300_26.j7) {
                C672920QaQ.LIZ("wait time out 1", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
            } else {
                C1758370vrH c1758370vrH = (C1758370vrH) afS0S0510300_26.l2;
                if (c1758370vrH.LIZLLL == null) {
                    c1758370vrH.LIZLLL = productPackStruct;
                }
                if (!((C19EG) afS0S0510300_26.l3).isFinishing() && !((C19EG) afS0S0510300_26.l3).isDestroyed() && C1893760zNe.LIZ((C19EG) afS0S0510300_26.l3, false)) {
                    C672920QaQ.LIZ("wait response", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
                    if (C1758390vrJ.LIZIZ((C19EG) afS0S0510300_26.l3, (C1758370vrH) afS0S0510300_26.l2, (IPdpStarter.PdpEnterParam) afS0S0510300_26.l1, afS0S0510300_26.j8)) {
                        C672920QaQ.LIZ("wait finish", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
                    }
                } else {
                    C672920QaQ.LIZ("wait context error", ((IPdpStarter.PdpEnterParam) afS0S0510300_26.l1).trackParams);
                }
            }
        }
        C1C7U.LIZIZ("SeaPdpStarterOptimized@3f18.jump2PdpInterceptor$1$1$requestTask$1");
    }

    public AfS0S0510300_26(Object obj, Object obj2, boolean z, long j, long j2, Object obj3, Object obj4, Object obj5, long j3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z5 = z;
        this.j6 = j;
        this.j7 = j2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.j8 = j3;
    }
}
