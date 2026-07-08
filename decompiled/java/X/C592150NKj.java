package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.trigger.SeaPdpTriggerMgr$configTriggers$1$1$2$1", f = "SeaPdpTriggerMgr.kt", l = {43}, m = "invokeSuspend")
public final class C592150NKj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC592180NKm LLILLJJLI;
    public final /* synthetic */ C04AA LLILLL;
    public final /* synthetic */ C04A9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592150NKj(AbstractC592180NKm abstractC592180NKm, C04AA c04aa, C04A9 c04a9, InterfaceC1364105Vn<? super C592150NKj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC592180NKm;
        this.LLILLL = c04aa;
        this.LLILZ = c04a9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592150NKj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpTriggerMgr@9230.configTriggers$1$1$2$1");
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
            AbstractC592180NKm abstractC592180NKm = this.LLILLJJLI;
            C04AA c04aa = this.LLILLL;
            SeaPdpViewModel seaPdpViewModel = this.LLILZ.LIZ;
            this.LL = 1;
            if (abstractC592180NKm.LIZ(c04aa, seaPdpViewModel) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpTriggerMgr@9230.configTriggers$1$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpTriggerMgr@9230.configTriggers$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
