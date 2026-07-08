package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment$initObserver$2$1$1", f = "PcsOnboardingMultiSKUFragment.kt", l = {226}, m = "invokeSuspend")
public final class C1354605Rw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingMultiSKUFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354605Rw(PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment, InterfaceC1364105Vn<? super C1354605Rw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingMultiSKUFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354605Rw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.JS().LLILZIL;
            final PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0mxc
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    AbstractC878300Ycu abstractC878300Ycu = (AbstractC878300Ycu) obj2;
                    if (abstractC878300Ycu instanceof C1411020mp2) {
                        C1411020mp2 c1411020mp2 = (C1411020mp2) abstractC878300Ycu;
                        if (c1411020mp2.LIZ) {
                            PcsOnboardingVM pcsOnboardingVMJS = pcsOnboardingMultiSKUFragment.JS();
                            boolean z = c1411020mp2.LIZLLL;
                            Boolean bool = pcsOnboardingVMJS.getState().LLIZ;
                            if (bool != null) {
                                bool.booleanValue();
                            } else {
                                pcsOnboardingVMJS.setState(new C1410920mos(z));
                            }
                            PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment2 = pcsOnboardingMultiSKUFragment;
                            int size = c1411020mp2.LIZIZ.size();
                            pcsOnboardingMultiSKUFragment2.getClass();
                            PcsOnboardingMultiSKUFragment.qT(0, size, true);
                            pcsOnboardingMultiSKUFragment.hT();
                        }
                    } else if ((abstractC878300Ycu instanceof C878290Yct) && ((C878290Yct) abstractC878300Ycu).LIZ) {
                        PcsOnboardingMultiSKUFragment.rT(0, pcsOnboardingMultiSKUFragment.JS().KQ2(), true, pcsOnboardingMultiSKUFragment.JS().LLJJIJIL);
                        pcsOnboardingMultiSKUFragment.hT();
                        PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment3 = pcsOnboardingMultiSKUFragment;
                        C510160Jza c510160JzaES = pcsOnboardingMultiSKUFragment3.ES();
                        if (c510160JzaES != null) {
                            c510160JzaES.LIZ();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("show_entrance=");
                        String showEntrance = pcsOnboardingMultiSKUFragment3.JS().DQ2().getShowEntrance();
                        if (showEntrance == null) {
                            showEntrance = "";
                        }
                        sbLIZ.append(showEntrance);
                        pcsOnboardingMultiSKUFragment3.QS(R.id.pl5, R.id.a47, null, null, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0950.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
