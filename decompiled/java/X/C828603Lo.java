package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C828603Lo {
    public final ConcurrentHashMap<String, UserVirtualInfo> LIZ = new ConcurrentHashMap<>();
    public int LIZIZ;
    public C1397510mTF LIZJ;

    public final boolean LIZJ() {
        int i = this.LIZIZ;
        return i == 0 || i == 1;
    }

    public final boolean LIZLLL() {
        int i = this.LIZIZ;
        return i == 1 || i == 2 || i == 3;
    }

    public final String LJ() {
        for (Map.Entry<String, UserVirtualInfo> entry : this.LIZ.entrySet()) {
            String str = entry.getValue().userVirtualInfoId;
            if (str == null || str.length() == 0 || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, entry.getValue().userVirtualInfoId)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public final boolean LJI() {
        if (!LIZLLL()) {
            return true;
        }
        for (UserVirtualInfo userVirtualInfo : this.LIZ.values()) {
            String str = userVirtualInfo != null ? userVirtualInfo.userVirtualInfoId : null;
            if (str != null && str.length() != 0) {
                if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, userVirtualInfo != null ? userVirtualInfo.userVirtualInfoId : null)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r9, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r10) {
        /*
            java.lang.String r7 = r10.n
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r10.LLLIL
            r8 = 0
            if (r1 == 0) goto L16
            java.lang.String r0 = "source_page_type"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L16
            java.lang.String r4 = r0.toString()
        L13:
            if (r9 == 0) goto L35
            goto L18
        L16:
            r4 = r8
            goto L13
        L18:
            android.content.res.Resources r3 = r9.getResources()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "navigation_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r1 = X.C786410Ut5.n3(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L31
            if (r1 <= 0) goto L35
            android.content.res.Resources r0 = r9.getResources()     // Catch: java.lang.Throwable -> L31
            int r0 = r0.getDimensionPixelSize(r1)     // Catch: java.lang.Throwable -> L31
            goto L36
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L35:
            r0 = 0
        L36:
            double r5 = (double) r0
            int r0 = X.C958103op.LIZJ()
            double r0 = (double) r0
            double r5 = r5 / r0
            java.lang.String r0 = "one_step_checkout"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L90
            r2 = 90
            r7 = 37
            r1 = 100
            if (r4 != 0) goto L60
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            double r2 = (double) r2
            double r0 = (double) r1
            double r5 = r5 * r0
            double r2 = r2 + r5
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)
            return r0
        L60:
            java.lang.String r0 = "live"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L7d
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            r0 = 73
            double r2 = (double) r0
            double r0 = (double) r1
            double r5 = r5 * r0
            double r2 = r2 + r5
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)
            return r0
        L7d:
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            double r2 = (double) r2
            double r0 = (double) r1
            double r5 = r5 * r0
            double r2 = r2 + r5
            r4.append(r2)
            r4.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)
            return r0
        L90:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C828603Lo.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):java.lang.String");
    }

    public final UserVirtualInfo LIZ(String str, boolean z) {
        boolean z2;
        ConcurrentHashMap<String, UserVirtualInfo> concurrentHashMap = this.LIZ;
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || str == null || str.length() == 0 || z || !this.LIZ.keySet().contains(str)) {
            return null;
        }
        return this.LIZ.get(str);
    }

    public static void LJFF(String str, UserVirtualInfo userVirtualInfo, Context context, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        Object obj;
        int i;
        String str2;
        String str3;
        if (str != null) {
            try {
                String strDecode = URLDecoder.decode(str, "UTF-8");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", "order_submit");
                HashMap<String, Object> map = orderSubmitAssemViewModel.LLLIL;
                String str4 = "";
                if (map == null || (obj = map.get("previous_page")) == null) {
                    obj = "";
                }
                linkedHashMap.put("previous_page", obj);
                Uri.Builder builderBuildUpon = UriProtector.parse(strDecode).buildUpon();
                if (Intrinsics.LJFF(orderSubmitAssemViewModel.n, "normal_checkout")) {
                    i = 1;
                } else {
                    i = 2;
                }
                Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("pack_type", String.valueOf(i));
                if (userVirtualInfo == null || (str2 = userVirtualInfo.userVirtualInfoId) == null) {
                    str2 = "";
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("user_virtual_info_id", str2);
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
                if (strLJIIIIZZ == null) {
                    strLJIIIIZZ = "";
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("track_params", strLJIIIIZZ);
                if (Intrinsics.LJFF(orderSubmitAssemViewModel.n, "one_step_checkout")) {
                    builderAppendQueryParameter3.appendQueryParameter("transition_animation", "right");
                }
                String strLIZIZ = LIZIZ(context, orderSubmitAssemViewModel);
                if (strLIZIZ != null) {
                    builderAppendQueryParameter3.appendQueryParameter("height", strLIZIZ);
                }
                String string = builderAppendQueryParameter3.build().toString();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(string);
                if (userVirtualInfo != null && (str3 = userVirtualInfo.userVirtualInfoStr) != null) {
                    str4 = str3;
                }
                sparkContext.LJJJZ("user_virtual_info_str", str4);
                C1541950qED.LIZJ.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
