package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.17tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21176117tv {
    public static final C21176117tv LIZ = new C21176117tv();

    public static void LIZ(C21176317tx c21176317tx, EnumC21165817sG enumC21165817sG) {
        boolean zLJIILIIL;
        String str;
        Integer num;
        if (!((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIILIIL(c21176317tx.LIZ)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = c21176317tx.LIZ;
        if (str2 != null) {
            linkedHashMap.put("name", str2);
        }
        String str3 = c21176317tx.LIZIZ;
        if (str3 != null) {
            linkedHashMap.put("sender_url", str3);
        }
        String str4 = c21176317tx.LIZJ;
        if (str4 != null) {
            linkedHashMap.put("sender_bff_type", str4);
        }
        EnumC21166117sJ enumC21166117sJ = c21176317tx.LIZLLL;
        if (enumC21166117sJ != null) {
            linkedHashMap.put("sender_type", enumC21166117sJ.getValue());
        }
        EnumC21165817sG enumC21165817sG2 = EnumC21165817sG.METHOD;
        if (enumC21165817sG == enumC21165817sG2) {
            String str5 = c21176317tx.LJ;
            if (str5 != null) {
                linkedHashMap.put("receiver_url", str5);
            }
            String str6 = c21176317tx.LJFF;
            if (str6 != null) {
                linkedHashMap.put("receiver_bff_type", str6);
            }
            EnumC21166117sJ enumC21166117sJ2 = c21176317tx.LJI;
            if (enumC21166117sJ2 != null) {
                linkedHashMap.put("receiver_type", enumC21166117sJ2.getValue());
            }
            Integer num2 = c21176317tx.LJII;
            if (num2 != null) {
                linkedHashMap.put("code", Integer.valueOf(num2.intValue()));
            }
            String str7 = c21176317tx.LJIIIIZZ;
            if (str7 != null) {
                linkedHashMap.put("message", str7);
            }
        }
        if (enumC21165817sG == enumC21165817sG2 && (num = c21176317tx.LJII) != null && num.intValue() != 1 && ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIIZILJ(c21176317tx.LIZ)) {
            C1018703yb.LJ("rd_ec_mix_mall_call_method_error", linkedHashMap);
        }
        if (enumC21165817sG == EnumC21165817sG.EVENT) {
            zLJIILIIL = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIIIIZZ(c21176317tx.LIZ);
        } else {
            zLJIILIIL = ((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIILIIL(c21176317tx.LIZ);
        }
        if (!zLJIILIIL) {
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        Long l = c21176317tx.LJIIIZ;
        if (l != null) {
            linkedHashMap2.put("t_lynx_trigger_signal_jsb_start", Long.valueOf(l.longValue()));
        }
        Long l2 = c21176317tx.LJIIJ;
        if (l2 != null) {
            linkedHashMap2.put("t_na_jsb_trigger_signal_start", Long.valueOf(l2.longValue()));
        }
        Long l3 = c21176317tx.LJIIJJI;
        if (l3 != null) {
            linkedHashMap2.put("t_bridge_center_call_method_start", Long.valueOf(l3.longValue()));
        }
        Long l4 = c21176317tx.LJIIL;
        if (l4 != null) {
            linkedHashMap2.put("t_bridge_center_find_method_start", Long.valueOf(l4.longValue()));
        }
        Long l5 = c21176317tx.LJIILIIL;
        if (l5 != null) {
            linkedHashMap2.put("t_bridge_center_find_method_end", Long.valueOf(l5.longValue()));
        }
        Long l6 = c21176317tx.LJIILJJIL;
        if (l6 != null) {
            linkedHashMap2.put("t_bridge_center_method_handler_start", Long.valueOf(l6.longValue()));
        }
        Long l7 = c21176317tx.LJIILL;
        if (l7 != null) {
            linkedHashMap2.put("t_bridge_center_method_handler_end", Long.valueOf(l7.longValue()));
        }
        Long l8 = c21176317tx.LJIILLIIL;
        if (l8 != null) {
            linkedHashMap2.put("t_handler_lynx_start", Long.valueOf(l8.longValue()));
        }
        Long l9 = c21176317tx.LJIIZILJ;
        if (l9 != null) {
            linkedHashMap2.put("t_handler_lynx_end", Long.valueOf(l9.longValue()));
        }
        Long l10 = c21176317tx.LJIJ;
        if (l10 != null) {
            linkedHashMap2.put("t_bridge_center_method_callback_start", Long.valueOf(l10.longValue()));
        }
        Long l11 = c21176317tx.LJIJI;
        if (l11 != null) {
            linkedHashMap2.put("t_bridge_center_method_callback_end", Long.valueOf(l11.longValue()));
        }
        Integer num3 = c21176317tx.LJIJJ;
        if (num3 != null) {
            linkedHashMap2.put("observer_count", Integer.valueOf(num3.intValue()));
        }
        Long l12 = c21176317tx.LJIJJLI;
        if (l12 != null) {
            linkedHashMap2.put("t_bridge_center_send_event_start", Long.valueOf(l12.longValue()));
        }
        Long l13 = c21176317tx.LJIL;
        if (l13 != null) {
            linkedHashMap2.put("t_bridge_center_find_observer_start", Long.valueOf(l13.longValue()));
        }
        Long l14 = c21176317tx.LJJ;
        if (l14 != null) {
            linkedHashMap2.put("t_bridge_center_find_observer_end", Long.valueOf(l14.longValue()));
        }
        Long l15 = c21176317tx.LJJI;
        if (l15 != null) {
            linkedHashMap2.put("t_bridge_center_send_event_end", Long.valueOf(l15.longValue()));
        }
        if (C21166017sI.LIZ[enumC21165817sG.ordinal()] == 1) {
            str = "rd_ec_mix_mall_send_event_perf";
        } else {
            str = "rd_ec_mix_mall_call_method_monitor";
        }
        C1018703yb.LJ(str, linkedHashMap2);
    }
}
