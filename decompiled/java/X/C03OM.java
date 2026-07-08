package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.03OM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OM {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    public static void LIZ() {
        LIZ.clear();
    }

    public static String LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = LIZ;
        if (!concurrentHashMap.containsKey(str)) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public static String LIZJ(PaymentInfo paymentInfo, List list) {
        PaymentMethod paymentMethod;
        Object next;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PaymentMethod paymentMethod2 = (PaymentMethod) next;
                if (C899503fN.LIZIZ(paymentMethod2, paymentMethod) || paymentMethod2.LJJJJZ(paymentMethod)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethod paymentMethod3 = (PaymentMethod) next;
        if (paymentMethod3 == null) {
            return null;
        }
        return paymentMethod3.id;
    }

    public static void LIZLLL(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            LIZ.put(str, str2);
        }
    }
}
