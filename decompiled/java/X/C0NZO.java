package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatroom.OnboardingFinishMonitorAssem;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.OnboardingFinishMonitorAssem$onFinishDetected$1", f = "OnboardingFinishMonitorAssem.kt", l = {80}, m = "invokeSuspend")
public final class C0NZO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OnboardingFinishMonitorAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZO(OnboardingFinishMonitorAssem onboardingFinishMonitorAssem, InterfaceC1364105Vn<? super C0NZO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onboardingFinishMonitorAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9l;
        Object objLIZIZ = obj;
        C1C7U.LIZ("OnboardingFinishMonitorAssem@de8b.onFinishDetected$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                String strBo = this.LLILLJJLI.bo();
                if (strBo != null) {
                    c869590Y9l = (C869590Y9l) C13LP.LJJJLL(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIIZI(strBo, 0L, null, Collections.singletonList(1824), null, 1));
                } else {
                    c869590Y9l = null;
                }
                if (c869590Y9l == null) {
                    String strBo2 = this.LLILLJJLI.bo();
                    if (strBo2 != null) {
                        C0YNP.LJIIIIZZ(strBo2, "onboarding_finish_notified", "true");
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OnboardingFinishMonitorAssem@de8b.onFinishDetected$1");
                    return unit;
                }
                C0NZR c0nzr = C0NZR.LIZ;
                C0NZT c0nzt = C0NZT.ONBOARDING_CARD_STATUS_FINISH;
                this.LL = 1;
                objLIZIZ = c0nzr.LIZIZ(c869590Y9l, c0nzt, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("OnboardingFinishMonitorAssem@de8b.onFinishDetected$1");
                    return objLJFF;
                }
            }
            if (((Boolean) objLIZIZ).booleanValue()) {
                String strBo3 = this.LLILLJJLI.bo();
                if (strBo3 != null) {
                    C0YNP.LJIIIIZZ(strBo3, "onboarding_finish_notified", "true");
                }
            } else {
                this.LLILLJJLI.LLILLL.set(false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFinishDetected error: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLJJLI.LLILLL.set(false);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OnboardingFinishMonitorAssem@de8b.onFinishDetected$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
