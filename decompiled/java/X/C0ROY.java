package X;

import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS151S0101000_11;
import njp.a;

/* JADX INFO: renamed from: X.0ROY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.bytedance.touchpoint.core.feedbanner.manager.SpecialCardPictureManager$uploadButtonAction$1", f = "SpecialCardPictureManager.kt", l = {}, m = "invokeSuspend")
public final class C0ROY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ReferralFeedBanner LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ROY(ReferralFeedBanner referralFeedBanner, int i, InterfaceC1364105Vn<? super C0ROY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = referralFeedBanner;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ROY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SpecialCardPictureManager@8a59.uploadButtonAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01U6.LIZIZ(new AwS151S0101000_11(this.LLILLJJLI, this.LL, 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.uploadButtonAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
