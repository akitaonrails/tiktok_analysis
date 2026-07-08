package X;

import Y.AAListenerS70S0110000_32;
import Y.ACListenerS134S0200000_32;
import Y.ACListenerS45S0210000_32;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.api.FeedProductResp;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.data.SeaFeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ComponentData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.CoverComponent;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.182n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212203182n implements C188K, InterfaceC497601wk {
    public final /* synthetic */ C054G LL;
    public ViewGroup LLILLJJLI;
    public C183P LLILLL;
    public AnonymousClass1830 LLILZ;
    public Animator LLILZIL;
    public int LLILZLL;
    public C183F LLIZ;
    public Function1<? super C183I, Unit> LLIZLLLIL;
    public C099G LLJ;
    public volatile boolean LLJI;
    public C212208182s LLJIJIL;
    public C182N LLJILJIL;
    public final C182Q LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public AnonymousClass0956 LLJJIJI;
    public final C054G LLJJIJIIJIL;
    public int LLJJIJIL;

    @Override // X.C188K
    public final Boolean LJ() {
        return null;
    }

    @Override // X.C188K
    public final boolean LJII() {
        return false;
    }

    @Override // X.C188K
    public final String LIZ() {
        String str;
        C182N c182n = this.LLJILJIL;
        String str2 = null;
        if (c182n != null) {
            SeaFeedProduct seaFeedProduct = c182n.LIZ;
            if (seaFeedProduct == null || (str = seaFeedProduct.schema) == null) {
                Product product = c182n.LIZIZ;
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
        C182N c182n = this.LLJILJIL;
        if (c182n != null) {
            SeaFeedProduct seaFeedProduct = c182n.LIZ;
            if (seaFeedProduct != null && (str = seaFeedProduct.title) != null) {
                return str;
            }
            Product product = c182n.LIZIZ;
            if (product != null) {
                return product.title;
            }
        }
        return null;
    }

    @Override // X.C188K
    public final void LJFF() throws JSONException {
        C212208182s c212208182s;
        int i = this.LLILZLL;
        if ((i == 3 || i == 2) && (c212208182s = this.LLJIJIL) != null) {
            AnonymousClass1830 anonymousClass1830 = this.LLILZ;
            c212208182s.LJ("enter_room", anonymousClass1830 != null ? anonymousClass1830.h0(null) : null);
        }
    }

    @Override // X.C188K
    public final String LJIIIIZZ() {
        String str;
        C182N c182n = this.LLJILJIL;
        if (c182n != null) {
            SeaFeedProduct seaFeedProduct = c182n.LIZ;
            if (seaFeedProduct != null && (str = seaFeedProduct.source) != null) {
                return str;
            }
            Product product = c182n.LIZIZ;
            if (product != null) {
                return product.source;
            }
        }
        return null;
    }

    @Override // X.C188K
    public final Integer LJIIIZ() {
        Integer num;
        C182N c182n = this.LLJILJIL;
        if (c182n != null) {
            SeaFeedProduct seaFeedProduct = c182n.LIZ;
            if (seaFeedProduct != null && (num = seaFeedProduct.platform) != null) {
                return num;
            }
            Product product = c182n.LIZIZ;
            if (product != null) {
                return Integer.valueOf(product.platform);
            }
        }
        return null;
    }

    public final void LJIILL() {
        if (this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJI = null;
        C183F c183f = this.LLIZ;
        if (c183f != null) {
            c183f.LIZ();
        }
    }

    public final void LJIILLIIL() {
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    public final void LJIIZILJ() {
        C21201717y3 c21201717y3;
        AnonymousClass1830 anonymousClass1830 = this.LLILZ;
        if (anonymousClass1830 != null) {
            anonymousClass1830.setCloseClickListener(null);
            anonymousClass1830.setCardClickListener(null);
            anonymousClass1830.setActionClickListener(null);
        }
        AnonymousClass1830 anonymousClass18302 = this.LLILZ;
        if ((anonymousClass18302 instanceof C21201717y3) && (c21201717y3 = (C21201717y3) anonymousClass18302) != null) {
            c21201717y3.setOnOverlayFirstShownListener(null);
        }
        AnonymousClass1830 anonymousClass18303 = this.LLILZ;
        if (anonymousClass18303 != null) {
            anonymousClass18303.onDestroy();
        }
        this.LLILZ = null;
        this.LLJJIJIL = 0;
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // X.C188K
    public final void destroy() throws JSONException {
        C212208182s c212208182s;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("EcLiveProductCard destroy");
        if (this.LLJI) {
            C2341109Fh.LJ("has destroyed, repeat useless operation");
            return;
        }
        C212208182s c212208182s2 = this.LLJIJIL;
        if (c212208182s2 != null) {
            c212208182s2.LJFF(this.LLJJIJIL, "quit");
        }
        this.LLJI = true;
        this.LLIZ = null;
        C2296808zG.LIZJ(this.LLJJIJIIJIL, new CancellationException("destroy"));
        C099G c099g = this.LLJ;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        this.LLJ = null;
        Animator animator = this.LLILZIL;
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.LLILZIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIJI = null;
        int i = this.LLILZLL;
        if ((i == 3 || i == 2) && (c212208182s = this.LLJIJIL) != null) {
            AnonymousClass1830 anonymousClass1830 = this.LLILZ;
            c212208182s.LJ("leave", anonymousClass1830 != null ? anonymousClass1830.h0(null) : null);
        }
        this.LLILZLL = 1;
        LJIIZILJ();
        LJIILLIIL();
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    public C212203182n() {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        this.LL = C2296808zG.LIZ(abstractC2238408pq);
        this.LLILZLL = 1;
        C844470XAv.LIZ.getClass();
        String.valueOf(C844470XAv.LJIIJ);
        this.LLJILJILJ = new C182Q(0);
        this.LLJJIJIIJIL = C2296808zG.LIZ(abstractC2238408pq);
    }

    @Override // X.C188K
    public final boolean isDestroyed() {
        return this.LLJI;
    }

    public static void LJIIJJI(FeedProductResp feedProductResp) {
        Type type;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        if (feedProductResp.productInfo != null && C703302op.LIZ(feedProductResp.promotionStyle)) {
            try {
                String str = feedProductResp.promotionStyle;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(PromotionStyleConfig.class));
                    } else {
                        type = new TypeToken<PromotionStyleConfig>() { // from class: X.1837
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type);
                    if (!(objLJIIIIZZ instanceof PromotionStyleConfig)) {
                        objLJIIIIZZ = null;
                    }
                    PromotionStyleConfig promotionStyleConfig = (PromotionStyleConfig) objLJIIIIZZ;
                    if (promotionStyleConfig != null) {
                        feedProductResp.productInfo.LIZ(promotionStyleConfig);
                        PromotionInfo promotionInfo = feedProductResp.productInfo.promotionInfo;
                        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                            singlePriceItem.setPriceUiConfig(promotionStyleConfig.priceUiConfig);
                        }
                        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = feedProductResp.flashSaleAtmosphereInfo;
                        if (flashSaleAtmosphereInfo != null) {
                            flashSaleAtmosphereInfo.LIZ = promotionStyleConfig.flashSaleEnhancement;
                        }
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static Product LJIJJLI(SeaFeedProduct seaFeedProduct) {
        int iIntValue;
        String str = seaFeedProduct.productId;
        String str2 = seaFeedProduct.title;
        ECImage eCImage = seaFeedProduct.cover;
        int i = seaFeedProduct.bagIndex;
        String str3 = seaFeedProduct.daInfo;
        String str4 = seaFeedProduct.schema;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = seaFeedProduct.source;
        if (str6 != null) {
            str5 = str6;
        }
        Integer num = seaFeedProduct.platform;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return new Product(str, str2, eCImage, null, "", "", 0, null, iIntValue, "", str5, str4, 0, "", "", null, null, null, seaFeedProduct.promotionView, null, null, null, seaFeedProduct.sellingView, null, null, null, null, null, null, i, null, null, null, null, null, null, str3, null, null, null, null, null, null, null, seaFeedProduct.componentData, seaFeedProduct.auctionData, seaFeedProduct.productType, seaFeedProduct.bcmStandardTrack, null, null, null, null, null, null);
    }

    @Override // X.C188K
    public final Integer LIZJ(View view) {
        AnonymousClass1830 anonymousClass1830;
        if (view == null || (anonymousClass1830 = this.LLILZ) == null) {
            return null;
        }
        return Integer.valueOf(anonymousClass1830.i0(view));
    }

    @Override // X.C188K
    public final void LJI(Context context) {
        String strLIZJ;
        String strLIZIZ;
        String strLIZIZ2;
        String str;
        int iIntValue;
        ComponentData componentData;
        CoverComponent coverComponent;
        C182N c182n;
        SeaFeedProduct seaFeedProduct;
        Product product;
        ComponentData componentData2;
        CoverComponent coverComponent2;
        Integer num;
        ECImage eCImage;
        C182N c182n2 = this.LLJILJIL;
        if (c182n2 != null) {
            strLIZJ = c182n2.LIZJ();
        } else {
            strLIZJ = null;
        }
        C182N c182n3 = this.LLJILJIL;
        if (c182n3 == null || (strLIZIZ = c182n3.LIZLLL()) == null) {
            C182N c182n4 = this.LLJILJIL;
            if (c182n4 != null) {
                strLIZIZ = c182n4.LIZIZ();
            } else {
                strLIZIZ = null;
            }
        }
        C182N c182n5 = this.LLJILJIL;
        if (c182n5 != null) {
            SeaFeedProduct seaFeedProduct2 = c182n5.LIZ;
            if (seaFeedProduct2 == null || (eCImage = seaFeedProduct2.cover) == null || (strLIZIZ2 = eCImage.url) == null) {
                Product product2 = c182n5.LIZIZ;
                if (product2 != null) {
                    strLIZIZ2 = product2.LIZIZ();
                } else {
                    strLIZIZ2 = null;
                }
            }
        } else {
            strLIZIZ2 = null;
        }
        C182N c182n6 = this.LLJILJIL;
        if (c182n6 != null) {
            SeaFeedProduct seaFeedProduct3 = c182n6.LIZ;
            if (seaFeedProduct3 == null || (str = seaFeedProduct3.title) == null) {
                Product product3 = c182n6.LIZIZ;
                if (product3 != null) {
                    str = product3.title;
                } else {
                    str = null;
                }
            }
            Product product4 = c182n6.LIZIZ;
            if (product4 != null && (componentData = product4.componentData) != null && (coverComponent = componentData.coverComponent) != null && Intrinsics.LJFF(coverComponent.smartImageSetJumpPdpCache, Boolean.TRUE) && (c182n = this.LLJILJIL) != null && ((((seaFeedProduct = c182n.LIZ) != null && (componentData2 = seaFeedProduct.componentData) != null) || ((product = c182n.LIZIZ) != null && (componentData2 = product.componentData) != null)) && (coverComponent2 = componentData2.coverComponent) != null && (num = coverComponent2.smartImageJumpPdpIndex) != null)) {
                iIntValue = num.intValue();
            }
            C1323690kYB.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(new PdpPreviewInfo(str, strLIZIZ, strLIZIZ2, strLIZJ, iIntValue, false, null, null)), "pdp_cache");
        }
        str = null;
        iIntValue = 0;
        C1323690kYB.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(new PdpPreviewInfo(str, strLIZIZ, strLIZIZ2, strLIZJ, iIntValue, false, null, null)), "pdp_cache");
    }

    public final int LJIJ(FeedProductResp feedProductResp) {
        C183E next;
        if (feedProductResp.pinVoucher != null) {
            return 2;
        }
        Iterator<C183E> it2 = this.LLJILJILJ.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ(feedProductResp)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C183E c183e = next;
        if (c183e != null) {
            return c183e.LIZJ();
        }
        return 1;
    }

    public final void LJIIJ(AnonymousClass1830 anonymousClass1830, boolean z) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start dismiss showState = ");
        sbLIZ.append(this.LLILZLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (anonymousClass1830 != null) {
            int i = this.LLILZLL;
            if (i != 2 && i != 3) {
                C2341109Fh.LJII("no need dismiss");
                return;
            }
            Animator animator = this.LLILZIL;
            if (animator != null) {
                animator.cancel();
            }
            if (this.LLILLL == null) {
                return;
            }
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(anonymousClass1830, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, anonymousClass1830.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, anonymousClass1830.getTranslationY(), anonymousClass1830.getLayoutParams().height));
            objectAnimatorOfPropertyValuesHolder.setDuration(290L);
            this.LLILZIL = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS70S0110000_32(this, z, 0));
            objectAnimatorOfPropertyValuesHolder.start();
            C183F c183f = this.LLIZ;
            if (c183f == null) {
                return;
            }
            c183f.LIZIZ();
        }
    }

    public final void LJIILJJIL(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(j2);
        if (lValueOf.longValue() > 0 && 1 != 0) {
            long jLongValue = lValueOf.longValue();
            if (jCurrentTimeMillis - j < jLongValue) {
                this.LLJ = C23250099c.LIZIZ(this, null, null, new C1531805zA(jLongValue, jCurrentTimeMillis, j, null), 3);
            }
        }
    }

    public final void LJIJJ(AnonymousClass1830 anonymousClass1830, boolean z) {
        if (anonymousClass1830 != null) {
            anonymousClass1830.setCloseClickListener(new ACListenerS45S0210000_32(this, anonymousClass1830, z, 0));
            anonymousClass1830.setCardClickListener(new ACListenerS134S0200000_32(this, anonymousClass1830, 0));
            anonymousClass1830.setActionClickListener(new ACListenerS134S0200000_32(this, anonymousClass1830, 1));
        }
    }

    public final void LJIJI(AnonymousClass1830 anonymousClass1830, boolean z, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJIJJ(anonymousClass1830, z);
                    return;
                }
                return;
            } else {
                if (anonymousClass1830 == null) {
                    return;
                }
                anonymousClass1830.setCloseClickListener(new ACListenerS45S0210000_32(this, anonymousClass1830, z, 1));
                anonymousClass1830.setActionClickListener(new ACListenerS134S0200000_32(this, anonymousClass1830, 2));
                return;
            }
        }
        LJIJJ(anonymousClass1830, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C182N r8, long r9, android.content.Context r11, int r12, X.C1155180gAO r13) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212203182n.LJIIL(X.182N, long, android.content.Context, int, X.0gAO):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r21, java.lang.String r22, boolean r23, java.lang.Long r24, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.api.FeedProductResp>>> r25) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212203182n.LJIILIIL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, java.lang.String, boolean, java.lang.Long, X.05Vn):java.lang.Object");
    }

    @Override // X.C188K
    public final void LIZIZ(LiveRoomStruct liveRoomStruct, Context context, boolean z, Map map, String str, long j, boolean z2, boolean z3, Long l, String str2) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCardIfNeeded roomid = ");
        sbLIZ.append(liveRoomStruct.id);
        sbLIZ.append(", showAsBig = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (z2) {
            return;
        }
        C23250099c.LIZLLL(this.LLJJIJIIJIL, null, null, new C212204182o(this, liveRoomStruct, str, z3, l, false, map, str2, j, context, z, null), 3);
    }
}
