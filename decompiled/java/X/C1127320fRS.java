package X;

import android.content.Context;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0fRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.widgets.giftwidget.presenter.GiftNewPresenter$rechargeAndSendGiftDirectly$1$1", f = "GiftNewPresenter.kt", l = {232}, m = "invokeSuspend")
public final class C1127320fRS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1127330fRT LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C1134030fcH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1127320fRS(C1127330fRT c1127330fRT, Context context, C1134030fcH c1134030fcH, InterfaceC1364105Vn<? super C1127320fRS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1127330fRT;
        this.LLILLL = context;
        this.LLILZ = c1134030fcH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1127320fRS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftNewPresenter@7d83.rechargeAndSendGiftDirectly$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1143980fsK c1143980fsKWy0 = ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).Wy0();
            C1127330fRT c1127330fRT = this.LLILLJJLI;
            int i2 = c1127330fRT.LJIIIZ;
            boolean z = c1127330fRT.LJIIL;
            int i3 = (int) c1127330fRT.LIZIZ;
            String str = c1127330fRT.LIZLLL;
            String str2 = c1127330fRT.LJ;
            Context context = this.LLILLL;
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c1127330fRT, 569);
            AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(this.LLILLJJLI, 570);
            AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(this.LLILZ, this.LLILLJJLI, 108);
            this.LL = 1;
            if (c1143980fsKWy0.LJIIL(context, i2, "local_currency_gift", z, i3, str, str2, awS561S0100000_17, awS561S0100000_172, awS383S0200000_17, this) == objLJFF) {
                C1C7U.LIZIZ("GiftNewPresenter@7d83.rechargeAndSendGiftDirectly$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftNewPresenter@7d83.rechargeAndSendGiftDirectly$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
