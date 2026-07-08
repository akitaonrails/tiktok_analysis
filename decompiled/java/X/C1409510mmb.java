package X;

import Y.AObjectS245S0100000_22;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.panel.ImageInspirationPanelUIComponent$fetchDataAndShow$1", f = "ImageInspirationPanelUIComponent.kt", l = {416, 467}, m = "invokeSuspend")
public final class C1409510mmb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1409690mmt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409510mmb(C1409690mmt c1409690mmt, InterfaceC1364105Vn<? super C1409510mmb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1409690mmt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409510mmb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C1421590n65.LIZIZ, "receive fetchInspirationData was cancelled", e);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C201955140j.LJIIJ(C1421590n65.LIZIZ, "Failed to fetch inspiration data", e2);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1409520mmc c1409520mmc = new C1409520mmc(this.LLILLJJLI, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c1409520mmc) == objLJFF) {
                    C1C7U.LIZIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1");
                    return objLJFF;
                }
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        this.LLILLJJLI.LLJZIJLIL.set(false);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLJJLI.LLJZIJLIL.set(true);
                C1409690mmt c1409690mmt = this.LLILLJJLI;
                c1409690mmt.LLJLLIL = false;
                c1409690mmt.LLJLLL = false;
                InterfaceC1409500mma interfaceC1409500mmaZ4 = c1409690mmt.Z4();
                final C1409690mmt c1409690mmt2 = this.LLILLJJLI;
                EnumC1409650mmp enumC1409650mmp = c1409690mmt2.LLLII;
                InterfaceC1409290mmF interfaceC1409290mmF = new InterfaceC1409290mmF() { // from class: X.0mmd
                    @Override // X.InterfaceC1409290mmF
                    public final void onLoading() {
                        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                        C201955140j.LIZJ(c1421590n65, "panel receive onLoading result");
                        if (c1409690mmt2.t5()) {
                            C201955140j.LIZJ(c1421590n65, "is not active return");
                            return;
                        }
                        C1409690mmt c1409690mmt3 = c1409690mmt2;
                        c1409690mmt3.LLJLLIL = true;
                        c1409690mmt3.d6();
                        C1409690mmt c1409690mmt4 = c1409690mmt2;
                        c1409690mmt4.Z4().BM0().LIZ(c1409690mmt4, new AObjectS245S0100000_22(c1409690mmt2, 23));
                    }

                    @Override // X.InterfaceC1409290mmF
                    public final void LIZ(C1409400mmQ c1409400mmQ) {
                        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                        C201955140j.LIZJ(c1421590n65, "panel receive success result");
                        if (c1409690mmt2.t5()) {
                            C201955140j.LIZJ(c1421590n65, "is not active return");
                            return;
                        }
                        C1409380mmO c1409380mmO = c1409400mmQ.LIZ;
                        if (c1409380mmO != null) {
                            C1409690mmt c1409690mmt3 = c1409690mmt2;
                            if (c1409380mmO.LIZ.isEmpty() && c1409380mmO.LIZIZ.isEmpty()) {
                                c1409690mmt3.R5(-1, null);
                                C201955140j.LJII(c1421590n65, "fetch inspiration data is empty");
                            } else {
                                c1409690mmt3.m6(c1409380mmO);
                                c1409690mmt3.U5(c1409380mmO);
                            }
                        }
                    }

                    @Override // X.InterfaceC1409290mmF
                    public final void onError(String str) {
                        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
                        C201955140j.LIZJ(c1421590n65, "panel receive error result");
                        if (c1409690mmt2.t5()) {
                            C201955140j.LIZJ(c1421590n65, "is not active return");
                        } else {
                            c1409690mmt2.R5(-2, str);
                        }
                    }
                };
                this.LL = 1;
                if (interfaceC1409500mmaZ4.d61(false, enumC1409650mmp, interfaceC1409290mmF, this) == objLJFF) {
                    C1C7U.LIZIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LLJZIJLIL.set(false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ImageInspirationPanelUIComponent@f986.fetchDataAndShow$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LLJZIJLIL.set(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
