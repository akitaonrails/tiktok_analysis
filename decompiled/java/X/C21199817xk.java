package X;

import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199817xk extends AbstractC21196217xA {
    public AnonymousClass0956 LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;
    public final Map<String, String> LJI;
    public boolean LJII;
    public C21195617x4 LJIIIIZZ;
    public Boolean LJIIIZ;
    public final C01GW LJIIJ;
    public final Map<String, String> LJIIJJI;

    @Override // X.AbstractC21196217xA
    public final void LIZJ() {
        this.LIZIZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC21196217xA
    public final void LJFF() {
        PopupCardVO popupCardVO;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("redisplayCard isCancelled = ");
        sbLIZ.append(this.LIZ.LJJIJIIJI().LLILZ);
        sbLIZ.append(", productId = ");
        PopupCardVO popupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        sbLIZ.append(popupCardVO2 != null ? Long.valueOf(popupCardVO2.productId) : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (this.LIZ.LJJIJIIJI().LLILZ || (popupCardVO = this.LIZ.LJJIJIIJI().LL) == null) {
            return;
        }
        this.LIZ.LJJIJIIJI().LJJIJL(popupCardVO, this.LIZ.LJJJ());
        LJIIZILJ(popupCardVO, false);
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIJ() {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner2;
        LifecycleCoroutineScope lifecycleScope2;
        String str;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        OecInitData oecInitDataLIZ = C1733990vDx.LIZ(this.LIZ.LLJILLL);
        if (((oecInitDataLIZ == null || (str = oecInitDataLIZ.bagAnimation) == null || str.length() <= 0) ? false : true) && C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_live_room_animation_timing_type", true) != 1 && !C21206517yp.LIZJ() && !C20340514iR.LJ()) {
            InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LLJILJIL;
            if (interfaceC21213717zz != null && (lifecycleOwner2 = interfaceC21213717zz.getLifecycleOwner()) != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope2, null, null, new C591920NJm(null), 3);
            }
            this.LIZLLL = anonymousClass0956LIZLLL;
            return;
        }
        if (((Number) this.LJFF.getValue()).intValue() <= 0 || !C21206517yp.LIZJ()) {
            return;
        }
        InterfaceC21213717zz interfaceC21213717zz2 = this.LIZ.LLJILJIL;
        if (interfaceC21213717zz2 != null && (lifecycleOwner = interfaceC21213717zz2.getLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C591930NJn(this, null), 3);
        }
        this.LIZLLL = anonymousClass0956LIZLLL;
    }

    public final void LJIIL() {
        if (this.LIZ.LLJILJILJ.LJFF("label_type")) {
            this.LIZ.LLJILJILJ.LJIIJJI("label_type");
        }
        if (this.LIZ.LLJILJILJ.LJFF("label_number")) {
            this.LIZ.LLJILJILJ.LJIIJJI("label_number");
        }
    }

    public final boolean LJIILJJIL() {
        return ((Boolean) this.LJIIJ.getValue()).booleanValue();
    }

    public final void LJIILL() {
        if (this.LJ) {
            return;
        }
        this.LIZ.LJJIJIIJI().LLJI = new AwS576S0100000_32(this, 849);
        this.LIZ.LJJIJIIJI().LLJ = new AwS681S0100000_32(this, 36);
        this.LIZ.LJJIJIIJI().LLJILJIL = new AwS576S0100000_32(this, 850);
        this.LIZ.LJJIJIIJI().LLJILJILJ = new AwS576S0100000_32(this, 851);
        this.LIZ.LJJIJIIJI().LLJIJIL = new AwS646S0100000_32(this, 33);
        this.LJ = true;
    }

    @Override // X.AbstractC21196217xA
    public final void LJII() {
        Map<String, String> mapLIZIZ = LIZIZ();
        PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO == null || popupCardVO.cardType != 3) {
            C21206717yr c21206717yr = C21206717yr.LIZ;
            AbstractC21194217wq abstractC21194217wq = this.LIZ;
            C1743900vTw c1743900vTw = abstractC21194217wq.LLJILJILJ;
            Map<String, String> map = abstractC21194217wq.LLJJIJI;
            HashMap map2 = new HashMap();
            Map<String, String> map3 = this.LIZ.LLJJIJIIJIL;
            if (map3 != null) {
                map2.putAll(map3);
                map2.put("refer", "image");
                map2.put("label", "user_othershow");
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZIZ;
            String str = (String) linkedHashMap.get("flashsale_status");
            String str2 = (String) linkedHashMap.get("countdown_type");
            c21206717yr.getClass();
            C2344009Gk c2344009GkLIZLLL = C21206717yr.LIZLLL(c1743900vTw);
            c2344009GkLIZLLL.LJIIIIZZ("item_order", c1743900vTw.LIZJ("item_order"));
            if (c1743900vTw.LJFF("campaign_id")) {
                c2344009GkLIZLLL.LJFF("campaign_id", c1743900vTw.LIZJ("campaign_id"));
            }
            if (c1743900vTw.LJFF("campaign_type")) {
                c2344009GkLIZLLL.LJFF("campaign_type", c1743900vTw.LIZJ("campaign_type"));
            }
            if (c1743900vTw.LJFF("campaign_channel")) {
                c2344009GkLIZLLL.LJFF("campaign_channel", c1743900vTw.LIZJ("campaign_channel"));
            }
            if (c1743900vTw.LJFF("campaign_user_tag")) {
                c2344009GkLIZLLL.LJFF("campaign_user_tag", c1743900vTw.LIZJ("campaign_user_tag"));
            }
            if (str != null) {
                c2344009GkLIZLLL.LJFF("flashsale_status", str);
            }
            if (str2 != null) {
                c2344009GkLIZLLL.LJFF("countdown_type", str2);
            }
            C21206717yr.LIZ(c2344009GkLIZLLL);
            c2344009GkLIZLLL.LJII(map);
            c2344009GkLIZLLL.LJII(map2);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Map<String, String> map4 = c2344009GkLIZLLL.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("livesdk_tiktokec_popupcard_show", map4);
        }
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIIZ() {
        Map<String, String> mapLIZIZ = LIZIZ();
        C21206717yr c21206717yr = C21206717yr.LIZ;
        AbstractC21194217wq abstractC21194217wq = this.LIZ;
        Map<String, String> map = abstractC21194217wq.LLJJIJI;
        C1743900vTw c1743900vTw = abstractC21194217wq.LLJILJILJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZIZ;
        String str = (String) linkedHashMap.get("flashsale_status");
        String str2 = (String) linkedHashMap.get("countdown_type");
        c21206717yr.getClass();
        C2344009Gk c2344009GkLIZLLL = C21206717yr.LIZLLL(c1743900vTw);
        c2344009GkLIZLLL.LJIIIIZZ("stay_time", c1743900vTw.LIZJ("stay_time"));
        c2344009GkLIZLLL.LJIIIIZZ("quit_type", c1743900vTw.LIZJ("quit_type"));
        if (str != null) {
            c2344009GkLIZLLL.LJFF("flashsale_status", str);
        }
        if (str2 != null) {
            c2344009GkLIZLLL.LJFF("countdown_type", str2);
        }
        if (map != null) {
            c2344009GkLIZLLL.LJII(map);
        }
        C21206717yr.LIZ(c2344009GkLIZLLL);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map2 = c2344009GkLIZLLL.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_popupcard_staytime", map2);
    }

    @Override // X.AbstractC21196217xA
    public final void LIZ(String str) {
        boolean zLJFF;
        Long lValueOf;
        String string;
        String string2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LLJIJIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null) {
            zLJFF = Intrinsics.LJFF(value.first, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            this.LIZ.LJJIJIIJI().LJJIJLIJ(str);
            InterfaceC21200917xv interfaceC21200917xv = this.LIZIZ;
            if (interfaceC21200917xv != null) {
                interfaceC21200917xv.LIZJ();
            }
            LJIIJ();
            this.LIZ.LJJJJZ(str);
        } else if (Intrinsics.LJFF(str, "unpin")) {
            C21199917xl c21199917xl = C21199917xl.LIZ;
            Room room = this.LIZ.LLJILLL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            C21200017xm c21200017xmLIZ = c21199917xl.LIZ(lValueOf);
            if (c21200017xmLIZ != null) {
                c21200017xmLIZ.LJFF(c21200017xmLIZ.LIZLLL(0), true);
            }
        }
        this.LIZ.LLLF.removeMessages(0);
        this.LIZ.LJJIJIIJI().LJJIFFI(str);
        if (Intrinsics.LJFF(str, "unpin")) {
            Room room2 = this.LIZ.LLJILLL;
            if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String strLJJIJ = AbstractC21194217wq.LJJIJ();
            String roleStr = EnumC21196517xD.AUDIENCE.getRoleStr();
            PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO == null || (string2 = Long.valueOf(popupCardVO.productId).toString()) == null) {
                string2 = "";
            }
            C21198417xW.LIZJ(string, strLJJIJ, roleStr, string2);
        }
    }

    @Override // X.AbstractC21196217xA
    public final void LIZLLL(OecInitData oecInitData) {
        Boolean boolValueOf;
        PopupCardVO popupCardVO;
        CommerceStruct commerceStruct;
        LJIILL();
        Room room = this.LIZ.LLJILLL;
        Long lValueOf = null;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null) {
            boolValueOf = Boolean.valueOf(commerceStruct.asyncLoad);
        } else {
            boolValueOf = null;
        }
        if (C21194717wv.LIZLLL(oecInitData, boolValueOf) != null && (popupCardVO = this.LIZ.LJJIJIIJI().LL) != null) {
            Boolean bool = this.LJIIIZ;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            this.LJIIIZ = bool;
            LJIIZILJ(popupCardVO, true);
            if (!LJIILJJIL()) {
                AbstractC21194217wq abstractC21194217wq = this.LIZ;
                PopupCardVO popupCardVO2 = abstractC21194217wq.LJJIJIIJI().LL;
                if (popupCardVO2 != null) {
                    lValueOf = Long.valueOf(popupCardVO2.productId);
                }
                abstractC21194217wq.LJJJJLL(lValueOf, false);
            }
        }
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIIIZZ(String str) {
        boolean z;
        Map<String, ? extends Object> map;
        HashMap<String, String> map2;
        LiveDaInfo liveDaInfo;
        Integer num;
        Long lValueOf;
        Map<String, String> mapLIZIZ = LIZIZ();
        C19516311Xd c19516311Xd = C19516311Xd.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c19516311Xd.getClass();
        C19516311Xd.LIZLLL = jElapsedRealtime;
        PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO != null && popupCardVO.cardType == 99) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            PopupCardVO popupCardVO2 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO2 != null) {
                lValueOf = Long.valueOf(popupCardVO2.popCardId);
            } else {
                lValueOf = null;
            }
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = new kotlin.Pair("quit_type", str);
            String strLIZJ = this.LIZ.LLJILJILJ.LIZJ("stay_time");
            if (strLIZJ == null) {
                strLIZJ = "-1";
            }
            pairArr[1] = new kotlin.Pair("stay_time", strLIZJ);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (lValueOf != null) {
                mapLJIIJ.put("card_id", lValueOf.toString());
            }
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter != null) {
                iEventCenter.LIZ("ec_lynx_card_send_stay_time", C1741890vQh.LJIIIIZZ(mapLJIIJ));
            }
        } else {
            C21206717yr c21206717yr = C21206717yr.LIZ;
            AbstractC21194217wq abstractC21194217wq = this.LIZ;
            Map<String, String> map3 = abstractC21194217wq.LLJJIJI;
            C1743900vTw c1743900vTw = abstractC21194217wq.LLJILJILJ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZIZ;
            String str2 = (String) linkedHashMap.get("flashsale_status");
            String str3 = (String) linkedHashMap.get("countdown_type");
            String str4 = (String) linkedHashMap.get("product_id");
            PopupCardVO popupCardVO3 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO3 != null) {
                map = popupCardVO3.coverComponentDaInfo;
            } else {
                map = null;
            }
            PopupCardVO popupCardVO4 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO4 != null && (liveDaInfo = popupCardVO4.commonDaInfo) != null) {
                map2 = liveDaInfo.transDaInfo;
            } else {
                map2 = null;
            }
            c21206717yr.getClass();
            C2344009Gk c2344009GkLIZLLL = C21206717yr.LIZLLL(c1743900vTw);
            c2344009GkLIZLLL.LJIIIIZZ("stay_time", c1743900vTw.LIZJ("stay_time"));
            c2344009GkLIZLLL.LJIIIIZZ("quit_type", c1743900vTw.LIZJ("quit_type"));
            if (str2 != null) {
                c2344009GkLIZLLL.LJFF("flashsale_status", str2);
            }
            if (str3 != null) {
                c2344009GkLIZLLL.LJFF("countdown_type", str3);
            }
            if (c1743900vTw.LJFF("source_module")) {
                c2344009GkLIZLLL.LJFF("source_module", c1743900vTw.LIZJ("source_module"));
            }
            if (c1743900vTw.LJFF("source_page_type")) {
                c2344009GkLIZLLL.LJFF("source_page_type", c1743900vTw.LIZJ("source_page_type"));
            }
            if (str4 != null) {
                c2344009GkLIZLLL.LJFF("product_id", str4);
            }
            String str5 = (String) linkedHashMap.get("auction_id");
            if (str5 != null) {
                c2344009GkLIZLLL.LJFF("auction_id", str5);
            }
            String str6 = (String) linkedHashMap.get("label_type");
            if (str6 != null) {
                c2344009GkLIZLLL.LJFF("label_type", str6);
            }
            String str7 = (String) linkedHashMap.get("auction_status");
            if (str7 != null) {
                c2344009GkLIZLLL.LJFF("auction_status", str7);
            }
            if (map3 != null) {
                c2344009GkLIZLLL.LJII(map3);
            }
            C21206717yr.LIZ(c2344009GkLIZLLL);
            c2344009GkLIZLLL.LJII(C21206717yr.LIZJ());
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    c2344009GkLIZLLL.LJFF(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    c2344009GkLIZLLL.LJFF(entry2.getKey(), String.valueOf(entry2.getValue()));
                }
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Map<String, String> map4 = c2344009GkLIZLLL.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("livesdk_tiktokec_product_entrance_stay_time", map4);
        }
        PopupCardVO popupCardVO5 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO5 != null && (num = popupCardVO5.productType) != null && num.intValue() == 2) {
            C19509911Ur.LIZ.getClass();
            mapLIZIZ.put("step", "auction_card_close");
            C1421105hJ.LIZJ("tiktokec_rd_auction_step_event", mapLIZIZ);
        }
    }

    public final Map<String, String> LJIILIIL(String str) {
        PageFinder pageFinderVia;
        if (this.LIZ.LJJIJIIJI().LLILZIL == 0) {
            InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LLJILJIL;
            Context context = null;
            if (interfaceC21213717zz != null && interfaceC21213717zz.getContext() != null) {
                InterfaceC21213717zz interfaceC21213717zz2 = this.LIZ.LLJILJIL;
                if (interfaceC21213717zz2 != null) {
                    context = interfaceC21213717zz2.getContext();
                }
                pageFinderVia = C520170Kad.LIZ(context);
            } else {
                pageFinderVia = PageFinder.via(EnumC1733160vCc.LIVE_ROOM.getValue());
            }
        } else {
            pageFinderVia = PageFinder.via((View) this.LIZ.LJJIJIIJI().LLILZIL);
        }
        return C7936038c.LIZ(str, pageFinderVia);
    }

    public final void LJIILLIIL(Map<String, String> map) {
        Long lValueOf;
        String str;
        Long l;
        String strLIZ;
        String str2;
        AuctionData auctionData;
        AuctionData auctionData2;
        AuctionData auctionData3;
        String strLJJLIIIJ;
        PromotionInfo promotionInfo;
        List<PlacementLabel> list;
        Object obj;
        String string;
        PromotionInfo promotionInfo2;
        PromotionLabel promotionLabel;
        Map<String, Object> map2;
        Object obj2;
        String string2;
        if (map.isEmpty()) {
            PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
            ArrayList arrayList = new ArrayList();
            if (popupCardVO != null && (promotionInfo2 = popupCardVO.promotionInfo) != null && (promotionLabel = promotionInfo2.prelaunchPromotionLabel) != null && (map2 = promotionLabel.daInfo) != null && (obj2 = map2.get("activity_name")) != null && (string2 = obj2.toString()) != null && C123100dR.LIZ(string2)) {
                arrayList.add(string2);
            }
            ArrayList arrayList2 = new ArrayList();
            if (popupCardVO != null && (promotionInfo = popupCardVO.promotionInfo) != null && (list = promotionInfo.placementLabels) != null) {
                Iterator<PlacementLabel> it2 = list.iterator();
                while (it2.hasNext()) {
                    List<PromotionLabel> list2 = it2.next().placementLabelList;
                    if (list2 != null) {
                        Iterator<PromotionLabel> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Map<String, Object> map3 = it3.next().daInfo;
                            if (map3 != null && (obj = map3.get("activity_name")) != null && (string = obj.toString()) != null && C123100dR.LIZ(string)) {
                                arrayList2.add(string);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList3 = (ArrayList) C13LP.LJLIL(arrayList2, arrayList);
            if (arrayList3.isEmpty()) {
                strLJJLIIIJ = "";
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (C123100dR.LIZ((String) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
            }
            map.put("activity_name", strLJJLIIIJ);
        }
        Map<String, String> mapLJIILIIL = LJIILIIL("c7068.d5479");
        C21206717yr c21206717yr = C21206717yr.LIZ;
        AbstractC21194217wq abstractC21194217wq = this.LIZ;
        C1743900vTw c1743900vTw = abstractC21194217wq.LLJILJILJ;
        Room room = abstractC21194217wq.LLJILLL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        AbstractC21194217wq abstractC21194217wq2 = this.LIZ;
        Boolean bool = abstractC21194217wq2.LLJJIII;
        Map<String, String> map4 = abstractC21194217wq2.LLJJIJI;
        HashMap map5 = new HashMap();
        Map<String, String> map6 = this.LIZ.LLJJIJIIJIL;
        if (map6 != null) {
            map5.putAll(map6);
            map5.put("refer", "product_detail");
            map5.put("label", "user_othershow");
        }
        Map<String, String> map7 = this.LJI;
        PopupCardVO popupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO2 != null) {
            if (popupCardVO2.isSoldOut()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str = null;
        }
        PopupCardVO popupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        c21206717yr.getClass();
        C2344009Gk c2344009GkLIZLLL = C21206717yr.LIZLLL(c1743900vTw);
        c2344009GkLIZLLL.LJIIIIZZ("item_order", c1743900vTw.LIZJ("item_order"));
        if (c1743900vTw.LJFF("campaign_id")) {
            c2344009GkLIZLLL.LJFF("campaign_id", c1743900vTw.LIZJ("campaign_id"));
        }
        if (c1743900vTw.LJFF("campaign_type")) {
            c2344009GkLIZLLL.LJFF("campaign_type", c1743900vTw.LIZJ("campaign_type"));
        }
        if (c1743900vTw.LJFF("campaign_channel")) {
            c2344009GkLIZLLL.LJFF("campaign_channel", c1743900vTw.LIZJ("campaign_channel"));
        }
        if (c1743900vTw.LJFF("product_promotion_tag")) {
            c2344009GkLIZLLL.LJFF("product_promotion_tag", c1743900vTw.LIZJ("product_promotion_tag"));
        }
        if (c1743900vTw.LJFF("promotion_status_preheat")) {
            c2344009GkLIZLLL.LJFF("promotion_status_preheat", c1743900vTw.LIZJ("promotion_status_preheat"));
        }
        if (c1743900vTw.LJFF("promotion_status_launch")) {
            c2344009GkLIZLLL.LJFF("promotion_status_launch", c1743900vTw.LIZJ("promotion_status_launch"));
        }
        if (c1743900vTw.LJFF("title_label")) {
            c2344009GkLIZLLL.LJFF("title_label", c1743900vTw.LIZJ("title_label"));
        }
        if (c1743900vTw.LJFF("campaign_user_tag")) {
            c2344009GkLIZLLL.LJFF("campaign_user_tag", c1743900vTw.LIZJ("campaign_user_tag"));
        }
        if (c1743900vTw.LJFF("source_module")) {
            c2344009GkLIZLLL.LJFF("source_module", c1743900vTw.LIZJ("source_module"));
        }
        if (str != null) {
            c2344009GkLIZLLL.LJFF("is_sold_out", str);
        }
        String strLIZJ = c1743900vTw.LIZJ("is_hot");
        if (strLIZJ != null) {
            c2344009GkLIZLLL.LJFF("is_hot", strLIZJ);
        }
        String strLIZJ2 = c1743900vTw.LIZJ("hot_sell_number");
        if (strLIZJ2 != null) {
            c2344009GkLIZLLL.LJFF("hot_sell_number", strLIZJ2);
        }
        String strLIZJ3 = c1743900vTw.LIZJ("label_type");
        if (strLIZJ3 != null) {
            c2344009GkLIZLLL.LJFF("label_type", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw.LIZJ("creator_limit_type");
        if (strLIZJ4 != null) {
            c2344009GkLIZLLL.LJFF("creator_limit_type", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw.LIZJ("activity_id");
        if (strLIZJ5 != null) {
            c2344009GkLIZLLL.LJFF("activity_id", strLIZJ5);
        }
        String strLIZJ6 = c1743900vTw.LIZJ("activity_name");
        if (strLIZJ6 != null) {
            c2344009GkLIZLLL.LJFF("activity_name", strLIZJ6);
        }
        String strLIZJ7 = c1743900vTw.LIZJ("label_number");
        if (strLIZJ7 != null) {
            c2344009GkLIZLLL.LJFF("label_number", strLIZJ7);
        }
        String strLIZJ8 = c1743900vTw.LIZJ("source_page_type");
        if (strLIZJ8 != null) {
            c2344009GkLIZLLL.LJFF("source_page_type", strLIZJ8);
        }
        String strLIZJ9 = c1743900vTw.LIZJ("biz_type");
        if (strLIZJ9 != null) {
            c2344009GkLIZLLL.LJFF("biz_type", strLIZJ9);
        }
        String strLIZJ10 = c1743900vTw.LIZJ("currency");
        if (strLIZJ10 != null) {
            c2344009GkLIZLLL.LJFF("currency", strLIZJ10);
        }
        String strLIZJ11 = c1743900vTw.LIZJ("origin_price_value");
        if (strLIZJ11 != null) {
            c2344009GkLIZLLL.LJFF("origin_price_value", strLIZJ11);
        }
        String strLIZJ12 = c1743900vTw.LIZJ("sale_price_value");
        if (strLIZJ12 != null) {
            c2344009GkLIZLLL.LJFF("sale_price_value", strLIZJ12);
        }
        String strLIZJ13 = c1743900vTw.LIZJ("discount_percentage");
        if (strLIZJ13 != null) {
            c2344009GkLIZLLL.LJFF("discount_percentage", strLIZJ13);
        }
        if (popupCardVO3 != null && (auctionData3 = popupCardVO3.auctionData) != null) {
            l = auctionData3.auctionId;
        } else {
            l = null;
        }
        c2344009GkLIZLLL.LJ(l, "auction_id");
        if (popupCardVO3 != null && (auctionData2 = popupCardVO3.auctionData) != null && auctionData2.auctionStatus == 10) {
            c2344009GkLIZLLL.LJFF("label_type", "live_auction_ongoing");
        }
        String strLIZJ14 = c1743900vTw.LIZJ("ecom_live_rcmd_info");
        if (strLIZJ14 != null) {
            c2344009GkLIZLLL.LJFF("ecom_live_rcmd_info", strLIZJ14);
        }
        if (popupCardVO3 != null && (auctionData = popupCardVO3.auctionData) != null) {
            strLIZ = C19673811yC.LIZ(auctionData.auctionStatus);
        } else {
            strLIZ = null;
        }
        c2344009GkLIZLLL.LJFF("auction_status", strLIZ);
        if (map7 != null) {
            c2344009GkLIZLLL.LJII(map7);
        }
        c2344009GkLIZLLL.LJFF("general_rec_source_group_id", strValueOf);
        HashMap map8 = (HashMap) c1743900vTw.LIZIZ();
        if (map8 != null && (str2 = (String) map8.get("track_id")) != null) {
            c2344009GkLIZLLL.LJFF("general_rec_source_track_id", str2);
        }
        C21206717yr.LIZIZ(c2344009GkLIZLLL, c1743900vTw);
        C21206717yr.LIZ(c2344009GkLIZLLL);
        c2344009GkLIZLLL.LJII(map4);
        c2344009GkLIZLLL.LJII(map5);
        c2344009GkLIZLLL.LJII(C21206717yr.LIZJ());
        c2344009GkLIZLLL.LJII(map);
        c2344009GkLIZLLL.LJII(mapLJIILIIL);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map9 = c2344009GkLIZLLL.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_show", map9);
        C21206717yr.LJIIIIZZ(true, bool, "image", strValueOf, map4, null);
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIJJI(String str, String str2) {
        C212391189t.LIZ.getClass();
        C212391189t.LIZIZ("pin_product", str, str2);
    }

    public final void LJIIZILJ(PopupCardVO popupCardVO, boolean z) {
        int iIntValue;
        int i;
        int size;
        PopupCardVO popupCardVO2;
        PromotionInfo promotionInfo;
        String eventParamPromotionStatusLaunch;
        String str;
        String str2;
        String str3;
        Map<String, String> map;
        String str4;
        String string;
        String string2;
        boolean zBooleanValue;
        NextActionInfo nextActionInfo;
        Long l;
        Long lValueOf;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        long j;
        LiveDaInfo liveDaInfo;
        HashMap<String, String> map2;
        Map<String, String> map3;
        PromotionInfo promotionInfo2;
        String eventParamTitleLabel;
        PromotionInfo promotionInfo3;
        String eventParamPromotionStatusPreHeat;
        PromotionInfo promotionInfo4;
        String eventParamProductPromotionTag;
        PromotionView promotionView;
        int size2;
        PromotionView promotionView2;
        int size3;
        PromotionView promotionView3;
        int size4;
        PromotionView promotionView4;
        int size5;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        long j2;
        long j3;
        int i2;
        int i3;
        long j4;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo3;
        List<AtmosphereTag> list;
        List<String> list2;
        String str5;
        HashMap<String, Object> mapLJIIJ;
        Integer num;
        String str6;
        HashMap<String, Object> mapLJIIJ2;
        Long lValueOf2;
        int i4;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        Long lValueOf3 = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (LJIILJJIL()) {
            C21195617x4 c21195617x4 = this.LJIIIIZZ;
            if (c21195617x4 != null) {
                i4 = c21195617x4.LIZ;
            } else {
                i4 = 0;
            }
            C21195617x4 c21195617x42 = new C21195617x4(i4 + 1);
            this.LJIIIIZZ = c21195617x42;
            c21195617x42.LIZJ = System.currentTimeMillis();
        }
        if (popupCardVO.flashSaleAtmosphereInfo != null) {
            C21199917xl c21199917xl = C21199917xl.LIZ;
            Room room = this.LIZ.LLJILLL;
            if (room != null) {
                lValueOf2 = Long.valueOf(room.getId());
            } else {
                lValueOf2 = null;
            }
            C21200017xm c21200017xmLIZ = c21199917xl.LIZ(lValueOf2);
            if (c21200017xmLIZ != null && c21200017xmLIZ.LJFF) {
                c21200017xmLIZ.LJFF = false;
                c21200017xmLIZ.LIZJ.clear();
                c21200017xmLIZ.LIZIZ.clear();
            }
        }
        InterfaceC21200917xv interfaceC21200917xv = this.LIZIZ;
        if (interfaceC21200917xv != null) {
            interfaceC21200917xv.LIZIZ(z);
        }
        C1440005kM.LIZ(new C591940NJo(1, 300L, false));
        C1440005kM.LIZ(new C591940NJo(2, false));
        PopupCardVO popupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO3 != null && (str6 = popupCardVO3.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str6)) != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ2.entrySet()) {
                this.LIZ.LLJILJILJ.LJIIIIZZ(entry.getKey(), entry.getValue().toString(), false);
            }
        }
        AbstractC21194217wq abstractC21194217wq = this.LIZ;
        C1743900vTw c1743900vTw = abstractC21194217wq.LLJILJILJ;
        PopupCardVO popupCardVO4 = abstractC21194217wq.LJJIJIIJI().LL;
        if (popupCardVO4 != null) {
            lValueOf3 = Long.valueOf(popupCardVO4.productId);
        }
        c1743900vTw.LJIIIIZZ("product_id", String.valueOf(lValueOf3), false);
        AbstractC21194217wq abstractC21194217wq2 = this.LIZ;
        C1743900vTw c1743900vTw2 = abstractC21194217wq2.LLJILJILJ;
        PopupCardVO popupCardVO5 = abstractC21194217wq2.LJJIJIIJI().LL;
        int i5 = -1;
        if (popupCardVO5 != null && (num = popupCardVO5.bizType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1743900vTw2.LJI(iIntValue, "biz_type");
        AbstractC21194217wq abstractC21194217wq3 = this.LIZ;
        C1743900vTw c1743900vTw3 = abstractC21194217wq3.LLJILJILJ;
        PopupCardVO popupCardVO6 = abstractC21194217wq3.LJJIJIIJI().LL;
        if (popupCardVO6 != null) {
            i = popupCardVO6.platform;
        } else {
            i = -1;
        }
        c1743900vTw3.LJI(i, "product_source");
        AbstractC21194217wq abstractC21194217wq4 = this.LIZ;
        C1743900vTw c1743900vTw4 = abstractC21194217wq4.LLJILJILJ;
        PopupCardVO popupCardVO7 = abstractC21194217wq4.LJJIJIIJI().LL;
        if (popupCardVO7 != null) {
            i5 = popupCardVO7.sourceFrom;
        }
        c1743900vTw4.LJI(i5, "source_from");
        PopupCardVO popupCardVO8 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO8 != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("is_fans_price", popupCardVO8.hasFansPrice(), false);
        }
        PopupCardVO popupCardVO9 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO9 != null) {
            this.LIZ.LLJILJILJ.LJI(popupCardVO9.bagIndex, "item_order");
        }
        PopupCardVO popupCardVO10 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO10 != null && (str5 = popupCardVO10.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str5)) != null) {
            Object obj = mapLJIIJ.get("currency");
            if (obj != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("currency", obj.toString(), false);
            }
            Object obj2 = mapLJIIJ.get("sale_price_value");
            if (obj2 != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("sale_price_value", obj2.toString(), false);
            }
            Object obj3 = mapLJIIJ.get("origin_price_value");
            if (obj3 != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("origin_price_value", obj3.toString(), false);
            }
            Object obj4 = mapLJIIJ.get("discount_percentage");
            if (obj4 != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("discount_percentage", obj4.toString(), false);
            }
        }
        AbstractC21194217wq abstractC21194217wq5 = this.LIZ;
        C1743900vTw c1743900vTw5 = abstractC21194217wq5.LLJILJILJ;
        PopupCardVO popupCardVO11 = abstractC21194217wq5.LJJIJIIJI().LL;
        if (popupCardVO11 != null && (list2 = popupCardVO11.skuIds) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        c1743900vTw5.LJI(size, "saleable_sku_num");
        LJIIL();
        PopupCardVO popupCardVO12 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO12 != null && (list = popupCardVO12.atmosphereTags) != null) {
            ArrayList arrayList = new ArrayList();
            for (AtmosphereTag atmosphereTag : list) {
                if (atmosphereTag.tagType == 4) {
                    arrayList.add(atmosphereTag);
                }
            }
            if (!arrayList.isEmpty()) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("label_type", "xxx_sold", false);
                this.LIZ.LLJILJILJ.LJII(((AtmosphereTag) ListProtector.get(arrayList, 0)).count, "label_number");
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (AtmosphereTag atmosphereTag2 : list) {
                    if (atmosphereTag2.tagType == 1) {
                        arrayList2.add(atmosphereTag2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    this.LIZ.LLJILJILJ.LJIIIIZZ("label_type", "hot", false);
                    this.LIZ.LLJILJILJ.LJII(((AtmosphereTag) ListProtector.get(arrayList2, 0)).count, "label_number");
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (AtmosphereTag atmosphereTag3 : list) {
                        if (atmosphereTag3.tagType == 2) {
                            arrayList3.add(atmosphereTag3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        this.LIZ.LLJILJILJ.LJIIIIZZ("label_type", "onlyleft", false);
                        this.LIZ.LLJILJILJ.LJII(((AtmosphereTag) ListProtector.get(arrayList3, 0)).count, "label_number");
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (AtmosphereTag atmosphereTag4 : list) {
                            if (atmosphereTag4.tagType == 3) {
                                arrayList4.add(atmosphereTag4);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            this.LIZ.LLJILJILJ.LJIIIIZZ("label_type", "top_sales", false);
                            this.LIZ.LLJILJILJ.LJII(((AtmosphereTag) ListProtector.get(arrayList4, 0)).count, "label_number");
                        }
                    }
                }
            }
        }
        PopupCardVO popupCardVO13 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO13 != null && (flashSaleAtmosphereInfo = popupCardVO13.flashSaleAtmosphereInfo) != null) {
            PopupCardVO popupCardVO14 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO14 != null) {
                j2 = popupCardVO14.serverTime;
            } else {
                j2 = 0;
            }
            PopupCardVO popupCardVO15 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO15 != null) {
                j3 = popupCardVO15.showAtmosphereBeginMilliSecond;
            } else {
                j3 = 0;
            }
            PopupCardVO popupCardVO16 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO16 != null) {
                i2 = popupCardVO16.flashSaleStockLimit;
            } else {
                i2 = 0;
            }
            String strLIZ = C21206417yo.LIZ(flashSaleAtmosphereInfo, j2, j3, i2);
            if (strLIZ != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("label_type", strLIZ, false);
                AbstractC21194217wq abstractC21194217wq6 = this.LIZ;
                C1743900vTw c1743900vTw6 = abstractC21194217wq6.LLJILJILJ;
                PopupCardVO popupCardVO17 = abstractC21194217wq6.LJJIJIIJI().LL;
                if (popupCardVO17 != null && (flashSaleAtmosphereInfo3 = popupCardVO17.flashSaleAtmosphereInfo) != null) {
                    i3 = flashSaleAtmosphereInfo3.creatorLimitType;
                } else {
                    i3 = 0;
                }
                c1743900vTw6.LJI(i3, "creator_limit_type");
                AbstractC21194217wq abstractC21194217wq7 = this.LIZ;
                C1743900vTw c1743900vTw7 = abstractC21194217wq7.LLJILJILJ;
                PopupCardVO popupCardVO18 = abstractC21194217wq7.LJJIJIIJI().LL;
                if (popupCardVO18 != null && (flashSaleAtmosphereInfo2 = popupCardVO18.flashSaleAtmosphereInfo) != null) {
                    j4 = flashSaleAtmosphereInfo2.activityId;
                } else {
                    j4 = 0;
                }
                c1743900vTw7.LJII(j4, "activity_id");
                this.LIZ.LLJILJILJ.LJIIIIZZ("label_number", "-1", false);
            }
        }
        PopupCardVO popupCardVO19 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO19 != null && (promotionView4 = popupCardVO19.promotionView) != null) {
            List<PromotionItem> promotion_items = promotionView4.getPromotion_items();
            if (promotion_items != null) {
                size5 = promotion_items.size();
            } else {
                size5 = 0;
            }
            String strLIZ2 = C1744000vU6.LIZ(promotionView4, "campaign_id", size5);
            if (strLIZ2 != null && strLIZ2.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_id", strLIZ2, false);
            }
        }
        PopupCardVO popupCardVO20 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO20 != null && (promotionView3 = popupCardVO20.promotionView) != null) {
            List<PromotionItem> promotion_items2 = promotionView3.getPromotion_items();
            if (promotion_items2 != null) {
                size4 = promotion_items2.size();
            } else {
                size4 = 0;
            }
            String strLIZ3 = C1744000vU6.LIZ(promotionView3, "campaign_channel", size4);
            if (strLIZ3 != null && strLIZ3.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_channel", strLIZ3, false);
            }
        }
        PopupCardVO popupCardVO21 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO21 != null && (promotionView2 = popupCardVO21.promotionView) != null) {
            List<PromotionItem> promotion_items3 = promotionView2.getPromotion_items();
            if (promotion_items3 != null) {
                size3 = promotion_items3.size();
            } else {
                size3 = 0;
            }
            String strLIZ4 = C1744000vU6.LIZ(promotionView2, "campaign_user_tag", size3);
            if (strLIZ4 != null && strLIZ4.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_user_tag", strLIZ4, false);
            }
        }
        PopupCardVO popupCardVO22 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO22 != null && (promotionView = popupCardVO22.promotionView) != null) {
            List<PromotionItem> promotion_items4 = promotionView.getPromotion_items();
            if (promotion_items4 != null) {
                size2 = promotion_items4.size();
            } else {
                size2 = 0;
            }
            String strLIZ5 = C1744000vU6.LIZ(promotionView, "campaign_type", size2);
            if (strLIZ5 != null && strLIZ5.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_type", strLIZ5, false);
            }
        }
        PopupCardVO popupCardVO23 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO23 != null && (promotionInfo4 = popupCardVO23.promotionInfo) != null && (eventParamProductPromotionTag = promotionInfo4.getEventParamProductPromotionTag(false, false)) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("product_promotion_tag", eventParamProductPromotionTag, false);
        }
        PopupCardVO popupCardVO24 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO24 != null && (promotionInfo3 = popupCardVO24.promotionInfo) != null && (eventParamPromotionStatusPreHeat = promotionInfo3.getEventParamPromotionStatusPreHeat()) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("promotion_status_preheat", eventParamPromotionStatusPreHeat, false);
        }
        String strLIZJ = this.LIZ.LLJILJILJ.LIZJ("promotion_status_preheat");
        if ((strLIZJ == null || strLIZJ.length() == 0) && (popupCardVO2 = this.LIZ.LJJIJIIJI().LL) != null && (promotionInfo = popupCardVO2.promotionInfo) != null && (eventParamPromotionStatusLaunch = promotionInfo.getEventParamPromotionStatusLaunch()) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("promotion_status_launch", eventParamPromotionStatusLaunch, false);
        }
        PopupCardVO popupCardVO25 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO25 != null && (promotionInfo2 = popupCardVO25.promotionInfo) != null && (eventParamTitleLabel = promotionInfo2.getEventParamTitleLabel()) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("title_label", eventParamTitleLabel, false);
        }
        AbstractC21194217wq abstractC21194217wq8 = this.LIZ;
        C1743900vTw c1743900vTw8 = abstractC21194217wq8.LLJILJILJ;
        PopupCardVO popupCardVO26 = abstractC21194217wq8.LJJIJIIJI().LL;
        if (popupCardVO26 != null) {
            str = popupCardVO26.source;
        } else {
            str = null;
        }
        c1743900vTw8.LJIIIIZZ("source", str, true);
        this.LIZ.LLJILJILJ.LJII(System.currentTimeMillis(), "start_time");
        AbstractC21194217wq abstractC21194217wq9 = this.LIZ;
        C1743900vTw c1743900vTw9 = abstractC21194217wq9.LLJILJILJ;
        PopupCardVO popupCardVO27 = abstractC21194217wq9.LJJIJIIJI().LL;
        if (popupCardVO27 != null && (map3 = popupCardVO27.extra) != null) {
            str2 = map3.get("mix_product_type");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            PopupCardVO popupCardVO28 = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO28 != null && (map = popupCardVO28.extra) != null) {
                str3 = map.get("mix_product_type");
            } else {
                str3 = null;
            }
        }
        c1743900vTw9.LJIIIIZZ("is_mix_product", str3, false);
        HashMap map4 = (HashMap) this.LIZ.LLJILJILJ.LIZIZ();
        if (map4 == null || (str4 = (String) map4.get("request_id")) == null) {
            str4 = "";
        }
        Room room2 = this.LIZ.LLJILLL;
        if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
            string = "";
        }
        PopupCardVO popupCardVO29 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO29 == null || (string2 = Long.valueOf(popupCardVO29.productId).toString()) == null) {
            string2 = "";
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("track_id", C03RE.LIZ(str4, string, string2), false);
        this.LIZ.LLJILJILJ.LJIIIIZZ("room_id", string, false);
        if (!C2093608Ic.LJ(str4)) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("request_id", str4, false);
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("product_id", string2, false);
        ((LinkedHashMap) this.LJI).clear();
        PopupCardVO popupCardVO30 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO30 != null && (liveDaInfo = popupCardVO30.commonDaInfo) != null && (map2 = liveDaInfo.logoDaInfo) != null) {
            this.LJI.putAll(map2);
        }
        ((LinkedHashMap) this.LJIIJJI).clear();
        Map<String, String> mapLIZIZ = LIZIZ();
        Map<String, String> map5 = this.LJIIJJI;
        C21206717yr c21206717yr = C21206717yr.LIZ;
        AbstractC21194217wq abstractC21194217wq10 = this.LIZ;
        C1743900vTw c1743900vTw10 = abstractC21194217wq10.LLJILJILJ;
        Map<String, String> map6 = abstractC21194217wq10.LLJJIJI;
        HashMap map7 = new HashMap();
        Map<String, String> map8 = this.LIZ.LLJJIJIIJIL;
        if (map8 != null) {
            map7.putAll(map8);
            map7.put("refer", "image");
            map7.put("label", "user_othershow");
        }
        PopupCardVO popupCardVO31 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO31 != null) {
            map7.put("card_title", popupCardVO31.title);
            map7.put("card_title_length", String.valueOf(popupCardVO31.title.length()));
        }
        Boolean bool = this.LIZ.LLLJL;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        c21206717yr.getClass();
        C2344009Gk c2344009GkLIZLLL = C21206717yr.LIZLLL(c1743900vTw10);
        c2344009GkLIZLLL.LJIIIIZZ("item_order", c1743900vTw10.LIZJ("item_order"));
        if (c1743900vTw10.LJFF("campaign_id")) {
            c2344009GkLIZLLL.LJFF("campaign_id", c1743900vTw10.LIZJ("campaign_id"));
        }
        if (c1743900vTw10.LJFF("campaign_type")) {
            c2344009GkLIZLLL.LJFF("campaign_type", c1743900vTw10.LIZJ("campaign_type"));
        }
        if (c1743900vTw10.LJFF("campaign_channel")) {
            c2344009GkLIZLLL.LJFF("campaign_channel", c1743900vTw10.LIZJ("campaign_channel"));
        }
        if (c1743900vTw10.LJFF("campaign_user_tag")) {
            c2344009GkLIZLLL.LJFF("campaign_user_tag", c1743900vTw10.LIZJ("campaign_user_tag"));
        }
        if (c1743900vTw10.LJFF("shopping_status")) {
            c2344009GkLIZLLL.LJFF("shopping_status", c1743900vTw10.LIZJ("shopping_status"));
        }
        if (c1743900vTw10.LJFF("isFirst")) {
            c2344009GkLIZLLL.LJFF("is_first", c1743900vTw10.LIZJ("isFirst"));
        }
        if (c1743900vTw10.LJFF("source_page_type")) {
            c2344009GkLIZLLL.LJFF("source_page_type", c1743900vTw10.LIZJ("source_page_type"));
        }
        if (c1743900vTw10.LJFF("api_end_time")) {
            String strLIZJ2 = c1743900vTw10.LIZJ("api_end_time");
            if (strLIZJ2 != null) {
                j = CastLongProtector.parseLong(strLIZJ2);
            } else {
                j = 0;
            }
            c2344009GkLIZLLL.LIZLLL(System.currentTimeMillis() - j, "duration");
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            c2344009GkLIZLLL.LJFF("user_type", "moderator");
            String strLIZJ3 = c1743900vTw10.LIZJ("author_id");
            if (strLIZJ3 == null) {
                strLIZJ3 = "";
            }
            c2344009GkLIZLLL.LJFF("moderator_id", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw10.LIZJ("is_hot");
        if (strLIZJ4 != null) {
            c2344009GkLIZLLL.LJFF("is_hot", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw10.LIZJ("hot_sell_number");
        if (strLIZJ5 != null) {
            c2344009GkLIZLLL.LJFF("hot_sell_number", strLIZJ5);
        }
        String strLIZJ6 = c1743900vTw10.LIZJ("label_type");
        if (strLIZJ6 != null) {
            c2344009GkLIZLLL.LJFF("label_type", strLIZJ6);
        }
        String strLIZJ7 = c1743900vTw10.LIZJ("creator_limit_type");
        if (strLIZJ7 != null) {
            c2344009GkLIZLLL.LJFF("creator_limit_type", strLIZJ7);
        }
        String strLIZJ8 = c1743900vTw10.LIZJ("activity_id");
        if (strLIZJ8 != null) {
            c2344009GkLIZLLL.LJFF("activity_id", strLIZJ8);
        }
        String strLIZJ9 = c1743900vTw10.LIZJ("label_number");
        if (strLIZJ9 != null) {
            c2344009GkLIZLLL.LJFF("label_number", strLIZJ9);
        }
        String strLIZJ10 = c1743900vTw10.LIZJ("biz_type");
        if (strLIZJ10 != null) {
            c2344009GkLIZLLL.LJFF("biz_type", strLIZJ10);
        }
        C21206717yr.LIZ(c2344009GkLIZLLL);
        c2344009GkLIZLLL.LJII(map6);
        c2344009GkLIZLLL.LJII(map7);
        c2344009GkLIZLLL.LJII(C21206717yr.LIZJ());
        c2344009GkLIZLLL.LJII(mapLIZIZ);
        map5.putAll(C19719512Dh.LIZJ(c2344009GkLIZLLL.LIZ));
        if (this.LIZ.LJJIIZI()) {
            HashMap map9 = new HashMap();
            Map<String, String> map10 = this.LIZ.LLJJIJI;
            if (map10 != null) {
                map9.putAll(map10);
            }
            map9.put("refer", "product_detail");
            HashMap map11 = new HashMap();
            Room room3 = this.LIZ.LLJILLL;
            if (room3 != null) {
                lValueOf = Long.valueOf(room3.getId());
            } else {
                lValueOf = null;
            }
            map11.put("room_id", String.valueOf(lValueOf));
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && interfaceC20673515v3K4.LJLIL() != null) {
                C0IXW.LIZ("live_ad", "othershow", map9, map11);
            }
        }
        PopupCardVO popupCardVO32 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO32 != null && popupCardVO32.cardType == 1) {
            if (this.LIZ.LJJIJIIJI().LLILZIL == 0) {
                C786410Ut5.LJLIIL(300L, C612310Nzx.LIZ, new ARunnableS78S0200000_9(this, mapLIZIZ, 108));
            } else {
                LJIILLIIL(mapLIZIZ);
            }
        }
        AbstractC21194217wq abstractC21194217wq11 = this.LIZ;
        PopupCardVO popupCardVO33 = abstractC21194217wq11.LJJIJIIJI().LL;
        if (popupCardVO33 != null && (nextActionInfo = popupCardVO33.nextActionInfo) != null && (l = nextActionInfo.currentShowTimeMs) != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                AnonymousClass0956 anonymousClass09562 = abstractC21194217wq11.LLLIIIL;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                abstractC21194217wq11.LLLIIIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21182317uv(jLongValue, abstractC21194217wq11, null), 3);
            }
        }
    }

    public C21199817xk(AbstractC21194217wq abstractC21194217wq, InterfaceC21200917xv interfaceC21200917xv, C21194817ww c21194817ww) {
        super(abstractC21194217wq, interfaceC21200917xv, c21194817ww);
        this.LJFF = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(309));
        this.LJI = new LinkedHashMap();
        this.LJII = true;
        this.LJIIJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(310));
        this.LJIIJJI = new LinkedHashMap();
    }

    @Override // X.AbstractC21196217xA
    public final void LJ(PopProductResp popProductResp, boolean z, boolean z2, boolean z3) {
        Long lValueOf;
        LJIILL();
        PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO != null) {
            Boolean boolValueOf = this.LJIIIZ;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(z2);
            }
            this.LJIIIZ = boolValueOf;
            if (z && !LJIILJJIL()) {
                AbstractC21194217wq abstractC21194217wq = this.LIZ;
                PopupCardVO popupCardVO2 = abstractC21194217wq.LJJIJIIJI().LL;
                if (popupCardVO2 != null) {
                    lValueOf = Long.valueOf(popupCardVO2.productId);
                } else {
                    lValueOf = null;
                }
                abstractC21194217wq.LJJJJLL(lValueOf, z2);
            }
            LJIIZILJ(popupCardVO, z3);
        }
    }
}
