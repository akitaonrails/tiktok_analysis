package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel$fetchFromNetwork$1$uiData$1", f = "GiftAnchorPanelGiftPageCenterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1146390fwD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1146430fwH>, Object> {
    public final /* synthetic */ GiftAnchorPanelGiftPageCenterViewModel LL;
    public final /* synthetic */ GiftListByCreatorResponse.Data LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146390fwD(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, GiftListByCreatorResponse.Data data, boolean z, InterfaceC1364105Vn<? super C1146390fwD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftAnchorPanelGiftPageCenterViewModel;
        this.LLILLJJLI = data;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146390fwD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1$uiData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1146430fwH c1146430fwHDQ2 = this.LL.DQ2(this.LLILLJJLI);
        if (this.LLILLL) {
            C096800Yc.LIZ = new C096700Yb(this.LL.vQ2(), this.LLILLJJLI);
        }
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1$uiData$1");
        return c1146430fwHDQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1146430fwH> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
