package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupTrigger;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.PdpTriggerMgr$configTriggers$1$1$1$1", f = "PdpTriggerMgr.kt", l = {94}, m = "invokeSuspend")
public final class C0NJO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<PopupTrigger> LLILLL;
    public final /* synthetic */ C1761110vvh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJO(int i, List<PopupTrigger> list, C1761110vvh c1761110vvh, InterfaceC1364105Vn<? super C0NJO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = c1761110vvh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpTriggerMgr@61b5.configTriggers$1$1$1$1");
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
            C0NL9 c0nl9 = new C0NL9(this.LLILLJJLI, this.LLILLL);
            PdpViewModel pdpViewModel = this.LLILZ.LIZ;
            this.LL = 1;
            if (c0nl9.LIZ(pdpViewModel, this) == objLJFF) {
                C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
