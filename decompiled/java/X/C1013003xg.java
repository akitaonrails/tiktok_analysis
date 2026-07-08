package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1013003xg {
    public static final /* synthetic */ C1013003xg LIZ = new C1013003xg();
    public static final C1758380vrI LIZIZ = new C1758380vrI();

    public static C1758380vrI LIZIZ() {
        return LIZIZ;
    }

    public static int LIZ(Map map) {
        Object obj = null;
        if (map != null) {
            Object obj2 = map.get("traffic_source");
            if (obj2 != null) {
                if (obj2 instanceof Integer) {
                    return ((Number) obj2).intValue();
                }
                if (obj2 instanceof Long) {
                    return (int) ((Number) obj2).longValue();
                }
                if (obj2 instanceof Short) {
                    return ((Number) obj2).shortValue();
                }
                if (obj2 instanceof String) {
                    try {
                        return CastIntegerProtector.parseInt((String) obj2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (map != null) {
                obj = map.get("source_page_type");
            }
        }
        if (Intrinsics.LJFF(obj, "live")) {
            return 1;
        }
        if (Intrinsics.LJFF(obj, "video")) {
            return 2;
        }
        if (Intrinsics.LJFF(obj, "show_window")) {
            return 3;
        }
        if (Intrinsics.LJFF(obj, "order_detail")) {
            return 4;
        }
        if (!Intrinsics.LJFF(obj, "mall") && !Intrinsics.LJFF(obj, "flash_sale") && !Intrinsics.LJFF(obj, "new_user_deal")) {
            if (Intrinsics.LJFF(obj, "shop")) {
                return 7;
            }
            if (Intrinsics.LJFF(obj, "personal_favorite")) {
                return 5;
            }
            if (Intrinsics.LJFF(obj, "maybe_you_like")) {
                return 8;
            }
            return 0;
        }
        return 6;
    }

    public static int LIZJ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        List list;
        Object objLJJJLL;
        Map map;
        Object obj;
        if (pdpEnterParam == null) {
            return 0;
        }
        if (pdpEnterParam.productEnterContext != null) {
            Object obj2 = pdpEnterParam.requestParams.get("product_id");
            if ((obj2 instanceof List) && (list = (List) obj2) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
                Object obj3 = pdpEnterParam.productEnterContext.get(objLJJJLL);
                if (obj3 instanceof Map) {
                    map = (Map) obj3;
                } else {
                    map = null;
                }
                HashMap mapLJ = C1741890vQh.LJ("source_info", map);
                if (mapLJ != null && (obj = mapLJ.get("source_channel")) != null) {
                    C1013003xg c1013003xg = LIZ;
                    C1758310vrB.LIZJ.getClass();
                    int iLJJJJJL = C1758310vrB.LJJJJJL(obj);
                    c1013003xg.getClass();
                    if (iLJJJJJL == 1) {
                        return 1;
                    }
                    if (iLJJJJJL == 2) {
                        return 2;
                    }
                    if (iLJJJJJL == 3) {
                        return 3;
                    }
                    if (iLJJJJJL == 4) {
                        return 6;
                    }
                }
            }
        }
        return LIZ(pdpEnterParam.trackParams);
    }
}
