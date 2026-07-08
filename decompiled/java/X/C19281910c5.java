package X;

import Y.AObjectS78S0000000_28;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10c5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.active.manager.platform.ActiveDaysABManager$delayRunAppLaunchTask$2", f = "ActiveDaysABManager.kt", l = {64}, m = "invokeSuspend")
public final class C19281910c5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19281910c5(long j, InterfaceC1364105Vn<? super C19281910c5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19281910c5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActiveDaysABManager@3cf.delayRunAppLaunchTask$2");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ActiveDaysABManager@3cf.delayRunAppLaunchTask$2");
                return objLJFF;
            }
        }
        try {
            C1904800zfS.LIZ.getClass();
            if (!C1906580ziK.LJI()) {
                C19282310c9.LIZIZ("DelayTask", new AObjectS78S0000000_28(26));
                C19282110c7.LJ.getValue().LIZJ(EnumC1779550wPR.DELAY_TASK);
            } else {
                C19282310c9.LIZIZ("DelayTask", new AObjectS78S0000000_28(27));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19282310c9.LIZIZ("DelayTask", new Function0() { // from class: X.006V
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Exception exc = e;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("run DelayTask error, e ");
                    sbLIZ.append(exc.getMessage());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActiveDaysABManager@3cf.delayRunAppLaunchTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
