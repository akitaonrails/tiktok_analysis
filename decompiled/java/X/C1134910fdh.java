package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.IncentivePreRewardUtilsKt$getMaxRechargeMaxBonusCnt$2", f = "IncentivePreRewardUtils.kt", l = {259}, m = "invokeSuspend")
public final class C1134910fdh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;

    public C1134910fdh(InterfaceC1364105Vn<? super C1134910fdh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134910fdh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C118300cf c118300cf;
        List<Diamond> listLJIIJJI;
        C1C7U.LIZ("IncentivePreRewardUtilsKt@772.getMaxRechargeMaxBonusCnt$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c118300cf = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c118300cf = new C118300cf();
            EnumC1803160x1W enumC1803160x1W = EnumC1803160x1W.USE;
            this.LL = c118300cf;
            this.LLILLJJLI = 1;
            obj = C1151360g4E.LJI(enumC1803160x1W, null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.getMaxRechargeMaxBonusCnt$2");
                return objLJFF;
            }
        }
        C1804840x4E c1804840x4E = (C1804840x4E) obj;
        if (c1804840x4E != null && (listLJIIJJI = c1804840x4E.LJIIJJI(null, false)) != null) {
            Iterator<Diamond> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                c118300cf.element = Math.max(c118300cf.element, it2.next().givingCount);
            }
        }
        int i2 = c118300cf.element;
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        Integer numLJ = C2286608xc.LJ(Math.max(i2 - C1133940fc8.LJII(), 0));
        C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.getMaxRechargeMaxBonusCnt$2");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C1134910fdh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
