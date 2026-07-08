package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusCardData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.165r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207189165r extends C1617910sCj {
    public final ComposeView LL;
    public final C0TPF LLILLJJLI;
    public Aweme LLILLL;
    public final C05P0<Boolean> LLILZ;
    public final C05P0<Boolean> LLILZIL;
    public final C05P0<Boolean> LLILZLL;
    public final C05P0<Boolean> LLIZ;
    public final long LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public final MutableLiveData<IapProductDetail> LLJILJILJ;
    public final ProductInfo LLJILLL;
    public ViewModelStore LLJJ;
    public SubscriptionVM LLJJI;
    public boolean LLJJIII;
    public final FrameLayout LLJJIJI;
    public final SmartImageView LLJJIJIIJIL;
    public InterfaceC1484830ok5 LLJJIJIL;
    public InterfaceC1483820oiS LLJJJ;
    public C1482560ogQ LLJJJIL;
    public C207190165s LLJJJJ;

    public final TTPlusCardData getCardData() {
        Object c098200Yq;
        String cardInsertStatus;
        CardInsertInfo cardInsertInfo;
        try {
            Aweme aweme = this.LLILLL;
            if (aweme == null || (cardInsertInfo = aweme.getCardInsertInfo()) == null || (cardInsertStatus = cardInsertInfo.getCardInsertStatus()) == null) {
                cardInsertStatus = "";
            }
            c098200Yq = (TTPlusCardData) C08JS.LIZ(cardInsertStatus, TTPlusCardData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (TTPlusCardData) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final C05P0<Boolean> getCardAnimationBenefitShow() {
        return this.LLILZIL;
    }

    public final C05P0<Boolean> getCardAnimationDescShow() {
        return this.LLILZLL;
    }

    public final C05P0<Boolean> getCardAnimationPriceShow() {
        return this.LLILZ;
    }

    public final C0TPF getKevaHelper() {
        return this.LLILLJJLI;
    }

    public final C05P0<Boolean> getLoading() {
        return this.LLIZ;
    }

    public C207189165r(Context context, AttributeSet attributeSet, int i) {
        ProductInfo productInfo;
        SubscriptionStatusInfo subscriptionStatusInfo;
        SubscriptionInfo subscriptionInfo;
        OfferInfo offerInfo;
        super(context, attributeSet, i);
        this.LLILLJJLI = C746020TOe.LIZ();
        Boolean bool = Boolean.FALSE;
        this.LLILZ = C20028913Yh.LJI(bool);
        this.LLILZIL = C20028913Yh.LJI(bool);
        this.LLILZLL = C20028913Yh.LJI(bool);
        this.LLIZ = C20028913Yh.LJI(bool);
        this.LLIZLLLIL = 200L;
        MutableLiveData<IapProductDetail> mutableLiveData = new MutableLiveData<>();
        this.LLJILJILJ = mutableLiveData;
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        this.LLJJIJIL = C582130MsN.LIZ().LIZJ(c1478410oZj);
        this.LLJJJ = new InterfaceC1483820oiS() { // from class: X.165t
            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void hj() {
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return this.LL.LLJJIJI;
            }
        };
        C786410Ut5.Sd(R.layout.c7h, C786410Ut5.ne(context), this);
        ComposeView composeView = (ComposeView) findViewById(R.id.ymj);
        this.LL = composeView;
        this.LLJJIJI = (FrameLayout) findViewById(R.id.ymk);
        this.LLJJIJIIJIL = (SmartImageView) findViewById(R.id.yml);
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        }
        C0TOM.LIZ.getClass();
        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
        if (adFreeSubscriptionLJ != null && (subscriptionStatusInfo = adFreeSubscriptionLJ.subscriptionStatusInfo) != null && (subscriptionInfo = subscriptionStatusInfo.subscriptionInfo) != null && (offerInfo = subscriptionInfo.offerInfo) != null) {
            productInfo = offerInfo.productInfo;
        } else {
            productInfo = null;
        }
        this.LLJILLL = productInfo;
        C0TOS c0tos = C0TOS.LIZ;
        String str = productInfo != null ? productInfo.merchantId : null;
        c0tos.getClass();
        C0TOS.LIZIZ(str, productInfo, mutableLiveData, 1);
    }
}
