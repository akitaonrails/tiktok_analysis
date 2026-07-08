package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0fwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel$fetchFromNetwork$1", f = "GiftAnchorPanelGiftPageCenterViewModel.kt", l = {247, 248}, m = "invokeSuspend")
public final class C1146400fwE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GiftAnchorPanelGiftPageCenterViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146400fwE(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, boolean z, InterfaceC1364105Vn<? super C1146400fwE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = giftAnchorPanelGiftPageCenterViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146400fwE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                this.LLILLJJLI.setState(new AwS596S0100000_17((C1146430fwH) obj, 131));
                this.LLILLJJLI.LLILLL = false;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.setState(AFwS254S0000000_17.get$arr$(54));
            GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel = this.LLILLJJLI;
            this.LL = 1;
            obj = giftAnchorPanelGiftPageCenterViewModel.BQ2(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1");
                return objLJFF;
            }
        }
        C1DFB c1dfb = C0PEM.LIZJ;
        C1146390fwD c1146390fwD = new C1146390fwD(this.LLILLJJLI, (GiftListByCreatorResponse.Data) obj, this.LLILLL, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, c1dfb, c1146390fwD);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1");
            return objLJFF;
        }
        this.LLILLJJLI.setState(new AwS596S0100000_17((C1146430fwH) obj, 131));
        this.LLILLJJLI.LLILLL = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.fetchFromNetwork$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
