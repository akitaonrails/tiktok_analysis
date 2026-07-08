package X;

import Y.ARunnableS4S0410000_32;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.ecommerce.service.ISeaPdpFypAnchorPrefetchService;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272118Ml implements InterfaceC1394860mOy, InterfaceC1865670yeL {
    public AnchorProductInfoModel LLILLJJLI;
    public C21272418Mo LLILLL;
    public ECommerceAnchorPanelViewModel LLILZ;
    public ARunnableS4S0410000_32 LLILZLL;
    public AnonymousClass0956 LLIZ;
    public View LLIZLLLIL;
    public long LLJ;
    public C2344009Gk LLJI;
    public HashMap<String, String> LLJIJIL;
    public WeakReference<InterfaceC1392640mLO> LLJILJILJ;
    public List<AnchorProductInfoModel> LL = new ArrayList();
    public int LLILZIL = 1;
    public final Map<String, String> LLJILJIL = new LinkedHashMap();
    public final C1400390mXt LLJILLL = new C1400390mXt(null, null, null, null, null, 31);

    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<AnchorProductInfoModel> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().extraData.productId));
        }
        return arrayList;
    }

    public final List<String> LIZJ() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (AnchorProductInfoModel anchorProductInfoModel : this.LL) {
            if (C770702zh.LIZ(anchorProductInfoModel.extraData.elasticUrl)) {
                str = anchorProductInfoModel.extraData.elasticUrl;
            } else if (C770702zh.LIZ(anchorProductInfoModel.extraData.coverUrl)) {
                str = anchorProductInfoModel.extraData.coverUrl;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1394860mOy
    public final int LJFF() {
        return this.LL.size();
    }

    @Override // X.InterfaceC1394860mOy
    public final C15MV LJIILL() {
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        List<AnchorProductInfoModel> list = this.LL;
        anchorBizUtils.getClass();
        return AnchorBizUtils.LJJJJJL(list);
    }

    @Override // X.InterfaceC1394860mOy
    public final AnchorProductInfo LJJ() {
        for (AnchorProductInfoModel anchorProductInfoModel : this.LL) {
            Integer num = anchorProductInfoModel.extraData.productStatus;
            int value = EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue();
            if (num != null && num.intValue() == value) {
                return anchorProductInfoModel.extraData;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1394860mOy
    public final List<AnchorProductInfoModel> LJJIII() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // X.InterfaceC1394860mOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> r4 = r5.LL
            r0.getClass()
            java.lang.String r2 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJIFFI(r6)
            r3 = 0
            if (r6 == 0) goto L27
            java.lang.String r1 = r6.getAnchorsExtras()
            if (r1 == 0) goto L27
            X.0vFc r0 = X.C1735020vFc.LIZ
            r0.getClass()
            int r1 = X.C1735020vFc.LJI(r1)
            r0 = 2
            if (r1 != r0) goto L27
            boolean r0 = X.C770702zh.LIZIZ(r2)
            if (r0 == 0) goto L27
        L26:
            return r2
        L27:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto La1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r0.extraData
            java.lang.String r0 = r0.videoAnchorTitle
            boolean r0 = X.C770702zh.LIZ(r0)
            if (r0 == 0) goto L4a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r0.extraData
            java.lang.String r2 = r0.videoAnchorTitle
            return r2
        L4a:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            java.lang.Integer r2 = r0.type
            X.0nKG r0 = X.EnumC1430380nKG.ANCHOR_SHOP_WINDOW
            int r1 = r0.getTYPE()
            if (r2 == 0) goto L82
            int r0 = r2.intValue()
            if (r0 != r1) goto L82
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r0.extraData
            java.lang.String r2 = r0.elasticTitle
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L75
            if (r2 != 0) goto L26
        L72:
            java.lang.String r2 = ""
            return r2
        L75:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r0.extraData
            java.lang.String r2 = r0.title
            if (r2 != 0) goto L26
            goto L72
        L82:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            java.lang.Integer r2 = r0.type
            X.0nKG r0 = X.EnumC1430380nKG.ANCHOR_SHOP_LINK
            int r1 = r0.getTYPE()
            if (r2 == 0) goto L72
            int r0 = r2.intValue()
            if (r0 != r1) goto L72
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            java.lang.String r2 = r0.keyword
            return r2
        La1:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    @Override // X.InterfaceC1394860mOy
    public final String LJII(Aweme aweme) {
        String anchorsExtras;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        List<AnchorProductInfoModel> list = this.LL;
        anchorBizUtils.getClass();
        if (aweme != null && (anchorsExtras = aweme.getAnchorsExtras()) != null) {
            C1735020vFc.LIZ.getClass();
            if (C1735020vFc.LJI(anchorsExtras) == 2 && (!list.isEmpty())) {
                if (C770702zh.LIZ(((AnchorProductInfoModel) ListProtector.get(list, 0)).extraData.videoAnchorTitle)) {
                    return ((AnchorProductInfoModel) ListProtector.get(list, 0)).extraData.videoAnchorTitle;
                }
                Integer num = ((AnchorProductInfoModel) ListProtector.get(list, 0)).type;
                int type = EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE();
                if (num != null && num.intValue() == type) {
                    String str = ((AnchorProductInfoModel) ListProtector.get(list, 0)).extraData.elasticTitle;
                    if (!TextUtils.isEmpty(str)) {
                        if (str != null) {
                            return str;
                        }
                        return "";
                    }
                    String str2 = ((AnchorProductInfoModel) ListProtector.get(list, 0)).extraData.title;
                    if (str2 != null) {
                        return str2;
                    }
                    return "";
                }
                Integer num2 = ((AnchorProductInfoModel) ListProtector.get(list, 0)).type;
                int type2 = EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE();
                if (num2 == null || num2.intValue() != type2) {
                    return "";
                }
                return ((AnchorProductInfoModel) ListProtector.get(list, 0)).keyword;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1394860mOy
    public final String LJIIJ(boolean z) {
        AnchorProductInfo anchorProductInfo;
        String str;
        AnchorProductInfo anchorProductInfo2;
        String str2;
        if (z) {
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(this.LL);
            if (anchorProductInfoModel == null || (anchorProductInfo2 = anchorProductInfoModel.extraData) == null || (str2 = anchorProductInfo2.elasticTitle) == null) {
                AnchorProductInfoModel anchorProductInfoModel2 = (AnchorProductInfoModel) C13LP.LJJJLL(this.LL);
                if (anchorProductInfoModel2 == null || (anchorProductInfo = anchorProductInfoModel2.extraData) == null || (str = anchorProductInfo.title) == null) {
                    return "";
                }
                return str;
            }
            return str2;
        }
        List<AnchorProductInfoModel> list = this.LL;
        ArrayList arrayList = new ArrayList();
        Iterator<AnchorProductInfoModel> it2 = list.iterator();
        while (it2.hasNext()) {
            AnchorProductInfo anchorProductInfo3 = it2.next().extraData;
            String str3 = anchorProductInfo3.elasticTitle;
            if (str3 != null || (str3 = anchorProductInfo3.title) != null) {
                arrayList.add(str3);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // X.InterfaceC1394860mOy
    public final String LJIIJJI(boolean z) {
        Long l;
        AnchorProductInfo anchorProductInfo;
        if (z) {
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(this.LL);
            if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
                l = anchorProductInfo.productId;
            } else {
                l = null;
            }
            return String.valueOf(l);
        }
        List<AnchorProductInfoModel> list = this.LL;
        ArrayList arrayList = new ArrayList();
        Iterator<AnchorProductInfoModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().extraData.productId);
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIILLIIL(String str) {
        Object obj;
        long j;
        Boolean bool;
        List<AnchorCommonStruct> anchors;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            obj = mapLJIIJ.get("product_id");
        } else {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            j = CastLongProtector.parseLong(str2);
        } else {
            j = 0;
        }
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        String strValueOf = String.valueOf(j);
        c21272518Mp.getClass();
        if (strValueOf != null && strValueOf.length() != 0 && (bool = (Boolean) ((LinkedHashMap) C21272518Mp.LJIIIIZZ).get(strValueOf)) != null && bool.booleanValue()) {
            Collection<Aweme> collectionValues = C21272518Mp.LJIIJ.snapshot().values();
            if (collectionValues != null) {
                for (Aweme aweme : new ArrayList(collectionValues)) {
                    if (aweme != null && (anchors = aweme.getAnchors()) != null && anchors.size() == 1) {
                        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
                        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(this.LL);
                        c21272018Mk.getClass();
                        iECommerceAnchorService.LJIIJ(aweme, null, "video_single_anchor", C21272018Mk.LJIIJJI(anchorProductInfoModel));
                    } else {
                        IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                        C21272018Mk c21272018Mk2 = C21272018Mk.LIZ;
                        List<AnchorProductInfoModel> list = this.LL;
                        c21272018Mk2.getClass();
                        iECommerceAnchorService2.LJIIJ(aweme, null, "video_main_anchor", C21272018Mk.LIZLLL(list));
                    }
                }
            }
            C21272518Mp.LIZ.getClass();
            ((LinkedHashMap) C21272518Mp.LJIIIIZZ).clear();
        }
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIJI(int i) {
        C18O5 c18o5;
        C21272418Mo c21272418Mo = this.LLILLL;
        if (c21272418Mo != null && (c18o5 = c21272418Mo.LLIZLLLIL) != null) {
            c18o5.LJIJJ(i);
        }
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        Integer numValueOf = Integer.valueOf(i);
        c21272518Mp.getClass();
        C21272518Mp.LIZIZ(numValueOf);
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIJJLI(InterfaceC1392640mLO interfaceC1392640mLO) {
        List<AnchorProductInfoModel> list;
        int iLJJJI;
        ViewModelStoreOwner viewModelStoreOwner;
        ArrayList arrayList;
        List<AnchorProductInfoModel> list2;
        String string;
        ProductListModel productListModel;
        int size;
        List<AnchorProductInfoModel> list3;
        List<AnchorProductInfoModel> listLJJZZIII;
        Aweme awemeLJJLIIIJJIZ;
        SettingsManager.LIZLLL().getClass();
        boolean z = true;
        if (SettingsManager.LIZ("ec_sv_enable_panel_preload", true) && interfaceC1392640mLO != null && !interfaceC1392640mLO.LJII()) {
            ComponentCallbacks2 componentCallbacks2LIZIZ = interfaceC1392640mLO.LIZIZ();
            if (this.LLILZ == null && (componentCallbacks2LIZIZ instanceof C19EG)) {
                this.LLILZ = (ECommerceAnchorPanelViewModel) ViewModelProviders.of((C19EG) componentCallbacks2LIZIZ).get(ECommerceAnchorPanelViewModel.class);
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LLILZ;
            AnchorCommonViewModel anchorCommonViewModel = null;
            if (eCommerceAnchorPanelViewModel != null) {
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(interfaceC1392640mLO.LJJLIIIJJIZ().getAnchors(), 0);
                int iLJFF = LJFF();
                eCommerceAnchorPanelViewModel.LL = interfaceC1392640mLO;
                eCommerceAnchorPanelViewModel.LLILLL = anchorCommonStruct;
                eCommerceAnchorPanelViewModel.LLILZ = iLJFF;
                eCommerceAnchorPanelViewModel.LLJJI = false;
                ProductListModel productListModelLJJIJL = C21272218Mm.LJJIJL(interfaceC1392640mLO.LJJLIIIJJIZ(), interfaceC1392640mLO, null, null, null);
                eCommerceAnchorPanelViewModel.LLILLJJLI = productListModelLJJIJL;
                List<AnchorProductInfoModel> list4 = productListModelLJJIJL.products;
                if (list4 != null) {
                    listLJJZZIII = new ArrayList<>(list4);
                } else {
                    AnchorBizUtils.LIZ.getClass();
                    listLJJZZIII = AnchorBizUtils.LJJZZIII(anchorCommonStruct, false);
                }
                eCommerceAnchorPanelViewModel.LLILZIL = listLJJZZIII;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJZZIII, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (AnchorProductInfoModel anchorProductInfoModel : listLJJZZIII) {
                    linkedHashMap.put(String.valueOf(anchorProductInfoModel.extraData.productId), anchorProductInfoModel);
                }
                eCommerceAnchorPanelViewModel.LLJJJIL = linkedHashMap;
                InterfaceC1392640mLO interfaceC1392640mLO2 = eCommerceAnchorPanelViewModel.LL;
                if (interfaceC1392640mLO2 != null) {
                    awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ = null;
                }
                C21272618Mq.LIZ.getClass();
                if (C21272618Mq.LJIIJ(awemeLJJLIIIJJIZ)) {
                    eCommerceAnchorPanelViewModel.JQ2(awemeLJJLIIIJJIZ);
                } else {
                    eCommerceAnchorPanelViewModel.LLIZ = (AnchorProductInfoModel) C13LP.LJJJLL(eCommerceAnchorPanelViewModel.LLILZIL);
                }
                AnchorBizUtils.LIZ.getClass();
                eCommerceAnchorPanelViewModel.LLJILLL = "video_single_anchor";
            }
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LLILZ;
            if (eCommerceAnchorPanelViewModel2 != null) {
                list = eCommerceAnchorPanelViewModel2.LLILZIL;
            } else {
                list = null;
            }
            c21272618Mq.getClass();
            if (C21272618Mq.LJIIIIZZ(list)) {
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = this.LLILZ;
                if (eCommerceAnchorPanelViewModel3 != null) {
                    productListModel = eCommerceAnchorPanelViewModel3.LLILLJJLI;
                } else {
                    productListModel = null;
                }
                Integer numValueOf = Integer.valueOf(C21272618Mq.LJIJJ(productListModel));
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel4 = this.LLILZ;
                if (eCommerceAnchorPanelViewModel4 != null && (list3 = eCommerceAnchorPanelViewModel4.LLILZIL) != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                anchorBizUtils.getClass();
                iLJJJI = AnchorBizUtils.LJJJI(size, numValueOf);
            } else {
                iLJJJI = 0;
            }
            if (componentCallbacks2LIZIZ instanceof ViewModelStoreOwner) {
                viewModelStoreOwner = (ViewModelStoreOwner) componentCallbacks2LIZIZ;
            } else {
                viewModelStoreOwner = null;
            }
            if (viewModelStoreOwner != null) {
                String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
                if (aid == null) {
                    aid = "";
                }
                anchorCommonViewModel = (AnchorCommonViewModel) new ViewModelProvider(viewModelStoreOwner, new C20154413tW(aid)).get(AnchorCommonViewModel.class);
                if (anchorCommonViewModel != null) {
                    anchorCommonViewModel.LL = true;
                }
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel5 = this.LLILZ;
            if (eCommerceAnchorPanelViewModel5 != null) {
                interfaceC1392640mLO.LJJLIIIJJIZ();
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel6 = this.LLILZ;
                if (eCommerceAnchorPanelViewModel6 != null && (list2 = eCommerceAnchorPanelViewModel6.LLILZIL) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<AnchorProductInfoModel> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Long l = it2.next().extraData.productId;
                        if (l == null || (string = l.toString()) == null) {
                            string = "";
                        }
                        arrayList2.add(string);
                    }
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                }
                if (iLJJJI == 0) {
                    z = false;
                }
                eCommerceAnchorPanelViewModel5.OQ2(arrayList, z, 2, new AwS611S0100000_32(anchorCommonViewModel, 318));
            }
        }
    }

    @Override // X.InterfaceC1394860mOy
    public final String LJJIIJZLJL(boolean z) {
        if (z) {
            return "product";
        }
        List<AnchorProductInfoModel> list = this.LL;
        ArrayList arrayList = new ArrayList();
        Iterator<AnchorProductInfoModel> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList.add("product");
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134 A[LOOP:1: B:52:0x012e->B:54:0x0134, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData r28) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJJIJIIJI(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData):void");
    }

    @Override // X.InterfaceC1865670yeL
    public void onEvent(Long l) throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        InterfaceC1392640mLO interfaceC1392640mLO;
        String str;
        WeakReference<InterfaceC1392640mLO> weakReference = this.LLJILJILJ;
        String name = null;
        if (weakReference != null && (interfaceC1392640mLO = weakReference.get()) != null) {
            String strLJJIIJZLJL = LJJIIJZLJL(true);
            AnchorProductInfoModel anchorProductInfoModel = this.LLILLJJLI;
            if (anchorProductInfoModel != null) {
                String strCf = interfaceC1392640mLO.Cf();
                Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
                C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                C2344009Gk c2344009Gk = this.LLJI;
                c21271918Mj.getClass();
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                if (c2344009Gk == null) {
                    c2344009Gk = new C2344009Gk();
                }
                String str2 = anchorProductInfoModel.logExtra;
                if (str2.length() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object obj = jSONObject.get(next);
                            if ((obj instanceof String) && (str = (String) obj) != null) {
                                c2344009Gk.LJFF(next, str);
                            }
                        }
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c2344009Gk.LJIIIIZZ("enter_from", strCf);
                c2344009Gk.LJIIIIZZ("anchor_entry", anchorProductInfoModel.keyword);
                String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
                String str3 = "";
                if (authorUid == null) {
                    authorUid = "";
                }
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                String aid = awemeLJJLIIIJJIZ.getAid();
                if (aid != null) {
                    str3 = aid;
                }
                c2344009Gk.LJIIIIZZ("group_id", str3);
                c2344009Gk.LJIIIIZZ("duration", String.valueOf(l));
                c2344009Gk.LJIIIIZZ("music_id", C586930N0h.LIZ(awemeLJJLIIIJJIZ));
                Map<String, String> map = c2344009Gk.LIZ;
                c1507790pL7.getClass();
                C1507790pL7.LJFF("multi_anchor_stay_time", map);
                C21271918Mj.LJJ(strCf, C21272218Mm.LJJIJL(awemeLJJLIIIJJIZ, interfaceC1392640mLO, null, null, null), l, strLJJIIJZLJL, this.LLILLJJLI);
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).unsubscribeBulletProductStayTime(this);
    }

    public static void LIZ(C2344009Gk c2344009Gk, AnchorProductInfoModel anchorProductInfoModel) {
        String str;
        String str2 = anchorProductInfoModel.logExtra;
        if (str2.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if ((obj instanceof String) && (str = (String) obj) != null) {
                        c2344009Gk.LJFF(next, str);
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJ(List list, int[] iArr) {
        List<Integer> listLJJLJ;
        IPdpPreviewService iPdpPreviewService = (IPdpPreviewService) ServiceManager.get().getService(IPdpPreviewService.class);
        if (iArr != null) {
            listLJJLJ = C13LQ.LJJLJ(iArr);
        } else {
            listLJJLJ = null;
        }
        boolean zLJI = MethodIDManager.LJI(137963);
        iPdpPreviewService.LIZ(list, listLJJLJ, null, null, "video");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1394860mOy
    public final void LJIILJJIL(long j, Dialog dialog) {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str;
        AbstractC21673619ry adapter;
        C18O5 c18o5;
        C18MZ c18mz;
        Map<String, String> map;
        AnchorProductInfo anchorProductInfo;
        Long l;
        C18MZ c18mz2;
        C18MZ c18mz3;
        boolean z;
        String name;
        long j2 = -1;
        if (j != -1) {
            j2 = j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        String string = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        boolean zIsAnchorDialogPanelVisible = ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).isAnchorDialogPanelVisible();
        if (C036A.LIZIZ()) {
            str = "close";
        } else {
            Window window = dialog.getWindow();
            if ((window == null || !window.isActive()) && !zIsAnchorDialogPanelVisible) {
                str = "return";
            } else {
                str = "next";
            }
        }
        C21272418Mo c21272418Mo = this.LLILLL;
        if (c21272418Mo != null) {
            C21272518Mp.LIZ.getClass();
            C21272518Mp.LIZIZ = false;
            C21272418Mo.LLJJIJIIJIL = false;
            if (Intrinsics.LJFF(str, "return")) {
                AbstractC21673619ry adapter2 = c21272418Mo.LIZ().getAdapter();
                if ((adapter2 instanceof C18MZ) && (c18mz3 = (C18MZ) adapter2) != null) {
                    c18mz3.LLLI();
                }
                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                Aweme aweme = c21272418Mo.LL.aweme;
                String str2 = c21272418Mo.LLJJI;
                C21272018Mk c21272018Mk = C21272018Mk.LIZ;
                List<AnchorProductInfoModel> list = c21272418Mo.LL.products;
                c21272018Mk.getClass();
                iECommerceAnchorService.LJIIJ(aweme, 0, str2, C21272018Mk.LIZLLL(list));
            }
            AbstractC21673619ry adapter3 = c21272418Mo.LIZ().getAdapter();
            if ((adapter3 instanceof C18MZ) && (c18mz2 = (C18MZ) adapter3) != null) {
                c18mz2.LLLIL = false;
                c18mz2.LLLIIIIL().LJIILJJIL = false;
            }
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            String str3 = c21272418Mo.LLJJI;
            String str4 = c21272418Mo.LL.groupId;
            c21271918Mj.getClass();
            C1018703yb.LIZLLL("rd_tiktokec_video_shopping_list_close", new C21269218Li(jElapsedRealtime, str, str3, str4));
            ProductListModel productListModel = c21272418Mo.LL;
            String str5 = c21272418Mo.LLJJI;
            RecyclerView recyclerViewLIZ = c21272418Mo.LIZ();
            if (recyclerViewLIZ != null) {
                adapter = recyclerViewLIZ.getAdapter();
            } else {
                adapter = null;
            }
            int size = ((ArrayList) ((C18MZ) adapter).LLLIIIL).size();
            List<AnchorProductInfoModel> list2 = c21272418Mo.LLILLL;
            C15MV c15mv = c21272418Mo.LLILZLL;
            long jCurrentTimeMillis = System.currentTimeMillis() - c21272418Mo.LLJJ;
            int i = c21272418Mo.LLIZ;
            AbstractC21673619ry adapter4 = c21272418Mo.LIZ().getAdapter();
            if ((adapter4 instanceof C18MZ) && (c18mz = (C18MZ) adapter4) != null && (map = c18mz.LLLIIIIL) != null) {
                AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(c21272418Mo.LLILLL);
                if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (l = anchorProductInfo.productId) != null) {
                    string = l.toString();
                }
                string = (String) ((LinkedHashMap) map).get(string);
            }
            C21271918Mj.LJJIIZI(c21271918Mj, productListModel, str5, size, list2, c15mv, jCurrentTimeMillis, str, i, 0, string);
            c21272418Mo.LJ();
            if ((dialog instanceof C18O5) && (c18o5 = (C18O5) dialog) != null) {
                c18o5.LJJLIIIJL();
            }
        }
        this.LLJ = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0272 A[Catch: all -> 0x0320, CancellationException -> 0x032d, LOOP:1: B:111:0x026c->B:113:0x0272, LOOP_END, TryCatch #2 {CancellationException -> 0x032d, all -> 0x0320, blocks: (B:21:0x005e, B:24:0x007b, B:28:0x009f, B:30:0x00a3, B:31:0x00a5, B:35:0x00ac, B:37:0x00b0, B:38:0x00b2, B:40:0x00cb, B:45:0x00f0, B:47:0x00f8, B:48:0x0100, B:49:0x0103, B:51:0x010f, B:52:0x0113, B:54:0x011f, B:55:0x0123, B:57:0x012b, B:59:0x0131, B:61:0x0137, B:62:0x013b, B:64:0x0143, B:66:0x0149, B:68:0x014f, B:69:0x0153, B:71:0x015b, B:82:0x0192, B:84:0x019a, B:85:0x01a2, B:86:0x01a5, B:88:0x01bf, B:90:0x01c3, B:92:0x01cb, B:97:0x01d4, B:98:0x01da, B:100:0x01fc, B:101:0x0200, B:102:0x0220, B:104:0x0226, B:105:0x023f, B:107:0x0246, B:109:0x024c, B:110:0x024e, B:111:0x026c, B:113:0x0272, B:116:0x028e, B:118:0x0299, B:119:0x02a6, B:121:0x02b0, B:123:0x02be, B:125:0x02c4, B:128:0x02cd, B:130:0x02d3, B:132:0x02d9, B:133:0x02e1, B:134:0x02e3, B:135:0x02eb, B:137:0x02f8, B:138:0x0300, B:139:0x0317, B:81:0x0182, B:76:0x016f, B:77:0x0174, B:44:0x00e0), top: B:147:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0299 A[Catch: all -> 0x0320, CancellationException -> 0x032d, TryCatch #2 {CancellationException -> 0x032d, all -> 0x0320, blocks: (B:21:0x005e, B:24:0x007b, B:28:0x009f, B:30:0x00a3, B:31:0x00a5, B:35:0x00ac, B:37:0x00b0, B:38:0x00b2, B:40:0x00cb, B:45:0x00f0, B:47:0x00f8, B:48:0x0100, B:49:0x0103, B:51:0x010f, B:52:0x0113, B:54:0x011f, B:55:0x0123, B:57:0x012b, B:59:0x0131, B:61:0x0137, B:62:0x013b, B:64:0x0143, B:66:0x0149, B:68:0x014f, B:69:0x0153, B:71:0x015b, B:82:0x0192, B:84:0x019a, B:85:0x01a2, B:86:0x01a5, B:88:0x01bf, B:90:0x01c3, B:92:0x01cb, B:97:0x01d4, B:98:0x01da, B:100:0x01fc, B:101:0x0200, B:102:0x0220, B:104:0x0226, B:105:0x023f, B:107:0x0246, B:109:0x024c, B:110:0x024e, B:111:0x026c, B:113:0x0272, B:116:0x028e, B:118:0x0299, B:119:0x02a6, B:121:0x02b0, B:123:0x02be, B:125:0x02c4, B:128:0x02cd, B:130:0x02d3, B:132:0x02d9, B:133:0x02e1, B:134:0x02e3, B:135:0x02eb, B:137:0x02f8, B:138:0x0300, B:139:0x0317, B:81:0x0182, B:76:0x016f, B:77:0x0174, B:44:0x00e0), top: B:147:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b0 A[Catch: all -> 0x0320, CancellationException -> 0x032d, TryCatch #2 {CancellationException -> 0x032d, all -> 0x0320, blocks: (B:21:0x005e, B:24:0x007b, B:28:0x009f, B:30:0x00a3, B:31:0x00a5, B:35:0x00ac, B:37:0x00b0, B:38:0x00b2, B:40:0x00cb, B:45:0x00f0, B:47:0x00f8, B:48:0x0100, B:49:0x0103, B:51:0x010f, B:52:0x0113, B:54:0x011f, B:55:0x0123, B:57:0x012b, B:59:0x0131, B:61:0x0137, B:62:0x013b, B:64:0x0143, B:66:0x0149, B:68:0x014f, B:69:0x0153, B:71:0x015b, B:82:0x0192, B:84:0x019a, B:85:0x01a2, B:86:0x01a5, B:88:0x01bf, B:90:0x01c3, B:92:0x01cb, B:97:0x01d4, B:98:0x01da, B:100:0x01fc, B:101:0x0200, B:102:0x0220, B:104:0x0226, B:105:0x023f, B:107:0x0246, B:109:0x024c, B:110:0x024e, B:111:0x026c, B:113:0x0272, B:116:0x028e, B:118:0x0299, B:119:0x02a6, B:121:0x02b0, B:123:0x02be, B:125:0x02c4, B:128:0x02cd, B:130:0x02d3, B:132:0x02d9, B:133:0x02e1, B:134:0x02e3, B:135:0x02eb, B:137:0x02f8, B:138:0x0300, B:139:0x0317, B:81:0x0182, B:76:0x016f, B:77:0x0174, B:44:0x00e0), top: B:147:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f8 A[Catch: all -> 0x0320, CancellationException -> 0x032d, TryCatch #2 {CancellationException -> 0x032d, all -> 0x0320, blocks: (B:21:0x005e, B:24:0x007b, B:28:0x009f, B:30:0x00a3, B:31:0x00a5, B:35:0x00ac, B:37:0x00b0, B:38:0x00b2, B:40:0x00cb, B:45:0x00f0, B:47:0x00f8, B:48:0x0100, B:49:0x0103, B:51:0x010f, B:52:0x0113, B:54:0x011f, B:55:0x0123, B:57:0x012b, B:59:0x0131, B:61:0x0137, B:62:0x013b, B:64:0x0143, B:66:0x0149, B:68:0x014f, B:69:0x0153, B:71:0x015b, B:82:0x0192, B:84:0x019a, B:85:0x01a2, B:86:0x01a5, B:88:0x01bf, B:90:0x01c3, B:92:0x01cb, B:97:0x01d4, B:98:0x01da, B:100:0x01fc, B:101:0x0200, B:102:0x0220, B:104:0x0226, B:105:0x023f, B:107:0x0246, B:109:0x024c, B:110:0x024e, B:111:0x026c, B:113:0x0272, B:116:0x028e, B:118:0x0299, B:119:0x02a6, B:121:0x02b0, B:123:0x02be, B:125:0x02c4, B:128:0x02cd, B:130:0x02d3, B:132:0x02d9, B:133:0x02e1, B:134:0x02e3, B:135:0x02eb, B:137:0x02f8, B:138:0x0300, B:139:0x0317, B:81:0x0182, B:76:0x016f, B:77:0x0174, B:44:0x00e0), top: B:147:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0317 A[Catch: all -> 0x0320, CancellationException -> 0x032d, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x032d, all -> 0x0320, blocks: (B:21:0x005e, B:24:0x007b, B:28:0x009f, B:30:0x00a3, B:31:0x00a5, B:35:0x00ac, B:37:0x00b0, B:38:0x00b2, B:40:0x00cb, B:45:0x00f0, B:47:0x00f8, B:48:0x0100, B:49:0x0103, B:51:0x010f, B:52:0x0113, B:54:0x011f, B:55:0x0123, B:57:0x012b, B:59:0x0131, B:61:0x0137, B:62:0x013b, B:64:0x0143, B:66:0x0149, B:68:0x014f, B:69:0x0153, B:71:0x015b, B:82:0x0192, B:84:0x019a, B:85:0x01a2, B:86:0x01a5, B:88:0x01bf, B:90:0x01c3, B:92:0x01cb, B:97:0x01d4, B:98:0x01da, B:100:0x01fc, B:101:0x0200, B:102:0x0220, B:104:0x0226, B:105:0x023f, B:107:0x0246, B:109:0x024c, B:110:0x024e, B:111:0x026c, B:113:0x0272, B:116:0x028e, B:118:0x0299, B:119:0x02a6, B:121:0x02b0, B:123:0x02be, B:125:0x02c4, B:128:0x02cd, B:130:0x02d3, B:132:0x02d9, B:133:0x02e1, B:134:0x02e3, B:135:0x02eb, B:137:0x02f8, B:138:0x0300, B:139:0x0317, B:81:0x0182, B:76:0x016f, B:77:0x0174, B:44:0x00e0), top: B:147:0x005e }] */
    @Override // X.InterfaceC1394860mOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r22, X.InterfaceC1392640mLO r23) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJIIZILJ(int, X.0mLO):void");
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIJJ(Aweme aweme, AwS565S0100000_21 awS565S0100000_21) {
        AnonymousClass0956 anonymousClass0956;
        String aid;
        try {
            C1766860w4y c1766860w4y = C1766860w4y.LIZ;
            View view = this.LLIZLLLIL;
            c1766860w4y.getClass();
            C1766860w4y.LJIIIZ(view, null, false);
            awS565S0100000_21.invoke();
            if (((Boolean) C268580Afo.LIZ.getValue()).booleanValue()) {
                ISeaPdpFypAnchorPrefetchService iSeaPdpFypAnchorPrefetchServiceLIZJ = SeaPdpFypAnchorBatchPreload.LIZJ();
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                iSeaPdpFypAnchorPrefetchServiceLIZJ.LIZ(aid);
            } else if (this.LLILZLL != null && (anonymousClass0956 = this.LLIZ) != null) {
                this.LLILZLL = null;
                anonymousClass0956.LIZIZ(null);
            }
            C21272418Mo c21272418Mo = this.LLILLL;
            if (c21272418Mo != null) {
                c21272418Mo.LJ();
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJJII(AnchorCommonStruct anchorCommonStruct, Aweme aweme) {
        if (this.LL.isEmpty()) {
            AnchorBizUtils.LIZ.getClass();
            List<AnchorProductInfoModel> listLJJZZIII = AnchorBizUtils.LJJZZIII(anchorCommonStruct, true);
            this.LL = listLJJZZIII;
            this.LLILLJJLI = (AnchorProductInfoModel) C13LP.LJJJLL(listLJJZZIII);
            if (aweme != null) {
                C21272518Mp c21272518Mp = C21272518Mp.LIZ;
                String aid = aweme.getAid();
                String authorUid = AwemeExtKt.getAuthorUid(aweme);
                List<AnchorProductInfoModel> list = this.LL;
                ArrayList arrayList = new ArrayList();
                Iterator<AnchorProductInfoModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    Long l = it2.next().extraData.productId;
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                c21272518Mp.getClass();
                C21272518Mp.LJIILJJIL(aid, authorUid, arrayList);
                C21272518Mp c21272518Mp2 = C21272518Mp.LIZ;
                String aid2 = aweme.getAid();
                c21272518Mp2.getClass();
                C21272518Mp.LIZ(aweme, aid2);
            }
        }
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIIL(C2344009Gk c2344009Gk, boolean z, InterfaceC1392640mLO interfaceC1392640mLO) throws JSONException {
        String string;
        String str;
        String strLIZ;
        AnchorProductInfoModel anchorProductInfoModel;
        Integer num;
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        Integer num2;
        Integer num3;
        String string2;
        String creativeIdStr;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str3;
        String strLJIIIZ;
        String strLJIIIZ2;
        AnchorProductInfo anchorProductInfo;
        String str4;
        Integer numLJIIJJI;
        Map<String, String> map;
        String str5;
        String strLJIIIZ3;
        HashMap<String, Object> mapLJIIJ;
        PhotoModeImageInfo photoModeImageInfo;
        Integer numValueOf;
        List<PhotoModeImageUrlModel> imageList;
        boolean z2;
        String name;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        boolean z3;
        String name2;
        AnchorProductInfo anchorProductInfo2;
        AnchorProductInfo anchorProductInfo3;
        AnchorProductInfo anchorProductInfo4;
        Long l;
        Integer num4;
        String str6;
        AnchorProductInfo anchorProductInfo5;
        AnchorProductInfo anchorProductInfo6;
        this.LLJI = c2344009Gk;
        Integer num5 = 0;
        String str7 = "video_single_anchor";
        String str8 = "yes";
        String str9 = "";
        if (!z) {
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            AnchorProductInfoModel anchorProductInfoModel2 = (AnchorProductInfoModel) C13LP.LJJJLL(this.LL);
            c21271918Mj.getClass();
            Pair[] pairArr = new Pair[9];
            pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
            String strCf = interfaceC1392640mLO.Cf();
            if (strCf != null) {
                str9 = strCf;
            }
            pairArr[1] = new Pair("enter_from", str9);
            pairArr[2] = new Pair("anchor_show_type", "video_cart_tag");
            if (anchorProductInfoModel2 != null && (anchorProductInfo6 = anchorProductInfoModel2.extraData) != null) {
                num4 = anchorProductInfo6.platform;
            } else {
                num4 = null;
            }
            pairArr[3] = new Pair("product_source", String.valueOf(num4));
            if (anchorProductInfoModel2 != null && (anchorProductInfo5 = anchorProductInfoModel2.extraData) != null) {
                str6 = anchorProductInfo5.source;
            } else {
                str6 = null;
            }
            pairArr[4] = new Pair("source", str6);
            if (!interfaceC1392640mLO.LJII()) {
                str8 = "no";
            }
            pairArr[5] = new Pair("is_single_anchor", str8);
            if (!interfaceC1392640mLO.LJII()) {
                str7 = "video_multi_anchor";
            }
            pairArr[6] = new Pair("entrance_form", str7);
            pairArr[7] = new Pair("page_name", "video");
            pairArr[8] = new Pair("rd_extra", "maker-window-fail");
            C1421105hJ.LIZLLL("rd_tiktok_video_anchor_show", pairArr);
            return;
        }
        if (this.LL.size() > 1) {
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(this, interfaceC1392640mLO, 68);
            anchorBizUtils.getClass();
            AnchorBizUtils.LJIILIIL(awemeLJJLIIIJJIZ, awS433S0200000_32);
        }
        C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
        List<AnchorProductInfoModel> list = this.LL;
        Map<String, String> map2 = this.LLJILJIL;
        String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
        if (aid == null) {
            aid = "";
        }
        AnchorProductInfoModel anchorProductInfoModel3 = (AnchorProductInfoModel) C13LP.LJJJLL(this.LL);
        if (anchorProductInfoModel3 != null && (anchorProductInfo4 = anchorProductInfoModel3.extraData) != null && (l = anchorProductInfo4.productId) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (map2 == null) {
            strLIZ = "";
        } else {
            if (string == null) {
                str = "";
            } else {
                str = string;
            }
            strLIZ = C03RE.LIZ("", aid, str);
            if (string == null) {
                string = "";
            }
            map2.put(string, strLIZ);
        }
        c21271918Mj2.getClass();
        Aweme awemeLJJLIIIJJIZ2 = interfaceC1392640mLO.LJJLIIIJJIZ();
        if (list != null) {
            anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list);
        } else {
            anchorProductInfoModel = null;
        }
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        c18n0.LJIJI = "TEMAI";
        c18n0.LIZJ = awemeLJJLIIIJJIZ2.getAid();
        c18n0.LIZLLL = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ2);
        c18n0.LJ = awemeLJJLIIIJJIZ2.getRequestId();
        String strCf2 = interfaceC1392640mLO.Cf();
        if (strCf2 == null) {
            strCf2 = "";
        }
        c18n0.LIZIZ = strCf2;
        c18n0.LJIIJJI = "video_cart_tag";
        if (anchorProductInfoModel != null && (anchorProductInfo3 = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo3.platform;
        } else {
            num = null;
        }
        c18n0.LJIILJJIL = String.valueOf(num);
        if (anchorProductInfoModel != null && (anchorProductInfo2 = anchorProductInfoModel.extraData) != null) {
            str2 = anchorProductInfo2.source;
        } else {
            str2 = null;
        }
        c18n0.LJIIL = str2;
        AnchorBizUtils.LIZ.getClass();
        c18n0.LJIILLIIL = AnchorBizUtils.LJIL(list);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        c21272018Mk.getClass();
        c18n0.LJJIIJ = C21272018Mk.LJIIJJI(anchorProductInfoModel);
        c18n0.LJJIJL = Integer.valueOf(C21272018Mk.LJIIIIZZ(awemeLJJLIIIJJIZ2));
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ2);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (Intrinsics.LJFF(authorUid, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
            num2 = 1;
        } else {
            num2 = num5;
        }
        c18n0.LJIIZILJ = num2;
        if (!interfaceC1392640mLO.LJII()) {
            str8 = "no";
        }
        c18n0.LJIJ = str8;
        if (awemeLJJLIIIJJIZ2.isAd()) {
            num3 = 1;
        } else {
            num3 = num5;
        }
        c18n0.LJIJJLI = num3;
        if (awemeLJJLIIIJJIZ2.isAd() && (awemeRawAd2 = awemeLJJLIIIJJIZ2.getAwemeRawAd()) != null && (creativeId = awemeRawAd2.getCreativeId()) != null) {
            string2 = creativeId.toString();
        } else {
            string2 = null;
        }
        c18n0.LJIL = string2;
        if (awemeLJJLIIIJJIZ2.isAd() && (awemeRawAd = awemeLJJLIIIJJIZ2.getAwemeRawAd()) != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        c18n0.LJJ = creativeIdStr;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        c18n0.LJJII = ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getFollowStatus(awemeLJJLIIIJJIZ2);
        c18n0.LJJIFFI = "video";
        c18n0.LJJIII = C21272018Mk.LJIIL(awemeLJJLIIIJJIZ2, interfaceC1392640mLO.LJII());
        c18n0.LJLIL = C1010603xI.LIZ(C21272018Mk.LJIILIIL(awemeLJJLIIIJJIZ2));
        if (anchorProductInfoModel == null || (str3 = anchorProductInfoModel.extra) == null) {
            str3 = "";
        }
        c18n0.LJJIL = C21272218Mm.LJIJ(str3);
        c18n0.LJJJIL = "video";
        if (AwemeExtKt.isPhotoMode(awemeLJJLIIIJJIZ2)) {
            c18n0.LJJLJ = 150;
            if (awemeLJJLIIIJJIZ2.getPhotoModeImageInfo() != null && (photoModeImageInfo = awemeLJJLIIIJJIZ2.getPhotoModeImageInfo()) != null && photoModeImageInfo.getImageList() != null) {
                PhotoModeImageInfo photoModeImageInfo2 = awemeLJJLIIIJJIZ2.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList.size());
                } else {
                    numValueOf = null;
                }
                c18n0.LJJLJLI = numValueOf;
            }
        }
        c18n0.LJJJIL = "video";
        c18n0.LJJZZI = "maker-window";
        if (c2344009Gk != null) {
            strLJIIIZ = c2344009Gk.LJIIIZ("is_content_truncate");
        } else {
            strLJIIIZ = null;
        }
        c18n0.LJL = strLJIIIZ;
        if (c2344009Gk != null) {
            strLJIIIZ2 = c2344009Gk.LJIIIZ("anchor_content_size");
        } else {
            strLJIIIZ2 = null;
        }
        c18n0.LJLI = strLJIIIZ2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C21272218Mm.LJIILL(awemeLJJLIIIJJIZ2, "tiktok_video_anchor_click", c18n0.LIZIZ, awemeLJJLIIIJJIZ2.getMobParams()));
        if (strLIZ != null) {
            str9 = strLIZ;
        }
        linkedHashMap.put("track_id", str9);
        Map mobParams = awemeLJJLIIIJJIZ2.getMobParams();
        if (mobParams == null) {
            mobParams = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mobParams);
        C18LI.LIZ.getClass();
        linkedHashMap.putAll(C18LI.LIZJ(awemeLJJLIIIJJIZ2));
        Map mapLJJIFFI = C21272018Mk.LJJIFFI(c21272018Mk, awemeLJJLIIIJJIZ2, null, 2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJJIFFI.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLJJIFFI).entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(linkedHashMap2);
        C21272018Mk.LIZ.getClass();
        Map mapLJFF = C21272018Mk.LJFF(list);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJFF.size()));
        for (Map.Entry entry2 : mapLJFF.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), entry2.getValue().toString());
        }
        linkedHashMap.putAll(linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        if (c2344009Gk != null && (strLJIIIZ3 = c2344009Gk.LJIIIZ("btm_param_map_key")) != null && (mapLJIIJ = C1741890vQh.LJIIJ(strLJIIIZ3)) != null) {
            for (Map.Entry<String, Object> entry3 : mapLJIIJ.entrySet()) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue().toString());
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap4.size()));
        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
            linkedHashMap5.put(entry4.getKey(), entry4.getValue());
        }
        linkedHashMap.putAll(linkedHashMap5);
        if (anchorProductInfoModel != null) {
            C21272018Mk.LIZ.getClass();
            linkedHashMap.putAll(C21272018Mk.LJIJI(anchorProductInfoModel, null));
        }
        C21272018Mk.LIZ.getClass();
        linkedHashMap.putAll(C21272018Mk.LJIJ(-1, awemeLJJLIIIJJIZ2));
        c18n0.LIZ = linkedHashMap;
        if (!interfaceC1392640mLO.LJII()) {
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            Aweme awemeLJJLIIIJJIZ3 = interfaceC1392640mLO.LJJLIIIJJIZ();
            c21272618Mq.getClass();
            if (C21272618Mq.LJIJ(awemeLJJLIIIJJIZ3)) {
                c18n0.LJJJJJ = num5;
                c18n0.LJJI = "video_multi_anchor";
            } else {
                if (c2344009Gk == null || (map = c2344009Gk.LIZ) == null || (str5 = (String) ((HashMap) map).get("multi_anchor_display")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) == null) {
                    numLJIIJJI = num5;
                }
                c18n0.LJJJJJ = numLJIIJJI;
                if (numLJIIJJI != null && numLJIIJJI.intValue() == 0) {
                    c18n0.LJJI = "video_multi_anchor";
                } else {
                    c18n0.LJJI = "video_main_anchor";
                }
            }
        } else {
            c18n0.LJJI = "video_single_anchor";
        }
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJL(awemeLJJLIIIJJIZ2)) {
            num5 = 1;
        }
        c18n0.LJJJJIZL = num5;
        c18n0.LJJIJIL = 1;
        C21272018Mk.LIZ(c18n0, awemeLJJLIIIJJIZ2);
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (str4 = anchorProductInfo.anchorTitleDaInfo) != null) {
            c18n0.LJLIIL = C1010603xI.LIZ(str4);
        }
        iCommerceServiceLIZ.logCommerceEvents("tiktok_video_anchor_view", c18n0);
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIJ(SmartImageView smartImageView, Aweme aweme, boolean z) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_enable_icon_url_download", true) && z) {
            C1735040vFe.LIZ.getClass();
            C1735040vFe.LIZJ(aweme, smartImageView);
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            C21272618Mq.LIZ.getClass();
            c419910GdJ.LIZ = C21272618Mq.LJIILL(C21272618Mq.LJIILLIIL(aweme));
            smartImageView.setImageDrawable(c419910GdJ.LIZ(smartImageView.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0  */
    @Override // X.InterfaceC1394860mOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(boolean r32, android.app.Dialog r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJIL(boolean, android.app.Dialog, boolean):void");
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJJI(boolean z, String str, InterfaceC1392640mLO interfaceC1392640mLO) throws JSONException {
        String str2;
        String str3;
        String str4;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        List<AnchorProductInfoModel> list = this.LL;
        c21271918Mj.getClass();
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        pairArr[1] = new Pair("page_name", "video");
        pairArr[2] = new Pair("enter_from", str);
        pairArr[3] = new Pair("author_id", AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ));
        pairArr[4] = new Pair("group_id", awemeLJJLIIIJJIZ.getAid());
        AnchorBizUtils.LIZ.getClass();
        pairArr[5] = new Pair("anchor_type", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS278S0000000_32.get$arr$(33), 30));
        pairArr[6] = new Pair("product_cnt", Integer.valueOf(list.size()));
        pairArr[7] = new Pair("request_id", awemeLJJLIIIJJIZ.getRequestId());
        if (interfaceC1392640mLO.LJII()) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        pairArr[8] = new Pair("entrance_form", str2);
        if (interfaceC1392640mLO.LJII()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        pairArr[9] = new Pair("is_single_anchor", str3);
        if (z) {
            str4 = "custom-window";
        } else {
            str4 = "maker-window";
        }
        pairArr[10] = new Pair("rd_extra", str4);
        pairArr[11] = new Pair("product_ids", AnchorBizUtils.LJIL(list));
        C1421105hJ.LIZLLL("rd_tiktokec_video_anchor_data_get", pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(final java.util.List<java.lang.String> r37, final X.InterfaceC1392640mLO r38, final boolean r39) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJJIJ(java.util.List, X.0mLO, boolean):void");
    }

    public final void LIZLLL(String str, String str2, String str3, InterfaceC1392640mLO interfaceC1392640mLO) {
        Integer num;
        AnchorProductInfo anchorProductInfo;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("enter_from", str3);
        linkedHashMap.put("page_type", "video");
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLJJLI;
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", String.valueOf(num));
        linkedHashMap.put("rd_extra", str2);
        if (LJIILL() != C15MV.REGION_UNAVAILABLE) {
            linkedHashMap.put("shopping_status", C188A.PRODUCT_AVAILABLE.getValue());
        } else {
            linkedHashMap.put("shopping_status", C188A.PRODUCT_NOT_AVAILABLE.getValue());
        }
        boolean zLJII = interfaceC1392640mLO.LJII();
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("rd_tiktok_video_anchor_click", new C18MT(str, linkedHashMap, zLJII));
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJIIIZ(C2344009Gk c2344009Gk, boolean z, InterfaceC1392640mLO interfaceC1392640mLO, String str) throws JSONException {
        Integer num;
        String str2;
        IECommerceHostService iECommerceHostService;
        String str3;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        boolean z3;
        String name;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        C18LI.LIZ.getClass();
        C18LI.LIZ(interfaceC1392640mLO);
        this.LLJI = c2344009Gk;
        if (!z) {
            Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
            if (this.LLILZ == null && (activityLIZIZ instanceof C19EG)) {
                this.LLILZ = (ECommerceAnchorPanelViewModel) ViewModelProviders.of((C19EG) activityLIZIZ).get(ECommerceAnchorPanelViewModel.class);
            }
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            c21272618Mq.getClass();
            if (C21272618Mq.LIZLLL(awemeLJJLIIIJJIZ)) {
                this.LLILZIL = 2;
                C21272418Mo c21272418Mo = this.LLILLL;
                if (c21272418Mo != null) {
                    c21272418Mo.LIZIZ();
                }
                List<AnchorProductInfoModel> list = this.LL;
                ArrayList arrayList = new ArrayList();
                Iterator<AnchorProductInfoModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(String.valueOf(it2.next().extraData.productId));
                }
                LJJIJ(arrayList, interfaceC1392640mLO, true);
            }
        }
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLJJLI;
        c21271918Mj.getClass();
        Aweme awemeLJJLIIIJJIZ2 = interfaceC1392640mLO.LJJLIIIJJIZ();
        Pair[] pairArr = new Pair[12];
        String strCf = interfaceC1392640mLO.Cf();
        if (strCf == null) {
            strCf = "";
        }
        pairArr[0] = new Pair("enter_from", strCf);
        pairArr[1] = new Pair("author_id", AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ2));
        pairArr[2] = new Pair("group_id", awemeLJJLIIIJJIZ2.getAid());
        pairArr[3] = new Pair("product_type", str);
        pairArr[4] = new Pair("page_type", "video");
        pairArr[5] = new Pair("anchor_show_type", "video_cart_tag");
        String name2 = null;
        if (anchorProductInfoModel != null && (anchorProductInfo2 = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo2.platform;
        } else {
            num = null;
        }
        pairArr[6] = new Pair("product_source", String.valueOf(num));
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            str2 = anchorProductInfo.source;
        } else {
            str2 = null;
        }
        pairArr[7] = new Pair("source", str2);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
            iECommerceHostService = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        pairArr[8] = new Pair("follow_status", ((IAnchorDependencyService) iECommerceHostService).getFollowStatus(awemeLJJLIIIJJIZ2));
        if (interfaceC1392640mLO.LJII()) {
            str3 = "video_single_anchor";
        } else {
            str3 = "video_multi_anchor";
        }
        pairArr[9] = new Pair("entrance_form", str3);
        pairArr[10] = new Pair("page_name", "video");
        AnchorBizUtils.LIZ.getClass();
        pairArr[11] = new Pair("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLL(awemeLJJLIIIJJIZ2) ? 1 : 0));
        C1421105hJ.LIZLLL("product_anchor_show", pairArr);
        if (interfaceC1392640mLO.LJJLIIIJJIZ().isAd()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                IAdDependencyService iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name4 = IAdDependencyService.class.getName();
                if (iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin != null) {
                    name2 = iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
                iECommerceHostService2 = iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) iECommerceHostService2).onAdEvent("draw_ad", "othershow", interfaceC1392640mLO.LJJLIIIJJIZ().getAwemeRawAd());
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "shop_anchor");
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJJIFFI(Aweme aweme, View view, boolean z, AwS565S0100000_21 awS565S0100000_21) {
        Context contextLIZ;
        long jIntValue;
        Integer num;
        String aid;
        this.LLIZLLLIL = view;
        C1766860w4y.LIZ.getClass();
        boolean z2 = true;
        C1766860w4y.LJIIIZ(view, null, true);
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = 1500L;
        C013C c013c = new C013C();
        awS565S0100000_21.invoke();
        if (((Boolean) C268580Afo.LIZ.getValue()).booleanValue()) {
            ISeaPdpFypAnchorPrefetchService iSeaPdpFypAnchorPrefetchServiceLIZJ = SeaPdpFypAnchorBatchPreload.LIZJ();
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            iSeaPdpFypAnchorPrefetchServiceLIZJ.LIZIZ(aid, aweme, LIZIZ(), LIZJ(), view, z);
        } else {
            if (z) {
                try {
                    AnchorPdpPreloadModel anchorPdpPreloadModelLJJLL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLL();
                    if (anchorPdpPreloadModelLJJLL != null && (num = anchorPdpPreloadModelLJJLL.duration) != null) {
                        jIntValue = num.intValue();
                    } else {
                        jIntValue = 3000;
                    }
                    c238400w2.element = jIntValue;
                    if (anchorPdpPreloadModelLJJLL == null || anchorPdpPreloadModelLJJLL.enable != 1) {
                        z2 = false;
                    }
                    c013c.element = z2;
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    z2 = false;
                }
                IECommerceService iECommerceService = (IECommerceService) ServiceManager.get().getService(IECommerceService.class);
                if (view == null || (contextLIZ = view.getContext()) == null) {
                    contextLIZ = C7879035x.LIZ();
                }
                iECommerceService.prefetchPdpResource("", contextLIZ, 2, true, null);
                if (!z2) {
                    this.LLILZLL = null;
                    return;
                }
            } else {
                try {
                    c238400w2.element = C18OW.LIZ().preloadDuration;
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            this.LLILZLL = new ARunnableS4S0410000_32(view, this, c013c, z, aweme, 1);
            this.LLIZ = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C314350CTx(c238400w2, this, null), 3);
        }
        if (aweme != null) {
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            String aid2 = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            List<AnchorProductInfoModel> list = this.LL;
            ArrayList arrayList = new ArrayList();
            Iterator<AnchorProductInfoModel> it2 = list.iterator();
            while (it2.hasNext()) {
                Long l = it2.next().extraData.productId;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            c21272518Mp.getClass();
            C21272518Mp.LJIILJJIL(aid2, authorUid, arrayList);
            C21272518Mp c21272518Mp2 = C21272518Mp.LIZ;
            String aid3 = aweme.getAid();
            c21272518Mp2.getClass();
            C21272518Mp.LIZ(aweme, aid3);
        }
        ((IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class)).initPitayaAfterUserTrigger();
    }

    @Override // X.InterfaceC1394860mOy
    public final void LJJIIZ(ViewGroup viewGroup, C2344009Gk c2344009Gk, boolean z, InterfaceC1392640mLO interfaceC1392640mLO) {
        String str;
        RecyclerView recyclerViewLIZ;
        RecyclerView recyclerViewLIZ2;
        List<Observer<List<C21271118Mb>>> list;
        MutableLiveData<List<C21271118Mb>> mutableLiveData;
        RecyclerView recyclerViewLIZ3;
        List<Observer<List<C21271118Mb>>> list2;
        List<Observer<List<C21271118Mb>>> list3;
        MutableLiveData<List<C21271118Mb>> mutableLiveData2;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel;
        MutableLiveData<List<C21271118Mb>> mutableLiveData3;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2;
        MutableLiveData<List<C21271118Mb>> mutableLiveData4;
        try {
            if (this.LLILLL != null && (eCommerceAnchorPanelViewModel = this.LLILZ) != null && (mutableLiveData3 = eCommerceAnchorPanelViewModel.LLJJ) != null && mutableLiveData3.hasObservers() && (eCommerceAnchorPanelViewModel2 = this.LLILZ) != null && (mutableLiveData4 = eCommerceAnchorPanelViewModel2.LLJJ) != null) {
                C21272418Mo c21272418Mo = this.LLILLL;
                if (c21272418Mo != null) {
                    mutableLiveData4.removeObserver(c21272418Mo);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = this.LLILZ;
            if (eCommerceAnchorPanelViewModel3 != null && (list3 = eCommerceAnchorPanelViewModel3.LLJILJIL) != null) {
                for (Observer observer : (ArrayList) list3) {
                    ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel4 = this.LLILZ;
                    if (eCommerceAnchorPanelViewModel4 != null && (mutableLiveData2 = eCommerceAnchorPanelViewModel4.LLJJ) != null) {
                        mutableLiveData2.removeObserver(observer);
                    }
                }
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel5 = this.LLILZ;
            if (eCommerceAnchorPanelViewModel5 != null && (list2 = eCommerceAnchorPanelViewModel5.LLJILJIL) != null) {
                ((ArrayList) list2).clear();
            }
            C21272418Mo c21272418Mo2 = this.LLILLL;
            if (c21272418Mo2 != null) {
                c21272418Mo2.LJ();
            }
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            List<AnchorProductInfoModel> list4 = this.LL;
            c21272018Mk.getClass();
            int iLJIIZILJ = C21272018Mk.LJIIZILJ(awemeLJJLIIIJJIZ, c2344009Gk, list4);
            Map<String, String> map = c2344009Gk.LIZ;
            if (map != null) {
            }
            if (interfaceC1392640mLO.LJII()) {
                str = "video_single_anchor";
            } else if (iLJIIZILJ == 1) {
                str = "video_main_anchor";
            } else {
                str = "video_multi_anchor";
            }
            AbstractC21673619ry adapter = null;
            this.LLILLL = new C21272418Mo(C21272218Mm.LJJIJL(interfaceC1392640mLO.LJJLIIIJJIZ(), interfaceC1392640mLO, str, null, null), viewGroup.getContext(), this.LL, c2344009Gk, z, this.LLILZIL, LJIILL());
            C786410Ut5.LJJJJI(viewGroup);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            C21272418Mo c21272418Mo3 = this.LLILLL;
            if (c21272418Mo3 != null && (recyclerViewLIZ3 = c21272418Mo3.LIZ()) != null) {
                C786410Ut5.p6(recyclerViewLIZ3, layoutParams);
            }
            C21272418Mo c21272418Mo4 = this.LLILLL;
            if (c21272418Mo4 != null) {
                recyclerViewLIZ = c21272418Mo4.LIZ();
            } else {
                recyclerViewLIZ = null;
            }
            viewGroup.addView(recyclerViewLIZ, 0);
            C21272418Mo c21272418Mo5 = this.LLILLL;
            if (c21272418Mo5 != null) {
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel6 = this.LLILZ;
                if (eCommerceAnchorPanelViewModel6 != null && (mutableLiveData = eCommerceAnchorPanelViewModel6.LLJJ) != null) {
                    mutableLiveData.observeForever(c21272418Mo5);
                }
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel7 = this.LLILZ;
                if (eCommerceAnchorPanelViewModel7 != null && (list = eCommerceAnchorPanelViewModel7.LLJILJIL) != null) {
                    ((ArrayList) list).add(c21272418Mo5);
                }
            }
            List<AnchorProductInfoModel> list5 = this.LL;
            ArrayList arrayList = new ArrayList();
            Iterator<AnchorProductInfoModel> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().extraData.productId));
            }
            this.LLILZIL = 2;
            C21272418Mo c21272418Mo6 = this.LLILLL;
            if (c21272418Mo6 != null) {
                c21272418Mo6.LIZIZ();
            }
            LJJIJ(arrayList, interfaceC1392640mLO, false);
            C21272418Mo c21272418Mo7 = this.LLILLL;
            if (c21272418Mo7 != null && (recyclerViewLIZ2 = c21272418Mo7.LIZ()) != null) {
                adapter = recyclerViewLIZ2.getAdapter();
            }
            C18MZ c18mz = (C18MZ) adapter;
            if (c18mz != null) {
                c18mz.LLLILZLLLI();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r1 = r7.element;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    @Override // X.InterfaceC1394860mOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(android.view.View r19, boolean r20, X.InterfaceC1392640mLO r21, X.C2344009Gk r22, kotlin.jvm.functions.Function1<? super X.C2344009Gk, kotlin.Unit> r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJIIIIZZ(android.view.View, boolean, X.0mLO, X.09Gk, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0414  */
    @Override // X.InterfaceC1394860mOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(boolean r36, X.C2344009Gk r37, boolean r38, X.InterfaceC1392640mLO r39, kotlin.jvm.internal.AwS600S0100000_21 r40) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJIILIIL(boolean, X.09Gk, boolean, X.0mLO, kotlin.jvm.internal.AwS600S0100000_21):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1394860mOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(android.view.View r26, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r27, int r28, X.InterfaceC1392640mLO r29, kotlin.jvm.internal.AwS600S0100000_21 r30) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJJIIJ(android.view.View, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, int, X.0mLO, kotlin.jvm.internal.AwS600S0100000_21):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162 A[PHI: r3
      0x0162: PHI (r3v45 android.view.View) = (r3v44 android.view.View), (r3v48 android.view.View) binds: [B:78:0x015c, B:80:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(final com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r26, boolean r27, final X.InterfaceC1392640mLO r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, android.view.View r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272118Ml.LJJIIZI(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, boolean, X.0mLO, java.lang.String, java.lang.String, java.lang.String, android.view.View):void");
    }
}
