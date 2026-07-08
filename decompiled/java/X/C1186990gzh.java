package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186990gzh implements InterfaceC1181300gqW {
    public C1183500gu4 LIZ = new C1183500gu4(new ArrayList(), null);
    public EnumC1187020gzk LIZIZ = EnumC1187020gzk.INITIAL_FETCH;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(com.ss.android.ugc.aweme.slash.data.SlashRequestParam r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186990gzh.LIZJ(com.ss.android.ugc.aweme.slash.data.SlashRequestParam):java.util.Map");
    }

    @Override // X.InterfaceC1181300gqW
    public final C11NZ<SlashApiResponse> LIZ(SlashRequestParam slashRequestParam) {
        return C11NZ.LJIJJLI(new C1209010hZD(slashRequestParam, this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.slash.data.SlashRequestParam LIZIZ(java.lang.String r16, java.util.List<com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit> r17, java.lang.String r18, java.lang.String r19, X.EnumC1187020gzk r20, X.EnumC1187010gzj r21, java.lang.String r22) {
        /*
            r15 = this;
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r6 = r15
            X.0gu4 r0 = r6.LIZ
            java.util.List<com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem> r0 = r0.LIZ
            java.util.Iterator r5 = r0.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem r4 = (com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem) r4
            if (r17 == 0) goto L47
            java.util.Iterator r2 = r17.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit r0 = (com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit) r0
            java.lang.String r1 = r0.skuId
            java.lang.String r0 = r4.skuId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L20
        L37:
            com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit r3 = (com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit) r3
            if (r3 == 0) goto L47
            java.lang.String r2 = r4.skuId
            java.lang.Integer r1 = r3.buyLimit
            java.lang.String r0 = r4.productId
            com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem r0 = r4.copy(r2, r1, r0)
            if (r0 != 0) goto L51
        L47:
            java.lang.String r2 = r4.skuId
            java.lang.Integer r1 = r4.quantity
            java.lang.String r0 = r4.productId
            com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem r0 = r4.copy(r2, r1, r0)
        L51:
            r8.add(r0)
            goto Le
        L55:
            r3 = 0
            goto L37
        L57:
            r10 = 0
            r14 = r22
            r13 = r21
            r12 = r19
            r11 = r18
            r7 = r16
            r9 = r20
            com.ss.android.ugc.aweme.slash.data.SlashRequestParam r0 = r6.LIZLLL(r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186990gzh.LIZIZ(java.lang.String, java.util.List, java.lang.String, java.lang.String, X.0gzk, X.0gzj, java.lang.String):com.ss.android.ugc.aweme.slash.data.SlashRequestParam");
    }

    public final SlashRequestParam LIZLLL(String str, List<BuySkuItem> list, EnumC1187020gzk enumC1187020gzk, Map<String, ? extends Object> map, String str2, String str3, EnumC1187010gzj enumC1187010gzj, String str4) throws JSONException {
        String strLJIJ;
        Map<String, ? extends Object> map2 = map;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_chunk", false);
        jSONObject.put("is_event", false);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("migrate_slash", true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("biz_params", C786410Ut5.J3(jSONObject2));
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService == null || (strLJIJ = iPIPOCashierService.LJIJ()) == null) {
            strLJIJ = "";
        }
        if (enumC1187020gzk != EnumC1187020gzk.REFRESH_COUPON_PANEL) {
            map2 = this.LIZ.LIZIZ;
        }
        return new SlashRequestParam("order", "prepare", jSONObject, linkedHashMap, enumC1187020gzk, new C1187000gzi(str, list, strLJIJ, map2, str2, str3, enumC1187010gzj, str4));
    }
}
