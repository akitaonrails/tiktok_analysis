package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199017xc extends AbstractC21196817xG {
    public boolean LIZLLL;
    public final Map<String, String> LJ;

    @Override // X.AbstractC21196817xG
    public final void LJII() {
    }

    @Override // X.AbstractC21196817xG
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC21196817xG
    public final void LJIIJ() {
    }

    @Override // X.AbstractC21196817xG
    public final void LIZ() {
        this.LIZ.LJJJJJL(0L);
    }

    @Override // X.AbstractC21196817xG
    public final void LJI() {
        UsPopupCardVO usPopupCardVO;
        if (this.LIZ.LJJIJIIJI().LLILZ || (usPopupCardVO = this.LIZ.LJJIJIIJI().LL) == null) {
            return;
        }
        this.LIZ.LJJIJIIJI().LJJIJIL(usPopupCardVO, this.LIZ.LJJIZ());
        LJIILJJIL(usPopupCardVO, false);
    }

    public final void LJIILIIL() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZ.LJJIJIIJI().LLJI = new AwS646S0100000_32(this, 21);
        this.LIZ.LJJIJIIJI().LLJ = new AwS681S0100000_32(this, 13);
        this.LIZ.LJJIJIIJI().LLIZ = AFwS223S0000000_32.get$arr$(165);
        this.LIZ.LJJIJIIJI().LLJILJIL = new AwS576S0100000_32(this, 514);
        this.LIZ.LJJIJIIJI().LLJILJILJ = new AwS611S0100000_32(this, 282);
        this.LIZLLL = true;
    }

    @Override // X.AbstractC21196817xG
    public final void LIZLLL() {
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC21196817xG
    public final void LIZIZ(String str) {
        Long lValueOf;
        String string;
        String string2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LLJIJIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            InterfaceC21201017xw interfaceC21201017xw = this.LIZIZ;
            if (interfaceC21201017xw != null) {
                interfaceC21201017xw.LIZJ();
            }
            this.LIZ.LJJJLZIJ(str);
        }
        this.LIZ.LLJZIJLIL.removeMessages(0);
        this.LIZ.LJJIJIIJI().LJIJJLI(str);
        if (Intrinsics.LJFF(str, "unpin")) {
            Room room = this.LIZ.LLJILLL;
            if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String strLJJIJ = AbstractC21194117wp.LJJIJ();
            String roleStr = EnumC21196517xD.ROOM_OWNER.getRoleStr();
            UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
            if (usPopupCardVO == null || (string2 = Long.valueOf(usPopupCardVO.productId).toString()) == null) {
                string2 = "";
            }
            C21198317xV.LIZJ(string, strLJJIJ, roleStr, string2);
        }
        C21199917xl c21199917xl = C21199917xl.LIZ;
        Room room2 = this.LIZ.LLJILLL;
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        C21200017xm c21200017xmLIZ = c21199917xl.LIZ(lValueOf);
        if (c21200017xmLIZ != null) {
            c21200017xmLIZ.LJFF(c21200017xmLIZ.LIZJ(0), true);
        }
        if (Intrinsics.LJFF("unpin", str)) {
            C1440005kM.LIZ(new C083G(2));
        } else {
            if (Intrinsics.LJFF("repin", str)) {
                return;
            }
            C1440005kM.LIZ(new C083G(1));
        }
    }

    @Override // X.AbstractC21196817xG
    public final void LJ(OecInitData oecInitData) {
        Boolean boolValueOf;
        UsPopupCardVO usPopupCardVO;
        CommerceStruct commerceStruct;
        C622680Oba.LIZJ(this);
        LJIILIIL();
        Room room = this.LIZ.LLJILLL;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null) {
            boolValueOf = Boolean.valueOf(commerceStruct.asyncLoad);
        } else {
            boolValueOf = null;
        }
        if (C21194717wv.LIZ(oecInitData, boolValueOf) && (usPopupCardVO = this.LIZ.LJJIJIIJI().LL) != null) {
            LJIILJJIL(usPopupCardVO, true);
        }
    }

    @Override // X.AbstractC21196817xG
    public final void LJIIIIZZ(String str) {
        String strLIZJ;
        Integer numValueOf;
        Long l;
        String str2;
        C1743900vTw c1743900vTw = this.LIZ.LLJILJILJ;
        String strLIZJ2 = c1743900vTw.LIZJ("room_id");
        if (this.LIZ.LJJIJIIJI().LLLLLZ()) {
            strLIZJ = C19395610uQ.LJIJI;
        } else {
            strLIZJ = c1743900vTw.LIZJ("product_id");
        }
        String strLIZJ3 = c1743900vTw.LIZJ("author_id");
        UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
        Integer numValueOf2 = null;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        String strLIZJ4 = c1743900vTw.LIZJ("stay_time");
        if (strLIZJ4 == null) {
            strLIZJ4 = CardStruct.IStatusCode.DEFAULT;
        }
        boolean zLLLLLZ = this.LIZ.LJJIJIIJI().LLLLLZ();
        if (this.LIZ.LJJIJIIJI().LLLLLZ()) {
            l = C19395610uQ.LJIJJ;
        } else {
            l = null;
        }
        Map mapLIZ = C1733940vDs.LIZ(numValueOf, l, strLIZJ2, strLIZJ3, strLIZJ, "smart_pin", zLLLLLZ);
        mapLIZ.put("quit_type", str);
        mapLIZ.put("stayTime", strLIZJ4);
        C1421105hJ.LIZJ("tiktokec_module_staytime", mapLIZ);
        String strLIZJ5 = c1743900vTw.LIZJ("room_id");
        String strLIZJ6 = c1743900vTw.LIZJ("product_id");
        String strLIZJ7 = c1743900vTw.LIZJ("author_id");
        UsPopupCardVO usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            numValueOf2 = Integer.valueOf(usPopupCardVO2.cardType);
        }
        String strLIZJ8 = c1743900vTw.LIZJ("item_order");
        String strLIZJ9 = c1743900vTw.LIZJ("stay_time");
        if (strLIZJ9 == null) {
            strLIZJ9 = CardStruct.IStatusCode.DEFAULT;
        }
        Map mapLIZ2 = C1733940vDs.LIZ(numValueOf2, null, strLIZJ5, strLIZJ7, strLIZJ6, null, false);
        mapLIZ2.put("user_type", "author");
        mapLIZ2.put("edit_type", "unpin");
        mapLIZ2.put("suggested", CardStruct.IStatusCode.DEFAULT);
        mapLIZ2.put("click_position", "product_card");
        mapLIZ2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        mapLIZ2.put("duration", strLIZJ9);
        if (numValueOf2 != null && numValueOf2.intValue() == 2) {
            str2 = "shopping_list";
        } else {
            str2 = "product";
        }
        mapLIZ2.put("pin_type", str2);
        if (strLIZJ8 != null) {
            mapLIZ2.put("item_order", strLIZJ8);
        }
        C1421105hJ.LIZJ("livesdk_tiktokec_pin_product_duration", mapLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[PHI: r5
      0x0082: PHI (r5v2 java.lang.Long) = (r5v1 java.lang.Long), (r5v4 java.lang.Long) binds: [B:33:0x0081, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(boolean r9) {
        /*
            r8 = this;
            X.17wp r0 = r8.LIZ
            X.17xX r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r3 = r0.LL
            r6 = 0
            if (r3 == 0) goto L85
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r0 = r3.pinCardConfig
            if (r0 == 0) goto L85
            long r1 = r0.displayDurationAfterActivityFinish
        L12:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L74
            if (r3 == 0) goto L81
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r0 = r3.pinCardConfig
            if (r0 == 0) goto L81
            long r0 = r0.displayDurationAfterActivityFinish
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L23:
            if (r5 == 0) goto L82
            long r1 = r5.longValue()
        L29:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L4b
            X.17wp r0 = r8.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLJZIJLIL
            r0.removeMessages(r3)
            if (r5 == 0) goto L4a
            long r1 = r5.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4a
            long r1 = r5.longValue()
            X.17wp r0 = r8.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLJZIJLIL
            X.C786410Ut5.LJLJJI(r3, r1, r0)
        L4a:
            return
        L4b:
            if (r9 == 0) goto L4a
            X.17wp r0 = r8.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r0.LLJZIJLIL
            r0.removeMessages(r3)
            X.17wp r0 = r8.LIZ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r0.LLJZIJLIL
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.PinCardStyleConfig r1 = X.C21196617xE.LIZ()
            X.17wp r0 = r8.LIZ
            X.17xX r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r0.LL
            if (r0 == 0) goto L6c
            int r0 = r0.cardType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L6c:
            long r0 = r1.LIZ(r4)
            X.C786410Ut5.LJLJJI(r3, r0, r2)
            return
        L74:
            if (r3 == 0) goto L81
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig r0 = r3.pinCardConfig
            if (r0 == 0) goto L81
            long r0 = r0.displayDurationMs
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L23
        L81:
            r5 = r4
        L82:
            r1 = 0
            goto L29
        L85:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21199017xc.LJIIL(boolean):void");
    }

    public final void LJIILJJIL(UsPopupCardVO usPopupCardVO, boolean z) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Integer num;
        String string;
        int size;
        int size2;
        int size3;
        int size4;
        List<AtmosphereTag> list;
        InterfaceC21201017xw interfaceC21201017xw = this.LIZIZ;
        if (interfaceC21201017xw != null) {
            interfaceC21201017xw.LIZIZ(z);
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("product_id", String.valueOf(usPopupCardVO.productId), false);
        C1743900vTw c1743900vTw = this.LIZ.LLJILJILJ;
        Integer num2 = usPopupCardVO.bizType;
        int iIntValue2 = -1;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        c1743900vTw.LJI(iIntValue, "biz_type");
        this.LIZ.LLJILJILJ.LJI(usPopupCardVO.platform, "product_source");
        UsPopupCardVO usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            this.LIZ.LLJILJILJ.LJI(usPopupCardVO2.bagIndex, "item_order");
        }
        if (this.LIZ.LLJILJILJ.LJFF("label_type")) {
            this.LIZ.LLJILJILJ.LJIIJJI("label_type");
        }
        if (this.LIZ.LLJILJILJ.LJFF("label_number")) {
            this.LIZ.LLJILJILJ.LJIIJJI("label_number");
        }
        UsPopupCardVO usPopupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO3 != null && (list = usPopupCardVO3.atmosphereTags) != null) {
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
        PromotionView promotionView = usPopupCardVO.promotionView;
        Long lValueOf = null;
        if (promotionView != null) {
            List<PromotionItem> promotion_items = promotionView.getPromotion_items();
            if (promotion_items != null) {
                size4 = promotion_items.size();
            } else {
                size4 = 0;
            }
            String strLIZ = C1744000vU6.LIZ(promotionView, "campaign_id", size4);
            if (strLIZ != null && strLIZ.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_id", strLIZ, false);
            }
        }
        PromotionView promotionView2 = usPopupCardVO.promotionView;
        if (promotionView2 != null) {
            List<PromotionItem> promotion_items2 = promotionView2.getPromotion_items();
            if (promotion_items2 != null) {
                size3 = promotion_items2.size();
            } else {
                size3 = 0;
            }
            String strLIZ2 = C1744000vU6.LIZ(promotionView2, "campaign_channel", size3);
            if (strLIZ2 != null && strLIZ2.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_channel", strLIZ2, false);
            }
        }
        PromotionView promotionView3 = usPopupCardVO.promotionView;
        if (promotionView3 != null) {
            List<PromotionItem> promotion_items3 = promotionView3.getPromotion_items();
            if (promotion_items3 != null) {
                size2 = promotion_items3.size();
            } else {
                size2 = 0;
            }
            String strLIZ3 = C1744000vU6.LIZ(promotionView3, "campaign_user_tag", size2);
            if (strLIZ3 != null && strLIZ3.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_user_tag", strLIZ3, false);
            }
        }
        PromotionView promotionView4 = usPopupCardVO.promotionView;
        if (promotionView4 != null) {
            List<PromotionItem> promotion_items4 = promotionView4.getPromotion_items();
            if (promotion_items4 != null) {
                size = promotion_items4.size();
            } else {
                size = 0;
            }
            String strLIZ4 = C1744000vU6.LIZ(promotionView4, "campaign_type", size);
            if (strLIZ4 != null && strLIZ4.length() > 0) {
                this.LIZ.LLJILJILJ.LJIIIIZZ("campaign_type", strLIZ4, false);
            }
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("source", usPopupCardVO.source, true);
        this.LIZ.LLJILJILJ.LJIIIIZZ("source_from", String.valueOf(usPopupCardVO.sourceFrom), true);
        UsPopupCardVO usPopupCardVO4 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO4 != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("is_fans_price", usPopupCardVO4.hasFansPrice(), false);
        }
        this.LIZ.LLJILJILJ.LJII(System.currentTimeMillis(), "start_time");
        C1743900vTw c1743900vTw2 = this.LIZ.LLJILJILJ;
        Map<String, String> map = usPopupCardVO.extra;
        if (map != null) {
            str = map.get("mix_product_type");
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str2 = "";
        } else {
            Map<String, String> map2 = usPopupCardVO.extra;
            if (map2 != null) {
                str2 = map2.get("mix_product_type");
            } else {
                str2 = null;
            }
        }
        c1743900vTw2.LJIIIIZZ("is_mix_product", str2, false);
        HashMap map3 = (HashMap) this.LIZ.LLJILJILJ.LIZIZ();
        if (map3 == null || (str3 = (String) map3.get("request_id")) == null) {
            str3 = "";
        }
        Room room = this.LIZ.LLJILLL;
        if (room != null && (string = Long.valueOf(room.getId()).toString()) != null) {
            str4 = string;
        }
        String strValueOf = String.valueOf(usPopupCardVO.productId);
        this.LIZ.LLJILJILJ.LJIIIIZZ("track_id", C03RE.LIZ(str3, str4, strValueOf), false);
        this.LIZ.LLJILJILJ.LJIIIIZZ("room_id", str4, false);
        if (!C2093608Ic.LJ(str3)) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("request_id", str3, false);
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("product_id", strValueOf, false);
        Map<String, String> mapLIZJ = LIZJ();
        Map<String, String> map4 = this.LJ;
        UsPopupCardVO usPopupCardVO5 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO5 != null && (num = usPopupCardVO5.bizType) != null) {
            iIntValue2 = num.intValue();
        }
        map4.put("biz_type", String.valueOf(iIntValue2));
        this.LJ.putAll(mapLIZJ);
        if (this.LIZ.LJJIIZI()) {
            HashMap map5 = new HashMap();
            Map<String, String> map6 = this.LIZ.LLJJIJI;
            if (map6 != null) {
                map5.putAll(map6);
            }
            map5.put("refer", "product_detail");
            HashMap map7 = new HashMap();
            Room room2 = this.LIZ.LLJILLL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            }
            map7.put("room_id", String.valueOf(lValueOf));
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && interfaceC20673515v3K4.LJLIL() != null) {
                C0IXW.LIZ("live_ad", "othershow", map5, map7);
            }
        }
        C1440005kM.LIZ(new C083G(0));
    }

    public C21199017xc(AbstractC21194117wp abstractC21194117wp, InterfaceC21201017xw interfaceC21201017xw, C21194917wx c21194917wx) {
        super(abstractC21194117wp, interfaceC21201017xw, c21194917wx);
        this.LJ = new LinkedHashMap();
    }

    @Override // X.AbstractC21196817xG
    public final void LJFF(PopProductResp popProductResp, boolean z, boolean z2, boolean z3) {
        LJIILIIL();
        UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            LJIILJJIL(usPopupCardVO, z3);
        }
    }
}
