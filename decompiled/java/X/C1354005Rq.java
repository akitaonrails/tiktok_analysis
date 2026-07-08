package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingConfigFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingConfigFragment$initObserver$2$1", f = "PcsOnboardingConfigFragment.kt", l = {258}, m = "invokeSuspend")
public final class C1354005Rq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingConfigFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354005Rq(PcsOnboardingConfigFragment pcsOnboardingConfigFragment, InterfaceC1364105Vn<? super C1354005Rq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingConfigFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354005Rq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingConfigFragment@494f.initObserver$2$1");
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
            final PcsOnboardingConfigFragment pcsOnboardingConfigFragment = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0mxd
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    AbstractC878300Ycu abstractC878300Ycu = (AbstractC878300Ycu) obj2;
                    if ((abstractC878300Ycu instanceof C878290Yct) && ((C878290Yct) abstractC878300Ycu).LIZ) {
                        pcsOnboardingConfigFragment.getClass();
                        PcsOnboardingConfigFragment.CT(0, true);
                        pcsOnboardingConfigFragment.hT();
                        PcsOnboardingConfigFragment pcsOnboardingConfigFragment2 = pcsOnboardingConfigFragment;
                        C510160Jza c510160JzaES = pcsOnboardingConfigFragment2.ES();
                        if (c510160JzaES != null) {
                            c510160JzaES.LIZ();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("show_entrance=");
                        String showEntrance = pcsOnboardingConfigFragment2.JS().DQ2().getShowEntrance();
                        if (showEntrance == null) {
                            showEntrance = "";
                        }
                        sbLIZ.append(showEntrance);
                        pcsOnboardingConfigFragment2.QS(R.id.pky, R.id.a2q, null, null, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0950.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingConfigFragment@494f.initObserver$2$1");
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
