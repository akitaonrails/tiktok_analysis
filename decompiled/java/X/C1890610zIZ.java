package X;

import com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeMonitorService$triggerMonitor$1", f = "InboxListChangeMonitorService.kt", l = {201}, m = "invokeSuspend")
public final class C1890610zIZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1890620zIa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890610zIZ(C1890620zIa c1890620zIa, InterfaceC1364105Vn<? super C1890610zIZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1890620zIa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1890610zIZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxListChangeMonitorService@28c9.triggerMonitor$1");
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
            long j = ((InboxListChangeConfigModel) this.LLILLJJLI.LIZLLL.getValue()).monitorDuration;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("InboxListChangeMonitorService@28c9.triggerMonitor$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ().LJFF();
        C1890620zIa c1890620zIa = this.LLILLJJLI;
        c1890620zIa.LJIIIIZZ = 0L;
        c1890620zIa.LJ = C13BV.INSTANCE;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxListChangeMonitorService@28c9.triggerMonitor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
