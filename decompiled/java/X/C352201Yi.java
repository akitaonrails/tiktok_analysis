package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.localcurrency.LocalCurrencyGiftUtils$getLocalCurrencyPrice$2", f = "LocalCurrencyGiftUtils.kt", l = {42, 45}, m = "invokeSuspend")
public final class C352201Yi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352201Yi(int i, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352201Yi(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalCurrencyGiftUtils@b20a.getLocalCurrencyPrice$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LocalCurrencyGiftUtils@b20a.getLocalCurrencyPrice$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).py();
            C1134860fdc c1134860fdc = C1134860fdc.LIZ;
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            obj = c1134860fdc.LJ(i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LocalCurrencyGiftUtils@b20a.getLocalCurrencyPrice$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C352101Yh c352101Yh = new C352101Yh((String) obj, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c352101Yh) == objLJFF) {
            C1C7U.LIZIZ("LocalCurrencyGiftUtils@b20a.getLocalCurrencyPrice$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LocalCurrencyGiftUtils@b20a.getLocalCurrencyPrice$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
