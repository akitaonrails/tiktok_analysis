package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08VY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ECPreloader$onInterceptNetworkForCommonAbility$1", f = "ECPreloader.kt", l = {}, m = "invokeSuspend")
public final class C08VY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2130208We LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VY(C2130208We c2130208We, String str, Map<String, ? extends Object> map, String str2, InterfaceC1364105Vn<? super C08VY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2130208We;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08VY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECPreloader@ef90.onInterceptNetworkForCommonAbility$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1743690vTb.LIZLLL(new C080Y(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECPreloader@ef90.onInterceptNetworkForCommonAbility$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
