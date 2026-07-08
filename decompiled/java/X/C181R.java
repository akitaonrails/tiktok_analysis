package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.StatusRetryCfg;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS309S0300000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.oec_msg.AuctionInfo;
import webcast.data.oec_msg.ExtendAuctionCfg;
import webcast.data.oec_msg.PriceItem;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.UserInfo;

/* JADX INFO: renamed from: X.181R, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C181R extends AbstractC21202917yF implements C181X {
    public final UsBidViewModel LLILZIL;
    public final LifecycleOwner LLILZLL;
    public final boolean LLIZ;
    public AbstractC212300186g LLIZLLLIL;
    public View LLJ;
    public final C01GW LLJI;
    public TuxSheet LLJIJIL;

    @Override // X.InterfaceC21197417xM
    public final void A(int i, C184F c184f) {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJIIZI(String str, Img img) {
    }

    @Override // X.InterfaceC21197417xM
    public final void LJJIL() {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJLIIIJILLIZJL(boolean z) {
    }

    @Override // X.InterfaceC21184217vE
    public final boolean LLLLLZ() {
        return false;
    }

    @Override // X.AbstractC21202917yF
    public Map<String, String> getCommonShowParams() {
        C1743900vTw c1743900vTw;
        UsPopupCardVO usPopupCardVO;
        AuctionData auctionData;
        Map<String, Object> map;
        UsPopupCardVO usPopupCardVO2;
        AuctionData auctionData2;
        SurpriseSetData surpriseSetData;
        Long l;
        UsPopupCardVO usPopupCardVO3;
        AuctionData auctionData3;
        SurpriseSetData surpriseSetData2;
        Long l2;
        UsPopupCardVO usPopupCardVO4;
        AuctionData auctionData4;
        C181U c181u;
        C181U c181u2;
        UsPopupCardVO usPopupCardVO5;
        AuctionData auctionData5;
        ExtendAuctionCfg extendAuctionCfg;
        C181U c181u3;
        String str;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("buy_type", CardStruct.IStatusCode.DEFAULT));
        UsBidViewModel usBidViewModel = this.LLILZIL;
        if (usBidViewModel != null && (c181u3 = usBidViewModel.LLJIJIL) != null && (str = c181u3.LJIIJJI) != null) {
            mapLJIIJ.put("auction_id", str);
        }
        UsBidViewModel usBidViewModel2 = this.LLILZIL;
        mapLJIIJ.put("is_extended_auction", String.valueOf((usBidViewModel2 == null || (usPopupCardVO5 = usBidViewModel2.LLILLJJLI) == null || (auctionData5 = usPopupCardVO5.auctionData) == null || (extendAuctionCfg = auctionData5.extendAuctionCfg) == null) ? null : C19673811yC.LIZJ(extendAuctionCfg)));
        UsBidViewModel usBidViewModel3 = this.LLILZIL;
        if (usBidViewModel3 != null && (c181u2 = usBidViewModel3.LLJIJIL) != null && c181u2.LJI == 10) {
            mapLJIIJ.put("label_type", "live_auction_ongoing");
        }
        UsBidViewModel usBidViewModel4 = this.LLILZIL;
        String str2 = "";
        mapLJIIJ.put("auction_status", (usBidViewModel4 == null || (c181u = usBidViewModel4.LLJIJIL) == null) ? "" : C19673811yC.LIZ(c181u.LJI));
        UsBidViewModel usBidViewModel5 = this.LLILZIL;
        mapLJIIJ.put("auction_type", (usBidViewModel5 == null || (usPopupCardVO4 = usBidViewModel5.LLILLJJLI) == null || (auctionData4 = usPopupCardVO4.auctionData) == null) ? "" : C19673811yC.LIZIZ(auctionData4.auctionType));
        UsBidViewModel usBidViewModel6 = this.LLILZIL;
        long jLongValue = 1;
        mapLJIIJ.put("auction_info_all", String.valueOf((usBidViewModel6 == null || (usPopupCardVO3 = usBidViewModel6.LLILLJJLI) == null || (auctionData3 = usPopupCardVO3.auctionData) == null || (surpriseSetData2 = auctionData3.surpriseSetData) == null || (l2 = surpriseSetData2.totalStock) == null) ? 1L : l2.longValue()));
        UsBidViewModel usBidViewModel7 = this.LLILZIL;
        if (usBidViewModel7 != null && (usPopupCardVO2 = usBidViewModel7.LLILLJJLI) != null && (auctionData2 = usPopupCardVO2.auctionData) != null && (surpriseSetData = auctionData2.surpriseSetData) != null && (l = surpriseSetData.remainingStock) != null) {
            jLongValue = l.longValue();
        }
        mapLJIIJ.put("auction_info_left", String.valueOf(jLongValue));
        UsBidViewModel usBidViewModel8 = this.LLILZIL;
        if (usBidViewModel8 != null && (usPopupCardVO = usBidViewModel8.LLILLJJLI) != null && (auctionData = usPopupCardVO.auctionData) != null && (map = auctionData.auctionDaInfo) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                mapLJIIJ.put(entry.getKey(), entry.getValue().toString());
            }
        }
        UsBidViewModel usBidViewModel9 = this.LLILZIL;
        if (usBidViewModel9 != null && (c1743900vTw = usBidViewModel9.LLIZ) != null) {
            String str3 = (String) ((LinkedHashMap) mapLJIIJ).get("product_id");
            if (str3 == null) {
                str3 = "";
            }
            String strLIZ = C181T.LIZ(c1743900vTw, str3);
            if (strLIZ != null) {
                str2 = strLIZ;
            }
        }
        mapLJIIJ.put("entrance_info", str2);
        return mapLJIIJ;
    }

    @Override // X.AbstractC21202917yF
    public final boolean h0() {
        return false;
    }

    @Override // X.C181X
    public final void ky(UsPopupCardVO usPopupCardVO) {
    }

    @Override // X.AbstractC21202917yF
    public void setAtmosphereTags(List<C184F> list) {
    }

    public final void B0() {
        try {
            TuxSheet tuxSheet = this.LLJIJIL;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final String getUserId() {
        return (String) this.LLJI.getValue();
    }

    public void p0() {
        MutableLiveData<Boolean> mutableLiveData;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        if (usBidViewModel == null || (mutableLiveData = usBidViewModel.LLJ) == null) {
            return;
        }
        mutableLiveData.postValue(Boolean.FALSE);
    }

    public void s0() {
        MutableLiveData<Boolean> mutableLiveData;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        if (usBidViewModel == null || (mutableLiveData = usBidViewModel.LLJI) == null) {
            return;
        }
        mutableLiveData.postValue(Boolean.FALSE);
    }

    public void z0() {
        C786410Ut5.I7(new C19LP(this, 8), this);
    }

    @Override // X.AbstractC21202917yF
    public void e0() {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        super.e0();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_live_pop_card_close", C786410Ut5.J3(new JSONObject()));
        }
        UsBidViewModel usBidViewModel = this.LLILZIL;
        if (usBidViewModel != null && (mutableLiveData2 = usBidViewModel.LLJI) != null) {
            mutableLiveData2.postValue(Boolean.TRUE);
        }
        UsBidViewModel usBidViewModel2 = this.LLILZIL;
        if (usBidViewModel2 != null && (mutableLiveData = usBidViewModel2.LLJ) != null) {
            mutableLiveData.postValue(Boolean.TRUE);
        }
        AbstractC212300186g abstractC212300186g = this.LLIZLLLIL;
        if (abstractC212300186g != null) {
            C0NOH c0noh = abstractC212300186g.LLILZLL;
            if (c0noh != null) {
                c0noh.LIZJ();
            }
            abstractC212300186g.LL.clear();
            abstractC212300186g.LLILLJJLI.clear();
            AnonymousClass1875 anonymousClass1875 = abstractC212300186g.LLJILJIL;
            if (anonymousClass1875 != null) {
                anonymousClass1875.LJL();
            }
        }
        B0();
        UsBidViewModel usBidViewModel3 = this.LLILZIL;
        if (usBidViewModel3 != null) {
            ((ArrayList) usBidViewModel3.LLJILJILJ).remove(this);
        }
    }

    @Override // X.AbstractC21202917yF
    public Map<String, String> getPromotionLogoDaInfo() {
        return C2097608Jq.LJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        UsBidViewModel usBidViewModel;
        super.onAttachedToWindow();
        AbstractC212300186g abstractC212300186g = this.LLIZLLLIL;
        if (abstractC212300186g != null && (usBidViewModel = this.LLILZIL) != null) {
            usBidViewModel.CQ2(abstractC212300186g);
        }
        UsBidViewModel usBidViewModel2 = this.LLILZIL;
        if (usBidViewModel2 != null) {
            ((ArrayList) usBidViewModel2.LLJILJILJ).add(this);
        }
    }

    public final AbstractC212300186g getBidCardView() {
        return this.LLIZLLLIL;
    }

    public final UsBidViewModel getBidVM() {
        return this.LLILZIL;
    }

    public final View getIconClose() {
        return this.LLJ;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC21202917yF, X.InterfaceC21184217vE
    public List<String> getProductShowIds() {
        return C13BV.INSTANCE;
    }

    public final TuxSheet getTuxSheet() {
        return this.LLJIJIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // X.C181X
    public final void Hi(UsPopupCardVO usPopupCardVO) {
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_data_received_from_fallback_refresh", usBidViewModel, null);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("usbid", "updatePopInfo");
        if (usPopupCardVO != null) {
            u0(usPopupCardVO, false);
        }
    }

    public final void setBidCardView(AbstractC212300186g abstractC212300186g) {
        this.LLIZLLLIL = abstractC212300186g;
    }

    public final void setIconClose(View view) {
        this.LLJ = view;
    }

    public final void setTuxSheet(TuxSheet tuxSheet) {
        this.LLJIJIL = tuxSheet;
    }

    @Override // X.InterfaceC21184217vE
    public final void U(ProductItem productItem, C1563990qnl c1563990qnl) {
        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, c1563990qnl, C2097608Jq.LJ());
    }

    @Override // X.AbstractC21202917yF
    public final void i0(AuctionInfo auctionInfo, C1563990qnl c1563990qnl) {
        boolean z;
        boolean z2;
        long jLJJJJZI;
        AuctionData auctionData;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        UsPopupCardVO usPopupCardVO;
        AuctionData auctionData2;
        String string;
        C181U c181u;
        SinglePriceItem singlePriceItem;
        SinglePriceItem singlePriceItem2;
        SinglePriceItem singlePriceItem3;
        SinglePriceItem singlePriceItem4;
        UserInfo userInfo;
        long jLJJJJZI2;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, c1563990qnl, C2097608Jq.LJ());
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_message_refresh", usBidViewModel, null);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("usbid", "refresh by message");
        UsBidViewModel usBidViewModel2 = this.LLILZIL;
        if (usBidViewModel2 != null) {
            if (((Boolean) usBidViewModel2.LLJJL.getValue()).booleanValue()) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
                    jLJJJJZI2 = interfaceC20673515v3K42.LJJJJZI();
                } else {
                    jLJJJJZI2 = 0;
                }
                C21198117xT.LIZ("auction_message_refresh_disabled", usBidViewModel2, C2097908Jt.LIZJ(new Pair("message_time_gap", String.valueOf(jLJJJJZI2 - (auctionInfo.versionTime / 1000000)))));
                return;
            }
            long j = auctionInfo.versionTime;
            long j2 = usBidViewModel2.LLJJIJI;
            if (j == j2) {
                z = true;
            } else {
                z = false;
            }
            int i2 = auctionInfo.auctionTextTypeInt;
            if (i2 == 12) {
                z2 = true;
            } else {
                z2 = false;
            }
            Long l = null;
            if (!z2 && i2 != 13) {
                if (j < j2) {
                    return;
                }
                usBidViewModel2.LLJJIJI = j;
                C181U c181u2 = usBidViewModel2.LLJIJIL;
                if (c181u2 != null) {
                    c181u2.LIZ = j;
                }
                usBidViewModel2.FQ2(auctionInfo);
                UserInfo userInfo2 = auctionInfo.auctionWinner;
                if (userInfo2 != null) {
                    string = Long.valueOf(userInfo2.userId).toString();
                } else {
                    string = null;
                }
                if ((!Intrinsics.LJFF(string, usBidViewModel2.LLJJIII.getValue()) || (userInfo = auctionInfo.auctionWinner) == null || Long.valueOf(userInfo.userId) == null) && (c181u = usBidViewModel2.LLJIJIL) != null) {
                    c181u.LJ = Boolean.FALSE;
                    c181u.LJFF = null;
                }
                PriceItem priceItem = auctionInfo.winnerBidPrice;
                if (priceItem != null) {
                    SinglePriceItem singlePriceItemEQ2 = UsBidViewModel.EQ2(priceItem);
                    if (C1533950q1J.LJ(singlePriceItemEQ2.salePriceDecimal) && C1533950q1J.LJ(singlePriceItemEQ2.salePriceFormat)) {
                        C181U c181u3 = usBidViewModel2.LLJIJIL;
                        if (c181u3 != null && (singlePriceItem4 = c181u3.LIZJ) != null) {
                            singlePriceItem4.setSalePriceFormat(singlePriceItemEQ2.salePriceFormat);
                        }
                        C181U c181u4 = usBidViewModel2.LLJIJIL;
                        if (c181u4 != null && (singlePriceItem3 = c181u4.LIZJ) != null) {
                            singlePriceItem3.setSalePriceDecimal(singlePriceItemEQ2.salePriceDecimal);
                        }
                    }
                }
                PriceItem priceItem2 = auctionInfo.nextBidPrice;
                if (priceItem2 != null) {
                    SinglePriceItem singlePriceItemEQ22 = UsBidViewModel.EQ2(priceItem2);
                    if (C1533950q1J.LJ(singlePriceItemEQ22.salePriceDecimal) && C1533950q1J.LJ(singlePriceItemEQ22.salePriceFormat)) {
                        C181U c181u5 = usBidViewModel2.LLJIJIL;
                        if (c181u5 != null && (singlePriceItem2 = c181u5.LIZLLL) != null) {
                            singlePriceItem2.setSalePriceFormat(singlePriceItemEQ22.salePriceFormat);
                        }
                        C181U c181u6 = usBidViewModel2.LLJIJIL;
                        if (c181u6 != null && (singlePriceItem = c181u6.LIZLLL) != null) {
                            singlePriceItem.setSalePriceDecimal(singlePriceItemEQ22.salePriceDecimal);
                        }
                    }
                }
            } else {
                usBidViewModel2.FQ2(auctionInfo);
            }
            C181U c181u7 = usBidViewModel2.LLJIJIL;
            if (c181u7 != null) {
                c181u7.LJIILJJIL = auctionInfo.extendAuctionCfg;
            }
            ExtendAuctionCfg extendAuctionCfg = auctionInfo.extendAuctionCfg;
            if (extendAuctionCfg != null && extendAuctionCfg.shouldExtend && (usPopupCardVO = usBidViewModel2.LLILLJJLI) != null && (auctionData2 = usPopupCardVO.auctionData) != null) {
                auctionData2.endTime = Long.valueOf(auctionInfo.endTime);
            }
            C181U c181u8 = usBidViewModel2.LLJIJIL;
            if (c181u8 != null) {
                c181u8.LJIILL = auctionInfo.drawingStateTextTypeInt;
                c181u8.LJIIIZ = auctionInfo.isCarousel;
                c181u8.LJIIJ = auctionInfo.carouselCfg;
                c181u8.LJIILLIIL = auctionInfo.scrollElementList;
                c181u8.LJIIZILJ = auctionInfo.rewardItem;
            }
            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
                jLJJJJZI = interfaceC20673515v3K4.LJJJJZI();
            } else {
                jLJJJJZI = 0;
            }
            C21198117xT.LIZ("auction_message_refresh_success", usBidViewModel2, C2097908Jt.LIZJ(new Pair("message_time_gap", String.valueOf(jLJJJJZI - (auctionInfo.versionTime / 1000000)))));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("informAuctionInfoChanged by tryUpdateAuctionData(message), productendtime=");
            UsPopupCardVO usPopupCardVO2 = usBidViewModel2.LLILLJJLI;
            if (usPopupCardVO2 != null && (auctionData = usPopupCardVO2.auctionData) != null) {
                l = auctionData.endTime;
            }
            sbLIZ.append(l);
            sbLIZ.append(" auctionDataEndtime=");
            sbLIZ.append(Long.valueOf(auctionInfo.endTime));
            sbLIZ.append(" isSameTimeStamp = ");
            sbLIZ.append(z);
            sbLIZ.append(", timeStamp=");
            sbLIZ.append(usBidViewModel2.LLJJIJI);
            C1720106oR.LJI("usbidcardend", C2188811AlT.LIZIZ(sbLIZ));
            usBidViewModel2.zQ2(usBidViewModel2.LLJIJIL);
        }
    }

    public void u0(UsPopupCardVO usPopupCardVO, boolean z) {
        InterfaceC21143117ob interfaceC21143117ob;
        Map<String, StatusRetryCfg> map;
        int i;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        C181U c181u = null;
        if (usBidViewModel != null) {
            AuctionData auctionDataVQ2 = usBidViewModel.vQ2(usPopupCardVO);
            usBidViewModel.LLJJIJIL = new C598730Ne3(ViewModelKt.getViewModelScope(usBidViewModel));
            if (auctionDataVQ2 != null) {
                map = auctionDataVQ2.statusRetryCfg;
            } else {
                map = null;
            }
            usBidViewModel.LLJJJ = map;
            C181U c181u2 = usBidViewModel.LLJIJIL;
            if (c181u2 != null) {
                i = c181u2.LJI;
            } else {
                i = 0;
            }
            usBidViewModel.wQ2(i);
            if (!z) {
                usBidViewModel.AQ2(usPopupCardVO, false);
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("UsBidViewModel", "bindPopupCardVO from refresh, informPopInfoChanged");
            }
        }
        AbstractC212300186g abstractC212300186g = this.LLIZLLLIL;
        if (abstractC212300186g != null) {
            abstractC212300186g.F0(usPopupCardVO, new AwS398S0200000_32(this, usPopupCardVO, 6), false, new AwS398S0200000_32(this, usPopupCardVO, 7), new AwS576S0100000_32(this, 29), new AwS576S0100000_32(this, 30), new AwS576S0100000_32(this, 31));
        }
        ViewParent viewParent = this.LLIZLLLIL;
        if ((viewParent instanceof InterfaceC21143117ob) && (interfaceC21143117ob = (InterfaceC21143117ob) viewParent) != null) {
            interfaceC21143117ob.setCustomButtonAction(new AwS398S0200000_32(this, usPopupCardVO, 8));
        }
        AbstractC212300186g abstractC212300186g2 = this.LLIZLLLIL;
        if (abstractC212300186g2 != null) {
            UsBidViewModel usBidViewModel2 = this.LLILZIL;
            if (usBidViewModel2 != null) {
                c181u = usBidViewModel2.LLJIJIL;
            }
            abstractC212300186g2.z0(c181u, Boolean.FALSE);
        }
        int i3 = C2187451AjH.LIZ;
        C1720106oR.LJI("usbid", "setAuctionData from refreshAuctionProduct");
        z0();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[PHI: r1
      0x00a9: PHI (r1v11 java.lang.String) = (r1v9 java.lang.String), (r1v12 java.lang.String) binds: [B:32:0x00a7, B:30:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r10, boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181R.n0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, boolean, java.lang.String):void");
    }

    @Override // X.InterfaceC21184217vE
    public final void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map) {
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_data_received_from_pop_refresh", usBidViewModel, null);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("usbid", "refreshAuctionProduct from onProductRefresh");
        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, usPopupCardVO.chainInfo, C2097608Jq.LJ());
        u0(usPopupCardVO, false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        UsPopupCardVO usPopupCardVO;
        super.onLayout(z, i, i2, i3, i4);
        if (!getShown()) {
            setShown(true);
            InterfaceC212166181c popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LJ();
            }
            UsBidViewModel usBidViewModel = this.LLILZIL;
            if (usBidViewModel != null && (usPopupCardVO = usBidViewModel.LLILLJJLI) != null) {
                n0(usPopupCardVO, true, "close");
            }
            C21198117xT c21198117xT = C21198117xT.LIZ;
            UsBidViewModel usBidViewModel2 = this.LLILZIL;
            c21198117xT.getClass();
            C21198117xT.LIZ("auction_card_display", usBidViewModel2, null);
        }
    }

    public C181R(Context context, AttributeSet attributeSet, int i, UsBidViewModel usBidViewModel, LifecycleOwner lifecycleOwner, boolean z) {
        super(context, attributeSet, i);
        this.LLILZIL = usBidViewModel;
        this.LLILZLL = lifecycleOwner;
        this.LLIZ = z;
        this.LLJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(23));
    }

    @Override // X.AbstractC21202917yF
    public final void j0(final UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw, final Function2<? super Boolean, ? super String, Unit> function2, boolean z, boolean z2, int i) {
        View view = this.LLJ;
        if (view != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.181V
                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        Function2 function22 = function2;
                        if (function22 != null) {
                            function22.invoke(Boolean.FALSE, "user_close");
                        }
                        this.n0(usPopupCardVO, false, "close");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, view);
        }
        u0(usPopupCardVO, true);
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("usbid", "refreshAuctionProduct from setPopProduct");
        UsBidViewModel usBidViewModel = this.LLILZIL;
        if (usBidViewModel != null) {
            usBidViewModel.LLIZ = c1743900vTw;
        }
    }

    public final void l0(UsPopupCardVO usPopupCardVO, String str, String str2, boolean z, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        Map<String, String> mapXQ2;
        Long l;
        AuctionData auctionData;
        n0(usPopupCardVO, false, str2);
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel = this.LLILZIL;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_card_bid_btn_click", usBidViewModel, null);
        Map<String, String> mapLIZIZ = C1739720vNC.LIZIZ(new C1741520vQ6("c5876").LIZ("d03192"), PageFinder.via((View) this));
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        UsBidViewModel usBidViewModel2 = this.LLILZIL;
        if (usBidViewModel2 != null) {
            mapXQ2 = usBidViewModel2.xQ2(null, null, true);
            mapXQ2.put("click_area", str);
            mapXQ2.putAll(mapLIZIZ);
        } else {
            mapXQ2 = null;
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_product_click", mapXQ2);
        if (!z) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        UsBidViewModel usBidViewModel3 = this.LLILZIL;
        if (usBidViewModel3 != null) {
            AwS309S0300000_32 awS309S0300000_32 = new AwS309S0300000_32((Function1) function1, (Function1<? super Boolean, Unit>) function0, (Function0<Unit>) this, (C181R) 0);
            AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32((Function1) function1, (Function1<? super Boolean, Unit>) this, (C181R) 5);
            if (((Boolean) usBidViewModel3.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue()) {
                awS309S0300000_32.invoke(null, bool);
                return;
            }
            UsPopupCardVO usPopupCardVO2 = usBidViewModel3.LLILLJJLI;
            if (usPopupCardVO2 != null && (auctionData = usPopupCardVO2.auctionData) != null && auctionData.auctionType == 1) {
                l = usBidViewModel3.LLILZ;
            } else {
                l = usBidViewModel3.LLILLL;
            }
            if (l != null) {
                if (Intrinsics.LJFF(((LinkedHashMap) usBidViewModel3.LLJILLL).get(l.toString()), bool)) {
                    awS309S0300000_32.invoke(null, bool);
                    return;
                }
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(usBidViewModel3), C0PEM.LIZJ, null, new C21198017xS(usBidViewModel3, awS398S0200000_32, l, awS309S0300000_32, null), 2);
        }
    }
}
