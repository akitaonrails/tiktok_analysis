package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06rP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.IMBusinessPerformanceAnalytics$reportMessageReceivePerformance$1", f = "IMBusinessChatAnalytics.kt", l = {61, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1738506rP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C869590Y9l> LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;
    public final /* synthetic */ Map<String, List<BusinessAutoMessage>> LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1738506rP(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2, Map<String, ? extends List<BusinessAutoMessage>> map, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C1738506rP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = map;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738506rP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessPerformanceAnalytics@4654.reportMessageReceivePerformance$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMBusinessPerformanceAnalytics@4654.reportMessageReceivePerformance$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1738606rQ c1738606rQ = C1738606rQ.LIZ;
            List<C869590Y9l> list = this.LLILLJJLI;
            List<C869590Y9l> list2 = this.LLILLL;
            this.LL = 1;
            if (c1738606rQ.LIZ(list, list2, this) == objLJFF) {
                C1C7U.LIZIZ("IMBusinessPerformanceAnalytics@4654.reportMessageReceivePerformance$1");
                return objLJFF;
            }
        }
        C1738606rQ c1738606rQ2 = C1738606rQ.LIZ;
        List<C869590Y9l> list3 = this.LLILLJJLI;
        Map<String, List<BusinessAutoMessage>> map = this.LLILZ;
        Function1<String, Unit> function1 = this.LLILZIL;
        this.LL = 2;
        if (c1738606rQ2.LIZIZ(list3, map, function1, this) == objLJFF) {
            C1C7U.LIZIZ("IMBusinessPerformanceAnalytics@4654.reportMessageReceivePerformance$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessPerformanceAnalytics@4654.reportMessageReceivePerformance$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
