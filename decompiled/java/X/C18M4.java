package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18M4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18M4 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ AnchorProductInfoModel LLILZIL;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18M4(int i, AnchorProductInfoModel anchorProductInfoModel, Aweme aweme, String str, List list, Map map, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = aweme;
        this.LLILZIL = anchorProductInfoModel;
        this.LLILZLL = list;
        this.LLIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[PHI: r2
      0x0074: PHI (r2v2 com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) = 
      (r2v1 com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel)
      (r2v7 com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel)
     binds: [B:17:0x0066, B:21:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C957403oi r5) {
        /*
            r4 = this;
            X.03oi r5 = (X.C957403oi) r5
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r5.LIZLLL(r1, r0)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "video"
            r5.LIZLLL(r1, r0)
            boolean r0 = r4.LL
            if (r0 == 0) goto Lbe
            java.lang.String r1 = "yes"
        L16:
            java.lang.String r0 = "is_single_anchor"
            r5.LIZLLL(r0, r1)
            java.lang.String r1 = r4.LLILLJJLI
            if (r1 != 0) goto L25
            boolean r0 = r4.LL
            if (r0 == 0) goto Lba
            java.lang.String r1 = "video_single_anchor"
        L25:
            java.lang.String r0 = "entrance_form"
            r5.LIZLLL(r0, r1)
            java.lang.String r1 = "anchor_show_type"
            java.lang.String r0 = "video_cart_tag"
            r5.LIZLLL(r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.LLILLL
            r5.LJ(r0)
            X.18LI r1 = X.C18LI.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILZ
            r1.getClass()
            java.util.Map r0 = X.C18LI.LIZJ(r0)
            r5.LJ(r0)
            X.18Mk r2 = X.C21272018Mk.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LLILZ
            r0 = 2
            r3 = 0
            java.util.Map r0 = X.C21272018Mk.LJJIFFI(r2, r1, r3, r0)
            r5.LJ(r0)
            boolean r0 = r4.LL
            if (r0 != 0) goto L64
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.LLILLL
            java.lang.String r1 = "multi_anchor_display"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "0"
        L61:
            r5.LIZLLL(r1, r0)
        L64:
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r2 = r4.LLILZIL
            if (r2 != 0) goto L74
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r0 = r4.LLILZLL
            if (r0 == 0) goto Lb8
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r2 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r2
            if (r2 == 0) goto L7b
        L74:
            java.util.Map r0 = X.C21272018Mk.LJIJI(r2, r3)
            r5.LJ(r0)
        L7b:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r0 = r4.LLILZLL
            java.util.Map r0 = X.C21272018Mk.LJFF(r0)
            r5.LJ(r0)
            boolean r0 = X.C0C13.LIZ()
            if (r0 == 0) goto Lb5
            int r0 = r4.LLIZ
            if (r0 < 0) goto Lb5
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r0 = r4.LLILZLL
            r1.getClass()
            java.lang.String r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJIL(r0)
            java.lang.String r0 = "product_id_list"
            r5.LIZLLL(r0, r1)
            if (r2 == 0) goto Lb5
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r2.extraData
            if (r0 == 0) goto Lb5
            java.lang.Long r0 = r0.productId
            if (r0 == 0) goto Lb5
            long r2 = r0.longValue()
            java.lang.String r1 = "product_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.LIZLLL(r1, r0)
        Lb5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb8:
            r2 = r3
            goto L7b
        Lba:
            java.lang.String r1 = "video_multi_anchor"
            goto L25
        Lbe:
            java.lang.String r1 = "no"
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18M4.invoke(java.lang.Object):java.lang.Object");
    }
}
