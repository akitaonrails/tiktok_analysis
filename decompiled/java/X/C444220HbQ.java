package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingFormFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingFormFragment$initObserver$1$1", f = "PcsOnboardingFormFragment.kt", l = {289}, m = "invokeSuspend")
public final class C444220HbQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingFormFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444220HbQ(PcsOnboardingFormFragment pcsOnboardingFormFragment, InterfaceC1364105Vn<? super C444220HbQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingFormFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444220HbQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingFormFragment@5352.initObserver$1$1");
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
            final PcsOnboardingFormFragment pcsOnboardingFormFragment = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0mxf
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Integer numValueOf;
                    AbstractC878300Ycu abstractC878300Ycu = (AbstractC878300Ycu) obj2;
                    if (abstractC878300Ycu instanceof C860240Xos) {
                        if (((C860240Xos) abstractC878300Ycu).LIZ) {
                            C510160Jza c510160JzaES = pcsOnboardingFormFragment.ES();
                            if (c510160JzaES != null) {
                                c510160JzaES.LIZ();
                            }
                            pcsOnboardingFormFragment.hT();
                            PcsOnboardingFormFragment pcsOnboardingFormFragment2 = pcsOnboardingFormFragment;
                            pcsOnboardingFormFragment2.JS().vQ2();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("show_entrance=");
                            String showEntrance = pcsOnboardingFormFragment2.JS().DQ2().getShowEntrance();
                            if (showEntrance == null) {
                                showEntrance = "";
                            }
                            sbLIZ.append(showEntrance);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            SMBOptInStep sMBOptInStep = pcsOnboardingFormFragment2.JS().LLJILLL;
                            if (sMBOptInStep != null && (numValueOf = Integer.valueOf(sMBOptInStep.type)) != null && numValueOf.intValue() == 8) {
                                pcsOnboardingFormFragment2.QS(R.id.pl0, R.id.a35, null, null, strLIZIZ);
                            } else {
                                pcsOnboardingFormFragment2.QS(R.id.pl0, R.id.a36, null, null, strLIZIZ);
                            }
                        } else {
                            C510160Jza c510160JzaES2 = pcsOnboardingFormFragment.ES();
                            if (c510160JzaES2 != null) {
                                c510160JzaES2.LIZ();
                            }
                            pcsOnboardingFormFragment.NS();
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0950.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingFormFragment@5352.initObserver$1$1");
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
