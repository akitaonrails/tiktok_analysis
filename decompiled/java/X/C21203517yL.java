package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.cache.LiveExposedProductsCache;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagAfterPinCardGuide;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.text.u;
import org.json.JSONObject;
import webcast.data.oec_msg.AuctionInfo;
import webcast.data.oec_msg.LiveFlashSaleInfo;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17yL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203517yL extends AbstractC21197217xK implements InterfaceC21204817yY {
    public final InterfaceC756790TmP LLJJJ;
    public String LLJJJIL;

    @Override // X.AbstractC21197217xK
    public final boolean LJJJ() {
        return false;
    }

    @Override // X.InterfaceC212166181c
    public final void LJ() {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLIZJ5;
        C1743900vTw c1743900vTw;
        C1743900vTw c1743900vTw2;
        UsPopupCardVO usPopupCardVO = this.LL;
        String string = usPopupCardVO != null ? Long.valueOf(usPopupCardVO.productId).toString() : null;
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        String strLIZJ6 = c1743900vTw3 != null ? c1743900vTw3.LIZJ("room_id") : null;
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        String strLIZJ7 = c1743900vTw4 != null ? c1743900vTw4.LIZJ("live_role") : null;
        UsPopupCardVO usPopupCardVO2 = this.LL;
        boolean zIsFromMessage = usPopupCardVO2 != null ? usPopupCardVO2.isFromMessage() : false;
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        boolean zLIZLLL = c1743900vTw5 != null ? c1743900vTw5.LIZLLL("is_page_visible") : false;
        C1743900vTw c1743900vTw6 = this.LLIZLLLIL;
        boolean zLIZLLL2 = c1743900vTw6 != null ? c1743900vTw6.LIZLLL("has_permission") : false;
        C1743900vTw c1743900vTw7 = this.LLIZLLLIL;
        boolean zLIZLLL3 = c1743900vTw7 != null ? c1743900vTw7.LIZLLL("is_keyboard_showing") : false;
        C1743900vTw c1743900vTw8 = this.LLIZLLLIL;
        String strLIZJ8 = c1743900vTw8 != null ? c1743900vTw8.LIZJ("author_id") : null;
        Map<String, String> mapLJJJJI = LJJJJI();
        UsPopupCardVO usPopupCardVO3 = this.LL;
        Integer numValueOf = usPopupCardVO3 != null ? Integer.valueOf(usPopupCardVO3.cardType) : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJJJJI;
        String str = (String) linkedHashMap.get("rights_content");
        if (str != null && (c1743900vTw2 = this.LLIZLLLIL) != null) {
            c1743900vTw2.LJIIIIZZ("rights_content", str, false);
        }
        String str2 = (String) linkedHashMap.get("rights_cnt");
        if (str2 != null && (c1743900vTw = this.LLIZLLLIL) != null) {
            c1743900vTw.LJIIIIZZ("rights_cnt", str2, false);
        }
        C21205617yg.LIZ(this.LLJJI, this.LLIZLLLIL);
        C1743900vTw c1743900vTw9 = this.LLIZLLLIL;
        if (c1743900vTw9 != null && (strLIZJ5 = c1743900vTw9.LIZJ("param_search_is_inner")) != null) {
            this.LLJJI.put("is_inner", strLIZJ5);
        }
        C1743900vTw c1743900vTw10 = this.LLIZLLLIL;
        if (c1743900vTw10 != null && (strLIZJ4 = c1743900vTw10.LIZJ("param_inner_search_id")) != null) {
            this.LLJJI.put("inner_search_id", strLIZJ4);
        }
        C1743900vTw c1743900vTw11 = this.LLIZLLLIL;
        if (c1743900vTw11 != null && (strLIZJ3 = c1743900vTw11.LIZJ("param_rank_inner")) != null) {
            this.LLJJI.put("rank_inner", strLIZJ3);
        }
        C1743900vTw c1743900vTw12 = this.LLIZLLLIL;
        if (c1743900vTw12 != null && (strLIZJ2 = c1743900vTw12.LIZJ("param_is_slide")) != null) {
            this.LLJJI.put("is_slide", strLIZJ2);
        }
        C1743900vTw c1743900vTw13 = this.LLIZLLLIL;
        if (c1743900vTw13 != null && (strLIZJ = c1743900vTw13.LIZJ("param_slide_rank")) != null) {
            this.LLJJI.put("slide_rank", strLIZJ);
        }
        if (!C21194017wo.LIZIZ(this.LL)) {
            Map mapLIZ = C7936038c.LIZ("c7068.d5479", PageFinder.via((View) this.LLILZIL));
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIL(this.LLJJI, mapLJJJJI), mapLIZ);
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_show", mapLJIIL);
        }
        EnumC21192917wd enumC21192917wd = EnumC21192917wd.SHOW_TO_USER;
        String str3 = strLIZJ7 == null ? "" : strLIZJ7;
        UsPopupCardVO usPopupCardVO4 = this.LL;
        C21192417wY.LJI(enumC21192917wd, str3, strLIZJ6, string, zLIZLLL, zLIZLLL3, zLIZLLL2, zIsFromMessage, numValueOf, usPopupCardVO4 != null ? usPopupCardVO4.chainInfo : null);
        EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.CHAIN_NATIVE_SUCCEED;
        UsPopupCardVO usPopupCardVO5 = this.LL;
        C21192417wY.LIZIZ(enumC21192517wZ, usPopupCardVO5 != null ? usPopupCardVO5.chainInfo : null, C2097608Jq.LJ());
        UsPopupCardVO usPopupCardVO6 = this.LL;
        C21198317xV.LJIIJ(string, strLIZJ6, usPopupCardVO6 != null ? usPopupCardVO6.fromMessageId : null, strLIZJ8, strLIZJ7);
        UsPopupCardVO usPopupCardVO7 = this.LL;
        if (usPopupCardVO7 != null) {
            Long lValueOf = Long.valueOf(usPopupCardVO7.productId);
            if (lValueOf.longValue() > 0) {
                long jLongValue = lValueOf.longValue();
                LiveExposedProductsCache liveExposedProductsCache = LiveExposedProductsCache.LIZ;
                Long lValueOf2 = Long.valueOf(jLongValue);
                liveExposedProductsCache.getClass();
                if (strLIZJ6 == null || lValueOf2 == null) {
                    return;
                }
                LiveExposedProductsCache.LIZ(strLIZJ6, strLIZJ8, new AwS611S0100000_32(lValueOf2, 69));
            }
        }
    }

    @Override // X.InterfaceC21181817uq, X.InterfaceC21204817yY
    public final void LJI() {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if (!(t instanceof InterfaceC21204817yY) || (interfaceC21204817yY = (InterfaceC21204817yY) t) == null) {
            return;
        }
        interfaceC21204817yY.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    @Override // X.AbstractC21198517xX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation LJIL() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21203517yL.LJIL():android.view.animation.Animation");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    @Override // X.AbstractC21198517xX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation LJJ() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21203517yL.LJJ():android.view.animation.Animation");
    }

    @Override // X.AbstractC21198517xX
    public final Animation LJJIFFI() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setAnimationListener(new C19LR(this, 6));
        return animationSet;
    }

    public final boolean LJJJJ() {
        ILiveOuterService iLiveOuterService;
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC20318714ev interfaceC20318714evB4;
        T t = this.LLILZIL;
        if (!C444960Hcc.LIZJ(t != 0 ? t.getContext() : null) || (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) == null || (iLiveOuterServiceQ4 = iLiveOuterService.q4()) == null || (interfaceC20318714evB4 = iLiveOuterServiceQ4.B4()) == null) {
            return false;
        }
        interfaceC20318714evB4.LJIIL();
        return false;
    }

    public final Map<String, String> LJJJJI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLJLLL = LJLLL("atmosphere_layout");
        if (mapLJLLL != null) {
            linkedHashMap.putAll(mapLJLLL);
        }
        Map<String, String> mapLJLLL2 = LJLLL("promotion_items");
        if (mapLJLLL2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C125400do.LIZ(mapLJLLL2, LJLLL("second_promotion_items")));
            linkedHashMap2.remove("label_type");
            linkedHashMap.putAll(linkedHashMap2);
        }
        Map<String, String> mapLJLLL3 = LJLLL("selling_point_items");
        if (mapLJLLL3 != null) {
            linkedHashMap.putAll(mapLJLLL3);
        }
        C19676111yZ.LIZLLL(linkedHashMap, LJJIZ());
        return linkedHashMap;
    }

    @Override // X.InterfaceC21184217vE
    public final boolean LLLLLZ() {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            return abstractC21202917yF.LLLLLZ();
        }
        return false;
    }

    @Override // X.InterfaceC21184217vE
    public final List<String> getProductShowIds() {
        List<String> productShowIds;
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        return (abstractC21202917yF == null || (productShowIds = abstractC21202917yF.getProductShowIds()) == null) ? C13BV.INSTANCE : productShowIds;
    }

    @Override // X.AbstractC21198517xX, com.bytedance.android.live.slot.IFrameSlot
    public final void onHide() {
        String strLIZJ;
        String strLIZJ2;
        HashMap map;
        String str;
        C1120500fGS.LIZ(EnumC1120490fGR.START_UNPIN);
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        String str2 = "";
        if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
            strLIZJ = "";
        }
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        if (c1743900vTw2 == null || (strLIZJ2 = c1743900vTw2.LIZJ("author_id")) == null) {
            strLIZJ2 = "";
        }
        int i = C1742080vR0.LIZ;
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        if (c1743900vTw3 != null && (map = (HashMap) c1743900vTw3.LIZIZ()) != null && (str = (String) map.get("traffic_source_list")) != null) {
            str2 = str;
        }
        String strLJII = C1742080vR0.LJII(str2);
        UsPopupCardVO usPopupCardVO = this.LL;
        C20340514iR.LJII(strLIZJ, strLIZJ2, strLJII, String.valueOf(usPopupCardVO != null ? Long.valueOf(usPopupCardVO.productId) : null), false);
    }

    @Override // X.InterfaceC21181817uq, X.InterfaceC21204817yY
    public final void LIZIZ(int i) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LIZIZ(i);
        }
    }

    @Override // X.InterfaceC212166181c
    public final void LIZLLL(Map<String, String> map) {
        String strLIZJ;
        String string;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLIZJ5;
        String strLIZJ6;
        String strLIZJ7;
        String strLIZJ8;
        String strLIZJ9;
        String strLIZJ10;
        String strLIZJ11;
        String strLIZJ12;
        String strLIZJ13;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw != null) {
            strLIZJ = c1743900vTw.LIZJ("author_id");
        } else {
            strLIZJ = null;
        }
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null) {
            string = Long.valueOf(usPopupCardVO.productId).toString();
        } else {
            string = null;
        }
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        if (c1743900vTw2 != null) {
            strLIZJ2 = c1743900vTw2.LIZJ("room_id");
        } else {
            strLIZJ2 = null;
        }
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        if (c1743900vTw3 != null) {
            strLIZJ3 = c1743900vTw3.LIZJ("enter_from_merge");
        } else {
            strLIZJ3 = null;
        }
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        if (c1743900vTw4 != null) {
            strLIZJ4 = c1743900vTw4.LIZJ("enter_method");
        } else {
            strLIZJ4 = null;
        }
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        if (c1743900vTw5 != null) {
            strLIZJ5 = c1743900vTw5.LIZJ("action_type");
        } else {
            strLIZJ5 = null;
        }
        C1743900vTw c1743900vTw6 = this.LLIZLLLIL;
        if (c1743900vTw6 != null) {
            strLIZJ6 = c1743900vTw6.LIZJ("product_source");
        } else {
            strLIZJ6 = null;
        }
        C1743900vTw c1743900vTw7 = this.LLIZLLLIL;
        if (c1743900vTw7 != null) {
            strLIZJ7 = c1743900vTw7.LIZJ("track_id");
        } else {
            strLIZJ7 = null;
        }
        C1743900vTw c1743900vTw8 = this.LLIZLLLIL;
        if (c1743900vTw8 != null) {
            strLIZJ8 = c1743900vTw8.LIZJ("item_order");
        } else {
            strLIZJ8 = null;
        }
        C1743900vTw c1743900vTw9 = this.LLIZLLLIL;
        if (c1743900vTw9 != null) {
            strLIZJ9 = c1743900vTw9.LIZJ("follow_status");
        } else {
            strLIZJ9 = null;
        }
        C1743900vTw c1743900vTw10 = this.LLIZLLLIL;
        if (c1743900vTw10 != null) {
            strLIZJ10 = c1743900vTw10.LIZJ("is_ad");
        } else {
            strLIZJ10 = null;
        }
        C1743900vTw c1743900vTw11 = this.LLIZLLLIL;
        if (c1743900vTw11 != null) {
            strLIZJ11 = c1743900vTw11.LIZJ("request_id");
        } else {
            strLIZJ11 = null;
        }
        C1743900vTw c1743900vTw12 = this.LLIZLLLIL;
        if (c1743900vTw12 != null) {
            strLIZJ12 = c1743900vTw12.LIZJ("page_name");
        } else {
            strLIZJ12 = null;
        }
        C1743900vTw c1743900vTw13 = this.LLIZLLLIL;
        if (c1743900vTw13 != null) {
            strLIZJ13 = c1743900vTw13.LIZJ("live_role");
        } else {
            strLIZJ13 = null;
        }
        C21198317xV.LJIIIZ("livesdk_tiktokec_product_discount_tag_show", strLIZJ, string, strLIZJ2, strLIZJ3, strLIZJ4, strLIZJ5, strLIZJ6, strLIZJ7, strLIZJ8, strLIZJ9, strLIZJ10, strLIZJ11, strLIZJ12, map, strLIZJ13);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        T t = this.LLILZIL;
        if (t != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            UsPopupCardVO usPopupCardVO = this.LL;
            if (usPopupCardVO != null && C21194017wo.LIZIZ(usPopupCardVO)) {
                return;
            }
            this.LLJJIJIL.LJFF(z);
        }
    }

    @Override // X.InterfaceC212166181c
    public final void LJII(int i) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = this.LLJJI;
        map.put("label_type", "live_flash_sale_only_left");
        map.put("label_number", "-1");
        map.put("label_order", String.valueOf(i));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", map);
    }

    @Override // X.InterfaceC212166181c
    public final void LJIIIIZZ(Map<String, String> map) {
        String strLIZJ;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw != null && (strLIZJ = c1743900vTw.LIZJ("live_role")) != null) {
            map = C2097608Jq.LJIILIIL(map, new Pair("live_role", strLIZJ));
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIL = C2097608Jq.LJIIL(this.LLJJI, map);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", mapLJIIL);
    }

    @Override // X.InterfaceC212166181c
    public final void LJIIIZ(int i) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = this.LLJJI;
        map.put("label_type", "live_flash_sale_preheat");
        map.put("label_number", "-1");
        map.put("label_order", String.valueOf(i));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", map);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null && C21194017wo.LIZIZ(usPopupCardVO)) {
            return;
        }
        this.LLJJIJIL.LJIIL(flashSaleAtmosphereStock);
    }

    @Override // X.InterfaceC212166181c
    public final void LJIILIIL(Map<String, String> map) {
        HashMap map2;
        String strLIZJ;
        String string;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLIZJ5;
        String strLIZJ6;
        String strLIZJ7;
        String strLIZJ8;
        String strLIZJ9;
        String strLIZJ10;
        String strLIZJ11;
        String strLIZJ12;
        Map<String, String> promotionLogoDaInfo;
        String strLIZJ13;
        String str;
        String str2 = map.get("pos_selling_point");
        boolean zLIZ = C703302op.LIZ(str2);
        try {
            map2 = (HashMap) C08JS.LIZIZ().LJIIIIZZ(map.get("selling_point_da_info"), new TypeToken<HashMap<String, String>>() { // from class: X.17ya
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            map2 = null;
        }
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw != null) {
            strLIZJ = c1743900vTw.LIZJ("author_id");
        } else {
            strLIZJ = null;
        }
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null) {
            string = Long.valueOf(usPopupCardVO.productId).toString();
        } else {
            string = null;
        }
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        if (c1743900vTw2 != null) {
            strLIZJ2 = c1743900vTw2.LIZJ("room_id");
        } else {
            strLIZJ2 = null;
        }
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        if (c1743900vTw3 != null) {
            strLIZJ3 = c1743900vTw3.LIZJ("enter_from_merge");
        } else {
            strLIZJ3 = null;
        }
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        if (c1743900vTw4 != null) {
            strLIZJ4 = c1743900vTw4.LIZJ("enter_method");
        } else {
            strLIZJ4 = null;
        }
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        if (c1743900vTw5 != null) {
            strLIZJ5 = c1743900vTw5.LIZJ("action_type");
        } else {
            strLIZJ5 = null;
        }
        C1743900vTw c1743900vTw6 = this.LLIZLLLIL;
        if (c1743900vTw6 != null) {
            strLIZJ6 = c1743900vTw6.LIZJ("product_source");
        } else {
            strLIZJ6 = null;
        }
        C1743900vTw c1743900vTw7 = this.LLIZLLLIL;
        if (c1743900vTw7 != null) {
            strLIZJ7 = c1743900vTw7.LIZJ("track_id");
        } else {
            strLIZJ7 = null;
        }
        C1743900vTw c1743900vTw8 = this.LLIZLLLIL;
        if (c1743900vTw8 != null) {
            strLIZJ8 = c1743900vTw8.LIZJ("item_order");
        } else {
            strLIZJ8 = null;
        }
        C1743900vTw c1743900vTw9 = this.LLIZLLLIL;
        if (c1743900vTw9 != null) {
            strLIZJ9 = c1743900vTw9.LIZJ("follow_status");
        } else {
            strLIZJ9 = null;
        }
        C1743900vTw c1743900vTw10 = this.LLIZLLLIL;
        if (c1743900vTw10 != null) {
            strLIZJ10 = c1743900vTw10.LIZJ("is_ad");
        } else {
            strLIZJ10 = null;
        }
        C1743900vTw c1743900vTw11 = this.LLIZLLLIL;
        if (c1743900vTw11 != null) {
            strLIZJ11 = c1743900vTw11.LIZJ("request_id");
        } else {
            strLIZJ11 = null;
        }
        C1743900vTw c1743900vTw12 = this.LLIZLLLIL;
        if (c1743900vTw12 != null) {
            strLIZJ12 = c1743900vTw12.LIZJ("page_name");
        } else {
            strLIZJ12 = null;
        }
        String str3 = map.get("sellingpoint_cnt");
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            promotionLogoDaInfo = abstractC21202917yF.getPromotionLogoDaInfo();
        } else {
            promotionLogoDaInfo = null;
        }
        C1743900vTw c1743900vTw13 = this.LLIZLLLIL;
        if (c1743900vTw13 != null) {
            strLIZJ13 = c1743900vTw13.LIZJ("live_role");
        } else {
            strLIZJ13 = null;
        }
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", strLIZJ);
            jSONObject.put("product_id", string);
            jSONObject.put("room_id", strLIZJ2);
            String str4 = "";
            if (strLIZJ3 == null) {
                strLIZJ3 = "";
            }
            jSONObject.put("enter_from_merge", strLIZJ3);
            if (strLIZJ4 == null) {
                strLIZJ4 = "";
            }
            jSONObject.put("enter_method", strLIZJ4);
            if (strLIZJ5 == null) {
                strLIZJ5 = "";
            }
            jSONObject.put("action_type", strLIZJ5);
            if (strLIZJ6 == null) {
                strLIZJ6 = "";
            }
            jSONObject.put("product_source", strLIZJ6);
            if (strLIZJ7 == null) {
                strLIZJ7 = "";
            }
            jSONObject.put("track_id", strLIZJ7);
            jSONObject.put("source_page_type", "live");
            if (strLIZJ8 == null) {
                strLIZJ8 = "";
            }
            jSONObject.put("item_order", strLIZJ8);
            jSONObject.put("entrance_form", "live_popup_card");
            if (strLIZJ9 == null) {
                strLIZJ9 = "";
            }
            jSONObject.put("follow_status", strLIZJ9);
            if (strLIZJ10 != null) {
                str4 = strLIZJ10;
            }
            jSONObject.put("is_ad", str4);
            C21198317xV.LIZ.getClass();
            C21198317xV.LIZ(jSONObject, "request_id", strLIZJ11);
            jSONObject.put("page_name", strLIZJ12);
            if (zLIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("has_sellingpoint", str);
            C21198317xV.LIZ(jSONObject, "pos_selling_point", str2);
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            C21198317xV.LIZ.getClass();
            C21198317xV.LIZ(jSONObject, "sellingpoint_cnt", str3);
            C21198317xV.LIZ(jSONObject, "live_role", strLIZJ13);
            if (promotionLogoDaInfo != null) {
                for (Map.Entry<String, String> entry2 : promotionLogoDaInfo.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_product_sellingpoint_show", jSONObject);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // X.InterfaceC212166181c
    public final void LJIILJJIL(Product product) {
        AwS646S0100000_32 awS646S0100000_32;
        if (product != null && (awS646S0100000_32 = this.LLJIJIL) != null) {
            awS646S0100000_32.invoke(0, product);
        }
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null && C21194017wo.LIZIZ(usPopupCardVO)) {
            return;
        }
        this.LLJJIJIL.LJIILL(flashSaleAtmosphere);
    }

    @Override // X.AbstractC21197217xK, X.AbstractC21198517xX
    public final void LJIJJLI(String str) {
        super.LJIJJLI(str);
        this.LLJJIJIL.LIZJ();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [DATA, X.17yf] */
    @Override // X.AbstractC21197217xK, X.AbstractC21198517xX
    public final void LJJIJ(boolean z) {
        T t;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        this.LLJJIJIL.LIZJ();
        UsPopupCardVO usPopupCardVO = this.LL;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = null;
        if (usPopupCardVO != null && (!C21194017wo.LIZIZ(usPopupCardVO))) {
            C21203917yP c21203917yP = this.LLJJIJIL;
            ?? c21205517yf = new C21205517yf();
            c21205517yf.LIZJ = usPopupCardVO.createTime;
            c21205517yf.LIZLLL = usPopupCardVO.serverTime;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere;
            } else {
                flashSaleAtmosphere2 = null;
            }
            c21205517yf.LIZ = flashSaleAtmosphere2;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
            }
            c21205517yf.LIZIZ = flashSaleAtmosphereStock;
            if (!c21203917yP.LLILZ) {
                c21203917yP.LLILZ = true;
                c21203917yP.LLILLL = c21205517yf;
            }
        }
        super.LJJIJ(z);
        if (z && (t = this.LLILZIL) != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onProductChanged refresh status");
            UsPopupCardVO usPopupCardVO2 = this.LL;
            if (usPopupCardVO2 != null && (!C21194017wo.LIZIZ(usPopupCardVO2))) {
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = usPopupCardVO2.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo2 != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo2.flashSaleAtmosphere) != null && (numValueOf = Integer.valueOf(flashSaleAtmosphere.status)) != null) {
                    if (numValueOf.intValue() == 2) {
                        this.LLJJIJIL.LIZ(1);
                        return;
                    } else if (numValueOf.intValue() == 3) {
                        this.LLJJIJIL.LIZ(2);
                        return;
                    }
                }
                this.LLJJIJIL.LIZ(-1);
            }
        }
    }

    @Override // X.AbstractC21198517xX
    public final void LJJIJIIJIL(UsPopupCardVO usPopupCardVO) {
        String str;
        this.LL = usPopupCardVO;
        C19516311Xd c19516311Xd = C19516311Xd.LIZ;
        if (usPopupCardVO != null) {
            str = usPopupCardVO.imageUrl;
        } else {
            str = null;
        }
        c19516311Xd.getClass();
        C19516311Xd.LIZJ = str;
    }

    @Override // X.AbstractC21198517xX
    public final void LJJIJL(String str) {
        this.LLJJJIL = str;
    }

    public C21203517yL(Map<String, String> map, C21194917wx c21194917wx) {
        Integer numValueOf;
        super(map, c21194917wx);
        this.LLJJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6();
        this.LLJJIJIL.LIZLLL(new C21204717yX(this));
        this.LLJJIJIL.LIZLLL(new C21204517yV(this));
        this.LLJJIJIL.LIZLLL(new C21206317yn(this));
        this.LLJJIJIL.LIZLLL(new C21206117yl(this));
        C21181317ul c21181317ul = (C21181317ul) this.LLJJIJIIJIL.getValue();
        c21181317ul.LIZLLL(1, new C21212217zk(this) { // from class: X.17zf
            /* JADX WARN: Type inference failed for: r1v2, types: [X.09AY, X.0sYq] */
            public final void LJI(String str) {
                String strLIZJ;
                UsPopupCardVO usPopupCardVO = this.LIZ.LL;
                if (usPopupCardVO != null) {
                    IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class);
                    C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
                    if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
                        strLIZJ = CardStruct.IStatusCode.DEFAULT;
                    }
                    iEcommerceInfluencerService.LJ(strLIZJ, String.valueOf(usPopupCardVO.productId));
                    LIZLLL(str, usPopupCardVO, this.LIZ.LLIZLLLIL);
                    ?? r1 = this.LIZ.LLJ;
                    if (r1 != 0) {
                        r1.invoke(str, null, null);
                    }
                }
            }

            public final void LJIIIIZZ(Context context, String str) {
                Long lValueOf;
                String strLIZJ;
                long jLongValue;
                String strLIZJ2;
                int iHashCode = str.hashCode();
                if (iHashCode != -1867169789) {
                    if (iHashCode != -379701762) {
                        if (iHashCode == 1274762662 && str.equals("noncl_product")) {
                            Activity activityLIZ = C1388190mED.LIZ(context);
                            if (activityLIZ != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                c1389890mGx.LJIIJ(C20642515q3.LJI(2131857711));
                                c1389890mGx.LIZLLL(3000L);
                                c1389890mGx.LJIIJJI();
                            }
                            C21198317xV.LIZIZ(this.LIZ.LLIZLLLIL, "noncl_product", "assistant modules less than two");
                            return;
                        }
                        return;
                    }
                    if (!str.equals("no_sellingpoint")) {
                        return;
                    }
                    Activity activityLIZ2 = C1388190mED.LIZ(context);
                    if (activityLIZ2 != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                        c1389890mGx2.LJIIJ(C20642515q3.LJI(2131836383));
                        c1389890mGx2.LIZLLL(3000L);
                        c1389890mGx2.LJIIJJI();
                    }
                    C21198317xV.LIZIZ(this.LIZ.LLIZLLLIL, "no_sellingpoint", "assistant modules less than two");
                    return;
                }
                if (!str.equals("success")) {
                    return;
                }
                UsPopupCardVO usPopupCardVO = this.LIZ.LL;
                if (usPopupCardVO != null) {
                    lValueOf = Long.valueOf(usPopupCardVO.productId);
                } else {
                    lValueOf = null;
                }
                StringBuilder sb = new StringBuilder();
                String strLIZ = CreatorProductListLynxConfigSettings.LIZ();
                C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
                String str2 = CardStruct.IStatusCode.DEFAULT;
                if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
                    strLIZJ = CardStruct.IStatusCode.DEFAULT;
                }
                String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(strLIZ, "_roomId_", strLIZJ, false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJIFFI);
                sbLIZ.append("&explain_product_id=");
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
                sbLIZ.append(jLongValue);
                C2188811AlT.LIZIZ(sbLIZ);
                sb.append(strLJJIFFI);
                sb.append("&moderate_author_id=");
                C1743900vTw c1743900vTw2 = this.LIZ.LLIZLLLIL;
                if (c1743900vTw2 != null && (strLIZJ2 = c1743900vTw2.LIZJ("author_id")) != null) {
                    str2 = strLIZJ2;
                }
                sb.append(str2);
                sb.append("&user_type=moderato");
                SmartRouter.buildRoute(context, sb.toString()).open();
                C21198317xV.LIZIZ(this.LIZ.LLIZLLLIL, "success", null);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Type inference failed for: r0v10, types: [X.09AY, X.0sYq] */
            /* JADX WARN: Type inference failed for: r0v27, types: [X.09AY, X.0sYq] */
            @Override // X.InterfaceC21181417um
            public final void LIZ(String str, Product product, Integer num) {
                AbstractC21198517xX<AbstractC21202917yF> abstractC21198517xX;
                UsPopupCardVO usPopupCardVO;
                Context context;
                List<Object> list;
                switch (str.hashCode()) {
                    case -1377687758:
                        if (!str.equals("button") || (usPopupCardVO = (abstractC21198517xX = this.LIZ).LL) == null) {
                            return;
                        }
                        LIZLLL(str, usPopupCardVO, abstractC21198517xX.LLIZLLLIL);
                        ?? r0 = this.LIZ.LLJ;
                        if (r0 != 0) {
                            r0.invoke(str, null, null);
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), C0PEM.LIZJ, null, new C21178117uF(this, usPopupCardVO, null), 2);
                        return;
                    case -1002552376:
                        if (!str.equals("flip_card_lower_area")) {
                            return;
                        }
                        LJII(product, num, C19395610uQ.LJIJ);
                        return;
                    case 110986:
                        if (!str.equals("pic")) {
                            return;
                        }
                        break;
                    case 106069776:
                        if (!str.equals("other")) {
                            return;
                        }
                        break;
                    case 110371416:
                        if (!str.equals("title")) {
                            return;
                        }
                        break;
                    case 401568455:
                        if (!str.equals("flip_card_upper_area")) {
                            return;
                        }
                        int i = C19395610uQ.LJIIZILJ;
                        if (i == 1) {
                            LJII(product, num, C19395610uQ.LJIJ);
                            return;
                        } else {
                            if (i != 2) {
                                return;
                            }
                            LJI("title");
                            return;
                        }
                    case 1040297837:
                        if (!str.equals("flip_card_pic")) {
                            return;
                        }
                        int i2 = C19395610uQ.LJIIZILJ;
                        if (i2 == 1) {
                            LJII(product, num, C19395610uQ.LJIJ);
                            return;
                        } else {
                            if (i2 != 2) {
                                return;
                            }
                            LJI("pic");
                            return;
                        }
                    case 1429828318:
                        if (!str.equals("assistant")) {
                            return;
                        }
                        ?? r02 = this.LIZ.LLJ;
                        if (r02 != 0) {
                            r02.invoke(str, null, null);
                        }
                        T t = this.LIZ.LLILZIL;
                        if (t == 0 || (context = t.getContext()) == null) {
                            return;
                        }
                        UsPopupCardVO usPopupCardVO2 = this.LIZ.LL;
                        if (usPopupCardVO2 != null && (list = usPopupCardVO2.assistantModules) != null && (!list.isEmpty())) {
                            LJIIIIZZ(context, "success");
                            return;
                        }
                        UsPopupCardVO usPopupCardVO3 = this.LIZ.LL;
                        if (usPopupCardVO3 != null && usPopupCardVO3.platform == 5) {
                            LJIIIIZZ(context, "no_sellingpoint");
                            return;
                        } else {
                            LJIIIIZZ(context, "noncl_product");
                            return;
                        }
                    default:
                        return;
                }
                LJI(str);
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [X.09AY, X.0sYq] */
            public final void LJII(Product product, Integer num, String str) {
                String strLIZJ;
                String str2;
                String strLIZJ2;
                String str3;
                Map<String, String> map2;
                BcmStandardTrack bcmStandardTrack;
                IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class);
                C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
                if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
                    strLIZJ = CardStruct.IStatusCode.DEFAULT;
                }
                if (product != null) {
                    str2 = product.productId;
                } else {
                    str2 = null;
                }
                iEcommerceInfluencerService.LJ(strLIZJ, String.valueOf(str2));
                C1743900vTw c1743900vTw2 = this.LIZ.LLIZLLLIL;
                if (c1743900vTw2 == null || (strLIZJ2 = c1743900vTw2.LIZJ("room_id")) == null) {
                    strLIZJ2 = "";
                }
                if (str == null) {
                    str3 = "live_popup_card";
                } else {
                    str3 = str;
                }
                if (product != null && (bcmStandardTrack = product.bcmStandardTrack) != null) {
                    map2 = bcmStandardTrack.chainParam;
                } else {
                    map2 = null;
                }
                C1440005kM.LIZ(new C1726130v1H(strLIZJ2, str3, LIZIZ(2, num, "flip_card", map2), new HashMap()));
                ?? r0 = this.LIZ.LLJ;
                if (r0 != 0) {
                    r0.invoke("flip_card", null, str);
                }
            }
        }, false);
        c21181317ul.LIZLLL(2, new C21212217zk(this) { // from class: X.17zh
            @Override // X.C21212217zk, X.InterfaceC21181417um
            public final int id() {
                return 1;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [X.09AY, X.0sYq] */
            @Override // X.InterfaceC21181417um
            public final void LIZ(String str, Product product, Integer num) {
                String strLIZJ;
                String str2;
                String strLIZJ2;
                Map<String, String> map2;
                String str3;
                BcmStandardTrack bcmStandardTrack;
                IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class);
                C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
                if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
                    strLIZJ = CardStruct.IStatusCode.DEFAULT;
                }
                if (product != null) {
                    str2 = product.productId;
                } else {
                    str2 = null;
                }
                iEcommerceInfluencerService.LJ(strLIZJ, String.valueOf(str2));
                C1743900vTw c1743900vTw2 = this.LIZ.LLIZLLLIL;
                String str4 = "";
                if (c1743900vTw2 == null || (strLIZJ2 = c1743900vTw2.LIZJ("room_id")) == null) {
                    strLIZJ2 = "";
                }
                if (product != null && (bcmStandardTrack = product.bcmStandardTrack) != null) {
                    map2 = bcmStandardTrack.chainParam;
                } else {
                    map2 = null;
                }
                String strLIZIZ = LIZIZ(2, num, str, map2);
                HashMap map3 = new HashMap();
                if (product != null && (str3 = product.productId) != null) {
                    str4 = str3;
                }
                map3.put("product_id", str4);
                C1440005kM.LIZ(new C1726130v1H(strLIZJ2, "live_popup_list", strLIZIZ, map3));
                ?? r0 = this.LIZ.LLJ;
                if (r0 != 0) {
                    r0.invoke(str, null, null);
                }
            }
        }, true);
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null && (numValueOf = Integer.valueOf(usPopupCardVO.cardType)) != null && numValueOf.intValue() == 3) {
            this.LLJILLL = new AwS576S0100000_32(this, 782);
            return;
        }
        C21213117zt.LIZ.getClass();
        if (C21213117zt.LIZIZ(false)) {
            this.LLJILLL = new AwS576S0100000_32(this, 783);
        }
        if (!((EcShopBagAfterPinCardGuide) C212161180x.LIZIZ.getValue()).enabled || !C21206517yp.LIZJ()) {
            return;
        }
        this.LLJILLL = new AwS576S0100000_32(this, 784);
    }

    @Override // X.InterfaceC21184217vE
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJIIL(C2097608Jq.LJIIL(this.LLJJI, LJJJJI()), C7936038c.LIZ("c7068.d5479", PageFinder.via((View) this.LLILZIL))));
        linkedHashMap.put("entrance_form", "live_freeshipping_info");
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.LJIIJJI(getMoreActionResp, function0);
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_show", linkedHashMap);
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJI(int i, long j) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJI(i, j);
        }
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJIIJ(int i, boolean z) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJIIJ(i, z);
        }
    }

    @Override // X.AbstractC21198517xX
    public final void LJJIIJZLJL(AuctionInfo auctionInfo, C1563990qnl c1563990qnl) {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.i0(auctionInfo, c1563990qnl);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.InterfaceC21204817yY
    public final void LJJJLZIJ(int i, Integer num) {
        ?? r0;
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJJLZIJ(i, num);
        }
        if (i != 0) {
            if ((i != 1 && i != 2) || (r0 = this.LLJILJIL) == 0) {
                return;
            }
            r0.invoke();
            return;
        }
        ?? r1 = this.LLJILJILJ;
        if (r1 == 0) {
            return;
        }
        r1.invoke(Boolean.TRUE);
    }

    @Override // X.AbstractC21197217xK, X.InterfaceC21184217vE
    public final void U(ProductItem productItem, C1563990qnl c1563990qnl) {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        ImageModel imageModel;
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null) {
            if (!usPopupCardVO.hasElasticImg && (imageModel = productItem.cover) != null) {
                String str = (String) C13LP.LJJJLL(imageModel.getUrls());
                if (str == null) {
                    str = "";
                }
                if (C703302op.LIZ(str)) {
                    C19516311Xd.LIZ.getClass();
                    C19516311Xd.LIZJ = str;
                }
            }
            LiveFlashSaleInfo liveFlashSaleInfo = productItem.liveFlashSaleInfo;
            if (liveFlashSaleInfo != null && (flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo) != null) {
                FlashSaleAtmosphereStock flashSaleAtmosphereStock2 = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
                if (flashSaleAtmosphereStock2 != null) {
                    flashSaleAtmosphereStock = new FlashSaleAtmosphereStock(liveFlashSaleInfo.stockStatus, liveFlashSaleInfo.availableStock, flashSaleAtmosphereStock2.activityStockText, flashSaleAtmosphereStock2.totalActivityStock);
                } else {
                    flashSaleAtmosphereStock = null;
                }
                flashSaleAtmosphereInfo.flashSaleAtmosphereStock = flashSaleAtmosphereStock;
            }
        }
        super.U(productItem, c1563990qnl);
    }

    @Override // X.InterfaceC212166181c
    public final void LIZ(String str, Product product, Integer num) {
        if (!C21194017wo.LIZIZ(this.LL)) {
            ((C21181317ul) this.LLJJIJIIJIL.getValue()).LIZ(str, product, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC21197217xK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r48, X.C1743900vTw r49, android.content.Context r50) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21203517yL.LJJJI(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, X.0vTw, android.content.Context):void");
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJJLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2) {
        InterfaceC21204817yY interfaceC21204817yY;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204817yY) && (interfaceC21204817yY = (InterfaceC21204817yY) t) != null) {
            interfaceC21204817yY.LJJJLIIL(flashSaleAtmosphereStock, z, z2);
        }
    }

    @Override // X.AbstractC21197217xK, X.InterfaceC21184217vE
    public final void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map) {
        if (C292450BdD.LIZ()) {
            LJJIJIIJIL(usPopupCardVO);
            super.u(usPopupCardVO, str, map);
        } else {
            if (this.LLJJIJIL.LJIIJ() || C21194017wo.LIZIZ(usPopupCardVO)) {
                return;
            }
            LJJIJIIJIL(usPopupCardVO);
            super.u(usPopupCardVO, str, map);
        }
    }
}
