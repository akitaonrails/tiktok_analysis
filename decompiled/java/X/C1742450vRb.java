package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742450vRb {
    public final SeaPdpViewModel LIZ;
    public String LIZIZ;
    public volatile String LIZJ = "";

    public final JSONObject LIZ() throws JSONException {
        String str = this.LIZJ;
        String str2 = this.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("loading_status", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", str2);
        jSONObject2.put("pdp_data", jSONObject);
        return jSONObject2;
    }

    public C1742450vRb(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi.SpotlightRequest LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r10, X.InterfaceC1748810vbr r11) {
        /*
            java.lang.String r0 = "lib_track_builtin_lane_business"
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r1 = X.C1748730vbj.LIZIZ(r11, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi$ContextProductInfo r4 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi$ContextProductInfo
            java.lang.String r3 = r10.VR2()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r10.LLJIJIL
            boolean r2 = X.C041G.LJIILLIIL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r10.LLJIJIL
            r10 = 0
            if (r2 == 0) goto L9c
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo r0 = r0.sellerInfo
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.platformSellerId
        L1f:
            r4.<init>(r3, r0)
            java.util.List r2 = java.util.Collections.singletonList(r4)
            java.lang.String r0 = "traffic_source"
            java.lang.Object r4 = r1.get(r0)
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L9a
            java.lang.Integer r4 = (java.lang.Integer) r4
        L32:
            java.lang.String r0 = "traffic_source_list"
            java.lang.Object r5 = r1.get(r0)
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L98
            java.util.List r5 = (java.util.List) r5
        L3e:
            java.lang.String r0 = "enter_from"
            java.lang.Object r6 = r1.get(r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L96
            java.lang.String r6 = (java.lang.String) r6
        L4a:
            java.lang.String r0 = "enter_from_merge"
            java.lang.Object r7 = r1.get(r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L94
            java.lang.String r7 = (java.lang.String) r7
        L56:
            java.lang.String r0 = "previous_page"
            java.lang.Object r8 = r1.get(r0)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L92
            java.lang.String r8 = (java.lang.String) r8
        L62:
            java.lang.String r0 = "author_id"
            java.lang.Object r9 = r1.get(r0)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L90
            java.lang.String r9 = (java.lang.String) r9
        L6e:
            java.lang.String r0 = "enter_from_info"
            java.lang.Object r11 = r1.get(r0)
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L8e
            java.lang.String r11 = (java.lang.String) r11
        L7a:
            java.lang.String r0 = "first_source_page"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L87
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
        L87:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi$SpotlightRequest r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi$SpotlightRequest
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L8e:
            r11 = r10
            goto L7a
        L90:
            r9 = r10
            goto L6e
        L92:
            r8 = r10
            goto L62
        L94:
            r7 = r10
            goto L56
        L96:
            r6 = r10
            goto L4a
        L98:
            r5 = r10
            goto L3e
        L9a:
            r4 = r10
            goto L32
        L9c:
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo r0 = r0.sellerInfo
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.sellerId
            goto L1f
        La6:
            r0 = r10
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742450vRb.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel, X.0vbr):com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.SpotlightApi$SpotlightRequest");
    }
}
