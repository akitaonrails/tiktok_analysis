package X;

import android.os.CountDownTimer;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C799403Ai {
    public static CountDownTimer LIZIZ;
    public static OrderSubmitAssemViewModel LIZJ;
    public static final C799403Ai LIZ = new C799403Ai();
    public static final ConcurrentHashMap<String, C800303Ar> LIZLLL = new ConcurrentHashMap<>();
    public static final Map<String, Integer> LJ = new LinkedHashMap();

    public static String LIZ(C719102rN c719102rN) {
        PromotionSellingPoint promotionSellingPoint;
        String str;
        StringBuilder sb = new StringBuilder("");
        List<PromotionLogo> list = c719102rN.LLJJ;
        if (list != null) {
            int i = 0;
            for (PromotionLogo promotionLogo : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PromotionLogo promotionLogo2 = promotionLogo;
                    if (i == 0) {
                        sb.append(promotionLogo2.daInfo);
                    } else {
                        sb.append("|||");
                        sb.append(promotionLogo2.daInfo);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        List<PromotionSellingPoint> list2 = c719102rN.LLLLLLL;
        if (list2 != null && (promotionSellingPoint = (PromotionSellingPoint) C13LP.LJJJLL(list2)) != null && (str = promotionSellingPoint.daInfo) != null) {
            if (sb.length() > 0) {
                sb.append("|||");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String LIZIZ(C719102rN c719102rN) {
        List<UserRightDetail> list;
        UserRightDetail next;
        String str;
        UserRight userRight = c719102rN.LLJJIII;
        if (userRight != null && (list = userRight.userRightDetails) != null) {
            Iterator<UserRightDetail> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.expose, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            UserRightDetail userRightDetail = next;
            if (userRightDetail != null && (str = userRightDetail.id) != null) {
                int i = CastIntegerProtector.parseInt(str);
                if (i != 2) {
                    if (i == 2080) {
                        return "final_sale";
                    }
                    return "";
                }
                return "free_return";
            }
            return "";
        }
        return "";
    }

    public static Long LIZJ(String str) {
        C800303Ar c800303Ar = (C800303Ar) C7726030a.LIZ(str, LIZLLL);
        if (c800303Ar != null) {
            return Long.valueOf(c800303Ar.LIZ);
        }
        return null;
    }
}
