package X;

import com.bytedance.goda.model.dto.GodaCardData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.SkuDescriptor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.045a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10404045a {
    public final PdpViewModel LIZ;
    public SkuDescriptor LIZIZ = new SkuDescriptor(null, "");
    public GodaCardData LIZJ;

    public final Map<String, Object> LIZ() {
        List<SkuItem> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sku_descriptor", this.LIZIZ);
        linkedHashMap.put("biz_params", LIZIZ());
        ProductPackStruct productPackStruct = this.LIZ.LLJILLL;
        if (productPackStruct != null && (list = productPackStruct.skus) != null) {
            linkedHashMap.put("skus", list);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment.BizParams LIZIZ() {
        /*
            r23 = this;
            r1 = r23
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r1.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam r5 = r0.LLJI
            r3 = 0
            if (r5 == 0) goto L5f
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.productEnterContext
        Lb:
            java.lang.String r7 = r0.DR2()
            if (r5 == 0) goto L5d
            java.lang.String r8 = r5.sourceInfo
        L13:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r1.LIZ
            java.lang.String r9 = r0.RH2()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r1.LIZ
            java.lang.String r10 = r0.LR2()
            if (r5 == 0) goto L59
            java.lang.String r4 = r5.enterViewName
            java.lang.String r12 = r5.pipeParams
            java.lang.Integer r0 = r5.autoAddToCart
            if (r0 == 0) goto L5b
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L5b
            r13 = 1
        L31:
            if (r5 == 0) goto L54
            java.lang.Integer r14 = r5.bizType
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.orderRequestParams
            java.lang.Integer r1 = r5.ocpFlag
            java.lang.String r0 = r5.ocpOrderId
            com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext r3 = r5.ocpContext
        L3d:
            com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment$BizParams r5 = new com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment$BizParams
            java.lang.String r11 = "product_detail"
            r15 = 0
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            r18 = r15
            r19 = r2
            r20 = r1
            r21 = r0
            r22 = r3
            r17 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r5
        L54:
            r14 = r3
            r2 = r3
            r1 = r3
            r0 = r3
            goto L3d
        L59:
            r4 = r3
            r12 = r3
        L5b:
            r13 = 0
            goto L31
        L5d:
            r8 = r3
            goto L13
        L5f:
            r6 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10404045a.LIZIZ():com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment$BizParams");
    }

    public C10404045a(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public static SkuDescriptor LJ(Object obj) {
        String string;
        List list;
        List list2;
        String string2;
        Type type;
        SkuDescriptor skuDescriptor;
        ArrayList arrayList = null;
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(SkuDescriptor.class));
                } else {
                    type = new TypeToken<SkuDescriptor>() { // from class: X.0469
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof SkuDescriptor)) {
                    objFromJson = null;
                }
                skuDescriptor = (SkuDescriptor) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (skuDescriptor == null) {
                return new SkuDescriptor(null, "");
            }
            return skuDescriptor;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get("sku_id");
            if (obj2 == null || (string = obj2.toString()) == null) {
                string = "";
            }
            Object obj3 = map.get("sub_product_prop_value_ids");
            if ((obj3 instanceof List) && (list = (List) obj3) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if ((obj4 instanceof List) && (list2 = (List) obj4) != null) {
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (Object obj5 : list2) {
                            if (obj5 != null) {
                                string2 = obj5.toString();
                            } else {
                                string2 = null;
                            }
                            arrayList3.add(string2);
                        }
                        arrayList2.add(arrayList3);
                    }
                }
                arrayList = arrayList2;
            }
            return new SkuDescriptor(arrayList, string);
        }
        return new SkuDescriptor(null, "");
    }

    public final Map<String, Object> LIZJ(int i) {
        Map<String, Object> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("product_id", this.LIZ.getProductId());
        String strLJIIJ = this.LIZ.LLILZIL.LJIIJ(i, null);
        if (strLJIIJ != null) {
            linkedHashMap.put("source_btm_token", strLJIIJ);
        }
        linkedHashMap.put("sku_descriptor", this.LIZIZ);
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            linkedHashMap.put("track_params", map);
        }
        linkedHashMap.put("biz_params", LIZIZ());
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10404045a.LIZLLL(java.lang.String, java.lang.String):void");
    }
}
