package X;

import com.google.gson.n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS13S2300000_3;
import njp.a;

/* JADX INFO: renamed from: X.08VV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ECPreloader$onInterceptNetworkWithParamAndData$1", f = "ECPreloader.kt", l = {}, m = "invokeSuspend")
public final class C08VV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2130208We LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ n LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VV(C2130208We c2130208We, String str, Map<String, ? extends Object> map, n nVar, String str2, InterfaceC1364105Vn<? super C08VV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2130208We;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = nVar;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08VV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECPreloader@ef90.onInterceptNetworkWithParamAndData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1743690vTb.LIZLLL(new AwS13S2300000_3(this.LL, (C2130208We) this.LLILLJJLI, (String) this.LLILLL, (Map<String, ? extends Object>) this.LLILZ, (n) this.LLILZIL, (String) 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECPreloader@ef90.onInterceptNetworkWithParamAndData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
