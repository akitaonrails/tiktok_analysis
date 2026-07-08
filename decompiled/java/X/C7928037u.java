package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.037u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7928037u {
    public static final C7928037u LIZ = new C7928037u();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.util.Map r6, int r7, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule r8, boolean r9, java.lang.String r10) {
        /*
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r1 = "module_name"
            java.lang.String r0 = "logistics"
            r5.put(r1, r0)
            java.lang.String r2 = ""
            java.lang.String r1 = "module_title"
            if (r6 == 0) goto L18
            java.lang.Object r0 = r6.get(r1)
            if (r0 != 0) goto L19
        L18:
            r0 = r2
        L19:
            r5.put(r1, r0)
            java.lang.String r1 = "delivery_type"
            if (r6 == 0) goto L27
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L27
            r2 = r0
        L27:
            r5.put(r1, r2)
            int r0 = r7 + 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "rank"
            r5.put(r0, r1)
            java.lang.String r4 = "more_required_amt"
            r3 = 0
            java.lang.String r2 = "0"
            if (r9 != 0) goto L7a
            if (r10 != 0) goto L47
            if (r6 == 0) goto L46
            java.lang.Object r10 = r6.get(r4)
            if (r10 != 0) goto L47
        L46:
            r10 = r2
        L47:
            r5.put(r4, r10)
        L4a:
            java.lang.String r1 = "is_plus_effective"
            if (r6 == 0) goto L55
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L55
            r2 = r0
        L55:
            r5.put(r1, r2)
            X.037u r0 = X.C7928037u.LIZ
            r0.getClass()
            if (r8 == 0) goto L61
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.daInfo
        L61:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            if (r10 == 0) goto L6b
            r0.put(r4, r10)
        L6b:
            if (r3 == 0) goto L70
            r0.putAll(r3)
        L70:
            java.lang.String r1 = X.C1741890vQh.LJIIIIZZ(r0)
            java.lang.String r0 = "delivery_info"
            r5.put(r0, r1)
            return r5
        L7a:
            r10 = r3
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7928037u.LIZ(java.util.Map, int, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule, boolean, java.lang.String):java.util.Map");
    }

    public static void LIZIZ(View view, C719202rO c719202rO, int i, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str) {
        String string;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str2;
        C03O0.LJJJJLL(C03O0.LIZ, "shop_info", null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, Integer.valueOf(i), c719202rO.LLILZLL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -10, 8388595);
        String str3 = c719202rO.LLJI;
        LIZ.getClass();
        if (str3 != null && str3.length() != 0) {
            string = str3;
        } else {
            Uri uri = UriProtector.parse(C1735460vGK.LIZ().shopInfoPopup);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str4 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str4, "height")) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "70%";
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4);
                }
                builderClearQuery.appendQueryParameter(str4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            string = builderClearQuery.build().toString();
        }
        Context context = view.getContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((str3 == null || str3.length() == 0) && (str2 = c719202rO.LLILZLL) != null) {
            linkedHashMap.put("seller_id", str2);
        }
        HashMap<String, Object> map = orderSubmitAssemViewModel.LLLIL;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            linkedHashMap2.put("enter_method", "order_submit_shop_title");
            linkedHashMap2.put("previous_page", str);
            linkedHashMap2.put("page_name", "seller_info");
            linkedHashMap.put("trackParams", linkedHashMap2);
        }
        C919503ib.LIZIZ(context, string, linkedHashMap, false).open();
    }
}
