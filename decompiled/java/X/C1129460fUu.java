package X;

import com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel;

/* JADX INFO: renamed from: X.0fUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel", f = "GiftPanelCoordinatorViewModel.kt", l = {325}, m = "insertRealTimeRecommendGift")
public final class C1129460fUu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GiftPanelCoordinatorViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129460fUu(GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel, InterfaceC1364105Vn<? super C1129460fUu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = giftPanelCoordinatorViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelCoordinatorViewModel@b358.insertRealTimeRecommendGift$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(null, this);
        C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.insertRealTimeRecommendGift$1");
        return objWQ2;
    }
}
