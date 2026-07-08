package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.ShopRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.04HR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HR {
    public final PdpViewModel LIZ;

    public final void LIZ() {
        BundleBrief bundleBrief;
        PdpViewModel pdpViewModel = this.LIZ;
        if (pdpViewModel.r) {
            return;
        }
        pdpViewModel.r = true;
        ProductPackStruct productPackStruct = pdpViewModel.LLLLLJIL.LIZ.LLJILLL;
        if (C756302xN.LIZ((productPackStruct == null || (bundleBrief = productPackStruct.bundleBrief) == null) ? null : bundleBrief.bundleIdList)) {
            C948503nH.LJFF(this.LIZ, C0PEM.LIZJ, new C04AD(this, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final List<Object> LIZLLL() {
        ?? r3;
        Map<String, Object> map;
        ?? arrayList = new ArrayList();
        try {
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
            Object obj = (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null) ? null : map.get("expo_product_id_list");
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (!C13LP.LJJJJ(obj2, this.LIZ.LLZIL)) {
                        arrayList.add(obj2);
                    }
                }
            }
            arrayList.addAll(this.LIZ.LLZIL);
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

    public C04HR(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZIZ(View view) {
        PdpViewModel pdpViewModel = this.LIZ;
        if (!pdpViewModel.u) {
            pdpViewModel.u = true;
            pdpViewModel.withState(new AwS367S0200000_1(view, this, 210));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final List<Object> LIZJ(String str) {
        ?? r3;
        Object obj;
        Map<String, Object> map;
        ?? arrayList = new ArrayList();
        try {
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
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

    public final void LJFF(View view, ShopRecommendVO shopRecommendVO) {
        List<Feed> list;
        Feed feed;
        ShopProductData shopProductData;
        String str;
        CommonFeedData commonFeedData = shopRecommendVO.shopRecommendData;
        if (commonFeedData != null && (list = commonFeedData.feedList) != null && (feed = (Feed) C13LP.LJJJLZIJ(0, list)) != null && (shopProductData = feed.shopProduct) != null && (str = shopProductData.pdpSchema) != null && u.LJJIIJZLJL(str, "aweme://ec/store", false)) {
            C1748720vbi.LIZLLL(view, new AnonymousClass0497(), new AwS367S0200000_1(this, shopRecommendVO, 211));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C04HR r23, android.view.View r24, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r25, java.lang.String r26, java.lang.String r27, java.util.Map r28, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack r35) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HR.LJ(X.04HR, android.view.View, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed, java.lang.String, java.lang.String, java.util.Map, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack):void");
    }
}
