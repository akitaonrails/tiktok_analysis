package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332170D0l {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        int iIntValue;
        InterfaceC332180D0m.LIZ.getClass();
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(C332230D0r.LIZ().getString("ucp_demo.order_details.recommend_fail_remaining", CardStruct.IStatusCode.DEFAULT));
        if (numLJIIJJI == null || (iIntValue = numLJIIJJI.intValue()) < 0) {
            iIntValue = 0;
        }
        if (iIntValue <= 0) {
            C332230D0r.LIZ().putString("ucp_demo.order_details.recommend_debug_status", "none");
            C332230D0r.LIZ().putString("ucp_demo.order_details.recommend_fail_remaining", CardStruct.IStatusCode.DEFAULT);
            return false;
        }
        int i = iIntValue - 1;
        int i2 = i >= 0 ? i : 0;
        C332230D0r.LIZ().putString("ucp_demo.order_details.recommend_fail_remaining", String.valueOf(i2));
        if (i2 == 0) {
            C332230D0r.LIZ().putString("ucp_demo.order_details.recommend_debug_status", "none");
        }
        return true;
    }

    public static String LIZIZ() {
        InterfaceC332180D0m.LIZ.getClass();
        return C332230D0r.LIZ().getString("ucp_demo.recommend.scene_debug_status", "none");
    }

    public static boolean LIZJ() {
        InterfaceC332180D0m.LIZ.getClass();
        return Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.checkout_acp_use_mock_product", "false"), "true");
    }

    public static boolean LIZLLL() {
        InterfaceC332180D0m.LIZ.getClass();
        return Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.orders.force_empty_status", "false"), "true");
    }
}
