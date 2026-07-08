package Y;

import X.C09JN;
import X.C10287040n;
import X.C1758040vqk;
import X.C1758310vrB;
import X.C1C7U;
import X.C23250099c;
import X.C598600Ndq;
import X.C598610Ndr;
import X.C817503Hh;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public class AfS5S0211000_26 implements C09JN {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void accept$0(AfS5S0211000_26 afS5S0211000_26, Object obj) {
        C1758040vqk c1758040vqkLIZ;
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$source$3");
        String str = ((IPdpStarter.PdpEnterParam) afS5S0211000_26.l0).trackId;
        if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            c1758040vqkLIZ.LJFF("t_request_start", false);
        }
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1758310vrB.getClass();
        C1758310vrB.LIZLLL = jCurrentTimeMillis;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C598600Ndq((Map) afS5S0211000_26.l1, (IPdpStarter.PdpEnterParam) afS5S0211000_26.l0, afS5S0211000_26.z2, afS5S0211000_26.i3, null), 3);
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$source$3");
    }

    public static final void accept$1(AfS5S0211000_26 afS5S0211000_26, Object obj) {
        C1758040vqk c1758040vqkLIZ;
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$source$3");
        String str = ((IPdpStarter.PdpEnterParam) afS5S0211000_26.l0).trackId;
        if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            c1758040vqkLIZ.LJFF("t_request_start", false);
        }
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1758310vrB.getClass();
        C1758310vrB.LIZLLL = jCurrentTimeMillis;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C598610Ndr((Map) afS5S0211000_26.l1, (IPdpStarter.PdpEnterParam) afS5S0211000_26.l0, afS5S0211000_26.z2, afS5S0211000_26.i3, null), 3);
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$source$3");
    }

    public AfS5S0211000_26(IPdpStarter.PdpEnterParam pdpEnterParam, Map map, int i) {
        this.$t = i;
        this.l0 = pdpEnterParam;
        this.l1 = map;
        this.z2 = false;
        this.i3 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS5S0211000_26(IPdpStarter.PdpEnterParam pdpEnterParam, IPdpStarter.PdpEnterParam pdpEnterParam2, Map<String, ? extends Object> map, boolean z, int i) {
        this.$t = i;
        this.l0 = pdpEnterParam;
        this.l1 = pdpEnterParam2;
        this.z2 = map;
        this.i3 = z ? 1 : 0;
    }
}
