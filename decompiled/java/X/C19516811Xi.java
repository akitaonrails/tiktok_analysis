package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationResponse;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.guide.BagTooltipRequestHelper$handleRequestBagToolTip$1$1", f = "BagTooltipRequestHelper.kt", l = {}, m = "invokeSuspend")
public final class C19516811Xi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0X52<Response<LiveBagIconAnimationResponse>> LLILLJJLI;
    public final /* synthetic */ BagGuideTooltipController LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19516811Xi(C0X52<Response<LiveBagIconAnimationResponse>> c0x52, BagGuideTooltipController bagGuideTooltipController, long j, InterfaceC1364105Vn<? super C19516811Xi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0x52;
        this.LLILLL = bagGuideTooltipController;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19516811Xi c19516811Xi = new C19516811Xi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c19516811Xi.LL = obj;
        return c19516811Xi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<LiveBagIconAnimation> list;
        WeakReference<BagGuideTooltipController> weakReference;
        List<LiveBagIconAnimation> list2;
        C1C7U.LIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0X52<Response<LiveBagIconAnimationResponse>> c0x52 = this.LLILLJJLI;
        if (c0x52 != null && c0x52.LIZJ() && this.LLILLJJLI.LIZIZ.isCodeOK()) {
            if (C290560BaA.LIZ()) {
                LiveBagIconAnimationResponse liveBagIconAnimationResponse = this.LLILLJJLI.LIZIZ.data;
                if (liveBagIconAnimationResponse != null && (list2 = liveBagIconAnimationResponse.liveBagIconAnimationInfos) != null) {
                    C1440005kM.LIZIZ(new C2037907yb(list2));
                }
            } else {
                BagGuideTooltipController bagGuideTooltipController = this.LLILLL;
                if (bagGuideTooltipController == null) {
                    C21212917zr c21212917zrLIZIZ = C21213217zu.LIZ.LIZIZ(C2286608xc.LJFF(this.LLILZ));
                    if (c21212917zrLIZIZ != null && (weakReference = c21212917zrLIZIZ.LIZLLL) != null) {
                        bagGuideTooltipController = weakReference.get();
                    } else {
                        bagGuideTooltipController = null;
                    }
                }
                LiveBagIconAnimationResponse liveBagIconAnimationResponse2 = this.LLILLJJLI.LIZIZ.data;
                if (liveBagIconAnimationResponse2 != null && (list = liveBagIconAnimationResponse2.liveBagIconAnimationInfos) != null && bagGuideTooltipController != null) {
                    bagGuideTooltipController.handleLiveBagIconAnimationInfos(list);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BagTooltipRequestHelper@402c.handleRequestBagToolTip$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
