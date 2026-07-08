package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C864503Zj {
    public static final C864503Zj LIZ = new C864503Zj();
    public static C864703Zl LIZIZ;

    public static Pair LIZ(Context context) {
        String str;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && C960203pA.LIZIZ(c19egLIZIZ)) {
            str = "dark";
        } else {
            str = "light";
        }
        return new Pair("theme", str);
    }

    public static boolean LIZJ(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        PaymentMethod[] paymentMethodArr = new PaymentMethod[2];
        PaymentMethod paymentMethod2 = null;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        paymentMethodArr[0] = paymentMethod;
        if (paymentInfo != null) {
            paymentMethod2 = paymentInfo.LIZIZ;
        }
        paymentMethodArr[1] = paymentMethod2;
        ArrayList arrayList = (ArrayList) C13LQ.LJIJI(paymentMethodArr);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((PaymentMethod) it2.next()).id, "pm_pi_ins_pipobnpl_c_d")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181 A[PHI: r7
      0x0181: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v11 java.lang.String), (r7v11 java.lang.String), (r7v11 java.lang.String) binds: [B:77:0x017d, B:12:0x0015, B:14:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.03Zl, X.0gPT] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r43, final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r44, boolean r45, final java.lang.String r46, final kotlin.jvm.functions.Function2 r47, final kotlin.jvm.functions.Function2 r48) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C864503Zj.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2):void");
    }
}
