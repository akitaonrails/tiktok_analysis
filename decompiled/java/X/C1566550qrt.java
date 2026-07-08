package X;

import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent$checkFYPFeedIfShowing$1", f = "SleepHourComponent.kt", l = {345}, m = "invokeSuspend")
public final class C1566550qrt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SleepHourComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566550qrt(SleepHourComponent sleepHourComponent, InterfaceC1364105Vn<? super C1566550qrt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sleepHourComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566550qrt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0N0Y playerManager;
        C1C7U.LIZ("SleepHourComponent@ae67.checkFYPFeedIfShowing$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("SleepHourComponent@ae67.checkFYPFeedIfShowing$1");
                return objLJFF;
            }
        }
        if (!C0JBW.LIZLLL(this.LLILLJJLI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SleepHourComponent@ae67.checkFYPFeedIfShowing$1");
            return unit;
        }
        if (this.LLILLJJLI.isShowing()) {
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLILLJJLI.LLJJJJLIIL.getValue();
            if (iPlayerComponentAbility != null) {
                iPlayerComponentAbility.LLLLLLLLLL();
            }
            this.LLILLJJLI.lp(false);
        } else {
            IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLILLJJLI.LLJJJJLIIL.getValue();
            if (iPlayerComponentAbility2 == null || (playerManager = iPlayerComponentAbility2.getPlayerManager()) == null || !playerManager.isPlaying()) {
                IPlayerComponentAbility iPlayerComponentAbility3 = (IPlayerComponentAbility) this.LLILLJJLI.LLJJJJLIIL.getValue();
                if (iPlayerComponentAbility3 != null) {
                    iPlayerComponentAbility3.tryResumePlay();
                }
                this.LLILLJJLI.lp(true);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SleepHourComponent@ae67.checkFYPFeedIfShowing$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
