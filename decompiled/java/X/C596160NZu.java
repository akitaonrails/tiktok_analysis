package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.eventcenter.PdpEventCenter$invokeAction$job$1$result$1", f = "PdpEventCenter.kt", l = {301}, m = "invokeSuspend")
public final class C596160NZu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public int LL;
    public final /* synthetic */ C599170Nel LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596160NZu(C599170Nel c599170Nel, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C596160NZu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c599170Nel;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596160NZu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpEventCenter@c50e.invokeAction$job$1$result$1");
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
            InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> interfaceC1631620sYq = this.LLILLJJLI.LIZIZ;
            Map<String, ? extends Object> map = this.LLILLL;
            Map<String, ? extends Object> map2 = this.LLILZ;
            this.LL = 1;
            obj = interfaceC1631620sYq.invoke(map, map2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpEventCenter@c50e.invokeAction$job$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PdpEventCenter@c50e.invokeAction$job$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
