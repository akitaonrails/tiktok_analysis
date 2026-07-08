package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03yQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1017603yQ {
    public static final /* synthetic */ C1017603yQ LIZ = new C1017603yQ();
    public static final C1758390vrJ LIZIZ = new C1758390vrJ();

    public static int LIZ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        List list;
        Object objLJJJLL;
        Map map;
        Object obj;
        int i = 0;
        if (pdpEnterParam == null) {
            return 0;
        }
        Object obj2 = null;
        if (pdpEnterParam.productEnterContext != null) {
            Object obj3 = pdpEnterParam.requestParams.get("product_id");
            if ((obj3 instanceof List) && (list = (List) obj3) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
                Object obj4 = pdpEnterParam.productEnterContext.get(objLJJJLL);
                if (obj4 instanceof Map) {
                    map = (Map) obj4;
                } else {
                    map = null;
                }
                HashMap mapLJ = C1741890vQh.LJ("source_info", map);
                if (mapLJ != null && (obj = mapLJ.get("source_channel")) != null) {
                    C1017603yQ c1017603yQ = LIZ;
                    C1758310vrB.LIZJ.getClass();
                    int iLJJJJJL = C1758310vrB.LJJJJJL(obj);
                    c1017603yQ.getClass();
                    if (iLJJJJJL != 1) {
                        if (iLJJJJJL != 2) {
                            if (iLJJJJJL != 3) {
                                if (iLJJJJJL == 4) {
                                    return 6;
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 2;
                        }
                    } else {
                        return 1;
                    }
                }
            }
        }
        Map<String, Object> map2 = pdpEnterParam.trackParams;
        if (map2 != null) {
            Object obj5 = map2.get("traffic_source");
            if (obj5 != null) {
                if (obj5 instanceof Integer) {
                    return ((Number) obj5).intValue();
                }
                if (obj5 instanceof Long) {
                    return (int) ((Number) obj5).longValue();
                }
                if (obj5 instanceof Short) {
                    return ((Number) obj5).shortValue();
                }
                if (obj5 instanceof String) {
                    try {
                        i = CastIntegerProtector.parseInt((String) obj5);
                        return i;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (map2 != null) {
                obj2 = map2.get("source_page_type");
            }
        }
        if (Intrinsics.LJFF(obj2, "live")) {
            return 1;
        }
        if (Intrinsics.LJFF(obj2, "video")) {
            return 2;
        }
        if (Intrinsics.LJFF(obj2, "show_window")) {
            return 3;
        }
        if (Intrinsics.LJFF(obj2, "order_detail")) {
            return 4;
        }
        if (!Intrinsics.LJFF(obj2, "mall") && !Intrinsics.LJFF(obj2, "flash_sale") && !Intrinsics.LJFF(obj2, "new_user_deal")) {
            if (Intrinsics.LJFF(obj2, "shop")) {
                return 7;
            }
            if (Intrinsics.LJFF(obj2, "personal_favorite")) {
                return 5;
            }
            if (!Intrinsics.LJFF(obj2, "maybe_you_like")) {
                return i;
            }
            return 8;
        }
        return 6;
    }
}
