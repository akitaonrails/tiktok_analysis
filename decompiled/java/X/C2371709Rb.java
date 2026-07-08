package X;

import Y.AfS41S1100000_3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2371709Rb {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C0X52 c0x52) {
        List<C080U> listLIZIZ;
        String str;
        C2175508fh c2175508fh = c0x52.LIZ;
        if (c2175508fh == null || (listLIZIZ = c2175508fh.LIZIZ("X-Tt-Logid")) == null || listLIZIZ.size() <= 0 || (str = ((C080U) ListProtector.get(listLIZIZ, 0)).LIZIZ) == null) {
            return "";
        }
        return str;
    }

    public static String LIZLLL(String str, boolean z) {
        if (Intrinsics.LJFF(str, "ecom_order_summary_button_placeorder")) {
            if (z) {
                return "payment_icon";
            }
            return "place_order";
        }
        if (Intrinsics.LJFF(str, "ecom_order_summary_button_paynow")) {
            return "pay_now";
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static C11JN LIZIZ(C11O8 c11o8, String str, Pair... pairArr) {
        return c11o8.LJJIJIIJIL(new AfS41S1100000_3(pairArr, str, 3)).LJJIJIIJI(new AfS41S1100000_3(pairArr, str, 4));
    }

    public static void LIZJ(int i, String str, String str2, String str3, boolean z, Pair... pairArr) {
        C1018703yb.LIZLLL("rd_tiktokec_common_network", new C948603nI(i, str, str2, str3, z, pairArr));
    }
}
