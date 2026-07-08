package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ee4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.firstrecharge.FirstRechargeGiftHelper$onSendLocalCurrencyGiftSuccess$1$bonusCoinCount$1", f = "FirstRechargeGiftHelper.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1096700ee4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;

    public C1096700ee4(InterfaceC1364105Vn<? super C1096700ee4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096700ee4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1$bonusCoinCount$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
            if (iRevenueStrategyServiceLIZIZ != null) {
                iRevenueStrategyServiceLIZIZ.py();
                C1134860fdc c1134860fdc = C1134860fdc.LIZ;
                int i3 = C1096690ee3.LJ;
                this.LL = 1;
                obj = c1134860fdc.LIZLLL(i3, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1$bonusCoinCount$1");
                    return objLJFF;
                }
            }
            i = 0;
            Integer numLJ = C2286608xc.LJ(i);
            C1C7U.LIZIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1$bonusCoinCount$1");
            return numLJ;
        }
        Diamond diamond = (Diamond) obj;
        if (diamond != null) {
            i = diamond.givingCount;
        } else {
            i = 0;
        }
        Integer numLJ2 = C2286608xc.LJ(i);
        C1C7U.LIZIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1$bonusCoinCount$1");
        return numLJ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C1096700ee4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
