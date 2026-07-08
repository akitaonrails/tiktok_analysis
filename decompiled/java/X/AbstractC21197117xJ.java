package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.android.livesdk.model.message.ProductAtmosphereTag;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONObject;
import webcast.data.oec_msg.AtmosphereInfo;
import webcast.data.oec_msg.BagIndex;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.ShopBrandLogo;
import webcast.data.oec_msg.Title;

/* JADX INFO: renamed from: X.17xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21197117xJ extends AbstractC21198617xY<AbstractC21202217y8> implements C181I {
    public final Map<String, String> LLJJIII;
    public final C21194817ww LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 763));
    public final C21203817yO LLJJIJIL = new C21203817yO();
    public ISeaLiveContextAbility LLJJJ;
    public C21200317xp LLJJJIL;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return null;
    }

    @Override // X.C181I
    public void LJ() {
    }

    @Override // X.InterfaceC21184117vD
    public void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
    }

    public abstract boolean LJJJ();

    public void LJJJI(PopupCardVO popupCardVO, C1743900vTw c1743900vTw, Context context) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // X.AbstractC21198617xY
    public final Map LJJIIZ() {
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            return abstractC21202217y8.getPromotionLogoDaInfo();
        }
        return null;
    }

    public final Map<String, String> LJJIZ() {
        Map<String, String> commonShowParams;
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        return (abstractC21202217y8 == null || (commonShowParams = abstractC21202217y8.getCommonShowParams()) == null) ? C2097608Jq.LJ() : commonShowParams;
    }

    @Override // X.C181I
    public final void LJIJJLI(String str) {
        String strLIZJ;
        String strLIZJ2;
        String string;
        boolean zLIZLLL;
        boolean zLIZLLL2;
        boolean zLIZLLL3;
        EnumC21193117wf enumC21193117wf = EnumC21193117wf.DISMISS_BY_EXCEPTION;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("live_role")) == null) {
            strLIZJ = "";
        }
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        Integer numValueOf = null;
        if (c1743900vTw2 != null) {
            strLIZJ2 = c1743900vTw2.LIZJ("room_id");
        } else {
            strLIZJ2 = null;
        }
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null) {
            string = Long.valueOf(popupCardVO.productId).toString();
        } else {
            string = null;
        }
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        boolean zIsFromMessage = false;
        if (c1743900vTw3 != null) {
            zLIZLLL = c1743900vTw3.LIZLLL("is_page_visible");
        } else {
            zLIZLLL = false;
        }
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        if (c1743900vTw4 != null) {
            zLIZLLL2 = c1743900vTw4.LIZLLL("is_keyboard_showing");
        } else {
            zLIZLLL2 = false;
        }
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        if (c1743900vTw5 != null) {
            zLIZLLL3 = c1743900vTw5.LIZLLL("has_permission");
        } else {
            zLIZLLL3 = false;
        }
        PopupCardVO popupCardVO2 = this.LL;
        if (popupCardVO2 != null) {
            zIsFromMessage = popupCardVO2.isFromMessage();
        }
        PopupCardVO popupCardVO3 = this.LL;
        if (popupCardVO3 != null) {
            numValueOf = Integer.valueOf(popupCardVO3.cardType);
        }
        C21192717wb.LIZ(enumC21193117wf, strLIZJ, strLIZJ2, string, zLIZLLL, zLIZLLL2, zLIZLLL3, zIsFromMessage, numValueOf, null, null, str, 1536);
    }

    @Override // X.AbstractC21198617xY
    public void LJJIFFI(String str) {
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.LLILLJJLI = null;
            abstractC21202217y8.e0();
        }
        this.LLILZIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC21198617xY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIJIIJI(final android.content.Context r23) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21197117xJ.LJJIJIIJI(android.content.Context):android.view.View");
    }

    @Override // X.AbstractC21198617xY
    public void LJJIJIIJIL(boolean z) {
        AbstractC21202217y8 abstractC21202217y8;
        if (z && (abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL) != null) {
            LJJJIL(abstractC21202217y8, false);
        }
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJILLIZJL(boolean z) {
        InterfaceC21184117vD interfaceC21184117vD;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21184117vD) && (interfaceC21184117vD = (InterfaceC21184117vD) t) != null) {
            interfaceC21184117vD.LJJLIIIJILLIZJL(z);
        }
    }

    @Override // X.InterfaceC21147917pN
    public final Map<String, String> LLJJLIIIJLLLLLLLZ(int i) {
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            return abstractC21202217y8.LLJJLIIIJLLLLLLLZ(i);
        }
        return null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC21184117vD
    public void b0(ProductItem productItem) {
        List<AtmosphereInfo.Tag> list;
        String strLIZJ;
        String str;
        long j;
        int i;
        ImageModel imageModel;
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null) {
            BagIndex bagIndex = productItem.bagIndex;
            if (bagIndex != null) {
                popupCardVO.setBagIndex(bagIndex.value);
            }
            Title title = productItem.title;
            if (title != null) {
                popupCardVO.setTitle(title.text);
            }
            if (!popupCardVO.hasElasticImg && (imageModel = productItem.cover) != null) {
                String str2 = (String) C13LP.LJJJLL(imageModel.getUrls());
                if (str2 == null) {
                    str2 = "";
                }
                if (C703302op.LIZ(str2)) {
                    popupCardVO.setImageUrl(str2);
                    popupCardVO.setImageUrlKey(str2);
                }
            }
            ShopBrandLogo shopBrandLogo = productItem.shopBrandLogo;
            if (shopBrandLogo != null) {
                popupCardVO.setEnhancedBrandLogo(C0132001y.LIZ(shopBrandLogo));
            }
            AtmosphereInfo atmosphereInfo = productItem.atmosphereInfo;
            if (atmosphereInfo != null && (list = atmosphereInfo.tags) != null) {
                for (AtmosphereInfo.Tag tag : list) {
                    C1743900vTw c1743900vTw = this.LLIZLLLIL;
                    if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
                        strLIZJ = "";
                    }
                    AtmosphereTagInfo atmosphereTagInfo = new AtmosphereTagInfo();
                    atmosphereTagInfo.tagType = tag.type;
                    if (tag.status != 2) {
                        ProductAtmosphereTag productAtmosphereTag = new ProductAtmosphereTag();
                        productAtmosphereTag.tagDesc = tag.desc;
                        productAtmosphereTag.count = tag.count;
                        productAtmosphereTag.productId = String.valueOf(popupCardVO.productId);
                        atmosphereTagInfo.atmosphereTags = C1697810uHb.LJIILJJIL(productAtmosphereTag);
                    }
                    if (!C703302op.LIZ(strLIZJ) || C21195317x1.LIZ(atmosphereTagInfo.tagType, strLIZJ)) {
                        AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, atmosphereTagInfo, 102);
                        List<ProductAtmosphereTag> list2 = atmosphereTagInfo.atmosphereTags;
                        ArrayList arrayList = new ArrayList();
                        for (ProductAtmosphereTag productAtmosphereTag2 : list2) {
                            if (CastLongProtector.parseLong(productAtmosphereTag2.productId) == popupCardVO.productId) {
                                arrayList.add(productAtmosphereTag2);
                            }
                        }
                        Object obj = null;
                        Long lValueOf = null;
                        if (!arrayList.isEmpty()) {
                            AtmosphereTag atmosphereTag = new AtmosphereTag();
                            atmosphereTag.tagType = atmosphereTagInfo.tagType;
                            ProductAtmosphereTag productAtmosphereTag3 = (ProductAtmosphereTag) C13LP.LJJJLZIJ(0, arrayList);
                            if (productAtmosphereTag3 == null || (str = productAtmosphereTag3.tagDesc) == null) {
                                str = "";
                            }
                            atmosphereTag.LJ(str);
                            ProductAtmosphereTag productAtmosphereTag4 = (ProductAtmosphereTag) C13LP.LJJJLZIJ(0, arrayList);
                            if (productAtmosphereTag4 != null) {
                                j = productAtmosphereTag4.count;
                            } else {
                                j = 0;
                            }
                            atmosphereTag.count = j;
                            atmosphereTag.LJII = String.valueOf(popupCardVO.productId);
                            atmosphereTag.LIZIZ = popupCardVO.showAtmosphereBeginMilliSecond;
                            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
                            if (flashSaleAtmosphereInfo != null) {
                                i = flashSaleAtmosphereInfo.creatorLimitType;
                            } else {
                                i = 0;
                            }
                            atmosphereTag.LIZJ = i;
                            if (flashSaleAtmosphereInfo != null) {
                                lValueOf = Long.valueOf(flashSaleAtmosphereInfo.activityId);
                            }
                            atmosphereTag.LJFF = lValueOf;
                            obj = atmosphereTag;
                        }
                        int i2 = atmosphereTagInfo.tagType;
                        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                            List<AtmosphereTag> list3 = popupCardVO.atmosphereTags;
                            ArrayList arrayList2 = new ArrayList();
                            for (AtmosphereTag atmosphereTag2 : list3) {
                                if (atmosphereTag2.tagType == atmosphereTagInfo.tagType) {
                                    arrayList2.add(atmosphereTag2);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                popupCardVO.atmosphereTags.remove(it2.next());
                            }
                            if (obj != null) {
                                popupCardVO.atmosphereTags.add((AtmosphereTag) obj);
                            }
                            awS398S0200000_32.invoke(obj);
                        }
                    }
                }
            }
        }
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.b0(productItem);
        }
    }

    public AbstractC21197117xJ(Map<String, String> map, C21194817ww c21194817ww) {
        this.LLJJIII = map;
        this.LLJJIJI = c21194817ww;
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJIIZI(String str, Img img) {
        InterfaceC21184117vD interfaceC21184117vD;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21184117vD) && (interfaceC21184117vD = (InterfaceC21184117vD) t) != null) {
            interfaceC21184117vD.LJJIIZI(str, img);
        }
    }

    @Override // X.AbstractC21198617xY
    public final void LJJIJ(int i, AtmosphereTag atmosphereTag) {
        AbstractC21202217y8 abstractC21202217y8 = (AbstractC21202217y8) this.LLILZIL;
        if (abstractC21202217y8 != null) {
            abstractC21202217y8.LLJJ(i, atmosphereTag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void LJJJIL(AbstractC21202217y8 abstractC21202217y8, boolean z) {
        String str;
        PopupCardVO popupCardVO = this.LL;
        if (popupCardVO != null) {
            C1743900vTw c1743900vTw = this.LLIZLLLIL;
            if (c1743900vTw != null) {
                if (popupCardVO.cardType == 2) {
                    str = "live_popup_list";
                } else {
                    str = "live_popup_card";
                }
                c1743900vTw.LJIIIIZZ("entrance_form", str, false);
            } else {
                c1743900vTw = null;
            }
            abstractC21202217y8.i0(popupCardVO, c1743900vTw, this.LLJI, z, LJJJ(), this.LLILLL);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ecom_enable_repeat_prefetch_pdp_when_live_card_show", false) || !popupCardVO.hasPrefetched) {
                popupCardVO.setHasPrefetched(true);
                LJJJI(popupCardVO, this.LLIZLLLIL, abstractC21202217y8.getContext());
            }
        }
    }

    @Override // X.InterfaceC21184117vD
    public void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str) {
        InterfaceC21184117vD interfaceC21184117vD;
        T t = this.LLILZIL;
        if (t != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onProductRefresh");
            T t2 = this.LLILZIL;
            if ((t2 instanceof InterfaceC21184117vD) && (interfaceC21184117vD = (InterfaceC21184117vD) t2) != null) {
                interfaceC21184117vD.LJJLIIIJLJLI(popupCardVO, str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, X.0sYq] */
    @Override // X.C181I
    public void LIZ(String str, Product product, Integer num) {
        ?? r1 = this.LLJ;
        if (r1 != 0) {
            r1.invoke(str, product, null);
        }
    }

    @Override // X.C181I
    public final void LJIILLIIL(PopupCardVO popupCardVO, boolean z, boolean z2, boolean z3, long j) {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        long jLIZ;
        String str;
        C1743900vTw c1743900vTw = this.LLIZLLLIL;
        String strLIZJ4 = null;
        if (c1743900vTw != null) {
            strLIZJ = c1743900vTw.LIZJ("room_id");
        } else {
            strLIZJ = null;
        }
        C1743900vTw c1743900vTw2 = this.LLIZLLLIL;
        if (c1743900vTw2 != null) {
            strLIZJ2 = c1743900vTw2.LIZJ("author_id");
        } else {
            strLIZJ2 = null;
        }
        C1743900vTw c1743900vTw3 = this.LLIZLLLIL;
        if (c1743900vTw3 != null) {
            strLIZJ3 = c1743900vTw3.LIZJ("page_name");
        } else {
            strLIZJ3 = null;
        }
        C1743900vTw c1743900vTw4 = this.LLIZLLLIL;
        if (c1743900vTw4 != null) {
            jLIZ = c1743900vTw4.LIZ("api_end_time");
        } else {
            jLIZ = 0;
        }
        C1743900vTw c1743900vTw5 = this.LLIZLLLIL;
        if (c1743900vTw5 != null) {
            strLIZJ4 = c1743900vTw5.LIZJ("live_role");
        }
        String str2 = "message";
        if (z3) {
            C21194817ww c21194817ww = this.LLJJIJI;
            String strValueOf = String.valueOf(popupCardVO.productId);
            String str3 = popupCardVO.imageUrl;
            String str4 = popupCardVO.fromMessageId;
            if (!popupCardVO.isFromMessage()) {
                str2 = "pop";
            }
            c21194817ww.LIZJ(strValueOf, strLIZJ, str3, str4, str2, j, strLIZJ3, strLIZJ2, "1", System.currentTimeMillis() - jLIZ, z2, z, strLIZJ4);
            return;
        }
        C21194817ww c21194817ww2 = this.LLJJIJI;
        String strValueOf2 = String.valueOf(popupCardVO.productId);
        String str5 = popupCardVO.imageUrl;
        String str6 = popupCardVO.fromMessageId;
        if (popupCardVO.isFromMessage()) {
            str = "message";
        } else {
            str = "pop";
        }
        c21194817ww2.LIZJ(strValueOf2, strLIZJ, str5, str6, str, j, strLIZJ3, strLIZJ2, CardStruct.IStatusCode.DEFAULT, System.currentTimeMillis() - jLIZ, z2, z, strLIZJ4);
        String strValueOf3 = String.valueOf(popupCardVO.productId);
        String str7 = popupCardVO.imageUrl;
        String str8 = popupCardVO.fromMessageId;
        if (!popupCardVO.isFromMessage()) {
            str2 = "pop";
        }
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", strValueOf3);
            jSONObject.put("room_id", strLIZJ);
            jSONObject.put("image_url", str7);
            jSONObject.put("message_id", str8);
            jSONObject.put("from", str2);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_pin_image_show_fail", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
