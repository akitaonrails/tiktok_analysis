package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04AG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04AG {
    public final SeaPdpViewModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final List<Object> LIZJ() {
        ?? r3;
        Map<String, Object> map;
        ?? arrayList = new ArrayList();
        try {
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLIZ;
            Object obj = (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null) ? null : map.get("expo_product_id_list");
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (!C13LP.LJJJJ(obj2, this.LIZ.LLLZIIL)) {
                        arrayList.add(obj2);
                    }
                }
            }
            arrayList.addAll(this.LIZ.LLLZIIL);
            int size = arrayList.size();
            r3 = arrayList;
            if (size > 20) {
                arrayList = arrayList.subList(arrayList.size() - 20, arrayList.size());
                return arrayList;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "PdpViewModel_sameRecommend getExpoProductList failed");
            r3 = arrayList;
        }
        return r3;
    }

    public C04AG(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final void LIZ(Context context) {
        List<String> list;
        BundleBrief bundleBrief;
        SeaPdpViewModel seaPdpViewModel = this.LIZ;
        if (!seaPdpViewModel.h) {
            seaPdpViewModel.h = true;
            ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
            if (productPackStruct != null && (bundleBrief = productPackStruct.bundleBrief) != null) {
                list = bundleBrief.bundleIdList;
            } else {
                list = null;
            }
            if (C756302xN.LIZ(list)) {
                C948503nH.LJFF(this.LIZ, C0PEM.LIZJ, new C04AE(this, context, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final List<Object> LIZIZ(String str) {
        ?? r3;
        Object obj;
        Map<String, Object> map;
        ?? arrayList = new ArrayList();
        try {
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLIZ;
            List list = null;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                obj = map.get("click_product_id_list");
            } else {
                obj = null;
            }
            if (obj instanceof List) {
                list = (List) obj;
            }
            if (str != null) {
                if (list != null) {
                    for (Object obj2 : list) {
                        if (!Intrinsics.LJFF(obj2, str)) {
                            arrayList.add(obj2);
                        }
                    }
                }
                arrayList.add(str);
            } else if (list != null) {
                arrayList.addAll(list);
            }
            int size = arrayList.size();
            r3 = arrayList;
            if (size > 20) {
                arrayList = arrayList.subList(arrayList.size() - 20, arrayList.size());
                return arrayList;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "PdpViewModel_sameRecommend getClickProductList failed");
            r3 = arrayList;
        }
        return r3;
    }
}
