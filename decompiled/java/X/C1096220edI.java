package X;

import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoPreloadConfigItem;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0edI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preload.gecko.EcomGeckoPreloader$onInterceptRoute$1$2", f = "EcomGeckoPreloader.kt", l = {211}, m = "invokeSuspend")
public final class C1096220edI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ EcomGeckoPreloadConfigItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096220edI(List<String> list, EcomGeckoPreloadConfigItem ecomGeckoPreloadConfigItem, InterfaceC1364105Vn<? super C1096220edI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = ecomGeckoPreloadConfigItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096220edI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomGeckoPreloader@f894.onInterceptRoute$1$2");
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
            C1548910qPR c1548910qPR = C1548910qPR.LIZ;
            Set<String> setLLIIJI = C13LP.LLIIJI(this.LLILLJJLI);
            EcomGeckoPreloadConfigItem ecomGeckoPreloadConfigItem = this.LLILLL;
            this.LL = 1;
            if (c1548910qPR.LIZ(setLLIIJI, ecomGeckoPreloadConfigItem, this) == objLJFF) {
                C1C7U.LIZIZ("EcomGeckoPreloader@f894.onInterceptRoute$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomGeckoPreloader@f894.onInterceptRoute$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
