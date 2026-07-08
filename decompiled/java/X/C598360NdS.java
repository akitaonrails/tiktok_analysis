package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598360NdS {
    public static final C598360NdS LIZ = new C598360NdS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(669));

    public static ConcurrentHashMap LIZLLL() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static void LIZ(String str) {
        Collection collectionValues;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL().get(str);
        if (concurrentHashMap != null && (collectionValues = concurrentHashMap.values()) != null) {
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                ((C09AE) it2.next()).LIZIZ(null);
            }
        }
    }

    public static void LIZIZ(int i, String str) {
        C09AE c09ae;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL().get(str);
        if (concurrentHashMap != null && (c09ae = (C09AE) concurrentHashMap.get(Integer.valueOf(i))) != null) {
            c09ae.LIZIZ(null);
        }
    }

    public static void LIZJ(String str, List list) {
        C09AE c09ae;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL().get(str);
            if (concurrentHashMap != null && (c09ae = (C09AE) concurrentHashMap.get(Integer.valueOf(iIntValue))) != null) {
                c09ae.LIZIZ(null);
            }
        }
    }

    public static void LJ(int i, int i2, String str, String str2, boolean z) {
        if (str != null && str.length() != 0) {
            if (!a0.LJJLIIIJJIZ(str, '/')) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            switch (i) {
                case 1:
                    str = "/aweme/v1/oec/live/product/pop";
                    break;
                case 2:
                    str = "/aweme/v1/oec/bag/preview/assemble";
                    break;
                case 3:
                    str = "/aweme/v1/oec/live/product/pop_refresh";
                    break;
                case 4:
                    str = "/aweme/v2/oec/live/bag/diff/refresh";
                    break;
                case 5:
                    str = "/aweme/v1/oec/live/product/num";
                    break;
                case 6:
                    str = "/aweme/v1/oec/live/product/promotion";
                    break;
                case 7:
                    str = "/aweme/v1/oec/live/billboard/get";
                    break;
                case 8:
                    str = "/aweme/v1/ttec/sea_content/live/billboards";
                    break;
                default:
                    str = "";
                    break;
            }
        }
        C1018703yb.LIZLLL("rd_tiktokec_network_content", new C2380709Un(i2, str, str2, z));
    }

    public static void LJFF(String str, int i, boolean z, DispersionInfo dispersionInfo, Function1 function1, InterfaceC594300NSq interfaceC594300NSq) {
        Pair pair;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            pair = (Pair) function1.invoke(Boolean.valueOf(z));
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            pair = new Pair(null, null);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C598300NdM((C0X9S) pair.getFirst(), dispersionInfo, str, interfaceC594300NSq, i, (String) pair.getSecond(), z, function1, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.01wk, X.054G] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.01wk] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.01wk] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C054G r14, java.lang.String r15, com.bytedance.android.livesdk.model.message.DispersionInfo r16, kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function2 r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598360NdS.LJI(X.054G, java.lang.String, com.bytedance.android.livesdk.model.message.DispersionInfo, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0X52] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJIIIIZZ(X.InterfaceC497601wk r12, java.lang.String r13, com.bytedance.android.livesdk.model.message.DispersionInfo r14, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> r15, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<T>>>, ? extends java.lang.Object> r16, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<T>>> r17) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598360NdS.LJIIIIZZ(X.01wk, java.lang.String, com.bytedance.android.livesdk.model.message.DispersionInfo, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0X52] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC497601wk r13, java.lang.String r14, com.bytedance.android.livesdk.model.message.DispersionInfo r15, kotlin.jvm.internal.AwS82S1000000_32 r16, X.C598480Nde r17, X.InterfaceC1364105Vn r18) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598360NdS.LJIIJ(X.01wk, java.lang.String, com.bytedance.android.livesdk.model.message.DispersionInfo, kotlin.jvm.internal.AwS82S1000000_32, X.0Nde, X.05Vn):java.lang.Object");
    }
}
