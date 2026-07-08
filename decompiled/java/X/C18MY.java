package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18MY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MY extends RecyclerView.ViewHolder {
    public final View LL;
    public int LLILLJJLI;
    public final Context LLILLL;
    public final ProductListModel LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final AnchorPanelConfig LLIZ;
    public final C0HBC LLIZLLLIL;
    public final IECommerceVideoService LLJ;
    public final AnchorPanelProductManager LLJI;
    public final String LLJIJIL;
    public C21271018Ma LLJILJIL;
    public final Map<String, String> LLJILJILJ;

    public final List<SkuItem> N5(AnchorProductInfoModel anchorProductInfoModel) {
        String string;
        Long l = anchorProductInfoModel.extraData.productId;
        List<SkuItem> list = null;
        if (l == null || (string = l.toString()) == null) {
            return null;
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
        C21271018Ma c21271018MaL5 = L5(null, string);
        if (c21271018MaL5 != null) {
            list = c21271018MaL5.LJIJI;
        }
        anchorBizUtils.getClass();
        return AnchorBizUtils.LJJJJIZL(anchorProductInfo, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:3:0x0016, B:5:0x001c, B:8:0x0024, B:12:0x002c, B:14:0x0038, B:17:0x0041, B:18:0x0044, B:24:0x0052, B:26:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x006f, B:34:0x0073, B:15:0x003b), top: B:39:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073 A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:3:0x0016, B:5:0x001c, B:8:0x0024, B:12:0x002c, B:14:0x0038, B:17:0x0041, B:18:0x0044, B:24:0x0052, B:26:0x005e, B:28:0x0062, B:30:0x0068, B:32:0x006f, B:34:0x0073, B:15:0x003b), top: B:39:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.LL
            r0 = 2131386327(0x7f0a5fd7, float:1.839311E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View r1 = r5.LL
            r0 = 2131386350(0x7f0a5fee, float:1.8393156E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r6.extraData     // Catch: java.lang.Exception -> L77
            java.lang.Long r0 = r0.productId     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L77
            if (r1 != 0) goto L24
        L22:
            java.lang.String r1 = ""
        L24:
            int r2 = r5.LLILZLL     // Catch: java.lang.Exception -> L77
            r0 = 1
            if (r2 == r0) goto L3b
            r0 = 2
            if (r2 != r0) goto L44
            int r0 = r5.LLILLJJLI     // Catch: java.lang.Exception -> L77
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L77
            X.18Ma r0 = r5.L5(r0, r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.LIZJ     // Catch: java.lang.Exception -> L77
            goto L3f
        L3b:
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r6.extraData     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = r0.formatPrice     // Catch: java.lang.Exception -> L77
        L3f:
            if (r0 == 0) goto L44
            r3.setText(r0)     // Catch: java.lang.Exception -> L77
        L44:
            int r0 = r3.getVisibility()     // Catch: java.lang.Exception -> L77
            r3 = 0
            if (r0 != 0) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            r2 = 8
            if (r0 == 0) goto L73
            int r0 = r5.LLILLJJLI     // Catch: java.lang.Exception -> L77
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L77
            X.18Ma r0 = r5.L5(r0, r1)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            java.lang.String r1 = r0.LIZLLL     // Catch: java.lang.Exception -> L77
            if (r1 == 0) goto L6f
            int r0 = r1.length()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L6f
            r4.setText(r1)     // Catch: java.lang.Exception -> L77
            X.C786410Ut5.LLIL(r4, r3)     // Catch: java.lang.Exception -> L77
            return
        L6f:
            X.C786410Ut5.LLIL(r4, r2)     // Catch: java.lang.Exception -> L77
            return
        L73:
            X.C786410Ut5.LLIL(r4, r2)     // Catch: java.lang.Exception -> L77
            return
        L77:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.18Mj r2 = X.C21271918Mj.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "anchor.extra : "
            r1.append(r0)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r6.extraData
            r1.append(r0)
            java.lang.String r0 = " processPrice"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C21271918Mj.LJJIII(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MY.S5(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel):void");
    }

    public final C21271018Ma L5(Integer num, String str) {
        C21271018Ma c21271018Ma = this.LLJILJIL;
        if (c21271018Ma == null || !Intrinsics.LJFF(c21271018Ma.LIZIZ, str)) {
            return null;
        }
        if (num != null && c21271018Ma.LIZ != num.intValue()) {
            return null;
        }
        return c21271018Ma;
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:0x0811, code lost:
    
        if (r1 != null) goto L314;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0659 A[PHI: r9
      0x0659: PHI (r9v24 java.lang.String) = (r9v14 java.lang.String), (r9v36 java.lang.String), (r9v38 java.lang.String) binds: [B:359:0x085d, B:356:0x0852, B:273:0x064b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0277  */
    /* JADX WARN: Type inference failed for: r10v23, types: [com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem] */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [T] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [T] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.18QS, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v26, types: [X.0Gwq] */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v123 */
    /* JADX WARN: Type inference failed for: r3v124 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r40v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0DQs] */
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
    public final void I5(int r46, X.C21271018Ma r47, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r48) {
        /*
            Method dump skipped, instruction units count: 2563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MY.I5(int, X.18Ma, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel):void");
    }

    public static final void P5(final C424610Gkt c424610Gkt, final C18MY c18my, final AnchorProductInfoModel anchorProductInfoModel, final String str, final boolean z) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(str));
        C1324840ka2.LJIIIIZZ(c424610Gkt, urlModel, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.18Mf
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str2, Throwable th) {
                C18MY.R5(c18my, anchorProductInfoModel, str, c424610Gkt, false, Boolean.valueOf(z));
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str2, Object obj, Animatable animatable) {
                C18MY.R5(c18my, anchorProductInfoModel, str, c424610Gkt, true, Boolean.valueOf(z));
            }
        });
    }

    public static final void R5(C18MY c18my, AnchorProductInfoModel anchorProductInfoModel, String str, C424610Gkt c424610Gkt, boolean z, Boolean bool) {
        boolean zBooleanValue;
        String str2 = str;
        c18my.LLJI.LJII(String.valueOf(anchorProductInfoModel.extraData.productId), Long.valueOf(System.currentTimeMillis() - c18my.LLJI.LJIJ.getAnchorClickTime()), Boolean.valueOf(z), c18my.LLILLJJLI, bool, str2);
        if (c18my.LLILLJJLI == 0 && z) {
            AnchorPanelProductManager anchorPanelProductManager = c18my.LLJI;
            anchorPanelProductManager.LJIILL = true;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            anchorPanelProductManager.LJIILLIIL = zBooleanValue;
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        anchorBizUtils.getClass();
        AnchorBizUtils.LJIJ(c424610Gkt, anchorProductInfoModel, str2, false);
    }

    public C18MY(View view, Context context, ProductListModel productListModel, boolean z, int i, AnchorPanelConfig anchorPanelConfig, C0HBC c0hbc, IECommerceVideoService iECommerceVideoService, AnchorPanelProductManager anchorPanelProductManager) {
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        super(view);
        this.LL = view;
        this.LLILLJJLI = 0;
        this.LLILLL = context;
        this.LLILZ = productListModel;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = anchorPanelConfig;
        this.LLIZLLLIL = c0hbc;
        this.LLJ = iECommerceVideoService;
        this.LLJI = anchorPanelProductManager;
        String strLJIIJJI = C21272218Mm.LJIIJJI(productListModel, z);
        if (strLJIIJJI == null && (strLJIIJJI = productListModel.entranceForm) == null) {
            List<AnchorProductInfoModel> list = productListModel.products;
            if (list != null && list.size() > 1) {
                strLJIIJJI = "video_multi_anchor";
            } else {
                strLJIIJJI = "video_single_anchor";
            }
        }
        this.LLJIJIL = strLJIIJJI;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        this.LLJILJILJ = ((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).getLogParamsFromSearch(productListModel.eventType, "", "search_id", "search_result_id", "search_entrance", "click_recom_search_entrance", "list_item_id", "last_from_group_id", "origin_is_mall_tab");
    }
}
