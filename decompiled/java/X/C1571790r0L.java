package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel.SleepHourComponentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent$eventInit$1$1", f = "SleepHourComponent.kt", l = {}, m = "invokeSuspend")
public final class C1571790r0L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SleepHourComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1571790r0L(SleepHourComponent sleepHourComponent, InterfaceC1364105Vn<? super C1571790r0L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sleepHourComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1571790r0L(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        Aweme awemeLJIIIIZZ;
        C19EG activity;
        C1C7U.LIZ("SleepHourComponent@ae67.eventInit$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SleepHourComponent sleepHourComponent = this.LL;
        if (sleepHourComponent.LLJJJIL && (iViewPagerComponentAbility = (IViewPagerComponentAbility) sleepHourComponent.LLJJL.getValue()) != null && (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) != null && !AwemeExtKt.isMonetizationTraffic(awemeLJIIIIZZ) && !AwemeSaaSExtKt.isLive(awemeLJIIIIZZ)) {
            Fragment fragment = sleepHourComponent.getPanelContext().LJ;
            C19EG c19eg = null;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            if (activity instanceof C19EG) {
                c19eg = activity;
            }
            if (c19eg == null || !C1074300e3w.LIZ(c19eg).wQ2()) {
                if (!sleepHourComponent.kp().vQ2() && sleepHourComponent.kp().yQ2()) {
                    SleepHourComponentViewModel sleepHourComponentViewModelKp = sleepHourComponent.kp();
                    ISleepHourComponentTrigger iSleepHourComponentTrigger = (ISleepHourComponentTrigger) ((LinkedHashMap) sleepHourComponentViewModelKp.LL).get(sleepHourComponentViewModelKp.getState().LL);
                    if (iSleepHourComponentTrigger != null && iSleepHourComponentTrigger.LIZ()) {
                        sleepHourComponent.LLJJJIL = false;
                        sleepHourComponent.op(sleepHourComponent.kp().getState().LL);
                    }
                } else {
                    sleepHourComponent.LLJJJIL = false;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SleepHourComponent@ae67.eventInit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
