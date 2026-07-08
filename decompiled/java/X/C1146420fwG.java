package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel$renderFromCacheAndRefresh$1", f = "GiftAnchorPanelGiftPageCenterViewModel.kt", l = {211}, m = "invokeSuspend")
public final class C1146420fwG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GiftAnchorPanelGiftPageCenterViewModel LLILLJJLI;
    public final /* synthetic */ C096700Yb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146420fwG(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, C096700Yb c096700Yb, InterfaceC1364105Vn<? super C1146420fwG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = giftAnchorPanelGiftPageCenterViewModel;
        this.LLILLL = c096700Yb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146420fwG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.renderFromCacheAndRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1146410fwF c1146410fwF = new C1146410fwF(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1146410fwF);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.renderFromCacheAndRefresh$1");
                    return objLJFF;
                }
            }
            C1146430fwH c1146430fwH = (C1146430fwH) obj;
            if (Intrinsics.LJFF(this.LLILLJJLI.getState().LL, C491101vh.LIZ)) {
                this.LLILLJJLI.setState(new AwS596S0100000_17(c1146430fwH, 133));
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LLILLJJLI.LLILLL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.renderFromCacheAndRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
