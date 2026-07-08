package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.android.livesdk.model.message.ProductAtmosphereTag;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONObject;
import webcast.data.oec_msg.AtmosphereInfo;
import webcast.data.oec_msg.BagIndex;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.ShopBrandLogo;
import webcast.data.oec_msg.Title;

/* JADX INFO: renamed from: X.17xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21197217xK extends AbstractC21198517xX<AbstractC21202917yF> implements InterfaceC212166181c {
    public final Map<String, String> LLJJI;
    public final C21194917wx LLJJIII;
    public UsBidViewModel LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 881));
    public final C21203917yP LLJJIJIL = new C21203917yP();

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return null;
    }

    public abstract boolean LJJJ();

    public void LJJJI(UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw, Context context) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // X.AbstractC21198517xX
    public final Map LJJII() {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            return abstractC21202917yF.getPromotionLogoDaInfo();
        }
        return null;
    }

    public final Map<String, String> LJJIZ() {
        Map<String, String> commonShowParams;
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        return (abstractC21202917yF == null || (commonShowParams = abstractC21202917yF.getCommonShowParams()) == null) ? C2097608Jq.LJ() : commonShowParams;
    }

    @Override // X.AbstractC21198517xX
    public void LJIJJLI(String str) {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.LLILLJJLI = null;
            abstractC21202917yF.e0();
        }
        this.LLILZIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0262 A[PHI: r2
      0x0262: PHI (r2v2 boolean) = (r2v1 boolean), (r2v4 boolean), (r2v4 boolean), (r2v4 boolean), (r2v4 boolean), (r2v4 boolean) binds: [B:152:0x025f, B:135:0x022f, B:137:0x0234, B:139:0x0238, B:141:0x023c, B:143:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v81, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.AbstractC21198517xX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIIZ(final android.content.Context r24) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21197217xK.LJJIIZ(android.content.Context):android.view.View");
    }

    @Override // X.AbstractC21198517xX
    public void LJJIJ(boolean z) {
        AbstractC21202917yF abstractC21202917yF;
        if (z && (abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL) != null) {
            LJJJIL(abstractC21202917yF, false);
        }
    }

    @Override // X.AbstractC21198517xX
    public final void LJJIJIIJI(Boolean bool) {
        UsBidViewModel usBidViewModel = this.LLJJIJI;
        if (usBidViewModel != null) {
            usBidViewModel.LLJJJJ = bool;
        }
    }

    @Override // X.AbstractC21198517xX
    public final void LJJIJLIJ(String str) {
        UsBidViewModel usBidViewModel = this.LLJJIJI;
        if (usBidViewModel != null) {
            usBidViewModel.LL = str;
        }
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJLIIIJILLIZJL(boolean z) {
        InterfaceC21184217vE interfaceC21184217vE;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21184217vE) && (interfaceC21184217vE = (InterfaceC21184217vE) t) != null) {
            interfaceC21184217vE.LJJLIIIJILLIZJL(z);
        }
    }

    @Override // X.InterfaceC1865210ydb
    public final Map<String, String> LJLLL(String str) {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            return abstractC21202917yF.LJLLL(str);
        }
        return null;
    }

    public AbstractC21197217xK(Map<String, String> map, C21194917wx c21194917wx) {
        this.LLJJI = map;
        this.LLJJIII = c21194917wx;
    }

    @Override // X.AbstractC21198517xX
    public final void LJJIII(int i, AtmosphereTag atmosphereTag) {
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.A(i, atmosphereTag);
        }
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJIIZI(String str, Img img) {
        InterfaceC21184217vE interfaceC21184217vE;
        T t = this.LLILZIL;
        if ((t instanceof InterfaceC21184217vE) && (interfaceC21184217vE = (InterfaceC21184217vE) t) != null) {
            interfaceC21184217vE.LJJIIZI(str, img);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.09AY, kotlin.jvm.functions.Function2] */
    public final void LJJJIL(AbstractC21202917yF abstractC21202917yF, boolean z) {
        String str;
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null) {
            C1743900vTw c1743900vTw = this.LLIZLLLIL;
            if (c1743900vTw != null) {
                int i = usPopupCardVO.cardType;
                if (i != 2) {
                    if (i != 3) {
                        str = "live_popup_card";
                    } else {
                        str = "live_popup_coupon_card";
                    }
                } else {
                    str = "live_popup_list";
                }
                c1743900vTw.LJIIIIZZ("entrance_form", str, false);
            } else {
                c1743900vTw = null;
            }
            abstractC21202917yF.j0(usPopupCardVO, c1743900vTw, this.LLJI, z, LJJJ(), this.LLILLL);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ecom_enable_repeat_prefetch_pdp_when_live_card_show", false) || !usPopupCardVO.hasPrefetched) {
                usPopupCardVO.setHasPrefetched(true);
                LJJJI(usPopupCardVO, this.LLIZLLLIL, abstractC21202917yF.getContext());
                return;
            }
            return;
        }
        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, null, C2097608Jq.LJ());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC21184217vE
    public void U(ProductItem productItem, C1563990qnl c1563990qnl) {
        List<AtmosphereInfo.Tag> list;
        String strLIZJ;
        String str;
        long j;
        int i;
        ImageModel imageModel;
        UsPopupCardVO usPopupCardVO = this.LL;
        if (usPopupCardVO != null) {
            BagIndex bagIndex = productItem.bagIndex;
            if (bagIndex != null) {
                usPopupCardVO.setBagIndex(bagIndex.value);
            }
            Title title = productItem.title;
            if (title != null) {
                usPopupCardVO.setTitle(title.text);
            }
            if (!usPopupCardVO.hasElasticImg && (imageModel = productItem.cover) != null) {
                String str2 = (String) C13LP.LJJJLL(imageModel.getUrls());
                if (str2 == null) {
                    str2 = "";
                }
                if (C703302op.LIZ(str2)) {
                    usPopupCardVO.setImageUrl(str2);
                    usPopupCardVO.setImageUrlKey(str2);
                }
            }
            ShopBrandLogo shopBrandLogo = productItem.shopBrandLogo;
            if (shopBrandLogo != null) {
                usPopupCardVO.setEnhancedBrandLogo(C0132001y.LIZ(shopBrandLogo));
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
                        productAtmosphereTag.productId = String.valueOf(usPopupCardVO.productId);
                        atmosphereTagInfo.atmosphereTags = C1697810uHb.LJIILJJIL(productAtmosphereTag);
                    }
                    if (!C703302op.LIZ(strLIZJ) || C21195417x2.LIZ(atmosphereTagInfo.tagType, strLIZJ)) {
                        AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, atmosphereTagInfo, 109);
                        List<ProductAtmosphereTag> list2 = atmosphereTagInfo.atmosphereTags;
                        ArrayList arrayList = new ArrayList();
                        for (ProductAtmosphereTag productAtmosphereTag2 : list2) {
                            if (CastLongProtector.parseLong(productAtmosphereTag2.productId) == usPopupCardVO.productId) {
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
                            atmosphereTag.LJII = String.valueOf(usPopupCardVO.productId);
                            atmosphereTag.LIZIZ = usPopupCardVO.showAtmosphereBeginMilliSecond;
                            atmosphereTag.LJI = usPopupCardVO.weakenLiveFlashSaleAtmosphere;
                            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
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
                            List<AtmosphereTag> list3 = usPopupCardVO.atmosphereTags;
                            ArrayList arrayList2 = new ArrayList();
                            for (AtmosphereTag atmosphereTag2 : list3) {
                                if (atmosphereTag2.tagType == atmosphereTagInfo.tagType) {
                                    arrayList2.add(atmosphereTag2);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                usPopupCardVO.atmosphereTags.remove(it2.next());
                            }
                            if (obj != null) {
                                usPopupCardVO.atmosphereTags.add((AtmosphereTag) obj);
                            }
                            awS398S0200000_32.invoke(obj);
                        }
                    }
                }
            }
        }
        AbstractC21202917yF abstractC21202917yF = (AbstractC21202917yF) this.LLILZIL;
        if (abstractC21202917yF != null) {
            abstractC21202917yF.U(productItem, c1563990qnl);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.InterfaceC21184217vE
    public void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map) {
        InterfaceC21184217vE interfaceC21184217vE;
        T t = this.LLILZIL;
        if (t != 0 && t.getParent() != null && t.isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onProductRefresh");
            T t2 = this.LLILZIL;
            if ((t2 instanceof InterfaceC21184217vE) && (interfaceC21184217vE = (InterfaceC21184217vE) t2) != null) {
                interfaceC21184217vE.u(usPopupCardVO, str, map);
            }
            ?? r1 = this.LLJILJILJ;
            if (r1 != 0) {
                r1.invoke(Boolean.FALSE);
            }
        }
    }

    @Override // X.InterfaceC212166181c
    public final void LJIILLIIL(UsPopupCardVO usPopupCardVO, boolean z, boolean z2, boolean z3, long j) {
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
            C21194917wx c21194917wx = this.LLJJIII;
            String strValueOf = String.valueOf(usPopupCardVO.productId);
            String str3 = usPopupCardVO.imageUrl;
            String str4 = usPopupCardVO.fromMessageId;
            if (!usPopupCardVO.isFromMessage()) {
                str2 = "pop";
            }
            c21194917wx.LIZJ(strValueOf, strLIZJ, str3, str4, str2, j, strLIZJ3, strLIZJ2, "1", System.currentTimeMillis() - jLIZ, z2, z, strLIZJ4);
            return;
        }
        C21194917wx c21194917wx2 = this.LLJJIII;
        String strValueOf2 = String.valueOf(usPopupCardVO.productId);
        String str5 = usPopupCardVO.imageUrl;
        String str6 = usPopupCardVO.fromMessageId;
        if (usPopupCardVO.isFromMessage()) {
            str = "message";
        } else {
            str = "pop";
        }
        c21194917wx2.LIZJ(strValueOf2, strLIZJ, str5, str6, str, j, strLIZJ3, strLIZJ2, CardStruct.IStatusCode.DEFAULT, System.currentTimeMillis() - jLIZ, z2, z, strLIZJ4);
        String strValueOf3 = String.valueOf(usPopupCardVO.productId);
        String str7 = usPopupCardVO.imageUrl;
        String str8 = usPopupCardVO.fromMessageId;
        if (!usPopupCardVO.isFromMessage()) {
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
