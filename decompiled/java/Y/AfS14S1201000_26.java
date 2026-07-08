package Y;

import X.C09JN;
import X.C10287040n;
import X.C1747930vaR;
import X.C1756090vnb;
import X.C1756110vnd;
import X.C1758040vqk;
import X.C1758120vqs;
import X.C1758310vrB;
import X.C1758330vrD;
import X.C1758340vrE;
import X.C1C7U;
import X.C2371809Rc;
import X.EnumC1758320vrC;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.Map;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AfS14S1201000_26 implements C09JN {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void accept$0(AfS14S1201000_26 afS14S1201000_26, Object obj) {
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$source$2");
        Throwable th = (Throwable) obj;
        C1758340vrE c1758340vrE = new C1758340vrE(((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).getProductId());
        c1758340vrE.LIZJ(EnumC1758320vrC.ERROR);
        c1758340vrE.LIZIZ();
        if (th instanceof C1758120vqs) {
            Map map = (Map) afS14S1201000_26.l2;
            Map<String, Object> map2 = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackParams;
            C1758120vqs c1758120vqs = (C1758120vqs) th;
            C1747930vaR.LIZ(afS14S1201000_26.i3, String.valueOf(c1758120vqs.getMessage()), map, String.valueOf(c1758120vqs.getCode()), map2);
            String str = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackId;
            if (str != null) {
                C1758040vqk c1758040vqkLIZ = C10287040n.LIZ(str);
                if (c1758040vqkLIZ != null) {
                    c1758040vqkLIZ.LJFF("t_fetch_data_end", false);
                    c1758040vqkLIZ.LIZJ(Integer.valueOf(c1758120vqs.getCode()), "biz_response_error_code", false);
                }
                C1756090vnb c1756090vnbLIZIZ = C1756110vnd.LIZIZ(str);
                if (c1756090vnbLIZIZ != null) {
                    c1756090vnbLIZIZ.LJII("t_fetch_data_end", false);
                }
            }
        } else {
            Object objLIZ = C2371809Rc.LIZ(th);
            if (objLIZ == null) {
                objLIZ = "";
            }
            Map map3 = (Map) afS14S1201000_26.l2;
            Map<String, Object> map4 = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackParams;
            C1747930vaR.LIZ(afS14S1201000_26.i3, String.valueOf(th.getMessage()), map3, objLIZ.toString(), map4);
            String str2 = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackId;
            if (str2 != null) {
                C1758040vqk c1758040vqkLIZ2 = C10287040n.LIZ(str2);
                if (c1758040vqkLIZ2 != null) {
                    c1758040vqkLIZ2.LJFF("t_fetch_data_end", false);
                    c1758040vqkLIZ2.LIZJ(objLIZ, "response_error_code", false);
                }
                C1756090vnb c1756090vnbLIZIZ2 = C1756110vnd.LIZIZ(str2);
                if (c1756090vnbLIZIZ2 != null) {
                    c1756090vnbLIZIZ2.LJII("t_fetch_data_end", false);
                }
            }
        }
        C1758330vrD c1758330vrD = new C1758330vrD();
        c1758330vrD.LJIIIIZZ(new AwS605S0100000_26((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1, 728));
        c1758330vrD.LIZJ(false);
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        Map<String, String> map5 = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).pdpPreParam;
        String str3 = afS14S1201000_26.s0;
        c1758310vrB.getClass();
        C1758310vrB.LJJJJI(str3, map5);
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$source$2");
    }

    public static final void accept$1(AfS14S1201000_26 afS14S1201000_26, Object obj) {
        C1758040vqk c1758040vqkLIZ;
        C1758040vqk c1758040vqkLIZ2;
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$source$2");
        Throwable th = (Throwable) obj;
        C1758340vrE c1758340vrE = new C1758340vrE(((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).getProductId());
        c1758340vrE.LIZJ(EnumC1758320vrC.ERROR);
        c1758340vrE.LIZIZ();
        if (th instanceof C1758120vqs) {
            C1758120vqs c1758120vqs = (C1758120vqs) th;
            C1747930vaR.LIZ(afS14S1201000_26.i3, String.valueOf(c1758120vqs.getMessage()), (Map) afS14S1201000_26.l2, String.valueOf(c1758120vqs.getCode()), ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackParams);
            String str = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackId;
            if (str != null && (c1758040vqkLIZ2 = C10287040n.LIZ(str)) != null) {
                c1758040vqkLIZ2.LJFF("t_fetch_data_end", false);
                c1758040vqkLIZ2.LIZJ(Integer.valueOf(c1758120vqs.getCode()), "biz_response_error_code", false);
            }
        } else {
            Object objLIZ = C2371809Rc.LIZ(th);
            if (objLIZ == null) {
                objLIZ = "";
            }
            C1747930vaR.LIZ(afS14S1201000_26.i3, String.valueOf(th.getMessage()), (Map) afS14S1201000_26.l2, objLIZ.toString(), ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackParams);
            String str2 = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).trackId;
            if (str2 != null && (c1758040vqkLIZ = C10287040n.LIZ(str2)) != null) {
                c1758040vqkLIZ.LJFF("t_fetch_data_end", false);
                c1758040vqkLIZ.LIZJ(objLIZ, "response_error_code", false);
            }
        }
        C1758330vrD c1758330vrD = new C1758330vrD();
        c1758330vrD.LJIIIIZZ(new AwS605S0100000_26((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1, 729));
        c1758330vrD.LIZJ(false);
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        Map<String, String> map = ((IPdpStarter.PdpEnterParam) afS14S1201000_26.l1).pdpPreParam;
        String str3 = afS14S1201000_26.s0;
        c1758310vrB.getClass();
        C1758310vrB.LJJJJI(str3, map);
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$source$2");
    }

    public AfS14S1201000_26(IPdpStarter.PdpEnterParam pdpEnterParam, Map map, String str, int i) {
        this.$t = i;
        this.l1 = pdpEnterParam;
        this.l2 = map;
        this.i3 = 0;
        this.s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS14S1201000_26(IPdpStarter.PdpEnterParam pdpEnterParam, IPdpStarter.PdpEnterParam pdpEnterParam2, Map<String, ? extends Object> map, int i, String str) {
        this.$t = str;
        this.l1 = pdpEnterParam;
        this.l2 = pdpEnterParam2;
        this.i3 = map;
        this.s0 = i;
    }
}
