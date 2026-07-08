package X;

import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMDailyScreenTimeTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;
import njp.a;

/* JADX INFO: renamed from: X.0p8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMDailyScreenTimeTrigger$registerDownloadListener$1", f = "STMDailyScreenTimeAssem.kt", l = {597}, m = "invokeSuspend")
public final class C1500040p8c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ STMDailyScreenTimeTrigger LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500040p8c(STMDailyScreenTimeTrigger sTMDailyScreenTimeTrigger, InterfaceC1364105Vn<? super C1500040p8c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sTMDailyScreenTimeTrigger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1500040p8c(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("STMDailyScreenTimeTrigger@574c.registerDownloadListener$1");
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
            long j = this.LLILLJJLI.LIZLLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("STMDailyScreenTimeTrigger@574c.registerDownloadListener$1");
                return objLJFF;
            }
        }
        new AwS567S0100000_23(this.LLILLJJLI, 83);
        STMDailyScreenTimeTrigger sTMDailyScreenTimeTrigger = this.LLILLJJLI;
        sTMDailyScreenTimeTrigger.LIZIZ = true;
        C1488130opP.LIZJ().LIZIZ((C1500050p8d) sTMDailyScreenTimeTrigger.LJFF.getValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("STMDailyScreenTimeTrigger@574c.registerDownloadListener$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
