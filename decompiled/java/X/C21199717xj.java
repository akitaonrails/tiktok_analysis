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
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
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
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.ExtendAuctionCfg;

/* JADX INFO: renamed from: X.17xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199717xj extends AbstractC21196817xG {
    public AnonymousClass0956 LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;
    public final Map<String, String> LJI;
    public boolean LJII;
    public C21195517x3 LJIIIIZZ;
    public Boolean LJIIIZ;
    public final C01GW LJIIJ;
    public final Map<String, String> LJIIJJI;

    @Override // X.AbstractC21196817xG
    public final void LIZ() {
    }

    @Override // X.AbstractC21196817xG
    public final void LIZLLL() {
        this.LIZIZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC21196817xG
    public final void LJI() {
        UsPopupCardVO usPopupCardVO;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("redisplayCard isCancelled = ");
        sbLIZ.append(this.LIZ.LJJIJIIJI().LLILZ);
        sbLIZ.append(", productId = ");
        UsPopupCardVO usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        sbLIZ.append(usPopupCardVO2 != null ? Long.valueOf(usPopupCardVO2.productId) : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (this.LIZ.LJJIJIIJI().LLILZ || (usPopupCardVO = this.LIZ.LJJIJIIJI().LL) == null) {
            return;
        }
        this.LIZ.LJJIJIIJI().LJJIJIL(usPopupCardVO, this.LIZ.LJJIZ());
        LJIIZILJ(usPopupCardVO, false);
    }

    @Override // X.AbstractC21196817xG
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
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope2, null, null, new C591910NJl(null), 3);
            }
            this.LIZLLL = anonymousClass0956LIZLLL;
            return;
        }
        if (((Number) this.LJFF.getValue()).intValue() <= 0 || !C21206517yp.LIZJ()) {
            return;
        }
        InterfaceC21213717zz interfaceC21213717zz2 = this.LIZ.LLJILJIL;
        if (interfaceC21213717zz2 != null && (lifecycleOwner = interfaceC21213717zz2.getLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C591900NJk(this, null), 3);
        }
        this.LIZLLL = anonymousClass0956LIZLLL;
    }

    public final boolean LJIILJJIL() {
        return ((Boolean) this.LJIIJ.getValue()).booleanValue();
    }

    public final void LJIILL() {
        if (this.LJ) {
            return;
        }
        this.LIZ.LJJIJIIJI().LLJI = new AwS646S0100000_32(this, 28);
        this.LIZ.LJJIJIIJI().LLJ = new AwS681S0100000_32(this, 32);
        this.LIZ.LJJIJIIJI().LLJILJIL = new AwS576S0100000_32(this, 785);
        this.LIZ.LJJIJIIJI().LLJILJILJ = new AwS611S0100000_32(this, 352);
        this.LIZ.LJJIJIIJI().LLJIJIL = new AwS646S0100000_32(this, 29);
        this.LJ = true;
    }

    @Override // X.AbstractC21196817xG
    public final void LJII() {
        Map<String, String> mapLIZJ = LIZJ();
        if (C21194017wo.LIZIZ(this.LIZ.LJJIJIIJI().LL)) {
            return;
        }
        C21206617yq c21206617yq = C21206617yq.LIZ;
        AbstractC21194117wp abstractC21194117wp = this.LIZ;
        C1743900vTw c1743900vTw = abstractC21194117wp.LLJILJILJ;
        Map<String, String> map = abstractC21194117wp.LLJJIJI;
        HashMap map2 = new HashMap();
        Map<String, String> map3 = this.LIZ.LLJJIJIIJIL;
        if (map3 != null) {
            map2.putAll(map3);
            map2.put("refer", "image");
            map2.put("label", "user_othershow");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZJ;
        String str = (String) linkedHashMap.get("flashsale_status");
        String str2 = (String) linkedHashMap.get("countdown_type");
        c21206617yq.getClass();
        C2344009Gk c2344009GkLJ = C21206617yq.LJ(c1743900vTw);
        c2344009GkLJ.LJIIIIZZ("item_order", c1743900vTw.LIZJ("item_order"));
        if (c1743900vTw.LJFF("campaign_id")) {
            c2344009GkLJ.LJFF("campaign_id", c1743900vTw.LIZJ("campaign_id"));
        }
        if (c1743900vTw.LJFF("campaign_type")) {
            c2344009GkLJ.LJFF("campaign_type", c1743900vTw.LIZJ("campaign_type"));
        }
        if (c1743900vTw.LJFF("campaign_channel")) {
            c2344009GkLJ.LJFF("campaign_channel", c1743900vTw.LIZJ("campaign_channel"));
        }
        if (c1743900vTw.LJFF("campaign_user_tag")) {
            c2344009GkLJ.LJFF("campaign_user_tag", c1743900vTw.LIZJ("campaign_user_tag"));
        }
        if (str != null) {
            c2344009GkLJ.LJFF("flashsale_status", str);
        }
        if (str2 != null) {
            c2344009GkLJ.LJFF("countdown_type", str2);
        }
        C21206617yq.LIZ(c2344009GkLJ);
        c2344009GkLJ.LJII(map);
        c2344009GkLJ.LJII(map2);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map4 = c2344009GkLJ.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_popupcard_show", map4);
    }

    @Override // X.AbstractC21196817xG
    public final void LJIIIZ() {
        Map<String, String> mapLIZJ = LIZJ();
        C21206617yq c21206617yq = C21206617yq.LIZ;
        AbstractC21194117wp abstractC21194117wp = this.LIZ;
        Map<String, String> map = abstractC21194117wp.LLJJIJI;
        C1743900vTw c1743900vTw = abstractC21194117wp.LLJILJILJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZJ;
        String str = (String) linkedHashMap.get("flashsale_status");
        String str2 = (String) linkedHashMap.get("countdown_type");
        c21206617yq.getClass();
        C2344009Gk c2344009GkLJ = C21206617yq.LJ(c1743900vTw);
        c2344009GkLJ.LJIIIIZZ("stay_time", c1743900vTw.LIZJ("stay_time"));
        c2344009GkLJ.LJIIIIZZ("quit_type", c1743900vTw.LIZJ("quit_type"));
        if (str != null) {
            c2344009GkLJ.LJFF("flashsale_status", str);
        }
        if (str2 != null) {
            c2344009GkLJ.LJFF("countdown_type", str2);
        }
        if (map != null) {
            c2344009GkLJ.LJII(map);
        }
        C21206617yq.LIZ(c2344009GkLJ);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map2 = c2344009GkLJ.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_popupcard_staytime", map2);
    }

    @Override // X.AbstractC21196817xG
    public final void LIZIZ(String str) {
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
            this.LIZ.LJJIJIIJI().LJJIJL(str);
            InterfaceC21201017xw interfaceC21201017xw = this.LIZIZ;
            if (interfaceC21201017xw != null) {
                interfaceC21201017xw.LIZJ();
            }
            LJIIJ();
            this.LIZ.LJJJLZIJ(str);
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
        this.LIZ.LLJZIJLIL.removeMessages(0);
        this.LIZ.LJJIJIIJI().LJIJJLI(str);
        if (Intrinsics.LJFF(str, "unpin")) {
            Room room2 = this.LIZ.LLJILLL;
            if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String strLJJIJ = AbstractC21194117wp.LJJIJ();
            String roleStr = EnumC21196517xD.AUDIENCE.getRoleStr();
            UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO == null || (string2 = Long.valueOf(usPopupCardVO.productId).toString()) == null) {
                string2 = "";
            }
            C21198317xV.LIZJ(string, strLJJIJ, roleStr, string2);
        }
        List<C1556460qbc> list = C1563970qnj.LIZ;
        C1563970qnj.LJ(new AwS108S1000000_24("acting_area_bottom", 3));
        C1563970qnj.LJ(new AwS108S1000000_24("acting_area", 3));
    }

    @Override // X.AbstractC21196817xG
    public final void LJ(OecInitData oecInitData) {
        Boolean boolValueOf;
        UsPopupCardVO usPopupCardVO;
        CommerceStruct commerceStruct;
        LJIILL();
        Room room = this.LIZ.LLJILLL;
        Long lValueOf = null;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null) {
            boolValueOf = Boolean.valueOf(commerceStruct.asyncLoad);
        } else {
            boolValueOf = null;
        }
        if (C21194717wv.LIZ(oecInitData, boolValueOf) && (usPopupCardVO = this.LIZ.LJJIJIIJI().LL) != null) {
            Boolean bool = this.LJIIIZ;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            this.LJIIIZ = bool;
            LJIIZILJ(usPopupCardVO, true);
            if (!LJIILJJIL() && !C21194017wo.LIZIZ(usPopupCardVO)) {
                AbstractC21194117wp abstractC21194117wp = this.LIZ;
                UsPopupCardVO usPopupCardVO2 = abstractC21194117wp.LJJIJIIJI().LL;
                if (usPopupCardVO2 != null) {
                    lValueOf = Long.valueOf(usPopupCardVO2.productId);
                }
                abstractC21194117wp.LJJJLIIL(lValueOf, false);
            }
        }
    }

    @Override // X.AbstractC21196817xG
    public final void LJIIIIZZ(String str) {
        boolean z;
        Map<String, ? extends Object> map;
        LiveDaInfo liveDaInfo;
        Map<String, ? extends Object> map2;
        LiveDaInfo liveDaInfo2;
        Map<String, String> mapLIZJ = LIZJ();
        C19516311Xd c19516311Xd = C19516311Xd.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c19516311Xd.getClass();
        C19516311Xd.LIZLLL = jElapsedRealtime;
        UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO != null && usPopupCardVO.cardType == 99) {
            z = true;
        } else {
            z = false;
        }
        HashMap<String, String> map3 = null;
        if (z) {
            C21198117xT.LIZ.getClass();
            C21198117xT.LIZIZ("auction_card_close", mapLIZJ);
            if (C21194017wo.LIZIZ(this.LIZ.LJJIJIIJI().LL)) {
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = new kotlin.Pair("quit_type", str);
                String strLIZJ = this.LIZ.LLJILJILJ.LIZJ("stay_time");
                if (strLIZJ == null) {
                    strLIZJ = "-1";
                }
                pairArr[1] = new kotlin.Pair("stay_time", strLIZJ);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                if (iEventCenter != null) {
                    iEventCenter.LIZ("ec_lynx_card_send_stay_time", C1741890vQh.LJIIIIZZ(mapLJIIJ));
                    return;
                }
                return;
            }
            C21206617yq c21206617yq = C21206617yq.LIZ;
            AbstractC21194117wp abstractC21194117wp = this.LIZ;
            Map<String, String> map4 = abstractC21194117wp.LLJJIJI;
            C1743900vTw c1743900vTw = abstractC21194117wp.LLJILJILJ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZJ;
            String str2 = (String) linkedHashMap.get("flashsale_status");
            String str3 = (String) linkedHashMap.get("countdown_type");
            String str4 = (String) linkedHashMap.get("product_id");
            UsPopupCardVO usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO2 != null) {
                map2 = usPopupCardVO2.coverComponentDaInfo;
            } else {
                map2 = null;
            }
            UsPopupCardVO usPopupCardVO3 = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO3 != null && (liveDaInfo2 = usPopupCardVO3.commonDaInfo) != null) {
                map3 = liveDaInfo2.transDaInfo;
            }
            c21206617yq.getClass();
            C21206617yq.LJFF(map4, c1743900vTw, str2, str3, str4, map2, map3, mapLIZJ);
            return;
        }
        C21206617yq c21206617yq2 = C21206617yq.LIZ;
        AbstractC21194117wp abstractC21194117wp2 = this.LIZ;
        Map<String, String> map5 = abstractC21194117wp2.LLJJIJI;
        C1743900vTw c1743900vTw2 = abstractC21194117wp2.LLJILJILJ;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapLIZJ;
        String str5 = (String) linkedHashMap2.get("flashsale_status");
        String str6 = (String) linkedHashMap2.get("countdown_type");
        String str7 = (String) linkedHashMap2.get("product_id");
        UsPopupCardVO usPopupCardVO4 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO4 != null) {
            map = usPopupCardVO4.coverComponentDaInfo;
        } else {
            map = null;
        }
        UsPopupCardVO usPopupCardVO5 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO5 != null && (liveDaInfo = usPopupCardVO5.commonDaInfo) != null) {
            map3 = liveDaInfo.transDaInfo;
        }
        c21206617yq2.getClass();
        C21206617yq.LJFF(map5, c1743900vTw2, str5, str6, str7, map, map3, mapLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[PHI: r6
      0x007a: PHI (r6v2 java.lang.Long) = (r6v1 java.lang.Long), (r6v4 java.lang.Long) binds: [B:33:0x0079, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(boolean r10) {
        /*
            r9 = this;
            X.17wp r0 = r9.LIZ
            X.17xX r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r5 = r0.LL
            r7 = 0
            if (r5 == 0) goto L7d
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r0 = r5.pinCardConfig
            if (r0 == 0) goto L7d
            long r1 = r0.displayDurationAfterActivityFinish
        L12:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L6c
            if (r5 == 0) goto L79
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r0 = r5.pinCardConfig
            if (r0 == 0) goto L79
            long r0 = r0.displayDurationAfterActivityFinish
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L23:
            if (r6 == 0) goto L7a
            long r1 = r6.longValue()
        L29:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L4b
            X.17wp r0 = r9.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLJZIJLIL
            r0.removeMessages(r3)
            if (r6 == 0) goto L4a
            long r1 = r6.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4a
            long r1 = r6.longValue()
            X.17wp r0 = r9.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLJZIJLIL
            X.C786410Ut5.LJLJJI(r3, r1, r0)
        L4a:
            return
        L4b:
            if (r10 == 0) goto L4a
            X.17wp r0 = r9.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLJZIJLIL
            r0.removeMessages(r3)
            X.17wp r0 = r9.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r0.LLJZIJLIL
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.PinCardStyleConfig r1 = X.C21196617xE.LIZ()
            if (r5 == 0) goto L64
            int r0 = r5.cardType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L64:
            long r0 = r1.LIZIZ(r4)
            X.C786410Ut5.LJLJJI(r3, r0, r2)
            return
        L6c:
            if (r5 == 0) goto L79
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r0 = r5.pinCardConfig
            if (r0 == 0) goto L79
            long r0 = r0.displayDurationMs
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            goto L23
        L79:
            r6 = r4
        L7a:
            r1 = 0
            goto L29
        L7d:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21199717xj.LJIIL(boolean):void");
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
        String strLIZJ;
        String strLIZ;
        String strLIZIZ;
        long jLongValue;
        Map<String, Object> map2;
        AuctionData auctionData;
        SurpriseSetData surpriseSetData;
        Long l2;
        AuctionData auctionData2;
        SurpriseSetData surpriseSetData2;
        Long l3;
        AuctionData auctionData3;
        AuctionData auctionData4;
        AuctionData auctionData5;
        AuctionData auctionData6;
        ExtendAuctionCfg extendAuctionCfg;
        AuctionData auctionData7;
        String strLJJLIIIJ;
        PromotionInfo promotionInfo;
        List<PlacementLabel> list;
        Object obj;
        String string;
        PromotionInfo promotionInfo2;
        PromotionLabel promotionLabel;
        Map<String, Object> map3;
        Object obj2;
        String string2;
        String str2 = "";
        if (map.isEmpty()) {
            UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
            ArrayList arrayList = new ArrayList();
            if (usPopupCardVO != null && (promotionInfo2 = usPopupCardVO.promotionInfo) != null && (promotionLabel = promotionInfo2.prelaunchPromotionLabel) != null && (map3 = promotionLabel.daInfo) != null && (obj2 = map3.get("activity_name")) != null && (string2 = obj2.toString()) != null && C123100dR.LIZ(string2)) {
                arrayList.add(string2);
            }
            ArrayList arrayList2 = new ArrayList();
            if (usPopupCardVO != null && (promotionInfo = usPopupCardVO.promotionInfo) != null && (list = promotionInfo.placementLabels) != null) {
                Iterator<PlacementLabel> it2 = list.iterator();
                while (it2.hasNext()) {
                    List<PromotionLabel> list2 = it2.next().placementLabelList;
                    if (list2 != null) {
                        Iterator<PromotionLabel> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Map<String, Object> map4 = it3.next().daInfo;
                            if (map4 != null && (obj = map4.get("activity_name")) != null && (string = obj.toString()) != null && C123100dR.LIZ(string)) {
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
        C21206617yq c21206617yq = C21206617yq.LIZ;
        AbstractC21194117wp abstractC21194117wp = this.LIZ;
        C1743900vTw c1743900vTw = abstractC21194117wp.LLJILJILJ;
        Room room = abstractC21194117wp.LLJILLL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        AbstractC21194117wp abstractC21194117wp2 = this.LIZ;
        Boolean bool = abstractC21194117wp2.LLJJIII;
        Map<String, String> map5 = abstractC21194117wp2.LLJJIJI;
        HashMap map6 = new HashMap();
        Map<String, String> map7 = this.LIZ.LLJJIJIIJIL;
        if (map7 != null) {
            map6.putAll(map7);
            map6.put("refer", "product_detail");
            map6.put("label", "user_othershow");
        }
        Map<String, String> map8 = this.LJI;
        UsPopupCardVO usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            if (usPopupCardVO2.isSoldOut()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str = null;
        }
        UsPopupCardVO usPopupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        c21206617yq.getClass();
        C2344009Gk c2344009GkLJ = C21206617yq.LJ(c1743900vTw);
        c2344009GkLJ.LJIIIIZZ("item_order", c1743900vTw.LIZJ("item_order"));
        if (c1743900vTw.LJFF("campaign_id")) {
            c2344009GkLJ.LJFF("campaign_id", c1743900vTw.LIZJ("campaign_id"));
        }
        if (c1743900vTw.LJFF("campaign_type")) {
            c2344009GkLJ.LJFF("campaign_type", c1743900vTw.LIZJ("campaign_type"));
        }
        if (c1743900vTw.LJFF("campaign_channel")) {
            c2344009GkLJ.LJFF("campaign_channel", c1743900vTw.LIZJ("campaign_channel"));
        }
        if (c1743900vTw.LJFF("product_promotion_tag")) {
            c2344009GkLJ.LJFF("product_promotion_tag", c1743900vTw.LIZJ("product_promotion_tag"));
        }
        if (c1743900vTw.LJFF("promotion_status_preheat")) {
            c2344009GkLJ.LJFF("promotion_status_preheat", c1743900vTw.LIZJ("promotion_status_preheat"));
        }
        if (c1743900vTw.LJFF("promotion_status_launch")) {
            c2344009GkLJ.LJFF("promotion_status_launch", c1743900vTw.LIZJ("promotion_status_launch"));
        }
        if (c1743900vTw.LJFF("title_label")) {
            c2344009GkLJ.LJFF("title_label", c1743900vTw.LIZJ("title_label"));
        }
        if (c1743900vTw.LJFF("campaign_user_tag")) {
            c2344009GkLJ.LJFF("campaign_user_tag", c1743900vTw.LIZJ("campaign_user_tag"));
        }
        if (c1743900vTw.LJFF("source_module")) {
            c2344009GkLJ.LJFF("source_module", c1743900vTw.LIZJ("source_module"));
        }
        if (str != null) {
            c2344009GkLJ.LJFF("is_sold_out", str);
        }
        String strLIZJ2 = c1743900vTw.LIZJ("is_hot");
        if (strLIZJ2 != null) {
            c2344009GkLJ.LJFF("is_hot", strLIZJ2);
        }
        String strLIZJ3 = c1743900vTw.LIZJ("hot_sell_number");
        if (strLIZJ3 != null) {
            c2344009GkLJ.LJFF("hot_sell_number", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw.LIZJ("label_type");
        if (strLIZJ4 != null) {
            c2344009GkLJ.LJFF("label_type", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw.LIZJ("creator_limit_type");
        if (strLIZJ5 != null) {
            c2344009GkLJ.LJFF("creator_limit_type", strLIZJ5);
        }
        String strLIZJ6 = c1743900vTw.LIZJ("activity_id");
        if (strLIZJ6 != null) {
            c2344009GkLJ.LJFF("activity_id", strLIZJ6);
        }
        String strLIZJ7 = c1743900vTw.LIZJ("activity_name");
        if (strLIZJ7 != null) {
            c2344009GkLJ.LJFF("activity_name", strLIZJ7);
        }
        String strLIZJ8 = c1743900vTw.LIZJ("label_number");
        if (strLIZJ8 != null) {
            c2344009GkLJ.LJFF("label_number", strLIZJ8);
        }
        String strLIZJ9 = c1743900vTw.LIZJ("source_page_type");
        if (strLIZJ9 != null) {
            c2344009GkLJ.LJFF("source_page_type", strLIZJ9);
        }
        String strLIZJ10 = c1743900vTw.LIZJ("biz_type");
        if (strLIZJ10 != null) {
            c2344009GkLJ.LJFF("biz_type", strLIZJ10);
        }
        String strLIZJ11 = c1743900vTw.LIZJ("currency");
        if (strLIZJ11 != null) {
            c2344009GkLJ.LJFF("currency", strLIZJ11);
        }
        String strLIZJ12 = c1743900vTw.LIZJ("origin_price_value");
        if (strLIZJ12 != null) {
            c2344009GkLJ.LJFF("origin_price_value", strLIZJ12);
        }
        String strLIZJ13 = c1743900vTw.LIZJ("sale_price_value");
        if (strLIZJ13 != null) {
            c2344009GkLJ.LJFF("sale_price_value", strLIZJ13);
        }
        String strLIZJ14 = c1743900vTw.LIZJ("discount_percentage");
        if (strLIZJ14 != null) {
            c2344009GkLJ.LJFF("discount_percentage", strLIZJ14);
        }
        String strLIZJ15 = c1743900vTw.LIZJ("sale_price_after_coupon");
        if (strLIZJ15 != null) {
            c2344009GkLJ.LJFF("sale_price_after_coupon", strLIZJ15);
        }
        if (usPopupCardVO3 != null && (auctionData7 = usPopupCardVO3.auctionData) != null) {
            l = auctionData7.auctionId;
        } else {
            l = null;
        }
        c2344009GkLJ.LJ(l, "auction_id");
        if (usPopupCardVO3 != null && (auctionData6 = usPopupCardVO3.auctionData) != null && (extendAuctionCfg = auctionData6.extendAuctionCfg) != null) {
            strLIZJ = C19673811yC.LIZJ(extendAuctionCfg);
        } else {
            strLIZJ = null;
        }
        c2344009GkLJ.LJFF("is_extended_auction", strLIZJ);
        if (usPopupCardVO3 != null && (auctionData5 = usPopupCardVO3.auctionData) != null && auctionData5.auctionStatus == 10) {
            c2344009GkLJ.LJFF("label_type", "live_auction_ongoing");
        }
        String strLIZJ16 = c1743900vTw.LIZJ("ecom_live_rcmd_info");
        if (strLIZJ16 != null) {
            c2344009GkLJ.LJFF("ecom_live_rcmd_info", strLIZJ16);
        }
        if (usPopupCardVO3 != null && (auctionData4 = usPopupCardVO3.auctionData) != null) {
            strLIZ = C19673811yC.LIZ(auctionData4.auctionStatus);
        } else {
            strLIZ = null;
        }
        c2344009GkLJ.LJFF("auction_status", strLIZ);
        if (usPopupCardVO3 != null && (auctionData3 = usPopupCardVO3.auctionData) != null) {
            strLIZIZ = C19673811yC.LIZIZ(auctionData3.auctionType);
        } else {
            strLIZIZ = null;
        }
        c2344009GkLJ.LJFF("auction_type", strLIZIZ);
        long jLongValue2 = 1;
        if (usPopupCardVO3 != null && (auctionData2 = usPopupCardVO3.auctionData) != null && (surpriseSetData2 = auctionData2.surpriseSetData) != null && (l3 = surpriseSetData2.totalStock) != null) {
            jLongValue = l3.longValue();
        } else {
            jLongValue = 1;
        }
        c2344009GkLJ.LJFF("auction_info_all", String.valueOf(jLongValue));
        if (usPopupCardVO3 != null && (auctionData = usPopupCardVO3.auctionData) != null && (surpriseSetData = auctionData.surpriseSetData) != null && (l2 = surpriseSetData.remainingStock) != null) {
            jLongValue2 = l2.longValue();
        }
        c2344009GkLJ.LJFF("auction_info_left", String.valueOf(jLongValue2));
        if (map8 != null) {
            c2344009GkLJ.LJII(map8);
        }
        C21206617yq.LIZIZ(c2344009GkLJ, c1743900vTw);
        C21206617yq.LIZ(c2344009GkLJ);
        c2344009GkLJ.LJII(map5);
        c2344009GkLJ.LJII(map6);
        c2344009GkLJ.LJII(C21206617yq.LIZLLL());
        c2344009GkLJ.LJII(map);
        c2344009GkLJ.LJII(mapLJIILIIL);
        if (usPopupCardVO3 != null && usPopupCardVO3.cardType == 99) {
            AuctionData auctionData8 = usPopupCardVO3.auctionData;
            if (auctionData8 != null && (map2 = auctionData8.auctionDaInfo) != null) {
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    c2344009GkLJ.LJFF(entry.getKey(), entry.getValue().toString());
                }
            }
            String strLIZJ17 = c1743900vTw.LIZJ("product_id");
            if (strLIZJ17 != null) {
                str2 = strLIZJ17;
            }
            c2344009GkLJ.LJFF("entrance_info", C181T.LIZ(c1743900vTw, str2));
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map9 = c2344009GkLJ.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_show", map9);
        C21206617yq.LJI(true, bool, "image", strValueOf, map5, null);
    }

    @Override // X.AbstractC21196817xG
    public final void LJIIJJI(String str, String str2) {
        C212391189t.LIZ.getClass();
        C212391189t.LIZIZ("pin_product", str, str2);
    }

    public final void LJIIZILJ(UsPopupCardVO usPopupCardVO, boolean z) {
        String str;
        String string;
        String string2;
        int iIntValue;
        int i;
        int size;
        String str2;
        UsPopupCardVO usPopupCardVO2;
        PromotionInfo promotionInfo;
        String eventParamPromotionStatusLaunch;
        String str3;
        boolean zBooleanValue;
        long jLongValue;
        NextActionInfo nextActionInfo;
        Long l;
        UsPopupCardVO usPopupCardVO3;
        UsPopupCardVO usPopupCardVO4;
        Long lValueOf;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        long j;
        LiveDaInfo liveDaInfo;
        HashMap<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3;
        PromotionInfo promotionInfo2;
        String eventParamTitleLabel;
        PromotionInfo promotionInfo3;
        String eventParamPromotionStatusPreHeat;
        PromotionInfo promotionInfo4;
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
        List<String> list;
        String str4;
        HashMap<String, Object> mapLJIIJ;
        Integer num;
        String str5;
        HashMap<String, Object> mapLJIIJ2;
        Long lValueOf2;
        int i4;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        Long lValueOf3 = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (LJIILJJIL()) {
            C21195517x3 c21195517x3 = this.LJIIIIZZ;
            if (c21195517x3 != null) {
                i4 = c21195517x3.LIZ;
            } else {
                i4 = 0;
            }
            C21195517x3 c21195517x32 = new C21195517x3(i4 + 1);
            this.LJIIIIZZ = c21195517x32;
            c21195517x32.LIZJ = System.currentTimeMillis();
        }
        HashMap map4 = (HashMap) this.LIZ.LLJILJILJ.LIZIZ();
        if (map4 == null || (str = (String) map4.get("request_id")) == null) {
            str = "";
        }
        Room room = this.LIZ.LLJILLL;
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        UsPopupCardVO usPopupCardVO5 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO5 == null || (string2 = Long.valueOf(usPopupCardVO5.productId).toString()) == null) {
            string2 = "";
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("track_id", C03RE.LIZ(str, string, string2), false);
        this.LIZ.LLJILJILJ.LJIIIIZZ("room_id", string, false);
        if (!C2093608Ic.LJ(str)) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("request_id", str, false);
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("product_id", string2, false);
        if (usPopupCardVO.flashSaleAtmosphereInfo != null) {
            C21199917xl c21199917xl = C21199917xl.LIZ;
            Room room2 = this.LIZ.LLJILLL;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
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
        InterfaceC21201017xw interfaceC21201017xw = this.LIZIZ;
        if (interfaceC21201017xw != null) {
            interfaceC21201017xw.LIZIZ(z);
        }
        C1440005kM.LIZ(new C591940NJo(1, 300L, false));
        C1440005kM.LIZ(new C591940NJo(2, false));
        UsPopupCardVO usPopupCardVO6 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO6 != null && (str5 = usPopupCardVO6.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str5)) != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ2.entrySet()) {
                this.LIZ.LLJILJILJ.LJIIIIZZ(entry.getKey(), entry.getValue().toString(), false);
            }
        }
        AbstractC21194117wp abstractC21194117wp = this.LIZ;
        C1743900vTw c1743900vTw = abstractC21194117wp.LLJILJILJ;
        UsPopupCardVO usPopupCardVO7 = abstractC21194117wp.LJJIJIIJI().LL;
        if (usPopupCardVO7 != null) {
            lValueOf3 = Long.valueOf(usPopupCardVO7.productId);
        }
        c1743900vTw.LJIIIIZZ("product_id", String.valueOf(lValueOf3), false);
        AbstractC21194117wp abstractC21194117wp2 = this.LIZ;
        C1743900vTw c1743900vTw2 = abstractC21194117wp2.LLJILJILJ;
        UsPopupCardVO usPopupCardVO8 = abstractC21194117wp2.LJJIJIIJI().LL;
        int i5 = -1;
        if (usPopupCardVO8 != null && (num = usPopupCardVO8.bizType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1743900vTw2.LJI(iIntValue, "biz_type");
        AbstractC21194117wp abstractC21194117wp3 = this.LIZ;
        C1743900vTw c1743900vTw3 = abstractC21194117wp3.LLJILJILJ;
        UsPopupCardVO usPopupCardVO9 = abstractC21194117wp3.LJJIJIIJI().LL;
        if (usPopupCardVO9 != null) {
            i = usPopupCardVO9.platform;
        } else {
            i = -1;
        }
        c1743900vTw3.LJI(i, "product_source");
        AbstractC21194117wp abstractC21194117wp4 = this.LIZ;
        C1743900vTw c1743900vTw4 = abstractC21194117wp4.LLJILJILJ;
        UsPopupCardVO usPopupCardVO10 = abstractC21194117wp4.LJJIJIIJI().LL;
        if (usPopupCardVO10 != null) {
            i5 = usPopupCardVO10.sourceFrom;
        }
        c1743900vTw4.LJI(i5, "source_from");
        UsPopupCardVO usPopupCardVO11 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO11 != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("is_fans_price", usPopupCardVO11.hasFansPrice(), false);
        }
        UsPopupCardVO usPopupCardVO12 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO12 != null) {
            this.LIZ.LLJILJILJ.LJI(usPopupCardVO12.bagIndex, "item_order");
        }
        UsPopupCardVO usPopupCardVO13 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO13 != null && (str4 = usPopupCardVO13.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
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
            Object obj4 = mapLJIIJ.get("sale_price_after_coupon");
            if (obj4 != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("sale_price_after_coupon", obj4.toString(), false);
            }
            Object obj5 = mapLJIIJ.get("discount_percentage");
            if (obj5 != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("discount_percentage", obj5.toString(), false);
            }
        }
        AbstractC21194117wp abstractC21194117wp5 = this.LIZ;
        C1743900vTw c1743900vTw5 = abstractC21194117wp5.LLJILJILJ;
        UsPopupCardVO usPopupCardVO14 = abstractC21194117wp5.LJJIJIIJI().LL;
        if (usPopupCardVO14 != null && (list = usPopupCardVO14.skuIds) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c1743900vTw5.LJI(size, "saleable_sku_num");
        UsPopupCardVO usPopupCardVO15 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO15 != null && (flashSaleAtmosphereInfo = usPopupCardVO15.flashSaleAtmosphereInfo) != null) {
            UsPopupCardVO usPopupCardVO16 = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO16 != null) {
                j2 = usPopupCardVO16.serverTime;
            } else {
                j2 = 0;
            }
            UsPopupCardVO usPopupCardVO17 = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO17 != null) {
                j3 = usPopupCardVO17.showAtmosphereBeginMilliSecond;
            } else {
                j3 = 0;
            }
            UsPopupCardVO usPopupCardVO18 = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO18 != null) {
                i2 = usPopupCardVO18.flashSaleStockLimit;
            } else {
                i2 = 0;
            }
            String strLIZ = C21206417yo.LIZ(flashSaleAtmosphereInfo, j2, j3, i2);
            if (strLIZ != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("label_type", strLIZ, false);
                AbstractC21194117wp abstractC21194117wp6 = this.LIZ;
                C1743900vTw c1743900vTw6 = abstractC21194117wp6.LLJILJILJ;
                UsPopupCardVO usPopupCardVO19 = abstractC21194117wp6.LJJIJIIJI().LL;
                if (usPopupCardVO19 != null && (flashSaleAtmosphereInfo3 = usPopupCardVO19.flashSaleAtmosphereInfo) != null) {
                    i3 = flashSaleAtmosphereInfo3.creatorLimitType;
                } else {
                    i3 = 0;
                }
                c1743900vTw6.LJI(i3, "creator_limit_type");
                AbstractC21194117wp abstractC21194117wp7 = this.LIZ;
                C1743900vTw c1743900vTw7 = abstractC21194117wp7.LLJILJILJ;
                UsPopupCardVO usPopupCardVO20 = abstractC21194117wp7.LJJIJIIJI().LL;
                if (usPopupCardVO20 != null && (flashSaleAtmosphereInfo2 = usPopupCardVO20.flashSaleAtmosphereInfo) != null) {
                    j4 = flashSaleAtmosphereInfo2.activityId;
                } else {
                    j4 = 0;
                }
                c1743900vTw7.LJII(j4, "activity_id");
                this.LIZ.LLJILJILJ.LJIIIIZZ("label_number", "-1", false);
            }
        }
        UsPopupCardVO usPopupCardVO21 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO21 != null && (promotionView4 = usPopupCardVO21.promotionView) != null) {
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
        UsPopupCardVO usPopupCardVO22 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO22 != null && (promotionView3 = usPopupCardVO22.promotionView) != null) {
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
        UsPopupCardVO usPopupCardVO23 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO23 != null && (promotionView2 = usPopupCardVO23.promotionView) != null) {
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
        UsPopupCardVO usPopupCardVO24 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO24 != null && (promotionView = usPopupCardVO24.promotionView) != null) {
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
        UsPopupCardVO usPopupCardVO25 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO25 != null && (promotionInfo4 = usPopupCardVO25.promotionInfo) != null) {
            str2 = null;
            String eventParamProductPromotionTag = promotionInfo4.getEventParamProductPromotionTag(C1831607Fi.LIZ(), false);
            if (eventParamProductPromotionTag != null) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("product_promotion_tag", eventParamProductPromotionTag, false);
            }
        } else {
            str2 = null;
        }
        UsPopupCardVO usPopupCardVO26 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO26 != null && (promotionInfo3 = usPopupCardVO26.promotionInfo) != null && (eventParamPromotionStatusPreHeat = promotionInfo3.getEventParamPromotionStatusPreHeat()) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("promotion_status_preheat", eventParamPromotionStatusPreHeat, false);
        }
        String strLIZJ = this.LIZ.LLJILJILJ.LIZJ("promotion_status_preheat");
        if ((strLIZJ == null || strLIZJ.length() == 0) && (usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL) != null && (promotionInfo = usPopupCardVO2.promotionInfo) != null && (eventParamPromotionStatusLaunch = promotionInfo.getEventParamPromotionStatusLaunch()) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("promotion_status_launch", eventParamPromotionStatusLaunch, false);
        }
        UsPopupCardVO usPopupCardVO27 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO27 != null && (promotionInfo2 = usPopupCardVO27.promotionInfo) != null && (eventParamTitleLabel = promotionInfo2.getEventParamTitleLabel()) != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("title_label", eventParamTitleLabel, false);
        }
        AbstractC21194117wp abstractC21194117wp8 = this.LIZ;
        C1743900vTw c1743900vTw8 = abstractC21194117wp8.LLJILJILJ;
        UsPopupCardVO usPopupCardVO28 = abstractC21194117wp8.LJJIJIIJI().LL;
        if (usPopupCardVO28 != null) {
            str2 = usPopupCardVO28.source;
        }
        c1743900vTw8.LJIIIIZZ("source", str2, true);
        this.LIZ.LLJILJILJ.LJII(System.currentTimeMillis(), "start_time");
        AbstractC21194117wp abstractC21194117wp9 = this.LIZ;
        C1743900vTw c1743900vTw9 = abstractC21194117wp9.LLJILJILJ;
        UsPopupCardVO usPopupCardVO29 = abstractC21194117wp9.LJJIJIIJI().LL;
        if (usPopupCardVO29 == null || (map2 = usPopupCardVO29.extra) == null || map2.get("mix_product_type") == null) {
            str3 = "";
        } else {
            UsPopupCardVO usPopupCardVO30 = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO30 != null && (map3 = usPopupCardVO30.extra) != null) {
                str3 = map3.get("mix_product_type");
            } else {
                str3 = null;
            }
        }
        c1743900vTw9.LJIIIIZZ("is_mix_product", str3, false);
        ((LinkedHashMap) this.LJI).clear();
        UsPopupCardVO usPopupCardVO31 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO31 != null && (liveDaInfo = usPopupCardVO31.commonDaInfo) != null && (map = liveDaInfo.logoDaInfo) != null) {
            this.LJI.putAll(map);
        }
        ((LinkedHashMap) this.LJIIJJI).clear();
        Map<String, String> mapLIZJ = LIZJ();
        Map<String, String> map5 = this.LJIIJJI;
        C21206617yq c21206617yq = C21206617yq.LIZ;
        AbstractC21194117wp abstractC21194117wp10 = this.LIZ;
        C1743900vTw c1743900vTw10 = abstractC21194117wp10.LLJILJILJ;
        Map<String, String> map6 = abstractC21194117wp10.LLJJIJI;
        HashMap map7 = new HashMap();
        Map<String, String> map8 = this.LIZ.LLJJIJIIJIL;
        if (map8 != null) {
            map7.putAll(map8);
            map7.put("refer", "image");
            map7.put("label", "user_othershow");
        }
        UsPopupCardVO usPopupCardVO32 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO32 != null) {
            map7.put("card_title", usPopupCardVO32.title);
            map7.put("card_title_length", String.valueOf(usPopupCardVO32.title.length()));
        }
        Boolean bool = this.LIZ.LLLIZZ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        c21206617yq.getClass();
        C2344009Gk c2344009GkLJ = C21206617yq.LJ(c1743900vTw10);
        c2344009GkLJ.LJIIIIZZ("item_order", c1743900vTw10.LIZJ("item_order"));
        if (c1743900vTw10.LJFF("campaign_id")) {
            c2344009GkLJ.LJFF("campaign_id", c1743900vTw10.LIZJ("campaign_id"));
        }
        if (c1743900vTw10.LJFF("campaign_type")) {
            c2344009GkLJ.LJFF("campaign_type", c1743900vTw10.LIZJ("campaign_type"));
        }
        if (c1743900vTw10.LJFF("campaign_channel")) {
            c2344009GkLJ.LJFF("campaign_channel", c1743900vTw10.LIZJ("campaign_channel"));
        }
        if (c1743900vTw10.LJFF("campaign_user_tag")) {
            c2344009GkLJ.LJFF("campaign_user_tag", c1743900vTw10.LIZJ("campaign_user_tag"));
        }
        if (c1743900vTw10.LJFF("shopping_status")) {
            c2344009GkLJ.LJFF("shopping_status", c1743900vTw10.LIZJ("shopping_status"));
        }
        if (c1743900vTw10.LJFF("shopping_mode")) {
            c2344009GkLJ.LJFF("shopping_mode", c1743900vTw10.LIZJ("shopping_mode"));
        }
        if (c1743900vTw10.LJFF("isFirst")) {
            c2344009GkLJ.LJFF("is_first", c1743900vTw10.LIZJ("isFirst"));
        }
        if (c1743900vTw10.LJFF("source_page_type")) {
            c2344009GkLJ.LJFF("source_page_type", c1743900vTw10.LIZJ("source_page_type"));
        }
        if (c1743900vTw10.LJFF("api_end_time")) {
            String strLIZJ2 = c1743900vTw10.LIZJ("api_end_time");
            if (strLIZJ2 != null) {
                j = CastLongProtector.parseLong(strLIZJ2);
            } else {
                j = 0;
            }
            c2344009GkLJ.LIZLLL(System.currentTimeMillis() - j, "duration");
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            c2344009GkLJ.LJFF("user_type", "moderator");
            String strLIZJ3 = c1743900vTw10.LIZJ("author_id");
            if (strLIZJ3 == null) {
                strLIZJ3 = "";
            }
            c2344009GkLJ.LJFF("moderator_id", strLIZJ3);
        }
        String strLIZJ4 = c1743900vTw10.LIZJ("is_hot");
        if (strLIZJ4 != null) {
            c2344009GkLJ.LJFF("is_hot", strLIZJ4);
        }
        String strLIZJ5 = c1743900vTw10.LIZJ("hot_sell_number");
        if (strLIZJ5 != null) {
            c2344009GkLJ.LJFF("hot_sell_number", strLIZJ5);
        }
        String strLIZJ6 = c1743900vTw10.LIZJ("label_type");
        if (strLIZJ6 != null) {
            c2344009GkLJ.LJFF("label_type", strLIZJ6);
        }
        String strLIZJ7 = c1743900vTw10.LIZJ("creator_limit_type");
        if (strLIZJ7 != null) {
            c2344009GkLJ.LJFF("creator_limit_type", strLIZJ7);
        }
        String strLIZJ8 = c1743900vTw10.LIZJ("activity_id");
        if (strLIZJ8 != null) {
            c2344009GkLJ.LJFF("activity_id", strLIZJ8);
        }
        String strLIZJ9 = c1743900vTw10.LIZJ("label_number");
        if (strLIZJ9 != null) {
            c2344009GkLJ.LJFF("label_number", strLIZJ9);
        }
        String strLIZJ10 = c1743900vTw10.LIZJ("biz_type");
        if (strLIZJ10 != null) {
            c2344009GkLJ.LJFF("biz_type", strLIZJ10);
        }
        C21206617yq.LIZ(c2344009GkLJ);
        c2344009GkLJ.LJII(map6);
        c2344009GkLJ.LJII(map7);
        c2344009GkLJ.LJII(C21206617yq.LIZLLL());
        c2344009GkLJ.LJII(mapLIZJ);
        map5.putAll(C19719512Dh.LIZJ(c2344009GkLJ.LIZ));
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
        if (!C21194017wo.LIZIZ(this.LIZ.LJJIJIIJI().LL) && (((usPopupCardVO3 = this.LIZ.LJJIJIIJI().LL) != null && usPopupCardVO3.cardType == 1) || ((usPopupCardVO4 = this.LIZ.LJJIJIIJI().LL) != null && usPopupCardVO4.cardType == 99))) {
            if (this.LIZ.LJJIJIIJI().LLILZIL == 0) {
                C786410Ut5.LJLIIL(300L, C612310Nzx.LIZ, new ARunnableS78S0200000_9(this, mapLIZJ, 105));
            } else {
                LJIILLIIL(mapLIZJ);
            }
        }
        AbstractC21194117wp abstractC21194117wp11 = this.LIZ;
        UsPopupCardVO usPopupCardVO33 = abstractC21194117wp11.LJJIJIIJI().LL;
        if (usPopupCardVO33 != null && (nextActionInfo = usPopupCardVO33.nextActionInfo) != null && (l = nextActionInfo.currentShowTimeMs) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        abstractC21194117wp11.LJJJJJL(jLongValue);
    }

    public C21199717xj(AbstractC21194117wp abstractC21194117wp, InterfaceC21201017xw interfaceC21201017xw, C21194917wx c21194917wx) {
        super(abstractC21194117wp, interfaceC21201017xw, c21194917wx);
        this.LJFF = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(254));
        this.LJI = new LinkedHashMap();
        this.LJII = true;
        this.LJIIJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(255));
        this.LJIIJJI = new LinkedHashMap();
    }

    @Override // X.AbstractC21196817xG
    public final void LJFF(PopProductResp popProductResp, boolean z, boolean z2, boolean z3) {
        Long lValueOf;
        LJIILL();
        UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            Boolean boolValueOf = this.LJIIIZ;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(z2);
            }
            this.LJIIIZ = boolValueOf;
            if (z && !LJIILJJIL() && !C21194017wo.LIZIZ(usPopupCardVO)) {
                AbstractC21194117wp abstractC21194117wp = this.LIZ;
                UsPopupCardVO usPopupCardVO2 = abstractC21194117wp.LJJIJIIJI().LL;
                if (usPopupCardVO2 != null) {
                    lValueOf = Long.valueOf(usPopupCardVO2.productId);
                } else {
                    lValueOf = null;
                }
                abstractC21194117wp.LJJJLIIL(lValueOf, z2);
            }
            LJIIZILJ(usPopupCardVO, z3);
        }
    }
}
