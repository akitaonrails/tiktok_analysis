package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.17tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21176217tw {
    public static void LIZ(C1775140wIK c1775140wIK, EnumC21165817sG enumC21165817sG, Map map, C21176317tx c21176317tx) {
        Object obj;
        String strLIZJ;
        Object obj2;
        Object obj3;
        Long l;
        Long l2;
        AbstractC1773210wFD abstractC1773210wFD;
        InterfaceC21159017rA interfaceC21159017rA;
        c21176317tx.LIZ = c1775140wIK.LIZ;
        EnumC21166117sJ enumC21166117sJ = EnumC21166117sJ.NA;
        Object obj4 = null;
        if (map != null) {
            obj = map.get("bridge_center_extra_bridge_center_context");
        } else {
            obj = null;
        }
        if ((obj instanceof InterfaceC21159017rA) && (interfaceC21159017rA = (InterfaceC21159017rA) obj) != null) {
            enumC21166117sJ = EnumC21166117sJ.FE;
            strLIZJ = interfaceC21159017rA.LIZJ();
            c21176317tx.LIZIZ = strLIZJ;
        } else {
            strLIZJ = null;
        }
        if (map != null) {
            obj2 = map.get("bridge_center_extra_lynx_item_vo");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof AbstractC1773210wFD) && (abstractC1773210wFD = (AbstractC1773210wFD) obj2) != null) {
            c21176317tx.LIZJ = abstractC1773210wFD.LJIIJJI();
        }
        if (map != null) {
            obj3 = map.get("t_na_jsb_trigger_signal_start");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Long) && (l2 = (Long) obj3) != null) {
            c21176317tx.LJIIJ = Long.valueOf(l2.longValue());
        }
        c21176317tx.LIZLLL = enumC21166117sJ;
        if (map != null) {
            obj4 = map.get("t_lynx_trigger_signal_jsb_start");
        }
        if ((obj4 instanceof Long) && (l = (Long) obj4) != null) {
            c21176317tx.LJIIIZ = Long.valueOf(l.longValue());
        }
        int i = C21165917sH.LIZ[enumC21165817sG.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c21176317tx.LJIJJLI = Long.valueOf(System.currentTimeMillis());
                return;
            }
            throw new C1954807lC();
        }
        c21176317tx.LJIIJJI = Long.valueOf(System.currentTimeMillis());
        C21176117tv c21176117tv = C21176117tv.LIZ;
        String str = c1775140wIK.LIZ;
        c21176117tv.getClass();
        if (!((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIILIIL(str)) {
            return;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("name", str), new Pair("sender_type", enumC21166117sJ.getValue()));
        if (strLIZJ != null) {
            mapLJIIJ.put("sender_url", strLIZJ);
        }
        C1018703yb.LJ("rd_ec_mix_mall_call_method_start", mapLJIIJ);
    }
}
