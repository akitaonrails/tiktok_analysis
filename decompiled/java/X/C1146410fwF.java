package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel$renderFromCacheAndRefresh$1$uiData$1", f = "GiftAnchorPanelGiftPageCenterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1146410fwF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1146430fwH>, Object> {
    public final /* synthetic */ GiftAnchorPanelGiftPageCenterViewModel LL;
    public final /* synthetic */ C096700Yb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146410fwF(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, C096700Yb c096700Yb, InterfaceC1364105Vn<? super C1146410fwF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftAnchorPanelGiftPageCenterViewModel;
        this.LLILLJJLI = c096700Yb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146410fwF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.renderFromCacheAndRefresh$1$uiData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1146430fwH c1146430fwHDQ2 = this.LL.DQ2(this.LLILLJJLI.LIZIZ);
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.renderFromCacheAndRefresh$1$uiData$1");
        return c1146430fwHDQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1146430fwH> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
