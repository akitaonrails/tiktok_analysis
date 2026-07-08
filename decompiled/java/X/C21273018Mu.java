package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18Mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21273018Mu implements InterfaceC1066840dru {
    public String LIZ;
    public Aweme LIZIZ;
    public AnchorCommonStruct LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 754));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 752));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 753));

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        AnchorCommonStruct anchorCommonStruct = this.LIZJ;
        if (anchorCommonStruct != null && anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE()) {
            return LJIIIZ();
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LIZJ;
        if (anchorCommonStruct2 == null || anchorCommonStruct2.getType() != EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) {
            return null;
        }
        return LJIIJJI();
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZIZ() {
        String str;
        List listLJJLIIIJILLIZJL;
        String str2;
        ECAnchorInfo eCAnchorInfo;
        List<AnchorCommonStruct> anchors;
        String anchorsExtras;
        AnchorsExtras anchorsExtras2;
        ECAnchorInfo ecAnchorInfo;
        AnchorCommonStruct anchorCommonStruct = this.LIZJ;
        if (!(anchorCommonStruct != null && anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE())) {
            AnchorCommonStruct anchorCommonStruct2 = this.LIZJ;
            if (!(anchorCommonStruct2 != null && anchorCommonStruct2.getType() == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE())) {
                return null;
            }
            Aweme aweme = this.LIZIZ;
            if (!((aweme == null || (anchors = aweme.getAnchors()) == null || anchors.size() != 1) ? false : true)) {
                ShowcaseContent showcaseContentLJIIJ = LJIIJ();
                return (showcaseContentLJIIJ == null || (str = showcaseContentLJIIJ.shopShowcaseTitle) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"·"}, 0, 6)) == null || (str2 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL)) == null) ? "" : str2;
            }
            ShowcaseContent showcaseContentLJIIJ2 = LJIIJ();
            if (showcaseContentLJIIJ2 == null || (eCAnchorInfo = showcaseContentLJIIJ2.ecAnchorInfo) == null) {
                return null;
            }
            return eCAnchorInfo.anchorTag;
        }
        Aweme aweme2 = this.LIZIZ;
        if (aweme2 != null && (anchorsExtras = aweme2.getAnchorsExtras()) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, anchorsExtras, c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII ? C2371409Qy.LIZJ(C13LE.LJII(AnchorsExtras.class)) : new TypeToken<AnchorsExtras>() { // from class: X.18Of
                }.getType());
                if (!(objFromJson instanceof AnchorsExtras)) {
                    objFromJson = null;
                }
                anchorsExtras2 = (AnchorsExtras) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                anchorsExtras2 = null;
            }
            if (anchorsExtras2 != null && (ecAnchorInfo = anchorsExtras2.getEcAnchorInfo()) != null) {
                Aweme aweme3 = this.LIZIZ;
                String str3 = aweme3 != null && aweme3.isAd() ? ecAnchorInfo.adsAnchorTag : ecAnchorInfo.anchorTag;
                if (C770702zh.LIZIZ(str3)) {
                    return str3;
                }
                AnchorCommonStruct anchorCommonStruct3 = this.LIZJ;
                if (anchorCommonStruct3 != null) {
                    List<AnchorProductInfoModel> listLJJLIIIJL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJL(anchorCommonStruct3);
                    if (!listLJJLIIIJL.isEmpty()) {
                        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) ListProtector.get(listLJJLIIIJL, 0);
                        if (C703302op.LIZ(anchorProductInfoModel.extraData.videoAnchorTitle)) {
                            return anchorProductInfoModel.extraData.videoAnchorTitle;
                        }
                        Integer num = anchorProductInfoModel.type;
                        int type = EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE();
                        if (num == null || num.intValue() != type) {
                            Integer num2 = anchorProductInfoModel.type;
                            int type2 = EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE();
                            if (num2 != null && num2.intValue() == type2) {
                                return anchorProductInfoModel.keyword;
                            }
                        } else {
                            String str4 = anchorProductInfoModel.extraData.elasticTitle;
                            if (TextUtils.isEmpty(str4)) {
                                String str5 = anchorProductInfoModel.extraData.title;
                                if (str5 != null) {
                                    return str5;
                                }
                            } else if (str4 != null) {
                                return str4;
                            }
                        }
                        return "";
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        AnchorCommonStruct anchorCommonStruct = this.LIZJ;
        return (anchorCommonStruct == null || anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) ? (InterfaceC1392590mLJ) this.LJ.getValue() : (InterfaceC1392590mLJ) this.LJFF.getValue();
    }

    public final String LJIIIZ() {
        AnchorCommonStruct anchorCommonStruct = this.LIZJ;
        if (anchorCommonStruct == null) {
            return null;
        }
        List<AnchorProductInfoModel> listLJJLIIIJL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJL(anchorCommonStruct);
        if (listLJJLIIIJL.isEmpty()) {
            return null;
        }
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) ListProtector.get(listLJJLIIIJL, 0);
        if (!TextUtils.isEmpty(anchorProductInfoModel.extraData.videoAnchorTitle)) {
            String str = anchorProductInfoModel.extraData.videoAnchorTitle;
            return str != null ? str : "";
        }
        Integer num = anchorProductInfoModel.type;
        if (num == null || num.intValue() != 33) {
            Integer num2 = anchorProductInfoModel.type;
            if (num2 != null && num2.intValue() == 6) {
                return anchorProductInfoModel.keyword;
            }
        } else {
            String str2 = anchorProductInfoModel.extraData.elasticTitle;
            if (TextUtils.isEmpty(str2)) {
                String str3 = anchorProductInfoModel.extraData.title;
                if (str3 != null) {
                    return str3;
                }
            } else if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final ShowcaseContent LJIIJ() {
        return (ShowcaseContent) this.LIZLLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIJJI() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LIZIZ
            r4 = 0
            if (r0 == 0) goto L2b
            java.util.List r0 = r0.getAnchors()
            if (r0 == 0) goto L2b
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L2b
        L12:
            java.lang.String r3 = ""
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent r0 = r5.LJIIJ()
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.shopShowcaseTitle
            if (r0 != 0) goto L2d
        L20:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r5.LIZJ
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getKeyword()
            if (r0 != 0) goto L2d
        L2a:
            return r3
        L2b:
            r0 = 0
            goto L12
        L2d:
            return r0
        L2e:
            com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent r0 = r5.LJIIJ()
            if (r0 == 0) goto L4e
            java.lang.String r2 = r0.shopShowcaseTitle
            if (r2 == 0) goto L4e
            java.lang.String r0 = "·"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r4, r0)
            if (r0 == 0) goto L4e
            java.lang.Object r0 = X.C360560EBq.LIZ(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4e
            return r0
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21273018Mu.LJIIJJI():java.lang.String");
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C21273018Mu c21273018Mu = new C21273018Mu();
        c21273018Mu.LIZ = this.LIZ;
        c21273018Mu.LIZIZ = this.LIZIZ;
        c21273018Mu.LIZJ = this.LIZJ;
        return c21273018Mu;
    }

    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        int iLJLIIIL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLIIIL(this.LIZIZ);
        return (iLJLIIIL == 2 || iLJLIIIL == 4) ? R.raw.icon_shopping_cart_fill_ltr : R.raw.icon_bag_fill;
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final void LIZJ(C2344009Gk c2344009Gk) {
        AnchorCommonStruct anchorCommonStruct;
        ShowcaseContent showcaseContentLJIIJ;
        String string;
        String authorUid;
        boolean z;
        String aid;
        String authorUid2;
        Activity activityLIZIZ;
        Map linkedHashMap;
        List<AnchorCommonStruct> anchors;
        AnchorProductInfoModel anchorProductInfoModel;
        HashMap<String, String> mobParams;
        Aweme aweme;
        String requestId;
        String str;
        Activity activityLIZIZ2;
        C1065370dpX.LIZIZ(this, this.LIZ, this.LIZIZ, c2344009Gk);
        if (this.LIZIZ != null && (anchorCommonStruct = this.LIZJ) != null) {
            int type = anchorCommonStruct.getType();
            String strLJI = "";
            Activity activityLIZ = null;
            if (type == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE()) {
                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                AnchorCommonStruct anchorCommonStruct2 = this.LIZJ;
                if (anchorCommonStruct2 != null && (anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(iECommerceAnchorService.LJJLIIIJL(anchorCommonStruct2))) != null) {
                    Aweme aweme2 = this.LIZIZ;
                    String str2 = this.LIZ;
                    String strLJLIL = iECommerceAnchorService.LJLIL(anchorProductInfoModel, aweme2, str2, str2, true);
                    Aweme aweme3 = this.LIZIZ;
                    if (aweme3 != null) {
                        mobParams = aweme3.getMobParams();
                    } else {
                        mobParams = null;
                    }
                    if ((mobParams == null || (requestId = mobParams.get("request_id")) == null) && ((aweme = this.LIZIZ) == null || (requestId = aweme.getRequestId()) == null)) {
                        requestId = "";
                    }
                    if (mobParams == null || (str = mobParams.get("rec_session_id")) == null) {
                        str = "";
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("video_anchor", true);
                    C786410Ut5.LJJJI("title", String.valueOf(anchorProductInfoModel.extraData.title), bundle);
                    C786410Ut5.LJJJI("price", String.valueOf(anchorProductInfoModel.extraData.formatPrice), bundle);
                    int iLJIJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJ();
                    String str3 = anchorProductInfoModel.extraData.coverUrl;
                    if (str3 != null) {
                        strLJI = str3;
                    }
                    try {
                        strLJI = C1743690vTb.LJI(strLJI, iLJIJ, iLJIJ, EnumC1769850w9n.VIDEO_MULTI_ANCHOR);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C786410Ut5.LJJJI("cover", strLJI, bundle);
                    C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, String.valueOf(anchorProductInfoModel.extraData.productId), bundle);
                    if (requestId.length() > 0) {
                        C786410Ut5.LJJJI("request_id", requestId, bundle);
                    }
                    if (str.length() > 0) {
                        C786410Ut5.LJJJI("rec_session_id", str, bundle);
                    }
                    int i = C1742080vR0.LIZ;
                    int[] iArrLJ = C1742080vR0.LJ(this.LIZIZ);
                    if (iArrLJ.length != 0) {
                        bundle.putIntArray("traffic_source_list", iArrLJ);
                    }
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                        activityLIZ = C1388190mED.LIZ(activityLIZIZ2);
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, strLJLIL);
                    smartRouteBuildRoute.withParam(bundle);
                    smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.18OS
                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onActionResult(Object obj) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final /* synthetic */ void onEmpty() {
                            C1951107kb.LIZ(this);
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onFail(String str4, String str5) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onIntercept(String str4) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onMatched(String str4) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onMissed(String str4) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final /* synthetic */ void onOpen(Intent intent) {
                            C1951107kb.LIZIZ(this, intent);
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onSuccess(Intent intent) {
                        }
                    });
                    smartRouteBuildRoute.open();
                    return;
                }
                return;
            }
            if (type == EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE() && (showcaseContentLJIIJ = LJIIJ()) != null && (string = showcaseContentLJIIJ.shopShowcaseSchemaHalfScreen) != null && string.length() != 0) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str4 = this.LIZ;
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap2.put("enter_from", str4);
                String str5 = this.LIZ;
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap2.put("source_previous_page", str5);
                Aweme aweme4 = this.LIZIZ;
                if (aweme4 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme4)) == null) {
                    authorUid = "";
                }
                linkedHashMap2.put("author_id", authorUid);
                Aweme aweme5 = this.LIZIZ;
                if (aweme5 != null && (anchors = aweme5.getAnchors()) != null && anchors.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                linkedHashMap2.put("is_multi_anchor", Boolean.valueOf(z));
                String str6 = this.LIZ;
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap2.put("previous_page", str6);
                Aweme aweme6 = this.LIZIZ;
                if (aweme6 == null || (aid = aweme6.getAid()) == null) {
                    aid = "";
                }
                linkedHashMap2.put("list_source_content_id", aid);
                Aweme aweme7 = this.LIZIZ;
                if (aweme7 != null) {
                    authorUid2 = AwemeExtKt.getAuthorUid(aweme7);
                } else {
                    authorUid2 = null;
                }
                linkedHashMap2.put("is_self", Integer.valueOf(Intrinsics.LJFF(authorUid2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ? 1 : 0));
                if (string != null && string.length() != 0 && !linkedHashMap2.isEmpty()) {
                    Uri uri = UriProtector.parse(string);
                    String strLIZ = C2011207uI.LIZ(uri, "trackParams");
                    if (strLIZ == null || (linkedHashMap = C1741890vQh.LJIIJ(strLIZ)) == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == null) {
                                value = "";
                            }
                            linkedHashMap.put(key, value);
                        }
                    }
                    string = C2011207uI.LIZIZ(uri, "trackParams").buildUpon().appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)).toString();
                }
                AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
                    activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                }
                SmartRouter.buildRoute(activityLIZ, string).open();
            }
        }
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1065370dpX.LIZJ(this, this.LIZ, this.LIZIZ, c2344009Gk);
    }

    @Override // X.InterfaceC1066840dru
    public final boolean LJFF(int i, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = anchorCommonStruct;
        if (anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE() && anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()) {
            return false;
        }
        return true;
    }
}
