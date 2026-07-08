package X;

import X.C1507790pL7;
import Y.ACListenerS134S0200000_32;
import Y.ACListenerS45S0210000_32;
import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.BFFData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.CardConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductResp;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.RegularAuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ComponentData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.CoverComponent;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.182q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212206182q implements C188K, InterfaceC497601wk {
    public static final int[] LLJJLIIIJLLLLLLLZ = {0, LSPassThroughRecordSizeConfig.DEFAULT, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 2000, 2500, LivePreCreateNextRoomPlayer.ENABLE};
    public final /* synthetic */ C054G LL;
    public ViewGroup LLILLJJLI;
    public AnonymousClass1833 LLILLL;
    public AbstractC212214182y LLILZ;
    public AbstractC212214182y LLILZIL;
    public Animator LLILZLL;
    public int LLIZ;
    public C183F LLIZLLLIL;
    public Function1<? super C183I, Unit> LLJ;
    public final C01GW LLJI;
    public final String LLJIJIL;
    public final CopyOnWriteArrayList<AnonymousClass0957<Boolean>> LLJILJIL;
    public C099G LLJILJILJ;
    public C099F LLJILLL;
    public volatile boolean LLJJ;
    public C212207182r LLJJI;
    public C182T LLJJIII;
    public Boolean LLJJIJI;
    public C21189617w6 LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public AnonymousClass0956 LLJJJJLIIL;
    public final C054G LLJJL;

    @Override // X.C188K
    public final Integer LIZJ(View view) {
        return null;
    }

    @Override // X.C188K
    public final String LIZ() {
        String str;
        C182T c182t = this.LLJJIII;
        String str2 = null;
        if (c182t != null) {
            FeedProduct feedProduct = c182t.LIZ;
            if (feedProduct == null || (str = feedProduct.schema) == null) {
                Product product = c182t.LIZIZ;
                if (product != null) {
                    str2 = product.schema;
                }
            } else {
                str2 = str;
            }
        }
        try {
            Uri uri = UriProtector.parse(str2);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getHost());
            builder.path(uri.getPath());
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                builder.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
            }
            builder.appendQueryParameter("pdp_cache_key", "pdp_cache");
            return builder.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }

    @Override // X.C188K
    public final String LIZLLL() {
        String str;
        C182T c182t = this.LLJJIII;
        if (c182t != null) {
            FeedProduct feedProduct = c182t.LIZ;
            if (feedProduct != null && (str = feedProduct.title) != null) {
                return str;
            }
            Product product = c182t.LIZIZ;
            if (product != null) {
                return product.title;
            }
        }
        return null;
    }

    @Override // X.C188K
    public final void LJFF() throws JSONException {
        C212207182r c212207182r;
        int i = this.LLIZ;
        if ((i == 3 || i == 2) && (c212207182r = this.LLJJI) != null) {
            AbstractC212214182y abstractC212214182y = this.LLILZ;
            c212207182r.LJI("enter_room", abstractC212214182y != null ? abstractC212214182y.getContentShowParams() : null);
        }
    }

    @Override // X.C188K
    public final boolean LJII() {
        AbstractC212214182y abstractC212214182y = this.LLILZ;
        if (abstractC212214182y != null) {
            return abstractC212214182y instanceof C212201182l;
        }
        return false;
    }

    @Override // X.C188K
    public final String LJIIIIZZ() {
        RegularAuctionData regularAuctionData;
        String str;
        C182T c182t = this.LLJJIII;
        if (c182t != null) {
            FeedProduct feedProduct = c182t.LIZ;
            if (feedProduct != null && (str = feedProduct.source) != null) {
                return str;
            }
            Product product = c182t.LIZIZ;
            if (product != null) {
                return product.source;
            }
            AuctionData auctionData = c182t.LIZJ;
            if (auctionData != null && (regularAuctionData = auctionData.regularAuctionData) != null) {
                return regularAuctionData.source;
            }
        }
        return null;
    }

    @Override // X.C188K
    public final Integer LJIIIZ() {
        C182T c182t = this.LLJJIII;
        if (c182t != null) {
            return c182t.LIZJ();
        }
        return null;
    }

    public final void LJIIJJI() {
        try {
            CopyOnWriteArrayList<AnonymousClass0957<Boolean>> copyOnWriteArrayList = this.LLJILJIL;
            if (copyOnWriteArrayList != null) {
                for (AnonymousClass0957<Boolean> anonymousClass0957 : copyOnWriteArrayList) {
                    if (anonymousClass0957 != null) {
                        anonymousClass0957.LIZIZ(null);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final boolean LJIILJJIL() {
        BFFData bFFData;
        CardConfig cardConfig;
        C182T c182t = this.LLJJIII;
        return C703302op.LIZ((c182t == null || (bFFData = c182t.LIZLLL) == null || (cardConfig = bFFData.cardConfig) == null) ? null : cardConfig.cardSchema);
    }

    public final void LJIILLIIL() {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJLIIL = null;
        C183F c183f = this.LLIZLLLIL;
        if (c183f != null) {
            c183f.LIZ();
        }
    }

    public final void LJIIZILJ() {
        AbstractC212214182y abstractC212214182y = this.LLILZIL;
        if (abstractC212214182y != null) {
            abstractC212214182y.setCloseClickListener(null);
            abstractC212214182y.setCardClickListener(null);
            abstractC212214182y.setActionClickListener(null);
        }
        AbstractC212214182y abstractC212214182y2 = this.LLILZIL;
        if (abstractC212214182y2 != null) {
            abstractC212214182y2.e0();
        }
        this.LLILZIL = null;
        ViewGroup viewGroup = this.LLILLJJLI;
        C786410Ut5.LJJJJI(viewGroup != null ? viewGroup : null);
    }

    public final void LJIJI() {
        this.LLJJJ++;
        this.LLJJJIL = false;
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJLIIL = null;
    }

    @Override // X.C188K
    public final void destroy() throws JSONException {
        C212207182r c212207182r;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("EcLiveProductCard destroy");
        if (this.LLJJ) {
            C2341109Fh.LJ("has destroyed, repeat useless operation");
            return;
        }
        C212207182r c212207182r2 = this.LLJJI;
        if (c212207182r2 != null) {
            c212207182r2.LJII("quit");
        }
        this.LLJJ = true;
        this.LLIZLLLIL = null;
        C2296808zG.LIZJ(this.LLJJL, new CancellationException("destroy"));
        LJIIJJI();
        try {
            CopyOnWriteArrayList<AnonymousClass0957<Boolean>> copyOnWriteArrayList = this.LLJILJIL;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C099G c099g = this.LLJILJILJ;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        this.LLJILJILJ = null;
        LJIJI();
        this.LLJJIJIL = 0;
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.LLILZLL = null;
        int i = this.LLIZ;
        if ((i == 3 || i == 2) && (c212207182r = this.LLJJI) != null) {
            AbstractC212214182y abstractC212214182y = this.LLILZ;
            c212207182r.LJI("leave", abstractC212214182y != null ? abstractC212214182y.getContentShowParams() : null);
        }
        this.LLIZ = 1;
        LJIJ();
        LJIIZILJ();
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    public C212206182q() {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        this.LL = C2296808zG.LIZ(abstractC2238408pq);
        this.LLIZ = 1;
        this.LLJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(57));
        C844470XAv.LIZ.getClass();
        this.LLJIJIL = String.valueOf(C844470XAv.LJIIJ);
        this.LLJILJIL = new CopyOnWriteArrayList<>();
        this.LLJJL = C2296808zG.LIZ(abstractC2238408pq);
    }

    public final void LJIJ() {
        LJIJI();
        AbstractC212214182y abstractC212214182y = this.LLILZ;
        if (abstractC212214182y != null) {
            abstractC212214182y.setCloseClickListener(null);
            abstractC212214182y.setCardClickListener(null);
        }
        AbstractC212214182y abstractC212214182y2 = this.LLILZ;
        if (abstractC212214182y2 != null) {
            abstractC212214182y2.e0();
        }
        this.LLILZ = null;
        ViewGroup viewGroup = this.LLILLJJLI;
        C786410Ut5.LJJJJI(viewGroup != null ? viewGroup : null);
    }

    @Override // X.C188K
    public final Boolean LJ() {
        return this.LLJJIJI;
    }

    @Override // X.C188K
    public final boolean isDestroyed() {
        return this.LLJJ;
    }

    public static void LJIIJ(AbstractC212214182y abstractC212214182y) {
        C21207017yu c21207017yu;
        if ((abstractC212214182y instanceof C21207017yu) && (c21207017yu = (C21207017yu) abstractC212214182y) != null) {
            C1564050qnr c1564050qnr = c21207017yu.LLILZLL;
            if (c1564050qnr != null) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FeedLynxCardView bindPendingLynxData roomId=");
                sbLIZ.append(c1564050qnr.LIZ);
                sbLIZ.append(", schema=");
                sbLIZ.append(c1564050qnr.LIZLLL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                C21202017y6 c21202017y6 = c21207017yu.LLILZ;
                if (c21202017y6 != null) {
                    c21202017y6.j0(null, c1564050qnr, null);
                }
                c21207017yu.LLILZLL = null;
                return;
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("FeedLynxCardView bindPendingLynxData skipped: no pending data");
        }
    }

    public static void LJIIL(FeedProductResp feedProductResp) {
        FeedProduct feedProduct;
        PromotionInfo promotionInfo;
        Integer num;
        Type type;
        SinglePriceItem singlePriceItem;
        Type type2;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem2;
        if (feedProductResp.productInfo != null && C703302op.LIZ(feedProductResp.promotionStyle)) {
            try {
                String str = feedProductResp.promotionStyle;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type2 = C2371409Qy.LIZJ(C13LE.LJII(PromotionStyleConfig.class));
                    } else {
                        type2 = new TypeToken<PromotionStyleConfig>() { // from class: X.1838
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type2);
                    if (!(objLJIIIIZZ instanceof PromotionStyleConfig)) {
                        objLJIIIIZZ = null;
                    }
                    PromotionStyleConfig promotionStyleConfig = (PromotionStyleConfig) objLJIIIIZZ;
                    if (promotionStyleConfig != null) {
                        feedProductResp.productInfo.LIZ(promotionStyleConfig);
                        PromotionInfo promotionInfo2 = feedProductResp.productInfo.promotionInfo;
                        if (promotionInfo2 != null && (promotionProductPrice = promotionInfo2.productPrice) != null && (singlePriceItem2 = promotionProductPrice.minPrice) != null) {
                            singlePriceItem2.setPriceUiConfig(promotionStyleConfig.priceUiConfig);
                        }
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (C703302op.LIZ(feedProductResp.promotionStyle) && (feedProduct = feedProductResp.product) != null && (promotionInfo = feedProduct.promotionInfo) != null && (num = promotionInfo.promotionLabelsShowStyle) != null && num.intValue() == 3) {
            try {
                String str2 = feedProductResp.promotionStyle;
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(PromotionStyleConfig.class));
                    } else {
                        type = new TypeToken<PromotionStyleConfig>() { // from class: X.1839
                        }.getType();
                    }
                    Object objLJIIIIZZ2 = gsonLJFF2.LJIIIIZZ(str2, type);
                    if (!(objLJIIIIZZ2 instanceof PromotionStyleConfig)) {
                        objLJIIIIZZ2 = null;
                    }
                    PromotionStyleConfig promotionStyleConfig2 = (PromotionStyleConfig) objLJIIIIZZ2;
                    if (promotionStyleConfig2 != null) {
                        feedProductResp.product.LIZ(promotionStyleConfig2);
                        PromotionProductPrice promotionProductPrice2 = feedProductResp.product.promotionInfo.productPrice;
                        if (promotionProductPrice2 != null && (singlePriceItem = promotionProductPrice2.minPrice) != null) {
                            singlePriceItem.setPriceUiConfig(promotionStyleConfig2.priceUiConfig);
                        }
                    }
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    @Override // X.C188K
    public final void LJI(Context context) {
        String strLIZLLL;
        String strLIZIZ;
        String strLIZIZ2;
        String str;
        int iIntValue;
        ComponentData componentData;
        CoverComponent coverComponent;
        C182T c182t;
        FeedProduct feedProduct;
        Product product;
        AuctionData auctionData;
        ComponentData componentData2;
        CoverComponent coverComponent2;
        Integer num;
        ECImage eCImage;
        C182T c182t2 = this.LLJJIII;
        if (c182t2 != null) {
            strLIZLLL = c182t2.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        C182T c182t3 = this.LLJJIII;
        if (c182t3 == null || (strLIZIZ = c182t3.LJ()) == null) {
            C182T c182t4 = this.LLJJIII;
            if (c182t4 != null) {
                strLIZIZ = c182t4.LIZIZ();
            } else {
                strLIZIZ = null;
            }
        }
        C182T c182t5 = this.LLJJIII;
        if (c182t5 != null) {
            FeedProduct feedProduct2 = c182t5.LIZ;
            if (feedProduct2 == null || (eCImage = feedProduct2.cover) == null || (strLIZIZ2 = eCImage.url) == null) {
                Product product2 = c182t5.LIZIZ;
                if (product2 != null) {
                    strLIZIZ2 = product2.LIZIZ();
                } else {
                    strLIZIZ2 = null;
                }
            }
        } else {
            strLIZIZ2 = null;
        }
        C182T c182t6 = this.LLJJIII;
        if (c182t6 != null) {
            FeedProduct feedProduct3 = c182t6.LIZ;
            if (feedProduct3 == null || (str = feedProduct3.title) == null) {
                Product product3 = c182t6.LIZIZ;
                if (product3 != null) {
                    str = product3.title;
                } else {
                    str = null;
                }
            }
            Product product4 = c182t6.LIZIZ;
            if (product4 != null && (componentData = product4.componentData) != null && (coverComponent = componentData.coverComponent) != null && Intrinsics.LJFF(coverComponent.smartImageSetJumpPdpCache, Boolean.TRUE) && (c182t = this.LLJJIII) != null && ((((feedProduct = c182t.LIZ) != null && (componentData2 = feedProduct.componentData) != null) || (((product = c182t.LIZIZ) != null && (componentData2 = product.componentData) != null) || ((auctionData = c182t.LIZJ) != null && (componentData2 = auctionData.componentData) != null))) && (coverComponent2 = componentData2.coverComponent) != null && (num = coverComponent2.smartImageJumpPdpIndex) != null)) {
                iIntValue = num.intValue();
            }
            C1323690kYB.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(new PdpPreviewInfo(str, strLIZIZ, strLIZIZ2, strLIZLLL, iIntValue, false, null, null)), "pdp_cache");
        }
        str = null;
        iIntValue = 0;
        C1323690kYB.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(new PdpPreviewInfo(str, strLIZIZ, strLIZIZ2, strLIZLLL, iIntValue, false, null, null)), "pdp_cache");
    }

    public final void LJIILL(String str) {
        String str2;
        if (this.LLJJJJ && this.LLJJJIL && !this.LLJJJJJIL) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatch lynx overlay start show, reason=");
            sbLIZ.append(str);
            sbLIZ.append(", roomId=");
            C212207182r c212207182r = this.LLJJI;
            if (c212207182r != null) {
                str2 = c212207182r.LIZJ;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            LJIILLIIL();
        }
    }

    public final void LJIJJ(AbstractC212214182y abstractC212214182y, boolean z) {
        if (abstractC212214182y != null) {
            abstractC212214182y.setCloseClickListener(new ACListenerS45S0210000_32(this, abstractC212214182y, z, 2));
            abstractC212214182y.setCardClickListener(new ACListenerS134S0200000_32(this, abstractC212214182y, 3));
            abstractC212214182y.setActionClickListener(new ACListenerS134S0200000_32(this, abstractC212214182y, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r19, java.lang.String r20, boolean r21, java.lang.Long r22, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductResp>>> r23) {
        /*
            r18 = this;
            r3 = r23
            r6 = r19
            boolean r0 = r3 instanceof X.C159V
            r5 = r18
            if (r0 == 0) goto L29
            r8 = r3
            X.159V r8 = (X.C159V) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r8.LLILZ = r2
        L18:
            java.lang.Object r1 = r8.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L2f
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r8.LL
            goto L79
        L29:
            X.159V r8 = new X.159V
            r8.<init>(r5, r3)
            goto L18
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r1)
            X.182r r1 = r5.LLJJI
            if (r1 == 0) goto L43
            java.lang.String r0 = "network_request"
            r1.LJII(r0)
        L43:
            X.183J r2 = com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductApi.LIZ     // Catch: java.lang.Exception -> L80
            long r0 = r6.id     // Catch: java.lang.Exception -> L80
            java.lang.String r12 = X.C1742080vR0.LJII(r9)     // Catch: java.lang.Exception -> L80
            if (r21 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            r8.LL = r6     // Catch: java.lang.Exception -> L80
            r8.LLILZ = r3     // Catch: java.lang.Exception -> L80
            r2.getClass()     // Catch: java.lang.Exception -> L80
            X.01K1 r3 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L80
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductApi> r2 = com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductApi.class
            java.lang.Object r10 = r3.create(r2)     // Catch: java.lang.Exception -> L80
            com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductApi r10 = (com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.FeedProductApi) r10     // Catch: java.lang.Exception -> L80
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L80
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L80
            r14 = 1
            r16 = r22
            r13 = r20
            r17 = r8
            java.lang.Object r1 = r10.getProduct(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L80
            if (r1 != r7) goto L7c
            return r7
        L79:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L80
        L7c:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L80
            r9 = r1
            goto L90
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.09Fh r1 = X.C2341109Fh.LIZ
            java.lang.String r0 = r0.getMessage()
            r1.getClass()
            X.C2341109Fh.LIZJ(r0)
        L90:
            X.17wS r4 = X.C21191817wS.LIZ
            X.17uT r0 = X.EnumC21179517uT.FYP_PRODUCT_CARD
            java.lang.String r3 = r0.getValue()
            X.17vZ r0 = X.EnumC21186317vZ.GLOBAL
            java.lang.String r2 = r0.getValue()
            long r0 = r6.id
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r6.getRequestId()
            r4.getClass()
            X.C21191817wS.LIZ(r3, r2, r1, r0)
            X.182r r1 = r5.LLJJI
            if (r1 == 0) goto Lb7
            java.lang.String r0 = "network_response"
            r1.LJII(r0)
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212206182q.LJIILIIL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, java.lang.String, boolean, java.lang.Long, X.05Vn):java.lang.Object");
    }

    public final void LJIJJLI(long j, long j2, String str, String str2, String str3) throws JSONException {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("ask client ai");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("preview_stay_time", j);
        jSONObject.put("preview_card_da_info", str);
        jSONObject.put("preview_container_da_info", str2);
        jSONObject.put("room_id", str3);
        jSONObject.put("product_num", j2);
        final AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(this, 166);
        String str4 = this.LLJIJIL;
        PitayaCoreFactory.getCore(str4).runTask("gecc_live_preview_card", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard$runPitayaTask$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) throws JSONException {
                JSONObject jSONObject2;
                Object obj;
                JSONObject params;
                Integer numValueOf = null;
                if (z) {
                    Function1<Boolean, Unit> function1 = awS581S0100000_2;
                    if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
                        obj = params.get("package_output");
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof Boolean)) {
                        obj = null;
                    }
                    function1.invoke((Boolean) obj);
                    this.LLJJIJIL = 0;
                } else {
                    this.LLJJIJIL++;
                }
                if (pTYTaskData == null || (jSONObject2 = pTYTaskData.getParams()) == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put("success", z);
                if (pTYError != null) {
                    numValueOf = Integer.valueOf(pTYError.getCode());
                }
                jSONObject2.put("error_code", numValueOf);
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZLLL("tiktokec_rd_client_ai", jSONObject2);
            }
        });
    }

    @Override // X.C188K
    public final void LIZIZ(LiveRoomStruct liveRoomStruct, Context context, boolean z, Map map, String str, long j, boolean z2, boolean z3, Long l, String str2) {
        AbstractC212214182y abstractC212214182y;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCardIfNeeded roomid = ");
        sbLIZ.append(liveRoomStruct.id);
        sbLIZ.append(", showAsBig = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (!z2 || ((abstractC212214182y = this.LLILZIL) != null && C183H.LIZ(abstractC212214182y))) {
            C23250099c.LIZLLL(this.LLJJL, null, null, new C212205182p(this, z2, liveRoomStruct, str, z3, l, map, str2, j, context, z, null), 3);
        }
    }
}
