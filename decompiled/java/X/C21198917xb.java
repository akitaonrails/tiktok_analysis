package X;

import android.content.Context;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
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
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21198917xb extends AbstractC21196217xA {
    public boolean LIZLLL;
    public boolean LJ;
    public final C01GW LJFF;
    public C21199117xd LJI;
    public final Map<String, String> LJII;

    @Override // X.AbstractC21196217xA
    public final void LJII() {
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIJ() {
    }

    @Override // X.AbstractC21196217xA
    public final void LIZJ() {
        C21199117xd c21199117xd = this.LJI;
        if (c21199117xd != null) {
            c21199117xd.LIZJ();
        }
        this.LJI = null;
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC21196217xA
    public final void LJFF() {
        PopupCardVO popupCardVO;
        if (this.LIZ.LJJIJIIJI().LLILZ || (popupCardVO = this.LIZ.LJJIJIIJI().LL) == null) {
            return;
        }
        this.LIZ.LJJIJIIJI().LJJIJL(popupCardVO, this.LIZ.LJJJ());
        LJIILIIL(popupCardVO);
    }

    public final void LJIIL() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZ.LJJIJIIJI().LLJI = new AwS576S0100000_32(this, 710);
        this.LIZ.LJJIJIIJI().LLJ = new AwS681S0100000_32(this, 30);
        this.LIZ.LJJIJIIJI().LLIZ = AFwS223S0000000_32.get$arr$(230);
        this.LIZ.LJJIJIIJI().LLJILJIL = new AwS576S0100000_32(this, 711);
        this.LIZ.LJJIJIIJI().LLJILJILJ = new AwS576S0100000_32(this, 712);
        this.LIZ.LJJIJIIJI().LLJJI = new AwS611S0100000_32(this, 341);
        this.LIZLLL = true;
    }

    @Override // X.AbstractC21196217xA
    public final void LIZ(String str) {
        String string;
        String string2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        C21199117xd c21199117xd = this.LJI;
        if (c21199117xd != null) {
            c21199117xd.LIZJ();
        }
        this.LJI = null;
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LLJIJIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            IFrameSlot.SlotViewModel slotViewModel2 = this.LIZ.LLJIJIL;
            if (slotViewModel2 != null) {
                C21207817z2.LIZIZ(slotViewModel2, false);
            }
            this.LIZ.LJJJJZ(str);
        }
        this.LIZ.LLLF.removeMessages(0);
        this.LIZ.LLLF.removeMessages(1);
        this.LIZ.LJJIJIIJI().LJJIFFI(str);
        if (Intrinsics.LJFF(str, "unpin")) {
            Room room = this.LIZ.LLJILLL;
            if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String strLJJIJ = AbstractC21194217wq.LJJIJ();
            String roleStr = EnumC21196517xD.ROOM_OWNER.getRoleStr();
            PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
            if (popupCardVO == null || (string2 = Long.valueOf(popupCardVO.productId).toString()) == null) {
                string2 = "";
            }
            C21198417xW.LIZJ(string, strLJJIJ, roleStr, string2);
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

    @Override // X.AbstractC21196217xA
    public final void LIZLLL(OecInitData oecInitData) {
        Boolean boolValueOf;
        PopupCardVO popupCardVO;
        CommerceStruct commerceStruct;
        C622680Oba.LIZJ(this);
        LJIIL();
        Room room = this.LIZ.LLJILLL;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null) {
            boolValueOf = Boolean.valueOf(commerceStruct.asyncLoad);
        } else {
            boolValueOf = null;
        }
        if (C21194717wv.LIZLLL(oecInitData, boolValueOf) != null && (popupCardVO = this.LIZ.LJJIJIIJI().LL) != null) {
            this.LJ = true;
            LJIILIIL(popupCardVO);
        }
    }

    @Override // X.AbstractC21196217xA
    public final void LJIIIIZZ(String str) {
        Integer numValueOf;
        String str2;
        C1743900vTw c1743900vTw = this.LIZ.LLJILJILJ;
        String strLIZJ = c1743900vTw.LIZJ("room_id");
        String strLIZJ2 = c1743900vTw.LIZJ("product_id");
        String strLIZJ3 = c1743900vTw.LIZJ("author_id");
        PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
        Integer numValueOf2 = null;
        if (popupCardVO != null) {
            numValueOf = Integer.valueOf(popupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        String strLIZJ4 = c1743900vTw.LIZJ("stay_time");
        if (strLIZJ4 == null) {
            strLIZJ4 = CardStruct.IStatusCode.DEFAULT;
        }
        Map mapLIZ = C1733950vDt.LIZ(numValueOf, strLIZJ, strLIZJ3, strLIZJ2);
        mapLIZ.put("quit_type", str);
        mapLIZ.put("stayTime", strLIZJ4);
        C1421105hJ.LIZJ("tiktokec_module_staytime", mapLIZ);
        String strLIZJ5 = c1743900vTw.LIZJ("room_id");
        String strLIZJ6 = c1743900vTw.LIZJ("product_id");
        String strLIZJ7 = c1743900vTw.LIZJ("author_id");
        PopupCardVO popupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO2 != null) {
            numValueOf2 = Integer.valueOf(popupCardVO2.cardType);
        }
        String strLIZJ8 = c1743900vTw.LIZJ("item_order");
        String strLIZJ9 = c1743900vTw.LIZJ("stay_time");
        if (strLIZJ9 == null) {
            strLIZJ9 = CardStruct.IStatusCode.DEFAULT;
        }
        Map mapLIZ2 = C1733950vDt.LIZ(numValueOf2, strLIZJ5, strLIZJ7, strLIZJ6);
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

    public final void LJIILIIL(PopupCardVO popupCardVO) {
        Object objLIZIZ;
        int iIntValue;
        String str;
        C1783920wWU c1783920wWU;
        AbstractC21194217wq abstractC21194217wq;
        C21199317xf c21199317xf;
        AbstractC21200217xo abstractC21200217xo;
        C1783930wWV c1783930wWVN0;
        Integer num;
        InterfaceC599740Nfg interfaceC599740NfgSU1;
        Context context = null;
        this.LIZ.LJJJLZIJ(EnumC21193117wf.PREPARE_TO_SHOW, null);
        C21193917wn.LIZ.getClass();
        kotlin.Pair pairLIZJ = C21193917wn.LIZJ(popupCardVO);
        boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
        boolean z = this.LJ;
        this.LJ = false;
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addShowTask: isLynxCard ");
        sbLIZ.append(zBooleanValue);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599810Nfn.getClass();
        C599810Nfn.LIZ("ECExplanationBroadcasterCardWidgetNativeImpl", strLIZIZ);
        C21199117xd c21199117xd = this.LJI;
        if (c21199117xd != null) {
            c21199117xd.LIZJ();
        }
        this.LJI = null;
        if (popupCardVO.cardType == 3) {
            if (!zBooleanValue) {
                this.LIZ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_LOAD_FAIL, "coupon lynx config missing");
                return;
            }
        } else if (!zBooleanValue) {
            LJIILJJIL(popupCardVO);
            return;
        }
        C599810Nfn.LIZ("ECExplanationBroadcasterCardWidgetNativeImpl", "addShowTask: start load & pending");
        C21200317xp c21200317xp = (C21200317xp) this.LIZ.LLL.getValue();
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LIZ.LLJZIJLIL;
        if (iSeaLiveContextAbility != null && (interfaceC599740NfgSU1 = iSeaLiveContextAbility.SU1()) != null) {
            objLIZIZ = interfaceC599740NfgSU1.LIZIZ("role_type", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        } else {
            objLIZIZ = null;
        }
        if ((objLIZIZ instanceof Integer) && (num = (Integer) objLIZIZ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        T t = this.LIZ.LJJIJIIJI().LLILZIL;
        if ((t instanceof C21197717xP) && (abstractC21200217xo = (AbstractC21200217xo) t) != null && (c1783930wWVN0 = abstractC21200217xo.n0(popupCardVO, (String) pairLIZJ.getSecond(), iIntValue, z)) != null) {
            str = c1783930wWVN0.LIZ;
            c1783920wWU = c1783930wWVN0.LIZIZ;
            if (c1783920wWU == null) {
            }
            C21199117xd c21199117xd2 = new C21199117xd(c21200317xp, this);
            this.LJI = c21199117xd2;
            abstractC21194217wq = this.LIZ;
            if ((abstractC21194217wq instanceof C21199317xf) && (c21199317xf = (C21199317xf) abstractC21194217wq) != null) {
                context = c21199317xf.LLLLIIL;
            }
            c21200317xp.LIZIZ(context, c1783920wWU, str, abstractC21194217wq.LLJZIJLIL, c21199117xd2);
        }
        str = null;
        c1783920wWU = new C1783920wWU(popupCardVO.cardType, (String) pairLIZJ.getSecond(), iIntValue);
        C21199117xd c21199117xd22 = new C21199117xd(c21200317xp, this);
        this.LJI = c21199117xd22;
        abstractC21194217wq = this.LIZ;
        if (abstractC21194217wq instanceof C21199317xf) {
            context = c21199317xf.LLLLIIL;
        }
        c21200317xp.LIZIZ(context, c1783920wWU, str, abstractC21194217wq.LLJZIJLIL, c21199117xd22);
    }

    public final void LJIILJJIL(PopupCardVO popupCardVO) {
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
        String str4;
        Long lValueOf = null;
        this.LIZ.LJJJLZIJ(EnumC21193117wf.NOTIFY_SHOW, null);
        IFrameSlot.SlotViewModel slotViewModel = this.LIZ.LLJIJIL;
        if (slotViewModel != null) {
            C21207817z2.LIZIZ(slotViewModel, true);
        }
        long jLIZ = C21196617xE.LIZ().LIZ(Integer.valueOf(popupCardVO.cardType));
        if (jLIZ <= 0) {
            jLIZ = 30000;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ec_live_is_anchor_pin_card_permanent", false)) {
            C786410Ut5.LJLJJI(0, jLIZ, this.LIZ.LLLF);
        }
        if (C621750Oa5.LIZ().enable && popupCardVO.cardType == 1) {
            AnchorPinCardConfig anchorPinCardConfig = popupCardVO.anchorPinCardConfig;
            if (anchorPinCardConfig != null) {
                str4 = anchorPinCardConfig.educationText;
            } else {
                str4 = null;
            }
            if (C123100dR.LIZ(str4)) {
                long jLIZIZ = C21196617xE.LIZ().LIZIZ(Integer.valueOf(popupCardVO.cardType)) + C621750Oa5.LIZ().showOffset;
                if (jLIZIZ > 0) {
                    C786410Ut5.LJLJJI(1, jLIZIZ, this.LIZ.LLLF);
                }
            }
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("product_id", String.valueOf(popupCardVO.productId), false);
        C1743900vTw c1743900vTw = this.LIZ.LLJILJILJ;
        Integer num2 = popupCardVO.bizType;
        int iIntValue2 = -1;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        c1743900vTw.LJI(iIntValue, "biz_type");
        this.LIZ.LLJILJILJ.LJI(popupCardVO.platform, "product_source");
        PopupCardVO popupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO2 != null) {
            this.LIZ.LLJILJILJ.LJI(popupCardVO2.bagIndex, "item_order");
        }
        if (this.LIZ.LLJILJILJ.LJFF("label_type")) {
            this.LIZ.LLJILJILJ.LJIIJJI("label_type");
        }
        if (this.LIZ.LLJILJILJ.LJFF("label_number")) {
            this.LIZ.LLJILJILJ.LJIIJJI("label_number");
        }
        PopupCardVO popupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO3 != null && (list = popupCardVO3.atmosphereTags) != null) {
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
        PromotionView promotionView = popupCardVO.promotionView;
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
        PromotionView promotionView2 = popupCardVO.promotionView;
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
        PromotionView promotionView3 = popupCardVO.promotionView;
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
        PromotionView promotionView4 = popupCardVO.promotionView;
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
        this.LIZ.LLJILJILJ.LJIIIIZZ("source", popupCardVO.source, true);
        this.LIZ.LLJILJILJ.LJIIIIZZ("source_from", String.valueOf(popupCardVO.sourceFrom), true);
        PopupCardVO popupCardVO4 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO4 != null) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("is_fans_price", popupCardVO4.hasFansPrice(), false);
        }
        this.LIZ.LLJILJILJ.LJII(System.currentTimeMillis(), "start_time");
        C1743900vTw c1743900vTw2 = this.LIZ.LLJILJILJ;
        Map<String, String> map = popupCardVO.extra;
        if (map != null) {
            str = map.get("mix_product_type");
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str2 = "";
        } else {
            Map<String, String> map2 = popupCardVO.extra;
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
            str5 = string;
        }
        String strValueOf = String.valueOf(popupCardVO.productId);
        this.LIZ.LLJILJILJ.LJIIIIZZ("track_id", C03RE.LIZ(str3, str5, strValueOf), false);
        this.LIZ.LLJILJILJ.LJIIIIZZ("room_id", str5, false);
        if (!C2093608Ic.LJ(str3)) {
            this.LIZ.LLJILJILJ.LJIIIIZZ("request_id", str3, false);
        }
        this.LIZ.LLJILJILJ.LJIIIIZZ("product_id", strValueOf, false);
        Map<String, String> mapLIZIZ = LIZIZ();
        Map<String, String> map4 = this.LJII;
        PopupCardVO popupCardVO5 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO5 != null && (num = popupCardVO5.bizType) != null) {
            iIntValue2 = num.intValue();
        }
        map4.put("biz_type", String.valueOf(iIntValue2));
        this.LJII.putAll(mapLIZIZ);
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

    public C21198917xb(AbstractC21194217wq abstractC21194217wq, C21194817ww c21194817ww) {
        super(abstractC21194217wq, null, c21194817ww);
        this.LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(abstractC21194217wq, 709));
        this.LJII = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    @Override // X.AbstractC21196217xA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.livesdk.model.message.ext.ECommerceMessage r8, kotlin.jvm.internal.AwS398S0200000_32 r9) {
        /*
            r7 = this;
            int r4 = r8.cardType
            X.17wq r0 = r7.LIZ
            boolean r1 = r0.LJJJ()
            r5 = 0
            r0 = 0
            if (r1 == 0) goto Lb8
            X.17wq r0 = r7.LIZ
            X.17xY r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL
            if (r0 == 0) goto Lb6
            int r0 = r0.cardType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1c:
            if (r2 == 0) goto Lb6
            int r0 = r2.intValue()
            if (r4 != r0) goto Lb6
            int r1 = r2.intValue()
            r0 = 2
            r3 = 1
            if (r1 == r0) goto L7b
            r1 = 3
            int r0 = r2.intValue()
            if (r0 != r1) goto L8d
            com.bytedance.android.livesdk.model.message.Voucher r0 = r8.voucher
            if (r0 == 0) goto L8b
            long r0 = r0.voucherTypeId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
        L41:
            X.17wq r0 = r7.LIZ
            X.17xY r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher r0 = r0.popVoucher
            if (r0 == 0) goto L51
            java.lang.String r5 = r0.voucherTypeId
        L51:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r5)
            if (r0 != 0) goto L7b
            com.bytedance.android.livesdk.model.message.Voucher r0 = r8.voucher
            if (r0 == 0) goto Lb6
            long r0 = r0.voucherTypeId
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto Lb6
            X.17wq r0 = r7.LIZ
            X.17xY r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher r0 = r0.popVoucher
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.voucherTypeId
            if (r0 == 0) goto L7b
            int r0 = r0.length()
            if (r0 != 0) goto Lb6
        L7b:
            int r1 = r8.anchorPinCardResetType
            if (r1 == 0) goto Lbe
            if (r3 == 0) goto Lbe
            X.17wq r0 = r7.LIZ
            X.17xY r0 = r0.LJJIJIIJI()
            r0.LLLLLLJ(r1)
            return
        L8b:
            r1 = r5
            goto L41
        L8d:
            int r0 = r2.intValue()
            if (r0 != r3) goto Lb6
            com.bytedance.android.livesdk.model.message.ext.PopProduct r0 = r8.popProduct
            if (r0 == 0) goto Lb4
            long r0 = r0.productId
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L9d:
            X.17wq r0 = r7.LIZ
            X.17xY r0 = r0.LJJIJIIJI()
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL
            if (r0 == 0) goto Lad
            long r0 = r0.productId
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        Lad:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r5)
            if (r0 == 0) goto Lb6
            goto L7b
        Lb4:
            r2 = r5
            goto L9d
        Lb6:
            r3 = 0
            goto L7b
        Lb8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L1c
        Lbe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21198917xb.LJI(com.bytedance.android.livesdk.model.message.ext.ECommerceMessage, kotlin.jvm.internal.AwS398S0200000_32):void");
    }

    @Override // X.AbstractC21196217xA
    public final void LJ(PopProductResp popProductResp, boolean z, boolean z2, boolean z3) {
        LJIIL();
        this.LJ = z3;
        PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO != null) {
            LJIILIIL(popupCardVO);
        }
    }
}
