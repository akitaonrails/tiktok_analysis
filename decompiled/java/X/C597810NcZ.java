package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcasePrefetchEntity$tryPrefetchData$1$3$1$1", f = "ShowcaseNativePrefetchManager.kt", l = {}, m = "invokeSuspend")
public final class C597810NcZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C597870Ncf LL;
    public final /* synthetic */ Response<n> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597810NcZ(C597870Ncf c597870Ncf, Response<n> response, InterfaceC1364105Vn<? super C597810NcZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c597870Ncf;
        this.LLILLJJLI = response;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597810NcZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, Object> map = this.LL.LIZIZ;
        Object nVar = this.LLILLJJLI;
        if (nVar == null) {
            nVar = new n();
        }
        map.put("listProductData", C1741890vQh.LJIIIIZZ(nVar));
        this.LL.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
