package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorOneStepCheckoutConfig;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ShowTextInfo;
import com.ss.android.ugc.aweme.ecommerce.model.SimplePrice;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MZ extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC1865670yeL {
    public final ProductListModel LL;
    public final Context LLILLJJLI;
    public final HashMap<String, String> LLILLL;
    public final boolean LLILZ;
    public int LLILZIL;
    public final IECommerceVideoService LLILZLL;
    public final IECommerceAnchorService LLIZ;
    public final AnchorPanelConfig LLIZLLLIL;
    public final C0HBC LLJ;
    public final List<AnchorProductInfoModel> LLJI;
    public final String LLJIJIL;
    public final int LLJILJIL;
    public final boolean LLJILJILJ;
    public Map<String, List<PromotionLogo>> LLJILLL;
    public Map<String, String> LLJJ;
    public Map<String, PromotionInfo> LLJJI;
    public Map<String, SimplePrice> LLJJIII;
    public Map<String, String> LLJJIJI;
    public Map<String, String> LLJJIJIIJIL;
    public Map<String, Map<String, Object>> LLJJIJIL;
    public Map<String, AddToCartButton> LLJJJ;
    public Map<String, String> LLJJJIL;
    public Map<String, Float> LLJJJJ;
    public Map<String, Integer> LLJJJJJIL;
    public Map<String, ShowTextInfo> LLJJJJLIIL;
    public Map<String, String> LLJJL;
    public Map<String, String> LLJJLIIIJLLLLLLLZ;
    public Map<String, VideoProductDaInfo> LLJL;
    public Map<String, EnhancedBrandLogo> LLJLIL;
    public Map<String, SellerInfo> LLJLILLLLZIIL;
    public Map<String, List<SkuItem>> LLJLL;
    public CartEntry LLJLLIL;
    public Map<String, String> LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public final Map<String, C21271218Mc> LLL;
    public final Map<String, C0NOH> LLLF;
    public Map<String, String> LLLFF;
    public Map<String, Map<String, String>> LLLFFI;
    public Map<String, AnchorOneStepCheckoutConfig> LLLFZ;
    public final boolean[] LLLI;
    public final Map<String, List<PromotionLabel>> LLLII;
    public final Map<String, String> LLLIIII;
    public final Map<String, String> LLLIIIIL;
    public final List<Integer> LLLIIIL;
    public final List<Integer> LLLIIL;
    public final HashSet<Integer> LLLIILIL;
    public boolean LLLIL;
    public final C01GW LLLILZ;

    public final void LLLI() {
        Iterator it2 = ((LinkedHashMap) this.LLL).entrySet().iterator();
        while (it2.hasNext()) {
            C21271218Mc c21271218Mc = (C21271218Mc) ((Map.Entry) it2.next()).getValue();
            c21271218Mc.getClass();
            try {
                ((ArrayList) c21271218Mc.LJFF).clear();
                BPEAHandler bPEAHandler = c21271218Mc.LJ;
                ARunnableS132S0100000_32 aRunnableS132S0100000_32 = c21271218Mc.LJIIIZ;
                if (aRunnableS132S0100000_32 == null) {
                    aRunnableS132S0100000_32 = null;
                }
                bPEAHandler.removeCallbacks(aRunnableS132S0100000_32);
                c21271218Mc.LIZIZ = c21271218Mc.LIZLLL;
                c21271218Mc.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((LinkedHashMap) this.LLL).clear();
        Iterator it3 = ((LinkedHashMap) this.LLLF).entrySet().iterator();
        while (it3.hasNext()) {
            ((C0NOH) ((Map.Entry) it3.next()).getValue()).LIZJ();
        }
        ((LinkedHashMap) this.LLLF).clear();
    }

    public final AnchorPanelProductManager LLLIIIIL() {
        return (AnchorPanelProductManager) this.LLLILZ.getValue();
    }

    public final void LLLILZLLLI() {
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        ProductListModel productListModel = this.LL;
        String str = productListModel != null ? productListModel.aid : null;
        EnumC21274418Ni enumC21274418Ni = EnumC21274418Ni.DEFAULT;
        c21272518Mp.getClass();
        GetItemProductInfoResponseData getItemProductInfoResponseDataLJI = C21272518Mp.LJI(str, "video_anchor", 0, enumC21274418Ni);
        if (getItemProductInfoResponseDataLJI != null) {
            LLLIIIIL().LJIJ.setPromotionInfoFromCache(true);
            AnchorBizUtils.LIZ.getClass();
            LLLL((C21271118Mb) C13LP.LJJJLL(AnchorBizUtils.LJIJJ(getItemProductInfoResponseDataLJI, false)));
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJILJ ? this.LLJI.size() + 1 : this.LLJI.size();
    }

    public final C21271018Ma LLLFZ(int i) {
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        PromotionInfo promotionInfo;
        SimplePrice simplePrice;
        List list;
        Map map;
        AddToCartButton addToCartButton;
        Float f;
        Integer num;
        ShowTextInfo showTextInfo;
        String str5;
        String str6;
        VideoProductDaInfo videoProductDaInfo;
        EnhancedBrandLogo enhancedBrandLogo;
        SellerInfo sellerInfo;
        List list2;
        String str7;
        Map map2;
        Long l = ((AnchorProductInfoModel) ListProtector.get(this.LLJI, i)).extraData.productId;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        Map<String, String> map3 = this.LLJJ;
        if (map3 != null) {
            str = (String) ((LinkedHashMap) map3).get(string);
        } else {
            str = null;
        }
        Map<String, String> map4 = this.LLJJIJIIJIL;
        if (map4 != null) {
            str2 = (String) ((LinkedHashMap) map4).get(string);
        } else {
            str2 = null;
        }
        Map<String, String> map5 = this.LLJJIJI;
        if (map5 != null) {
            str3 = (String) ((LinkedHashMap) map5).get(string);
        } else {
            str3 = null;
        }
        Map<String, String> map6 = this.LLLFF;
        if (map6 != null) {
            str4 = (String) ((LinkedHashMap) map6).get(string);
        } else {
            str4 = null;
        }
        Map<String, PromotionInfo> map7 = this.LLJJI;
        if (map7 != null) {
            promotionInfo = (PromotionInfo) ((LinkedHashMap) map7).get(string);
        } else {
            promotionInfo = null;
        }
        Map<String, SimplePrice> map8 = this.LLJJIII;
        if (map8 != null) {
            simplePrice = (SimplePrice) ((LinkedHashMap) map8).get(string);
        } else {
            simplePrice = null;
        }
        Map<String, List<PromotionLogo>> map9 = this.LLJILLL;
        if (map9 != null) {
            list = (List) ((LinkedHashMap) map9).get(string);
        } else {
            list = null;
        }
        Map<String, Map<String, Object>> map10 = this.LLJJIJIL;
        if (map10 != null) {
            map = (Map) ((LinkedHashMap) map10).get(string);
        } else {
            map = null;
        }
        Map<String, AddToCartButton> map11 = this.LLJJJ;
        if (map11 != null) {
            addToCartButton = (AddToCartButton) ((LinkedHashMap) map11).get(string);
        } else {
            addToCartButton = null;
        }
        Map<String, Float> map12 = this.LLJJJJ;
        if (map12 != null) {
            f = (Float) ((LinkedHashMap) map12).get(string);
        } else {
            f = null;
        }
        Map<String, Integer> map13 = this.LLJJJJJIL;
        if (map13 != null) {
            num = (Integer) ((LinkedHashMap) map13).get(string);
        } else {
            num = null;
        }
        Map<String, ShowTextInfo> map14 = this.LLJJJJLIIL;
        if (map14 != null) {
            showTextInfo = (ShowTextInfo) ((LinkedHashMap) map14).get(string);
        } else {
            showTextInfo = null;
        }
        Map<String, String> map15 = this.LLJJL;
        if (map15 != null) {
            str5 = (String) ((LinkedHashMap) map15).get(string);
        } else {
            str5 = null;
        }
        Map<String, String> map16 = this.LLJJLIIIJLLLLLLLZ;
        if (map16 != null) {
            str6 = (String) ((LinkedHashMap) map16).get(string);
        } else {
            str6 = null;
        }
        Map<String, VideoProductDaInfo> map17 = this.LLJL;
        if (map17 != null) {
            videoProductDaInfo = (VideoProductDaInfo) ((LinkedHashMap) map17).get(string);
        } else {
            videoProductDaInfo = null;
        }
        Map<String, EnhancedBrandLogo> map18 = this.LLJLIL;
        if (map18 != null) {
            enhancedBrandLogo = (EnhancedBrandLogo) ((LinkedHashMap) map18).get(string);
        } else {
            enhancedBrandLogo = null;
        }
        Map<String, SellerInfo> map19 = this.LLJLILLLLZIIL;
        if (map19 != null) {
            sellerInfo = (SellerInfo) ((LinkedHashMap) map19).get(string);
        } else {
            sellerInfo = null;
        }
        Map<String, List<SkuItem>> map20 = this.LLJLL;
        if (map20 != null) {
            list2 = (List) ((LinkedHashMap) map20).get(string);
        } else {
            list2 = null;
        }
        CartEntry cartEntry = this.LLJLLIL;
        Map<String, String> map21 = this.LLJLLL;
        if (map21 != null) {
            str7 = (String) ((LinkedHashMap) map21).get(string);
        } else {
            str7 = null;
        }
        long j = this.LLJZ;
        long j2 = this.LLJZIJLIL;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        int i2 = this.LLJILJIL;
        boolean[] zArr = this.LLLI;
        anchorBizUtils.getClass();
        boolean zLJJJJLL = AnchorBizUtils.LJJJJLL(i2, zArr, i);
        Map<String, Map<String, String>> map22 = this.LLLFFI;
        if (map22 != null) {
            map2 = (Map) ((LinkedHashMap) map22).get(string);
        } else {
            map2 = null;
        }
        return new C21271018Ma(i, string, str, str2, str3, str4, promotionInfo, simplePrice, list, map, addToCartButton, f, num, showTextInfo, str5, str6, videoProductDaInfo, enhancedBrandLogo, sellerInfo, list2, cartEntry, str7, j, j2, zLJJJJLL, map2);
    }

    public final List<SkuItem> LLLIILIL(AnchorProductInfoModel anchorProductInfoModel) {
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
        Map<String, List<SkuItem>> map = this.LLJLL;
        List list = null;
        String string = null;
        if (map != null) {
            Long l = anchorProductInfo.productId;
            if (l != null) {
                string = l.toString();
            }
            list = (List) ((LinkedHashMap) map).get(string);
        }
        anchorBizUtils.getClass();
        return AnchorBizUtils.LJJJJIZL(anchorProductInfo, list);
    }

    public final void LLLJ(List<C21271118Mb> list) {
        for (C21271118Mb c21271118Mb : list) {
            LLLL(c21271118Mb);
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            String str = this.LL.aid;
            c21272518Mp.getClass();
            if (str != null && str.length() != 0) {
                Map<String, C21271118Mb> map = C21272518Mp.LJI;
                if (map.size() > 3) {
                    ((LinkedHashMap) map).clear();
                }
                map.put(str, c21271118Mb);
            }
        }
    }

    public final void LLLL(C21271118Mb c21271118Mb) {
        Object obj;
        PromotionInfo promotionInfo;
        if (c21271118Mb != null) {
            Map<String, String> map = this.LLJJ;
            this.LLJJ = c21271118Mb.LIZ;
            this.LLJJIJI = c21271118Mb.LIZJ;
            this.LLJJIJIIJIL = c21271118Mb.LIZIZ;
            this.LLLFF = c21271118Mb.LJIIJJI;
            this.LLJJIII = c21271118Mb.LJII;
            this.LLJJI = c21271118Mb.LJ;
            this.LLJILLL = c21271118Mb.LIZLLL;
            this.LLJJJIL = c21271118Mb.LJIIL;
            this.LLJJIJIL = c21271118Mb.LJFF;
            this.LLJLLIL = c21271118Mb.LJIIIZ;
            this.LLJZ = c21271118Mb.LJJ;
            this.LLJZIJLIL = c21271118Mb.LJJI;
            this.LLJLL = c21271118Mb.LJIIIIZZ;
            this.LLJLLL = c21271118Mb.LJIIJ;
            this.LLJJJ = c21271118Mb.LJI;
            this.LLJJJJJIL = c21271118Mb.LJIILJJIL;
            this.LLJJJJLIIL = c21271118Mb.LJIIZILJ;
            this.LLJJJJ = c21271118Mb.LJIILIIL;
            this.LLJJL = c21271118Mb.LJIILL;
            this.LLJJLIIIJLLLLLLLZ = c21271118Mb.LJIILLIIL;
            this.LLLFFI = c21271118Mb.LJJIIJ;
            this.LLJLIL = c21271118Mb.LJIJ;
            this.LLJLILLLLZIIL = c21271118Mb.LJIJI;
            this.LLJL = c21271118Mb.LJIJJ;
            this.LLLFZ = c21271118Mb.LJIJJLI;
            int i = 0;
            for (AnchorProductInfoModel anchorProductInfoModel : this.LLJI) {
                int i2 = i + 1;
                Object obj2 = null;
                if (i >= 0) {
                    String strValueOf = String.valueOf(anchorProductInfoModel.extraData.productId);
                    Map<String, String> map2 = this.LLJJ;
                    if (map2 != null) {
                        obj = ((LinkedHashMap) map2).get(strValueOf);
                    } else {
                        obj = null;
                    }
                    AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                    int i3 = this.LLJILJIL;
                    boolean[] zArr = this.LLLI;
                    Map<String, PromotionInfo> map3 = this.LLJJI;
                    if (map3 != null) {
                        promotionInfo = (PromotionInfo) ((LinkedHashMap) map3).get(strValueOf);
                    } else {
                        promotionInfo = null;
                    }
                    anchorBizUtils.getClass();
                    AnchorBizUtils.LJLIL(i3, zArr, i, promotionInfo);
                    if (this.LLJ != null && C291260BbI.LIZ()) {
                        if (map != null) {
                            obj2 = ((LinkedHashMap) map).get(strValueOf);
                        }
                        if (!Intrinsics.LJFF(obj2, obj)) {
                            notifyItemChanged(i);
                        }
                    } else {
                        notifyItemChanged(i, obj);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LLJILJILJ && i == getItemCount() - 1) {
            return 2;
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        int i2 = this.LLJILJIL;
        anchorBizUtils.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2 && i <= 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1865670yeL
    public void onEvent(Long l) throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = LLLIIIIL();
        ProductListModel productListModel = this.LL;
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLZIJ(LLLIIIIL().LJIILIIL, this.LLJI);
        HashMap<String, String> map = this.LLILLL;
        String name = null;
        if (anchorPanelProductManagerLLLIIIIL.LJIILIIL != -1 && anchorProductInfoModel != null) {
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            String str = productListModel.eventType;
            String str2 = anchorProductInfoModel.keyword;
            c21271918Mj.getClass();
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJI(map);
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("anchor_entry", str2);
            String str3 = productListModel.authorUid;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", str3);
            String str5 = productListModel.aid;
            if (str5 != null) {
                str4 = str5;
            }
            c2344009Gk.LJIIIIZZ("group_id", str4);
            c2344009Gk.LJIIIIZZ("duration", String.valueOf(l));
            c2344009Gk.LJIIIIZZ("music_id", C586930N0h.LIZ(productListModel.aweme));
            Map<String, String> map2 = c2344009Gk.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LJFF("anchor_stay_time", map2);
            C21271918Mj.LJJ(productListModel.eventType, productListModel, l, null, null);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
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
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).unsubscribeBulletProductStayTime(anchorPanelProductManagerLLLIIIIL.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJIL(androidx.recyclerview.widget.RecyclerView.ViewHolder r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MZ.LLLJIL(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x036b A[Catch: Exception -> 0x0377, TryCatch #6 {Exception -> 0x0377, blocks: (B:114:0x034f, B:117:0x0356, B:119:0x035a, B:120:0x036b, B:113:0x034c), top: B:241:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r26, final int r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MZ.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c18mw;
        if (i != 1) {
            if (i != 2) {
                if (C291250BbH.LIZ(this.LLIZLLLIL.panelStyle)) {
                    c18mw = new C18MY(C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.cx0, viewGroup, false), this.LLILLJJLI, this.LL, this.LLILZ, this.LLILZIL, this.LLIZLLLIL, this.LLJ, this.LLILZLL, LLLIIIIL());
                } else {
                    C18MW c18mw2 = new C18MW(C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.cx1, viewGroup, false));
                    c18mw2.LL.findViewById(R.id.f3j);
                    c18mw2.LL.findViewById(R.id.ibo);
                    c18mw = c18mw2;
                }
            } else {
                c18mw = new C18MW(C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.anl, viewGroup, false));
            }
        } else {
            C18MW c18mw3 = new C18MW(C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.cx2, viewGroup, false));
            c18mw3.LL.findViewById(R.id.f3j);
            c18mw3.LL.findViewById(R.id.ibo);
            c18mw = c18mw3;
        }
        try {
            View view = c18mw.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c18mw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c18mw.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c18mw.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c18mw.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c18mw.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c18mw.getClass().getName();
        return c18mw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0796 A[PHI: r5
      0x0796: PHI (r5v40 java.lang.String) = (r5v39 java.lang.String), (r5v50 java.lang.String), (r5v50 java.lang.String) binds: [B:325:0x0792, B:215:0x049f, B:217:0x04a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024e  */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [X.0Gud] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.ss.android.ugc.aweme.ecommerce.model.ShowTextInfo] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJL(int r39, android.view.View r40, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r41) {
        /*
            Method dump skipped, instruction units count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MZ.LLLJL(int, android.view.View, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        boolean zLJI = MethodIDManager.LJI(202333);
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (this.LLJ == null || !C291260BbI.LIZ()) {
            LLLJIL(viewHolder, i);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r2.intValue() == X.EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLII(final android.view.View r14, final com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r15, final int r16, boolean r17) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r7 = r13
            int r0 = r7.LLJILJIL
            r1.getClass()
            r6 = r16
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJLIIIJJIZ(r0, r6)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L22
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "ec_anchor_panel_bottom_button_style"
            int r1 = r2.LJIJ(r1, r3, r0, r4)
            r0 = 2
            if (r1 != r0) goto L22
            return
        L22:
            r0 = 2131366373(0x7f0a11e5, float:1.8352638E38)
            r12 = r14
            android.view.View r5 = r12.findViewById(r0)
            X.127h r5 = (X.C197039127h) r5
            r8 = r15
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r8.extraData
            java.lang.Long r0 = r0.productId
            if (r0 == 0) goto L39
            java.lang.String r9 = r0.toString()
            if (r9 != 0) goto L3b
        L39:
            java.lang.String r9 = ""
        L3b:
            java.lang.String r1 = "c0417.d4352_iplaceholder_w1351"
            int r0 = r7.LLJILJIL
            java.lang.String r11 = X.C18LA.LIZIZ(r0, r6, r1)
            java.util.Map r10 = X.C18LA.LIZJ(r12, r11)
            if (r17 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r8.extraData
            java.lang.Integer r2 = r0.productStatus
            if (r2 == 0) goto L73
            X.10pe r0 = X.EnumC19366010pe.PRODUCT_STATUS_DOWN
            int r1 = r0.getValue()
            int r0 = r2.intValue()
            if (r0 != r1) goto L73
        L5b:
            if (r5 == 0) goto L72
            r5.setEnabled(r3)
            r5.setSupportClickWhenDisable(r4)
            X.18MC r0 = new X.18MC
            r1 = r5
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r5
            r6 = r9
            r7 = r10
            r0.<init>()
            X.C786410Ut5.I7(r0, r5)
        L72:
            return
        L73:
            if (r5 == 0) goto L72
            X.18MA r4 = new X.18MA
            r4.<init>()
            X.C786410Ut5.I7(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MZ.LLLII(android.view.View, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, int, boolean):void");
    }

    public static final void LLLIL(final int i, final C424610Gkt c424610Gkt, final C18MZ c18mz, final AnchorProductInfoModel anchorProductInfoModel, final String str, final boolean z) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(str));
        C1324840ka2.LJIIIIZZ(c424610Gkt, urlModel, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.18Mg
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str2, Throwable th) {
                C18MZ.LLLILZ(c18mz, anchorProductInfoModel, i, str, c424610Gkt, false, Boolean.valueOf(z));
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str2, Object obj, Animatable animatable) {
                C18MZ.LLLILZ(c18mz, anchorProductInfoModel, i, str, c424610Gkt, true, Boolean.valueOf(z));
            }
        });
    }

    public static final void LLLILZ(C18MZ c18mz, AnchorProductInfoModel anchorProductInfoModel, int i, String str, C424610Gkt c424610Gkt, boolean z, Boolean bool) {
        boolean zBooleanValue;
        String str2 = str;
        c18mz.LLLIIIIL().LJII(String.valueOf(anchorProductInfoModel.extraData.productId), Long.valueOf(System.currentTimeMillis() - c18mz.LLLIIIIL().LJIJ.getAnchorClickTime()), Boolean.valueOf(z), i, bool, str2);
        if (i == 0 && z) {
            c18mz.LLLIIIIL().LJIILL = true;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c18mz.LLLIIIIL().LJIILLIIL = zBooleanValue;
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        int i2 = c18mz.LLJILJIL;
        anchorBizUtils.getClass();
        AnchorBizUtils.LJIJ(c424610Gkt, anchorProductInfoModel, str2, AnchorBizUtils.LJJLIIIJJIZ(i2, i));
    }

    public /* synthetic */ C18MZ(ProductListModel productListModel, Context context, HashMap map, boolean z, int i, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, AnchorPanelConfig anchorPanelConfig) {
        this(productListModel, context, map, z, i, iECommerceVideoService, iECommerceAnchorService, anchorPanelConfig, null);
    }

    public C18MZ(ProductListModel productListModel, Context context, HashMap<String, String> map, boolean z, int i, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, AnchorPanelConfig anchorPanelConfig, C0HBC c0hbc) {
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        this.LL = productListModel;
        this.LLILLJJLI = context;
        this.LLILLL = map;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = iECommerceVideoService;
        this.LLIZ = iECommerceAnchorService;
        this.LLIZLLLIL = anchorPanelConfig;
        this.LLJ = c0hbc;
        List<AnchorProductInfoModel> listLJJZZIII = productListModel.products;
        if (listLJJZZIII == null) {
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            List<AnchorCommonStruct> list = productListModel.anchors;
            anchorBizUtils.getClass();
            listLJJZZIII = AnchorBizUtils.LJJZZIII(AnchorBizUtils.LJJIIZ(list), true);
        }
        this.LLJI = listLJJZZIII;
        String strLJIIJJI = C21272218Mm.LJIIJJI(productListModel, z);
        if (strLJIIJJI == null && (strLJIIJJI = productListModel.entranceForm) == null) {
            List<AnchorProductInfoModel> list2 = productListModel.products;
            if (list2 != null && list2.size() > 1) {
                strLJIIJJI = "video_multi_anchor";
            } else {
                strLJIIJJI = "video_single_anchor";
            }
        }
        this.LLJIJIL = strLJIIJJI;
        int i2 = anchorPanelConfig.panelStyle;
        this.LLJILJIL = i2;
        this.LLJILJILJ = anchorPanelConfig.enableMaybeYouLike;
        this.LLL = new LinkedHashMap();
        this.LLLF = new LinkedHashMap();
        AnchorBizUtils.LIZ.getClass();
        int size = listLJJZZIII.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int i5 = 2;
            if (i2 != 0 && (i2 == 1 || (i2 == 2 && i4 == 0))) {
                i5 = 1;
            }
            i3 += i5;
            i4++;
        }
        this.LLLI = new boolean[i4];
        this.LLLII = new LinkedHashMap();
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
        this.LLLIIII = ((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).getLogParamsFromSearch(productListModel.eventType, "", "search_id", "search_result_id", "search_entrance", "click_recom_search_entrance", "list_item_id", "last_from_group_id", "origin_is_mall_tab");
        this.LLLIIIIL = new LinkedHashMap();
        this.LLLIIIL = new ArrayList();
        this.LLLIIL = new ArrayList();
        this.LLLIILIL = new HashSet<>();
        this.LLLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 506));
    }
}
