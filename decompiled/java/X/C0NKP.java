package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.PdpTriggerMgr$innerConfigTriggers$2$1$1", f = "PdpTriggerMgr.kt", l = {107}, m = "invokeSuspend")
public final class C0NKP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC592270NKv LLILLJJLI;
    public final /* synthetic */ C0NLD LLILLL;
    public final /* synthetic */ C1761110vvh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NKP(AbstractC592270NKv abstractC592270NKv, C0NLD c0nld, C1761110vvh c1761110vvh, InterfaceC1364105Vn<? super C0NKP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC592270NKv;
        this.LLILLL = c0nld;
        this.LLILZ = c1761110vvh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NKP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpTriggerMgr@61b5.innerConfigTriggers$2$1$1");
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
            AbstractC592270NKv abstractC592270NKv = this.LLILLJJLI;
            C0NLD c0nld = this.LLILLL;
            PdpViewModel pdpViewModel = this.LLILZ.LIZ;
            this.LL = 1;
            if (abstractC592270NKv.LIZ(c0nld, pdpViewModel, this) == objLJFF) {
                C1C7U.LIZIZ("PdpTriggerMgr@61b5.innerConfigTriggers$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpTriggerMgr@61b5.innerConfigTriggers$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
