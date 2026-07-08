package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.api.ECLivePlaybackApi;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackLiveRoomInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackPageResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackProductCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackUserInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackWatchLiveButton;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardBuyButton;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS38S0600000_24;
import njp.a;

/* JADX INFO: renamed from: X.0vU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel$fetchData$1$3", f = "ECLivePlaybackViewModel.kt", l = {168}, m = "invokeSuspend")
public final class C1744010vU7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ ECLivePlaybackViewModel LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744010vU7(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ECLivePlaybackViewModel eCLivePlaybackViewModel, InterfaceC1364105Vn<? super C1744010vU7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = z;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = eCLivePlaybackViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744010vU7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Product product;
        long jCurrentTimeMillis;
        Map<String, BuyButtonProperty> map;
        String str;
        PromotionStyleConfig promotionStyleConfig;
        int iIntValue;
        BuyButtonProperty buyButtonPropertyLIZ;
        BcmStandardTrack bcmStandardTrack;
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData;
        ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton;
        ECLivePlaybackUserInfo eCLivePlaybackUserInfo;
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData2;
        ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton2;
        ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo;
        ECLivePlaybackUserInfo eCLivePlaybackUserInfo2;
        PinCardBuyButton pinCardBuyButton;
        Integer num;
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceUiConfig priceUiConfig;
        Type type;
        ECLivePlaybackProductCardInfo eCLivePlaybackProductCardInfo;
        ECLivePlaybackProductCardInfo eCLivePlaybackProductCardInfo2;
        BuyButtonConfig buyButtonConfig;
        Long l;
        ECLivePlaybackProductCardInfo eCLivePlaybackProductCardInfo3;
        List<Product> list;
        Object liveHighlightReplay = obj;
        C1C7U.LIZ("ECLivePlaybackViewModel@3fb6.fetchData$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(liveHighlightReplay);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(liveHighlightReplay);
            C1744040vUA c1744040vUA = ECLivePlaybackApi.LIZ;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILLL;
            String str4 = this.LLILZ;
            String str5 = this.LLILZIL;
            String str6 = this.LLILZLL;
            boolean z2 = this.LLIZ;
            String str7 = this.LLIZLLLIL;
            String str8 = this.LLJ;
            this.LL = 1;
            c1744040vUA.getClass();
            liveHighlightReplay = ((ECLivePlaybackApi) C0NSL.LIZ().create(ECLivePlaybackApi.class)).getLiveHighlightReplay(str2, str3, str4, str5, str6, z2, str7, str8, this);
            if (liveHighlightReplay == objLJFF) {
                C1C7U.LIZIZ("ECLivePlaybackViewModel@3fb6.fetchData$1$3");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) liveHighlightReplay;
        if (baseResponse.isSuccess()) {
            ECLivePlaybackPageResponse eCLivePlaybackPageResponse = (ECLivePlaybackPageResponse) baseResponse.getData();
            C1743880vTu c1743880vTu = this.LLJI.LL;
            VideoPlayConfig videoPlayConfig = null;
            if (eCLivePlaybackPageResponse != null && (eCLivePlaybackProductCardInfo3 = eCLivePlaybackPageResponse.productCardInfo) != null && (list = eCLivePlaybackProductCardInfo3.product) != null) {
                product = (Product) C13LP.LJJJLL(list);
            } else {
                product = null;
            }
            if (eCLivePlaybackPageResponse != null && (l = eCLivePlaybackPageResponse.serverTime) != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (eCLivePlaybackPageResponse != null && (eCLivePlaybackProductCardInfo2 = eCLivePlaybackPageResponse.productCardInfo) != null && (buyButtonConfig = eCLivePlaybackProductCardInfo2.buyButtonConfig) != null) {
                map = buyButtonConfig.pinCardBuyButtonConfig;
            } else {
                map = null;
            }
            if (eCLivePlaybackPageResponse != null && (eCLivePlaybackProductCardInfo = eCLivePlaybackPageResponse.productCardInfo) != null) {
                str = eCLivePlaybackProductCardInfo.promotionStyleConfig;
            } else {
                str = null;
            }
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                    z = false;
                }
                if (z) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(PromotionStyleConfig.class));
                } else {
                    type = new TypeToken<PromotionStyleConfig>() { // from class: X.0vU9
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof PromotionStyleConfig)) {
                    objFromJson = null;
                }
                promotionStyleConfig = (PromotionStyleConfig) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                promotionStyleConfig = null;
            }
            if (product != null && (promotionInfo = product.promotionInfo) != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                if (promotionStyleConfig != null) {
                    priceUiConfig = promotionStyleConfig.priceUiConfig;
                } else {
                    priceUiConfig = null;
                }
                singlePriceItem.setPriceUiConfig(priceUiConfig);
            }
            if (product != null) {
                product.LIZ(promotionStyleConfig);
            }
            if (product != null && (pinCardBuyButton = product.pinCardBuyButton) != null && (num = pinCardBuyButton.buyButtonType) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (map == null || (buyButtonPropertyLIZ = map.get(String.valueOf(iIntValue))) == null) {
                BuyButtonProperty.Companion.getClass();
                buyButtonPropertyLIZ = C1744060vUC.LIZ();
            }
            if (product != null) {
                bcmStandardTrack = product.bcmStandardTrack;
            } else {
                bcmStandardTrack = null;
            }
            if (c1743880vTu == null || (playbackVideoPreviewStreamData = c1743880vTu.LJFF) == null) {
                if (eCLivePlaybackPageResponse != null) {
                    playbackVideoPreviewStreamData = eCLivePlaybackPageResponse.video;
                } else {
                    playbackVideoPreviewStreamData = null;
                }
            }
            if (eCLivePlaybackPageResponse != null) {
                eCLivePlaybackWatchLiveButton = eCLivePlaybackPageResponse.watchLiveButton;
            } else {
                eCLivePlaybackWatchLiveButton = null;
            }
            if (eCLivePlaybackPageResponse != null) {
                eCLivePlaybackUserInfo = eCLivePlaybackPageResponse.userInfo;
            } else {
                eCLivePlaybackUserInfo = null;
            }
            C1744020vU8 c1744020vU8 = new C1744020vU8(product, jCurrentTimeMillis, iIntValue, buyButtonPropertyLIZ, bcmStandardTrack, playbackVideoPreviewStreamData, eCLivePlaybackWatchLiveButton, eCLivePlaybackUserInfo);
            C1743880vTu c1743880vTu2 = this.LLJI.LL;
            if (c1743880vTu2 == null || (playbackVideoPreviewStreamData2 = c1743880vTu2.LJFF) == null) {
                ECLivePlaybackPageResponse eCLivePlaybackPageResponse2 = (ECLivePlaybackPageResponse) baseResponse.getData();
                if (eCLivePlaybackPageResponse2 != null) {
                    playbackVideoPreviewStreamData2 = eCLivePlaybackPageResponse2.video;
                } else {
                    playbackVideoPreviewStreamData2 = null;
                }
            }
            ECLivePlaybackPageResponse eCLivePlaybackPageResponse3 = (ECLivePlaybackPageResponse) baseResponse.getData();
            if (eCLivePlaybackPageResponse3 != null) {
                eCLivePlaybackWatchLiveButton2 = eCLivePlaybackPageResponse3.watchLiveButton;
            } else {
                eCLivePlaybackWatchLiveButton2 = null;
            }
            ECLivePlaybackPageResponse eCLivePlaybackPageResponse4 = (ECLivePlaybackPageResponse) baseResponse.getData();
            if (eCLivePlaybackPageResponse4 != null) {
                eCLivePlaybackLiveRoomInfo = eCLivePlaybackPageResponse4.liveRoomInfo;
            } else {
                eCLivePlaybackLiveRoomInfo = null;
            }
            ECLivePlaybackPageResponse eCLivePlaybackPageResponse5 = (ECLivePlaybackPageResponse) baseResponse.getData();
            if (eCLivePlaybackPageResponse5 != null) {
                eCLivePlaybackUserInfo2 = eCLivePlaybackPageResponse5.userInfo;
            } else {
                eCLivePlaybackUserInfo2 = null;
            }
            ECLivePlaybackPageResponse eCLivePlaybackPageResponse6 = (ECLivePlaybackPageResponse) baseResponse.getData();
            if (eCLivePlaybackPageResponse6 != null) {
                videoPlayConfig = eCLivePlaybackPageResponse6.videoPlayConfig;
            }
            this.LLJI.LLILZLL.LJIILIIL = C2286608xc.LJFF(System.currentTimeMillis());
            this.LLJI.setState(new AwS38S0600000_24(eCLivePlaybackUserInfo2, eCLivePlaybackLiveRoomInfo, eCLivePlaybackWatchLiveButton2, playbackVideoPreviewStreamData2, videoPlayConfig, c1744020vU8, 1));
        } else {
            this.LLJI.LLILZLL.LIZLLL = "network";
            this.LLJI.LLILZLL.LJ = C2286608xc.LJ(baseResponse.getCode());
            this.LLJI.LLILZLL.LJFF = baseResponse.getMessage();
            this.LLJI.setState(AFwS264S0000000_24.get$arr$(659));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLivePlaybackViewModel@3fb6.fetchData$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
