package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.search.sdk.impl.IMSearchEngine$doQuery$8", f = "IMSearchEngine.kt", l = {}, m = "invokeSuspend")
public final class C1240420iNs extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C1240340iNk>>, Object> {
    public final /* synthetic */ Function2<List<C1240300iNg>, String, List<C1240340iNk>> LL;
    public final /* synthetic */ List<C1240300iNg> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1240420iNs(Function2<? super List<C1240300iNg>, ? super String, ? extends List<C1240340iNk>> function2, List<C1240300iNg> list, String str, InterfaceC1364105Vn<? super C1240420iNs> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240420iNs(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C1240340iNk>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSearchEngine@a240.doQuery$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1240340iNk> listInvoke = this.LL.invoke(this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("IMSearchEngine@a240.doQuery$8");
        return listInvoke;
    }
}
