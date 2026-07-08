package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer$switchState$1", f = "ScreenTimeCalcAndTimer.kt", l = {449}, m = "invokeSuspend")
public final class C1305970k5b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ScreenTimeCalcAndTimer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305970k5b(ScreenTimeCalcAndTimer screenTimeCalcAndTimer, InterfaceC1364105Vn<? super C1305970k5b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = screenTimeCalcAndTimer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305970k5b(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ScreenTimeCalcAndTimer@a85d.switchState$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C1305960k5a c1305960k5a = new C1305960k5a(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1305960k5a);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ScreenTimeCalcAndTimer@a85d.switchState$1");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() > 0) {
            final ScreenTimeCalcAndTimer screenTimeCalcAndTimer = this.LLILLJJLI;
            screenTimeCalcAndTimer.getClass();
            C15YE.LIZ.getClass();
            long jLJII = C15YE.LJII() * C538540LAe.LLJJJIL;
            IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) ServiceManager.get().getService(IComplianceDebugService.class);
            if (iComplianceDebugService != null) {
                iComplianceDebugService.LJFF();
            }
            long j = jLJII / ((long) 1);
            long jLJII2 = C15YE.LJII() * C538540LAe.LLJJJIL;
            IComplianceDebugService iComplianceDebugService2 = (IComplianceDebugService) ServiceManager.get().getService(IComplianceDebugService.class);
            if (iComplianceDebugService2 != null) {
                iComplianceDebugService2.LJFF();
            }
            screenTimeCalcAndTimer.LL = new C1735430vGH(j, jLJII2 / ((long) 1), new InterfaceC1735440vGI() { // from class: X.15XS
                @Override // X.InterfaceC1735440vGI
                public final void LJJI(long j2) {
                }

                @Override // X.InterfaceC1735440vGI
                public final void onStart() {
                }

                @Override // X.InterfaceC1735440vGI
                public final void LIZLLL() {
                    ScreenTimeCalcAndTimer screenTimeCalcAndTimer2 = screenTimeCalcAndTimer;
                    screenTimeCalcAndTimer2.LLIZLLLIL = true;
                    if (!screenTimeCalcAndTimer2.LLIZ) {
                        screenTimeCalcAndTimer2.LJ(2);
                        return;
                    }
                    long jLIZ = ((long) C07MU.LIZ()) * 1000;
                    long jLIZ2 = ((long) C07MU.LIZ()) * 1000;
                    final ScreenTimeCalcAndTimer screenTimeCalcAndTimer3 = screenTimeCalcAndTimer;
                    screenTimeCalcAndTimer2.LL = new C1735430vGH(jLIZ, jLIZ2, new InterfaceC1735440vGI() { // from class: X.15XR
                        @Override // X.InterfaceC1735440vGI
                        public final void LJJI(long j2) {
                        }

                        @Override // X.InterfaceC1735440vGI
                        public final void LIZLLL() {
                            ScreenTimeCalcAndTimer screenTimeCalcAndTimer4 = screenTimeCalcAndTimer3;
                            screenTimeCalcAndTimer4.LLIZLLLIL = true;
                            screenTimeCalcAndTimer4.LJ(2);
                        }

                        @Override // X.InterfaceC1735440vGI
                        public final void onStart() {
                            Intent intent = screenTimeCalcAndTimer3.LLJI;
                            if (intent != null) {
                                C844470XAv.LIZ.getClass();
                                C786410Ut5.s3(C844470XAv.LIZ(), intent);
                            }
                        }
                    });
                    C1735430vGH c1735430vGH = screenTimeCalcAndTimer.LL;
                    if (c1735430vGH != null) {
                        c1735430vGH.LJFF();
                    }
                }
            });
            this.LLILLJJLI.LJ(1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenTimeCalcAndTimer@a85d.switchState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
