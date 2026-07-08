package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.PdpTriggerMgr$innerConfigTriggers$2", f = "PdpTriggerMgr.kt", l = {}, m = "invokeSuspend")
public final class C0NKQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<AbstractC592270NKv> LLILLJJLI;
    public final /* synthetic */ C1761110vvh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NKQ(List<? extends AbstractC592270NKv> list, C1761110vvh c1761110vvh, InterfaceC1364105Vn<? super C0NKQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1761110vvh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NKQ c0nkq = new C0NKQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0nkq.LL = obj;
        return c0nkq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpTriggerMgr@61b5.innerConfigTriggers$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<AbstractC592270NKv> list = this.LLILLJJLI;
        C1761110vvh c1761110vvh = this.LLILLL;
        for (AbstractC592270NKv abstractC592270NKv : list) {
            C0NLF c0nlf = abstractC592270NKv.LIZ;
            if (c0nlf == null) {
                c0nlf = C0NLF.INVALID;
            }
            C0NLD c0nldLIZ = c1761110vvh.LIZ(c0nlf);
            if (c0nldLIZ != null) {
                C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0NKP(abstractC592270NKv, c0nldLIZ, c1761110vvh, null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpTriggerMgr@61b5.innerConfigTriggers$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
