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
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
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
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.oec_msg.LiveFlashSaleInfo;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203617yM extends AbstractC21197117xJ implements InterfaceC21204917yZ {
    public final InterfaceC756790TmP LLJJJJ;
    public String LLJJJJJIL;

    @Override // X.AbstractC21197117xJ
    public final boolean LJJJ() {
        return false;
    }

    @Override // X.InterfaceC21184317vF
    public final void LLLLLLIL() {
    }

    @Override // X.InterfaceC21184317vF
    public final void LLLLLLJ(int i) {
    }

    @Override // X.AbstractC21197117xJ, X.C181I
    public final void LJ() throws JSONException {
        LiveVoucher liveVoucher;
        Map<String, String> map;
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLIZJ5;
        C1743900vTw c1743900vTw;
        C1743900vTw c1743900vTw2;
        PopupCardVO popupCardVO = this.LL;
        String string = popupCardVO != null ? Long.valueOf(popupCardVO.productId).toString() : null;
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        String strLIZJ6 = c1743900vTw3 != null ? c1743900vTw3.LIZJ("room_id") : null;
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        String strLIZJ7 = c1743900vTw4 != null ? c1743900vTw4.LIZJ("live_role") : null;
        PopupCardVO popupCardVO2 = this.LL;
        boolean zIsFromMessage = popupCardVO2 != null ? popupCardVO2.isFromMessage() : false;
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        boolean zLIZLLL = c1743900vTw5 != null ? c1743900vTw5.LIZLLL("is_page_visible") : false;
        C1743900vTw c1743900vTw6 = this.LLIZLLLIL;
        boolean zLIZLLL2 = c1743900vTw6 != null ? c1743900vTw6.LIZLLL("has_permission") : false;
        C1743900vTw c1743900vTw7 = this.LLIZLLLIL;
        boolean zLIZLLL3 = c1743900vTw7 != null ? c1743900vTw7.LIZLLL("is_keyboard_showing") : false;
        C1743900vTw c1743900vTw8 = this.LLIZLLLIL;
        String strLIZJ8 = c1743900vTw8 != null ? c1743900vTw8.LIZJ("author_id") : null;
        Map<String, String> mapLJJJJI = LJJJJI();
        PopupCardVO popupCardVO3 = this.LL;
        Integer numValueOf = popupCardVO3 != null ? Integer.valueOf(popupCardVO3.cardType) : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJJJJI;
        String str = (String) linkedHashMap.get("rights_content");
        if (str != null && (c1743900vTw2 = this.LLIZLLLIL) != null) {
            c1743900vTw2.LJIIIIZZ("rights_content", str, false);
        }
        String str2 = (String) linkedHashMap.get("rights_cnt");
        if (str2 != null && (c1743900vTw = this.LLIZLLLIL) != null) {
            c1743900vTw.LJIIIIZZ("rights_cnt", str2, false);
        }
        C21205617yg.LIZ(this.LLJJIII, this.LLIZLLLIL);
        C1743900vTw c1743900vTw9 = this.LLIZLLLIL;
        if (c1743900vTw9 != null && (strLIZJ5 = c1743900vTw9.LIZJ("param_search_is_inner")) != null) {
            this.LLJJIII.put("is_inner", strLIZJ5);
        }
        C1743900vTw c1743900vTw10 = this.LLIZLLLIL;
        if (c1743900vTw10 != null && (strLIZJ4 = c1743900vTw10.LIZJ("param_inner_search_id")) != null) {
            this.LLJJIII.put("inner_search_id", strLIZJ4);
        }
        C1743900vTw c1743900vTw11 = this.LLIZLLLIL;
        if (c1743900vTw11 != null && (strLIZJ3 = c1743900vTw11.LIZJ("param_rank_inner")) != null) {
            this.LLJJIII.put("rank_inner", strLIZJ3);
        }
        C1743900vTw c1743900vTw12 = this.LLIZLLLIL;
        if (c1743900vTw12 != null && (strLIZJ2 = c1743900vTw12.LIZJ("param_is_slide")) != null) {
            this.LLJJIII.put("is_slide", strLIZJ2);
        }
        C1743900vTw c1743900vTw13 = this.LLIZLLLIL;
        if (c1743900vTw13 != null && (strLIZJ = c1743900vTw13.LIZJ("param_slide_rank")) != null) {
            this.LLJJIII.put("slide_rank", strLIZJ);
        }
        String str3 = strLIZJ6;
        String str4 = string;
        C21192717wb.LIZ(EnumC21193117wf.DID_SHOW, strLIZJ7 == null ? "" : strLIZJ7, strLIZJ6, string, zLIZLLL, zLIZLLL3, zLIZLLL2, zIsFromMessage, numValueOf, null, null, null, 3584);
        Map mapLIZ = C7936038c.LIZ((numValueOf == null || numValueOf.intValue() != 3) ? "c7068.d5479" : "c863006.d0", PageFinder.via((View) this.LLILZIL));
        if (numValueOf == null || numValueOf.intValue() != 3) {
            C21193917wn c21193917wn = C21193917wn.LIZ;
            PopupCardVO popupCardVO4 = this.LL;
            c21193917wn.getClass();
            if (!((Boolean) C21193917wn.LIZJ(popupCardVO4).getFirst()).booleanValue()) {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIL(this.LLJJIII, mapLJJJJI), mapLIZ);
                c1507790pL7.getClass();
                C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_show", mapLJIIL);
            }
            PopupCardVO popupCardVO5 = this.LL;
            C21198417xW.LJIIIZ(str4, str3, popupCardVO5 != null ? popupCardVO5.fromMessageId : null, strLIZJ8, strLIZJ7);
            LiveExposedProductsCache liveExposedProductsCache = LiveExposedProductsCache.LIZ;
            PopupCardVO popupCardVO6 = this.LL;
            Long lValueOf = popupCardVO6 != null ? Long.valueOf(popupCardVO6.productId) : null;
            liveExposedProductsCache.getClass();
            if (str3 == null || lValueOf == null) {
                return;
            }
            LiveExposedProductsCache.LIZ(str3, strLIZJ8, new AwS611S0100000_32(lValueOf, 69));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("author_id", strLIZJ8);
        jSONObject.put("room_id", str3);
        C1743900vTw c1743900vTw14 = this.LLIZLLLIL;
        jSONObject.put("enter_from_merge", c1743900vTw14 != null ? c1743900vTw14.LIZJ("enter_from_merge") : null);
        C1743900vTw c1743900vTw15 = this.LLIZLLLIL;
        jSONObject.put("enter_method", c1743900vTw15 != null ? c1743900vTw15.LIZJ("enter_method") : null);
        C1743900vTw c1743900vTw16 = this.LLIZLLLIL;
        jSONObject.put("action_type", c1743900vTw16 != null ? c1743900vTw16.LIZJ("action_type") : null);
        C1743900vTw c1743900vTw17 = this.LLIZLLLIL;
        jSONObject.put("track_id", c1743900vTw17 != null ? c1743900vTw17.LIZJ("track_id") : null);
        C1743900vTw c1743900vTw18 = this.LLIZLLLIL;
        jSONObject.put("source_page_type", c1743900vTw18 != null ? c1743900vTw18.LIZJ("source_page_type") : null);
        C1743900vTw c1743900vTw19 = this.LLIZLLLIL;
        jSONObject.put("follow_status", c1743900vTw19 != null ? c1743900vTw19.LIZJ("follow_status") : null);
        C1743900vTw c1743900vTw20 = this.LLIZLLLIL;
        jSONObject.put("is_ad", c1743900vTw20 != null ? c1743900vTw20.LIZJ("is_ad") : null);
        C1743900vTw c1743900vTw21 = this.LLIZLLLIL;
        jSONObject.put("request_id", c1743900vTw21 != null ? c1743900vTw21.LIZJ("request_id") : null);
        jSONObject.put("page_name", "live");
        PopupCardVO popupCardVO7 = this.LL;
        if (popupCardVO7 != null && (liveVoucher = popupCardVO7.popVoucher) != null && (map = liveVoucher.daInfo) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("coupon_zone", "live_popup_card");
        for (Map.Entry entry2 : ((HashMap) mapLIZ).entrySet()) {
            jSONObject.put((String) entry2.getKey(), entry2.getValue());
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("livesdk_tiktokec_live_coupon_pin_card_show_user", jSONObject);
        C1507790pL7.LIZLLL("livesdk_tiktokec_coupon_show", jSONObject);
    }

    @Override // X.InterfaceC21181717up, X.InterfaceC21204917yZ
    public final void LJI() {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if (!(t instanceof InterfaceC21204917yZ) || (interfaceC21204917yZ = (InterfaceC21204917yZ) t) == null) {
            return;
        }
        interfaceC21204917yZ.LJI();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.C181I
    public final void LJIL() {
        ?? r0 = this.LLJILJILJ;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    @Override // X.AbstractC21198617xY
    public final boolean LJJ() {
        Integer num;
        if (!((Boolean) C18063075p.LIZ.getValue()).booleanValue()) {
            return true;
        }
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null && (num = popupCardVO.productType) != null && num.intValue() == 2) {
            return true;
        }
        C013C c013c = new C013C();
        c013c.element = true;
        C1440005kM.LIZ(new C033Z(new AwS611S0100000_32(c013c, 396)));
        return c013c.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    @Override // X.AbstractC21198617xY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation LJJII() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21203617yM.LJJII():android.view.animation.Animation");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    @Override // X.AbstractC21198617xY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.animation.Animation LJJIII() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21203617yM.LJJIII():android.view.animation.Animation");
    }

    @Override // X.AbstractC21198617xY
    public final Animation LJJIIJZLJL() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setAnimationListener(new C19LR(this, 11));
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
        Map<String, String> mapLLJJLIIIJLLLLLLLZ = LLJJLIIIJLLLLLLLZ(7);
        if (mapLLJJLIIIJLLLLLLLZ != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ2 = LLJJLIIIJLLLLLLLZ(1);
        if (mapLLJJLIIIJLLLLLLLZ2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLLJJLIIIJLLLLLLLZ2);
            linkedHashMap2.remove("label_type");
            linkedHashMap.putAll(linkedHashMap2);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ3 = LLJJLIIIJLLLLLLLZ(2);
        if (mapLLJJLIIIJLLLLLLLZ3 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ3);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ4 = LLJJLIIIJLLLLLLLZ(21);
        if (mapLLJJLIIIJLLLLLLLZ4 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ4);
        }
        C19676311yb.LJ(linkedHashMap, LJJIZ());
        return linkedHashMap;
    }

    @Override // X.InterfaceC21184117vD
    public final List<String> getProductShowIds() {
        List<String> productShowIds;
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        return (abstractC21202217y8 == null || (productShowIds = abstractC21202217y8.getProductShowIds()) == null) ? C13BV.INSTANCE : productShowIds;
    }

    @Override // X.AbstractC21198617xY, com.bytedance.android.live.slot.IFrameSlot
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
        PopupCardVO popupCardVO = this.LL;
        C20340514iR.LJII(strLIZJ, strLIZJ2, strLJII, String.valueOf(popupCardVO != null ? Long.valueOf(popupCardVO.productId) : null), false);
    }

    @Override // X.InterfaceC21181717up, X.InterfaceC21204917yZ
    public final void LIZIZ(int i) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LIZIZ(i);
        }
    }

    @Override // X.C181I
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
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null) {
            string = Long.valueOf(popupCardVO.productId).toString();
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
        C21198417xW.LJIIIIZZ("livesdk_tiktokec_product_discount_tag_show", strLIZJ, string, strLIZJ2, strLIZJ3, strLIZJ4, strLIZJ5, strLIZJ6, strLIZJ7, strLIZJ8, strLIZJ9, strLIZJ10, strLIZJ11, strLIZJ12, map, strLIZJ13);
    }

    @Override // X.InterfaceC21181717up
    public final void LJFF(boolean z) {
        T t = this.LLILZIL;
        if (t != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            this.LLJJIJIL.LJFF(z);
        }
    }

    @Override // X.C181I
    public final void LJII(int i) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = this.LLJJIII;
        map.put("label_type", "live_flash_sale_only_left");
        map.put("label_number", "-1");
        map.put("label_order", String.valueOf(i));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", map);
    }

    @Override // X.C181I
    public final void LJIIIIZZ(Map<String, String> map) {
        String strLIZJ;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw != null && (strLIZJ = c1743900vTw.LIZJ("live_role")) != null) {
            map = C2097608Jq.LJIILIIL(map, new Pair("live_role", strLIZJ));
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIL = C2097608Jq.LJIIL(this.LLJJIII, map);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", mapLJIIL);
    }

    @Override // X.C181I
    public final void LJIIIZ(int i) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = this.LLJJIII;
        map.put("label_type", "live_flash_sale_preheat");
        map.put("label_number", "-1");
        map.put("label_order", String.valueOf(i));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_label_show", map);
    }

    @Override // X.InterfaceC21181717up
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
        this.LLJJIJIL.LJIIL(flashSaleAtmosphereStock);
    }

    @Override // X.C181I
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
            map2 = (HashMap) C08JS.LIZIZ().LJIIIIZZ(map.get("selling_point_da_info"), new TypeToken<HashMap<String, String>>() { // from class: X.17yb
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
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null) {
            string = Long.valueOf(popupCardVO.productId).toString();
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
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            promotionLogoDaInfo = abstractC21202217y8.getPromotionLogoDaInfo();
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
            C21198417xW.LIZ.getClass();
            C21198417xW.LIZ(jSONObject, "request_id", strLIZJ11);
            jSONObject.put("page_name", strLIZJ12);
            if (zLIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("has_sellingpoint", str);
            C21198417xW.LIZ(jSONObject, "pos_selling_point", str2);
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            C21198417xW.LIZ.getClass();
            C21198417xW.LIZ(jSONObject, "sellingpoint_cnt", str3);
            C21198417xW.LIZ(jSONObject, "live_role", strLIZJ13);
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

    @Override // X.C181I
    public final void LJIILJJIL(Product product) {
        AwS646S0100000_32 awS646S0100000_32;
        if (product != null && (awS646S0100000_32 = this.LLJIJIL) != null) {
            awS646S0100000_32.invoke(0, product);
        }
    }

    @Override // X.InterfaceC21181717up
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        this.LLJJIJIL.LJIILL(flashSaleAtmosphere);
    }

    @Override // X.AbstractC21197117xJ, X.AbstractC21198617xY
    public final void LJJIFFI(String str) {
        super.LJJIFFI(str);
        this.LLJJIJIL.LIZJ();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [DATA, X.17ye] */
    @Override // X.AbstractC21197117xJ, X.AbstractC21198617xY
    public final void LJJIJIIJIL(boolean z) {
        T t;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numValueOf;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        this.LLJJIJIL.LIZJ();
        PopupCardVO popupCardVO = this.LL;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = null;
        if (popupCardVO != null) {
            C21203817yO c21203817yO = this.LLJJIJIL;
            ?? c21205417ye = new C21205417ye();
            c21205417ye.LIZJ = popupCardVO.createTime;
            c21205417ye.LIZLLL = popupCardVO.serverTime;
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere;
            } else {
                flashSaleAtmosphere2 = null;
            }
            c21205417ye.LIZ = flashSaleAtmosphere2;
            if (flashSaleAtmosphereInfo != null) {
                flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
            }
            c21205417ye.LIZIZ = flashSaleAtmosphereStock;
            if (!c21203817yO.LLILZ) {
                c21203817yO.LLILZ = true;
                c21203817yO.LLILLL = c21205417ye;
            }
        }
        super.LJJIJIIJIL(z);
        if (z && (t = this.LLILZIL) != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onProductChanged refresh status");
            PopupCardVO popupCardVO2 = this.LL;
            if (popupCardVO2 != null) {
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = popupCardVO2.flashSaleAtmosphereInfo;
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

    @Override // X.AbstractC21198617xY
    public final void LJJIJIL(PopupCardVO popupCardVO) {
        String str;
        this.LL = popupCardVO;
        C19516311Xd c19516311Xd = C19516311Xd.LIZ;
        if (popupCardVO != null) {
            str = popupCardVO.imageUrl;
        } else {
            str = null;
        }
        c19516311Xd.getClass();
        C19516311Xd.LIZJ = str;
    }

    @Override // X.AbstractC21198617xY
    public final void LJJIJLIJ(String str) {
        this.LLJJJJJIL = str;
    }

    @Override // X.AbstractC21197117xJ, X.InterfaceC21184117vD
    public final void b0(ProductItem productItem) {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        ImageModel imageModel;
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null) {
            if (!popupCardVO.hasElasticImg && (imageModel = productItem.cover) != null) {
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
            if (liveFlashSaleInfo != null && (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) != null) {
                FlashSaleAtmosphereStock flashSaleAtmosphereStock2 = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
                if (flashSaleAtmosphereStock2 != null) {
                    flashSaleAtmosphereStock = new FlashSaleAtmosphereStock(liveFlashSaleInfo.stockStatus, liveFlashSaleInfo.availableStock, flashSaleAtmosphereStock2.activityStockText, flashSaleAtmosphereStock2.totalActivityStock);
                } else {
                    flashSaleAtmosphereStock = null;
                }
                flashSaleAtmosphereInfo.flashSaleAtmosphereStock = flashSaleAtmosphereStock;
            }
        }
        super.b0(productItem);
    }

    public C21203617yM(Map<String, String> map, C21194817ww c21194817ww) {
        super(map, c21194817ww);
        this.LLJJJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j6();
        this.LLJJIJIL.LIZLLL(new C21204617yW(this));
        this.LLJJIJIL.LIZLLL(new C21204417yU(this));
        this.LLJJIJIL.LIZLLL(new C21206217ym(this));
        this.LLJJIJIL.LIZLLL(new C21206017yk(this));
        C594220NSi c594220NSi = (C594220NSi) this.LLJJIJIIJIL.getValue();
        c594220NSi.LIZLLL(1, new C21212317zl(this) { // from class: X.17zg
            /* JADX WARN: Type inference failed for: r1v2, types: [X.09AY, X.0sYq] */
            public final void LJII(String str) {
                String strLIZJ;
                PopupCardVO popupCardVO = this.LIZ.LL;
                if (popupCardVO != null) {
                    IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class);
                    C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
                    if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
                        strLIZJ = CardStruct.IStatusCode.DEFAULT;
                    }
                    iEcommerceInfluencerService.LJ(strLIZJ, String.valueOf(popupCardVO.productId));
                    LIZLLL(str, popupCardVO, this.LIZ.LLIZLLLIL);
                    ?? r1 = this.LIZ.LLJ;
                    if (r1 != 0) {
                        r1.invoke(str, null, null);
                    }
                }
            }

            public final void LJIIIZ(Context context, String str) {
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
                            C21198417xW.LIZIZ(this.LIZ.LLIZLLLIL, "noncl_product", "assistant modules less than two");
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
                    C21198417xW.LIZIZ(this.LIZ.LLIZLLLIL, "no_sellingpoint", "assistant modules less than two");
                    return;
                }
                if (!str.equals("success")) {
                    return;
                }
                PopupCardVO popupCardVO = this.LIZ.LL;
                if (popupCardVO != null) {
                    lValueOf = Long.valueOf(popupCardVO.productId);
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
                C21198417xW.LIZIZ(this.LIZ.LLIZLLLIL, "success", null);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Type inference failed for: r0v10, types: [X.09AY, X.0sYq] */
            /* JADX WARN: Type inference failed for: r0v27, types: [X.09AY, X.0sYq] */
            @Override // X.InterfaceC594230NSj
            public final void LIZ(String str, Product product, Integer num) {
                AbstractC21198617xY<AbstractC21202217y8> abstractC21198617xY;
                PopupCardVO popupCardVO;
                Context context;
                List<Object> list;
                switch (str.hashCode()) {
                    case -1377687758:
                        if (!str.equals("button") || (popupCardVO = (abstractC21198617xY = this.LIZ).LL) == null) {
                            return;
                        }
                        LIZLLL(str, popupCardVO, abstractC21198617xY.LLIZLLLIL);
                        ?? r0 = this.LIZ.LLJ;
                        if (r0 != 0) {
                            r0.invoke(str, null, null);
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), C0PEM.LIZJ, null, new C21178017uE(this, popupCardVO, null), 2);
                        return;
                    case -1002552376:
                        if (!str.equals("flip_card_lower_area")) {
                            return;
                        }
                        LJIIIIZZ(product, num, C19395510uP.LJIILL);
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
                        int i = C19395510uP.LJIILJJIL;
                        if (i == 1) {
                            LJIIIIZZ(product, num, C19395510uP.LJIILL);
                            return;
                        } else {
                            if (i != 2) {
                                return;
                            }
                            LJII("title");
                            return;
                        }
                    case 1040297837:
                        if (!str.equals("flip_card_pic")) {
                            return;
                        }
                        int i2 = C19395510uP.LJIILJJIL;
                        if (i2 == 1) {
                            LJIIIIZZ(product, num, C19395510uP.LJIILL);
                            return;
                        } else {
                            if (i2 != 2) {
                                return;
                            }
                            LJII("pic");
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
                        PopupCardVO popupCardVO2 = this.LIZ.LL;
                        if (popupCardVO2 != null && (list = popupCardVO2.assistantModules) != null && (!list.isEmpty())) {
                            LJIIIZ(context, "success");
                            return;
                        }
                        PopupCardVO popupCardVO3 = this.LIZ.LL;
                        if (popupCardVO3 != null && popupCardVO3.platform == 5) {
                            LJIIIZ(context, "no_sellingpoint");
                            return;
                        } else {
                            LJIIIZ(context, "noncl_product");
                            return;
                        }
                    default:
                        return;
                }
                LJII(str);
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [X.09AY, X.0sYq] */
            public final void LJIIIIZZ(Product product, Integer num, String str) {
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
        c594220NSi.LIZLLL(2, new C21212317zl(this) { // from class: X.17zi
            @Override // X.C21212317zl, X.InterfaceC594230NSj
            public final int id() {
                return 1;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [X.09AY, X.0sYq] */
            @Override // X.InterfaceC594230NSj
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
        C21213117zt.LIZ.getClass();
        if (C21213117zt.LIZIZ(false)) {
            this.LLJILLL = new AwS576S0100000_32(this, 890);
        }
        if (((EcShopBagAfterPinCardGuide) C212161180x.LIZIZ.getValue()).enabled && C21206517yp.LIZJ()) {
            this.LLJILLL = new AwS576S0100000_32(this, 891);
        }
    }

    @Override // X.AbstractC21197117xJ, X.InterfaceC21184117vD
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJIIL(C2097608Jq.LJIIL(this.LLJJIII, LJJJJI()), C7936038c.LIZ("c7068.d5479", PageFinder.via((View) this.LLILZIL))));
        linkedHashMap.put("entrance_form", "live_freeshipping_info");
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.LJIIJJI(getMoreActionResp, function0);
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_show", linkedHashMap);
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJI(int i, long j) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJI(i, j);
        }
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJIIJ(int i, boolean z) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJIIJ(i, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.InterfaceC21204917yZ
    public final void LJJJLZIJ(int i, Integer num) {
        ?? r0;
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJJLZIJ(i, num);
        }
        if (i != 0) {
            if ((i != 1 && i != 2) || (r0 = this.LLJILJIL) == 0) {
                return;
            }
            r0.invoke();
            return;
        }
        ?? r02 = this.LLJILJILJ;
        if (r02 == 0) {
            return;
        }
        r02.invoke();
    }

    @Override // X.AbstractC21197117xJ, X.InterfaceC21184117vD
    public final void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str) {
        if (C292450BdD.LIZ()) {
            LJJIJIL(popupCardVO);
            super.LJJLIIIJLJLI(popupCardVO, str);
        } else {
            if (this.LLJJIJIL.LJIIJ()) {
                return;
            }
            LJJIJIL(popupCardVO);
            super.LJJLIIIJLJLI(popupCardVO, str);
        }
    }

    @Override // X.AbstractC21197117xJ, X.C181I
    public final void LIZ(String str, Product product, Integer num) {
        ((C594220NSi) this.LLJJIJIIJIL.getValue()).LIZ(str, product, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC21197117xJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r48, X.C1743900vTw r49, android.content.Context r50) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21203617yM.LJJJI(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO, X.0vTw, android.content.Context):void");
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJJLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2) {
        InterfaceC21204917yZ interfaceC21204917yZ;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21204917yZ) && (interfaceC21204917yZ = (InterfaceC21204917yZ) t) != null) {
            interfaceC21204917yZ.LJJJLIIL(flashSaleAtmosphereStock, z, z2);
        }
    }
}
