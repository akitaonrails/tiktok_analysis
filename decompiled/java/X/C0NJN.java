package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupTrigger;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.PdpTriggerMgr$configTriggers$1$1", f = "PdpTriggerMgr.kt", l = {}, m = "invokeSuspend")
public final class C0NJN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Map<Integer, List<PopupTrigger>> LLILLJJLI;
    public final /* synthetic */ C1761110vvh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NJN(Map<Integer, ? extends List<PopupTrigger>> map, C1761110vvh c1761110vvh, InterfaceC1364105Vn<? super C0NJN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = c1761110vvh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NJN c0njn = new C0NJN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0njn.LL = obj;
        return c0njn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpTriggerMgr@61b5.configTriggers$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Map<Integer, List<PopupTrigger>> map = this.LLILLJJLI;
        C1761110vvh c1761110vvh = this.LLILLL;
        for (Map.Entry<Integer, List<PopupTrigger>> entry : map.entrySet()) {
            C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0NJO(entry.getKey().intValue(), entry.getValue(), c1761110vvh, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
